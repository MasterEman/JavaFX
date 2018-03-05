import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFX extends Application {
	
	Scene scene;
	final double WIDTH = 600;
	final double HEIGHT = 600;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		scene = upg1();

		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public Scene upg1(){
		
		Group root1 = new Group();
		
		Scene scene = new Scene(root1,WIDTH,HEIGHT);
		
		Circle rect = new Circle(1,300, 300);
		rect.setTranslateX(WIDTH/2-rect.getStrokeWidth()/2);
		rect.setFill(Color.RED);
		
		root1.getChildren().add(rect);
	
		return scene;
	}
	

	public static void main(String[] args) {
		launch();
	}

}