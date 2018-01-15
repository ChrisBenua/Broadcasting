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
        final ServerMessage[] serverMessage = new ServerMessage[1];
        FirebaseApp.initializeApp(this);
        MyBroadCastReceiver.setCallback(new MyBroadCastReceiver.OnMessageReceived() {
            @Override
            public void onMessageReceived(ServerMessage s) {
                serverMessage[0] = s;
            }
        });
        //String s= "{type=1, cmd=0, uid=0, data=obamachmo}";
       // MyBroadCastReceiver.parse(s);
       // ServerMessage a = new ServerMessage();
        //Map<String, String> mp = new HashMap<>();
        //mp.put("kek", "lol");
        //Log.d("lel", mp.toString());
        //FirebaseInstanceId kek = FirebaseInstanceId.getInstance();
        //Log.d("token", kek.getToken());
        //a = ServerMessage.convertFromJson("{ \"type\": 0, \"cmd\": 0, \"uid\": 2, \"data\": \"\" }");
        //Log.d("kek",a.getUid() + " " + a.getCmd() + " " + a.getType() + " " + a.getData());
    }
}
