package br.eng.rodrigoamaro.pocdagger;


import android.app.Application;


public class FuelApp extends Application {

    public static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().build();
    }
}
