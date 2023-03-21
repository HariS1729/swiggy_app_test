package androidx.compose.foundation.text.selection;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$HandlePopup$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f4671a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HandleReferencePoint f4672b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4673c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4674d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$HandlePopup$1(long j, HandleReferencePoint handleReferencePoint, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f4671a = j;
        this.f4672b = handleReferencePoint;
        this.f4673c = pVar;
        this.f4674d = i11;
    }

    public final void a(g gVar, int i11) {
        AndroidSelectionHandles_androidKt.b(this.f4671a, this.f4672b, this.f4673c, gVar, this.f4674d | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
