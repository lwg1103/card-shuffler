package service.cardtrainer.shuffler.domain.card;

public enum Color
{
    CLUB("Club"),
    HEART("Heart"),
    SPADE("Spade"),
    DIAMOND("Diamond");

    public final String label;

    Color(String label) {
        this.label = label;
    }
}
