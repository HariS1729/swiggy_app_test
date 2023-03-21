package androidx.compose.foundation.text.selection;

import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import t0.f;
import t0.g;

/* compiled from: SelectionMagnifier.kt */
final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 extends Lambda implements l<f, v1.l> {

    /* renamed from: a  reason: collision with root package name */
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 f4714a = new SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1();

    SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1() {
        super(1);
    }

    public final v1.l a(long j) {
        if (g.c(j)) {
            return new v1.l(f.m(j), f.n(j));
        }
        return SelectionMagnifierKt.f4710a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((f) obj).u());
    }
}
