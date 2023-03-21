package androidx.compose.ui.platform;

import android.content.res.Configuration;
import bp0.k;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidCompositionLocals.android.kt */
final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 extends Lambda implements l<Configuration, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h0<Configuration> f7054a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(h0<Configuration> h0Var) {
        super(1);
        this.f7054a = h0Var;
    }

    public final void a(Configuration configuration) {
        p.j(configuration, "it");
        AndroidCompositionLocals_androidKt.c(this.f7054a, configuration);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Configuration) obj);
        return k.f22762a;
    }
}
