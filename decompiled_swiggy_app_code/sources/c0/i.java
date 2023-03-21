package c0;

import androidx.compose.animation.core.Animatable;
import bp0.k;
import d2.h;
import defpackage.v1;
import fp0.c;
import lp0.l;

/* compiled from: Elevation.kt */
public final class i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final v1.p0<h> f12724a = new v1.p0(120, 0, v1.z.b(), 2, (kotlin.jvm.internal.i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final v1.p0<h> f12725b = new v1.p0(150, 0, new v1.s(0.4f, 0.0f, 0.6f, 1.0f), 2, (kotlin.jvm.internal.i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final v1.p0<h> f12726c = new v1.p0(120, 0, new v1.s(0.4f, 0.0f, 0.6f, 1.0f), 2, (kotlin.jvm.internal.i) null);

    public static final Object d(Animatable<h, ?> animatable, float f11, u.h hVar, u.h hVar2, c<? super k> cVar) {
        v1.g<h> b11;
        if (hVar2 != null) {
            b11 = h.f12723a.a(hVar2);
        } else {
            b11 = hVar != null ? h.f12723a.b(hVar) : null;
        }
        v1.g<h> gVar = b11;
        if (gVar != null) {
            Object f12 = Animatable.f(animatable, h.k(f11), gVar, (Object) null, (l) null, cVar, 12, (Object) null);
            return f12 == b.d() ? f12 : k.f22762a;
        }
        Object v = animatable.v(h.k(f11), cVar);
        return v == b.d() ? v : k.f22762a;
    }
}
