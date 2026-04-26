package com.clinic.clinic.file;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddBloodDto {
    @NotNull (message = "Patient cannot be null")
    Integer patientId;

    @NotNull (message = "Blood type cannot be null")
    BloodType bloodType;
}
