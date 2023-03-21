package androidx.compose.animation.core;

import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$IntOffsetToVector$1 extends Lambda implements l<d2.l, v1.l> {

    /* renamed from: a  reason: collision with root package name */
    public static final VectorConvertersKt$IntOffsetToVector$1 f2803a = new VectorConvertersKt$IntOffsetToVector$1();

    VectorConvertersKt$IntOffsetToVector$1() {
        super(1);
    }

    public final v1.l a(long j) {
        return new v1.l((float) d2.l.j(j), (float) d2.l.k(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((d2.l) obj).n());
    }
}
