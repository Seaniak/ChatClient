package com.company;

import java.io.Serializable;

public class chatRoomIDMessage implements Serializable {
    private String chatRoomID;
    private User user;

    public chatRoomIDMessage (String chatRoomID,User user){
        this.user = user;
        this.chatRoomID = chatRoomID;
    }

    public User getUser(){
        return user;
    }

    public String getChatRoomID(){
        return chatRoomID;
    }


}
