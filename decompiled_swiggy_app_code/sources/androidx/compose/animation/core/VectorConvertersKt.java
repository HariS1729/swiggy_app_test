package androidx.compose.animation.core;

import d2.h;
import d2.j;
import d2.l;
import d2.p;
import defpackage.v1;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import t0.f;
import t0.h;
import t0.l;

/* compiled from: VectorConverters.kt */
public final class VectorConvertersKt {

    /* renamed from: a  reason: collision with root package name */
    private static final v1.q0<Float, v1.k> f2788a = a(VectorConvertersKt$FloatToVector$1.f2801a, VectorConvertersKt$FloatToVector$2.f2802a);

    /* renamed from: b  reason: collision with root package name */
    private static final v1.q0<Integer, v1.k> f2789b = a(VectorConvertersKt$IntToVector$1.f2807a, VectorConvertersKt$IntToVector$2.f2808a);

    /* renamed from: c  reason: collision with root package name */
    private static final v1.q0<h, v1.k> f2790c = a(VectorConvertersKt$DpToVector$1.f2799a, VectorConvertersKt$DpToVector$2.f2800a);

    /* renamed from: d  reason: collision with root package name */
    private static final v1.q0<j, v1.l> f2791d = a(VectorConvertersKt$DpOffsetToVector$1.f2797a, VectorConvertersKt$DpOffsetToVector$2.f2798a);

    /* renamed from: e  reason: collision with root package name */
    private static final v1.q0<l, v1.l> f2792e = a(VectorConvertersKt$SizeToVector$1.f2813a, VectorConvertersKt$SizeToVector$2.f2814a);

    /* renamed from: f  reason: collision with root package name */
    private static final v1.q0<f, v1.l> f2793f = a(VectorConvertersKt$OffsetToVector$1.f2809a, VectorConvertersKt$OffsetToVector$2.f2810a);

    /* renamed from: g  reason: collision with root package name */
    private static final v1.q0<d2.l, v1.l> f2794g = a(VectorConvertersKt$IntOffsetToVector$1.f2803a, VectorConvertersKt$IntOffsetToVector$2.f2804a);

    /* renamed from: h  reason: collision with root package name */
    private static final v1.q0<p, v1.l> f2795h = a(VectorConvertersKt$IntSizeToVector$1.f2805a, VectorConvertersKt$IntSizeToVector$2.f2806a);

    /* renamed from: i  reason: collision with root package name */
    private static final v1.q0<t0.h, v1.m> f2796i = a(VectorConvertersKt$RectToVector$1.f2811a, VectorConvertersKt$RectToVector$2.f2812a);

    public static final <T, V extends v1.n> v1.q0<T, V> a(lp0.l<? super T, ? extends V> lVar, lp0.l<? super V, ? extends T> lVar2) {
        kotlin.jvm.internal.p.j(lVar, "convertToVector");
        kotlin.jvm.internal.p.j(lVar2, "convertFromVector");
        return new a(lVar, lVar2);
    }

    public static final v1.q0<h, v1.k> b(h.a aVar) {
        kotlin.jvm.internal.p.j(aVar, "<this>");
        return f2790c;
    }

    public static final v1.q0<j, v1.l> c(j.a aVar) {
        kotlin.jvm.internal.p.j(aVar, "<this>");
        return f2791d;
    }

    public static final v1.q0<d2.l, v1.l> d(l.a aVar) {
        kotlin.jvm.internal.p.j(aVar, "<this>");
        return f2794g;
    }

    public static final v1.q0<p, v1.l> e(p.a aVar) {
        kotlin.jvm.internal.p.j(aVar, "<this>");
        return f2795h;
    }

    public static final v1.q0<Float, v1.k> f(k kVar) {
        kotlin.jvm.internal.p.j(kVar, "<this>");
        return f2788a;
    }

    public static final v1.q0<Integer, v1.k> g(o oVar) {
        kotlin.jvm.internal.p.j(oVar, "<this>");
        return f2789b;
    }

    public static final v1.q0<f, v1.l> h(f.a aVar) {
        kotlin.jvm.internal.p.j(aVar, "<this>");
        return f2793f;
    }

    public static final v1.q0<t0.h, v1.m> i(h.a aVar) {
        kotlin.jvm.internal.p.j(aVar, "<this>");
        return f2796i;
    }

    public static final v1.q0<t0.l, v1.l> j(l.a aVar) {
        kotlin.jvm.internal.p.j(aVar, "<this>");
        return f2792e;
    }

    public static final float k(float f11, float f12, float f13) {
        return (f11 * (((float) 1) - f13)) + (f12 * f13);
    }
}
