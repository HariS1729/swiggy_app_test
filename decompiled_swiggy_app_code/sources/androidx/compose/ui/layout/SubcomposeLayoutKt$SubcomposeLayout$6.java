package androidx.compose.ui.layout;

import bp0.k;
import d2.b;
import e0.g;
import i1.j0;
import i1.u;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: SubcomposeLayout.kt */
final class SubcomposeLayoutKt$SubcomposeLayout$6 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SubcomposeLayoutState f6782a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f6783b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<j0, b, u> f6784c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f6785d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f6786e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutKt$SubcomposeLayout$6(SubcomposeLayoutState subcomposeLayoutState, d dVar, p<? super j0, ? super b, ? extends u> pVar, int i11, int i12) {
        super(2);
        this.f6782a = subcomposeLayoutState;
        this.f6783b = dVar;
        this.f6784c = pVar;
        this.f6785d = i11;
        this.f6786e = i12;
    }

    public final void a(g gVar, int i11) {
        SubcomposeLayoutKt.a(this.f6782a, this.f6783b, this.f6784c, gVar, this.f6785d | 1, this.f6786e);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
