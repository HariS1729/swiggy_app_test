package v1;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.a0;
import p1.b;
import p1.b0;

/* compiled from: EditingBuffer.kt */
public final class g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f17098f = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final t f17099a;

    /* renamed from: b  reason: collision with root package name */
    private int f17100b;

    /* renamed from: c  reason: collision with root package name */
    private int f17101c;

    /* renamed from: d  reason: collision with root package name */
    private int f17102d;

    /* renamed from: e  reason: collision with root package name */
    private int f17103e;

    /* compiled from: EditingBuffer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private g(b bVar, long j) {
        this.f17099a = new t(bVar.g());
        this.f17100b = a0.l(j);
        this.f17101c = a0.k(j);
        this.f17102d = -1;
        this.f17103e = -1;
        int l11 = a0.l(j);
        int k = a0.k(j);
        if (l11 < 0 || l11 > bVar.length()) {
            throw new IndexOutOfBoundsException("start (" + l11 + ") offset is outside of text region " + bVar.length());
        } else if (k < 0 || k > bVar.length()) {
            throw new IndexOutOfBoundsException("end (" + k + ") offset is outside of text region " + bVar.length());
        } else if (l11 > k) {
            throw new IllegalArgumentException("Do not set reversed range: " + l11 + " > " + k);
        }
    }

    public /* synthetic */ g(b bVar, long j, i iVar) {
        this(bVar, j);
    }

    public final void a() {
        this.f17102d = -1;
        this.f17103e = -1;
    }

    public final void b(int i11, int i12) {
        long b11 = b0.b(i11, i12);
        this.f17099a.c(i11, i12, "");
        long a11 = h.a(b0.b(this.f17100b, this.f17101c), b11);
        this.f17100b = a0.l(a11);
        this.f17101c = a0.k(a11);
        if (l()) {
            long a12 = h.a(b0.b(this.f17102d, this.f17103e), b11);
            if (a0.h(a12)) {
                a();
                return;
            }
            this.f17102d = a0.l(a12);
            this.f17103e = a0.k(a12);
        }
    }

    public final char c(int i11) {
        return this.f17099a.a(i11);
    }

    public final a0 d() {
        if (l()) {
            return a0.b(b0.b(this.f17102d, this.f17103e));
        }
        return null;
    }

    public final int e() {
        return this.f17103e;
    }

    public final int f() {
        return this.f17102d;
    }

    public final int g() {
        int i11 = this.f17100b;
        int i12 = this.f17101c;
        if (i11 == i12) {
            return i12;
        }
        return -1;
    }

    public final int h() {
        return this.f17099a.b();
    }

    public final long i() {
        return b0.b(this.f17100b, this.f17101c);
    }

    public final int j() {
        return this.f17101c;
    }

    public final int k() {
        return this.f17100b;
    }

    public final boolean l() {
        return this.f17102d != -1;
    }

    public final void m(int i11, int i12, String str) {
        p.j(str, "text");
        if (i11 < 0 || i11 > this.f17099a.b()) {
            throw new IndexOutOfBoundsException("start (" + i11 + ") offset is outside of text region " + this.f17099a.b());
        } else if (i12 < 0 || i12 > this.f17099a.b()) {
            throw new IndexOutOfBoundsException("end (" + i12 + ") offset is outside of text region " + this.f17099a.b());
        } else if (i11 <= i12) {
            this.f17099a.c(i11, i12, str);
            this.f17100b = str.length() + i11;
            this.f17101c = i11 + str.length();
            this.f17102d = -1;
            this.f17103e = -1;
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i11 + " > " + i12);
        }
    }

    public final void n(int i11, int i12) {
        if (i11 < 0 || i11 > this.f17099a.b()) {
            throw new IndexOutOfBoundsException("start (" + i11 + ") offset is outside of text region " + this.f17099a.b());
        } else if (i12 < 0 || i12 > this.f17099a.b()) {
            throw new IndexOutOfBoundsException("end (" + i12 + ") offset is outside of text region " + this.f17099a.b());
        } else if (i11 < i12) {
            this.f17102d = i11;
            this.f17103e = i12;
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i11 + " > " + i12);
        }
    }

    public final void o(int i11) {
        p(i11, i11);
    }

    public final void p(int i11, int i12) {
        if (i11 < 0 || i11 > this.f17099a.b()) {
            throw new IndexOutOfBoundsException("start (" + i11 + ") offset is outside of text region " + this.f17099a.b());
        } else if (i12 < 0 || i12 > this.f17099a.b()) {
            throw new IndexOutOfBoundsException("end (" + i12 + ") offset is outside of text region " + this.f17099a.b());
        } else if (i11 <= i12) {
            this.f17100b = i11;
            this.f17101c = i12;
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i11 + " > " + i12);
        }
    }

    public final b q() {
        return new b(toString(), (List) null, (List) null, 6, (i) null);
    }

    public String toString() {
        return this.f17099a.toString();
    }
}
