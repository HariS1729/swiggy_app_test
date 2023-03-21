package g1;

/* compiled from: VelocityTracker.kt */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final e[] f14713a;

    public b(int i11, int i12) {
        e[] eVarArr = new e[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            eVarArr[i13] = new e(i12);
        }
        this.f14713a = eVarArr;
    }

    public final float a(int i11, int i12) {
        return this.f14713a[i11].a(i12);
    }

    public final e b(int i11) {
        return this.f14713a[i11];
    }

    public final void c(int i11, int i12, float f11) {
        this.f14713a[i11].c(i12, f11);
    }
}
