package com.rest.api.request.sandbox;

/**
 * Created by EGBoldyr on 23.05.18.
 */
public class UpdateSandboxParamters extends CreateSandboxParameters {

    private Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
