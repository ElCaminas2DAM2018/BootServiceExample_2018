package org.ieselcaminas.pmdm.bootserviceexample_2018;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class BootCompletedReceiver extends BroadcastReceiver {

    public BootCompletedReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
            Intent serviceIntent = new Intent(context, ServiceAfterBoot.class);
            if (Build.VERSION.SDK_INT >=26) {
                context.startForegroundService(serviceIntent);
            } else {
                context.startService(serviceIntent);
            }

        }
    }
}
