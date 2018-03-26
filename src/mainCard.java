import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class mainCard extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		
		Card c = new Card(1,14);
		
		root.getChildren().add(c);
		Scene scene = new Scene(root, 500, 500, Color.BLACK);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
}
