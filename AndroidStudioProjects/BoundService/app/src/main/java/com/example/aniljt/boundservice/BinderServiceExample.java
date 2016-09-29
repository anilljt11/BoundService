package com.example.aniljt.boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

public class BinderServiceExample extends Service {

    private final IBinder mBinder = new InnerBinder();
    private final Random mGenerator = new Random();
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public class InnerBinder extends Binder{

        BinderServiceExample getBinderServiceExample(){
            return BinderServiceExample.this;
        }
    }
    public int getRandomNumber() {
        return mGenerator.nextInt(100);
    }

}
