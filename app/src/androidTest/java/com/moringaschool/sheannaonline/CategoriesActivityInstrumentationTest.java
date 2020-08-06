package com.moringaschool.sheannaonline;

import android.view.View;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.core.IsNot.not;

@RunWith(AndroidJUnit4.class)
public class CategoriesActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<CategoriesActivity> activityActivityTestRule =
            new ActivityTestRule<>(CategoriesActivity.class);

    @Test
    public void listItemClickDisplaysToastWithCorrectRestaurant() {
        View activityDecorView = activityActivityTestRule.getActivity().getWindow().getDecorView();
        String categoryName = "Furniture";
        onData(anything())
                .inAdapterView(withId(R.id.listView))
                .atPosition(0)
                .perform(click());
        onView(withText(categoryName)).inRoot(withDecorView(not(activityDecorView)))
                .check(matches(withText(categoryName)));
    }
}
