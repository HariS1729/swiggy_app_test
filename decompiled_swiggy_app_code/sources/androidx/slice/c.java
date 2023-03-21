package androidx.slice;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Process;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.core.app.CoreComponentFactory;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.core.R;
import in.juspay.hyper.constants.Labels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o3.a;
import o3.b;
import r3.d;

/* compiled from: SliceProvider */
public abstract class c extends ContentProvider implements CoreComponentFactory.a {

    /* renamed from: e  reason: collision with root package name */
    private static Set<SliceSpec> f11735e;

    /* renamed from: f  reason: collision with root package name */
    private static a f11736f;

    /* renamed from: a  reason: collision with root package name */
    private final String[] f11737a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    private r3.c f11738b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f11739c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private List<Uri> f11740d;

    private static PendingIntent b(Context context, Uri uri, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), "androidx.slice.compat.SlicePermissionActivity"));
        intent.putExtra("slice_uri", uri);
        intent.putExtra("pkg", str);
        intent.putExtra("provider_pkg", context.getPackageName());
        intent.setData(uri.buildUpon().appendQueryParameter("package", str).build());
        return PendingIntent.getActivity(context, 0, intent, 0);
    }

    public static a d() {
        return f11736f;
    }

    public static Set<SliceSpec> e() {
        return f11735e;
    }

    private static CharSequence f(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return context.getString(R.string.abc_slices_permission_request, new Object[]{packageManager.getApplicationInfo(str, 0).loadLabel(packageManager), context.getApplicationInfo().loadLabel(packageManager)});
        } catch (PackageManager.NameNotFoundException e11) {
            throw new RuntimeException("Unknown calling app", e11);
        }
    }

    public static void r(Set<SliceSpec> set) {
        f11735e = set;
    }

    public Object a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new d(this, this.f11737a);
        }
        return null;
    }

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    public Slice c(Uri uri, String str) {
        Context context = getContext();
        PendingIntent l11 = l(uri, str);
        if (l11 == null) {
            l11 = b(context, uri, str);
        }
        Slice.a aVar = new Slice.a(uri);
        Slice.a a11 = new Slice.a(aVar).e(IconCompat.j(context, R.drawable.abc_ic_permission), (String) null, new String[0]).b(Arrays.asList(new String[]{"title", "shortcut"})).a(l11, new Slice.a(aVar).m(), (String) null);
        TypedValue typedValue = new TypedValue();
        new ContextThemeWrapper(context, 16974123).getTheme().resolveAttribute(16843829, typedValue, true);
        aVar.j(new Slice.a(uri.buildUpon().appendPath(Labels.System.PERMISSION).build()).e(IconCompat.j(context, R.drawable.abc_ic_arrow_forward), (String) null, new String[0]).k(f(context, str), (String) null, new String[0]).f(typedValue.data, "color", new String[0]).j(a11.m(), (String) null).m(), (String) null);
        return aVar.b(Arrays.asList(new String[]{"permission_request"})).m();
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        r3.c cVar = this.f11738b;
        if (cVar != null) {
            return cVar.c(str, str2, bundle);
        }
        return null;
    }

    public final Uri canonicalize(Uri uri) {
        return null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public List<Uri> g() {
        synchronized (this.f11739c) {
            if (this.f11740d == null) {
                this.f11740d = new ArrayList(b.a(getContext()).b());
            }
        }
        return this.f11740d;
    }

    public final String getType(Uri uri) {
        return "vnd.android.slice";
    }

    public void h(Uri uri) {
        List<Uri> g11 = g();
        if (!g11.contains(uri)) {
            g11.add(uri);
        }
    }

    public void i(Uri uri) {
        List<Uri> g11 = g();
        if (g11.contains(uri)) {
            g11.remove(uri);
        }
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public abstract Slice j(Uri uri);

    /* access modifiers changed from: protected */
    public r3.a k(String[] strArr) {
        Context context = getContext();
        return new r3.a(context, "slice_perms_" + getClass().getName(), Process.myUid(), strArr);
    }

    public PendingIntent l(Uri uri, String str) {
        return null;
    }

    public abstract boolean m();

    public Collection<Uri> n(Uri uri) {
        return Collections.emptyList();
    }

    public Uri o(Intent intent) {
        throw new UnsupportedOperationException("This provider has not implemented intent to uri mapping");
    }

    public final boolean onCreate() {
        if (Build.VERSION.SDK_INT < 28) {
            this.f11738b = new r3.c(this, k(this.f11737a), getContext());
        }
        return m();
    }

    public void p(Uri uri) {
    }

    public void q(Uri uri) {
    }

    public final Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
