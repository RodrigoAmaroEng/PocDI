package br.eng.rodrigoamaro.pocdagger;


import android.widget.EditText;

public interface FormExtractor {

    FormData extract(EditText alcoholField, EditText gasField, EditText performanceField);

}
