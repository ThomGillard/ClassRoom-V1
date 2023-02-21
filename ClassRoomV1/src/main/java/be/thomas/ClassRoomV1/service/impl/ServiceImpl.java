package be.thomas.ClassRoomV1.service.impl;

import be.thomas.ClassRoomV1.models.entity.ClassRoom;
import Template.models.form.Form;
import be.thomas.ClassRoomV1.repository.Repository;
import be.thomas.ClassRoomV1.service.Service;
import be.thomas.ClassRoomV1.service.mapper.Mapper;


@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    private final Repository repository;
    private final Mapper mapper;

    public ServiceImpl( Repository repository, Mapper mapper ){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void crud(Form form) {
        if ( form == null ){
            throw new IllegalArgumentException("form should be not null");
        }else{
            ClassRoom classRoom = mapper.formToEntity( form );
            classRoom.setDbItem( form.getInfo() );
            repository.save(classRoom);
        }
    }
}
