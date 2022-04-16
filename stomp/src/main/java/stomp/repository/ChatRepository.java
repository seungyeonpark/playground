package stomp.repository;

import org.springframework.data.repository.CrudRepository;
import stomp.domain.ChatMessage;

import java.util.List;

public interface ChatRepository extends CrudRepository<ChatMessage, Long> {

    List<ChatMessage> findAllByChatRoomId(Long roomId);
}
