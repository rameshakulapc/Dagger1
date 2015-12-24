package com.mtuity.dagger1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mtuity.dagger1.logger.Log;
import com.mtuity.dagger1.preference.PreferenceConstants;
import com.mtuity.dagger1.preference.PreferencesEndPoint;
import com.mtuity.dagger1.utils.Test;
import com.mtuity.dagger1.utils.TestFactory;
import com.mtuity.dagger1.utils.ToastFactory;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

public class MainActivity extends AppCompatActivity {

    @Inject
    Log mLog;

    @Inject
    Provider<Log> mLogProvider;


    @Inject
    ToastFactory mToastFactory;

    @Inject
    @Named(PreferenceConstants.LOGIN)
    PreferencesEndPoint loginEndPoint;

    @Inject
    TestFactory mTestFactory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BaseApp) getApplication()).inject(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mToastFactory.show("Replace with your own action");
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
        //
        mLogProvider.get();
        Test test = mTestFactory.newTest(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
