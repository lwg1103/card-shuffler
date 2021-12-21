package service.cardtrainer.shuffler.domain.deck;

import org.springframework.stereotype.Component;
import service.cardtrainer.shuffler.domain.card.Card;
import service.cardtrainer.shuffler.domain.card.Color;
import service.cardtrainer.shuffler.domain.card.Figure;

import java.util.ArrayList;

@Component
public class FullDeck implements Deck
{
    private ArrayList<Card> cards;

    public FullDeck()
    {
        reset();
    }

    @Override
    public ArrayList<Card> cards()
    {
        return cards;
    }

    @Override
    public Card drawCard(int position)
    {
        try {
            return cards.remove(position);
        } catch ( IndexOutOfBoundsException e) {
            throw new InvalidCardPositionException();
        }
    }

    @Override
    public int deckSize()
    {
        return cards.size();
    }

    @Override
    public void reset()
    {
        cards = new ArrayList<>();

        for (Color color : Color.values()) {
            for (Figure figure : Figure.values()) {
                cards.add(new Card(figure, color));
            }
        }
    }
}
