import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//S=clubs,H=clubs,C=clubs,D=Diamond

public class Deck {

    private List<Card> fullDeck = new ArrayList<>(52); // standard size of a deck

    void allCards() throws IOException {
        Card twoS = new Card("Two", "Spades", 2, ImageIO.read(new File("2_of_spades.png")), false);
        Card threeS = new Card("Three", "Spades", 3, ImageIO.read(new File("3_of_hearts.png")), false);
        Card fourS = new Card("Four", "Spades", 4, ImageIO.read(new File("4_of_spades.png")), false);
        Card fiveS = new Card("Five", "Spades", 5, ImageIO.read(new File("5_of_spades.png")), false);
        Card sixS = new Card("Six", "Spades", 6, ImageIO.read(new File("6_of_spades.png")), false);
        Card sevenS = new Card("Seven", "Spades", 7, ImageIO.read(new File("7_of_spades.png")), false);
        Card eightS = new Card("Eight", "Spades", 8, ImageIO.read(new File("8_of_spades.png")), false);
        Card nineS = new Card("Nine", "Spades", 9, ImageIO.read(new File("9_of_spades.png")), false);
        Card tenS = new Card("Ten", "Spades", 10, ImageIO.read(new File("10_of_spades.png")), false);
        Card JS = new Card("Jack", "Spades", 11, ImageIO.read(new File("jack_of_spades.png")), false);
        Card QS = new Card("Queen", "Spades", 12, ImageIO.read(new File("queen_of_spades.png")), false);
        Card KS = new Card("King", "Spades", 13, ImageIO.read(new File("king_of_spades.png")), false);
        Card AS = new Card("Ace", "Spades", 14, ImageIO.read(new File("ace_of_spades.png")), false);
        Card twoH = new Card("Two", "Hearts", 2, ImageIO.read(new File("2_of_hearts.png")), false);
        Card threeH = new Card("Three", "Hearts", 3, ImageIO.read(new File("3_of_hearts.png")), false);
        Card fourH = new Card("Four", "Hearts", 4, ImageIO.read(new File("4_of_hearts.png")), false);
        Card fiveH = new Card("Five", "Hearts", 5, ImageIO.read(new File("5_of_hearts.png")), false);
        Card sixH = new Card("Six", "Hearts", 6, ImageIO.read(new File("6_of_hearts.png")), false);
        Card sevenH = new Card("Seven", "Hearts", 7, ImageIO.read(new File("7_of_hearts.png")), false);
        Card eightH = new Card("Eight", "Hearts", 8, ImageIO.read(new File("8_of_hearts.png")), false);
        Card nineH = new Card("Nine", "Hearts", 9, ImageIO.read(new File("9_of_hearts.png")), false);
        Card tenH = new Card("Ten", "Hearts", 10, ImageIO.read(new File("10_of_hearts.png")), false);
        Card JH = new Card("Jack", "Hearts", 11, ImageIO.read(new File("jack_of_hearts.png")), false);
        Card QH = new Card("Queen", "Hearts", 12, ImageIO.read(new File("queen_of_hearts.png")), false);
        Card KH = new Card("King", "Hearts", 13, ImageIO.read(new File("king_of_hearts.png")), false);
        Card AH = new Card("Ace", "Hearts", 14, ImageIO.read(new File("ace_of_hearts.png")), false);
        Card twoC = new Card("Two", "Clubs", 2, ImageIO.read(new File("2_of_clubs.png")), false);
        Card threeC = new Card("Three", "Clubs", 3, ImageIO.read(new File("3_of_clubs.png")), false);
        Card fourC = new Card("Four", "Clubs", 4, ImageIO.read(new File("4_of_clubs.png")), false);
        Card fiveC = new Card("Five", "Clubs", 5, ImageIO.read(new File("5_of_clubs.png")), false);
        Card sixC = new Card("Six", "Clubs", 6, ImageIO.read(new File("6_of_clubs.png")), false);
        Card sevenC = new Card("Seven", "Clubs", 7, ImageIO.read(new File("7_of_clubs.png")), false);
        Card eightC = new Card("Eight", "Clubs", 8, ImageIO.read(new File("8_of_clubs.png")), false);
        Card nineC = new Card("Nine", "Clubs", 9, ImageIO.read(new File("9_of_clubs.png")), false);
        Card tenC = new Card("Ten", "Clubs", 10, ImageIO.read(new File("10_of_clubs.png")), false);
        Card JC = new Card("Jack", "Clubs", 11, ImageIO.read(new File("jack_of_clubs.png")), false);
        Card QC = new Card("Queen", "Clubs", 12, ImageIO.read(new File("queen_of_clubs.png")), false);
        Card KC = new Card("King", "Clubs", 13, ImageIO.read(new File("king_of_clubs.png")), false);
        Card AC = new Card("Ace", "Clubs", 14, ImageIO.read(new File("ace_of_clubs.png")), false);
        Card twoD = new Card("Two", "Diamonds", 2, ImageIO.read(new File("2_of_diamonds.png")), false);
        Card threeD = new Card("Three", "Diamonds", 3, ImageIO.read(new File("3_of_diamonds.png")), false);
        Card fourD = new Card("Four", "Diamonds", 4, ImageIO.read(new File("4_of_diamonds.png")), false);
        Card fiveD = new Card("Five", "Diamonds", 5, ImageIO.read(new File("5_of_diamonds.png")), false);
        Card sixD = new Card("Six", "Diamonds", 6, ImageIO.read(new File("6_of_diamonds.png")), false);
        Card sevenD = new Card("Seven", "Diamonds", 7, ImageIO.read(new File("7_of_diamonds.png")), false);
        Card eightD = new Card("Eight", "Diamonds", 8, ImageIO.read(new File("8_of_diamonds.png")), false);
        Card nineD = new Card("Nine", "Diamonds", 9, ImageIO.read(new File("9_of_diamonds.png")), false);
        Card tenD = new Card("Ten", "Diamonds", 10, ImageIO.read(new File("10_of_diamonds.png")), false);
        Card JD = new Card("Jack", "Diamonds", 11, ImageIO.read(new File("jack_of_diamonds.png")), false);
        Card QD = new Card("Queen", "Diamonds", 12, ImageIO.read(new File("queen_of_diamonds.png")), false);
        Card KD = new Card("King", "Diamonds", 13, ImageIO.read(new File("king_of_diamonds.png")), false);
        Card AD = new Card("Ace", "Diamonds", 14, ImageIO.read(new File("ace_of_diamonds.png")), false);

        fullDeck.add(twoH);
        fullDeck.add(threeH);
        fullDeck.add(fourH);
        fullDeck.add(fiveH);
        fullDeck.add(sixH);
        fullDeck.add(sevenH);
        fullDeck.add(eightH);
        fullDeck.add(nineH);
        fullDeck.add(tenH);
        fullDeck.add(JH);
        fullDeck.add(QH);
        fullDeck.add(KH);
        fullDeck.add(AH);
        fullDeck.add(twoS);
        fullDeck.add(threeS);
        fullDeck.add(fourS);
        fullDeck.add(fiveS);
        fullDeck.add(sixS);
        fullDeck.add(sevenS);
        fullDeck.add(eightS);
        fullDeck.add(nineS);
        fullDeck.add(tenS);
        fullDeck.add(JS);
        fullDeck.add(QS);
        fullDeck.add(KS);
        fullDeck.add(AS);
        fullDeck.add(twoC);
        fullDeck.add(threeC);
        fullDeck.add(fourC);
        fullDeck.add(fiveC);
        fullDeck.add(sixC);
        fullDeck.add(sevenC);
        fullDeck.add(eightC);
        fullDeck.add(nineC);
        fullDeck.add(tenC);
        fullDeck.add(JC);
        fullDeck.add(QC);
        fullDeck.add(KC);
        fullDeck.add(AC);
        fullDeck.add(twoD);
        fullDeck.add(threeD);
        fullDeck.add(fourD);
        fullDeck.add(fiveD);
        fullDeck.add(sixD);
        fullDeck.add(sevenD);
        fullDeck.add(eightD);
        fullDeck.add(nineD);
        fullDeck.add(tenD);
        fullDeck.add(JD);
        fullDeck.add(QD);
        fullDeck.add(KD);
        fullDeck.add(AD);

        shuffleDeck();
        findTrump();
        for (int i = 0; i < fullDeck.size(); i++) {
            System.out.println(fullDeck.get(i) + " --- Value: " + fullDeck.get(i).getCardValue());
        }


    }

