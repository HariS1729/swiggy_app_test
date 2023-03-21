package androidx.compose.animation;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.q;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentMeasurePolicy$measure$3 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0[] f2436a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AnimatedContentMeasurePolicy f2437b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f2438c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f2439d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentMeasurePolicy$measure$3(e0[] e0VarArr, AnimatedContentMeasurePolicy animatedContentMeasurePolicy, int i11, int i12) {
        super(1);
        this.f2436a = e0VarArr;
        this.f2437b = animatedContentMeasurePolicy;
        this.f2438c = i11;
        this.f2439d = i12;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0[] e0VarArr = this.f2436a;
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this.f2437b;
        int i11 = this.f2438c;
        int i12 = this.f2439d;
        int length = e0VarArr.length;
        int i13 = 0;
        while (i13 < length) {
            e0 e0Var = e0VarArr[i13];
            i13++;
            if (e0Var != null) {
                long a11 = animatedContentMeasurePolicy.f().g().a(q.a(e0Var.A0(), e0Var.e0()), q.a(i11, i12), LayoutDirection.Ltr);
                e0.a.j(aVar, e0Var, d2.l.j(a11), d2.l.k(a11), 0.0f, 4, (Object) null);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
