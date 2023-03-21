package androidx.compose.ui.platform;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* renamed from: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda-1$1  reason: invalid class name */
/* compiled from: Wrapper.android.kt */
final class ComposableSingletons$Wrapper_androidKt$lambda1$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$Wrapper_androidKt$lambda1$1 f7099a = new ComposableSingletons$Wrapper_androidKt$lambda1$1();

    ComposableSingletons$Wrapper_androidKt$lambda1$1() {
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
