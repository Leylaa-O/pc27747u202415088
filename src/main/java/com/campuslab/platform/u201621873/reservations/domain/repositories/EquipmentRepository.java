package com.campuslab.platform.u201621873.reservations.domain.repositories;

import com.campuslab.platform.u201621873.reservations.domain.model.aggregates.EquipmentReservation;
import java.util.Optional;

public interface EquipmentRepository {
    Optional<EquipmentReservation> findById(Long id);
    EquipmentReservation save(EquipmentReservation equipmentReservation);
    Optional<EquipmentReservation> findByReservationCode(String reservationCode);
    EquipmentReservation update(EquipmentReservation customer);
    void deleteById(Long id);
}
