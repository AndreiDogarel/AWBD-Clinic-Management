package com.clinic.clinic.reviews;

import com.clinic.clinic.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@Entity
@Table(name = "reviews")
@NoArgsConstructor
@AllArgsConstructor
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient")
    @NonNull
    private User patientId;

    @ManyToOne
    @JoinColumn(name = "doctor")
    private User doctorId;

    private String comment;


}
