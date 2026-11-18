package com.campuslab.platform.u201621873.reservations.domain.model.aggregates;

import com.campuslab.platform.u201621873.reservations.domain.model.valueobjects.*;

public class EquipmentReservation {
    private Long id;
    private ReservationCode reservationCode;
    private LaboratoryId laboratoryId;
    private ReservationPeriod reservationPeriod;
    private EquipmentBatch equipmentBatch;
    private Integer accessLevel;
    private ReservationStatus status;
    private String reservationNotes;

}
