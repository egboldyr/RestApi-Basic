package com.rest.sandbox.service;

import com.rest.api.dto.SandboxDTO;
import com.rest.api.request.sandbox.CreateSandboxParameters;

import java.util.List;

/**
 * Created by EGBoldyr on 22.05.18.
 */

public interface SandboxService {

    Long create(CreateSandboxParameters parameters);

    SandboxDTO findById(Long id);

    List<SandboxDTO> findAll();

}
