package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import defpackage.a2;
import i1.e0;
import i1.r;
import i1.w;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.s;

/* compiled from: RowColumnImpl.kt */
final class RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<r> f3794a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e0[] f3795b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s<Integer, int[], LayoutDirection, e, int[], k> f3796c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f3797d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ w f3798e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int[] f3799f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ LayoutOrientation f3800g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ a2.r[] f3801h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ a2.i f3802i;
    final /* synthetic */ int j;
    final /* synthetic */ Ref$IntRef k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4(List<? extends r> list, e0[] e0VarArr, s<? super Integer, ? super int[], ? super LayoutDirection, ? super e, ? super int[], k> sVar, int i11, w wVar, int[] iArr, LayoutOrientation layoutOrientation, a2.r[] rVarArr, a2.i iVar, int i12, Ref$IntRef ref$IntRef) {
        super(1);
        this.f3794a = list;
        this.f3795b = e0VarArr;
        this.f3796c = sVar;
        this.f3797d = i11;
        this.f3798e = wVar;
        this.f3799f = iArr;
        this.f3800g = layoutOrientation;
        this.f3801h = rVarArr;
        this.f3802i = iVar;
        this.j = i12;
        this.k = ref$IntRef;
    }

    public final void a(e0.a aVar) {
        LayoutDirection layoutDirection;
        int[] iArr;
        int i11;
        p.j(aVar, "$this$layout");
        int size = this.f3794a.size();
        int[] iArr2 = new int[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            e0 e0Var = this.f3795b[i13];
            p.g(e0Var);
            iArr2[i13] = RowColumnImplKt.A(e0Var, this.f3800g);
        }
        this.f3796c.P(Integer.valueOf(this.f3797d), iArr2, this.f3798e.getLayoutDirection(), this.f3798e, this.f3799f);
        e0[] e0VarArr = this.f3795b;
        a2.r[] rVarArr = this.f3801h;
        a2.i iVar = this.f3802i;
        int i14 = this.j;
        LayoutOrientation layoutOrientation = this.f3800g;
        w wVar = this.f3798e;
        Ref$IntRef ref$IntRef = this.k;
        int[] iArr3 = this.f3799f;
        int length = e0VarArr.length;
        int i15 = 0;
        while (i12 < length) {
            e0 e0Var2 = e0VarArr[i12];
            int i16 = i15 + 1;
            p.g(e0Var2);
            a2.i i17 = RowColumnImplKt.q(rVarArr[i15]);
            if (i17 == null) {
                i17 = iVar;
            }
            int o11 = i14 - RowColumnImplKt.z(e0Var2, layoutOrientation);
            LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
            if (layoutOrientation == layoutOrientation2) {
                layoutDirection = LayoutDirection.Ltr;
            } else {
                layoutDirection = wVar.getLayoutDirection();
            }
            e0[] e0VarArr2 = e0VarArr;
            LayoutDirection layoutDirection2 = layoutDirection;
            int i18 = length;
            int a11 = i17.a(o11, layoutDirection2, e0Var2, ref$IntRef.f25664a);
            if (layoutOrientation == layoutOrientation2) {
                iArr = iArr3;
                i11 = i12;
                e0.a.j(aVar, e0Var2, iArr3[i15], a11, 0.0f, 4, (Object) null);
            } else {
                iArr = iArr3;
                i11 = i12;
                e0.a.j(aVar, e0Var2, a11, iArr[i15], 0.0f, 4, (Object) null);
            }
            i12 = i11 + 1;
            i15 = i16;
            length = i18;
            e0VarArr = e0VarArr2;
            iArr3 = iArr;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
