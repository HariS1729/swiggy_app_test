package androidx.compose.ui.viewinterop;

import android.content.Context;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import p0.d;

/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$4 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Context, T> f7754a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f7755b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<T, k> f7756c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f7757d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f7758e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidView_androidKt$AndroidView$4(l<? super Context, ? extends T> lVar, d dVar, l<? super T, k> lVar2, int i11, int i12) {
        super(2);
        this.f7754a = lVar;
        this.f7755b = dVar;
        this.f7756c = lVar2;
        this.f7757d = i11;
        this.f7758e = i12;
    }

    public final void a(g gVar, int i11) {
        AndroidView_androidKt.a(this.f7754a, this.f7755b, this.f7756c, gVar, this.f7757d | 1, this.f7758e);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
