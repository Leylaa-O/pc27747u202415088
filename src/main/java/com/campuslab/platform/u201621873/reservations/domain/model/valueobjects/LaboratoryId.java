package com.campuslab.platform.u201621873.reservations.domain.model.valueobjects;

import java.util.UUID;

public record LaboratoryId(String laboratoryId) {
    public LaboratoryId() {
        this(UUID.randomUUID().toString());
    }
    public LaboratoryId {
        if (laboratoryId == null || laboratoryId.isBlank()) {
            throw new IllegalArgumentException("laboratoryId cannot be null or empty");
        }
        try {
            UUID.fromString(laboratoryId);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException("laboratoryId must be a valid UUID", exception);
        }
    }
}
