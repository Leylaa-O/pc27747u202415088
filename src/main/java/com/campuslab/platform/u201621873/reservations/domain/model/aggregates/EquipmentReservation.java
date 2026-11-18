package com.campuslab.platform.u201621873.reservations.domain.model.aggregates;

import com.campuslab.platform.u201621873.reservations.domain.model.valueobjects.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.AbstractAggregateRoot;

@Getter
@Setter
public class EquipmentReservation extends AbstractAggregateRoot<EquipmentReservation> {
    private Long id;
    private ReservationCode reservationCode;
    private LaboratoryId laboratoryId;
    private ReservationPeriod reservationPeriod;
    private EquipmentBatch equipmentBatch;
    private Integer accessLevel;
    private ReservationStatus status;
    private String reservationNotes;

    public EquipmentReservation(Long id, ReservationCode reservationCode, LaboratoryId laboratoryId, ReservationPeriod reservationPeriod, EquipmentBatch equipmentBatch, Integer accessLevel, ReservationStatus status, String reservationNotes) {
        if (accessLevel < 1 || accessLevel > 5 || accessLevel==null){
            throw new IllegalArgumentException("accessLevel must be between 1 & 5 or cannot be null");
        }

        this.id = id;
        this.reservationCode = reservationCode;
        this.laboratoryId = laboratoryId;
        this.reservationPeriod = reservationPeriod;
        this.equipmentBatch = equipmentBatch;
        this.accessLevel = accessLevel;
        this.status = status.PENDING;
        this.reservationNotes = reservationNotes;
    }

}
