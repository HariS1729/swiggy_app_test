package androidx.compose.ui.window;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.p;

/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$9 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f7816a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a<k> f7817b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f7818c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f7819d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f7820e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f7821f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$9(g gVar, a<k> aVar, h hVar, p<? super g, ? super Integer, k> pVar, int i11, int i12) {
        super(2);
        this.f7816a = gVar;
        this.f7817b = aVar;
        this.f7818c = hVar;
        this.f7819d = pVar;
        this.f7820e = i11;
        this.f7821f = i12;
    }

    public final void a(g gVar, int i11) {
        AndroidPopup_androidKt.a(this.f7816a, this.f7817b, this.f7818c, this.f7819d, gVar, this.f7820e | 1, this.f7821f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
