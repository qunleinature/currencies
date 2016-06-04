package com.example.leiqun.currencies;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by leiqun on 16-6-4.
 */
public class PrefsMgr {
    private static SharedPreferences sSharedPreferences;

    public static void setString(Context context,String locale,String code) {
        sSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sSharedPreferences.edit();
        editor.putString(locale,code);
        editor.commit();
    }

    public static String grtString(Context context,String locale) {
        sSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sSharedPreferences.getString(locale,null);
    }
}
