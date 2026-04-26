package com.clinic.clinic.appointments;

import com.clinic.clinic.user.User;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AppointmentJpaRepo extends JpaRepository<AppointmentEntity, Integer> {
    @Query(value = "SELECT * FROM appointments a WHERE a.needed_specialization = :specialization and a.doctor IS NULL", nativeQuery = true)
    Optional<List<AppointmentEntity>> findAppointmentEntitiesByNeededSpecialization(@Param("specialization") String specialization);

    Optional<List<AppointmentEntity>> findByDoctorId(User doctorId);
//    List<AppointmentEntity> findByNeededSpecialization(Integer serviceId);
//    List<AppointmentEntity> (Integer patientId);
}
