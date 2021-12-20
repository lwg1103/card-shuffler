package service.cardtrainer.shuffler.domain.shuttler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.cardtrainer.shuffler.domain.card.Card;
import service.cardtrainer.shuffler.domain.deck.Deck;

@Component
public class Shuttler
{
    private final Deck deck;

    @Autowired
    public Shuttler(Deck deck)
    {
        this.deck = deck;
    }

    public Card drawRandomCard()
    {
        return deck.drawCard(getRandomNumber(deck.deckSize()));
    }

    private int getRandomNumber(int max) {
        return (int) (Math.random() * max);
    }
}
