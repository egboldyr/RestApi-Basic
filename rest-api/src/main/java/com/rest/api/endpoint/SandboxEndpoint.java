package com.rest.api.endpoint;

import com.rest.api.request.GeneralRequest;
import com.rest.api.request.sandbox.CreateSandboxParameters;
import com.rest.api.request.sandbox.UpdateSandboxParamters;
import com.rest.api.response.GeneralResponse;
import com.rest.api.dto.SandboxDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@SwaggerDefinition(
        info = @Info(description = "Sandbox Test REST API", version = "1.0", title = "Sandbox API"),
        produces = {"application/json"},
        schemes = {SwaggerDefinition.Scheme.HTTPS}
)
@Api(tags = "Sandbox Test", produces = "application/json", protocols = "https")
@RequestMapping("/sandbox")
public interface SandboxEndpoint {

    @ApiOperation(value = "Sandbox GET Test-method (All)")
    @RequestMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.GET)
    GeneralResponse<List<SandboxDTO>> testGetAllMethod();

    @ApiOperation(value = "Sandbox GET Test-method (Single)")
    @RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.GET)
    GeneralResponse<SandboxDTO> testGetMethod(@RequestParam("sandboxId") Long id);

    @ApiOperation(value = "Sandbox POST Test-method")
    @RequestMapping(value = "/create", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST)
    GeneralResponse<Long> testPostMethod(GeneralRequest<CreateSandboxParameters> request);

    @ApiOperation(value = "Sandbox PUT Test-method")
    @RequestMapping(value = "/update", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.PUT)
    GeneralResponse<Void> testPutMethod(GeneralRequest<UpdateSandboxParamters> request);

    @ApiOperation(value = "Sandbox DELETE Test-method")
    @RequestMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.DELETE)
    GeneralResponse<Void> testDeleteMethod(@RequestParam("samdboxId") Long id);

}
