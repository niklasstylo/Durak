import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Card {

    private int cardValue;
    private String cardName;
    private String cardSuit;
    private BufferedImage cardImage;

    /**
     * Constructor for card class
     * @param value = 2,3,4,5,....,10,11,12,13,14
     * @param name = 2,3,4,5,....,10,J,Q,K,A
     * @param suit = hearts, clubs, spades, diamonds
     * @param image = image of the card
     */

    public Card(String name, String suit, int value, BufferedImage image) {
        this.cardValue = value;
        this.cardName = name;
        this.cardSuit = suit;
        this.cardImage = image;
    }

    /**
     * overriding method toString
     * @return = returns name and sign of card
     */

    @Override
    public String toString() {
        return cardName + " of " + cardSuit;
    }

    /**
     * gets the value of the card 2,3,4,5,...,10,11,12,13,14
     * @return = returns value of the card
     */

    public int getCardValue() {
        return cardValue;
    }

    public static void main(String[] args) throws IOException {

        Card two_of_hearts = new Card("Two","Hearts", 2, ImageIO.read(new File("2_of_hearts.png")));
        System.out.println(two_of_hearts.toString());
        System.out.println("cardvalue: " + two_of_hearts.getCardValue());

    }


}
