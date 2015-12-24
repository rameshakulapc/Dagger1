package com.mtuity.dagger1.preference;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ramesh on 23/12/15.
 */
public class PreferenceEndPointImpl implements PreferencesEndPoint {

    final SharedPreferences prefs;

    public PreferenceEndPointImpl(final Context context, final String name) {
        prefs = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    @Override
    public void saveString(String key, String value) {
        prefs.edit().putString(key, value).commit();
    }

    @Override
    public String getString(String key) {
        return prefs.getString(key, null);
    }

    @Override
    public void saveInt(String key, int value) {
        prefs.edit().putInt(key, value).commit();
    }

    @Override
    public int getInt(String key) {
        return prefs.getInt(key, 0);
    }

    @Override
    public void clear() {
        prefs.edit().clear().commit();
    }
}
