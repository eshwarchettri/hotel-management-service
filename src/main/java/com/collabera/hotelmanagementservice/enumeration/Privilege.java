package com.collabera.hotelmanagementservice.enumeration;

import lombok.Getter;

public enum Privilege {
    ADMIN("ADMIN"),
    USER("USER");
    @Getter
    private String value;

    Privilege(String value) {
        this.value = value;
    }
}
