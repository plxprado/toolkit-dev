package com.prado.tools.toolkitdev.domain.service.impl;

import com.prado.tools.toolkitdev.domain.service.PersistenceUseCasePort;
import com.prado.tools.toolkitdev.persistence.model.EventTransaction;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RedisUseCase implements PersistenceUseCasePort {


    private  RedisTemplate<UUID, EventTransaction> redisTemplateEventTransaction;

    public RedisUseCase(RedisTemplate<UUID, EventTransaction> redisTemplateEventTransaction) {
        this.redisTemplateEventTransaction = redisTemplateEventTransaction;
    }
    @Override
    public void persistEventTransaction(EventTransaction eventTransaction) {
        this.redisTemplateEventTransaction.opsForValue().set(eventTransaction.getExternalTransactionId(),
                eventTransaction);

    }
    @Override
    public EventTransaction eventTransactionById(UUID id) {
        return this.redisTemplateEventTransaction.opsForValue().get(id);
    }
}
