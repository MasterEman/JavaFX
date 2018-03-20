import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class Raket extends Group {

	public double boost = 1;
	
	public Raket() {
		this(75);
	}

	public Raket(double width) {
	
		Polygon raket = new Polygon(0,0 , 20,10 , 50,10 , 70,20 , 50,30 , 20,30 , 0,40);

		this.getChildren().addAll(raket);

	}

	public void changeColor() {

		Color color = new Color(Math.random(), Math.random(), Math.random(), 1);

		for (int i = 0; i < this.getChildren().size(); i++) {
			Shape s = (Shape) this.getChildren().get(i);
			s.setFill(color);
		}

	}

	public void tuta() {
		System.out.println("Beep! Beep! Motherfucker!");
	}

	public void moveUp() {
		this.setTranslateY(this.getTranslateY() - 5);
	}

	public void moveDown() {
		this.setTranslateY(this.getTranslateY() + 5);
	}

	public void moveLeft() {
		double deg = this.getRotate();
		deg = Math.toRadians(deg);

		this.setTranslateY(this.getTranslateY() - Math.sin(deg) * 5*boost);
		this.setTranslateX(this.getTranslateX() - Math.cos(deg) * 5*boost);
	}

	public void moveRight() {
		double deg = this.getRotate();
		deg = Math.toRadians(deg);

		this.setTranslateY(this.getTranslateY() + Math.sin(deg) * 5*boost);
		this.setTranslateX(this.getTranslateX() + Math.cos(deg) * 5*boost);
	}

	public void boost() {
		boost = 3;
		
	}

	public void blackout() {
		
		for (int i = 0; i < this.getChildren().size(); i++) {
			Shape s = (Shape) this.getChildren().get(i);
			s.setFill(Color.BLACK);
		}
		
	}

}
