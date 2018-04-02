package br.eng.rodrigoamaro.pocdagger;


import com.hannesdorfmann.mosby3.mvp.MvpView;

public interface MainViewContract extends MvpView{
    void showGasAsBestOption();

    void showAlcoholAsBestOption();
}
