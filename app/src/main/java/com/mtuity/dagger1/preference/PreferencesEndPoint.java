package com.mtuity.dagger1.preference;

/**
 * Created by Ramesh on 23/12/15.
 */
public interface PreferencesEndPoint {

    void saveString(String key, String value);

    String getString(String key);

    void saveInt(String key, int value);

    int getInt(String key);

    void clear();

}
