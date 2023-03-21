package g1;

/* compiled from: VelocityTracker.kt */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private float f14709a;

    /* renamed from: b  reason: collision with root package name */
    private long f14710b = Long.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private float f14711c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14712d = true;

    public final void a(long j, float f11) {
        if (this.f14710b == Long.MAX_VALUE || Float.isNaN(this.f14711c)) {
            this.f14710b = j;
            this.f14711c = f11;
        } else if (j == this.f14710b) {
            this.f14711c = f11;
        } else {
            float a11 = h.c(this.f14709a);
            float f12 = (f11 - this.f14711c) / (((float) (j - this.f14710b)) * 0.001f);
            float abs = this.f14709a + ((f12 - a11) * Math.abs(f12));
            this.f14709a = abs;
            if (this.f14712d) {
                this.f14709a = abs * 0.5f;
                this.f14712d = false;
            }
            this.f14710b = j;
            this.f14711c = f11;
        }
    }

    public final float b() {
        return h.c(this.f14709a);
    }

    public final void c() {
        this.f14709a = 0.0f;
        this.f14710b = Long.MAX_VALUE;
        this.f14711c = Float.NaN;
        this.f14712d = true;
    }
}
