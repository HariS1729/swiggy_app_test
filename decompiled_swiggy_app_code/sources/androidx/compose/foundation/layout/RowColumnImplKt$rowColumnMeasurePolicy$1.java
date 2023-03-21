package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import defpackage.a2;
import i1.e0;
import i1.i;
import i1.j;
import i1.r;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.p;
import lp0.s;

/* compiled from: RowColumnImpl.kt */
public final class RowColumnImplKt$rowColumnMeasurePolicy$1 implements t {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutOrientation f3789a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f3790b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SizeMode f3791c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ s<Integer, int[], LayoutDirection, e, int[], k> f3792d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a2.i f3793e;

    RowColumnImplKt$rowColumnMeasurePolicy$1(LayoutOrientation layoutOrientation, float f11, SizeMode sizeMode, s<? super Integer, ? super int[], ? super LayoutDirection, ? super e, ? super int[], k> sVar, a2.i iVar) {
        this.f3789a = layoutOrientation;
        this.f3790b = f11;
        this.f3791c = sizeMode;
        this.f3792d = sVar;
        this.f3793e = iVar;
    }

    public int a(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return ((Number) RowColumnImplKt.a(this.f3789a).invoke(list, Integer.valueOf(i11), Integer.valueOf(jVar.j0(this.f3790b)))).intValue();
    }

    public int b(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return ((Number) RowColumnImplKt.c(this.f3789a).invoke(list, Integer.valueOf(i11), Integer.valueOf(jVar.j0(this.f3790b)))).intValue();
    }

    public int c(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return ((Number) RowColumnImplKt.d(this.f3789a).invoke(list, Integer.valueOf(i11), Integer.valueOf(jVar.j0(this.f3790b)))).intValue();
    }

