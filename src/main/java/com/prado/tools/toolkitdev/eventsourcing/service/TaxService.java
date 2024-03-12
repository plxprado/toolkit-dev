package com.prado.tools.toolkitdev.eventsourcing.service;

import com.prado.tools.toolkitdev.eventsourcing.persistence.model.entity.EventAggregationEntity;
import com.prado.tools.toolkitdev.eventsourcing.persistence.model.vo.EventAggregationVO;
import com.prado.tools.toolkitdev.eventsourcing.persistence.model.vo.EventVO;
import com.prado.tools.toolkitdev.eventsourcing.persistence.repository.AggregationRepository;
import org.springframework.stereotype.Service;

@Service
public class TaxService {

    private AggregationRepository aggregationRepository;

    public TaxService(AggregationRepository aggregationRepository) {
        this.aggregationRepository = aggregationRepository;
    }

    public void tax(EventVO eventVO) {
        EventAggregationEntity eventAggregationEntity =EventAggregationEntity.builder()
                .name(eventVO.getEventAggregation().getName())
                .creationDate(eventVO.getEventAggregation().getCreationDate())
                .tra(eventVO.getEventAggregation().getTransactionId())
                .commandAction(eventVO.getEventAggregation().getCommandAction())
                .build();
        this.aggregationRepository.save(eventVO.getEventAggregation());

    }
}
