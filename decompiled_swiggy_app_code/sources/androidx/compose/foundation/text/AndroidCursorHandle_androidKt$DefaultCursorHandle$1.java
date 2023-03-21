package androidx.compose.foundation.text;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: AndroidCursorHandle.android.kt */
final class AndroidCursorHandle_androidKt$DefaultCursorHandle$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f4225a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f4226b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCursorHandle_androidKt$DefaultCursorHandle$1(d dVar, int i11) {
        super(2);
        this.f4225a = dVar;
        this.f4226b = i11;
    }

    public final void a(g gVar, int i11) {
        AndroidCursorHandle_androidKt.b(this.f4225a, gVar, this.f4226b | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
