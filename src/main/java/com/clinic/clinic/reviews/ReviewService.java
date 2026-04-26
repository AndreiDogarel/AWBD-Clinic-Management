package com.clinic.clinic.reviews;

import com.clinic.clinic.appointments.AppointmentDto;
import com.clinic.clinic.appointments.AppointmentEntity;
import com.clinic.clinic.user.User;
import com.clinic.clinic.global.UserIsNotDoctor;
import com.clinic.clinic.user.UserJpaRepo;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewJpaRepo reviewJpaRepo;
    private final UserJpaRepo userJpaRepo;

    public void addReview(AddReviewDto review) {
        User pacient = (User) SecurityContextHolder.getContext()
            .getAuthentication()
            .getPrincipal();
        User doctor = userJpaRepo
            .findById(review.getDoctorId())
            .orElseThrow(() -> new UserIsNotDoctor(review.getDoctorId()));

        if (doctor.getSpecialization() == null) {
            throw new UserIsNotDoctor(doctor.getId());
        }

        var reviewEntity = ReviewEntity.builder()
            .patientId(pacient)
            .doctorId(doctor)
            .comment(review.getReview())
            .build();
        reviewJpaRepo.save(reviewEntity);
    }

    public List<ReviewDto> getOwnReviews() {
        User pacient = (User) SecurityContextHolder.getContext()
            .getAuthentication()
            .getPrincipal();
        System.out.println(pacient.getId());
        Optional<List<ReviewEntity>> reviewEntities = Optional.ofNullable(
            reviewJpaRepo.findReviewEntityByPatientId(pacient)
        );
        List<ReviewDto> reviews = new java.util.ArrayList<>(List.of());
        if (reviewEntities.isPresent()) {
            for (ReviewEntity reviewEntity : reviewEntities.get()) {
                reviews.add(new ReviewDto(reviewEntity));
            }
        }
        return reviews;
    }

    public List<ReviewDto> getAllReviews() {
        Optional<List<ReviewEntity>> reviewEntities = Optional.of(
            reviewJpaRepo.findAll()
        );
        List<ReviewDto> reviews = new java.util.ArrayList<>(List.of());
        if (reviewEntities.isPresent()) {
            for (ReviewEntity reviewEntity : reviewEntities.get()) {
                reviews.add(new ReviewDto(reviewEntity));
            }
        }
        return reviews;
    }

    public void deleteReview(DeleteReviewDto dto) {
        Optional<ReviewEntity> reviewEntity = reviewJpaRepo.findById(
            dto.getId()
        );
        if (reviewEntity.isPresent()) {
            reviewJpaRepo.delete(reviewEntity.get());
        } else {
            throw new RuntimeException("Review not found");
        }
    }
}
