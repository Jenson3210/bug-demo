package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
