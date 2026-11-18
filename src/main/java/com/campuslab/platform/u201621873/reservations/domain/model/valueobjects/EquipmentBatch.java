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
        if (additionalQuantity== null || additionalQuantity <0 || additionalQuantity > Integer.MAX_VALUE){
            throw new IllegalArgumentException("additionalQuantity cannot be null or less than 0 or be more than Integer.MAX_VALUE");
        }

        return new EquipmentBatch(this.quantity+additionalQuantity, this.unit);
    }
}
