package com.rest.api.endpoint;

import com.rest.api.request.GeneralRequest;
import com.rest.api.response.GeneralResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@SwaggerDefinition(
        info = @Info(description = "Sandbox Test REST API", version = "1.0", title = "Sandbox API"),
        produces = {"application/json"},
        schemes = {SwaggerDefinition.Scheme.HTTPS}
)
@Api(tags = "Sandbox Test", produces = "application/json", protocols = "https")
@RequestMapping("/sandbox")
public interface SandboxEndpoint {

    @ApiOperation(value = "Sandbox GET Test-method")
    @RequestMapping(value = "/testget", method = RequestMethod.GET)
    GeneralResponse<List<Void>> testGetMethod();

    @ApiOperation(value = "Sandbox POST Test-method")
    @RequestMapping(value = "/testpost", method = RequestMethod.POST)
    GeneralResponse<Void> testPostMethod(GeneralRequest<Void> request);

}
