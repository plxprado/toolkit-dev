package com.prado.tools.toolkitdev.reactive.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.prado.tools.toolkitdev.persistence.model.EventTransaction;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EventTransactionApiDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1;

    @JsonProperty("external_transaction_id")
    @NotNull(message = "External transaction id is required")
    private UUID externalTransactionId;

    @JsonProperty("transaction_type")
    @NotBlank(message = "Transaction type is required")
    private String transactionType;

    @JsonProperty("transaction_date")
    @NotNull(message = "Transaction date is required")
    private LocalDateTime transactionDate;

    @JsonProperty("transaction_status")
    @NotBlank(message = "Transaction status is required")
    private String transactionStatus;

    @JsonProperty("transaction_amount")
    @Digits(integer = 10, fraction = 2, message = "Transaction amount is required")
    private BigDecimal transactionAmount;

    public static EventTransactionApiDTO fromEventTransaction(EventTransaction eventTransaction) {
        return new EventTransactionApiDTO(
                eventTransaction.getExternalTransactionId(),
                eventTransaction.getTransactionType(),
                eventTransaction.getTransactionDate(),
                eventTransaction.getTransactionStatus(),
                eventTransaction.getTransactionAmount()
        );
    }

    public EventTransaction toEventTransaction() {
        return EventTransaction.builder()
                .externalTransactionId(this.externalTransactionId)
                .transactionType(this.transactionType)
                .transactionDate(this.transactionDate)
                .transactionStatus(this.transactionStatus)
                .transactionAmount(this.transactionAmount)
                .build();
    }
}
