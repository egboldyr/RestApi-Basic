package com.rest.sandbox.endpoint;

import com.rest.api.endpoint.SandboxEndpoint;
import com.rest.api.request.GeneralRequest;
import com.rest.api.request.sandbox.CreateSandboxParameters;
import com.rest.api.response.GeneralResponse;
import com.rest.api.dto.SandboxDTO;
import com.rest.api.response.ResponseCode;
import com.rest.sandbox.service.SandboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by EGBoldyr on 21.05.18.
 */

@RestController
public class SandboxRestEndpoint implements SandboxEndpoint {

    @Autowired
    private SandboxService service;

    @Override
    public GeneralResponse<List<SandboxDTO>> testGetMethod() {
        return new GeneralResponse<List<SandboxDTO>>(ResponseCode.OK, service.findAll());
    }

    @Override
    public GeneralResponse<SandboxDTO> testGetMethod(Long id) {
        return new GeneralResponse<>(ResponseCode.OK, service.findById(id));
    }

    @Override
    public GeneralResponse<Long> testPostMethod(@RequestBody GeneralRequest<CreateSandboxParameters> request) {
        return new GeneralResponse<Long>(ResponseCode.OK, service.create(request.getParameters()));
    }
}
