package com.example.techtest;

import java.util.HashMap;

public class clevertapDefaultInstance {
    public static void pushProfile(HashMap<String, Object> profileUpdate) {
        profileUpdate = new HashMap<String, Object>();
        profileUpdate.put("Email", "dk+sid.pankaj@gmail.com");
        clevertapDefaultInstance.pushProfile(profileUpdate);
    }

    public static void pushEvent(String product_viewed, HashMap<String, Object> prodViewedAction) {
        prodViewedAction = new HashMap<String, Object>();
        prodViewedAction.put("Product Name", "CleverTap");
        prodViewedAction.put("Product ID", "1");
        prodViewedAction.put("Product Image", "https://d35fo82fjcw0y8.cloudfront.net/2018/07/26020307/customer-success-clevertap.jpg");
        clevertapDefaultInstance.pushEvent("Product viewed", prodViewedAction);
    }
}
