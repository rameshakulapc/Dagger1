package com.mtuity.dagger1.logger;

/**
 * Created by Ramesh on 23/12/15.
 */
public interface Log {
    void i(String tag, String message);

    void d(String tag, String message);

    void w(String tag, String message);

    void e(String tag, String message);

}
