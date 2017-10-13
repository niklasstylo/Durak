import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Card  {

    private int cardValue;
    private String cardName;
    private String cardSuit;
    private BufferedImage cardImage;
    private boolean isTrump;

    /**
     * Constructor for card class
     * @param value = 2,3,4,5,....,10,11,12,13,14
     * @param name = 2,3,4,5,....,10,J,Q,K,A
     * @param suit = hearts, clubs, spades, diamonds
     * @param image = image of the card
     */

    public Card(String name, String suit, int value, BufferedImage image, boolean isTrump) {
        this.cardValue = value;
        this.cardName = name;
        this.cardSuit = suit;
        this.cardImage = image;
        this.isTrump = isTrump;
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

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }

    public BufferedImage getCardImage() {
        return cardImage;
    }

    public void setCardImage(BufferedImage cardImage) {
        this.cardImage = cardImage;
    }

    public boolean isTrump() {
        return isTrump;
    }

    public void setTrump(boolean trump) {
        isTrump = trump;
    }







}
