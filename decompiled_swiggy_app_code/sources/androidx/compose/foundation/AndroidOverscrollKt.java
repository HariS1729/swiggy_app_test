package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bp0.k;
import d2.u;
import e0.g;
import fp0.c;
import p0.d;
import s.l;
import t0.f;

/* compiled from: AndroidOverscroll.kt */
public final class AndroidOverscrollKt {

    /* renamed from: a  reason: collision with root package name */
    private static final a f2837a = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final d f2838b;

    /* compiled from: AndroidOverscroll.kt */
    public static final class a implements l {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2845a;

        a() {
        }

        public void a(long j, long j11, f fVar, int i11) {
        }

        public boolean b() {
            return false;
        }

        public long c(long j, f fVar, int i11) {
            return f.f16662b.c();
        }

        public d d() {
            return d.f16037h0;
        }

        public Object e(long j, c<? super k> cVar) {
            return k.f22762a;
        }

        public Object f(long j, c<? super u> cVar) {
            return u.b(u.f14031b.a());
        }

        public boolean isEnabled() {
            return this.f2845a;
        }

        public void setEnabled(boolean z11) {
            this.f2845a = z11;
        }
    }

    static {
        d dVar;
        if (Build.VERSION.SDK_INT >= 31) {
            dVar = LayoutModifierKt.a(LayoutModifierKt.a(d.f16037h0, AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.f2839a), AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.f2842a);
        } else {
            dVar = d.f16037h0;
        }
        f2838b = dVar;
    }

    public static final l b(g gVar, int i11) {
        gVar.E(-81138291);
        Context context = (Context) gVar.z(AndroidCompositionLocals_androidKt.g());
        s.k kVar = (s.k) gVar.z(OverscrollConfigurationKt.a());
        gVar.E(511388516);
        boolean k = gVar.k(context) | gVar.k(kVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            if (kVar != null) {
                F = new AndroidEdgeEffectOverscrollEffect(context, kVar);
            } else {
                F = f2837a;
            }
            gVar.y(F);
        }
        gVar.P();
        l lVar = (l) F;
        gVar.P();
        return lVar;
    }
}
