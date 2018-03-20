import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Studsboll extends Circle{

	double angle = Math.random()*90+45;
	double speed = 12;
	
	double xspeed;
	double yspeed;
	
	Studsboll(){
		this.setRadius(Math.random()*25 + 25);
		
		int r = (int)(Math.random()*255);
		int g = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		
		this.setFill(Color.rgb(r, g, b, 1));
		
		this.setTranslateX(Math.random()*StudsbollStart.WIDTH);
		this.setRotate(angle);
	}

	public void update() {
		edges();
		fall();	
	}
	
	private void fall() {
		
		double deg = this.getRotate();
		deg = Math.toRadians(deg);

		this.yspeed = Math.sin(deg)*speed;
		this.xspeed = Math.cos(deg)*speed;
		
		this.setTranslateY(this.getTranslateY() + yspeed);
		this.setTranslateX(this.getTranslateX() + xspeed);
	}
	
	private void edges() {
		
		if (this.getTranslateY() > StudsbollStart.HEIGHT ) {
			this.setRotate(360-this.getRotate());
		}
		if (this.getTranslateY() < 0) {
			this.setRotate(360-this.getRotate());
		}
		
		if (this.getTranslateX() > StudsbollStart.WIDTH) {
			this.setRotate(180-this.getRotate());
		}

		if (this.getTranslateX() < 0) {
			this.setRotate(180-this.getRotate());
		} 
	}
}
