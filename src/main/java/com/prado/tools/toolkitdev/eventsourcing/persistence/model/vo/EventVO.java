package com.prado.tools.toolkitdev.eventsourcing.persistence.model.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
public class EventVO  {

    @JsonProperty("transaction_id")
    private UUID transactionId;

    @JsonProperty("transaction_value")
    private BigDecimal transactionValue;

    @JsonProperty("transaction_date")
    private LocalDateTime transactionDate;

    @JsonProperty("type")
    private String type;

    @JsonProperty("aggregation")
    private EventAggregationVO eventAggregation;
}
