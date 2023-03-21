package e0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.p;
import o0.b;

/* compiled from: SlotTable.kt */
final class v implements Iterator<b>, mp0.a {

    /* renamed from: a  reason: collision with root package name */
    private final v0 f14231a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14232b;

    /* renamed from: c  reason: collision with root package name */
    private int f14233c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14234d;

    /* compiled from: SlotTable.kt */
    public static final class a implements b, Iterable<b>, mp0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f14235a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14236b;

        a(v vVar, int i11) {
            this.f14235a = vVar;
            this.f14236b = i11;
        }

        public Iterator<b> iterator() {
            this.f14235a.d();
            v0 b11 = this.f14235a.b();
            int i11 = this.f14236b;
            return new v(b11, i11 + 1, i11 + w0.G(this.f14235a.b().g(), this.f14236b));
        }
    }

    public v(v0 v0Var, int i11, int i12) {
        p.j(v0Var, "table");
        this.f14231a = v0Var;
        this.f14232b = i12;
        this.f14233c = i11;
        this.f14234d = v0Var.l();
        if (v0Var.m()) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: private */
    public final void d() {
        if (this.f14231a.l() != this.f14234d) {
            throw new ConcurrentModificationException();
        }
    }

    public final v0 b() {
        return this.f14231a;
    }

    /* renamed from: c */
    public b next() {
        d();
        int i11 = this.f14233c;
        this.f14233c = w0.G(this.f14231a.g(), i11) + i11;
        return new a(this, i11);
    }

    public boolean hasNext() {
        return this.f14233c < this.f14232b;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
