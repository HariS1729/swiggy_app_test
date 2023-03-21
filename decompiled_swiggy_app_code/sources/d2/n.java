package d2;

import kotlin.jvm.internal.i;

/* compiled from: IntRect.kt */
public final class n {

    /* renamed from: e  reason: collision with root package name */
    public static final a f14013e = new a((i) null);

    /* renamed from: f  reason: collision with root package name */
    private static final n f14014f = new n(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f14015a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14016b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14017c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14018d;

    /* compiled from: IntRect.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public n(int i11, int i12, int i13, int i14) {
        this.f14015a = i11;
        this.f14016b = i12;
        this.f14017c = i13;
        this.f14018d = i14;
    }

    public final int a() {
        return this.f14018d - this.f14016b;
    }

    public final int b() {
        return this.f14015a;
    }

    public final int c() {
        return this.f14016b;
    }

    public final int d() {
        return this.f14017c - this.f14015a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f14015a == nVar.f14015a && this.f14016b == nVar.f14016b && this.f14017c == nVar.f14017c && this.f14018d == nVar.f14018d;
    }

    public int hashCode() {
        return (((((this.f14015a * 31) + this.f14016b) * 31) + this.f14017c) * 31) + this.f14018d;
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f14015a + ", " + this.f14016b + ", " + this.f14017c + ", " + this.f14018d + ')';
    }
}
