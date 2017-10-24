#! /usr/bin/env python
# -*- coding: utf-8 -*-
import pymysql
import contextlib

#定义上下文管理器，连接后自动关闭连接
@contextlib.contextmanager
def mysql(host='192.168.1.12', port=3306, user='root', passwd='654321', db='ejavashop',charset='utf8'):
    conn = pymysql.connect(host=host, port=port, user=user, passwd=passwd, db=db, charset=charset)
    cursor = conn.cursor(cursor=pymysql.cursors.DictCursor)
    try:
        yield cursor
    finally:
        conn.commit()
        cursor.close()
        conn.close()

cateArr = [("花茶",143),("翡翠",94),("花鸟",24),("人物",21),("服饰",179),("山水",18),("瓷器",48),("印石",37),("紫泥紫砂",47)]
# 执行sql
with mysql() as cursor:
    row_count = cursor.execute("select id from member where id BETWEEN 1789100 AND 1789200")
    results = cursor.fetchall()
    for row in results:
        id = row['id']

        print ("id=%d" % (id))
