package com.campuslab.platform.u201621873.reservations.interfaces.rest.resources;

import com.campuslab.platform.u201621873.reservations.domain.model.valueobjects.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record EquipmentRequestResource(
        @Valid
        @NotBlank
        String reservationCode,
        @Valid
        @NotBlank
        String laboratoryId,
        @Valid
        @NotBlank
        String reservationPeriod,
        @Valid
        @NotBlank
        String equipmentBatch,
        @Valid
        @NotBlank
        int accessLevel,
        @Valid
        @NotBlank
        String status,
        @Valid
        @NotBlank
        String reservationNotes
) {
}
