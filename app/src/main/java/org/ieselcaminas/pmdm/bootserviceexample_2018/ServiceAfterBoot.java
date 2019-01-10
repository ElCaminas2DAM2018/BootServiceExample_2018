package org.ieselcaminas.pmdm.bootserviceexample_2018;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class ServiceAfterBoot extends Service {
    public ServiceAfterBoot() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service Started after boot", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }
}
