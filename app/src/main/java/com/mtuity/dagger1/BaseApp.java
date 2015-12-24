package com.mtuity.dagger1;

import android.app.Application;

import dagger.ObjectGraph;

/**
 * Created by Ramesh on 23/12/15.
 */
public class BaseApp extends Application {

    private ObjectGraph objectGraph;
    @Override
    public void onCreate() {
        super.onCreate();
        injectDependencies();
    }
    private void injectDependencies() {
        objectGraph = ObjectGraph.create(new AppModule(this));
        objectGraph.inject(this);
    }

    public void inject(Object object) {
        objectGraph.inject(object);
    }
}
