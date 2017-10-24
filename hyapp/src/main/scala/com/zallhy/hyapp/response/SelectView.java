package com.zallhy.hyapp.response;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SelectView extends ResponseView {



    @JsonProperty("Options")
    private List<Option> options;


    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    static public class Option {
        @JsonProperty("DisplayText")
        private String displayText;
        @JsonProperty("Value")
        private String value;


        public Option() {
        }

        public Option(String displayText, String value) {
            this.displayText = displayText;
            this.value = value;
        }

        public String getDisplayText() {
            return displayText;
        }

        public void setDisplayText(String displayText) {
            this.displayText = displayText;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}
