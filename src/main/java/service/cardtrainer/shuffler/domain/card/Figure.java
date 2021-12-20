package service.cardtrainer.shuffler.domain.card;

public enum Figure
{
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    public final String label;

    Figure(String label) {
        this.label = label;
    }
}
