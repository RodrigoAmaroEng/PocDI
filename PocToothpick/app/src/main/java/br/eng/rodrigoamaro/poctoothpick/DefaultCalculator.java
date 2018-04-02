package br.eng.rodrigoamaro.poctoothpick;


import javax.inject.Inject;

public class DefaultCalculator implements Calculator {

    @Inject
    public DefaultCalculator() {
    }

    @Override
    public Fuel eval(FormData data) {
        if (data.getGasPrice().multiply(data.getPerformanceRate())
                .compareTo(data.getAlcoholPrice()) > 0) {
            return Fuel.ALCOHOL;
        } else {
            return Fuel.GAS;
        }
    }
}
