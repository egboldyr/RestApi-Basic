package com.rest.sandbox.service.impl;

import com.rest.api.dto.SandboxDTO;
import com.rest.api.request.sandbox.CreateSandboxParameters;
import com.rest.api.request.sandbox.UpdateSandboxParamters;
import com.rest.sandbox.dao.SandboxRepository;
import com.rest.sandbox.domain.SandboxEntity;
import com.rest.sandbox.service.SandboxService;
import com.rest.sandbox.util.SandboxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by EGBoldyr on 22.05.18.
 */

@Service
public class SandboxServiceImpl implements SandboxService {

    @Autowired
    private SandboxRepository repository;

    @Autowired
    private SandboxMapper mapper;

    @Override
    public Long create(CreateSandboxParameters parameters) {
        SandboxEntity sandbox = new SandboxEntity();
        sandbox.setTitle(parameters.getTitle());
        sandbox.setCount(parameters.getCount());
        return repository.saveAndFlush(sandbox).getId();
    }

    @Override
    public SandboxDTO findById(Long id) {
        return mapper.sandboxDomainToSandboxDto(repository.findOne(id));
    }

    @Override
    public void update(UpdateSandboxParamters paramters) {
        SandboxEntity sandbox = repository.findOne(paramters.getId());
        if (sandbox == null) {
            throw new IllegalStateException("Entitty with ID = " + paramters.getId() + " not found.");
        }
        sandbox.setTitle(paramters.getTitle());
        sandbox.setCount(paramters.getCount());
        repository.saveAndFlush(sandbox);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public List<SandboxDTO> findAll() {
        return mapper.sandboxDomainListToSandboxDtoList(repository.findAll());
    }
}
