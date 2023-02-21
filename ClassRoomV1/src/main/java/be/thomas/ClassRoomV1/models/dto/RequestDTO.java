package be.thomas.ClassRoomV1.models.dto;

import lombok.Builder;
import lombok.Data;
import be.thomas.ClassRoomV1.models.entity.Classroom;
import be.thomas.ClassRoomV1.models.entity.Equipment;
import be.thomas.ClassRoomV1.models.entity.User;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

@Data
@Builder
public class RequestDTO {
    private Long id;

    private LocalDateTime timeSlot;

    private LocalTime duration;

    private String reason;

    private String refuse;

    private Classroom classroom;

    private Set<EquipmentDTO> equipments;

    private User user;

    private User validator;
}
