package stomp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 로그인 기능 구현 후 수정 필요
     * @RequestParam으로 사용자 이름 받아옴 -> 현재 로그인한 사용자 정보 받아오기
     */
    @GetMapping("/chat/room/{roomId}")
    public String enterRoom(@PathVariable Long roomId, @RequestParam(required = false) String username, Model model) {

        List<ChatMessage> chatList = chatService.findAllChatByRoomId(roomId);

        model.addAttribute("roomId", roomId);
        model.addAttribute("chatList", chatList);

        // TODO 로그인 기능 구현 후 수정
        model.addAttribute("username", username);

        return "chat/room";
    }
}
