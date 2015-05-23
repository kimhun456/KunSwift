package net.amicom.swift;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardArrayAdapter;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardListView;

public class ContainerActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        ArrayList<Card> cards = new ArrayList<Card>();

        //Create a Card
        Card card = new Card(ContainerActivity.this);

        //Create a CardHeader
        CardHeader header = new CardHeader(ContainerActivity.this);

        //Add Header to card
        card.addCardHeader(header);

        cards.add(card);
        cards.add(card);
        cards.add(card);
        cards.add(card);
        cards.add(card);
        cards.add(card);
        cards.add(card);
        cards.add(card);
        cards.add(card);

        CardArrayAdapter mCardArrayAdapter = new CardArrayAdapter(ContainerActivity.this, cards);

        CardListView listView = (CardListView) ContainerActivity.this.findViewById(R.id.myList);
        if (listView != null) {
            listView.setAdapter(mCardArrayAdapter);
        }

    }
}
