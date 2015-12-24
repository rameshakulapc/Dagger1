package com.mtuity.dagger1;

import android.app.Activity;

import com.mtuity.dagger1.utils.TestFactory;

import org.junit.Test;
import org.mockito.Mockito;

import javax.inject.Inject;

import static org.junit.Assert.assertNotNull;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Inject
    TestFactory testFactory;

    BaseApp baseApp= Mockito.mock(BaseApp.class);

    public ExampleUnitTest() {
        baseApp.onCreate();
        baseApp.inject(this);
    }

    @Test
    public void addition_isCorrect() throws Exception {
        assertNotNull(testFactory.newTest(new Activity()));
//        assertEquals(4, 2 + 2);
    }
}