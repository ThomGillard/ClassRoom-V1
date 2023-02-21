package be.thomas.ClassRoomV1.service.impl;

import org.springframework.stereotype.Service;
import be.thomas.ClassRoomV1.models.dto.ClassroomDTO;
import be.thomas.ClassRoomV1.repository.ClassroomRepository;
import be.thomas.ClassRoomV1.service.ClassroomService;
import be.thomas.ClassRoomV1.service.mapper.ClassroomMapper;

import java.util.List;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    private final ClassroomRepository classroomRepository;
    private final ClassroomMapper mapper;

    public ClassroomServiceImpl(ClassroomRepository classroomRepository, ClassroomMapper mapper) {
        this.classroomRepository = classroomRepository;
        this.mapper = mapper;
    }

    @Override
    public List<ClassroomDTO> getAll() {
        return classroomRepository.findAll().stream()
                .map( mapper::toDto )
                .toList();
    }
}
