package com.campuslab.platform.u201621873.reservations.infrastructure.persistence.jpa.entities;

import com.campuslab.platform.u201621873.reservations.domain.model.valueobjects.*;
import com.campuslab.platform.u201621873.reservations.infrastructure.persistence.jpa.converters.ReservationCodePersistenceConverter;
import com.campuslab.platform.u201621873.shared.infrastructure.persistence.jpa.entities.AuditableAbstractPersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "equipment_reservations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EquipmentPersistenceEntity extends AuditableAbstractPersistenceEntity {
    @Convert(converter = ReservationCodePersistenceConverter.class)
    @Column(name = "reservation_code", nullable = false, updatable = false)
    private ReservationCode reservationCode;

    @Convert(converter = ReservationCodePersistenceConverter.class)
    @Column(name = "laboratory_id", nullable = false, updatable = false)
    private LaboratoryId laboratoryId;

    @Convert(converter = ReservationCodePersistenceConverter.class)
    @Column(name = "reservation_period", nullable = false, updatable = false)
    private ReservationPeriod reservationPeriod;

    @Convert(converter = ReservationCodePersistenceConverter.class)
    @Column(name = "reservation_code", nullable = false, updatable = false)
    private EquipmentBatch equipmentBatch;
    @Convert(converter = ReservationCodePersistenceConverter.class)
    @Column(name = "reservation_code", nullable = false, updatable = false)
    private Integer accessLevel;
    @Convert(converter = ReservationCodePersistenceConverter.class)
    @Column(name = "reservation_code", nullable = false, updatable = false)
    private ReservationStatus status;
    @Convert(converter = ReservationCodePersistenceConverter.class)
    @Column(name = "reservation_code", nullable = false, updatable = false)
    private String reservationNotes;
}


