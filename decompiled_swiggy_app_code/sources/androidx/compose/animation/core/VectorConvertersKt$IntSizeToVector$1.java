package androidx.compose.animation.core;

import d2.p;
import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$IntSizeToVector$1 extends Lambda implements l<p, v1.l> {

    /* renamed from: a  reason: collision with root package name */
    public static final VectorConvertersKt$IntSizeToVector$1 f2805a = new VectorConvertersKt$IntSizeToVector$1();

    VectorConvertersKt$IntSizeToVector$1() {
        super(1);
    }

    public final v1.l a(long j) {
        return new v1.l((float) p.g(j), (float) p.f(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((p) obj).j());
    }
}
