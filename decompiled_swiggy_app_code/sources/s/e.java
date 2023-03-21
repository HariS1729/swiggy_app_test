package s;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import d2.h;
import kotlin.jvm.internal.p;
import p0.d;
import t0.l;
import u0.j1;
import u0.r0;

/* compiled from: ClipScrollableContainer.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final float f16533a = h.n((float) 30);

    /* renamed from: b  reason: collision with root package name */
    private static final d f16534b;

    /* renamed from: c  reason: collision with root package name */
    private static final d f16535c;

    /* compiled from: ClipScrollableContainer.kt */
    public static final class a implements j1 {
        a() {
        }

        public r0 a(long j, LayoutDirection layoutDirection, d2.e eVar) {
            p.j(layoutDirection, "layoutDirection");
            p.j(eVar, "density");
            float j02 = (float) eVar.j0(e.b());
            return new r0.b(new t0.h(0.0f, -j02, l.i(j), l.g(j) + j02));
        }
    }

    /* compiled from: ClipScrollableContainer.kt */
    public static final class b implements j1 {
        b() {
        }

        public r0 a(long j, LayoutDirection layoutDirection, d2.e eVar) {
            p.j(layoutDirection, "layoutDirection");
            p.j(eVar, "density");
            float j02 = (float) eVar.j0(e.b());
            return new r0.b(new t0.h(-j02, 0.0f, l.i(j) + j02, l.g(j)));
        }
    }

    static {
        d.a aVar = d.f16037h0;
        f16534b = r0.d.a(aVar, new a());
        f16535c = r0.d.a(aVar, new b());
    }

    public static final d a(d dVar, Orientation orientation) {
        d dVar2;
        p.j(dVar, "<this>");
        p.j(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            dVar2 = f16535c;
        } else {
            dVar2 = f16534b;
        }
        return dVar.N(dVar2);
    }

    public static final float b() {
        return f16533a;
    }
}
