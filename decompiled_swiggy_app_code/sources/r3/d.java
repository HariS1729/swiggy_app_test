package r3;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceManager;
import android.app.slice.SliceProvider;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.slice.b;
import androidx.slice.c;
import java.util.Collection;
import java.util.Set;
import k3.a;
import o3.e;

/* compiled from: SliceProviderWrapperContainer */
public class d extends SliceProvider {

    /* renamed from: a  reason: collision with root package name */
    private c f16472a;

    /* renamed from: b  reason: collision with root package name */
    private String[] f16473b;

    /* renamed from: c  reason: collision with root package name */
    private SliceManager f16474c;

    public d(c cVar, String[] strArr) {
        super(strArr);
        this.f16473b = (strArr == null || strArr.length == 0) ? null : strArr;
        this.f16472a = cVar;
    }

    private void a(Uri uri) {
        if (uri != null) {
            for (String str : this.f16473b) {
                if (getContext().checkCallingPermission(str) == 0) {
                    this.f16474c.grantSlicePermission(str, uri);
                    getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
                    return;
                }
            }
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f16472a.attachInfo(context, providerInfo);
        super.attachInfo(context, providerInfo);
        this.f16474c = (SliceManager) context.getSystemService(SliceManager.class);
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        Uri uri;
        Intent intent;
        if (this.f16473b != null) {
            if ("bind_slice".equals(str)) {
                if (bundle != null) {
                    uri = (Uri) bundle.getParcelable("slice_uri");
                    if (!(uri == null || this.f16474c.checkSlicePermission(uri, Binder.getCallingPid(), Binder.getCallingUid()) == 0)) {
                        a(uri);
                    }
                }
            } else if ("map_slice".equals(str) && (intent = (Intent) bundle.getParcelable("slice_intent")) != null) {
                uri = onMapIntentToUri(intent);
                a(uri);
            }
            uri = null;
            a(uri);
        }
        if (!"androidx.remotecallback.method.PROVIDER_CALLBACK".equals(str) || !(this.f16472a instanceof e)) {
            return super.call(str, str2, bundle);
        }
        a.f15402b.d(getContext(), (e) this.f16472a, bundle);
        return null;
    }

    public Slice onBindSlice(Uri uri, Set<SliceSpec> set) {
        c.r(b.d(set));
        try {
            return b.a(this.f16472a.j(uri));
        } catch (Exception e11) {
            Log.wtf("SliceProviderWrapper", "Slice with URI " + uri.toString() + " is invalid.", e11);
            return null;
        } finally {
            c.r((Set<androidx.slice.SliceSpec>) null);
        }
    }

    public boolean onCreate() {
        return true;
    }

    public PendingIntent onCreatePermissionRequest(Uri uri) {
        if (this.f16473b != null) {
            a(uri);
        }
        PendingIntent l11 = this.f16472a.l(uri, getCallingPackage());
        if (l11 != null) {
            return l11;
        }
        return super.onCreatePermissionRequest(uri);
    }

    public Collection<Uri> onGetSliceDescendants(Uri uri) {
        return this.f16472a.n(uri);
    }

    public Uri onMapIntentToUri(Intent intent) {
        return this.f16472a.o(intent);
    }

    public void onSlicePinned(Uri uri) {
        this.f16472a.p(uri);
        this.f16472a.h(uri);
    }

    public void onSliceUnpinned(Uri uri) {
        this.f16472a.q(uri);
        this.f16472a.i(uri);
    }
}
