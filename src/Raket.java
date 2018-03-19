import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Raket extends Group {

	public Raket() {
		this(75);
	}

	public Raket(double width) {

		Rectangle bottom = new Rectangle(2 * width / 3, width / 3);
		Polygon top = new Polygon(0,0, 0,30 , 30,15);
		bottom.setTranslateY(width / 28);
		top.setTranslateX(50);

		this.getChildren().addAll(bottom);
		this.getChildren().addAll(top);


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
