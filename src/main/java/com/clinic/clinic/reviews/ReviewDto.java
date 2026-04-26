package com.clinic.clinic.reviews;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {
    String review;

    ReviewDto(ReviewEntity reviewEntity) {
        this.review = reviewEntity.getComment();
    }

}
