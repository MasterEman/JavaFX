package Biluppgift;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Bil extends Group {

	public Bil() {
		this(75);
	}

	public Bil(double width) {

		Rectangle top = new Rectangle(2 * width / 3, width / 3);
		Rectangle bottom = new Rectangle(width, width / 3);
		bottom.setTranslateY(width / 3);

		Circle tire1 = new Circle(width / 7);
		Circle tire2 = new Circle(width / 7);

		tire1.setTranslateY(2 * width / 3);
		tire2.setTranslateY(2 * width / 3);

		tire1.setTranslateX(width / 5);
		tire2.setTranslateX(width - width / 5);

		this.getChildren().addAll(top, bottom, tire1, tire2);

	}

	public void changeColor() {

		Color color = new Color(Math.random(), Math.random(), Math.random(), 1);

		for (int i = 0; i < this.getChildren().size(); i++) {
			Shape s = (Shape) this.getChildren().get(i);
			s.setFill(color);
		}

	}

	public void tuta() {
		System.out.println("TUT");
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

		this.setTranslateY(this.getTranslateY() - Math.sin(deg) * 5);
		this.setTranslateX(this.getTranslateX() - Math.cos(deg) * 5);
	}

	public void moveRight() {
		double deg = this.getRotate();
		deg = Math.toRadians(deg);

		this.setTranslateY(this.getTranslateY() + Math.sin(deg) * 5);
		this.setTranslateX(this.getTranslateX() + Math.cos(deg) * 5);
	}

}