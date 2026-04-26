package com.clinic.clinic.medication;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedicineResponseDto {
    private String name;
    private Integer quantity;
    MedicineResponseDto(MedicationEntity medicationEntity) {
        this.name = medicationEntity.getName();
        this.quantity = medicationEntity.getQuantity();
    }
}
