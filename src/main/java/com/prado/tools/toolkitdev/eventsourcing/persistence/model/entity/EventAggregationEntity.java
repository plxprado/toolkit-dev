package com.prado.tools.toolkitdev.eventsourcing.persistence.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "event_aggregation")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class EventAggregationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "related_id")
    private EventAggregationEntity relatedAggregation;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "creatrion_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "command_action", nullable = false)
    private String commandAction;

    @Column(name = "version", nullable = false)
    private Long version;

    @ManyToOne
    @JoinColumn(name = "id_transaction_event")
    private EventEntity event;


}
