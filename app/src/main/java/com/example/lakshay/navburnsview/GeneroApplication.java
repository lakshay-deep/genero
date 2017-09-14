package com.example.lakshay.navburnsview;

import android.app.Application;

import com.onesignal.OneSignal;

/**
 * Created by Lakshay on 6/13/2017.
 */

public class GeneroApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.DEBUG, OneSignal.LOG_LEVEL.DEBUG);
    }
}
