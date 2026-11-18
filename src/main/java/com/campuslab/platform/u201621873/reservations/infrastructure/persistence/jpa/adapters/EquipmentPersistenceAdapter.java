package com.campuslab.platform.u201621873.reservations.infrastructure.persistence.jpa.adapters;

import com.campuslab.platform.u201621873.reservations.domain.model.aggregates.EquipmentReservation;
import com.campuslab.platform.u201621873.reservations.domain.repositories.EquipmentRepository;
import com.campuslab.platform.u201621873.reservations.infrastructure.persistence.jpa.repositories.EquipmentJpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EquipmentPersistenceAdapter implements EquipmentRepository {
    private final EquipmentJpaRepository repository;
    public EquipmentPersistenceAdapter(EquipmentJpaRepository repository) {
        this.repository = repository;
    }
    @Override
    public Optional<EquipmentReservation> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public EquipmentReservation save(EquipmentReservation equipmentReservation) {
        return null;
    }

    @Override
    public Optional<EquipmentReservation> findByReservationCode(String reservationCode) {
        return Optional.empty();
    }

    @Override
    public EquipmentReservation update(EquipmentReservation customer) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
