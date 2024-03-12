package com.prado.tools.toolkitdev.eventsourcing.persistence.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "saga_event_aggregation")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class SagaEventAggregationEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sq_saga_event_aggregation_id"
    )
    @SequenceGenerator(name = "sq_saga_event_aggregation_id", allocationSize = 1)
    private Long id;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "saga_cicle_id")
    private SagaCicleEntity sagaCicle;

    @ManyToOne
    @JoinColumn(name = "aggregation_id")
    private EventAggregationEntity eventAggregation;

}
