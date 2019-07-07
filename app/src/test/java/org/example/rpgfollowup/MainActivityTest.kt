package org.example.rpgfollowup

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat

@RunWith(RobolectricTestRunner::class)
//@Config(constants = BuildConfig::class)
class MainActivityTest{
    lateinit var main_activity:MainActivity;

    @Before
    fun init(){
        main_activity = Robolectric.setupActivity(MainActivity::class.java)
    }

    @Test
    fun mainActivityTextView_isPresent(){
        val textView = main_activity.findViewById<TextView>(R.id.textView)
        val stringValue = textView.text.toString()
        assertThat(stringValue,equalTo("Hola David!!"))
    }
}