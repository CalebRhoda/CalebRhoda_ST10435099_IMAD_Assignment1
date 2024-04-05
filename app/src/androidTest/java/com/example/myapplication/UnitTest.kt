package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class UnitTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testInputAgeAndGenerateResult() {
        onView(withId(R.id.ageEditText)).perform(typeText("84"), closeSoftKeyboard())
        onView(withId(R.id.generateButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("You are the same age as Thomas Edison")))
    }

    @Test
    fun testClearButtonClearsText() {
        onView(withId(R.id.ageEditText)).perform(typeText("84"), closeSoftKeyboard())
        onView(withId(R.id.clearButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("")))
        onView(withId(R.id.ageEditText)).check(matches(withText("")))
    }

    @Test
    fun testInputAgeOutOfRange() {
        onView(withId(R.id.ageEditText)).perform(typeText("15"), closeSoftKeyboard())
        onView(withId(R.id.generateButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Not within range (Too small)")))
    }

    @Test
    fun testNoAgeEntered() {
        onView(withId(R.id.generateButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Please enter an age")))
    }
}
