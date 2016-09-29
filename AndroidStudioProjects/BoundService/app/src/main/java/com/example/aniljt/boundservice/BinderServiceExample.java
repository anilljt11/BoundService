package com.example.aniljt.boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BinderServiceExample extends Service {
    public BinderServiceExample() {
    }

    @Override
    public IBinder onBind(Intent intent) {
          throw new UnsupportedOperationException("Not yet implemented");
    }
}
