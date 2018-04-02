package br.eng.rodrigoamaro.poctoothpick;


import android.widget.EditText;

import java.math.BigDecimal;

public interface Extractor {

    BigDecimal extractCurrency(EditText field);

    BigDecimal extractPercent(EditText field);

}
