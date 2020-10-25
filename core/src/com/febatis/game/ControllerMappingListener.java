package com.febatis.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.ControllerListener;

public class ControllerMappingListener implements ControllerListener {

    private String TAG = "CntrllrMap";

    @Override
    public void connected(Controller controller) {
        Gdx.app.log(TAG, controller.getName() + " - connected");
    }

    @Override
    public void disconnected(Controller controller) {
        Gdx.app.log(TAG, controller.getName() + " - disconnected");
    }

    @Override
    public boolean buttonDown(Controller controller, int buttonCode) {
        Gdx.app.log(TAG, controller.getName() + " - buttonDown: " + buttonCode);
        return false;
    }

    @Override
    public boolean buttonUp(Controller controller, int buttonCode) {
        Gdx.app.log(TAG, controller.getName() + " - buttonUp: " + buttonCode);
        return false;
    }

    @Override
    public boolean axisMoved(Controller controller, int axisCode, float value) {
        if(value == 1 || value == -1) {
            Gdx.app.log(TAG, "axisMoved: " + axisCode);
        }
        return false;
    }
}
