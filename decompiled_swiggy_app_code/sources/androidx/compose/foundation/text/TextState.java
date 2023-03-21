package androidx.compose.foundation.text;

import a0.n;
import androidx.compose.runtime.g;
import b0.e;
import bp0.k;
import e0.h0;
import i1.m;
import kotlin.jvm.internal.p;
import lp0.l;
import p1.y;
import t0.f;
import u0.d0;

/* compiled from: CoreText.kt */
public final class TextState {

    /* renamed from: a  reason: collision with root package name */
    private n f4642a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4643b;

    /* renamed from: c  reason: collision with root package name */
    private l<? super y, k> f4644c = TextState$onTextLayout$1.f4651a;

    /* renamed from: d  reason: collision with root package name */
    private e f4645d;

    /* renamed from: e  reason: collision with root package name */
    private m f4646e;

    /* renamed from: f  reason: collision with root package name */
    private y f4647f;

    /* renamed from: g  reason: collision with root package name */
    private long f4648g = f.f16662b.c();

    /* renamed from: h  reason: collision with root package name */
    private long f4649h = d0.f16756b.f();

    /* renamed from: i  reason: collision with root package name */
    private final h0 f4650i = g.g(k.f22762a, g.i());

    public TextState(n nVar, long j) {
        p.j(nVar, "textDelegate");
        this.f4642a = nVar;
        this.f4643b = j;
    }

    private final void i(k kVar) {
        this.f4650i.setValue(kVar);
    }

    public final k a() {
        this.f4650i.getValue();
        return k.f22762a;
    }

    public final m b() {
        return this.f4646e;
    }

    public final y c() {
        return this.f4647f;
    }

    public final l<y, k> d() {
        return this.f4644c;
    }

    public final long e() {
        return this.f4648g;
    }

    public final e f() {
        return this.f4645d;
    }

    public final long g() {
        return this.f4643b;
    }

    public final n h() {
        return this.f4642a;
    }

    public final void j(m mVar) {
        this.f4646e = mVar;
    }

    public final void k(y yVar) {
        i(k.f22762a);
        this.f4647f = yVar;
    }

    public final void l(l<? super y, k> lVar) {
        p.j(lVar, "<set-?>");
        this.f4644c = lVar;
    }

    public final void m(long j) {
        this.f4648g = j;
    }

    public final void n(e eVar) {
        this.f4645d = eVar;
    }

    public final void o(long j) {
        this.f4649h = j;
    }

    public final void p(n nVar) {
        p.j(nVar, "<set-?>");
        this.f4642a = nVar;
    }
}
