package androidx.compose.ui.window;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: AndroidDialog.android.kt */
final class AndroidDialog_androidKt$DialogLayout$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f7782a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f7783b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f7784c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f7785d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDialog_androidKt$DialogLayout$2(d dVar, p<? super g, ? super Integer, k> pVar, int i11, int i12) {
        super(2);
        this.f7782a = dVar;
        this.f7783b = pVar;
        this.f7784c = i11;
        this.f7785d = i12;
    }

    public final void a(g gVar, int i11) {
        AndroidDialog_androidKt.c(this.f7782a, this.f7783b, gVar, this.f7784c | 1, this.f7785d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
