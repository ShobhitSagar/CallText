package com.example.shobhitsagar.calltogglewifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class InterceptCall extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
         try {
             String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
             if (state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_RINGING)) {
                 Toast.makeText(context, "SIR, Someone is Calling you!", Toast.LENGTH_LONG).show();
             }
             if (state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                 Toast.makeText(context, "Recieved!", Toast.LENGTH_SHORT).show();
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
}
