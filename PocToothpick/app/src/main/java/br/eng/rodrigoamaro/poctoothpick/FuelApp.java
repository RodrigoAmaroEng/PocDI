package br.eng.rodrigoamaro.poctoothpick;


import android.app.Application;

import toothpick.Scope;
import toothpick.Toothpick;

public class FuelApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Scope appScope = Toothpick.openScope(this);
        appScope.installModules(new AppModule());
    }
}
