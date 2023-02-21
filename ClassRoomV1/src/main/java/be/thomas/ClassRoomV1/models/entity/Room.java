package be.thomas.ClassRoomV1.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"Room\"")
@Getter @Setter
public class Room extends BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id", nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nom_salle;
    @Column(nullable = false)
    private String equipement;

    @Column(nullable = false)
    private Long capacity;


}