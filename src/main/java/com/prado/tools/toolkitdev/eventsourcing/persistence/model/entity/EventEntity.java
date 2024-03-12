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
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "event")
@AllArgsConstructor
@NoArgsConstructor
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "transaction_date", nullable = false)
    private LocalDateTime transactionDate;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "transaction_value", nullable = false)
    private BigDecimal transactionValue;

    @Column(name = "transaction_id", nullable = false)
    private UUID transactionId;

    @ManyToOne
    @JoinColumn(name = "aggregation_id")
    private EventAggregationEntity eventAggregation;
}
