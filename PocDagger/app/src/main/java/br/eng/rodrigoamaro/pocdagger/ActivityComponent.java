package br.eng.rodrigoamaro.pocdagger;

import dagger.Component;

@ActivityScope
@Component(modules = ActivityModule.class, dependencies = AppComponent.class)
public interface ActivityComponent extends AppComponent {

    void inject(MainActivity activity);

    MainPresenter presenter();

}
