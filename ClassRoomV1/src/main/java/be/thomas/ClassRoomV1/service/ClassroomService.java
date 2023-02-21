package be.thomas.ClassRoomV1.service;

import be.thomas.ClassRoomV1.models.dto.ClassroomDTO;

import java.util.List;

public interface ClassroomService {

    List<ClassroomDTO> getAll();
}
