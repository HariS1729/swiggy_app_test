package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import v0.b;

/* compiled from: ColorSpace.kt */
public abstract class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0022a f6482d = new C0022a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f6483a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6484b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6485c;

    /* renamed from: androidx.compose.ui.graphics.colorspace.a$a  reason: collision with other inner class name */
    /* compiled from: ColorSpace.kt */
    public static final class C0022a {
        private C0022a() {
        }

        public /* synthetic */ C0022a(i iVar) {
            this();
        }
    }

    private a(String str, long j, int i11) {
        this.f6483a = str;
        this.f6484b = j;
        this.f6485c = i11;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        } else if (i11 < -1 || i11 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ a(String str, long j, int i11, i iVar) {
        this(str, j, i11);
    }

    public abstract float[] a(float[] fArr);

    public final int b() {
        return b.f(this.f6484b);
    }

    public final int c() {
        return this.f6485c;
    }

    public abstract float d(int i11);

    public abstract float e(int i11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.e(s.b(getClass()), s.b(obj.getClass()))) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f6485c == aVar.f6485c && p.e(this.f6483a, aVar.f6483a)) {
            return b.e(this.f6484b, aVar.f6484b);
        }
        return false;
    }

    public final long f() {
        return this.f6484b;
    }

    public final String g() {
        return this.f6483a;
    }

    public boolean h() {
        return false;
    }

    public int hashCode() {
        return (((this.f6483a.hashCode() * 31) + b.g(this.f6484b)) * 31) + this.f6485c;
    }

    public abstract float[] i(float[] fArr);

    public String toString() {
        return this.f6483a + " (id=" + this.f6485c + ", model=" + b.h(this.f6484b) + ')';
    }
}
