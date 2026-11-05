package com.example.chatAssiatant.service;

import com.example.chatAssiatant.config.ChatBuilderConfig;
import com.example.chatAssiatant.request.ChatQuestion;
import com.example.chatAssiatant.response.ChatResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {

   private final ChatClient  chatClient;

   public ChatResponse send(ChatQuestion  chatQuestion) {
      return chatClient.prompt()
              .user(chatQuestion.getQuestion())
              .call()
              .entity(ChatResponse.class);
   }
}
