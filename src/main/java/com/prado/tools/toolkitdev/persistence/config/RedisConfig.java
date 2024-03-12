package com.prado.tools.toolkitdev.persistence.config;

import com.prado.tools.toolkitdev.persistence.model.EventTransaction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.UUID;

@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<UUID, EventTransaction> redisTemplateEventTransaction(RedisConnectionFactory connectionFactory) {
        RedisTemplate<UUID, EventTransaction> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        // Add some specific configuration here. Key serializers, etc.
        return template;
    }
}
