package u0;

import androidx.compose.ui.unit.LayoutDirection;
import d2.e;
import kotlin.jvm.internal.p;
import t0.m;
import u0.r0;

/* compiled from: RectangleShape.kt */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    private static final j1 f16755a = new a();

    /* compiled from: RectangleShape.kt */
    public static final class a implements j1 {
        a() {
        }

        /* renamed from: b */
        public r0.b a(long j, LayoutDirection layoutDirection, e eVar) {
            p.j(layoutDirection, "layoutDirection");
            p.j(eVar, "density");
            return new r0.b(m.c(j));
        }

        public String toString() {
            return "RectangleShape";
        }
    }

    public static final j1 a() {
        return f16755a;
    }
}
