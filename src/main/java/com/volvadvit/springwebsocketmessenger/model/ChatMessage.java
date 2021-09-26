package com.volvadvit.springwebsocketmessenger.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

    private ChatMessageType type;
    private String content;
    private String sender;
}
