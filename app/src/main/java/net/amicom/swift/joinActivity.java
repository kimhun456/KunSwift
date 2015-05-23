package net.amicom.swift;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;


public class joinActivity extends Activity {


    EditText nameText;
    EditText IDText;
    EditText pwText;
    EditText pw2Text;
    EditText emailText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
    }

}
