package androidx.compose.foundation.layout;

import bp0.k;
import i1.e0;
import i1.r;
import i1.w;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.a;

/* compiled from: Box.kt */
final class BoxKt$boxMeasurePolicy$1$measure$5 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0[] f3692a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<r> f3693b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ w f3694c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Ref$IntRef f3695d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Ref$IntRef f3696e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a f3697f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BoxKt$boxMeasurePolicy$1$measure$5(e0[] e0VarArr, List<? extends r> list, w wVar, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, a aVar) {
        super(1);
        this.f3692a = e0VarArr;
        this.f3693b = list;
        this.f3694c = wVar;
        this.f3695d = ref$IntRef;
        this.f3696e = ref$IntRef2;
        this.f3697f = aVar;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0[] e0VarArr = this.f3692a;
        List<r> list = this.f3693b;
        w wVar = this.f3694c;
        Ref$IntRef ref$IntRef = this.f3695d;
        Ref$IntRef ref$IntRef2 = this.f3696e;
        a aVar2 = this.f3697f;
        int length = e0VarArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i12 < length) {
            e0 e0Var = e0VarArr[i12];
            int i13 = i11 + 1;
            Objects.requireNonNull(e0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            BoxKt.g(aVar, e0Var, list.get(i11), wVar.getLayoutDirection(), ref$IntRef.f25664a, ref$IntRef2.f25664a, aVar2);
            i12++;
            i11 = i13;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
