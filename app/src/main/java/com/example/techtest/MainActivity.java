package com.example.techtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.clevertap.android.sdk.CleverTapAPI;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final CleverTapAPI clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);

        HashMap<String, Object> profileUpdate = new HashMap<String, Object>();
        profileUpdate.put("Email", "dk+sid.pankaj@gmail.com");
        clevertapDefaultInstance.pushProfile(profileUpdate);

        HashMap<String, Object> prodViewedAction = new HashMap<String, Object>();
        prodViewedAction.put("Product Name", "CleverTap");
        prodViewedAction.put("Product ID", "1");
        prodViewedAction.put("Product Image", "https://d35fo82fjcw0y8.cloudfront.net/2018/07/26020307/customer-success-clevertap.jpg");
        clevertapDefaultInstance.pushEvent("Product viewed", prodViewedAction);
    }

    @Override
    public void onClick(View view) {
    }

}