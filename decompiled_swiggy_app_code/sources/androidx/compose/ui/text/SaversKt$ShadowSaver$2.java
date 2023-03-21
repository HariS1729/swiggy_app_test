package androidx.compose.ui.text;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.c;
import t0.f;
import u0.d0;
import u0.h1;

/* compiled from: Savers.kt */
final class SaversKt$ShadowSaver$2 extends Lambda implements l<Object, h1> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$ShadowSaver$2 f7507a = new SaversKt$ShadowSaver$2();

    SaversKt$ShadowSaver$2() {
        super(1);
    }

    /* renamed from: a */
    public final h1 invoke(Object obj) {
        d0 d0Var;
        f fVar;
        p.j(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        c<d0, Object> m11 = SaversKt.m(d0.f16756b);
        Boolean bool = Boolean.FALSE;
        Float f11 = null;
        if (!p.e(obj2, bool) && obj2 != null) {
            d0Var = m11.a(obj2);
        } else {
            d0Var = null;
        }
        p.g(d0Var);
        long v = d0Var.v();
        Object obj3 = list.get(1);
        c<f, Object> l11 = SaversKt.l(f.f16662b);
        if (!p.e(obj3, bool) && obj3 != null) {
            fVar = l11.a(obj3);
        } else {
            fVar = null;
        }
        p.g(fVar);
        long u11 = fVar.u();
        Object obj4 = list.get(2);
        if (obj4 != null) {
            f11 = (Float) obj4;
        }
        p.g(f11);
        return new h1(v, u11, f11.floatValue(), (i) null);
    }
}
