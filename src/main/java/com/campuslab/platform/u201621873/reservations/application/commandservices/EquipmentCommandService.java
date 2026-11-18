package com.campuslab.platform.u201621873.reservations.application.commandservices;

import com.campuslab.platform.u201621873.reservations.application.commands.CreateEquipmentCommand;
import com.campuslab.platform.u201621873.reservations.domain.model.aggregates.EquipmentReservation;

public interface EquipmentCommandService {
    EquipmentReservation handle(CreateEquipmentCommand command);
}
