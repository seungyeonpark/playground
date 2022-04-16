package stomp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import stomp.domain.ChatMessage;
import stomp.service.ChatService;

@Controller
@RequiredArgsConstructor
public class MessageController {

    private final ChatService chatService;

    @MessageMapping("/chat/room/{roomId}")
    @SendTo("/topic/chat/room/{roomId}")
    public ChatMessage enter(@DestinationVariable Long roomId, ChatMessage message) {

        ChatMessage chatMessage = chatService.createChat(roomId, message.getSender(), message.getMessage());
        return chatMessage; // TODO
    }
}
