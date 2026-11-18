package com.campuslab.platform.u201621873.reservations.interfaces.rest.controllers;

import com.campuslab.platform.u201621873.reservations.application.commandservices.EquipmentCommandService;
import com.campuslab.platform.u201621873.reservations.interfaces.rest.resources.EquipmentRequestResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/equipment-reservations ")
public class EquipmentController {
    private final EquipmentCommandService service;
    public EquipmentController(EquipmentCommandService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<EquipmentRequestResponse> createEquipmentReservation(
            @RequestBody CustomerRequestResource resource
    ){
        var result = service
                .handle(CustomerTransform.toCreateCustomerCommandFromCustomerResource(resource));
        var responser = CustomerTransform.toCreateCustomerRequestResponseFromCustomerDomain(result);
        return   ResponseEntity.ok(responser);
    }
}
