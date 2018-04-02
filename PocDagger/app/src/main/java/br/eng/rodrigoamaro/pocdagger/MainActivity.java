package br.eng.rodrigoamaro.pocdagger;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.hannesdorfmann.mosby3.mvp.MvpActivity;

import javax.inject.Inject;

public class MainActivity extends MvpActivity<MainViewContract, MainPresenter>
        implements MainViewContract {

    private EditText mAlcoholPrice;
    private EditText mGasPrice;
    private EditText mPerformanceRate;
    private TextView mResult;
    @Inject
    FormExtractor mExtractor;
    ActivityComponent activityComponent;

    private TextWatcher mRefreshWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            try {
                getPresenter().calculate(mExtractor.extract(mAlcoholPrice, mGasPrice, mPerformanceRate));
            } catch (IllegalStateException ex) {
                mResult.setText("Fill all data!");
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        activityComponent = DaggerActivityComponent.builder()
                .appComponent(FuelApp.appComponent)
                .build();
        activityComponent.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUp();
    }

    @NonNull
    @Override
    public MainPresenter createPresenter() {
        return activityComponent.presenter();
    }

    private void setUp() {
        mResult = findViewById(R.id.label_result);
        mAlcoholPrice = findViewById(R.id.edit_alcohol_price);
        mAlcoholPrice.addTextChangedListener(mRefreshWatcher);
        mGasPrice = findViewById(R.id.edit_gas_price);
        mGasPrice.addTextChangedListener(mRefreshWatcher);
        mPerformanceRate = findViewById(R.id.edit_performance_rate);
        mPerformanceRate.addTextChangedListener(mRefreshWatcher);
    }

    @Override
    public void showGasAsBestOption() {
        mResult.setText(R.string.fuel_gas);
    }

    @Override
    public void showAlcoholAsBestOption() {
        mResult.setText(R.string.fuel_alcohol);
    }
}
