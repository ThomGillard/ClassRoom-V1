package be.thomas.ClassRoomV1.repository;

import be.thomas.ClassRoomV1.models.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<ClassRoom,Long> {
}
