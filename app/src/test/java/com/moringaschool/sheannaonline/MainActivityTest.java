package com.moringaschool.sheannaonline;

import android.content.Intent;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.TestCase.assertTrue;


@RunWith(RobolectricTestRunner.class)

public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void validateTextViewContent(){
        TextView textViewTitle = activity.findViewById(R.id.textViewTitle);
        assertTrue("Sheana Online".equals(textViewTitle.getText().toString()));
    }

    @Test
    public void secondActivityStarted(){
        activity.findViewById(R.id.getStartedButton).performClick();
        Intent expectedIntent = new Intent(activity, CategoriesActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));
    }
}
