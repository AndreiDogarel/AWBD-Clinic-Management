package com.clinic.clinic.file;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetFileDto {
    @NotNull(message = "Patient cannot be null")
    Integer patientId;


}
