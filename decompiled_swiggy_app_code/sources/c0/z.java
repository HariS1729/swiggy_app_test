package c0;

import d2.h;
import defpackage.v1;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Swipeable.kt */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f12756a = new z();

    /* renamed from: b  reason: collision with root package name */
    private static final v1.l0<Float> f12757b = new v1.l0(0.0f, 0.0f, (Object) null, 7, (i) null);

    /* renamed from: c  reason: collision with root package name */
    private static final float f12758c = h.n((float) 125);

    private z() {
    }

    public static /* synthetic */ s c(z zVar, Set set, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 10.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = 10.0f;
        }
        return zVar.b(set, f11, f12);
    }

    public final float a() {
        return f12758c;
    }

    public final s b(Set<Float> set, float f11, float f12) {
        p.j(set, "anchors");
        if (set.size() <= 1) {
            return null;
        }
        Float j02 = s.j0(set);
        p.g(j02);
        float floatValue = j02.floatValue();
        Float l02 = s.l0(set);
        p.g(l02);
        return new s(floatValue - l02.floatValue(), f11, f12);
    }
}
