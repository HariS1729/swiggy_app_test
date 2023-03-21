package x1;

import a2.j;
import android.graphics.Typeface;
import android.text.SpannableString;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import d2.e;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.r;
import p1.b;
import p1.c0;
import p1.o;
import p1.q;
import p1.u;
import u1.i;
import u1.s;
import u1.t;
import u1.v;

/* compiled from: AndroidParagraphHelper.android.kt */
public final class c {
    public static final CharSequence a(String str, float f11, c0 c0Var, List<b.C0163b<u>> list, List<b.C0163b<o>> list2, e eVar, r<? super i, ? super v, ? super s, ? super t, ? extends Typeface> rVar) {
        p.j(str, "text");
        p.j(c0Var, "contextTextStyle");
        p.j(list, "spanStyles");
        p.j(list2, "placeholders");
        p.j(eVar, "density");
        p.j(rVar, "resolveTypeface");
        if (list.isEmpty() && list2.isEmpty() && p.e(c0Var.z(), j.f940c.a()) && d2.s.g(c0Var.o())) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        if (!b(c0Var) || c0Var.p() != null) {
            a2.c p11 = c0Var.p();
            if (p11 == null) {
                p11 = a2.c.f893c.a();
            }
            SpannableString spannableString2 = spannableString;
            SpannableExtensions_androidKt.n(spannableString2, c0Var.o(), f11, eVar, p11);
        } else {
            SpannableExtensions_androidKt.o(spannableString, c0Var.o(), f11, eVar);
        }
        SpannableExtensions_androidKt.v(spannableString, c0Var.z(), f11, eVar);
        SpannableExtensions_androidKt.t(spannableString, c0Var, list, eVar, rVar);
        y1.c.d(spannableString, list2, eVar);
        return spannableString;
    }

    public static final boolean b(c0 c0Var) {
        q a11;
        p.j(c0Var, "<this>");
        p1.t s11 = c0Var.s();
        if (s11 == null || (a11 = s11.a()) == null) {
            return true;
        }
        return a11.b();
    }
}
