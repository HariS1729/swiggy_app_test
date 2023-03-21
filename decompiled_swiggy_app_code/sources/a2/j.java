package a2;

import d2.r;
import d2.s;
import kotlin.jvm.internal.i;

/* compiled from: TextIndent.kt */
public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f940c = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final j f941d = new j(0, 0, 3, (i) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f942a;

    /* renamed from: b  reason: collision with root package name */
    private final long f943b;

    /* compiled from: TextIndent.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final j a() {
            return j.f941d;
        }
    }

    private j(long j, long j11) {
        this.f942a = j;
        this.f943b = j11;
    }

    public /* synthetic */ j(long j, long j11, i iVar) {
        this(j, j11);
    }

    public final long b() {
        return this.f942a;
    }

    public final long c() {
        return this.f943b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return r.e(this.f942a, jVar.f942a) && r.e(this.f943b, jVar.f943b);
    }

    public int hashCode() {
        return (r.i(this.f942a) * 31) + r.i(this.f943b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + r.j(this.f942a) + ", restLine=" + r.j(this.f943b) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(long j, long j11, int i11, i iVar) {
        this((i11 & 1) != 0 ? s.f(0) : j, (i11 & 2) != 0 ? s.f(0) : j11, (i) null);
    }
}
