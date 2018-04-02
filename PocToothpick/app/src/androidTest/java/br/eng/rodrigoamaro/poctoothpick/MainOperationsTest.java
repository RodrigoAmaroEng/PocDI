package br.eng.rodrigoamaro.poctoothpick;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainOperationsTest {

    @Rule
    public ActivityTestRule mRule = new ActivityTestRule<>(MainActivity.class, true,
            false);

    private Robot ROBOT = new Robot(mRule);

    @Test
    public void checkBasicInterface() throws Exception {
        ROBOT.launch()
                .hasFieldInputsForGasPrice()
                .hasFieldInputForPerformance()
                .hasResultLabel();
    }

    @Test
    public void tryBetterGoWithAlcohol() throws Exception {
        ROBOT.launch()
                .setAlcoholPriceAs("1")
                .setGasPriceAs("2")
                .setPerformanceRateAs("70")
                .checkResultIsAlcohol();
    }

    @Test
    public void tryBetterGoWithGas() throws Exception {
        ROBOT.launch()
                .setAlcoholPriceAs("4")
                .setGasPriceAs("5")
                .setPerformanceRateAs("70")
                .checkResultIsGas();
    }
    @Test
    public void tryBetterGoWithGasEventThoughItsSamePrice() throws Exception {
        ROBOT.launch()
                .setAlcoholPriceAs("7")
                .setGasPriceAs("10")
                .setPerformanceRateAs("70")
                .checkResultIsGas();
    }
}
