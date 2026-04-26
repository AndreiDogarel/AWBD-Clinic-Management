package com.clinic.clinic.appointments;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcceptAppointmentDto {
    @NotNull(message = "Id is mandatory")
    private Integer appointmentId;
}
