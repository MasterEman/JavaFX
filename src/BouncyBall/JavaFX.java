package BouncyBall;
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
	
	public Scene upg4() {

		Group root4 = new Group();
		Scene scene4 = new Scene(root4, 1600, 1000, Color.GREEN);

		Rectangle rect1 = new Rectangle(0, 0, 500, 400);
		Rectangle rect2 = new Rectangle(0, scene4.getHeight()-400, 500, 400);
		Rectangle rect3 = new Rectangle(scene4.getWidth()-900, 0, 900, 400);
		Rectangle rect4 = new Rectangle(scene4.getWidth()-900, scene4.getHeight()-400, 900, 400);

		rect1.setFill(Color.GREEN);
		rect3.setFill(Color.GREEN);
		rect4.setFill(Color.GREEN);
		rect2.setFill(Color.GREEN);

		root4.getChildren().addAll(rect1,rect2,rect3,rect4);
		
		return scene4;
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

	//---------------------------------------------------------------------------------------------------------

	public Scene upg6() {

		Group root6 = new Group();
		Scene scene6 = new Scene(root6, 500, 500);

		int size = 50;

		Circle rect = new Circle(0, 0, size);

		rect.setTranslateX(scene6.getWidth()/2);
		rect.setTranslateY(scene6.getHeight()/2);

		scene6.setOnKeyPressed( event->{

			if ( event.getCode() == KeyCode.W && !(rect.getTranslateY() < 0)) {
				rect.setTranslateY(rect.getTranslateY()-15);
			}
			if ( event.getCode() == KeyCode.A && !(rect.getTranslateX() < 0)) {
				rect.setTranslateX(rect.getTranslateX()-15);
			}
			if ( event.getCode() == KeyCode.S && !(rect.getTranslateY() > scene6.getHeight()-size)) {
				rect.setTranslateY(rect.getTranslateY()+15);
			}
			if ( event.getCode() == KeyCode.D && !(rect.getTranslateX() > scene6.getWidth()-size)) {
				rect.setTranslateX(rect.getTranslateX()+15);
			}
		});

		root6.getChildren().add(rect);
		
		return scene6;
	  }
	}

	//---------------------------------------------------------------------------------------------------------



