package ci0;

import android.content.SharedPreferences;
import cg0.n;
import ef0.f;
import in.swiggy.android.swiggylynx.ui.fragment.viewmodel.LynxFragmentViewModel;
import javax.inject.Provider;
import mb0.r0;
import og0.a;
import ps.b;
import qq.e;

/* compiled from: LynxFragmentViewModel_Factory */
public final class g implements e<LynxFragmentViewModel> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<a> f18230a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<SharedPreferences> f18231b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<f> f18232c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<b> f18233d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<n> f18234e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<th0.a> f18235f;

    /* renamed from: g  reason: collision with root package name */
    private final Provider<kg0.a> f18236g;

    /* renamed from: h  reason: collision with root package name */
    private final Provider<r0> f18237h;

    /* renamed from: i  reason: collision with root package name */
    private final Provider<pw.a> f18238i;
    private final Provider<ef0.e> j;

    public g(Provider<a> provider, Provider<SharedPreferences> provider2, Provider<f> provider3, Provider<b> provider4, Provider<n> provider5, Provider<th0.a> provider6, Provider<kg0.a> provider7, Provider<r0> provider8, Provider<pw.a> provider9, Provider<ef0.e> provider10) {
        this.f18230a = provider;
        this.f18231b = provider2;
        this.f18232c = provider3;
        this.f18233d = provider4;
        this.f18234e = provider5;
        this.f18235f = provider6;
        this.f18236g = provider7;
        this.f18237h = provider8;
        this.f18238i = provider9;
        this.j = provider10;
    }

    public static g a(Provider<a> provider, Provider<SharedPreferences> provider2, Provider<f> provider3, Provider<b> provider4, Provider<n> provider5, Provider<th0.a> provider6, Provider<kg0.a> provider7, Provider<r0> provider8, Provider<pw.a> provider9, Provider<ef0.e> provider10) {
        return new g(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static LynxFragmentViewModel c(a aVar, SharedPreferences sharedPreferences, f fVar, b bVar, n nVar, th0.a aVar2, kg0.a aVar3, r0 r0Var, pw.a aVar4) {
        return new LynxFragmentViewModel(aVar, sharedPreferences, fVar, bVar, nVar, aVar2, aVar3, r0Var, aVar4);
    }

    /* renamed from: b */
    public LynxFragmentViewModel get() {
        LynxFragmentViewModel c11 = c(this.f18230a.get(), this.f18231b.get(), this.f18232c.get(), this.f18233d.get(), this.f18234e.get(), this.f18235f.get(), this.f18236g.get(), this.f18237h.get(), this.f18238i.get());
        h.a(c11, this.j.get());
        return c11;
    }
}
