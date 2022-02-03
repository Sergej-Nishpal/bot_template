package ru.paraktikumbot.bot.main.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@Service
public class BotService {

    @Value("${telegram.api}")
    private String telegramApi;

    public void sendMessage(Integer chat_id, String textToSend) {

        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> request = new HashMap<>();
        request.put("chat_id", String.valueOf(chat_id));
        request.put("text", textToSend);

        ResponseEntity<String> sendMessage = restTemplate
                .postForEntity(telegramApi + "/sendMessage", request, String.class);
        System.out.println("Body + " + sendMessage.getBody());
    }

}
