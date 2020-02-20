package com.github.jsalonen.springdemo.entity;

import org.springframework.data.annotation.Id;

public class Zone {

    @Id
    public String id;

    public String name;

    public Zone(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
            "Zone[id=%s, name='%s']",
            id, name
        );
    }
}
