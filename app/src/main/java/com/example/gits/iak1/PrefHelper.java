package com.example.gits.iak1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by gits on 11/13/16.
 */

public class PrefHelper {
    public static final String HASIL = "HASIL";
    public static final String BOLEAN = "BOLEAN";
    public static SharedPreferences getPref(Context context) {
      return PreferenceManager.getDefaultSharedPreferences(context);
    }
    public static void saveNilaiHasil(Context context, int hasil){
       getPref(context).edit().putInt(HASIL, hasil ).commit();
   }
    public static int getNilaiHasil(Context context) {
       return getPref(context).getInt(HASIL, 0);
    }
    public static void saveNilaiBol(Context context, boolean hasil){
        getPref(context).edit().putBoolean(BOLEAN, hasil ).commit();
    }
    public static boolean getNilaiBol(Context context) {
        return getPref(context).getBoolean(BOLEAN, true);
    }

    public static void clear(Context context) {
        SharedPreferences.Editor editor;
        editor = getPref(context).edit();
        editor.clear();
        editor.commit();
    }







//    private static final String PREF_BIRTHYEAR2 = "PREF_BIRTHYEAR2";
//    public static SharedPreferences getPref(Context context) {
//        return PreferenceManager.getDefaultSharedPreferences(context);
//    }
//    public static void saveQuizTotal(Context context, int quiz){
//        getPref(context).edit().putInt(PREF_QUIZ_TOTAL, quiz ).commit();
//    }
//    public static int getQuizFinishTubuhku(Context context) {
//        return getPref(context).getInt(PREF_QUIZ_TUBUHKU, 0);
//    }
}
