import javax.imageio.ImageIO;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//S=clubs,H=clubs,C=clubs,D=Diamond

public class Deck {
    Card[] fullDeck = new Card[52]; // standard size of a deck
    Card trump;
    void allCards()throws IOException {
        //TODO add all cards !!!!
        Card twoS = new Card("Two","Spades", 2, ImageIO.read(new File("2_of_spades.png")));
        Card threeS = new Card("Three","Spades", 3, ImageIO.read(new File("3_of_hearts.png")));
        Card fourS = new Card("Four","Spades", 4, ImageIO.read(new File("4_of_spades.png")));
        Card fiveS = new Card("Five","Spades", 5, ImageIO.read(new File("5_of_spades.png")));
        Card sixS = new Card("Six","Spades", 6, ImageIO.read(new File("6_of_spades.png")));
        Card sevenS = new Card("Seven","Spades", 7, ImageIO.read(new File("7_of_spades.png")));
        Card eightS = new Card("Eight","Spades", 8, ImageIO.read(new File("8_of_spades.png")));
        Card nineS = new Card("Nine","Spades", 9, ImageIO.read(new File("9_of_spades.png")));
        Card tenS = new Card("Ten","Spades", 10, ImageIO.read(new File("10_of_spades.png")));
        Card JS = new Card("Jack","Spades", 11, ImageIO.read(new File("jack_of_spades.png")));
        Card QS = new Card("Queen","Spades", 12, ImageIO.read(new File("queen_of_spades.png")));
        Card KS = new Card("King","Spades", 13, ImageIO.read(new File("king_of_spades.png")));
        Card AS = new Card("Ace","Spades", 14, ImageIO.read(new File("ace_of_spades.png")));
        Card twoH = new Card("Two","Hearts", 2, ImageIO.read(new File("2_of_hearts.png")));
        Card threeH = new Card("Three","Hearts", 3, ImageIO.read(new File("3_of_hearts.png")));
        Card fourH = new Card("Four","Hearts", 4, ImageIO.read(new File("4_of_hearts.png")));
        Card fiveH = new Card("Five","Hearts", 5, ImageIO.read(new File("5_of_hearts.png")));
        Card sixH = new Card("Six","Hearts", 6, ImageIO.read(new File("6_of_hearts.png")));
        Card sevenH = new Card("Seven","Hearts", 7, ImageIO.read(new File("7_of_hearts.png")));
        Card eightH = new Card("Eight","Hearts", 8, ImageIO.read(new File("8_of_hearts.png")));
        Card nineH = new Card("Nine","Hearts", 9, ImageIO.read(new File("9_of_hearts.png")));
        Card tenH = new Card("Ten","Hearts", 10, ImageIO.read(new File("10_of_hearts.png")));
        Card JH = new Card("Jack","Hearts", 11, ImageIO.read(new File("jack_of_hearts.png")));
        Card QH = new Card("Queen","Hearts", 12, ImageIO.read(new File("queen_of_hearts.png")));
        Card KH = new Card("King","Hearts", 13, ImageIO.read(new File("king_of_hearts.png")));
        Card AH = new Card("Ace","Hearts", 14, ImageIO.read(new File("ace_of_hearts.png")));
        Card twoC = new Card("Two","Clubs", 2, ImageIO.read(new File("2_of_clubs.png")));
        Card threeC = new Card("Three","Clubs", 3, ImageIO.read(new File("3_of_clubs.png")));
        Card fourC = new Card("Four","Clubs", 4, ImageIO.read(new File("4_of_clubs.png")));
        Card fiveC = new Card("Five","Clubs", 5, ImageIO.read(new File("5_of_clubs.png")));
        Card sixC = new Card("Six","Clubs", 6, ImageIO.read(new File("6_of_clubs.png")));
        Card sevenC = new Card("Seven","Clubs", 7, ImageIO.read(new File("7_of_clubs.png")));
        Card eightC = new Card("Eight","Clubs", 8, ImageIO.read(new File("8_of_clubs.png")));
        Card nineC = new Card("Nine","Clubs", 9, ImageIO.read(new File("9_of_clubs.png")));
        Card tenC = new Card("Ten","Clubs", 10, ImageIO.read(new File("10_of_clubs.png")));
        Card JC = new Card("Jack","Clubs", 11, ImageIO.read(new File("jack_of_clubs.png")));
        Card QC = new Card("Queen","Clubs", 12, ImageIO.read(new File("queen_of_clubs.png")));
        Card KC = new Card("King","Clubs", 13, ImageIO.read(new File("king_of_clubs.png")));
        Card AC = new Card("Ace","Clubs", 14, ImageIO.read(new File("ace_of_clubs.png")));
        Card twoD  = new Card("Two","Diamonds", 2, ImageIO.read(new File("2_of_diamonds.png")));
        Card threeD  = new Card("Three","Diamonds", 3, ImageIO.read(new File("3_of_diamonds.png")));
        Card fourD  = new Card("Four","Diamonds", 4, ImageIO.read(new File("4_of_diamonds.png")));
        Card fiveD  = new Card("Five","Diamonds", 5, ImageIO.read(new File("5_of_diamonds.png")));
        Card sixD  = new Card("Six","Diamonds", 6, ImageIO.read(new File("6_of_diamonds.png")));
        Card sevenD  = new Card("Seven","Diamonds", 7, ImageIO.read(new File("7_of_diamonds.png")));
        Card eightD  = new Card("Eight","Diamonds", 8, ImageIO.read(new File("8_of_diamonds.png")));
        Card nineD  = new Card("Nine","Diamonds", 9, ImageIO.read(new File("9_of_diamonds.png")));
        Card tenD  = new Card("Ten","Diamonds", 10, ImageIO.read(new File("10_of_diamonds.png")));
        Card JD  = new Card("Jack","Diamonds", 11, ImageIO.read(new File("jack_of_diamonds.png")));
        Card QD  = new Card("Queen","Diamonds", 12, ImageIO.read(new File("queen_of_diamonds.png")));
        Card KD  = new Card("King","Diamonds", 13, ImageIO.read(new File("king_of_diamonds.png")));
        Card AD  = new Card("Ace","Diamonds", 14, ImageIO.read(new File("ace_of_diamonds.png")));

    void shuffleDeck(){

    }
    void findTrump(){

    }

    }
}
