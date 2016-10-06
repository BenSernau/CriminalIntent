package com.bignerdranch.android.criminalintent;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.app.UiAutomation;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiAutomatorBridge;
import android.support.test.uiautomator.UiAutomatorInstrumentationTestRunner;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.getIdlingResources;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressMenuKey;
import static android.support.test.espresso.action.ViewActions.typeText;
import static
        android.support.test.espresso.assertion.ViewAssertions.matches;
import static
        android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static
        android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
@RunWith(AndroidJUnit4.class)

/**
 * Created by bsern on 10/5/2016.
 */
public class TestApplication {

    private String testString;
    @Rule
    public ActivityTestRule<CrimeListActivity> mActivityRule = new
            ActivityTestRule<>(CrimeListActivity.class);
    @Before
    public void initValidString() {
        // Specify a valid string.
        testString = "Test";
    }
    @Test
    public void runThroughTest(){
        onView(withId(R.id.crime_recycler_view)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.crime_title)).check(matches(withText(testString)));
        Espresso.pressBack();
        mActivityRule.getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        onView(withId(R.id.crime_recycler_view)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.crime_title)).check(matches(withText(testString)));
    }

}
