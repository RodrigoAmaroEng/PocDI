package br.eng.rodrigoamaro.poctoothpick;


import com.hannesdorfmann.mosby3.mvp.MvpView;

public interface MainViewContract extends MvpView{
    void showGasAsBestOption();

    void showAlcoholAsBestOption();
}
