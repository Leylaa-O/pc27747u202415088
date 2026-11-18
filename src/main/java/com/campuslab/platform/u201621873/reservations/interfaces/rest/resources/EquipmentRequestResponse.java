package com.campuslab.platform.u201621873.reservations.interfaces.rest.resources;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record EquipmentRequestResponse(
        long id,
        String reservationCode,
        String laboratoryId,
        String reservationPeriod,
        String equipmentBatch,
        int accessLevel,
        String status,
        String reservationNotes
) {
}
