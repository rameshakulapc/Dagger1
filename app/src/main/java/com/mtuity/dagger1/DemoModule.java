package com.mtuity.dagger1;

import android.content.Context;

import com.mtuity.dagger1.logger.DefaultLogImpl;
import com.mtuity.dagger1.logger.Log;
import com.mtuity.dagger1.preference.PreferenceConstants;
import com.mtuity.dagger1.preference.PreferenceEndPointImpl;
import com.mtuity.dagger1.preference.PreferencesEndPoint;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ramesh on 23/12/15.
 */
@Module(
        //some of the dependencies in this module need to be provided by another module
        complete = false,
        library = true
)
public class DemoModule {

    //Provide log object
    @Provides
    @Singleton
    public Log provideLog() {
        return new DefaultLogImpl();
    }
    //
    @Provides
    @Singleton
    @Named(PreferenceConstants.LOGIN)
    public PreferencesEndPoint provideLoginPreferencesEndPoint(final Context context) {
        return new PreferenceEndPointImpl(context, PreferenceConstants.LOGIN);
    }

    //
    @Provides
    @Singleton
    @Named(PreferenceConstants.CONFIG)
    public PreferencesEndPoint provideConfigPreferencesEndPoint(final Context context) {
        return new PreferenceEndPointImpl(context, PreferenceConstants.CONFIG);
    }
//    @Provides
//    @Singleton
//    public TestFactory provideLog(TestFactory testFactory) {
//        return testFactory;
//    }
}
