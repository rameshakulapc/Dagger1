package com.mtuity.dagger1;

import android.content.Context;

import com.mtuity.dagger1.utils.TestFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                BaseApp.class,
                MainActivity.class,
                TestFactory.class,
        },
        includes = {
                DemoModule.class,
        }
)
public class AppModule {

    private BaseApp app;

    public AppModule(BaseApp app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return app;
    }
}