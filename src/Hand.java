/**
 * drawCard()
 * Game starts, Player draws 6 cards by default
 * When Turn ends and less than 6 cards draw until cards in hand  = 6 (cardsInhHand.size() == 6 )
 * playCard()
 * call play when myTurn = true
 */

import java.util.List;

public class Hand {

    private List<Card> cardsInHand;
    private boolean myTurn;
    private boolean needToDraw;
}
