package com.agontuk.RNFusedLocation;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.GoogleApiAvailability;
import com.newrelic.agent.android.agentdata.HexAttribute;

/* compiled from: LocationUtils */
public class a {
    public static WritableMap a(int i11, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", i11);
        if (str != null) {
            createMap.putString(HexAttribute.HEX_ATTR_MESSAGE, str);
        }
        return createMap;
    }

    public static boolean b(Context context) {
        return androidx.core.content.a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || androidx.core.content.a.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public static boolean c(Context context) {
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        return isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 18;
    }

    public static boolean d(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    public static boolean e(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static boolean f(Context context, String str) {
        try {
            return ((LocationManager) context.getSystemService("location")).isProviderEnabled(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static WritableMap g(Location location) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("latitude", location.getLatitude());
        createMap2.putDouble("longitude", location.getLongitude());
        createMap2.putDouble("altitude", location.getAltitude());
        createMap2.putDouble("accuracy", (double) location.getAccuracy());
        createMap2.putDouble("heading", (double) location.getBearing());
        createMap2.putDouble("speed", (double) location.getSpeed());
        createMap.putMap("coords", createMap2);
        createMap.putDouble("timestamp", (double) location.getTime());
        createMap.putBoolean("mocked", location.isFromMockProvider());
        return createMap;
    }
}
