import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class MainBil extends Application {

	public static final double WINDOW_WIDTH = 800;
	public static final double WINDOW_HEIGHT = 600;
	public static final double BIL_SIZE = 75;

	public static final ArrayList<KeyCode> keys = new ArrayList<KeyCode>();

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

		Bil bil = new Bil(BIL_SIZE);

		root.getChildren().add(bil);

		scene.setOnKeyPressed(event -> {

			if (!keys.contains(event.getCode())) {
				keys.add(event.getCode());
			}

		});

		scene.setOnKeyReleased(event -> {

			if (keys.contains(event.getCode())) {

				keys.remove(event.getCode());
			}
		});

		AnimationTimer at = new AnimationTimer() {

			@Override
			public void handle(long now) {

				for (int i = 0; i < keys.size(); i++) {

					KeyCode key = keys.get(i);

					switch (key) {

					case W:
					case UP:
						bil.moveUp();
						break;
					case S:
					case DOWN:
						bil.moveDown();
						break;
					case A:
					case LEFT:
						bil.moveLeft();
						break;
					case D:
					case RIGHT:
						bil.moveRight();
						break;
					case SPACE:
						bil.tuta(); // LOL
						bil.changeColor();
						break;
					case E:
						bil.setRotate(bil.getRotate() + 2);
						break;
					case Q:
						bil.setRotate(bil.getRotate() - 2);
						break;
					default:
						break;
					}

					if (bil.getTranslateX() > WINDOW_WIDTH) {
						bil.setTranslateX(0 - BIL_SIZE);
					} else if (bil.getTranslateX() < -BIL_SIZE) {
						bil.setTranslateX(WINDOW_WIDTH);
					}

					if (bil.getTranslateY() > WINDOW_HEIGHT) {
						bil.setTranslateY(0 - BIL_SIZE);
					} else if (bil.getTranslateY() < -BIL_SIZE) {
						bil.setTranslateY(WINDOW_HEIGHT);
					}

				}

			}

		};

		at.start();

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}