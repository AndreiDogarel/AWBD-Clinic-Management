package com.clinic.clinic.appointments;

import com.clinic.clinic.user.Specializations;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddAppointmentDto {

    @NotNull(message = "Date is mandatory")
    private LocalDateTime date;

    @NotNull(message = "Specialization is mandatory")
    private Specializations neededSpecialization;
}
