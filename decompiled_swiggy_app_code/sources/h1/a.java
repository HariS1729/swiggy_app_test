package h1;

/* compiled from: RotaryScrollEvent.kt */
public final class a implements c1.a {

    /* renamed from: a  reason: collision with root package name */
    private final float f14768a;

    /* renamed from: b  reason: collision with root package name */
    private final float f14769b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14770c;

    public a(float f11, float f12, long j) {
        this.f14768a = f11;
        this.f14769b = f12;
        this.f14770c = j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aVar.f14768a == this.f14768a) {
                if (!(aVar.f14769b == this.f14769b) || aVar.f14770c != this.f14770c) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((0 + Float.floatToIntBits(this.f14768a)) * 31) + Float.floatToIntBits(this.f14769b)) * 31) + bs.a.a(this.f14770c);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f14768a + ",horizontalScrollPixels=" + this.f14769b + ",uptimeMillis=" + this.f14770c + ')';
    }
}
