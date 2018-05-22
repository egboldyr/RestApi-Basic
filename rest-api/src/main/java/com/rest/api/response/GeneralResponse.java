package com.rest.api.response;

/**
 * Created by EGBoldyr on 21.05.18.
 */
public class GeneralResponse<T> {

    private String code;

    private T payload;

    public GeneralResponse() {}
    public GeneralResponse(String code, T payload) {
        this.code = code;
        this.payload = payload;
    }

    public String getCode() {
        return code;
    }
    public T getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GeneralResponse{");
        sb.append("code='").append(code).append("\'");
        sb.append(", payload='").append(payload).append("\'");
        return sb.append("}").toString();
    }
}
