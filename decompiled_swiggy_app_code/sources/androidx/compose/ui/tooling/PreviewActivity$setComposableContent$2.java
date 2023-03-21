package androidx.compose.ui.tooling;

import b2.a;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: PreviewActivity.kt */
final class PreviewActivity$setComposableContent$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f7675a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f7676b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreviewActivity$setComposableContent$2(String str, String str2) {
        super(2);
        this.f7675a = str;
        this.f7676b = str2;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            a.f12573a.h(this.f7675a, this.f7676b, gVar, new Object[0]);
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
