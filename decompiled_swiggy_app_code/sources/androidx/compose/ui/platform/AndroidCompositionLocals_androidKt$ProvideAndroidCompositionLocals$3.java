package androidx.compose.ui.platform;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: AndroidCompositionLocals.android.kt */
final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidComposeView f7057a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ x f7058b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f7059c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f7060d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(AndroidComposeView androidComposeView, x xVar, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f7057a = androidComposeView;
        this.f7058b = xVar;
        this.f7059c = pVar;
        this.f7060d = i11;
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) != 2 || !gVar.b()) {
            CompositionLocalsKt.a(this.f7057a, this.f7058b, this.f7059c, gVar, ((this.f7060d << 3) & 896) | 72);
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
