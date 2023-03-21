package androidx.compose.ui.platform;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: AndroidCompositionLocals.android.kt */
final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidComposeView f7061a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f7062b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f7063c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(AndroidComposeView androidComposeView, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f7061a = androidComposeView;
        this.f7062b = pVar;
        this.f7063c = i11;
    }

    public final void a(g gVar, int i11) {
        AndroidCompositionLocals_androidKt.a(this.f7061a, this.f7062b, gVar, this.f7063c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
