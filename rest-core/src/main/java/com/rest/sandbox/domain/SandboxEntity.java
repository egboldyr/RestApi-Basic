package com.rest.sandbox.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EGBoldyr on 21.05.18.
 */

@Entity
@Table(name = "SANDBOX_BASIC")
public class SandboxEntity implements Serializable {

    @Id
    @Column(name = "BASIC_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String title;

    @Column
    private Integer count;

    public SandboxEntity(String title, Integer count) {
        this.title = title;
        this.count = count;
    }

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
        StringBuilder sb = new StringBuilder("SandboxEntity{");
        sb.append("id='").append(id).append("\'");
        sb.append(", title='").append(title).append("\'");
        sb.append(", count='").append(count).append("\'");
        return sb.append("}").toString();
    }
}
