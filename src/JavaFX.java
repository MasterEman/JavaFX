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
	
	//---------------------------------------------------------------------------------------------------------
	
	public Scene upg2() {
		
		Group root2 = new Group();
		Scene scene = new Scene(root2,WIDTH,HEIGHT);
		
		for (int i = 0; i < 50; i++) {
			Circle circ = new Circle(scene.getWidth()*Math.random(),scene.getHeight()*Math.random(),10); 
			circ.setFill(Color.BLACK);
			root2.getChildren().add(circ);
		}
		
		return scene;
		
	}
	
	//---------------------------------------------------------------------------------------------------------
		
	public Scene upg3() {
	
		Group root3 = new Group();
		Scene scene = new Scene(root3,WIDTH,HEIGHT);
		
		
		
			return scene;

		}
	
	//---------------------------------------------------------------------------------------------------------

	public Scene upg5() {

		Group root5 = new Group();
		Scene scene5 = new Scene(root5, 500, 500);

		Rectangle rect = new Rectangle(scene5.getWidth()/2, scene5.getHeight()/2, 100, 50);
		rect.setFill(Color.BLACK);
		root5.getChildren().add(rect);
		
		scene5.setOnKeyPressed( event-> {

			if ( event.getCode() == KeyCode.W ) {
				rect.setTranslateY(rect.getTranslateY()-10);
			}
			if ( event.getCode() == KeyCode.D ) {
				rect.setTranslateX(rect.getTranslateX()+10);
			}
			if ( event.getCode() == KeyCode.A ) {
				rect.setTranslateX(rect.getTranslateX()-10);
			}
			if ( event.getCode() == KeyCode.S ) {
				rect.setTranslateY(rect.getTranslateY()+10);
			}

		});
		
		return scene5;

	}
}