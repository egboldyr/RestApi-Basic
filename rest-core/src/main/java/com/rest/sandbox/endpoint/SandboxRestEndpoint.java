package com.rest.sandbox.endpoint;

import com.rest.api.endpoint.SandboxEndpoint;
import com.rest.api.request.GeneralRequest;
import com.rest.api.request.sandbox.CreateSandboxParameters;
import com.rest.api.response.GeneralResponse;
import com.rest.api.dto.SandboxDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by EGBoldyr on 21.05.18.
 */

@RestController
public class SandboxRestEndpoint implements SandboxEndpoint {

    @Override
    public GeneralResponse<List<SandboxDTO>> testGetMethod() {
        return new GeneralResponse<List<SandboxDTO>>(null, null);
    }

    @Override
    public GeneralResponse<SandboxDTO> testGetMethod(Long id) {
        return null;
    }

    @Override
    public GeneralResponse<Long> testPostMethod(@RequestBody GeneralRequest<CreateSandboxParameters> request) {
        return new GeneralResponse<Long>(null, null);
    }
}
