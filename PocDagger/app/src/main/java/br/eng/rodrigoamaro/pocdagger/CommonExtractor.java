package br.eng.rodrigoamaro.pocdagger;

import android.widget.EditText;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CommonExtractor implements Extractor {
    @Override
    public BigDecimal extractCurrency(EditText field) {
        return new BigDecimal(field.getText().toString()).setScale(2, RoundingMode.UP);
    }

    @Override
    public BigDecimal extractPercent(EditText field) {
        return extractCurrency(field).divide(new BigDecimal(100), RoundingMode.UP);
    }
}
