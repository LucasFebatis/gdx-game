package com.febatis.game;

public enum XboxOneMapping {
    A(0),
    B(1),
    X(2),
    Y(3),
    VIEW(4),
    XBOX(5),
    MENU(6),
    LT(7),
    RT(8),
    LB(9),
    RB(10),
    DPAD_UP(11),
    DPAD_DOWN(12),
    DPAD_LEFT(13),
    DPAD_RIGHT(14);

    int index;
    XboxOneMapping(int index) {
        this.index = index;
    }
}
