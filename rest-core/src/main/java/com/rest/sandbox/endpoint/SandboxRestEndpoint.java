package com.rest.sandbox.endpoint;

import com.rest.api.endpoint.SandboxEndpoint;
import com.rest.api.request.GeneralRequest;
import com.rest.api.response.GeneralResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by EGBoldyr on 21.05.18.
 */

@RestController
public class SandboxRestEndpoint implements SandboxEndpoint {

    public GeneralResponse<List<Void>> testGetMethod() {
        return new GeneralResponse<List<Void>>(null, null);
    }

    public GeneralResponse<Void> testPostMethod(@RequestBody GeneralRequest<Void> request) {
        return new GeneralResponse<Void>(null, null);
    }
}
