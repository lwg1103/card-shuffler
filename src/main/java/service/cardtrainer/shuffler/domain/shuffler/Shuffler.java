package service.cardtrainer.shuffler.domain.shuffler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.cardtrainer.shuffler.domain.card.Card;
import service.cardtrainer.shuffler.domain.deck.Deck;

@Component
public class Shuffler
{
    private final Deck deck;

    @Autowired
    public Shuffler(Deck deck)
    {
        this.deck = deck;
    }

    public Card drawRandomCard()
    {
        return deck.drawCard(getRandomNumber(deck.deckSize()));
    }

    public void shuffleDeck()
    {
        deck.reset();
    }

    private int getRandomNumber(int max) {
        return (int) (Math.random() * max);
    }
}
