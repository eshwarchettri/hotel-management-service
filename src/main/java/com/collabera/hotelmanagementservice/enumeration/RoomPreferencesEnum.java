package com.collabera.hotelmanagementservice.enumeration;

import lombok.Getter;

public enum RoomPreferencesEnum {
    standard("STANDARD"),
    delux("DELUX"),
    suite("SUITE");

    @Getter
    private final String value;

    RoomPreferencesEnum(String value) {
        this.value = value;
    }


}
