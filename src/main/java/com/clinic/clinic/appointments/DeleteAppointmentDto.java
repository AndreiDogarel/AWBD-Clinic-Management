package com.clinic.clinic.appointments;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeleteAppointmentDto {
    @NotNull(message = "Appointment ID is mandatory")
    private Integer appointmentId;
}
