public class Deck {
   private Card[] cards;
    public Deck() {
        cards=new Card[52];
        int index=0;

        for(Card.Suit suit : Card.Suit.values()) {
            for(Card.Rank rank : Card.Rank.values()) {
                cards[index] = new Card(suit, rank);
                index++;
            }
        }
    }
public void print() {
	for (Card card : cards) {
		System.out.println(card.toString());
	}
}
}

 
