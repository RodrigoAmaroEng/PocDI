package br.eng.rodrigoamaro.pocdagger;


import android.widget.EditText;

import java.math.BigDecimal;

public interface Extractor {

    BigDecimal extractCurrency(EditText field);

    BigDecimal extractPercent(EditText field);

}
