package com.prado.tools.toolkitdev.eventsourcing.persistence.model.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
public class EventAggregationVO {

    @JsonProperty("name")
    private String name;

    @JsonProperty("creation_date")
    private LocalDateTime creationDate;

    @JsonProperty("transaction_id")
    private UUID transactionId;

    @JsonProperty("command_action")
    private String commandAction;


}
