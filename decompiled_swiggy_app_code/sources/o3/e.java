package o3;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import androidx.slice.c;
import k3.a;
import k3.b;
import o3.e;

/* compiled from: SliceProviderWithCallbacks */
public abstract class e<T extends e> extends c implements b<T> {

    /* renamed from: g  reason: collision with root package name */
    String f15926g;

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        this.f15926g = providerInfo.authority;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        if (!"androidx.remotecallback.method.PROVIDER_CALLBACK".equals(str)) {
            return super.call(str, str2, bundle);
        }
        a.f15402b.d(getContext(), this, bundle);
        return null;
    }
}
