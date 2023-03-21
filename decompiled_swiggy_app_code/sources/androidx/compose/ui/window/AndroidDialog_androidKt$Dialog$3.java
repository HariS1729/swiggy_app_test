package androidx.compose.ui.window;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.p;

/* compiled from: AndroidDialog.android.kt */
final class AndroidDialog_androidKt$Dialog$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a<k> f7771a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f7772b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f7773c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f7774d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f7775e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDialog_androidKt$Dialog$3(a<k> aVar, b bVar, p<? super g, ? super Integer, k> pVar, int i11, int i12) {
        super(2);
        this.f7771a = aVar;
        this.f7772b = bVar;
        this.f7773c = pVar;
        this.f7774d = i11;
        this.f7775e = i12;
    }

    public final void a(g gVar, int i11) {
        AndroidDialog_androidKt.a(this.f7771a, this.f7772b, this.f7773c, gVar, this.f7774d | 1, this.f7775e);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
