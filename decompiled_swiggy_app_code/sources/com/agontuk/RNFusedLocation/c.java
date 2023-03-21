package com.agontuk.RNFusedLocation;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.d;
import com.google.android.gms.location.g;

/* compiled from: SingleLocationUpdate */
public class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final d f13786a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationRequest f13787b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13788c;

    /* renamed from: d  reason: collision with root package name */
    private final Callback f13789d;

    /* renamed from: e  reason: collision with root package name */
    private final Callback f13790e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Handler f13791f = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f13792g = new a();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final g f13793h = new b();

    /* compiled from: SingleLocationUpdate */
    class a implements Runnable {
        a() {
        }

        public void run() {
            synchronized (c.this) {
                c.this.h(LocationError.TIMEOUT.getValue(), "Location request timed out.");
                if (!(c.this.f13786a == null || c.this.f13793h == null)) {
                    c.this.f13786a.c(c.this.f13793h);
                }
                Log.i(RNFusedLocationModule.TAG, "Location request timed out");
            }
        }
    }

    /* compiled from: SingleLocationUpdate */
    class b extends g {
        b() {
        }

        public void onLocationResult(LocationResult locationResult) {
            synchronized (c.this) {
                c.this.i(a.g(locationResult.M()));
                c.this.f13791f.removeCallbacks(c.this.f13792g);
                if (!(c.this.f13786a == null || c.this.f13793h == null)) {
                    c.this.f13786a.c(c.this.f13793h);
                }
            }
        }
    }

    public c(d dVar, LocationRequest locationRequest, long j, Callback callback, Callback callback2) {
        this.f13786a = dVar;
        this.f13787b = locationRequest;
        this.f13788c = j;
        this.f13789d = callback;
        this.f13790e = callback2;
    }

    /* access modifiers changed from: private */
    public void h(int i11, String str) {
        try {
            Callback callback = this.f13790e;
            if (callback != null) {
                callback.invoke(a.a(i11, str));
            }
        } catch (RuntimeException e11) {
            Log.w(RNFusedLocationModule.TAG, e11.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void i(WritableMap writableMap) {
        try {
            Callback callback = this.f13789d;
            if (callback != null) {
                callback.invoke(writableMap);
            }
        } catch (RuntimeException e11) {
            Log.w(RNFusedLocationModule.TAG, e11.getMessage());
        }
    }

    public void g() {
        d dVar = this.f13786a;
        if (dVar != null) {
            dVar.d(this.f13787b, this.f13793h, Looper.getMainLooper());
            long j = this.f13788c;
            if (j > 0 && j != Long.MAX_VALUE) {
                this.f13791f.postDelayed(this.f13792g, j);
            }
        }
    }
}
