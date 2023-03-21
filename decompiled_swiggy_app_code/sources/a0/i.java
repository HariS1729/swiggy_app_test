package a0;

import v1.l;
import v1.m;
import v1.q;
import v1.r;

/* compiled from: KeyboardOptions.kt */
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final a f832e = new a((kotlin.jvm.internal.i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final i f833f = new i(0, false, 0, 0, 15, (kotlin.jvm.internal.i) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f834a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f835b;

    /* renamed from: c  reason: collision with root package name */
    private final int f836c;

    /* renamed from: d  reason: collision with root package name */
    private final int f837d;

    /* compiled from: KeyboardOptions.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final i a() {
            return i.f833f;
        }
    }

    private i(int i11, boolean z11, int i12, int i13) {
        this.f834a = i11;
        this.f835b = z11;
        this.f836c = i12;
        this.f837d = i13;
    }

    public /* synthetic */ i(int i11, boolean z11, int i12, int i13, kotlin.jvm.internal.i iVar) {
        this(i11, z11, i12, i13);
    }

    public static /* synthetic */ i c(i iVar, int i11, boolean z11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = iVar.f834a;
        }
        if ((i14 & 2) != 0) {
            z11 = iVar.f835b;
        }
        if ((i14 & 4) != 0) {
            i12 = iVar.f836c;
        }
        if ((i14 & 8) != 0) {
            i13 = iVar.f837d;
        }
        return iVar.b(i11, z11, i12, i13);
    }

    public final i b(int i11, boolean z11, int i12, int i13) {
        return new i(i11, z11, i12, i13, (kotlin.jvm.internal.i) null);
    }

    public final m d(boolean z11) {
        return new m(z11, this.f834a, this.f835b, this.f836c, this.f837d, (kotlin.jvm.internal.i) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return q.f(this.f834a, iVar.f834a) && this.f835b == iVar.f835b && r.k(this.f836c, iVar.f836c) && l.l(this.f837d, iVar.f837d);
    }

    public int hashCode() {
        return (((((q.g(this.f834a) * 31) + h.a(this.f835b)) * 31) + r.l(this.f836c)) * 31) + l.m(this.f837d);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + q.h(this.f834a) + ", autoCorrect=" + this.f835b + ", keyboardType=" + r.m(this.f836c) + ", imeAction=" + l.n(this.f837d) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i11, boolean z11, int i12, int i13, int i14, kotlin.jvm.internal.i iVar) {
        this((i14 & 1) != 0 ? q.f17178a.b() : i11, (i14 & 2) != 0 ? true : z11, (i14 & 4) != 0 ? r.f17183a.h() : i12, (i14 & 8) != 0 ? l.f17134b.a() : i13, (kotlin.jvm.internal.i) null);
    }
}
