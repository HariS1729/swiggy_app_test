package v1;

import kotlin.jvm.internal.p;

/* compiled from: GapBuffer.kt */
final class j {

    /* renamed from: a  reason: collision with root package name */
    private int f17120a;

    /* renamed from: b  reason: collision with root package name */
    private char[] f17121b;

    /* renamed from: c  reason: collision with root package name */
    private int f17122c;

    /* renamed from: d  reason: collision with root package name */
    private int f17123d;

    public j(char[] cArr, int i11, int i12) {
        p.j(cArr, "initBuffer");
        this.f17120a = cArr.length;
        this.f17121b = cArr;
        this.f17122c = i11;
        this.f17123d = i12;
    }

    private final void b(int i11, int i12) {
        int i13 = this.f17122c;
        if (i11 < i13 && i12 <= i13) {
            int i14 = i13 - i12;
            char[] cArr = this.f17121b;
            char[] unused = g.f(cArr, cArr, this.f17123d - i14, i12, i13);
            this.f17122c = i11;
            this.f17123d -= i14;
        } else if (i11 >= i13 || i12 < i13) {
            int c11 = i11 + c();
            int c12 = i12 + c();
            int i15 = this.f17123d;
            char[] cArr2 = this.f17121b;
            char[] unused2 = g.f(cArr2, cArr2, this.f17122c, i15, c11);
            this.f17122c += c11 - i15;
            this.f17123d = c12;
        } else {
            this.f17123d = i12 + c();
            this.f17122c = i11;
        }
    }

    private final int c() {
        return this.f17123d - this.f17122c;
    }

    private final void f(int i11) {
        if (i11 > c()) {
            int c11 = i11 - c();
            int i12 = this.f17120a;
            do {
                i12 *= 2;
            } while (i12 - this.f17120a < c11);
            char[] cArr = new char[i12];
            char[] unused = g.f(this.f17121b, cArr, 0, 0, this.f17122c);
            int i13 = this.f17120a;
            int i14 = this.f17123d;
            int i15 = i13 - i14;
            int i16 = i12 - i15;
            char[] unused2 = g.f(this.f17121b, cArr, i16, i14, i15 + i14);
            this.f17121b = cArr;
            this.f17120a = i12;
            this.f17123d = i16;
        }
    }

    public final void a(StringBuilder sb2) {
        p.j(sb2, "builder");
        sb2.append(this.f17121b, 0, this.f17122c);
        char[] cArr = this.f17121b;
        int i11 = this.f17123d;
        sb2.append(cArr, i11, this.f17120a - i11);
    }

    public final char d(int i11) {
        int i12 = this.f17122c;
        if (i11 < i12) {
            return this.f17121b[i11];
        }
        return this.f17121b[(i11 - i12) + this.f17123d];
    }

    public final int e() {
        return this.f17120a - c();
    }

    public final void g(int i11, int i12, String str) {
        p.j(str, "text");
        f(str.length() - (i12 - i11));
        b(i11, i12);
        k.c(str, this.f17121b, this.f17122c, 0, 0, 12, (Object) null);
        this.f17122c += str.length();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb2);
        String sb3 = sb2.toString();
        p.i(sb3, "StringBuilder().apply { append(this) }.toString()");
        return sb3;
    }
}
