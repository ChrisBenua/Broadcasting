package com.example.christian.cloudmessaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Christian on 15/01/18.
 */

public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("lel", intent.getStringExtra("message"));


    }

    static public ServerMessage parse(String s) {
        s = s.substring(1, s.length() - 1);
        int ind = s.indexOf("type");
        char res = s.charAt(ind + 5);
        int type = res - '0';
        ind = s.indexOf("cmd");
        String lel = "";
        for (int i = ind + 4; i < s.length() && s.charAt(i) != ',' && s.charAt(i) != '}'; ++i) {
            lel += s.charAt(i);
        }
        int cmd = Integer.parseInt(lel);
        String data = "";
        ind = s.indexOf("data");
        for (int i = ind +5; i < s.length() && s.charAt(i) != ',' && s.charAt(i) != '}'; ++i) {
            data += s.charAt(i);
        }

        String Uid = "";
        ind = s.indexOf("uid");
        for (int i = ind + 4; i < s.length() && s.charAt(i) != ',' && s.charAt(i) != '}'; ++i) {
            Uid += s.charAt(i);
        }

        int uid = Integer.parseInt(Uid);
        Log.d("KEK", type + " " + cmd + " " + uid + " " + data);
        return new ServerMessage(type, cmd, uid, data);
    }
}
