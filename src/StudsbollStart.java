import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StudsbollStart extends Application{

	ArrayList<Studsboll> balls	 = new ArrayList<Studsboll>();
	
	public static double WIDTH = 1000;

	public static double HEIGHT = WIDTH;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.BLACK);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		for (int i = 0; i < 50; i++) {
			balls.add(new Studsboll());
			root.getChildren().add(balls.get(i));
		}
		
		AnimationTimer at = new AnimationTimer() {
			
			@Override
			public void handle(long now) {

				for(Studsboll b : balls) {
					
					b.update();
					
				}
				
			}

		};
		
		at.start();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
