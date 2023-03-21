package c0;

import androidx.compose.material.ContentColorKt;
import e0.g;
import u0.d0;
import u0.f0;

/* compiled from: ContentAlpha.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f12682a = new d();

    private d() {
    }

    private final float a(float f11, float f12, g gVar, int i11) {
        gVar.E(-1499253717);
        long v = ((d0) gVar.z(ContentColorKt.a())).v();
        if (!q.f12737a.a(gVar, 6).o() ? ((double) f0.h(v)) >= 0.5d : ((double) f0.h(v)) <= 0.5d) {
            f11 = f12;
        }
        gVar.P();
        return f11;
    }

    public final float b(g gVar, int i11) {
        gVar.E(-651892877);
        float a11 = a(0.38f, 0.38f, gVar, ((i11 << 6) & 896) | 54);
        gVar.P();
        return a11;
    }

    public final float c(g gVar, int i11) {
        gVar.E(-1305244065);
        float a11 = a(1.0f, 0.87f, gVar, ((i11 << 6) & 896) | 54);
        gVar.P();
        return a11;
    }

    public final float d(g gVar, int i11) {
        gVar.E(575700177);
        float a11 = a(0.74f, 0.6f, gVar, ((i11 << 6) & 896) | 54);
        gVar.P();
        return a11;
    }
}
