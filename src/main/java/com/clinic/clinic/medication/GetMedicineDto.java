package com.clinic.clinic.medication;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetMedicineDto {
    @NotNull(message = "Medicine Id is mandatory")
    private String name;
}
