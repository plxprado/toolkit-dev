package com.prado.tools.toolkitdev.domain.service;

import com.prado.tools.toolkitdev.persistence.model.EventTransaction;

import java.util.UUID;

public interface PersistenceUseCasePort {

    void persistEventTransaction(EventTransaction eventTransaction);

    EventTransaction eventTransactionById(UUID id);

}
