package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import lp0.r;
import p1.u;
import s1.m;
import u1.i;
import u1.s;
import u1.t;
import u1.v;

/* compiled from: SpannableExtensions.android.kt */
final class SpannableExtensions_androidKt$setFontAttributes$1 extends Lambda implements q<u, Integer, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spannable f7661a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r<i, v, s, t, Typeface> f7662b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, r<? super i, ? super v, ? super s, ? super t, ? extends Typeface> rVar) {
        super(3);
        this.f7661a = spannable;
        this.f7662b = rVar;
    }

    public final void a(u uVar, int i11, int i12) {
        p.j(uVar, "spanStyle");
        Spannable spannable = this.f7661a;
        r<i, v, s, t, Typeface> rVar = this.f7662b;
        i g11 = uVar.g();
        v l11 = uVar.l();
        if (l11 == null) {
            l11 = v.f16949b.f();
        }
        s j = uVar.j();
        s c11 = s.c(j != null ? j.i() : s.f16939b.b());
        t k = uVar.k();
        spannable.setSpan(new m(rVar.invoke(g11, l11, c11, t.e(k != null ? k.m() : t.f16943b.a()))), i11, i12, 33);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((u) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        return k.f22762a;
    }
}
