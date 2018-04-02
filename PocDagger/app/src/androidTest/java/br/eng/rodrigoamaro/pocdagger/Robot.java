package br.eng.rodrigoamaro.pocdagger;


import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

public class Robot {
    public static final String ALCOHOL_PRICE_INPUT = "AlcoholPriceInput";
    public static final String GAS_PRICE_INPUT = "GasPriceInput";
    public static final String PERFORMANCE_RATE_INPUT = "PerformanceRateInput";
    public static final String RESULT_LABEL = "ResultLabel";
    private final ActivityTestRule mRule;

    public Robot(ActivityTestRule rule) {
        mRule = rule;
    }

    public Robot launch() {
        mRule.launchActivity(new Intent());
        return this;
    }

    public Robot hasFieldInputsForGasPrice() {
        onView(withContentDescription(ALCOHOL_PRICE_INPUT))
                .check(matches(allOf(isDisplayed(), isEnabled())));
        onView(withContentDescription(GAS_PRICE_INPUT))
                .check(matches(allOf(isDisplayed(), isEnabled())));
        return this;
    }

    public Robot hasFieldInputForPerformance() {
        onView(withContentDescription(PERFORMANCE_RATE_INPUT))
                .check(matches(allOf(isDisplayed(), isEnabled())));
        return this;
    }

    public Robot hasResultLabel() {
        onView(withContentDescription(RESULT_LABEL)).check(matches(isDisplayed()));
        return this;
    }

    public Robot setAlcoholPriceAs(String price) {
        onView(withContentDescription(ALCOHOL_PRICE_INPUT)).perform(typeText(price));
        return this;
    }

    public Robot setGasPriceAs(String price) {
        onView(withContentDescription(GAS_PRICE_INPUT)).perform(typeText(price));
        return this;
    }

    public Robot setPerformanceRateAs(String rate) {
        onView(withContentDescription(PERFORMANCE_RATE_INPUT)).perform(typeText(rate));
        return this;
    }

    public Robot checkResultIsAlcohol() {
        onView(withContentDescription(RESULT_LABEL)).check(matches(withText("Alcohol")));
        return this;
    }

    public Robot checkResultIsGas() {
        onView(withContentDescription(RESULT_LABEL)).check(matches(withText("Gas")));
        return this;
    }
}
