package x1;

import a2.e;
import a2.h;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import d2.e;
import java.util.List;
import kotlin.jvm.internal.p;
import p1.b;
import p1.e0;
import p1.u;
import u0.h1;
import u1.i;
import u1.j;
import u1.s;
import u1.t;
import u1.v;
import u1.x;
import w1.f;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
public final class a {
    private static final void a(SpannableString spannableString, u uVar, int i11, int i12, e eVar, i.b bVar) {
        SpannableExtensions_androidKt.i(spannableString, uVar.f(), i11, i12);
        SpannableExtensions_androidKt.l(spannableString, uVar.i(), eVar, i11, i12);
        if (!(uVar.l() == null && uVar.j() == null)) {
            v l11 = uVar.l();
            if (l11 == null) {
                l11 = v.f16949b.f();
            }
            s j = uVar.j();
            spannableString.setSpan(new StyleSpan(u1.e.c(l11, j != null ? j.i() : s.f16939b.b())), i11, i12, 33);
        }
        if (uVar.g() != null) {
            if (uVar.g() instanceof x) {
                spannableString.setSpan(new TypefaceSpan(((x) uVar.g()).f()), i11, i12, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                i g11 = uVar.g();
                t k = uVar.k();
                spannableString.setSpan(j.f17666a.a((Typeface) j.a(bVar, g11, (v) null, 0, k != null ? k.m() : t.f16943b.a(), 6, (Object) null).getValue()), i11, i12, 33);
            }
        }
        if (uVar.q() != null) {
            a2.e q = uVar.q();
            e.a aVar = a2.e.f915b;
            if (q.d(aVar.d())) {
                spannableString.setSpan(new UnderlineSpan(), i11, i12, 33);
            }
            if (uVar.q().d(aVar.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i11, i12, 33);
            }
        }
        if (uVar.s() != null) {
            spannableString.setSpan(new ScaleXSpan(uVar.s().b()), i11, i12, 33);
        }
        SpannableExtensions_androidKt.p(spannableString, uVar.n(), i11, i12);
        SpannableExtensions_androidKt.f(spannableString, uVar.c(), i11, i12);
    }

    public static final SpannableString b(b bVar, d2.e eVar, i.b bVar2) {
        b bVar3 = bVar;
        p.j(bVar3, "<this>");
        p.j(eVar, "density");
        p.j(bVar2, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(bVar.g());
        List<b.C0163b<u>> e11 = bVar.e();
        int size = e11.size();
        for (int i11 = 0; i11 < size; i11++) {
            b.C0163b bVar4 = e11.get(i11);
            int b11 = bVar4.b();
            int c11 = bVar4.c();
            a(spannableString, u.b((u) bVar4.a(), 0, 0, (v) null, (s) null, (t) null, (i) null, (String) null, 0, (a2.a) null, (h) null, (f) null, 0, (a2.e) null, (h1) null, 16351, (Object) null), b11, c11, eVar, bVar2);
        }
        List<b.C0163b<e0>> h11 = bVar3.h(0, bVar.length());
        int size2 = h11.size();
        for (int i12 = 0; i12 < size2; i12++) {
            b.C0163b bVar5 = h11.get(i12);
            spannableString.setSpan(y1.e.a((e0) bVar5.a()), bVar5.b(), bVar5.c(), 33);
        }
        return spannableString;
    }
}
