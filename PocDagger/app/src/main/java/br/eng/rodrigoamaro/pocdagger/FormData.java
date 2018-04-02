package br.eng.rodrigoamaro.pocdagger;


import java.math.BigDecimal;

class FormData {
    private final BigDecimal mAlcoholPrice;
    private final BigDecimal mGasPrice;
    private final BigDecimal mPerformanceRate;

    public FormData(BigDecimal alcoholPrice,
                    BigDecimal gasPrice,
                    BigDecimal performanceRate) {

        mAlcoholPrice = alcoholPrice;
        mGasPrice = gasPrice;
        mPerformanceRate = performanceRate;
    }

    public BigDecimal getAlcoholPrice() {
        return mAlcoholPrice;
    }

    public BigDecimal getGasPrice() {
        return mGasPrice;
    }

    public BigDecimal getPerformanceRate() {
        return mPerformanceRate;
    }
}
