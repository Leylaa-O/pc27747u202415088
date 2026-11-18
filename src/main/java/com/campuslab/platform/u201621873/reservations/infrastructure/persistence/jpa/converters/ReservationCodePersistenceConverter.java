package com.campuslab.platform.u201621873.reservations.infrastructure.persistence.jpa.converters;

import com.campuslab.platform.u201621873.reservations.domain.model.valueobjects.ReservationCode;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class ReservationCodePersistenceConverter implements AttributeConverter<ReservationCode, String> {
    @Override
    public String convertToDatabaseColumn(ReservationCode attribute) {
        return attribute==null ? null : attribute.reservationCode();
    }

    @Override
    public ReservationCode convertToEntityAttribute(String dbData) {
        return dbData==null ? null : new ReservationCode(dbData);
    }
}
