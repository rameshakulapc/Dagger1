package com.mtuity.dagger1.utils;

import android.content.Context;
import android.widget.Toast;

import com.mtuity.dagger1.logger.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Ramesh on 23/12/15.
 */
@Singleton
public class ToastFactory {

    private final Context mContext;

    @Inject
    public ToastFactory(final Context context, final Log log) {
        mContext = context;
    }

    public void show(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }

    public void showLong(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();
    }
}
