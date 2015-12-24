package com.mtuity.dagger1.utils;

import android.app.Activity;

import com.mtuity.dagger1.logger.Log;
import com.mtuity.dagger1.preference.PreferenceConstants;
import com.mtuity.dagger1.preference.PreferencesEndPoint;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Ramesh on 24/12/15.
 */
//Factory pattern
public class TestFactory {

    @Inject
    Log log;
    @Inject
    @Named(PreferenceConstants.CONFIG)
    PreferencesEndPoint preferencesEndPoint;
    @Inject
    ToastFactory toastFactory;

    @Inject
    public TestFactory() {

    }

    /**
     * @param activity
     * @return
     */
    public Test newTest(Activity activity) {
        return new Test(activity, log, preferencesEndPoint, toastFactory);
    }

}
