package be.thomas.ClassRoomV1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import be.thomas.ClassRoomV1.models.entity.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment,Long> {
}
