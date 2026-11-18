package com.campuslab.platform.u201621873.reservations.domain.model.valueobjects;

public record EquipmentBatch(Integer quantity, String unit) {
    public EquipmentBatch {
        if (quantity==null || quantity < 0){
            throw new IllegalArgumentException("quantity cannot be null or less than 0");
        }
        if (unit==null || unit.isBlank()){
            throw new IllegalArgumentException("quantity cannot be null or blank");
        }
    }

    public EquipmentBatch addUnits(Integer additionalQuantity){

    }
}
