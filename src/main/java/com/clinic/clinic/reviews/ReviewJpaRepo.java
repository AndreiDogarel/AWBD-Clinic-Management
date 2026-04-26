package com.clinic.clinic.reviews;

import com.clinic.clinic.user.User;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewJpaRepo extends JpaRepository<ReviewEntity, Long> {
    List<ReviewEntity> findReviewEntityByPatientId(@NonNull User patientId);
}
