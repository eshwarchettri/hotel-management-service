package com.collabera.hotelmanagementservice.enumeration;

public enum RoomPreferencesEnum {
    STANDARD("standard"),
    DELUX("delux"),
    SUITE("suite");
    private String value;

    RoomPreferencesEnum(String value) {
        this.value = value;
    }
}
