package s;

import android.view.View;
import android.widget.Magnifier;
import d2.e;
import s.p;
import t0.f;
import t0.g;
import t0.l;

/* compiled from: PlatformMagnifier.kt */
public final class q implements o {

    /* renamed from: b  reason: collision with root package name */
    public static final q f16555b = new q();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f16556c = true;

    /* compiled from: PlatformMagnifier.kt */
    public static final class a extends p.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Magnifier magnifier) {
            super(magnifier);
            kotlin.jvm.internal.p.j(magnifier, "magnifier");
        }

        public void b(long j, long j11, float f11) {
            if (!Float.isNaN(f11)) {
                d().setZoom(f11);
            }
            if (g.c(j11)) {
                d().show(f.m(j), f.n(j), f.m(j11), f.n(j11));
            } else {
                d().show(f.m(j), f.n(j));
            }
        }
    }

    private q() {
    }

    public boolean b() {
        return f16556c;
    }

    /* renamed from: c */
    public a a(j jVar, View view, e eVar, float f11) {
        kotlin.jvm.internal.p.j(jVar, "style");
        kotlin.jvm.internal.p.j(view, "view");
        kotlin.jvm.internal.p.j(eVar, "density");
        if (kotlin.jvm.internal.p.e(jVar, j.f16539g.b())) {
            return new a(new Magnifier(view));
        }
        long S = eVar.S(jVar.g());
        float v02 = eVar.v0(jVar.d());
        float v03 = eVar.v0(jVar.e());
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (S != l.f16682b.a()) {
            builder.setSize(c.c(l.i(S)), c.c(l.g(S)));
        }
        if (!Float.isNaN(v02)) {
            builder.setCornerRadius(v02);
        }
        if (!Float.isNaN(v03)) {
            builder.setElevation(v03);
        }
        if (!Float.isNaN(f11)) {
            builder.setInitialZoom(f11);
        }
        builder.setClippingEnabled(jVar.c());
        Magnifier build = builder.build();
        kotlin.jvm.internal.p.i(build, "Builder(view).run {\n    …    build()\n            }");
        return new a(build);
    }
}
