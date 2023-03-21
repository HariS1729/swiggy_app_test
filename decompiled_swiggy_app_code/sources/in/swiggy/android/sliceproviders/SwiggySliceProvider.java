package in.swiggy.android.sliceproviders;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.slice.Slice;
import androidx.slice.c;
import bp0.f;
import if0.j;
import in.swiggy.android.SwiggyApplication;
import in.swiggy.android.mvvm.viewmodels.SwiggySliceViewModel;
import in.swiggy.android.tejas.feature.address.v2.api.IAddressExp;
import ir.b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;
import yf0.a;
import yf0.d;
import yw.i1;

/* compiled from: SwiggySliceProvider.kt */
public final class SwiggySliceProvider extends c {
    public static final a q = new a((i) null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f18723r = 8;

    /* renamed from: g  reason: collision with root package name */
    private final f f18724g = b.b(new SwiggySliceProvider$lastOrderFetchedTimeThresholdInMillis$2(this));

    /* renamed from: h  reason: collision with root package name */
    private final f f18725h = b.b(new SwiggySliceProvider$applicationContext$2(this));

    /* renamed from: i  reason: collision with root package name */
    private final f f18726i = b.b(new SwiggySliceProvider$swiggySliceViewModel$2(this));
    private final f j = b.b(new SwiggySliceProvider$remoteConfig$2(this));
    private final f k = b.b(new SwiggySliceProvider$appBuildDetails$2(this));

    /* renamed from: l  reason: collision with root package name */
    private final f f18727l = b.b(new SwiggySliceProvider$xpExperimentContext$2(this));

    /* renamed from: m  reason: collision with root package name */
    private final f f18728m = b.b(new SwiggySliceProvider$addressExp$2(this));
    /* access modifiers changed from: private */
    public final f<j> n = b.b(new SwiggySliceProvider$user$1(this));

    /* renamed from: o  reason: collision with root package name */
    private final Map<Uri, yf0.a> f18729o = new LinkedHashMap();

    /* renamed from: p  reason: collision with root package name */
    public b f18730p;

    /* compiled from: SwiggySliceProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private final yf0.a A(Uri uri) {
        yf0.a aVar = this.f18729o.get(uri);
        yf0.a aVar2 = null;
        if (aVar != null) {
            if (aVar instanceof d) {
                Long s11 = ((d) aVar).s();
                if (s11 == null) {
                    aVar = null;
                } else {
                    if (System.currentTimeMillis() - s11.longValue() > G()) {
                        aVar = B(uri);
                    }
                }
                if (aVar == null) {
                    aVar = B(uri);
                }
            }
            aVar2 = aVar;
        }
        return aVar2 == null ? B(uri) : aVar2;
    }

    private final yf0.a B(Uri uri) {
        yf0.a z11 = z(uri);
        this.f18729o.put(uri, z11);
        return z11;
    }

    private final void C() {
        Context context;
        if (this.f18730p == null && (context = getContext()) != null) {
            Context applicationContext = context.getApplicationContext();
            Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type in.swiggy.android.SwiggyApplication");
            i1 I = ((SwiggyApplication) applicationContext).I();
            if (I != null) {
                I.t(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public final IAddressExp D() {
        return (IAddressExp) this.f18728m.getValue();
    }

    /* access modifiers changed from: private */
    public final os.a E() {
        return (os.a) this.k.getValue();
    }

    /* access modifiers changed from: private */
    public final SwiggyApplication F() {
        return (SwiggyApplication) this.f18725h.getValue();
    }

    private final long G() {
        return ((Number) this.f18724g.getValue()).longValue();
    }

    /* access modifiers changed from: private */
    public final long H() {
        String str = "";
        try {
            SharedPreferences a11 = j3.b.a(getContext());
            p.i(a11, str);
            String string = a11.getString("android_last_order_fetched_time_threshold_in_sec", "30");
            if (string != null) {
                str = string;
            }
            long parseLong = Long.parseLong(str);
            if (parseLong > 0) {
                return parseLong * 1000;
            }
            return 30000;
        } catch (Exception e11) {
            u.h("SwiggySliceProvider", e11);
            return 30000;
        }
    }

    /* access modifiers changed from: private */
    public final iw.c I() {
        return (iw.c) this.j.getValue();
    }

    private final SwiggySliceViewModel J() {
        return (SwiggySliceViewModel) this.f18726i.getValue();
    }

    /* access modifiers changed from: private */
    public final ef0.f K() {
        return (ef0.f) this.f18727l.getValue();
    }

    private final yf0.a z(Uri uri) {
        d dVar;
        Context context = getContext();
        if (context != null) {
            String path = uri.getPath();
            if (path == null || path.hashCode() != 1456191100 || !path.equals("/track")) {
                return new a.C0251a(context, uri);
            }
            SwiggySliceViewModel J = J();
            if (J == null) {
                dVar = null;
            } else {
                dVar = new d(context, uri, J, this.n.getValue(), this.f18730p);
            }
            if (dVar == null) {
                return new a.C0251a(context, uri);
            }
            return dVar;
        }
        throw new IllegalArgumentException(("SliceProvider " + this + " not attached to a context.").toString());
    }

    public Slice j(Uri uri) {
        p.j(uri, "sliceUri");
        C();
        return A(uri).f();
    }

    public boolean m() {
        return F() != null;
    }

    public Uri o(Intent intent) {
        String str;
        Uri.Builder scheme = new Uri.Builder().scheme("content");
        p.i(scheme, "Builder().scheme(ContentResolver.SCHEME_CONTENT)");
        if (intent == null) {
            Uri build = scheme.build();
            p.i(build, "uriBuilder.build()");
            return build;
        }
        Uri data = intent.getData();
        if (data == null) {
            str = null;
        } else {
            str = data.getPath();
        }
        String str2 = str;
        if (!(data == null || str2 == null)) {
            scheme = scheme.path(o.H(str2, "/", "", false, 4, (Object) null));
            p.i(scheme, "uriBuilder.path(path)");
        }
        Context context = getContext();
        if (context != null) {
            scheme = scheme.authority(context.getPackageName());
            p.i(scheme, "uriBuilder.authority(context.packageName)");
        }
        Uri build2 = scheme.build();
        p.i(build2, "uriBuilder.build()");
        return build2;
    }
}
