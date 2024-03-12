package com.prado.tools.toolkitdev.persistence.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
public class EventTransaction implements java.io.Serializable {


    private UUID externalTransactionId;

    private String transactionType;

    private LocalDateTime transactionDate;

    private String transactionStatus;

    private BigDecimal transactionAmount;
}
