package com.collabera.hotelmanagementservice.enumeration;

import lombok.Getter;

public enum RoomPreferencesEnum {
    STANDARD("STANDARD"),
    DELUX("DELUX"),
    SUITE("SUITE");

    @Getter
    private final String value;

    RoomPreferencesEnum(String value) {
        this.value = value;
    }


}
