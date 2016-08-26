package gjl.com.mynews.activites;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import gjl.com.mynews.R;
import gjl.com.mynews.https.https.Url;

import static gjl.com.mynews.https.https.MyHttpUtil.REQUEST_FAILED;
import static gjl.com.mynews.https.https.MyHttpUtil.REQUEST_SUCCESSS;
import static gjl.com.mynews.https.https.MyHttpUtil.loadString;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //请求网络
//        new Thread(){
//            @Override
//            public void run() {
                loadString(Url.CAIJING_NEWS_URL);
//            }
//        }.start();



    }



    static Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case REQUEST_SUCCESSS:
                    String str= (String) msg.obj;
                    Log.d(TAG, "handleMessage() returned: " + str);
                    break;

                case REQUEST_FAILED:

                    break;
            }
        }
    };
}
