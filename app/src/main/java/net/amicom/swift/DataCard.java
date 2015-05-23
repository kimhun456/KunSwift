package net.amicom.swift;

import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by amicom on 2015. 5. 23..
 */

//extends Card
public class DataCard {

    protected TextView mTitle;
    protected TextView mSecondaryTitle;
    protected RatingBar mRatingBar;

    /*
    public DataCard(Context context) {
        this(context, R.layout.carddemo_mycard_inner_content);
    }


    public DataCard(Context context, int innerLayout) {
        super(context, innerLayout);
        init();
    }

    private void init(){

        //No Header

        //Set a OnClickListener listener
        setOnClickListener(new OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Toast.makeText(getContext(), "Click Listener card=", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {

        //Retrieve elements
        mTitle = (TextView) parent.findViewById(R.id.carddemo_myapps_main_inner_title);
        mSecondaryTitle = (TextView) parent.findViewById(R.id.carddemo_myapps_main_inner_secondaryTitle);
        mRatingBar = (RatingBar) parent.findViewById(R.id.carddemo_myapps_main_inner_ratingBar);


        if (mTitle!=null)
            mTitle.setText(R.string.demo_custom_card_google_maps);

        if (mSecondaryTitle!=null)
            mSecondaryTitle.setText(R.string.demo_custom_card_googleinc);

        if (mRatingBar!=null)
            mRatingBar.setNumStars(5);
        mRatingBar.setMax(5);
        mRatingBar.setRating(4.7f);

    }
    */

}
