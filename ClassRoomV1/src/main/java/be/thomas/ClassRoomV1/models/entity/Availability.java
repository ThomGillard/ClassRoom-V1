package be.thomas.ClassRoomV1.models.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "\"Availability\"")
@Getter @Setter
public class Availability extends BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "availability_id", nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String status;
    @Column(nullable = false)
    private LocalDate heureDebut;

    @Column(nullable = false)
    private LocalDate heureFin;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private LocalDate reservation_date;
}