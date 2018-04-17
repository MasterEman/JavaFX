package Card;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Advanced_Card extends Group {

	public static final double WIDTH = 100;
	public static final double HEIGHT = 150;

	public String suit;
	public int value;

	public Advanced_Card(int suit, int value) throws Exception {

		if (1 <= suit && suit <= 4) {
			if (suit == 1)
				this.suit = "Hearts";
			if (suit == 2)
				this.suit = "Spades";
			if (suit == 3)
				this.suit = "Diamonds";
			if (suit == 4)
				this.suit = "Clubs";
		} else {
			throw new Exception("Wrong Card suit");
		}

		if (2 <= value && value <= 14) {
			this.value = value;
		} else {
			throw new Exception("Wrong Card value");
		}

		Text colorText = new Text();
		colorText.setText(this.suit);

		Text valueText = new Text();
		if (value == 11)
			valueText.setText("J");
		else if (value == 12)
			valueText.setText("Q");
		else if (value == 13)
			valueText.setText("K");
		else if (value == 14)
			valueText.setText("A");
		else
			valueText.setText(value + "");

		Rectangle background = new Rectangle(WIDTH, HEIGHT);
		background.setFill(Color.WHITE);
		background.setStroke(Color.BLACK);
		background.setStrokeWidth(5);
		
		

		colorText.setFont(new Font(20));
		valueText.setFont(new Font(50));

		colorText.setTranslateX(WIDTH / 2 - colorText.getBoundsInLocal().getWidth() / 2);
		valueText.setTranslateX(WIDTH / 2 - valueText.getBoundsInLocal().getWidth() / 2);

		colorText.setTranslateY(2 * HEIGHT / 3);
		valueText.setTranslateY(HEIGHT / 3);

		if (suit == 1) {
			colorText.setFill(Color.RED);
			valueText.setFill(Color.RED);
		} else if (suit == 3) {
			colorText.setFill(Color.BLUE);
			valueText.setFill(Color.BLUE);
		} else if (suit == 4) {
			colorText.setFill(Color.GREEN);
			valueText.setFill(Color.GREEN);
		}

		this.getChildren().addAll(background, colorText, valueText);

	}

}