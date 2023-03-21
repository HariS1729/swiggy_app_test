package androidx.compose.foundation.layout;

import bp0.k;
import d2.h;
import i1.a;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AlignmentLine.kt */
final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f3647a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f3648b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f3649c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f3650d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f3651e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e0 f3652f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f3653g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlignmentLineKt$alignmentLineOffsetMeasure$1(a aVar, float f11, int i11, int i12, int i13, e0 e0Var, int i14) {
        super(1);
        this.f3647a = aVar;
        this.f3648b = f11;
        this.f3649c = i11;
        this.f3650d = i12;
        this.f3651e = i13;
        this.f3652f = e0Var;
        this.f3653g = i14;
    }

    public final void a(e0.a aVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        p.j(aVar, "$this$layout");
        if (AlignmentLineKt.d(this.f3647a)) {
            i11 = 0;
        } else {
            if (!h.p(this.f3648b, h.f13997b.c())) {
                i14 = this.f3649c;
            } else {
                i14 = (this.f3650d - this.f3651e) - this.f3652f.A0();
            }
            i11 = i14;
        }
        if (!AlignmentLineKt.d(this.f3647a)) {
            i12 = 0;
        } else {
            if (!h.p(this.f3648b, h.f13997b.c())) {
                i13 = this.f3649c;
            } else {
                i13 = (this.f3653g - this.f3651e) - this.f3652f.e0();
            }
            i12 = i13;
        }
        e0.a.n(aVar, this.f3652f, i11, i12, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
