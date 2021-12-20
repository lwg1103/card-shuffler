package service.cardtrainer.shuffler.domain.deck;

import service.cardtrainer.shuffler.domain.card.Card;

import java.util.ArrayList;

public interface Deck
{
    public ArrayList<Card> cards();

    public Card drawCard(int position);

    public int deckSize();
}
