package service.cardtrainer.shuffler.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.cardtrainer.shuffler.domain.card.Card;
import service.cardtrainer.shuffler.domain.card.Color;
import service.cardtrainer.shuffler.domain.card.Figure;
import service.cardtrainer.shuffler.domain.deck.Deck;
import service.cardtrainer.shuffler.domain.shuttler.Shuttler;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class ShufflerController
{
    @Autowired
    private Shuttler shuttler;

    @GetMapping(path = "/draw/{count}", produces = "application/json")
    public ArrayList<Card> drawCards(@PathVariable int count) {
        ArrayList<Card> cards = new ArrayList<>();

        for (int i = 0; i<count; i++) {
            cards.add(shuttler.drawRandomCard());
        }

        return cards;
    }
}
