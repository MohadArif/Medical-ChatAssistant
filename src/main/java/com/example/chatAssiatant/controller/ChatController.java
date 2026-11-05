package com.example.chatAssiatant.controller;

import com.example.chatAssiatant.request.ChatQuestion;
import com.example.chatAssiatant.response.ChatResponse;
import com.example.chatAssiatant.service.ChatService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ChatController {

    private ChatService chatService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ChatResponse getResponse(@RequestBody ChatQuestion  chatQuestion) {
        return chatService.send(chatQuestion);
    }
}
