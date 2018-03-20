import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class MainRaket extends Application {

	public static final double WINDOW_WIDTH = 800;
	public static final double WINDOW_HEIGHT = 600;
	public static final double RAKET_SIZE = 75;

	public static final ArrayList<KeyCode> keys = new ArrayList<KeyCode>();

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

		Raket raket = new Raket(RAKET_SIZE);

		root.getChildren().add(raket);

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
						raket.moveUp();
						break;
					case S:
					case DOWN:
						raket.moveDown();
						break;
					case A:
					case LEFT:
						raket.moveLeft();
						break;
					case D:
					case RIGHT:
						raket.moveRight();
						break;
					case SPACE:
						raket.tuta();
						raket.changeColor();
						break;
					case E:
						raket.setRotate(raket.getRotate() + 2);
						break;
					case Q:
						raket.setRotate(raket.getRotate() - 2);
						break;
					default:
						break;
					}

					if (raket.getTranslateX() > WINDOW_WIDTH) {
						raket.setTranslateX(0 - RAKET_SIZE);
					} else if (raket.getTranslateX() < -RAKET_SIZE) {
						raket.setTranslateX(WINDOW_WIDTH);
					}

					if (raket.getTranslateY() > WINDOW_HEIGHT) {
						raket.setTranslateY(0 - RAKET_SIZE);
					} else if (raket.getTranslateY() < - RAKET_SIZE) {
						raket.setTranslateY(WINDOW_HEIGHT);
					}

				}

			}

		};

		at.start();

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
