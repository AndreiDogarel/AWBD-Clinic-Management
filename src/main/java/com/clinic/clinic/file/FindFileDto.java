package com.clinic.clinic.file;

import com.clinic.clinic.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FindFileDto {
    @NotNull(message = "Patient cannot be null")
    Integer patientId;
    private Boolean isSick;
    private BloodType bloodType;
    private Map<String, Integer> medications = new HashMap<>();

    public FindFileDto(FileEntity fileEntity) {
        this.bloodType = fileEntity.getBloodType();
        this.patientId = fileEntity.getUser().getId();
        this.medications = new HashMap<>();
        for (FileMedication fileMedication : fileEntity.getMedications()) {
            this.medications.put(fileMedication.getMedication().getName(), fileMedication.getQuantity());
        }
    }
}
