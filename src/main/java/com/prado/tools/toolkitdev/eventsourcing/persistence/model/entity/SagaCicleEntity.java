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
@Table(name = "saga_cicle")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class SagaCicleEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sq_saga_cicle_id"
    )
    @SequenceGenerator(name = "sq_saga_cicle_id", allocationSize = 1)
    private Long id;

    @Column(name = "order", nullable = false)
    private Long order;

    @Column(name = "finalizer")
    private Boolean finalizer;

    @ManyToOne
    @JoinColumn(name = "id_step")
    private SagaStepEntity sagaStep;



}
