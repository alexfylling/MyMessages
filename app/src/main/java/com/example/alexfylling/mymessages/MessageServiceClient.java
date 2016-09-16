package com.example.alexfylling.mymessages;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexfylling on 16.09.2016.
 */

public class MessageServiceClient {
    private static MessageServiceClient INSTANCE;
    List<List<Message>> data;

    private MessageServiceClient(){
        data = new ArrayList<>();
    }

    public List<Message> getMessage(int index) {
        return data.get(index);
    }

    public static synchronized MessageServiceClient getINSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new MessageServiceClient();
        }
        return INSTANCE;
    }
}
