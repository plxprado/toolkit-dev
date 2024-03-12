package com.prado.tools.toolkitdev.eventsourcing.persistence.repository;

import com.prado.tools.toolkitdev.eventsourcing.persistence.model.entity.EventAggregationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AggregationRepository  extends JpaRepository<EventAggregationEntity, UUID>{
}
