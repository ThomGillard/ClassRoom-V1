package be.thomas.ClassRoomV1.service.mapper;

import org.springframework.stereotype.Service;
import be.thomas.ClassRoomV1.models.dto.RequestDTO;
import be.thomas.ClassRoomV1.models.entity.Request;
import be.thomas.ClassRoomV1.models.form.RequestNewForm;

@Service
public class RequestMapper {

    public RequestDTO toDto(Request request){
        if( request == null )
            return null;

        return RequestDTO.builder()
                .id(request.getId())
                .timeSlot(request.getTimeSlot())
                .duration(request.getDuration())
                .reason(request.getReason())
                .refuse(request.getRefuse())
                .classroom(request.getClassroom())
                .build();
    }

    public Request toEntity(RequestNewForm form){
        if( form == null )
            return null;

        Request request = new Request();

        request.setTimeSlot(form.getTimeSlot());
        request.setDuration(form.getDuration());
        request.setReason(form.getReason());

        return request;
    }
}
