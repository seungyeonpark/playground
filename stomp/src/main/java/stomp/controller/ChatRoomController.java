package stomp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import stomp.domain.ChatMessage;
import stomp.service.ChatService;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ChatRoomController {

    private final ChatService chatService;

    @GetMapping("/chat/{buyerId}/{sellerId}")
    public String createRoom(@PathVariable Long buyerId, @PathVariable Long sellerId) {

        Long roomId = chatService.createRoom(buyerId, sellerId);
        log.info("roomId = " + roomId);
        return "redirect:/chat/room/" + roomId;
    }

    @GetMapping("/chat/room/{roomId}")
    public String enterRoom(@PathVariable Long roomId, Model model) {

        List<ChatMessage> chatList = chatService.findAllChatByRoomId(roomId);

        model.addAttribute("roomId", roomId);
        model.addAttribute("chatList", chatList);

        return "chat/room";
    }
}
