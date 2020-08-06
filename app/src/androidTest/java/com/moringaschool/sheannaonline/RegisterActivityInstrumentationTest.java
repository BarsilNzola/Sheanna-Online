package com.moringaschool.sheannaonline;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class RegisterActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<RegisterActivity> activityActivityTestRule = new ActivityTestRule<>(RegisterActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.editTextName)).perform(typeText("Barsil Nzola"))
                .check(matches(withText("Barsil Nzola")));
    }
}
