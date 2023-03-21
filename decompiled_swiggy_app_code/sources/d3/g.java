package d3;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import w3.b;

/* compiled from: MetadataRepo */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final b f14099a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f14100b;

    /* renamed from: c  reason: collision with root package name */
    private final a f14101c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    private final Typeface f14102d;

    /* compiled from: MetadataRepo */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<a> f14103a;

        /* renamed from: b  reason: collision with root package name */
        private b f14104b;

        private a() {
            this(1);
        }

        /* access modifiers changed from: package-private */
        public a a(int i11) {
            SparseArray<a> sparseArray = this.f14103a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i11);
        }

        /* access modifiers changed from: package-private */
        public final b b() {
            return this.f14104b;
        }

        /* access modifiers changed from: package-private */
        public void c(b bVar, int i11, int i12) {
            a a11 = a(bVar.b(i11));
            if (a11 == null) {
                a11 = new a();
                this.f14103a.put(bVar.b(i11), a11);
            }
            if (i12 > i11) {
                a11.c(bVar, i11 + 1, i12);
            } else {
                a11.f14104b = bVar;
            }
        }

        a(int i11) {
            this.f14103a = new SparseArray<>(i11);
        }
    }

    private g(Typeface typeface, b bVar) {
        this.f14102d = typeface;
        this.f14099a = bVar;
        this.f14100b = new char[(bVar.j() * 2)];
        a(bVar);
    }

    private void a(b bVar) {
        int j = bVar.j();
        for (int i11 = 0; i11 < j; i11++) {
            b bVar2 = new b(this, i11);
            Character.toChars(bVar2.f(), this.f14100b, i11 * 2);
            h(bVar2);
        }
    }

    public static g b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        return new g(typeface, f.b(byteBuffer));
    }

    public char[] c() {
        return this.f14100b;
    }

    public b d() {
        return this.f14099a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f14099a.k();
    }

    /* access modifiers changed from: package-private */
    public a f() {
        return this.f14101c;
    }

    /* access modifiers changed from: package-private */
    public Typeface g() {
        return this.f14102d;
    }

    /* access modifiers changed from: package-private */
    public void h(b bVar) {
        androidx.core.util.g.h(bVar, "emoji metadata cannot be null");
        androidx.core.util.g.b(bVar.c() > 0, "invalid metadata codepoint length");
        this.f14101c.c(bVar, 0, bVar.c() - 1);
    }
}
