package com.clinic.clinic.medication;

import jakarta.persistence.*;
import lombok.*;

@Table(name ="medication")
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MedicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String name;
    private String description;
    private Integer quantity;
    private boolean active;
}
