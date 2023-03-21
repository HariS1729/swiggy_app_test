package w;

import androidx.compose.runtime.snapshots.b;
import bp0.k;
import e0.a1;
import e0.h0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LazyListScrollPosition.kt */
public final class r {

    /* renamed from: e  reason: collision with root package name */
    private static final a f17398e = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final h0 f17399a;

    /* renamed from: b  reason: collision with root package name */
    private final h0 f17400b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17401c;

    /* renamed from: d  reason: collision with root package name */
    private Object f17402d;

    /* compiled from: LazyListScrollPosition.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
            r2 = r4.b().get(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int b(java.lang.Object r2, int r3, w.k r4) {
            /*
                r1 = this;
                if (r2 != 0) goto L_0x0003
                return r3
            L_0x0003:
                int r0 = r4.getItemCount()
                if (r3 >= r0) goto L_0x0014
                java.lang.Object r0 = r4.c(r3)
                boolean r0 = kotlin.jvm.internal.p.e(r2, r0)
                if (r0 == 0) goto L_0x0014
                return r3
            L_0x0014:
                java.util.Map r4 = r4.b()
                java.lang.Object r2 = r4.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 == 0) goto L_0x0029
                int r2 = r2.intValue()
                int r2 = w.a.b(r2)
                return r2
            L_0x0029:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: w.r.a.b(java.lang.Object, int, w.k):int");
        }
    }

    public r(int i11, int i12) {
        this.f17399a = j.e(a.a(a.b(i11)), (a1) null, 2, (Object) null);
        this.f17400b = j.e(Integer.valueOf(i12), (a1) null, 2, (Object) null);
    }

    private final void e(int i11) {
        this.f17400b.setValue(Integer.valueOf(i11));
    }

    private final void f(int i11, int i12) {
        if (((float) i11) >= 0.0f) {
            if (!a.d(i11, a())) {
                d(i11);
            }
            if (i12 != b()) {
                e(i12);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i11 + ')').toString());
    }

    public final int a() {
        return ((a) this.f17399a.getValue()).g();
    }

    public final int b() {
        return ((Number) this.f17400b.getValue()).intValue();
    }

    public final void c(int i11, int i12) {
        f(i11, i12);
        this.f17402d = null;
    }

    public final void d(int i11) {
        this.f17399a.setValue(a.a(i11));
    }

    public final void g(m mVar) {
        b k;
        p.j(mVar, "measureResult");
        s g11 = mVar.g();
        this.f17402d = g11 != null ? g11.c() : null;
        if (this.f17401c || mVar.b() > 0) {
            boolean z11 = true;
            this.f17401c = true;
            int h11 = mVar.h();
            int i11 = 0;
            if (((float) h11) < 0.0f) {
                z11 = false;
            }
            if (z11) {
                b a11 = b.f6287e.a();
                try {
                    k = a11.k();
                    s g12 = mVar.g();
                    if (g12 != null) {
                        i11 = g12.b();
                    }
                    f(a.b(i11), h11);
                    k kVar = k.f22762a;
                    a11.r(k);
                    a11.d();
                } catch (Throwable th2) {
                    a11.d();
                    throw th2;
                }
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + h11 + ')').toString());
            }
        }
    }

    public final void h(k kVar) {
        b k;
        p.j(kVar, "itemProvider");
        b a11 = b.f6287e.a();
        try {
            k = a11.k();
            f(f17398e.b(this.f17402d, a(), kVar), b());
            k kVar2 = k.f22762a;
            a11.r(k);
            a11.d();
        } catch (Throwable th2) {
            a11.d();
            throw th2;
        }
    }
}
