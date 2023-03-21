package androidx.compose.material;

import bp0.k;
import c0.v;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;

/* renamed from: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-3$1  reason: invalid class name */
/* compiled from: Scaffold.kt */
final class ComposableSingletons$ScaffoldKt$lambda3$1 extends Lambda implements q<SnackbarHostState, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$ScaffoldKt$lambda3$1 f4933a = new ComposableSingletons$ScaffoldKt$lambda3$1();

    ComposableSingletons$ScaffoldKt$lambda3$1() {
        super(3);
    }

    public final void a(SnackbarHostState snackbarHostState, g gVar, int i11) {
        p.j(snackbarHostState, "it");
        if ((i11 & 14) == 0) {
            i11 |= gVar.k(snackbarHostState) ? 4 : 2;
        }
        if (((i11 & 91) ^ 18) != 0 || !gVar.b()) {
            SnackbarHostKt.b(snackbarHostState, (d) null, (q<? super v, ? super g, ? super Integer, k>) null, gVar, i11 & 14, 6);
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((SnackbarHostState) obj, (g) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }
}
