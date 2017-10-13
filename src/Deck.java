import javax.imageio.ImageIO;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

//S=clubs,H=clubs,C=clubs,D=Diamond

public class Deck  {
    Card[] fullDeck = new Card[52]; // standard size of a deck




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
        fullDeck[0] = twoH;
        fullDeck[1] = threeH;
        fullDeck[2] = fourH;
        fullDeck[3] = fiveH;
        fullDeck[4] = sixH;
        fullDeck[5] = sevenH;
        fullDeck[6] = eightH;
        fullDeck[7] = nineH;
        fullDeck[8] = tenH;
        fullDeck[9] = JH;
        fullDeck[10] = QH;
        fullDeck[11] = KH;
        fullDeck[12] = AH;
        fullDeck[13] = twoS;
        fullDeck[14] = threeS;
        fullDeck[15] = fourS;
        fullDeck[16] = fiveS;
        fullDeck[17] = sixS;
        fullDeck[18] = sevenS;
        fullDeck[19] = eightS;
        fullDeck[20] = nineS;
        fullDeck[21] = tenS;
        fullDeck[22] = JS;
        fullDeck[23] = QS;
        fullDeck[24] = KS;
        fullDeck[25] = AS;
        fullDeck[26] = twoC;
        fullDeck[27] = threeC;
        fullDeck[28] = fourC;
        fullDeck[29] = fiveC;
        fullDeck[30] = sixC;
        fullDeck[31] = sevenC;
        fullDeck[32] = eightC;
        fullDeck[33] = nineC;
        fullDeck[34] = tenC;
        fullDeck[35] = JC;
        fullDeck[36] = QC;
        fullDeck[37] = KC;
        fullDeck[38] = AC;
        fullDeck[39] = twoD;
        fullDeck[40] = threeD;
        fullDeck[41] = fourD;
        fullDeck[42] = fiveD;
        fullDeck[43] = sixD;
        fullDeck[44] = sevenD;
        fullDeck[45] = eightD;
        fullDeck[46] = nineD;
        fullDeck[47] = tenD;
        fullDeck[48] = JD;
        fullDeck[49] = QD;
        fullDeck[50] = KD;
        fullDeck[51] = AD;
        shuffleDeck();
        findTrump();
        for (int print = 0; print < fullDeck.length; print++) {
            System.out.println(fullDeck[print] + " " + fullDeck[print].getCardValue());
        }

    }

    void shuffleDeck() {
        Random shuffle = new Random();
        for (int ii = 0; ii < 3; ii++) {
            for (int i = fullDeck.length - 1; i > 0; i--) {
                int index = shuffle.nextInt(i + 1);
                Card a = fullDeck[index];
                fullDeck[index] = fullDeck[i];
                fullDeck[i] = a;

            }
        }

    }

    void findTrump() {
        Random find = new Random();
        int whichTrump = find.nextInt(4) + 1;
        String suit = "";
        switch (whichTrump) {
            case 1:
                suit = "Hearts";
                break;
            case 2:
                suit = "Spades";
                break;
            case 3:
                suit = "Clubs";
                break;
            case 4:
                suit = "Diamonds";
                break;
        }
        System.out.println(suit);
        for ( int i = 0 ; i < fullDeck.length ; i++){
            if(fullDeck[i].getCardSuit().equals(suit)){
                fullDeck[i].setTrump(true);
                fullDeck[i].setCardValue(fullDeck[i].getCardValue() + 14);
            }
        }

    }
}
