package androidx.compose.material;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.b;
import defpackage.a2;
import e0.g;
import i1.e0;
import i1.j0;
import i1.r;
import i1.u;
import i1.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import lp0.q;

/* compiled from: Scaffold.kt */
final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements p<j0, b, u> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5267a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5268b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5269c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f5270d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f5271e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5272f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f5273g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ q<a2.p, g, Integer, k> f5274h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$ScaffoldLayout$1$1(p<? super g, ? super Integer, k> pVar, p<? super g, ? super Integer, k> pVar2, p<? super g, ? super Integer, k> pVar3, int i11, boolean z11, p<? super g, ? super Integer, k> pVar4, int i12, q<? super a2.p, ? super g, ? super Integer, k> qVar) {
        super(2);
        this.f5267a = pVar;
        this.f5268b = pVar2;
        this.f5269c = pVar3;
        this.f5270d = i11;
        this.f5271e = z11;
        this.f5272f = pVar4;
        this.f5273g = i12;
        this.f5274h = qVar;
    }

    public final u a(j0 j0Var, long j) {
        kotlin.jvm.internal.p.j(j0Var, "$this$SubcomposeLayout");
        int n = b.n(j);
        int m11 = b.m(j);
        final long e11 = b.e(j, 0, 0, 0, 0, 10, (Object) null);
        final p<g, Integer, k> pVar = this.f5267a;
        final p<g, Integer, k> pVar2 = this.f5268b;
        final p<g, Integer, k> pVar3 = this.f5269c;
        final int i11 = this.f5270d;
        final boolean z11 = this.f5271e;
        final p<g, Integer, k> pVar4 = this.f5272f;
        final int i12 = this.f5273g;
        final j0 j0Var2 = j0Var;
        final int i13 = n;
        final int i14 = m11;
        final q<a2.p, g, Integer, k> qVar = this.f5274h;
        return v.b(j0Var, n, m11, (Map) null, new l<e0.a, k>() {
            public final void a(e0.a aVar) {
                Object obj;
                Object obj2;
                c0.k kVar;
                Object obj3;
                Integer num;
                int i11;
                int i12;
                int i13;
                int a11;
                int j02;
                Object obj4;
                Object obj5;
                int i14;
                kotlin.jvm.internal.p.j(aVar, "$this$layout");
                List<r> a02 = j0Var2.a0(ScaffoldLayoutContent.TopBar, pVar);
                long j11 = e11;
                ArrayList arrayList = new ArrayList(a02.size());
                int size = a02.size();
                for (int i15 = 0; i15 < size; i15++) {
                    arrayList.add(a02.get(i15).N(j11));
                }
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int e02 = ((e0) obj).e0();
                    int l11 = k.l(arrayList);
                    if (1 <= l11) {
                        int i16 = 1;
                        while (true) {
                            int i17 = i16 + 1;
                            Object obj6 = arrayList.get(i16);
                            int e03 = ((e0) obj6).e0();
                            if (e02 < e03) {
                                obj = obj6;
                                e02 = e03;
                            }
                            if (i16 == l11) {
                                break;
                            }
                            i16 = i17;
                        }
                    }
                }
                e0 e0Var = (e0) obj;
                int e04 = e0Var == null ? 0 : e0Var.e0();
                List<r> a03 = j0Var2.a0(ScaffoldLayoutContent.Snackbar, pVar2);
                long j12 = e11;
                ArrayList arrayList2 = new ArrayList(a03.size());
                int size2 = a03.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    arrayList2.add(a03.get(i18).N(j12));
                }
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = arrayList2.get(0);
                    int e05 = ((e0) obj2).e0();
                    int l12 = k.l(arrayList2);
                    if (1 <= l12) {
                        int i19 = 1;
                        while (true) {
                            int i21 = i19 + 1;
                            Object obj7 = arrayList2.get(i19);
                            int e06 = ((e0) obj7).e0();
                            if (e05 < e06) {
                                obj2 = obj7;
                                e05 = e06;
                            }
                            if (i19 == l12) {
                                break;
                            }
                            i19 = i21;
                        }
                    }
                }
                e0 e0Var2 = (e0) obj2;
                int e07 = e0Var2 == null ? 0 : e0Var2.e0();
                List<r> a04 = j0Var2.a0(ScaffoldLayoutContent.Fab, pVar3);
                long j13 = e11;
                ArrayList arrayList3 = new ArrayList();
                for (r N : a04) {
                    e0 N2 = N.N(j13);
                    if (!((N2.e0() == 0 || N2.A0() == 0) ? false : true)) {
                        N2 = null;
                    }
                    if (N2 != null) {
                        arrayList3.add(N2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        obj4 = null;
                    } else {
                        obj4 = arrayList3.get(0);
                        int A0 = ((e0) obj4).A0();
                        int l13 = k.l(arrayList3);
                        if (1 <= l13) {
                            int i22 = 1;
                            while (true) {
                                int i23 = i22 + 1;
                                Object obj8 = arrayList3.get(i22);
                                int A02 = ((e0) obj8).A0();
                                if (A0 < A02) {
                                    A0 = A02;
                                    obj4 = obj8;
                                }
                                if (i22 == l13) {
                                    break;
                                }
                                i22 = i23;
                            }
                        }
                    }
                    kotlin.jvm.internal.p.g(obj4);
                    int A03 = ((e0) obj4).A0();
                    if (arrayList3.isEmpty()) {
                        obj5 = null;
                    } else {
                        obj5 = arrayList3.get(0);
                        int e08 = ((e0) obj5).e0();
                        int l14 = k.l(arrayList3);
                        if (1 <= l14) {
                            int i24 = 1;
                            while (true) {
                                int i25 = i24 + 1;
                                Object obj9 = arrayList3.get(i24);
                                int e09 = ((e0) obj9).e0();
                                if (e08 < e09) {
                                    e08 = e09;
                                    obj5 = obj9;
                                }
                                if (i24 == l14) {
                                    break;
                                }
                                i24 = i25;
                            }
                        }
                    }
                    kotlin.jvm.internal.p.g(obj5);
                    int e010 = ((e0) obj5).e0();
                    if (!c0.l.e(i11, c0.l.f12731b.a())) {
                        i14 = (i13 - A03) / 2;
                    } else if (j0Var2.getLayoutDirection() == LayoutDirection.Ltr) {
                        i14 = (i13 - j0Var2.j0(ScaffoldKt.f5226b)) - A03;
                    } else {
                        i14 = j0Var2.j0(ScaffoldKt.f5226b);
                    }
                    kVar = new c0.k(z11, i14, A03, e010);
                } else {
                    kVar = null;
                }
                List<r> a05 = j0Var2.a0(ScaffoldLayoutContent.BottomBar, l0.b.c(-985538854, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(kVar, pVar4, i12)));
                long j14 = e11;
                ArrayList arrayList4 = new ArrayList(a05.size());
                int size3 = a05.size();
                for (int i26 = 0; i26 < size3; i26++) {
                    arrayList4.add(a05.get(i26).N(j14));
                }
                if (arrayList4.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList4.get(0);
                    int e011 = ((e0) obj3).e0();
                    int l15 = k.l(arrayList4);
                    if (1 <= l15) {
                        int i27 = 1;
                        while (true) {
                            int i28 = i27 + 1;
                            Object obj10 = arrayList4.get(i27);
                            int e012 = ((e0) obj10).e0();
                            if (e011 < e012) {
                                e011 = e012;
                                obj3 = obj10;
                            }
                            if (i27 == l15) {
                                break;
                            }
                            i27 = i28;
                        }
                    }
                }
                e0 e0Var3 = (e0) obj3;
                int e013 = e0Var3 == null ? 0 : e0Var3.e0();
                if (kVar == null) {
                    num = null;
                } else {
                    j0 j0Var = j0Var2;
                    boolean z11 = z11;
                    if (e013 == 0) {
                        a11 = kVar.a();
                        j02 = j0Var.j0(ScaffoldKt.f5226b);
                    } else if (z11) {
                        i13 = e013 + (kVar.a() / 2);
                        num = Integer.valueOf(i13);
                    } else {
                        a11 = kVar.a() + e013;
                        j02 = j0Var.j0(ScaffoldKt.f5226b);
                    }
                    i13 = a11 + j02;
                    num = Integer.valueOf(i13);
                }
                if (e07 != 0) {
                    if (num == null) {
                        i12 = e013;
                    } else {
                        i12 = num.intValue();
                    }
                    i11 = e07 + i12;
                } else {
                    i11 = 0;
                }
                int i29 = i14 - e04;
                j0 j0Var2 = j0Var2;
                List<r> a06 = j0Var2.a0(ScaffoldLayoutContent.MainContent, l0.b.c(-985545322, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(j0Var2, e013, qVar, i12)));
                long j15 = e11;
                ArrayList arrayList5 = new ArrayList(a06.size());
                int size4 = a06.size();
                int i31 = 0;
                while (i31 < size4) {
                    arrayList5.add(a06.get(i31).N(b.e(j15, 0, 0, 0, i29, 7, (Object) null)));
                    i31++;
                    i29 = i29;
                    a06 = a06;
                }
                int i32 = 0;
                for (int size5 = arrayList5.size(); i32 < size5; size5 = size5) {
                    e0.a.j(aVar, (e0) arrayList5.get(i32), 0, e04, 0.0f, 4, (Object) null);
                    i32++;
                }
                int size6 = arrayList.size();
                for (int i33 = 0; i33 < size6; i33++) {
                    e0.a.j(aVar, (e0) arrayList.get(i33), 0, 0, 0.0f, 4, (Object) null);
                }
                int i34 = i14;
                int size7 = arrayList2.size();
                for (int i35 = 0; i35 < size7; i35++) {
                    e0.a.j(aVar, (e0) arrayList2.get(i35), 0, i34 - i11, 0.0f, 4, (Object) null);
                }
                int i36 = i14;
                int size8 = arrayList4.size();
                for (int i37 = 0; i37 < size8; i37++) {
                    e0.a.j(aVar, (e0) arrayList4.get(i37), 0, i36 - e013, 0.0f, 4, (Object) null);
                }
                if (kVar != null) {
                    int i38 = i14;
                    int size9 = arrayList3.size();
                    for (int i39 = 0; i39 < size9; i39++) {
                        int b11 = kVar.b();
                        kotlin.jvm.internal.p.g(num);
                        e0.a.j(aVar, (e0) arrayList3.get(i39), b11, i38 - num.intValue(), 0.0f, 4, (Object) null);
                    }
                    k kVar2 = k.f22762a;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((e0.a) obj);
                return k.f22762a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((j0) obj, ((b) obj2).t());
    }
}
