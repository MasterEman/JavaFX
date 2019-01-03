package CardGames;
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

		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.BLACK);
		
		CardDeck deck= new CardDeck();
			deck.shuffle();
			
			scene.setOnKeyPressed(event -> {
				
				root.getChildren().add(deck.draw());
				
			});
		
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
