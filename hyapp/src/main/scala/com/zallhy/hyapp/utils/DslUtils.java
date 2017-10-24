package com.zallhy.hyapp.utils;

import org.apache.commons.lang3.StringUtils;
import org.jooq.Table;
import org.jooq.tools.reflect.Reflect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;


public class DslUtils {


    public static Map<String, Object> notNull(Table table, Object pojo) {
        return map(table, pojo, value -> value != null);
    }

    public static Map<String, Object> notBlank(Table table, Object pojo) {
        return map(table, pojo, (value) -> {
            if (value instanceof String) {
                String s = (String) value;
                return StringUtils.isNotBlank(s);
            } else {
                return value != null;
            }
        });
    }

    public static Map<String, Object> map(Table table, Object pojo, final Predicate<Object> predicate) {
        final Map<String, Object> map = new HashMap<>();
        final Map<String, String> mapper = new HashMap<>();
        Arrays.stream(table.fields()).forEach(field -> {
            mapper.put(org.jooq.tools.StringUtils.toCamelCaseLC(field.getName()), field.getName());
        });

        Reflect.on(pojo).fields().forEach((name, reflect) -> {
            Object value = reflect.get();
            if (mapper.containsKey(name) && predicate.test(value)) {
                map.put(mapper.get(name), value);
            }
        });
        return map;
    }


}