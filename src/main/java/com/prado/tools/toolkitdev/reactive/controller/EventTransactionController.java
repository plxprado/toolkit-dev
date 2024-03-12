package com.prado.tools.toolkitdev.reactive.controller;

import com.prado.tools.toolkitdev.domain.service.PersistenceUseCasePort;
import com.prado.tools.toolkitdev.persistence.model.EventTransaction;
import com.prado.tools.toolkitdev.reactive.request.EventTransactionApiDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static com.prado.tools.toolkitdev.reactive.request.EventTransactionApiDTO.fromEventTransaction;

@RestController
@RequestMapping("/api/event-transactions")
public class EventTransactionController {

    private PersistenceUseCasePort persistenceUseCase;

    public EventTransactionController(PersistenceUseCasePort persistenceUseCase) {
        this.persistenceUseCase = persistenceUseCase;
    }

    @PostMapping
    public void createEventTransaction(@RequestBody @Valid EventTransactionApiDTO eventTransactionApiDTO) {
        this.persistenceUseCase.persistEventTransaction(eventTransactionApiDTO.toEventTransaction());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventTransactionApiDTO> getEventTransactionById(@PathVariable("id") String id) {
        EventTransaction eventTransaction = this.persistenceUseCase.eventTransactionById(UUID.fromString(id));
        return ResponseEntity.ok(fromEventTransaction(eventTransaction));

    }
}
