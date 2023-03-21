package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import bp0.k;
import e0.g;
import e0.n0;
import kotlin.jvm.internal.Lambda;
import l0.b;
import lp0.p;
import u0.d0;

/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$Decoration$colorAndEmphasis$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f5554a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Float f5555b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5556c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f5557d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$Decoration$colorAndEmphasis$1(long j, Float f11, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f5554a = j;
        this.f5555b = f11;
        this.f5556c = pVar;
        this.f5557d = i11;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            n0[] n0VarArr = {ContentColorKt.a().c(d0.h(this.f5554a))};
            final Float f11 = this.f5555b;
            final p<g, Integer, k> pVar = this.f5556c;
            final int i12 = this.f5557d;
            final long j = this.f5554a;
            CompositionLocalKt.a(n0VarArr, b.b(gVar, -819900843, true, new p<g, Integer, k>() {
                public final void a(g gVar, int i11) {
                    if (((i11 & 11) ^ 2) == 0 && gVar.b()) {
                        gVar.h();
                    } else if (f11 != null) {
                        gVar.E(-452621457);
                        CompositionLocalKt.a(new n0[]{ContentAlphaKt.a().c(f11)}, pVar, gVar, ((i12 >> 6) & 112) | 8);
                        gVar.P();
                    } else {
                        gVar.E(-452621277);
                        CompositionLocalKt.a(new n0[]{ContentAlphaKt.a().c(Float.valueOf(d0.o(j)))}, pVar, gVar, ((i12 >> 6) & 112) | 8);
                        gVar.P();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((g) obj, ((Number) obj2).intValue());
                    return k.f22762a;
                }
            }), gVar, 56);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
