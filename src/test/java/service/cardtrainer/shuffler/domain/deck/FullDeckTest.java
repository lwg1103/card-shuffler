package service.cardtrainer.shuffler.domain.deck;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.cardtrainer.shuffler.domain.card.Card;
import service.cardtrainer.shuffler.domain.deck.FullDeck;

import static org.junit.jupiter.api.Assertions.*;

class FullDeckTest
{
    final int STARTING_DECK_SIZE = 52;

    private FullDeck testSubject;

    @Test
    public void itContainsFullDeck()
    {
        assertEquals(STARTING_DECK_SIZE, testSubject.cards().size());
    }

    @Test
    public void itReturnsDeckSize()
    {
        assertEquals(STARTING_DECK_SIZE, testSubject.deckSize());
        assertEquals(testSubject.cards().size(), testSubject.deckSize());
    }

    @Test
    public void itDrawOneCard()
    {
        assertInstanceOf(Card.class, testSubject.drawCard(7));
    }

    @Test
    public void itRemovesDrawCardFromDeck()
    {
        testSubject.drawCard(7);
        assertEquals(STARTING_DECK_SIZE - 1, testSubject.deckSize());
    }

    public void itThrowsExceptionIfPositionOutOfBounds()
    {
    }

    @BeforeEach
    void setUp()
    {
        testSubject = new FullDeck();
    }
}