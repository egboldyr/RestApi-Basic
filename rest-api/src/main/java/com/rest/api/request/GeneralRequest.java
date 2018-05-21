package com.rest.api.request;

/**
 * Created by EGBoldyr on 21.05.18.
 */
public class GeneralRequest<T> {

    private T parameters;

    public T getParameters() {
        return parameters;
    }
    public void setParameters(T parameters) {
        this.parameters = parameters;
    }
}
