package androidx.compose.foundation.text;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: AndroidCursorHandle.android.kt */
final class AndroidCursorHandle_androidKt$CursorHandle$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4218a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f4219b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f4220c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCursorHandle_androidKt$CursorHandle$1(p<? super g, ? super Integer, k> pVar, d dVar, int i11) {
        super(2);
        this.f4218a = pVar;
        this.f4219b = dVar;
        this.f4220c = i11;
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) == 2 && gVar.b()) {
            gVar.h();
        } else if (this.f4218a == null) {
            gVar.E(1275643833);
            AndroidCursorHandle_androidKt.b(this.f4219b, gVar, (this.f4220c >> 3) & 14);
            gVar.P();
        } else {
            gVar.E(1275643903);
            this.f4218a.invoke(gVar, Integer.valueOf((this.f4220c >> 6) & 14));
            gVar.P();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
