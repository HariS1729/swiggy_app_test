package x;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import i1.a;
import i1.e0;
import i1.j0;
import i1.r;
import i1.u;
import i1.w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: LazyLayoutMeasureScope.kt */
public final class f implements e, w {

    /* renamed from: a  reason: collision with root package name */
    private final LazyLayoutItemContentFactory f17632a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f17633b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<Integer, e0[]> f17634c = new HashMap<>();

    public f(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, j0 j0Var) {
        p.j(lazyLayoutItemContentFactory, "itemContentFactory");
        p.j(j0Var, "subcomposeMeasureScope");
        this.f17632a = lazyLayoutItemContentFactory;
        this.f17633b = j0Var;
    }

    public float M(float f11) {
        return this.f17633b.M(f11);
    }

    public long S(long j) {
        return this.f17633b.S(j);
    }

    public float getDensity() {
        return this.f17633b.getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return this.f17633b.getLayoutDirection();
    }

    public int j0(float f11) {
        return this.f17633b.j0(f11);
    }

    public float k(int i11) {
        return this.f17633b.k(i11);
    }

    public float m0(long j) {
        return this.f17633b.m0(j);
    }

    public long o(long j) {
        return this.f17633b.o(j);
    }

    public long q(int i11) {
        return this.f17633b.q(i11);
    }

    public e0[] u(int i11, long j) {
        e0[] e0VarArr = this.f17634c.get(Integer.valueOf(i11));
        if (e0VarArr != null) {
            return e0VarArr;
        }
        Object c11 = this.f17632a.d().invoke().c(i11);
        List<r> a02 = this.f17633b.a0(c11, this.f17632a.b(i11, c11));
        int size = a02.size();
        e0[] e0VarArr2 = new e0[size];
        for (int i12 = 0; i12 < size; i12++) {
            e0VarArr2[i12] = a02.get(i12).N(j);
        }
        this.f17634c.put(Integer.valueOf(i11), e0VarArr2);
        return e0VarArr2;
    }

    public float u0() {
        return this.f17633b.u0();
    }

    public float v0(float f11) {
        return this.f17633b.v0(f11);
    }

    public u x0(int i11, int i12, Map<a, Integer> map, l<? super e0.a, k> lVar) {
        p.j(map, "alignmentLines");
        p.j(lVar, "placementBlock");
        return this.f17633b.x0(i11, i12, map, lVar);
    }

    public int y0(long j) {
        return this.f17633b.y0(j);
    }
}
