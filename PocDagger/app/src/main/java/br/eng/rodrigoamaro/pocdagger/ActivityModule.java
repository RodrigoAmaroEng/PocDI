package br.eng.rodrigoamaro.pocdagger;


import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    @ActivityScope
    @Provides
    public FormExtractor providesActivityModule(Extractor extractor) {
        return new BasicFormExtractor(extractor);
    }
}
