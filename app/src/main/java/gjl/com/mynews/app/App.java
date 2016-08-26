package gjl.com.mynews.app;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;


/**
 * Created by ${郭金林} on ${2016.5.16}.
 */
public class App extends Application {
    //应用的请求key
    public static String APP_KEY="2f41498b35e69877fc56dc96776e5d1f";
    private static Context mContext;
    public static RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化

        inits();
    }

    private void inits() {
        mContext=getApplicationContext();
        //初始化Volley
        requestQueue = Volley.newRequestQueue(getApplicationContext());
    }
    //全局的上下文
    public static Context getContext(){
        return mContext;
    }
    //全局的handler
    public static Handler mHandler = new Handler();




}
