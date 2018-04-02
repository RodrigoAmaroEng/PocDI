package br.eng.rodrigoamaro.poctoothpick;

import toothpick.config.Module;


class AppModule extends Module {
    AppModule() {
        bind(Calculator.class).to(DefaultCalculator.class);
        bind(Extractor.class).toInstance(new CommonExtractor());
    }
}
