package com.example.sangeet.chatapplication.Services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.sangeet.chatapplication.Services.FireaseChatBackgroundService;

public class StartFireChatAtBoot extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context,FireaseChatBackgroundService.class));
    }
}