package br.eng.rodrigoamaro.pocdagger;


import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;

import javax.inject.Inject;

public class MainPresenter extends MvpBasePresenter<MainViewContract> {

    private final Calculator mCalculator;
    @Inject
    public MainPresenter(Calculator calculator) {
        mCalculator = calculator;
    }

    public void calculate(FormData formData) {
        switch (mCalculator.eval(formData)) {
            case GAS:
                getView().showGasAsBestOption();
                break;
            case ALCOHOL:
                getView().showAlcoholAsBestOption();
                break;
        }
    }
}
