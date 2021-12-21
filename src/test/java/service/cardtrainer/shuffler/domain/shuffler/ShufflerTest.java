package service.cardtrainer.shuffler.domain.shuffler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.cardtrainer.shuffler.domain.card.Card;
import service.cardtrainer.shuffler.domain.deck.Deck;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

class ShufflerTest
{
    private Shuffler testSubject;
    private Deck deckMock;
    private Card cardMock;

    @Test
    public void itDrawsCardFromDeck()
    {
        assertEquals(cardMock, testSubject.drawRandomCard());
        verify(deckMock).drawCard(anyInt());
    }

    @Test
    public void itShuffleDeckOnDemand()
    {
        testSubject.shuffleDeck();
        verify(deckMock).reset();
    }

    @BeforeEach
    void setUp()
    {
        cardMock = mock(Card.class);
        deckMock = mock(Deck.class);
        when(deckMock.drawCard(anyInt())).thenReturn(cardMock);

        testSubject = new Shuffler(deckMock);
    }
}