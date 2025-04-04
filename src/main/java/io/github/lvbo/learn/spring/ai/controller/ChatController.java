package io.github.lvbo.learn.spring.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvbo.lv created on 2025-04-04 15:45
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }


    @GetMapping("/chat")
    public ResponseEntity<String> promptWithPathVariable(String content) {
        try {
            String response = chatClient
                    .prompt(content)
                    .call()
                    .content();
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

}