package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demo")
public class DemoEntity {
    @Id
    private Long id;

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
