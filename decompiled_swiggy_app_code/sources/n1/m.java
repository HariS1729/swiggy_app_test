package n1;

import bp0.k;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;
import p0.e;

/* compiled from: SemanticsModifier.kt */
public final class m implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final a f15805c = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static AtomicInteger f15806d = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    private final int f15807a;

    /* renamed from: b  reason: collision with root package name */
    private final j f15808b;

    /* compiled from: SemanticsModifier.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return m.f15806d.addAndGet(1);
        }
    }

    public m(int i11, boolean z11, boolean z12, l<? super q, k> lVar) {
        p.j(lVar, "properties");
        this.f15807a = i11;
        j jVar = new j();
        jVar.o(z11);
        jVar.n(z12);
        lVar.invoke(jVar);
        this.f15808b = jVar;
    }

    public j A0() {
        return this.f15808b;
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return getId() == mVar.getId() && p.e(A0(), mVar.A0());
    }

    public int getId() {
        return this.f15807a;
    }

    public int hashCode() {
        return (A0().hashCode() * 31) + getId();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
