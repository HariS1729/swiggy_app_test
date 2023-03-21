package androidx.compose.ui.platform;

import java.util.List;
import k1.r;
import kotlin.jvm.internal.p;
import n1.h;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class c1 implements r {

    /* renamed from: a  reason: collision with root package name */
    private final int f7282a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c1> f7283b;

    /* renamed from: c  reason: collision with root package name */
    private Float f7284c;

    /* renamed from: d  reason: collision with root package name */
    private Float f7285d;

    /* renamed from: e  reason: collision with root package name */
    private h f7286e;

    /* renamed from: f  reason: collision with root package name */
    private h f7287f;

    public c1(int i11, List<c1> list, Float f11, Float f12, h hVar, h hVar2) {
        p.j(list, "allScopes");
        this.f7282a = i11;
        this.f7283b = list;
        this.f7284c = f11;
        this.f7285d = f12;
        this.f7286e = hVar;
        this.f7287f = hVar2;
    }

    public final h a() {
        return this.f7286e;
    }

    public final Float b() {
        return this.f7284c;
    }

    public final Float c() {
        return this.f7285d;
    }

    public final int d() {
        return this.f7282a;
    }

    public final h e() {
        return this.f7287f;
    }

    public final void f(h hVar) {
        this.f7286e = hVar;
    }

    public final void g(Float f11) {
        this.f7284c = f11;
    }

    public final void h(Float f11) {
        this.f7285d = f11;
    }

    public final void i(h hVar) {
        this.f7287f = hVar;
    }

    public boolean o0() {
        return this.f7283b.contains(this);
    }
}
