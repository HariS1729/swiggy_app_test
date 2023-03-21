package e0;

import androidx.compose.runtime.ComposerKt;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.p;

/* compiled from: Applier.kt */
public final class i0<N> implements e<N> {

    /* renamed from: a  reason: collision with root package name */
    private final e<N> f14184a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14185b;

    /* renamed from: c  reason: collision with root package name */
    private int f14186c;

    public i0(e<N> eVar, int i11) {
        p.j(eVar, "applier");
        this.f14184a = eVar;
        this.f14185b = i11;
    }

    public N a() {
        return this.f14184a.a();
    }

    public void b(int i11, int i12) {
        this.f14184a.b(i11 + (this.f14186c == 0 ? this.f14185b : 0), i12);
    }

    public /* synthetic */ void c() {
        d.b(this);
    }

    public void clear() {
        ComposerKt.x("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }

    public /* synthetic */ void d() {
        d.a(this);
    }

    public void e(int i11, int i12, int i13) {
        int i14 = this.f14186c == 0 ? this.f14185b : 0;
        this.f14184a.e(i11 + i14, i12 + i14, i13);
    }

    public void f(int i11, N n) {
        this.f14184a.f(i11 + (this.f14186c == 0 ? this.f14185b : 0), n);
    }

    public void g(int i11, N n) {
        this.f14184a.g(i11 + (this.f14186c == 0 ? this.f14185b : 0), n);
    }

    public void h(N n) {
        this.f14186c++;
        this.f14184a.h(n);
    }

    public void i() {
        int i11 = this.f14186c;
        if (i11 > 0) {
            this.f14186c = i11 - 1;
            this.f14184a.i();
            return;
        }
        ComposerKt.x("OffsetApplier up called with no corresponding down".toString());
        throw new KotlinNothingValueException();
    }
}
