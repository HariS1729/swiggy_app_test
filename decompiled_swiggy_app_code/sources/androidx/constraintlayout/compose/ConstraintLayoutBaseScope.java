package androidx.constraintlayout.compose;

import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import f2.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintLayoutBaseScope.kt */
public abstract class ConstraintLayoutBaseScope {

    /* renamed from: a  reason: collision with root package name */
    private final List<l<v, k>> f7925a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f7926b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7927c = 1000;

    /* renamed from: d  reason: collision with root package name */
    private int f7928d = 1000;

    /* compiled from: ConstraintLayoutBaseScope.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f7929a;

        public a(Object obj) {
            p.j(obj, DistributedTracing.NR_ID_ATTRIBUTE);
            this.f7929a = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.e(this.f7929a, ((a) obj).f7929a);
        }

        public int hashCode() {
            return this.f7929a.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.f7929a + ')';
        }
    }

    /* compiled from: ConstraintLayoutBaseScope.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Object f7930a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7931b;

        public b(Object obj, int i11) {
            p.j(obj, DistributedTracing.NR_ID_ATTRIBUTE);
            this.f7930a = obj;
            this.f7931b = i11;
        }

        public final Object a() {
            return this.f7930a;
        }

        public final int b() {
            return this.f7931b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p.e(this.f7930a, bVar.f7930a) && this.f7931b == bVar.f7931b;
        }

        public int hashCode() {
            return (this.f7930a.hashCode() * 31) + this.f7931b;
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.f7930a + ", index=" + this.f7931b + ')';
        }
    }

    /* compiled from: ConstraintLayoutBaseScope.kt */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f7932a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7933b;

        public c(Object obj, int i11) {
            p.j(obj, DistributedTracing.NR_ID_ATTRIBUTE);
            this.f7932a = obj;
            this.f7933b = i11;
        }

        public final Object a() {
            return this.f7932a;
        }

        public final int b() {
            return this.f7933b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p.e(this.f7932a, cVar.f7932a) && this.f7933b == cVar.f7933b;
        }

        public int hashCode() {
            return (this.f7932a.hashCode() * 31) + this.f7933b;
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.f7932a + ", index=" + this.f7933b + ')';
        }
    }

    private final int c() {
        int i11 = this.f7928d;
        this.f7928d = i11 + 1;
        return i11;
    }

    private final void g(int i11) {
        this.f7926b = ((this.f7926b * 1009) + i11) % 1000000007;
    }

    public final void a(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        for (l invoke : this.f7925a) {
            invoke.invoke(vVar);
        }
    }

    public final c b(float f11) {
        int c11 = c();
        this.f7925a.add(new ConstraintLayoutBaseScope$createGuidelineFromStart$2(c11, f11));
        g(3);
        g(Float.floatToIntBits(f11));
        return new c(Integer.valueOf(c11), 0);
    }

    public final int d() {
        return this.f7926b;
    }

    /* access modifiers changed from: protected */
    public final List<l<v, k>> e() {
        return this.f7925a;
    }

    public void f() {
        this.f7925a.clear();
        this.f7928d = this.f7927c;
        this.f7926b = 0;
    }
}
