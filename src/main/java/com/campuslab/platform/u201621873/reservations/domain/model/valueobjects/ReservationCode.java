package com.campuslab.platform.u201621873.reservations.domain.model.valueobjects;

public record ReservationCode(String reservationCode) {
    public ReservationCode {
        if(reservationCode==null || reservationCode.isBlank()) {
            throw new IllegalArgumentException("reservationCode cannot be null or blank");
        }
    }
}