    void shuffleDeck() {
        Random shuffle = new Random();

        for (int ii = 0; ii < 3; ii++) { // shuffles deck 3 times

            for (int i = fullDeck.size() - 1; i > 0; i--) {
                int index = shuffle.nextInt(i + 1);
                Card a = fullDeck.get(index);
                fullDeck.set(index, fullDeck.get(i));
                fullDeck.set(i, a);
            }

        }

    }

    void findTrump() {
        Random find = new Random();
        int whichTrump = find.nextInt(4) + 1;
        String trumpSuit = "";
        int count = 0;

        switch (whichTrump) {
            case 1:
                trumpSuit = "Hearts";
                break;
            case 2:
                trumpSuit = "Spades";
                break;
            case 3:
                trumpSuit = "Clubs";
                break;
            case 4:
                trumpSuit = "Diamonds";
                break;
        }

        System.out.println("Trump of this shuffle is: " + trumpSuit); // Testing //TODO remove

        for (int i = 0; i < fullDeck.size(); i++) {

            if (fullDeck.get(i).getCardSuit().equals(trumpSuit)) { // Find the Trump
                fullDeck.get(i).setTrump(true);
                fullDeck.get(i).setCardValue(fullDeck.get(i).getCardValue() + 14);
                count++;
                if (count == 1) { // Set the first trump found as the last card of Deck
                    Card switchARoo = fullDeck.get(51);
                    fullDeck.set(51, fullDeck.get(i));
                    fullDeck.set(i, switchARoo);

                }
            }
        }
    }

    public void setFullDeck(List<Card> fullDeck) {
        this.fullDeck = fullDeck;
    }

    public List<Card> getFullDeck() {
        return fullDeck;
    }

    public static void main(String[] args) throws IOException {
        new Deck().allCards();
    }


}
