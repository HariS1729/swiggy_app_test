package w0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.l1;
import u0.m1;
import u0.x0;

/* compiled from: DrawScope.kt */
public final class l extends g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f17437f = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f17438g = l1.f16824b.a();

    /* renamed from: h  reason: collision with root package name */
    private static final int f17439h = m1.f16837b.b();

    /* renamed from: a  reason: collision with root package name */
    private final float f17440a;

    /* renamed from: b  reason: collision with root package name */
    private final float f17441b;

    /* renamed from: c  reason: collision with root package name */
    private final int f17442c;

    /* renamed from: d  reason: collision with root package name */
    private final int f17443d;

    /* renamed from: e  reason: collision with root package name */
    private final x0 f17444e;

    /* compiled from: DrawScope.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return l.f17438g;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(float f11, float f12, int i11, int i12, x0 x0Var, int i13, i iVar) {
        this((i13 & 1) != 0 ? 0.0f : f11, (i13 & 2) != 0 ? 4.0f : f12, (i13 & 4) != 0 ? l1.f16824b.a() : i11, (i13 & 8) != 0 ? m1.f16837b.b() : i12, (i13 & 16) != 0 ? null : x0Var, (i) null);
    }

    public /* synthetic */ l(float f11, float f12, int i11, int i12, x0 x0Var, i iVar) {
        this(f11, f12, i11, i12, x0Var);
    }

    public final int b() {
        return this.f17442c;
    }

    public final int c() {
        return this.f17443d;
    }

    public final float d() {
        return this.f17441b;
    }

    public final x0 e() {
        return this.f17444e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!(this.f17440a == lVar.f17440a)) {
            return false;
        }
        return ((this.f17441b > lVar.f17441b ? 1 : (this.f17441b == lVar.f17441b ? 0 : -1)) == 0) && l1.g(this.f17442c, lVar.f17442c) && m1.g(this.f17443d, lVar.f17443d) && p.e(this.f17444e, lVar.f17444e);
    }

    public final float f() {
        return this.f17440a;
    }

    public int hashCode() {
        int floatToIntBits = ((((((Float.floatToIntBits(this.f17440a) * 31) + Float.floatToIntBits(this.f17441b)) * 31) + l1.h(this.f17442c)) * 31) + m1.h(this.f17443d)) * 31;
        x0 x0Var = this.f17444e;
        return floatToIntBits + (x0Var != null ? x0Var.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.f17440a + ", miter=" + this.f17441b + ", cap=" + l1.i(this.f17442c) + ", join=" + m1.i(this.f17443d) + ", pathEffect=" + this.f17444e + ')';
    }

    private l(float f11, float f12, int i11, int i12, x0 x0Var) {
        super((i) null);
        this.f17440a = f11;
        this.f17441b = f12;
        this.f17442c = i11;
        this.f17443d = i12;
        this.f17444e = x0Var;
    }
}
