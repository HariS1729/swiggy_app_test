package androidx.constraintlayout.core.parser;

import j2.a;
import java.io.PrintStream;

/* compiled from: CLElement */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final char[] f8097a;

    /* renamed from: b  reason: collision with root package name */
    protected long f8098b = -1;

    /* renamed from: c  reason: collision with root package name */
    protected long f8099c = Long.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    protected b f8100d;

    /* renamed from: e  reason: collision with root package name */
    private int f8101e;

    public c(char[] cArr) {
        this.f8097a = cArr;
    }

    public String c() {
        String str = new String(this.f8097a);
        long j = this.f8099c;
        if (j != Long.MAX_VALUE) {
            long j11 = this.f8098b;
            if (j >= j11) {
                return str.substring((int) j11, ((int) j) + 1);
            }
        }
        long j12 = this.f8098b;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public c f() {
        return this.f8100d;
    }

    /* access modifiers changed from: protected */
    public String g() {
        if (!CLParser.f8083d) {
            return "";
        }
        return k() + " -> ";
    }

    public float h() {
        if (this instanceof a) {
            return ((a) this).h();
        }
        return Float.NaN;
    }

    public int i() {
        return this.f8101e;
    }

    /* access modifiers changed from: protected */
    public String k() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean l() {
        return this.f8099c != Long.MAX_VALUE;
    }

    public void m(b bVar) {
        this.f8100d = bVar;
    }

    public void n(long j) {
        if (this.f8099c == Long.MAX_VALUE) {
            this.f8099c = j;
            if (CLParser.f8083d) {
                PrintStream printStream = System.out;
                printStream.println("closing " + hashCode() + " -> " + this);
            }
            b bVar = this.f8100d;
            if (bVar != null) {
                bVar.r(this);
            }
        }
    }

    public void o(int i11) {
        this.f8101e = i11;
    }

    public void p(long j) {
        this.f8098b = j;
    }

    /* access modifiers changed from: protected */
    public String q() {
        return "";
    }

    public String toString() {
        long j = this.f8098b;
        long j11 = this.f8099c;
        if (j > j11 || j11 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f8098b + "-" + this.f8099c + ")";
        }
        String substring = new String(this.f8097a).substring((int) this.f8098b, ((int) this.f8099c) + 1);
        return k() + " (" + this.f8098b + " : " + this.f8099c + ") <<" + substring + ">>";
    }
}
