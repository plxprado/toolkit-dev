package com.prado.tools.toolkitdev.eventsourcing.persistence.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "step_saga")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class SagaStepEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sq_step_saga_id"
    )
    @SequenceGenerator(name = "sq_step_saga_id", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;


}
