package com.agontuk.RNFusedLocation;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.g;
import com.google.android.gms.location.i;
import com.google.android.gms.location.j;
import com.google.android.gms.location.m;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class RNFusedLocationModule extends ReactContextBaseJavaModule {
    private static final float DEFAULT_DISTANCE_FILTER = 100.0f;
    private static final long DEFAULT_FASTEST_INTERVAL = 5000;
    private static final long DEFAULT_INTERVAL = 10000;
    private static final int REQUEST_SETTINGS_CONTINUOUS_UPDATE = 11404;
    private static final int REQUEST_SETTINGS_SINGLE_UPDATE = 11403;
    public static final String TAG = "RNFusedLocation";
    private final ActivityEventListener mActivityEventListener;
    private float mDistanceFilter = DEFAULT_DISTANCE_FILTER;
    /* access modifiers changed from: private */
    public Callback mErrorCallback;
    private long mFastestInterval = 5000;
    /* access modifiers changed from: private */
    public boolean mForceRequestLocation = false;
    /* access modifiers changed from: private */
    public com.google.android.gms.location.d mFusedProviderClient;
    private g mLocationCallback;
    private int mLocationPriority = 102;
    /* access modifiers changed from: private */
    public LocationRequest mLocationRequest;
    /* access modifiers changed from: private */
    public double mMaximumAge = Double.POSITIVE_INFINITY;
    private m mSettingsClient;
    private boolean mShowLocationDialog = true;
    /* access modifiers changed from: private */
    public Callback mSuccessCallback;
    /* access modifiers changed from: private */
    public long mTimeout = Long.MAX_VALUE;
    private long mUpdateInterval = DEFAULT_INTERVAL;

    class a extends BaseActivityEventListener {
        a() {
        }

        public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
            if (i11 == RNFusedLocationModule.REQUEST_SETTINGS_SINGLE_UPDATE) {
                if (i12 == -1) {
                    RNFusedLocationModule.this.getUserLocation();
                } else if (!RNFusedLocationModule.this.mForceRequestLocation) {
                    RNFusedLocationModule.this.invokeError(LocationError.SETTINGS_NOT_SATISFIED.getValue(), "Location settings are not satisfied.", true);
                } else if (!a.d(RNFusedLocationModule.this.getContext())) {
                    RNFusedLocationModule.this.invokeError(LocationError.POSITION_UNAVAILABLE.getValue(), "No location provider available.", true);
                } else {
                    RNFusedLocationModule.this.getUserLocation();
                }
            } else if (i11 != RNFusedLocationModule.REQUEST_SETTINGS_CONTINUOUS_UPDATE) {
            } else {
                if (i12 == -1) {
                    RNFusedLocationModule.this.getLocationUpdates();
                } else if (!RNFusedLocationModule.this.mForceRequestLocation) {
                    RNFusedLocationModule.this.invokeError(LocationError.SETTINGS_NOT_SATISFIED.getValue(), "Location settings are not satisfied.", false);
                } else if (!a.d(RNFusedLocationModule.this.getContext())) {
                    RNFusedLocationModule.this.invokeError(LocationError.POSITION_UNAVAILABLE.getValue(), "No location provider available.", false);
                } else {
                    RNFusedLocationModule.this.getLocationUpdates();
                }
            }
        }
    }

    class b implements OnCompleteListener<j> {
        b() {
        }

        public void onComplete(Task<j> task) {
            RNFusedLocationModule.this.onLocationSettingsResponse(task, true);
        }
    }

    class c implements OnCompleteListener<j> {
        c() {
        }

        public void onComplete(Task<j> task) {
            RNFusedLocationModule.this.onLocationSettingsResponse(task, false);
        }
    }

    class d implements OnCompleteListener<Location> {
        d() {
        }

        public void onComplete(Task<Location> task) {
            Location location;
            try {
                location = task.p(ApiException.class);
            } catch (ApiException e11) {
                Log.w(RNFusedLocationModule.TAG, "getLastLocation error: " + e11.getMessage());
                location = null;
            }
            if (location == null || ((double) (te.g.a() - location.getTime())) >= RNFusedLocationModule.this.mMaximumAge) {
                new c(RNFusedLocationModule.this.mFusedProviderClient, RNFusedLocationModule.this.mLocationRequest, RNFusedLocationModule.this.mTimeout, RNFusedLocationModule.this.mSuccessCallback, RNFusedLocationModule.this.mErrorCallback).g();
            } else {
                RNFusedLocationModule.this.invokeSuccess(a.g(location), true);
            }
        }
    }

    class e extends g {
        e() {
        }

        public void onLocationAvailability(LocationAvailability locationAvailability) {
            if (!locationAvailability.M() && !a.d(RNFusedLocationModule.this.getContext())) {
                RNFusedLocationModule.this.invokeError(LocationError.POSITION_UNAVAILABLE.getValue(), "Unable to retrieve location", false);
            }
        }

        public void onLocationResult(LocationResult locationResult) {
            RNFusedLocationModule.this.invokeSuccess(a.g(locationResult.M()), false);
        }
    }

    public RNFusedLocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        a aVar = new a();
        this.mActivityEventListener = aVar;
        this.mFusedProviderClient = i.b(reactApplicationContext);
        this.mSettingsClient = i.c(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(aVar);
        Log.i(TAG, "RNFusedLocation initialized");
    }

    private LocationSettingsRequest buildLocationSettingsRequest() {
        LocationRequest locationRequest = new LocationRequest();
        this.mLocationRequest = locationRequest;
        locationRequest.S0(this.mLocationPriority).H0(this.mUpdateInterval).x0(this.mFastestInterval).U0(this.mDistanceFilter);
        LocationSettingsRequest.a aVar = new LocationSettingsRequest.a();
        aVar.a(this.mLocationRequest);
        return aVar.b();
    }

    private void clearCallbacks() {
        this.mSuccessCallback = null;
        this.mErrorCallback = null;
    }

    /* access modifiers changed from: private */
    public ReactApplicationContext getContext() {
        return getReactApplicationContext();
    }

    /* access modifiers changed from: private */
    public void getLocationUpdates() {
        if (this.mFusedProviderClient != null && this.mLocationRequest != null) {
            e eVar = new e();
            this.mLocationCallback = eVar;
            this.mFusedProviderClient.d(this.mLocationRequest, eVar, (Looper) null);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r7.equals("passive") == false) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getPriority(com.facebook.react.bridge.ReadableMap r7) {
        /*
            r6 = this;
            java.lang.String r0 = "enableHighAccuracy"
            boolean r1 = r7.hasKey(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            boolean r0 = r7.getBoolean(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            java.lang.String r1 = "accuracy"
            boolean r4 = r7.hasKey(r1)
            if (r4 == 0) goto L_0x003c
            com.facebook.react.bridge.ReadableType r4 = r7.getType(r1)
            com.facebook.react.bridge.ReadableType r5 = com.facebook.react.bridge.ReadableType.Map
            if (r4 != r5) goto L_0x003c
            com.facebook.react.bridge.ReadableMap r7 = r7.getMap(r1)
            java.lang.String r1 = "android"
            boolean r4 = r7.hasKey(r1)
            if (r4 == 0) goto L_0x003c
            com.facebook.react.bridge.ReadableType r4 = r7.getType(r1)
            com.facebook.react.bridge.ReadableType r5 = com.facebook.react.bridge.ReadableType.String
            if (r4 != r5) goto L_0x003c
            java.lang.String r7 = r7.getString(r1)
            goto L_0x003e
        L_0x003c:
            java.lang.String r7 = ""
        L_0x003e:
            r7.hashCode()
            r1 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -1924829944: goto L_0x006a;
                case -792039641: goto L_0x0061;
                case 107348: goto L_0x0056;
                case 3202466: goto L_0x004b;
                default: goto L_0x0049;
            }
        L_0x0049:
            r2 = -1
            goto L_0x0074
        L_0x004b:
            java.lang.String r2 = "high"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L_0x0054
            goto L_0x0049
        L_0x0054:
            r2 = 3
            goto L_0x0074
        L_0x0056:
            java.lang.String r2 = "low"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L_0x005f
            goto L_0x0049
        L_0x005f:
            r2 = 2
            goto L_0x0074
        L_0x0061:
            java.lang.String r3 = "passive"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0074
            goto L_0x0049
        L_0x006a:
            java.lang.String r2 = "balanced"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L_0x0073
            goto L_0x0049
        L_0x0073:
            r2 = 0
        L_0x0074:
            r7 = 102(0x66, float:1.43E-43)
            r1 = 100
            switch(r2) {
                case 0: goto L_0x0086;
                case 1: goto L_0x0084;
                case 2: goto L_0x0081;
                case 3: goto L_0x0080;
                default: goto L_0x007b;
            }
        L_0x007b:
            if (r0 == 0) goto L_0x007f
            r7 = 100
        L_0x007f:
            return r7
        L_0x0080:
            return r1
        L_0x0081:
            r7 = 104(0x68, float:1.46E-43)
            return r7
        L_0x0084:
            r7 = 105(0x69, float:1.47E-43)
        L_0x0086:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.agontuk.RNFusedLocation.RNFusedLocationModule.getPriority(com.facebook.react.bridge.ReadableMap):int");
    }

    /* access modifiers changed from: private */
    public void getUserLocation() {
        com.google.android.gms.location.d dVar = this.mFusedProviderClient;
        if (dVar != null) {
            dVar.b().b(new d());
        }
    }

    /* access modifiers changed from: private */
    public void invokeError(int i11, String str, boolean z11) {
        if (!z11) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationError", a.a(i11, str));
            return;
        }
        try {
            Callback callback = this.mErrorCallback;
            if (callback != null) {
                callback.invoke(a.a(i11, str));
            }
            clearCallbacks();
        } catch (RuntimeException e11) {
            Log.w(TAG, e11.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void invokeSuccess(WritableMap writableMap, boolean z11) {
        if (!z11) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationDidChange", writableMap);
            return;
        }
        try {
            Callback callback = this.mSuccessCallback;
            if (callback != null) {
                callback.invoke(writableMap);
            }
            clearCallbacks();
        } catch (RuntimeException e11) {
            Log.w(TAG, e11.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void onLocationSettingsResponse(Task<j> task, boolean z11) {
        try {
            j p11 = task.p(ApiException.class);
            if (z11) {
                getUserLocation();
            } else {
                getLocationUpdates();
            }
        } catch (ApiException e11) {
            int statusCode = e11.getStatusCode();
            if (statusCode != 6) {
                if (statusCode == 8502) {
                    ReactApplicationContext context = getContext();
                    if (a.e(context) && a.f(context, "gps")) {
                        if (z11) {
                            getUserLocation();
                            return;
                        } else {
                            getLocationUpdates();
                            return;
                        }
                    }
                }
                invokeError(LocationError.SETTINGS_NOT_SATISFIED.getValue(), "Location settings are not satisfied.", z11);
            } else if (!this.mShowLocationDialog) {
                invokeError(LocationError.SETTINGS_NOT_SATISFIED.getValue(), "Location settings are not satisfied.", z11);
            } else {
                try {
                    ResolvableApiException resolvableApiException = (ResolvableApiException) e11;
                    Activity currentActivity = getCurrentActivity();
                    if (currentActivity == null) {
                        invokeError(LocationError.INTERNAL_ERROR.getValue(), "Tried to open location dialog while not attached to an Activity", z11);
                    } else {
                        resolvableApiException.startResolutionForResult(currentActivity, z11 ? REQUEST_SETTINGS_SINGLE_UPDATE : REQUEST_SETTINGS_CONTINUOUS_UPDATE);
                    }
                } catch (IntentSender.SendIntentException unused) {
                    invokeError(LocationError.INTERNAL_ERROR.getValue(), "Internal error occurred", z11);
                } catch (ClassCastException unused2) {
                    invokeError(LocationError.INTERNAL_ERROR.getValue(), "Internal error occurred", z11);
                }
            }
        }
    }

    @ReactMethod
    public void getCurrentPosition(ReadableMap readableMap, Callback callback, Callback callback2) {
        ReactApplicationContext context = getContext();
        this.mSuccessCallback = callback;
        this.mErrorCallback = callback2;
        boolean z11 = true;
        if (!a.b(context)) {
            invokeError(LocationError.PERMISSION_DENIED.getValue(), "Location permission not granted.", true);
        } else if (!a.c(context)) {
            invokeError(LocationError.PLAY_SERVICE_NOT_AVAILABLE.getValue(), "Google play service is not available.", true);
        } else {
            this.mLocationPriority = getPriority(readableMap);
            this.mTimeout = readableMap.hasKey("timeout") ? (long) readableMap.getDouble("timeout") : Long.MAX_VALUE;
            this.mMaximumAge = readableMap.hasKey("maximumAge") ? readableMap.getDouble("maximumAge") : Double.POSITIVE_INFINITY;
            this.mDistanceFilter = readableMap.hasKey("distanceFilter") ? (float) readableMap.getDouble("distanceFilter") : 0.0f;
            if (readableMap.hasKey("showLocationDialog")) {
                z11 = readableMap.getBoolean("showLocationDialog");
            }
            this.mShowLocationDialog = z11;
            this.mForceRequestLocation = readableMap.hasKey("forceRequestLocation") ? readableMap.getBoolean("forceRequestLocation") : false;
            LocationSettingsRequest buildLocationSettingsRequest = buildLocationSettingsRequest();
            m mVar = this.mSettingsClient;
            if (mVar != null) {
                mVar.a(buildLocationSettingsRequest).b(new b());
            }
        }
    }

    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void startObserving(ReadableMap readableMap) {
        ReactApplicationContext context = getContext();
        boolean z11 = false;
        if (!a.b(context)) {
            invokeError(LocationError.PERMISSION_DENIED.getValue(), "Location permission not granted.", false);
        } else if (!a.c(context)) {
            invokeError(LocationError.PLAY_SERVICE_NOT_AVAILABLE.getValue(), "Google play service is not available.", false);
        } else {
            this.mLocationPriority = getPriority(readableMap);
            this.mDistanceFilter = readableMap.hasKey("distanceFilter") ? (float) readableMap.getDouble("distanceFilter") : DEFAULT_DISTANCE_FILTER;
            boolean hasKey = readableMap.hasKey("interval");
            long j = DEFAULT_INTERVAL;
            this.mUpdateInterval = hasKey ? (long) readableMap.getDouble("interval") : 10000;
            if (readableMap.hasKey("fastestInterval")) {
                j = (long) readableMap.getDouble("fastestInterval");
            }
            this.mFastestInterval = j;
            this.mShowLocationDialog = readableMap.hasKey("showLocationDialog") ? readableMap.getBoolean("showLocationDialog") : true;
            if (readableMap.hasKey("forceRequestLocation")) {
                z11 = readableMap.getBoolean("forceRequestLocation");
            }
            this.mForceRequestLocation = z11;
            LocationSettingsRequest buildLocationSettingsRequest = buildLocationSettingsRequest();
            m mVar = this.mSettingsClient;
            if (mVar != null) {
                mVar.a(buildLocationSettingsRequest).b(new c());
            }
        }
    }

    @ReactMethod
    public void stopObserving() {
        g gVar;
        com.google.android.gms.location.d dVar = this.mFusedProviderClient;
        if (dVar != null && (gVar = this.mLocationCallback) != null) {
            dVar.c(gVar);
            this.mLocationCallback = null;
        }
    }
}
