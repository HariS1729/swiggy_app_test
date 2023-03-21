package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: Insets */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f9234e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f9235a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9236b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9237c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9238d;

    /* compiled from: Insets */
    static class a {
        static Insets a(int i11, int i12, int i13, int i14) {
            return Insets.of(i11, i12, i13, i14);
        }
    }

    private b(int i11, int i12, int i13, int i14) {
        this.f9235a = i11;
        this.f9236b = i12;
        this.f9237c = i13;
        this.f9238d = i14;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f9235a, bVar2.f9235a), Math.max(bVar.f9236b, bVar2.f9236b), Math.max(bVar.f9237c, bVar2.f9237c), Math.max(bVar.f9238d, bVar2.f9238d));
    }

    public static b b(int i11, int i12, int i13, int i14) {
        if (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            return f9234e;
        }
        return new b(i11, i12, i13, i14);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f9235a, this.f9236b, this.f9237c, this.f9238d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f9238d == bVar.f9238d && this.f9235a == bVar.f9235a && this.f9237c == bVar.f9237c && this.f9236b == bVar.f9236b;
    }

    public int hashCode() {
        return (((((this.f9235a * 31) + this.f9236b) * 31) + this.f9237c) * 31) + this.f9238d;
    }

    public String toString() {
        return "Insets{left=" + this.f9235a + ", top=" + this.f9236b + ", right=" + this.f9237c + ", bottom=" + this.f9238d + '}';
    }
}
