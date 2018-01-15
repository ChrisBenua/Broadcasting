package com.example.christian.cloudmessaging;

import com.google.gson.Gson;

/**
 * Created by Christian on 15/01/18.
 */

public class ServerMessage {
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCmd() {
        return cmd;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private int type;
    private int cmd;
    private int uid;
    private String data;

    public ServerMessage(){};


    public ServerMessage(ServerMessage a) {
        this.type = a.type;
        this.uid = a.uid;
        this.data = a.data;
        this.cmd = a.cmd;
    }


    public ServerMessage(int type, int cmd, int uid, String data) {
        this.type = type;
        this.cmd = cmd;
        this.uid = uid;
        this.data = data;
    }


    static ServerMessage convertFromJson(String jsonQuery) {
        Gson gson = new Gson();
        return gson.fromJson(jsonQuery, ServerMessage.class);
    }

}
