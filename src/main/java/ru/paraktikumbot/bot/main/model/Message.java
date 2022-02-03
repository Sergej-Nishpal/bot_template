package ru.paraktikumbot.bot.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    @JsonProperty(value = "message_id")
    private Integer id;

    @JsonProperty(value = "text")
    private String text;

    @JsonProperty(value = "chat")
    private Chat chat;

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Chat getChat() {
        return chat;
    }
}
