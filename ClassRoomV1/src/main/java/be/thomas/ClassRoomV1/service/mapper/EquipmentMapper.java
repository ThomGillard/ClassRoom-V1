package be.thomas.ClassRoomV1.service.mapper;

import org.springframework.stereotype.Service;
import be.thomas.ClassRoomV1.models.dto.ClassroomDTO;
import be.thomas.ClassRoomV1.models.dto.EquipmentDTO;
import be.thomas.ClassRoomV1.models.entity.Classroom;
import be.thomas.ClassRoomV1.models.entity.Equipment;

@Service
public class EquipmentMapper {
    public EquipmentDTO toDto(Equipment entity) {
        if( entity == null )
            return null;

        return EquipmentDTO.builder()
                .id( entity.getId() )
                .name( entity.getName() )
                .build();
    }
}
