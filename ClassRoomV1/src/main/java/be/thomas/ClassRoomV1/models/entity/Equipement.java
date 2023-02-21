package be.thomas.ClassRoomV1.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"Equipement\"")
@Getter @Setter
public class Equipement extends BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipement_id", nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nom_salle_id;
    @Column(nullable = false)
    private String quantity;

}