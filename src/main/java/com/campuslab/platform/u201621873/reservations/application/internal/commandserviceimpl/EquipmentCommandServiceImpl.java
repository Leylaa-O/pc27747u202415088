package com.campuslab.platform.u201621873.reservations.application.internal.commandserviceimpl;

import com.campuslab.platform.u201621873.reservations.application.commands.CreateEquipmentCommand;
import com.campuslab.platform.u201621873.reservations.application.commandservices.EquipmentCommandService;
import com.campuslab.platform.u201621873.reservations.domain.model.aggregates.EquipmentReservation;
import com.campuslab.platform.u201621873.reservations.domain.model.valueobjects.LaboratoryId;
import com.campuslab.platform.u201621873.reservations.domain.model.valueobjects.ReservationCode;
import com.campuslab.platform.u201621873.reservations.domain.model.valueobjects.ReservationPeriod;
import com.campuslab.platform.u201621873.reservations.domain.model.valueobjects.ReservationStatus;
import com.campuslab.platform.u201621873.reservations.domain.repositories.EquipmentRepository;
import org.springframework.stereotype.Service;

@Service
public class EquipmentCommandServiceImpl implements EquipmentCommandService {
    private final EquipmentRepository repository;

    public EquipmentCommandServiceImpl(EquipmentRepository repository) {
        this.repository = repository;
    }
    @Override
    public EquipmentReservation handle(CreateEquipmentCommand command) {
        if(command==null){
            throw new IllegalArgumentException("command is null");
        }
        var customer = new EquipmentReservation(new ReservationCode(command.reservationCode()),
                new LaboratoryId(command.laboratoryId()), new ReservationPeriod(command.reservationPeriod()),
                command.accessLevel(), new ReservationStatus(command.status()),
                command.reservationNotes());
        return repository.save(customer);
    }
}