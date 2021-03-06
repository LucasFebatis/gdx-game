package com.febatis.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.Controllers;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.Array;

public class MainMenuScreen implements Screen {

    final MyGdxGame game;

    OrthographicCamera camera;

    public MainMenuScreen(final MyGdxGame game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, "Welcome to Drop!!! ", 100, 150);
        game.font.draw(game.batch, "Tap anywhere to begin!", 100, 100);
        game.batch.end();

        if (Gdx.input.isTouched()) {
            game.setScreen(new GameScreen(game));
            dispose();
        }

        if (isControllerPressed()) {
            game.setScreen(new GameScreen(game));
            dispose();
        }
    }

    private boolean isControllerPressed() {


        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
            return true;
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            return true;

        Array<Controller> controllers = Controllers.getControllers();

        if (controllers.size > 0) {
            Controller controller = controllers.get(0);

            boolean btnLeft = controller.getButton(PS4Mapping.DPAD_LEFT.index);
            boolean btnRight = controller.getButton(PS4Mapping.DPAD_RIGHT.index);

            return btnLeft || btnRight;
        }

        return false;
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }


    //...Rest of class omitted for succinctness.

}
