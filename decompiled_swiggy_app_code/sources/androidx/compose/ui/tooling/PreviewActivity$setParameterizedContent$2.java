package androidx.compose.ui.tooling;

import b2.a;
import bp0.k;
import e0.g;
import java.util.Arrays;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: PreviewActivity.kt */
final class PreviewActivity$setParameterizedContent$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f7688a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f7689b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object[] f7690c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreviewActivity$setParameterizedContent$2(String str, String str2, Object[] objArr) {
        super(2);
        this.f7688a = str;
        this.f7689b = str2;
        this.f7690c = objArr;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            a aVar = a.f12573a;
            String str = this.f7688a;
            String str2 = this.f7689b;
            Object[] objArr = this.f7690c;
            aVar.h(str, str2, gVar, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
