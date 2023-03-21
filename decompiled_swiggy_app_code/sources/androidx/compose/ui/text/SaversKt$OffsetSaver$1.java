package androidx.compose.ui.text;

import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;
import t0.f;

/* compiled from: Savers.kt */
final class SaversKt$OffsetSaver$1 extends Lambda implements p<d, f, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaversKt$OffsetSaver$1 f7502a = new SaversKt$OffsetSaver$1();

    SaversKt$OffsetSaver$1() {
        super(2);
    }

    public final Object a(d dVar, long j) {
        kotlin.jvm.internal.p.j(dVar, "$this$Saver");
        if (f.j(j, f.f16662b.b())) {
            return Boolean.FALSE;
        }
        return k.f((Float) SaversKt.s(Float.valueOf(f.m(j))), (Float) SaversKt.s(Float.valueOf(f.n(j))));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((d) obj, ((f) obj2).u());
    }
}
