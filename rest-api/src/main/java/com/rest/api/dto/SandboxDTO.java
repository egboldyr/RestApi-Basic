package com.rest.api.dto;

import java.io.Serializable;

/**
 * Created by EGBoldyr on 22.05.18.
 */

public class SandboxDTO implements Serializable {

    private Long id;

    private String title;

    private Integer count;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SandboxDTO{");
        sb.append("id='").append(id).append("\'");
        sb.append(", title='").append(title).append("\'");
        sb.append(", count='").append(count).append("\'");
        return sb.append("}").toString();
    }
}
