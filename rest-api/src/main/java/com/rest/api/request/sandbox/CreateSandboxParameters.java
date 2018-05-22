package com.rest.api.request.sandbox;

/**
 * Created by EGBoldyr on 22.05.18.
 */

public class CreateSandboxParameters {

    private String title;

    private Integer count;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
}
