package com.prado.tools.toolkitdev.eventsourcing.rest;

import com.prado.tools.toolkitdev.eventsourcing.persistence.model.vo.EventVO;
import com.prado.tools.toolkitdev.eventsourcing.service.TaxService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController {

    private TaxService taxService;

    public EventController(TaxService taxService) {
        this.taxService = taxService;
    }

    public EventVO tax(EventVO eventVO) {
        return null;
    }
}
