package be.thomas.ClassRoomV1.service.mapper;

import org.springframework.stereotype.Service;
import be.thomas.ClassRoomV1.models.dto.ClassroomDTO;
import be.thomas.ClassRoomV1.models.entity.Classroom;

@Service
public class ClassroomMapper {
    public ClassroomDTO toDto(Classroom entity) {
        if( entity == null )
            return null;

        return ClassroomDTO.builder()
                .id( entity.getId() )
                .capacity(entity.getCapacity())
                .name( entity.getName() )
                .teacherOnly(entity.isTeacherOnly())
                .build();
    }
}
