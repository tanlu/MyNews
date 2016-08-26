package gjl.com.mynews.https.https;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import gjl.com.mynews.app.App;
import gjl.com.mynews.utils.LogUtils;

/**
 * Created by ${郭金林} on ${2016.5.16}.
 */
public  class MyHttpUtil {

    private static final String TAG = "HttpUtil--->";
    private static String back=null;
    public static final int REQUEST_SUCCESSS=0;
    public static final int REQUEST_FAILED=1;
    //使用Volley请求，返回字符串
    public  static String loadString( String url) {
        LogUtils.e(TAG,url);
        final String[] STRING_STR = {""};
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                back= response;
                LogUtils.e(TAG, response);

            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                LogUtils.e(TAG, error.getMessage());

            }
        });
        App.requestQueue.add(stringRequest);
        App.requestQueue.start();
        return back;
    }
}
