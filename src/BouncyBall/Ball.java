package BouncyBall;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ball extends Application { 
    private BallControl circle = new BallControl();
    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox();
        pane.setSpacing(10);
        pane.setAlignment(Pos.CENTER);  
        Button btUp = new Button("UP");
        Button btDown = new Button("DOWN");
        Button btLeft = new Button("LEFT");
        Button btRight = new Button("RIGHT");

        pane.getChildren().add(btLeft);
        pane.getChildren().add(btRight);
        pane.getChildren().add(btUp);
        pane.getChildren().add(btDown);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circle);
        borderPane.setBottom(pane);
        BorderPane.setAlignment(pane, Pos.CENTER);

        btUp.setOnAction(new UpHandler());
        btDown.setOnAction(new DownHandler());
        btLeft.setOnAction(new LeftHandler());
        btRight.setOnAction(new RightHandler());

        Scene scene = new Scene(borderPane, 250, 250);      
        primaryStage.setTitle("Ball"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();

    }
        class UpHandler implements EventHandler<ActionEvent> {
            public void handle(ActionEvent e) {
              circle.up();
              System.out.println("Up Button Pressed");
            }
        }
        class DownHandler implements EventHandler<ActionEvent> {
            public void handle(ActionEvent e) {
                circle.down();
                System.out.println("Down Button Pressed");
            }
        }
        class LeftHandler implements EventHandler<ActionEvent> {
            public void handle(ActionEvent e) {
                circle.left();
                System.out.println("Left Button Pressed");
            }
        }
        class RightHandler implements EventHandler<ActionEvent> {
            public void handle(ActionEvent e) {
                circle.right();
                System.out.println("Right Button Pressed");
            }
        }

        public static void main(String[] args) {
            launch(args);
        }       
    }

class BallControl extends Pane {
      public final double radius = 20;
      private double x = radius, y = radius;
      private double dx = 1, dy = 1;
      private Circle circle = new Circle(); 

      public BallControl() {
        getChildren().add(circle);
        circle.setCenterX(125.0f);
        circle.setCenterY(115.0f);
        circle.setRadius(25.0f);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
      }

      protected void moveBall() {
        // Check boundaries
        if (x < radius || x > getWidth() - radius) {
          dx = 0; // Change ball move direction
        }
        if (y < radius || y > getHeight() - radius) {
          dy = 0; // Change ball move direction
        }

        // Adjust ball position
        x += dx;
        y += dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
      }   
      public void up() {
        circle.setCenterY(circle.getCenterY() - 10);
      }   
      public void down() {
        circle.setCenterY(circle.getCenterY() + 10);
      }
      public void left() {
        circle.setCenterX(circle.getCenterX() - 10);
      }       
      public void right() {
        circle.setCenterX(circle.getCenterX() + 10);
      }
      }