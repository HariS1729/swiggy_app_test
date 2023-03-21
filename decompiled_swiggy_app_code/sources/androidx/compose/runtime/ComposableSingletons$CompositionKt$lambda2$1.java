package androidx.compose.runtime;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* renamed from: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-2$1  reason: invalid class name */
/* compiled from: Composition.kt */
final class ComposableSingletons$CompositionKt$lambda2$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$CompositionKt$lambda2$1 f5880a = new ComposableSingletons$CompositionKt$lambda2$1();

    ComposableSingletons$CompositionKt$lambda2$1() {
        super(2);
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) == 2 && gVar.b()) {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
