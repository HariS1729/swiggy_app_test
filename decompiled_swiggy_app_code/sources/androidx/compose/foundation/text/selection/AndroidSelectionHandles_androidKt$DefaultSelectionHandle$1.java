package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f4666a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f4667b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ResolvedTextDirection f4668c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f4669d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f4670e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1(d dVar, boolean z11, ResolvedTextDirection resolvedTextDirection, boolean z12, int i11) {
        super(2);
        this.f4666a = dVar;
        this.f4667b = z11;
        this.f4668c = resolvedTextDirection;
        this.f4669d = z12;
        this.f4670e = i11;
    }

    public final void a(g gVar, int i11) {
        AndroidSelectionHandles_androidKt.a(this.f4666a, this.f4667b, this.f4668c, this.f4669d, gVar, this.f4670e | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
