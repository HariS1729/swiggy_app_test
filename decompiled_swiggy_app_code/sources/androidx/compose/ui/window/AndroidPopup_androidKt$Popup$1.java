package androidx.compose.ui.window;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.a;

/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f7788a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f7789b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ lp0.a<k> f7790c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h f7791d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f7792e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f7793f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f7794g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$1(a aVar, long j, lp0.a<k> aVar2, h hVar, p<? super g, ? super Integer, k> pVar, int i11, int i12) {
        super(2);
        this.f7788a = aVar;
        this.f7789b = j;
        this.f7790c = aVar2;
        this.f7791d = hVar;
        this.f7792e = pVar;
        this.f7793f = i11;
        this.f7794g = i12;
    }

    public final void a(g gVar, int i11) {
        AndroidPopup_androidKt.c(this.f7788a, this.f7789b, this.f7790c, this.f7791d, this.f7792e, gVar, this.f7793f | 1, this.f7794g);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
