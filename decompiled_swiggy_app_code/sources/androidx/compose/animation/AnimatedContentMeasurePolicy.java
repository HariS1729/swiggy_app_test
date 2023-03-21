package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentScope;
import d2.q;
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
import kotlin.jvm.internal.p;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentMeasurePolicy implements t {

    /* renamed from: a  reason: collision with root package name */
    private final AnimatedContentScope<?> f2433a;

    public AnimatedContentMeasurePolicy(AnimatedContentScope<?> animatedContentScope) {
        p.j(animatedContentScope, "rootScope");
        this.f2433a = animatedContentScope;
    }

    public int a(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.v(SequencesKt___SequencesKt.s(s.N(list), new AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(i11)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int b(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.v(SequencesKt___SequencesKt.s(s.N(list), new AnimatedContentMeasurePolicy$minIntrinsicHeight$1(i11)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int c(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.v(SequencesKt___SequencesKt.s(s.N(list), new AnimatedContentMeasurePolicy$minIntrinsicWidth$1(i11)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public u d(w wVar, List<? extends r> list, long j) {
        e0 e0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        List<? extends r> list2 = list;
        long j11 = j;
        p.j(wVar, "$receiver");
        p.j(list2, "measurables");
        int size = list.size();
        e0[] e0VarArr = new e0[size];
        int size2 = list.size() - 1;
        e0 e0Var2 = null;
        int i15 = 1;
        if (size2 >= 0) {
            int i16 = 0;
            while (true) {
                int i17 = i16 + 1;
                r rVar = (r) list2.get(i16);
                Object p11 = rVar.p();
                AnimatedContentScope.a aVar = p11 instanceof AnimatedContentScope.a ? (AnimatedContentScope.a) p11 : null;
                if (aVar != null && aVar.a()) {
                    e0VarArr[i16] = rVar.N(j11);
                }
                if (i17 > size2) {
                    break;
                }
                i16 = i17;
            }
        }
        int size3 = list.size() - 1;
        if (size3 >= 0) {
            int i18 = 0;
            while (true) {
                int i19 = i18 + 1;
                r rVar2 = (r) list2.get(i18);
                if (e0VarArr[i18] == null) {
                    e0VarArr[i18] = rVar2.N(j11);
                }
                if (i19 > size3) {
                    break;
                }
                i18 = i19;
            }
        }
        if (size == 0) {
            e0Var = null;
        } else {
            e0Var = e0VarArr[0];
            int O = ArraysKt___ArraysKt.O(e0VarArr);
            if (O != 0) {
                if (e0Var == null) {
                    i13 = 0;
                } else {
                    i13 = e0Var.A0();
                }
                if (1 <= O) {
                    int i21 = 1;
                    while (true) {
                        int i22 = i21 + 1;
                        e0 e0Var3 = e0VarArr[i21];
                        if (e0Var3 == null) {
                            i14 = 0;
                        } else {
                            i14 = e0Var3.A0();
                        }
                        if (i13 < i14) {
                            e0Var = e0Var3;
                            i13 = i14;
                        }
                        if (i21 == O) {
                            break;
                        }
                        i21 = i22;
                    }
                }
            }
        }
        int A0 = e0Var == null ? 0 : e0Var.A0();
        if (!(size == 0)) {
            e0Var2 = e0VarArr[0];
            int O2 = ArraysKt___ArraysKt.O(e0VarArr);
            if (O2 != 0) {
                if (e0Var2 == null) {
                    i11 = 0;
                } else {
                    i11 = e0Var2.e0();
                }
                if (1 <= O2) {
                    while (true) {
                        int i23 = i15 + 1;
                        e0 e0Var4 = e0VarArr[i15];
                        if (e0Var4 == null) {
                            i12 = 0;
                        } else {
                            i12 = e0Var4.e0();
                        }
                        if (i11 < i12) {
                            e0Var2 = e0Var4;
                            i11 = i12;
                        }
                        if (i15 == O2) {
                            break;
                        }
                        i15 = i23;
                    }
                }
            }
        }
        int e02 = e0Var2 == null ? 0 : e0Var2.e0();
        this.f2433a.l(q.a(A0, e02));
        return v.b(wVar, A0, e02, (Map) null, new AnimatedContentMeasurePolicy$measure$3(e0VarArr, this, A0, e02), 4, (Object) null);
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.v(SequencesKt___SequencesKt.s(s.N(list), new AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(i11)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final AnimatedContentScope<?> f() {
        return this.f2433a;
    }
}
