package com.rest.sandbox.service;

import com.rest.api.dto.SandboxDTO;
import com.rest.api.request.sandbox.CreateSandboxParameters;
import com.rest.api.request.sandbox.UpdateSandboxParamters;

import java.util.List;

/**
 * Created by EGBoldyr on 22.05.18.
 */

public interface SandboxService {

    Long create(CreateSandboxParameters parameters);

    SandboxDTO findById(Long id);

    void update(UpdateSandboxParamters paramters);

    void delete(Long id);

    List<SandboxDTO> findAll();

}
