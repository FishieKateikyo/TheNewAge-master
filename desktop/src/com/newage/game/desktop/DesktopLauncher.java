package com.newage.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.newage.game.NewAge;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = NewAge.WIDTH;
		config.height = NewAge.HEIGHT;
		config.title = NewAge.TITLE;
		new LwjglApplication(new NewAge(), config);
	}
}
