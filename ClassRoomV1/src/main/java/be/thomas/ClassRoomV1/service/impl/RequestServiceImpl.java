package be.thomas.ClassRoomV1.service.impl;

import org.springframework.stereotype.Service;
import be.thomas.ClassRoomV1.exceptions.NotFoundException;
import be.thomas.ClassRoomV1.models.dto.RequestDTO;
import be.thomas.ClassRoomV1.models.entity.Request;
import be.thomas.ClassRoomV1.models.form.RequestNewForm;
import be.thomas.ClassRoomV1.repository.RequestRepository;
import be.thomas.ClassRoomV1.service.RequestService;
import be.thomas.ClassRoomV1.service.mapper.RequestMapper;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;
    private final RequestMapper mapper;

    public RequestServiceImpl(RequestRepository requestRepository, RequestMapper mapper) {
        this.requestRepository = requestRepository;
        this.mapper = mapper;
    }

    @Override
    public List<RequestDTO> getAll() {
        return requestRepository.findAll().stream()
                .map( mapper::toDto )
                .toList();
    }

    @Override
    public RequestDTO getOne(Long id) {
        return requestRepository.findById(id)
                .map( mapper::toDto )
                .orElseThrow(() -> new NotFoundException("Sandwich not found"));
    }

    @Override
    public void insert(RequestNewForm form) {
        if( form == null )
            throw new IllegalArgumentException("form should not be null");

        Request entity = mapper.toEntity(form);
        requestRepository.save( entity );
    }
}
