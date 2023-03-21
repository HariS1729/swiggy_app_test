package androidx.compose.foundation.text;

import bp0.k;
import e0.g;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p1.b;

/* compiled from: BasicText.kt */
final class BasicTextKt$BasicText$6 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f4279a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<b.C0163b<q<String, g, Integer, k>>> f4280b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f4281c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicTextKt$BasicText$6(b bVar, List<b.C0163b<q<String, g, Integer, k>>> list, int i11) {
        super(2);
        this.f4279a = bVar;
        this.f4280b = list;
        this.f4281c = i11;
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) != 2 || !gVar.b()) {
            CoreTextKt.a(this.f4279a, this.f4280b, gVar, (this.f4281c & 14) | 64);
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
