package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$SelectionHandle$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f4684a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f4685b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ResolvedTextDirection f4686c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f4687d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ d f4688e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4689f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f4690g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$SelectionHandle$2(long j, boolean z11, ResolvedTextDirection resolvedTextDirection, boolean z12, d dVar, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f4684a = j;
        this.f4685b = z11;
        this.f4686c = resolvedTextDirection;
        this.f4687d = z12;
        this.f4688e = dVar;
        this.f4689f = pVar;
        this.f4690g = i11;
    }

    public final void a(g gVar, int i11) {
        AndroidSelectionHandles_androidKt.c(this.f4684a, this.f4685b, this.f4686c, this.f4687d, this.f4688e, this.f4689f, gVar, this.f4690g | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
