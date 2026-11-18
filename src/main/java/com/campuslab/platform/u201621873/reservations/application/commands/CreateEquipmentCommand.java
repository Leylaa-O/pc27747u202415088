package com.campuslab.platform.u201621873.reservations.application.commands;

public record CreateEquipmentCommand(
        String reservationCode,
        String laboratoryId,
        String reservationPeriod,
        String equipmentBatch,
        int accessLevel,
        String status,
        String reservationNotes
) {
}
