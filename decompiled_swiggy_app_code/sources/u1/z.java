package u1;

import android.graphics.Typeface;
import bp0.k;
import kotlin.jvm.internal.p;
import lp0.l;
import u1.m0;
import x1.i;

/* compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f16968a = g0.a();

    public m0 a(l0 l0Var, a0 a0Var, l<? super m0.b, k> lVar, l<? super l0, ? extends Object> lVar2) {
        boolean z11;
        Typeface typeface;
        p.j(l0Var, "typefaceRequest");
        p.j(a0Var, "platformFontLoader");
        p.j(lVar, "onAsyncCompletion");
        p.j(lVar2, "createDefaultTypeface");
        i c11 = l0Var.c();
        if (c11 == null) {
            z11 = true;
        } else {
            z11 = c11 instanceof f;
        }
        if (z11) {
            typeface = this.f16968a.b(l0Var.f(), l0Var.d());
        } else if (c11 instanceof x) {
            typeface = this.f16968a.a((x) l0Var.c(), l0Var.f(), l0Var.d());
        } else if (!(c11 instanceof y)) {
            return null;
        } else {
            typeface = ((i) ((y) l0Var.c()).f()).a(l0Var.f(), l0Var.d(), l0Var.e());
        }
        return new m0.b(typeface, false, 2, (kotlin.jvm.internal.i) null);
    }
}