    public u d(w wVar, List<? extends r> list, long j) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        a2.r[] rVarArr;
        int i18;
        int i19;
        w wVar2 = wVar;
        List<? extends r> list2 = list;
        p.j(wVar2, "$this$measure");
        p.j(list2, "measurables");
        a2.o oVar = new a2.o(j, this.f3789a, (kotlin.jvm.internal.i) null);
        int j02 = wVar2.j0(this.f3790b);
        int size = list.size();
        e0[] e0VarArr = new e0[size];
        int size2 = list.size();
        a2.r[] rVarArr2 = new a2.r[size2];
        for (int i21 = 0; i21 < size2; i21++) {
            rVarArr2[i21] = RowColumnImplKt.r((i) list2.get(i21));
        }
        int size3 = list.size();
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        float f12 = 0.0f;
        int i26 = 0;
        boolean z11 = false;
        while (i24 < size3) {
            r rVar = (r) list2.get(i24);
            a2.r rVar2 = rVarArr2[i24];
            float l11 = RowColumnImplKt.t(rVar2);
            if (l11 > 0.0f) {
                f12 += l11;
                i25++;
                i19 = i24;
                i18 = size3;
                rVarArr = rVarArr2;
            } else {
                int e11 = oVar.e();
                int i27 = e11;
                i19 = i24;
                i18 = size3;
                rVarArr = rVarArr2;
                e0 N = rVar.N(a2.o.b(oVar, 0, e11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : e11 - i26, 0, 0, 8, (Object) null).g(this.f3789a));
                int min = Math.min(j02, (i27 - i26) - RowColumnImplKt.A(N, this.f3789a));
                i26 += RowColumnImplKt.A(N, this.f3789a) + min;
                i23 = Math.max(i23, RowColumnImplKt.z(N, this.f3789a));
                boolean z12 = z11 || RowColumnImplKt.x(rVar2);
                e0VarArr[i19] = N;
                i22 = min;
                z11 = z12;
            }
            i24 = i19 + 1;
            size3 = i18;
            rVarArr2 = rVarArr;
        }
        int i28 = i23;
        a2.r[] rVarArr3 = rVarArr2;
        if (i25 == 0) {
            i26 -= i22;
            i12 = i28;
            i11 = 0;
        } else {
            int i29 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i29 <= 0 || oVar.e() == Integer.MAX_VALUE) {
                i15 = oVar.f();
            } else {
                i15 = oVar.e();
            }
            int i31 = j02 * (i25 - 1);
            int i32 = (i15 - i26) - i31;
            float f13 = i29 > 0 ? ((float) i32) / f12 : 0.0f;
            int i33 = 0;
            for (int i34 = 0; i34 < size2; i34++) {
                i33 += c.c(RowColumnImplKt.t(rVarArr3[i34]) * f13);
            }
            int size4 = list.size();
            int i35 = i32 - i33;
            i12 = i28;
            int i36 = 0;
            int i37 = 0;
            while (i36 < size4) {
                if (e0VarArr[i36] == null) {
                    r rVar3 = (r) list2.get(i36);
                    a2.r rVar4 = rVarArr3[i36];
                    float l12 = RowColumnImplKt.t(rVar4);
                    if (l12 > 0.0f) {
                        int a11 = c.a(i35);
                        int i38 = i35 - a11;
                        int max = Math.max(0, c.c(l12 * f13) + a11);
                        f11 = f13;
                        if (!RowColumnImplKt.s(rVar4) || max == Integer.MAX_VALUE) {
                            i16 = size4;
                            i17 = 0;
                        } else {
                            i17 = max;
                            i16 = size4;
                        }
                        int i39 = i38;
                        e0 N2 = rVar3.N(new a2.o(i17, max, 0, oVar.c()).g(this.f3789a));
                        i37 += RowColumnImplKt.A(N2, this.f3789a);
                        i12 = Math.max(i12, RowColumnImplKt.z(N2, this.f3789a));
                        boolean z13 = z11 || RowColumnImplKt.x(rVar4);
                        e0VarArr[i36] = N2;
                        z11 = z13;
                        i35 = i39;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    f11 = f13;
                    i16 = size4;
                }
                i36++;
                list2 = list;
                f13 = f11;
                size4 = i16;
            }
            i11 = l.i(i37 + i31, oVar.e() - i26);
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        if (z11) {
            i13 = 0;
            for (int i41 = 0; i41 < size; i41++) {
                e0 e0Var = e0VarArr[i41];
                p.g(e0Var);
                a2.i i42 = RowColumnImplKt.q(rVarArr3[i41]);
                Integer b11 = i42 != null ? i42.b(e0Var) : null;
                if (b11 != null) {
                    int i43 = ref$IntRef.f25664a;
                    int intValue = b11.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    ref$IntRef.f25664a = Math.max(i43, intValue);
                    int o11 = RowColumnImplKt.z(e0Var, this.f3789a);
                    LayoutOrientation layoutOrientation = this.f3789a;
                    int intValue2 = b11.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = RowColumnImplKt.z(e0Var, layoutOrientation);
                    }
                    i13 = Math.max(i13, o11 - intValue2);
                }
            }
        } else {
            i13 = 0;
        }
        int max2 = Math.max(i26 + i11, oVar.f());
        if (oVar.c() == Integer.MAX_VALUE || this.f3791c != SizeMode.Expand) {
            i14 = Math.max(i12, Math.max(oVar.d(), ref$IntRef.f25664a + i13));
        } else {
            i14 = oVar.c();
        }
        int i44 = i14;
        LayoutOrientation layoutOrientation2 = this.f3789a;
        LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
        int i45 = layoutOrientation2 == layoutOrientation3 ? max2 : i44;
        int i46 = layoutOrientation2 == layoutOrientation3 ? i44 : max2;
        int size5 = list.size();
        int[] iArr = new int[size5];
        for (int i47 = 0; i47 < size5; i47++) {
            iArr[i47] = 0;
        }
        return v.b(wVar, i45, i46, (Map) null, new RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4(list, e0VarArr, this.f3792d, max2, wVar, iArr, this.f3789a, rVarArr3, this.f3793e, i44, ref$IntRef), 4, (Object) null);
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return ((Number) RowColumnImplKt.b(this.f3789a).invoke(list, Integer.valueOf(i11), Integer.valueOf(jVar.j0(this.f3790b)))).intValue();
    }
}
