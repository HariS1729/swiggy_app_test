package mf0;

import android.content.SharedPreferences;
import ar.d;
import in.swiggy.android.tejas.apiinterface.ISpnsApi;
import javax.inject.Provider;
import os.a;
import qq.e;

/* compiled from: RegistrationWorker_AssistedFactory_Factory */
public final class c0 implements e<b0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ef0.e> f19690a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<SharedPreferences> f19691b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<d> f19692c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<a> f19693d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<jr.a> f19694e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<ISpnsApi> f19695f;

    public c0(Provider<ef0.e> provider, Provider<SharedPreferences> provider2, Provider<d> provider3, Provider<a> provider4, Provider<jr.a> provider5, Provider<ISpnsApi> provider6) {
        this.f19690a = provider;
        this.f19691b = provider2;
        this.f19692c = provider3;
        this.f19693d = provider4;
        this.f19694e = provider5;
        this.f19695f = provider6;
    }

    public static c0 a(Provider<ef0.e> provider, Provider<SharedPreferences> provider2, Provider<d> provider3, Provider<a> provider4, Provider<jr.a> provider5, Provider<ISpnsApi> provider6) {
        return new c0(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static b0 c(Provider<ef0.e> provider, Provider<SharedPreferences> provider2, Provider<d> provider3, Provider<a> provider4, Provider<jr.a> provider5, Provider<ISpnsApi> provider6) {
        return new b0(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: b */
    public b0 get() {
        return c(this.f19690a, this.f19691b, this.f19692c, this.f19693d, this.f19694e, this.f19695f);
    }
}
