import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Card extends Group{

	String color;
	int value;
	int width = 100;
	int height = 300;
	
	public Card(int a, int b) {
		
		if (a == 1) {
			color = "Hjärter";
		}
		else if (a == 3) {
			color = "Spader";
		}
		else if (a == 4) {
			color = "Ruter";
		}
		else if (a == 2) {
			color = "Klöver";
		}
		
		if (b > 14 || b > 2) {
			value = 2;
		}
		
		if (2 >= b  && b <= 14) {
			value = b;
		}
		
		Text colorText = new Text();
		colorText.setText(color);
		
		Text valueText = new Text();
		valueText.setText(value+"");
		
		if (value <= 10) {
			valueText.setText(b+"");
		}
		else if (value == 11) {
			valueText.setText("J");
		}
		else if (value == 12) {
			valueText.setText("D");
		}
		else if (value == 13) {
			valueText.setText("K");
		}
		else if (value == 14) {
			valueText.setText("A");
		}

//-------------------------------------------------------------------------------------------------------

		Rectangle card = new Rectangle(width, height);
		card.setFill(Color.WHITE);
		
		colorText.setTranslateX(width/2 - 20);
		valueText.setTranslateX(width/2);
		
		colorText.setTranslateY(30);
		valueText.setTranslateY(70);

		this.getChildren().addAll(card, colorText, valueText);

//-------------------------------------------------------------------------------------------------------

		
	}
}











