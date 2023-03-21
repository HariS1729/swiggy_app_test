package b7;

import android.graphics.drawable.Drawable;
import b7.c;
import coil.decode.DataSource;
import coil.size.Scale;
import kotlin.jvm.internal.i;
import x6.d;
import x6.h;
import x6.n;

/* compiled from: CrossfadeTransition.kt */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final d f12583a;

    /* renamed from: b  reason: collision with root package name */
    private final h f12584b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12585c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12586d;

    public a(d dVar, h hVar, int i11, boolean z11) {
        this.f12583a = dVar;
        this.f12584b = hVar;
        this.f12585c = i11;
        this.f12586d = z11;
        if (!(i11 > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    public void a() {
        Drawable a11 = this.f12583a.a();
        Drawable a12 = this.f12584b.a();
        Scale J = this.f12584b.b().J();
        int i11 = this.f12585c;
        h hVar = this.f12584b;
        q6.a aVar = new q6.a(a11, a12, J, i11, !(hVar instanceof n) || !((n) hVar).d(), this.f12586d);
        h hVar2 = this.f12584b;
        if (hVar2 instanceof n) {
            this.f12583a.e(aVar);
        } else if (hVar2 instanceof d) {
            this.f12583a.g(aVar);
        }
    }

    public final int b() {
        return this.f12585c;
    }

    public final boolean c() {
        return this.f12586d;
    }

    /* renamed from: b7.a$a  reason: collision with other inner class name */
    /* compiled from: CrossfadeTransition.kt */
    public static final class C0102a implements c.a {

        /* renamed from: c  reason: collision with root package name */
        private final int f12587c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f12588d;

        public C0102a() {
            this(0, false, 3, (i) null);
        }

        public C0102a(int i11, boolean z11) {
            this.f12587c = i11;
            this.f12588d = z11;
            if (!(i11 > 0)) {
                throw new IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }

        public c a(d dVar, h hVar) {
            if (!(hVar instanceof n)) {
                return c.a.f12592b.a(dVar, hVar);
            }
            if (((n) hVar).c() == DataSource.MEMORY_CACHE) {
                return c.a.f12592b.a(dVar, hVar);
            }
            return new a(dVar, hVar, this.f12587c, this.f12588d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0102a) {
                C0102a aVar = (C0102a) obj;
                if (this.f12587c == aVar.f12587c && this.f12588d == aVar.f12588d) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (this.f12587c * 31) + a0.h.a(this.f12588d);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0102a(int i11, boolean z11, int i12, i iVar) {
            this((i12 & 1) != 0 ? 100 : i11, (i12 & 2) != 0 ? false : z11);
        }
    }
}
