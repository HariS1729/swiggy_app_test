package androidx.compose.foundation.text;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: AndroidCursorHandle.android.kt */
final class AndroidCursorHandle_androidKt$CursorHandle$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f4221a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f4222b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4223c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4224d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCursorHandle_androidKt$CursorHandle$2(long j, d dVar, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f4221a = j;
        this.f4222b = dVar;
        this.f4223c = pVar;
        this.f4224d = i11;
    }

    public final void a(g gVar, int i11) {
        AndroidCursorHandle_androidKt.a(this.f4221a, this.f4222b, this.f4223c, gVar, this.f4224d | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
