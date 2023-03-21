package o2;

import androidx.constraintlayout.motion.widget.o;
import i2.k;
import i2.m;
import i2.n;

/* compiled from: StopLogic */
public class b extends o {

    /* renamed from: a  reason: collision with root package name */
    private n f15904a;

    /* renamed from: b  reason: collision with root package name */
    private k f15905b;

    /* renamed from: c  reason: collision with root package name */
    private m f15906c;

    public b() {
        n nVar = new n();
        this.f15904a = nVar;
        this.f15906c = nVar;
    }

    public float a() {
        return this.f15906c.a();
    }

    public void b(float f11, float f12, float f13, float f14, float f15, float f16) {
        n nVar = this.f15904a;
        this.f15906c = nVar;
        nVar.d(f11, f12, f13, f14, f15, f16);
    }

    public boolean c() {
        return this.f15906c.b();
    }

    public void d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i11) {
        if (this.f15905b == null) {
            this.f15905b = new k();
        }
        k kVar = this.f15905b;
        this.f15906c = kVar;
        kVar.d(f11, f12, f13, f14, f15, f16, f17, i11);
    }

    public float getInterpolation(float f11) {
        return this.f15906c.getInterpolation(f11);
    }
}
