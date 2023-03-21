package androidx.compose.animation.core;

import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$IntToVector$1 extends Lambda implements l<Integer, v1.k> {

    /* renamed from: a  reason: collision with root package name */
    public static final VectorConvertersKt$IntToVector$1 f2807a = new VectorConvertersKt$IntToVector$1();

    VectorConvertersKt$IntToVector$1() {
        super(1);
    }

    public final v1.k a(int i11) {
        return new v1.k((float) i11);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
