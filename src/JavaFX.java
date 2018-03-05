import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
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
	
	public Scene upg5() {
		
		Group root5 = new Group();
		Scene scene5 = new Scene(root5,WIDTH,HEIGHT);
		Rectangle rect = new Rectangle();
		
		scene5.setOnKeyPressed(event -> {
			KeyCode key = event.getCode();
			if (key == KeyCode.UP) {
			} else if (key == KeyCode.DOWN) {
			} else if (key == KeyCode.LEFT) {
			} else if (key == KeyCode.RIGHT) {	
			}
			
		});
		return scene5;
	}

	public static void main(String[] args) {
		launch();
	}

}