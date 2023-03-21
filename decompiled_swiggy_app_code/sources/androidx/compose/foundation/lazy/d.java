package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import d2.l;
import defpackage.v1;
import e0.a1;
import e0.h0;
import kotlin.jvm.internal.i;

/* compiled from: LazyListItemPlacementAnimator.kt */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private int f4099a;

    /* renamed from: b  reason: collision with root package name */
    private final Animatable<l, v1.l> f4100b;

    /* renamed from: c  reason: collision with root package name */
    private long f4101c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f4102d;

    private d(long j, int i11) {
        this.f4099a = i11;
        this.f4100b = new Animatable(l.b(j), VectorConvertersKt.d(l.f14010b), (Object) null, 4, (i) null);
        this.f4101c = j;
        this.f4102d = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);
    }

    public /* synthetic */ d(long j, int i11, i iVar) {
        this(j, i11);
    }

    public final Animatable<l, v1.l> a() {
        return this.f4100b;
    }

    public final boolean b() {
        return ((Boolean) this.f4102d.getValue()).booleanValue();
    }

    public final int c() {
        return this.f4099a;
    }

    public final long d() {
        return this.f4101c;
    }

    public final void e(boolean z11) {
        this.f4102d.setValue(Boolean.valueOf(z11));
    }

    public final void f(int i11) {
        this.f4099a = i11;
    }

    public final void g(long j) {
        this.f4101c = j;
    }
}
