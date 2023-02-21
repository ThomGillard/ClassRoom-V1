package be.thomas.ClassRoomV1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import be.thomas.ClassRoomV1.models.entity.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom,Long> {
}
