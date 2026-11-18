package com.campuslab.platform.u201621873.reservations.infrastructure.persistence.jpa.mappers;

import com.campuslab.platform.u201621873.reservations.domain.model.aggregates.EquipmentReservation;
import org.springframework.stereotype.Component;

@Component
public class EquipmentPersistenceMapper {
    public static EquipmentReservation toDomain(CustomerPersistenceEntity entity){
        return  new Customer(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getDni()
        );

    }
    public static CustomerPersistenceEntity toEntity(Customer customer){
        return  CustomerPersistenceEntity.builder()
                .name(customer.getName())
                .email(customer.getEmail())
                .dni(customer.getDni())
                .build();
    }
}
