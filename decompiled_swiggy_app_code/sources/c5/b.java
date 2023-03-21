package c5;

import b3.a;
import co.hyperverge.crashguard.data.repo.PrefsRepo;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.p;
import op0.e;
import sp0.j;

/* compiled from: PrefsRepo.kt */
public final class b<T> implements e<PrefsRepo, T> {

    /* renamed from: a  reason: collision with root package name */
    private final a.C0100a<T> f12824a;

    /* renamed from: b  reason: collision with root package name */
    private final T f12825b;

    public b(a.C0100a<T> aVar, T t) {
        p.j(aVar, HttpRequest.HEADER_KEY);
        p.j(t, "defaultValue");
        this.f12824a = aVar;
        this.f12825b = t;
    }

    /* renamed from: b */
    public T a(PrefsRepo prefsRepo, j<?> jVar) {
        p.j(prefsRepo, "thisRef");
        p.j(jVar, "property");
        return prefsRepo.e(this.f12824a, this.f12825b);
    }

    /* renamed from: d */
    public void c(PrefsRepo prefsRepo, j<?> jVar, T t) {
        p.j(prefsRepo, "thisRef");
        p.j(jVar, "property");
        p.j(t, "value");
        prefsRepo.h(this.f12824a, t);
    }
}
