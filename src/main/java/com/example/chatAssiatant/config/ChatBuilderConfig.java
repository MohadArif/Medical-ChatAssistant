package com.example.chatAssiatant.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatBuilderConfig {

    @Bean
    public ChatClient  chatClient(ChatClient.Builder chatClient) {
        return chatClient.defaultSystem(
                """
                        You are a medical shop assistant.ypou have to just answer 
                        regarding medicine stuff only.Don't give any random answer.
                        respond politely.
                        if you don't know the answer politely denied and don't. 
                        
                        shop name : Star medical
                        address: Anjanpeer chowk hajipur bihar 844101.
                        """
        ).build();
    }
}
