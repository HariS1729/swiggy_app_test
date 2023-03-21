package u1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Font.kt */
public final class h0 implements h {

    /* renamed from: a  reason: collision with root package name */
    private final int f16911a;

    /* renamed from: b  reason: collision with root package name */
    private final v f16912b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16913c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16914d;

    private h0(int i11, v vVar, int i12, int i13) {
        this.f16911a = i11;
        this.f16912b = vVar;
        this.f16913c = i12;
        this.f16914d = i13;
    }

    public /* synthetic */ h0(int i11, v vVar, int i12, int i13, i iVar) {
        this(i11, vVar, i12, i13);
    }

    public v a() {
        return this.f16912b;
    }

    public int b() {
        return this.f16914d;
    }

    public int c() {
        return this.f16913c;
    }

    public final int d() {
        return this.f16911a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f16911a == h0Var.f16911a && p.e(a(), h0Var.a()) && s.f(c(), h0Var.c()) && q.e(b(), h0Var.b());
    }

    public int hashCode() {
        return (((((this.f16911a * 31) + a().hashCode()) * 31) + s.g(c())) * 31) + q.f(b());
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f16911a + ", weight=" + a() + ", style=" + s.h(c()) + ", loadingStrategy=" + q.g(b()) + ')';
    }
}
