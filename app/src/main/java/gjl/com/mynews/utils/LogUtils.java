package gjl.com.mynews.utils;

import android.util.Log;

/**
 * Created by ${郭金林} on ${2016.5.16}.
 */
public class LogUtils {
    private static boolean isDebug=true;
    public static void e(String TAG,String e){
        if (isDebug){
            Log.e(TAG,e);
        }
    }

    public static void d(String TAG,String d){
        if (isDebug){
            Log.d(TAG,d);
        }
    }



}
