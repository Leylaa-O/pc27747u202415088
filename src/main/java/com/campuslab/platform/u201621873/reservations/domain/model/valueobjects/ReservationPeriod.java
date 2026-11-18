package com.campuslab.platform.u201621873.reservations.domain.model.valueobjects;

import java.time.LocalDate;
import java.util.UUID;

public record ReservationPeriod(LocalDate startDate, LocalDate endDate) {
    public ReservationPeriod{
        if (startDate == null || startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("startDate cannot be null or after endDate");
        }
        if (endDate == null || endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("endDate cannot be null or before starDate");
        }
    }

    public boolean contains(LocalDate checkDate){
        if (checkDate == null ) {
            throw new IllegalArgumentException("checkDate cannot be null");
        }

        if (checkDate.isAfter(startDate) && checkDate.isBefore(endDate))
           return true;
        else{
            return false;
        }
    }
}
