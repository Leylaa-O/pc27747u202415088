package com.campuslab.platform.u201621873.reservations.infrastructure.persistence.jpa.repositories;

import com.campuslab.platform.u201621873.reservations.infrastructure.persistence.jpa.entities.EquipmentPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EquipmentJpaRepository extends JpaRepository<EquipmentPersistenceEntity, Long> {
    Optional<EquipmentPersistenceEntity> findByReservationCode(String reservationCode);
}
