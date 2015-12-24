package com.mtuity.dagger1.utils;

import android.app.Activity;

import com.mtuity.dagger1.logger.Log;
import com.mtuity.dagger1.preference.PreferencesEndPoint;

/**
 * Created by Ramesh on 24/12/15.
 */
public class Test {
    final Log log;
    PreferencesEndPoint preferencesEndPoint;
    ToastFactory toastFactory;

    public Test(Activity activity, Log log, PreferencesEndPoint preferencesEndPoint, ToastFactory toastFactory) {
        this.log = log;
        this.preferencesEndPoint = preferencesEndPoint;
        this.toastFactory = toastFactory;
    }

    public void getBooks() {
        log.i("Test", "Get Books called!");
    }


}
