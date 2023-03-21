package c6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ImageComparisonObj */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private float f12838a;

    /* renamed from: b  reason: collision with root package name */
    private float f12839b;

    /* renamed from: c  reason: collision with root package name */
    private float f12840c;

    /* renamed from: d  reason: collision with root package name */
    private float f12841d;

    /* renamed from: e  reason: collision with root package name */
    private List<Integer> f12842e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private List<Long> f12843f = new ArrayList(Collections.nCopies(10, 0L));

    /* renamed from: g  reason: collision with root package name */
    private int f12844g;

    /* renamed from: h  reason: collision with root package name */
    private int f12845h;

    /* renamed from: i  reason: collision with root package name */
    private int f12846i;
    private int j;

    /* access modifiers changed from: protected */
    public boolean a(Object obj) {
        return obj instanceof c;
    }

    public float b() {
        return this.f12840c;
    }

    public int c() {
        return this.f12845h;
    }

    public int d() {
        return this.f12844g;
    }

    public List<Long> e() {
        return this.f12843f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!cVar.a(this) || Float.compare(j(), cVar.j()) != 0 || Float.compare(g(), cVar.g()) != 0 || Float.compare(b(), cVar.b()) != 0 || Float.compare(k(), cVar.k()) != 0 || d() != cVar.d() || c() != cVar.c() || i() != cVar.i() || h() != cVar.h()) {
            return false;
        }
        List<Integer> f11 = f();
        List<Integer> f12 = cVar.f();
        if (f11 != null ? !f11.equals(f12) : f12 != null) {
            return false;
        }
        List<Long> e11 = e();
        List<Long> e12 = cVar.e();
        return e11 != null ? e11.equals(e12) : e12 == null;
    }

    public List<Integer> f() {
        return this.f12842e;
    }

    public float g() {
        return this.f12839b;
    }

    public int h() {
        return this.j;
    }

    public int hashCode() {
        int floatToIntBits = ((((((((((((((Float.floatToIntBits(j()) + 59) * 59) + Float.floatToIntBits(g())) * 59) + Float.floatToIntBits(b())) * 59) + Float.floatToIntBits(k())) * 59) + d()) * 59) + c()) * 59) + i()) * 59) + h();
        List<Integer> f11 = f();
        int i11 = 43;
        int hashCode = (floatToIntBits * 59) + (f11 == null ? 43 : f11.hashCode());
        List<Long> e11 = e();
        int i12 = hashCode * 59;
        if (e11 != null) {
            i11 = e11.hashCode();
        }
        return i12 + i11;
    }

    public int i() {
        return this.f12846i;
    }

    public float j() {
        return this.f12838a;
    }

    public float k() {
        return this.f12841d;
    }

    public void l(float f11) {
        this.f12840c = f11;
    }

    public void m(int i11) {
        this.f12845h = i11;
    }

    public void n(int i11) {
        this.f12844g = i11;
    }

    public void o(float f11) {
        this.f12839b = f11;
    }

    public void p(int i11) {
        this.j = i11;
    }

    public void q(int i11) {
        this.f12846i = i11;
    }

    public void r(float f11) {
        this.f12838a = f11;
    }

    public void s(float f11) {
        this.f12841d = f11;
    }

    public String toString() {
        return "ImageComparisonObj(redChannelDistance=" + j() + ", greenChannelDistance=" + g() + ", blueChannelDistance=" + b() + ", similarityScore=" + k() + ", frameDistanceValue=" + f() + ", frameDataLength=" + e() + ", captureWidth=" + d() + ", captureHeight=" + c() + ", imageWidth=" + i() + ", imageHeight=" + h() + ")";
    }
}
