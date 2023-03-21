package c6;

import java.util.Arrays;

/* compiled from: CameraProperties */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f12829a;

    /* renamed from: b  reason: collision with root package name */
    private int f12830b;

    /* renamed from: c  reason: collision with root package name */
    private int f12831c;

    /* renamed from: d  reason: collision with root package name */
    private int f12832d;

    /* renamed from: e  reason: collision with root package name */
    private long f12833e;

    /* renamed from: f  reason: collision with root package name */
    private int f12834f;

    /* renamed from: g  reason: collision with root package name */
    private int f12835g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f12836h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12837i;
    private boolean j;

    public b(int i11, int i12, int i13, int i14, long j11, int i15, int i16, byte[] bArr, boolean z11, boolean z12) {
        this.f12829a = i11;
        this.f12830b = i12;
        this.f12831c = i13;
        this.f12832d = i14;
        this.f12833e = j11;
        this.f12834f = i15;
        this.f12835g = i16;
        this.f12836h = bArr;
        this.f12837i = z11;
        this.j = z12;
    }

    /* access modifiers changed from: protected */
    public boolean a(Object obj) {
        return obj instanceof b;
    }

    public byte[] b() {
        return this.f12836h;
    }

    public int c() {
        return this.f12830b;
    }

    public int d() {
        return this.f12834f;
    }

    public long e() {
        return this.f12833e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.a(this) && i() == bVar.i() && c() == bVar.c() && h() == bVar.h() && g() == bVar.g() && e() == bVar.e() && d() == bVar.d() && f() == bVar.f() && k() == bVar.k() && j() == bVar.j() && Arrays.equals(b(), bVar.b());
    }

    public int f() {
        return this.f12835g;
    }

    public int g() {
        return this.f12832d;
    }

    public int h() {
        return this.f12831c;
    }

    public int hashCode() {
        int i11 = ((((((i() + 59) * 59) + c()) * 59) + h()) * 59) + g();
        long e11 = e();
        int i12 = 79;
        int d11 = ((((((((i11 * 59) + ((int) (e11 ^ (e11 >>> 32)))) * 59) + d()) * 59) + f()) * 59) + (k() ? 79 : 97)) * 59;
        if (!j()) {
            i12 = 97;
        }
        return ((d11 + i12) * 59) + Arrays.hashCode(b());
    }

    public int i() {
        return this.f12829a;
    }

    public boolean j() {
        return this.j;
    }

    public boolean k() {
        return this.f12837i;
    }

    public String toString() {
        return "CameraProperties(width=" + i() + ", height=" + c() + ", viewWidth=" + h() + ", viewHeight=" + g() + ", rgbDataLength=" + e() + ", orientation=" + d() + ", rotation=" + f() + ", data=" + Arrays.toString(b()) + ", isFrontFacingCam=" + k() + ", isCapturedFramePreviewed=" + j() + ")";
    }
}
