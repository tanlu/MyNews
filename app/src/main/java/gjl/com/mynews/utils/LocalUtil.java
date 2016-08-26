package gjl.com.mynews.utils;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

import java.util.List;

/**
 * Created by ${郭金林} on ${2016.5.16}.
 */
public class LocalUtil {
    private static final String TAG = "LocalUtil";
    //变量
    private int time = 3000;//    间隔时间
    private int distance = 5;//间隔距离
    private String classic = LocationManager.GPS_PROVIDER;//定位类型
//    private MyLocationListener myLocationListener;

    //或Location
    public Location getLocation(Context context) {
//        myLocationListener = new MyLocationListener();
        //获取系统服务
        LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        //获取可用列表
        List<String> allProviders = locationManager.getAllProviders();
        //遍历是否包含Gps，net  基站等
        for (int i = 0; i < allProviders.size(); i++) {
            Log.d(TAG, "设备列表" + allProviders.get(i));
        }

        //由于用户可能一直在移动，所以来个监听
//        if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            // TODO: Consider calling
//            //    public void requestPermissions(@NonNull String[] permissions, int requestCode)
//            // here to request the missing permissions, and then overriding
//            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//            //                                          int[] grantResults)
//            // to handle the case where the user grants the permission. See the documentation
//            // for Activity#requestPermissions for more details.
//            return TODO;
//        }
//        locationManager.requestLocationUpdates(classic, time, distance, new LocationListener() {
//            @Override
//            public void onLocationChanged(Location location) {
//
//            }
//
//            @Override
//            public void onStatusChanged(String provider, int status, Bundle extras) {
//
//            }
//
//            @Override
//            public void onProviderEnabled(String provider) {
//
//            }
//
//            @Override
//            public void onProviderDisabled(String provider) {
//
//            }
//        });
        return null;
    }

//    //位置监听
//    class MyLocationListener implements LocationListener{
//
//        @Override
//        public void onLocationChanged(Location location) {
//
//        }
//
//        @Override
//        public void onStatusChanged(String provider, int status, Bundle extras) {
//
//        }
//
//        @Override
//        public void onProviderEnabled(String provider) {
//
//        }
//
//        @Override
//        public void onProviderDisabled(String provider) {
//
//        }
//    }
}
