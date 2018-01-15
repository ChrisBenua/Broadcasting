package com.example.christian.cloudmessaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseApp.initializeApp(this);

       // ServerMessage a = new ServerMessage();
        //Map<String, String> mp = new HashMap<>();
        //mp.put("kek", "lol");
        //Log.d("lel", mp.toString());
        FirebaseInstanceId kek = FirebaseInstanceId.getInstance();
        Log.d("token", kek.getToken());
        //a = ServerMessage.convertFromJson("{ \"type\": 0, \"cmd\": 0, \"uid\": 2, \"data\": \"\" }");
        //Log.d("kek",a.getUid() + " " + a.getCmd() + " " + a.getType() + " " + a.getData());
    }
}
