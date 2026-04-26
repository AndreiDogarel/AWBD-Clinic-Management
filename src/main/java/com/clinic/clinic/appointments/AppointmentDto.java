package com.clinic.clinic.appointments;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDto {
    Integer pacientId;
    Integer doctorId;
    Long appointmentId;

//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
    LocalDateTime appointmentDate;

    AppointmentDto(AppointmentEntity appointmentEntity) {
        this.appointmentDate=appointmentEntity.getDate();
        this.appointmentId=appointmentEntity.getId();
        this.pacientId=appointmentEntity.getPatientId().getId();
        if (appointmentEntity.getDoctorId() != null) {
            this.doctorId=appointmentEntity.getDoctorId().getId();
        }
    }
}
