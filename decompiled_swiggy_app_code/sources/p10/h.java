package p10;

import android.content.SharedPreferences;
import fb0.i;
import javax.inject.Provider;
import jz.c;
import p90.a;
import qq.e;

/* compiled from: AccountFragmentModule_ProvidesClickNavigationServiceFactory */
public final class h implements e<ba0.e> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a> f16209a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<i> f16210b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<c> f16211c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<SharedPreferences> f16212d;

    public h(Provider<a> provider, Provider<i> provider2, Provider<c> provider3, Provider<SharedPreferences> provider4) {
        this.f16209a = provider;
        this.f16210b = provider2;
        this.f16211c = provider3;
        this.f16212d = provider4;
    }

    public static h a(Provider<a> provider, Provider<i> provider2, Provider<c> provider3, Provider<SharedPreferences> provider4) {
        return new h(provider, provider2, provider3, provider4);
    }

    public static ba0.e c(a aVar, i iVar, c cVar, SharedPreferences sharedPreferences) {
        return (ba0.e) qq.i.e(d.f16203a.d(aVar, iVar, cVar, sharedPreferences));
    }

    /* renamed from: b */
    public ba0.e get() {
        return c(this.f16209a.get(), this.f16210b.get(), this.f16211c.get(), this.f16212d.get());
    }
}
