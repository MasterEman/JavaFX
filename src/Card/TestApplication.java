package Card;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TestApplication extends Application {

	public static final double WIDTH = 780;
	public static final double HEIGHT = 440;
	
	public static void main(String[] args) {
 		launch();
 	}
 
 	@Override
 	public void start(Stage primaryStage) throws Exception {
 
 		Group root = new Group();
	
 		double margin = 10;
 		
 		for (int i = 0; i < 13; i++) {
 		
 			//int color = (int) (Math.random() * 4) + 1;
 			//int value = (int) (Math.random() * 13) + 2;
 			
 			Advanced_Card c = new Advanced_Card (3, i+2);
 			c.setTranslateX((i % 7) * (Advanced_Card.WIDTH + margin) + margin + (Advanced_Card.WIDTH/2 * (i/7)));
 			c.setTranslateY((i / 7) * (Advanced_Card.HEIGHT + margin) + margin);
 			
 			root.getChildren().add(c);
 			
 			}
 		
 		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.SKYBLUE);
 		 
 			
 		 		primaryStage.setScene(scene);
 		 		primaryStage.show();
 		}	
 	}