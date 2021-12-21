package service.cardtrainer.shuffler.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.cardtrainer.shuffler.domain.card.Card;
import service.cardtrainer.shuffler.domain.shuffler.Shuffler;

import java.util.ArrayList;

@RestController
public class ShufflerController
{
    @Autowired
    private Shuffler shuffler;

    @GetMapping(path = "/draw/{count}", produces = "application/json")
    public ArrayList<Card> drawCards(@PathVariable int count) {
        ArrayList<Card> cards = new ArrayList<>();

        shuffler.shuffleDeck();
        for (int i = 0; i<count; i++) {
            cards.add(shuffler.drawRandomCard());
        }

        return cards;
    }
}
