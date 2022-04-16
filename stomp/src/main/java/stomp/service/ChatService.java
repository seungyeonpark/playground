package stomp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import stomp.domain.ChatMessage;
import stomp.domain.ChatRoom;
import stomp.repository.ChatRepository;
import stomp.repository.RoomRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ChatService {

    private final ChatRepository chatRepository;
    private final RoomRepository roomRepository;

    public Long createRoom(Long buyerId, Long sellerId) {
        ChatRoom chatRoom = roomRepository.saveChatRoom(buyerId, sellerId);
        return chatRoom.getId();
    }

    public List<ChatMessage> findAllChatByRoomId(Long roomId) {
        return chatRepository.findAllByChatRoomId(roomId);
    }

    public ChatMessage createChat(Long roomId, String sender, String message) {
        ChatRoom room = roomRepository.findChatRoomById(roomId);

        System.out.println("room = " + room);

        return chatRepository.save(ChatMessage.createChatMessage(room, sender, message));
    }
}
