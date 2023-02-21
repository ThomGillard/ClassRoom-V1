package be.thomas.ClassRoomV1.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@jakarta.persistence.Entity
@Getter @Setter
public class ClassRoom {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "classroom_id", nullable = false)
    private long id;

    @Column( nullable = false )
    private Object dbItem;


    @ManyToMany
    @JoinTable(
            name="classroom_availability",
            joinColumns = @JoinColumn( name = "classroom_id" ),
            inverseJoinColumns = @JoinColumn( name="availability_id" )
    )
    private Set<User> entities = new LinkedHashSet<>();


    @OneToOne(mappedBy= "ClassRoom")
    private User user;

}
