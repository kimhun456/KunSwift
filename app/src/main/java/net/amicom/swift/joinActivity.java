package net.amicom.swift;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


public class joinActivity extends Activity {


    EditText nameText;
    EditText idText;
    EditText pwText;
    EditText pw2Text;
    EditText emailText;

    Button joinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        nameText = (EditText) findViewById(R.id.nameJoinText);
        idText = (EditText) findViewById(R.id.idJoinText);
        pwText = (EditText) findViewById(R.id.pwJoinText);
        pw2Text = (EditText) findViewById(R.id.pw2JoinText);
        emailText = (EditText) findViewById(R.id.emailJoinText);

        joinButton = (Button) findViewById(R.id.joinButton);

        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User user = new User();
                user.name=nameText.getText().toString();
                user.id=idText.getText().toString();
                user.password=pwText.getText().toString();


                Log.d("Http Post Response:", "make user");

                makePostRequest(user);


            }
        });
    }


    private void makePostRequest(User user) {

        String url= "127.0.0.1";

        HttpClient httpClient = new DefaultHttpClient();
        // replace with your url
        HttpPost httpPost = new HttpPost(url);

        Log.d("Http Post Response:", "connect");

        //Post Data
        List<NameValuePair> nameValuePair = new ArrayList<NameValuePair>();
        nameValuePair.add(new BasicNameValuePair("name", user.name));
        nameValuePair.add(new BasicNameValuePair("id", user.id));
        nameValuePair.add(new BasicNameValuePair("password", user.password));


        //Encoding POST data
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair));
        } catch (UnsupportedEncodingException e) {
            // log exception
            e.printStackTrace();
        }

        //making POST request.
        try {
            HttpResponse response = httpClient.execute(httpPost);
            // write response to log
            Log.d("Http Post Response:", response.toString());
        } catch (ClientProtocolException e) {
            // Log exception
            e.printStackTrace();
        } catch (IOException e) {
            // Log exception
            e.printStackTrace();
        }

    }

}
