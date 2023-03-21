package androidx.compose.animation.core;

import bp0.k;
import defpackage.v1;
import defpackage.v1.n;
import e0.a1;
import e0.d1;
import e0.h0;
import fp0.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Animatable.kt */
public final class Animatable<T, V extends v1.n> {

    /* renamed from: a  reason: collision with root package name */
    private final v1.q0<T, V> f2607a;

    /* renamed from: b  reason: collision with root package name */
    private final T f2608b;

    /* renamed from: c  reason: collision with root package name */
    private final v1.i<T, V> f2609c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f2610d;

    /* renamed from: e  reason: collision with root package name */
    private final h0 f2611e;

    /* renamed from: f  reason: collision with root package name */
    private final MutatorMutex f2612f;

    /* renamed from: g  reason: collision with root package name */
    private final v1.l0<T> f2613g;

    /* renamed from: h  reason: collision with root package name */
    private final V f2614h;

    /* renamed from: i  reason: collision with root package name */
    private final V f2615i;
    private V j;
    private V k;

    public Animatable(T t, v1.q0<T, V> q0Var, T t11) {
        p.j(q0Var, "typeConverter");
        this.f2607a = q0Var;
        this.f2608b = t11;
        this.f2609c = new v1.i(q0Var, t, (v1.n) null, 0, 0, false, 60, (i) null);
        this.f2610d = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);
        this.f2611e = j.e(t, (a1) null, 2, (Object) null);
        this.f2612f = new MutatorMutex();
        this.f2613g = new v1.l0(0.0f, 0.0f, t11, 3, (i) null);
        V i11 = i(t, Float.NEGATIVE_INFINITY);
        this.f2614h = i11;
        V i12 = i(t, Float.POSITIVE_INFINITY);
        this.f2615i = i12;
        this.j = i11;
        this.k = i12;
    }

    public static /* synthetic */ Object f(Animatable animatable, Object obj, v1.g gVar, Object obj2, l lVar, c cVar, int i11, Object obj3) {
        if ((i11 & 2) != 0) {
            gVar = animatable.k();
        }
        v1.g gVar2 = gVar;
        if ((i11 & 4) != 0) {
            obj2 = animatable.p();
        }
        Object obj4 = obj2;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return animatable.e(obj, gVar2, obj4, lVar, cVar);
    }

    /* access modifiers changed from: private */
    public final T h(T t) {
        if (p.e(this.j, this.f2614h) && p.e(this.k, this.f2615i)) {
            return t;
        }
        v1.n nVar = (v1.n) this.f2607a.a().invoke(t);
        int b11 = nVar.b();
        int i11 = 0;
        boolean z11 = false;
        while (i11 < b11) {
            int i12 = i11 + 1;
            if (nVar.a(i11) < this.j.a(i11) || nVar.a(i11) > this.k.a(i11)) {
                nVar.e(i11, l.l(nVar.a(i11), this.j.a(i11), this.k.a(i11)));
                z11 = true;
            }
            i11 = i12;
        }
        return z11 ? this.f2607a.b().invoke(nVar) : t;
    }

    private final V i(T t, float f11) {
        V v = (v1.n) this.f2607a.a().invoke(t);
        int b11 = v.b();
        for (int i11 = 0; i11 < b11; i11++) {
            v.e(i11, f11);
        }
        return v;
    }

    /* access modifiers changed from: private */
    public final void j() {
        v1.i<T, V> iVar = this.f2609c;
        iVar.n().d();
        iVar.q(Long.MIN_VALUE);
        t(false);
    }

    private final Object s(v1.c<T, V> cVar, T t, l<? super Animatable<T, V>, k> lVar, c<? super v1.e<T, V>> cVar2) {
        long f11 = l().f();
        return MutatorMutex.e(this.f2612f, (MutatePriority) null, new Animatable$runAnimation$2(this, t, cVar, f11, lVar, (c<? super Animatable$runAnimation$2>) null), cVar2, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void t(boolean z11) {
        this.f2610d.setValue(Boolean.valueOf(z11));
    }

    /* access modifiers changed from: private */
    public final void u(T t) {
        this.f2611e.setValue(t);
    }

    public final Object e(T t, v1.g<T> gVar, T t11, l<? super Animatable<T, V>, k> lVar, c<? super v1.e<T, V>> cVar) {
        return s(v1.d.a(gVar, n(), o(), t, t11), t11, lVar, cVar);
    }

    public final d1<T> g() {
        return this.f2609c;
    }

    public final v1.l0<T> k() {
        return this.f2613g;
    }

    public final v1.i<T, V> l() {
        return this.f2609c;
    }

    public final T m() {
        return this.f2611e.getValue();
    }

    public final v1.q0<T, V> n() {
        return this.f2607a;
    }

    public final T o() {
        return this.f2609c.getValue();
    }

    public final T p() {
        return this.f2607a.b().invoke(q());
    }

    public final V q() {
        return this.f2609c.n();
    }

    public final boolean r() {
        return ((Boolean) this.f2610d.getValue()).booleanValue();
    }

    public final Object v(T t, c<? super k> cVar) {
        Object e11 = MutatorMutex.e(this.f2612f, (MutatePriority) null, new Animatable$snapTo$2(this, t, (c<? super Animatable$snapTo$2>) null), cVar, 1, (Object) null);
        return e11 == b.d() ? e11 : k.f22762a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Animatable(Object obj, v1.q0 q0Var, Object obj2, int i11, i iVar) {
        this(obj, q0Var, (i11 & 4) != 0 ? null : obj2);
    }
}
