package CardGames;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Card extends Group {

	public static final double WIDTH = 100;
	public static final double HEIGHT = 200;

	String suit;
	int value;

	public Card(int suit, int value) {

		if (1 <= suit && suit <= 4) {
			if (suit == 1)
				this.suit = "Hearts";
			if (suit == 2)
				this.suit = "Spades";
			if (suit == 3)
				this.suit = "Diamonds";
			if (suit == 4)
				this.suit = "Clubs";
		}

		if (2 <= value && value <= 14) {
			this.value = value;
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

		Rectangle bg = new Rectangle(WIDTH, HEIGHT);
		bg.setFill(Color.WHITE);

		colorText.setTranslateX(WIDTH / 2 - colorText.getBoundsInLocal().getWidth() / 2);
		valueText.setTranslateX(WIDTH / 2 - valueText.getBoundsInLocal().getWidth() / 2);

		colorText.setTranslateY(HEIGHT / 3);
		valueText.setTranslateY(2 * HEIGHT / 3);

		this.getChildren().addAll(bg, colorText, valueText);
	}

}











