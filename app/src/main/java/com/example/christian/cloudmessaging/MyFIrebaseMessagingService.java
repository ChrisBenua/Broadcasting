package com.example.christian.cloudmessaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFIrebaseMessagingService extends FirebaseMessagingService {
    public MyFIrebaseMessagingService() {
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getData().size() > 0) {
            //broadcast
            Intent intent = new Intent();
            intent.setAction("com.example.broadcast.MY_NOTIFICATION");
            intent.putExtra("message", remoteMessage.getData().toString());
            sendBroadcast(intent);

        }
    }
}
