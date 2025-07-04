package adm.meetudy.util.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class RedisPublisher {

    private final RedisTemplate<String, Object> redisTemplate;

    public <T> void publish(String topic, T message) {
        redisTemplate.convertAndSend(topic, message);
    }

}