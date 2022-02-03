package ru.paraktikumbot.bot.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chat {

    @JsonProperty(value = "id")
    private Integer chat_id;

    @JsonProperty(value = "type")
    private String chat_type;

    public Integer getChat_id() {
        return chat_id;
    }

    public String getChat_type() {
        return chat_type;
    }
}
