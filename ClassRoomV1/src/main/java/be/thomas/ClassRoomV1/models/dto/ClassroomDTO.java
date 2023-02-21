package be.thomas.ClassRoomV1.models.dto;

import lombok.Builder;
import lombok.Data;
import org.apache.catalina.connector.Request;

import java.util.Set;

@Data
@Builder
public class ClassroomDTO {
    private Long id;

    private int capacity;

    private String name;

    private boolean teacherOnly;

    private Set<Request> request;
}