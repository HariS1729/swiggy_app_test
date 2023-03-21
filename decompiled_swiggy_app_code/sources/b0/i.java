package b0;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import d2.h;
import lp0.p;
import t0.f;
import t0.g;

/* compiled from: SelectionHandles.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final float f12560a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f12561b;

    /* renamed from: c  reason: collision with root package name */
    private static final SemanticsPropertyKey<h> f12562c = new SemanticsPropertyKey<>("SelectionHandleInfo", (p) null, 2, (kotlin.jvm.internal.i) null);

    static {
        float f11 = (float) 25;
        f12560a = h.n(f11);
        f12561b = h.n(f11);
    }

    public static final long a(long j) {
        return g.a(f.m(j), f.n(j) - 1.0f);
    }

    public static final float b() {
        return f12561b;
    }

    public static final float c() {
        return f12560a;
    }

    public static final SemanticsPropertyKey<h> d() {
        return f12562c;
    }
}
