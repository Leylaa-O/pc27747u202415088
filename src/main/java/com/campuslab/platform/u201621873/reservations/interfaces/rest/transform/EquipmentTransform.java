package com.campuslab.platform.u201621873.reservations.interfaces.rest.transform;

import com.campuslab.platform.u201621873.reservations.application.commands.CreateEquipmentCommand;
import com.campuslab.platform.u201621873.reservations.domain.model.aggregates.EquipmentReservation;
import com.campuslab.platform.u201621873.reservations.interfaces.rest.resources.EquipmentRequestResource;
import com.campuslab.platform.u201621873.reservations.interfaces.rest.resources.EquipmentRequestResponse;

public class EquipmentTransform {
    public static CreateEquipmentCommand toCreateCustomerCommandFromCustomerResource(EquipmentRequestResource
                                                                                            resource){
        return  new CreateEquipmentCommand(
                resource.name(), resource.email(), resource.dni()
        );
    }

    public static EquipmentRequestResponse toCreateCustomerRequestResponseFromCustomerDomain(EquipmentReservation equipmentReservation) {
        return new EquipmentRequestResponse(
                equipmentReservation.getId(), equipmentReservation.getName().name(), equipmentReservation.getEmail().email(),
                equipmentReservation.getDni().dni()
        );
    }
}
