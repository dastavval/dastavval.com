package com.example.webviewapp;

import androidx.test.espresso.web.sugar.Web;
import androidx.test.espresso.web.webdriver.DriverAtoms;
import androidx.test.espresso.web.webdriver.Locator;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.web.assertion.WebViewAssertions.webMatches;
import static androidx.test.espresso.web.sugar.Web.onWebView;
import static androidx.test.espresso.web.webdriver.DriverAtoms.findElement;
import static androidx.test.espresso.web.webdriver.DriverAtoms.getText;
import static org.hamcrest.Matchers.containsString;

@RunWith(AndroidJUnit4.class)
public class WebViewActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testWebViewLoadsDastavval() {
        // Wait for the WebView to load the page and assert its content.
        // This example checks if the page body contains "دستاوال".
        onWebView()
                .withElement(findElement(Locator.TAG_NAME, "body")) // Find the body element
                .check(webMatches(getText(), containsString("دستاوال"))); // Check if its text contains "دستاوال"
    }
}
