package com.febatis.game;

public enum PS4Mapping {
    CROSS(0),
    CIRCLE(1),
    SQUARE(2),
    TRIANGLE(3),
    SHARE(4),
    PS(5),
    OPTIONS(6),
    L3(7),
    R3(8),
    L1(9),
    R1(10),
    DPAD_UP(11),
    DPAD_DOWN(12),
    DPAD_LEFT(13),
    DPAD_RIGHT(14);

    int index;
    PS4Mapping(int index) {
        this.index = index;
    }
}
