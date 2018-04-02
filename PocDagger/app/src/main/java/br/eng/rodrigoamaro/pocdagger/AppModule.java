package br.eng.rodrigoamaro.pocdagger;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class AppModule {

    @Provides
    @Singleton
    public Calculator provideCalculator() {
        return new DefaultCalculator();
    }

    @Provides
    @Singleton
    public Extractor provideExtractor() {
        return new CommonExtractor();
    }

}
