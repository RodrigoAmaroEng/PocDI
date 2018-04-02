package br.eng.rodrigoamaro.poctoothpick;


import android.widget.EditText;

import javax.inject.Inject;

public class BasicFormExtractor implements FormExtractor {

    private final Extractor mExtractor;

    @Inject
    public BasicFormExtractor(Extractor extractor) {
        mExtractor = extractor;
    }

    @Override
    public FormData extract(EditText alcoholField, EditText gasField, EditText performanceField) {
        if (alcoholField.getText().toString().isEmpty() ||
                gasField.getText().toString().isEmpty() ||
                performanceField.getText().toString().isEmpty()) {
            throw new IllegalStateException();
        }
        return new FormData(mExtractor.extractCurrency(alcoholField),
                mExtractor.extractCurrency(gasField),
                mExtractor.extractPercent(performanceField));
    }
}
