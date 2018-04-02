package br.eng.rodrigoamaro.poctoothpick;


import toothpick.config.Module;

public class ActivityModule extends Module {
    public ActivityModule() {
        bind(FormExtractor.class).to(BasicFormExtractor.class);
    }
}
