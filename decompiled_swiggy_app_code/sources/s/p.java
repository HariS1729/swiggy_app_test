package s;

import android.view.View;
import android.widget.Magnifier;
import d2.e;
import d2.q;
import t0.f;

/* compiled from: PlatformMagnifier.kt */
public final class p implements o {

    /* renamed from: b  reason: collision with root package name */
    public static final p f16552b = new p();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f16553c = false;

    /* compiled from: PlatformMagnifier.kt */
    public static class a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final Magnifier f16554a;

        public a(Magnifier magnifier) {
            kotlin.jvm.internal.p.j(magnifier, "magnifier");
            this.f16554a = magnifier;
        }

        public long a() {
            return q.a(this.f16554a.getWidth(), this.f16554a.getHeight());
        }

        public void b(long j, long j11, float f11) {
            this.f16554a.show(f.m(j), f.n(j));
        }

        public void c() {
            this.f16554a.update();
        }

        public final Magnifier d() {
            return this.f16554a;
        }

        public void dismiss() {
            this.f16554a.dismiss();
        }
    }

    private p() {
    }

    public boolean b() {
        return f16553c;
    }

    /* renamed from: c */
    public a a(j jVar, View view, e eVar, float f11) {
        kotlin.jvm.internal.p.j(jVar, "style");
        kotlin.jvm.internal.p.j(view, "view");
        kotlin.jvm.internal.p.j(eVar, "density");
        return new a(new Magnifier(view));
    }
}
