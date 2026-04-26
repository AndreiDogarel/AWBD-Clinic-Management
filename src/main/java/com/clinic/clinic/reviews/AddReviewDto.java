package com.clinic.clinic.reviews;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddReviewDto {

    @NotNull(message = "Doctor ID can't be null")
    private Integer doctorId;

    @NotNull(message = "Review text can't be null")
    private String review;
}
