import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class mainCard extends Application {

	public static final double MARGIN = 10;
	public static final double WIDTH = Card.WIDTH + MARGIN;
	public static final double HEIGHT = Card.HEIGHT + MARGIN;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();


		Card card = new Card(1,14);
		root.getChildren().add(card);
		
		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.SKYBLUE);

		
		
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
