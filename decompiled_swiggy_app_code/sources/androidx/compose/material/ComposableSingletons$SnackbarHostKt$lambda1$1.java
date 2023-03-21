package androidx.compose.material;

import bp0.k;
import c0.v;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;
import u0.j1;

/* renamed from: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1  reason: invalid class name */
/* compiled from: SnackbarHost.kt */
final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends Lambda implements q<v, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 f4937a = new ComposableSingletons$SnackbarHostKt$lambda1$1();

    ComposableSingletons$SnackbarHostKt$lambda1$1() {
        super(3);
    }

    public final void a(v vVar, g gVar, int i11) {
        int i12;
        v vVar2 = vVar;
        p.j(vVar2, "it");
        g gVar2 = gVar;
        if ((i11 & 14) == 0) {
            i12 = i11 | (gVar2.k(vVar2) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (((i12 & 91) ^ 18) != 0 || !gVar.b()) {
            SnackbarKt.d(vVar, (d) null, false, (j1) null, 0, 0, 0, 0.0f, gVar, i12 & 14, 254);
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((v) obj, (g) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }
}
