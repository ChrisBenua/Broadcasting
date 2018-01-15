package com.example.christian.cloudmessaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;


public class MyFIrebaseMessagingService extends FirebaseMessagingService {
    public MyFIrebaseMessagingService() {
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getData().size() > 0) {
            //broadcast
            ServerMessage serverMessage = new ServerMessage();
            Map<String, String> mp = remoteMessage.getData();
            int cmd = Integer.parseInt(mp.get("cmd"));
            int type = Integer.parseInt(mp.get("type"));
            int uid = Integer.parseInt(mp.get("uid"));
            String data = mp.get("data");
            Intent intent = new Intent();
            intent.setAction("com.example.broadcast.MY_NOTIFICATION");
            intent.putExtra("message", new ServerMessage(type, cmd, uid, data));
            sendBroadcast(intent);

        }
    }
}
