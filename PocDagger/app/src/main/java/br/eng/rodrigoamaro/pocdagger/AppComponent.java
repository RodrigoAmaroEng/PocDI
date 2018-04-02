package br.eng.rodrigoamaro.pocdagger;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    Extractor extractor();

    Calculator calculator();

}
