package u0;

import com.BV.LinearGradient.LinearGradientManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.f;
import t0.g;
import t0.l;

/* compiled from: Brush.kt */
public abstract class u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16888b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f16889a;

    /* compiled from: Brush.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public static /* synthetic */ u c(a aVar, List list, long j, long j11, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                j = f.f16662b.c();
            }
            long j12 = j;
            if ((i12 & 4) != 0) {
                j11 = f.f16662b.a();
            }
            long j13 = j11;
            if ((i12 & 8) != 0) {
                i11 = o1.f16850a.a();
            }
            return aVar.a(list, j12, j13, i11);
        }

        public static /* synthetic */ u e(a aVar, List list, long j, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j = f.f16662b.b();
            }
            return aVar.d(list, j);
        }

        public static /* synthetic */ u h(a aVar, List list, float f11, float f12, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                f11 = 0.0f;
            }
            if ((i12 & 4) != 0) {
                f12 = Float.POSITIVE_INFINITY;
            }
            if ((i12 & 8) != 0) {
                i11 = o1.f16850a.a();
            }
            return aVar.f(list, f11, f12, i11);
        }

        public static /* synthetic */ u i(a aVar, Pair[] pairArr, float f11, float f12, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                f11 = 0.0f;
            }
            if ((i12 & 4) != 0) {
                f12 = Float.POSITIVE_INFINITY;
            }
            if ((i12 & 8) != 0) {
                i11 = o1.f16850a.a();
            }
            return aVar.g(pairArr, f11, f12, i11);
        }

        public final u a(List<d0> list, long j, long j11, int i11) {
            p.j(list, LinearGradientManager.PROP_COLORS);
            return new o0(list, (List) null, j, j11, i11, (i) null);
        }

        public final u b(Pair<Float, d0>[] pairArr, long j, long j11, int i11) {
            Pair<Float, d0>[] pairArr2 = pairArr;
            p.j(pairArr, "colorStops");
            ArrayList arrayList = new ArrayList(r1);
            for (Pair<Float, d0> d11 : pairArr2) {
                arrayList.add(d0.h(d11.d().v()));
            }
            ArrayList arrayList2 = new ArrayList(r1);
            for (Pair<Float, d0> c11 : pairArr2) {
                arrayList2.add(Float.valueOf(c11.c().floatValue()));
            }
            return new o0(arrayList, arrayList2, j, j11, i11, (i) null);
        }

        public final u d(List<d0> list, long j) {
            p.j(list, LinearGradientManager.PROP_COLORS);
            return new n1(j, list, (List) null, (i) null);
        }

        public final u f(List<d0> list, float f11, float f12, int i11) {
            p.j(list, LinearGradientManager.PROP_COLORS);
            return a(list, g.a(0.0f, f11), g.a(0.0f, f12), i11);
        }

        public final u g(Pair<Float, d0>[] pairArr, float f11, float f12, int i11) {
            p.j(pairArr, "colorStops");
            return b((Pair[]) Arrays.copyOf(pairArr, pairArr.length), g.a(0.0f, f11), g.a(0.0f, f12), i11);
        }
    }

    private u() {
        this.f16889a = l.f16682b.a();
    }

    public /* synthetic */ u(i iVar) {
        this();
    }

    public abstract void a(long j, t0 t0Var, float f11);
}
