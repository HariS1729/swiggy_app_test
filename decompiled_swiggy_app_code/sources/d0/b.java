package d0;

/* compiled from: RippleTheme.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final float f13799a;

    /* renamed from: b  reason: collision with root package name */
    private final float f13800b;

    /* renamed from: c  reason: collision with root package name */
    private final float f13801c;

    /* renamed from: d  reason: collision with root package name */
    private final float f13802d;

    public b(float f11, float f12, float f13, float f14) {
        this.f13799a = f11;
        this.f13800b = f12;
        this.f13801c = f13;
        this.f13802d = f14;
    }

    public final float a() {
        return this.f13799a;
    }

    public final float b() {
        return this.f13800b;
    }

    public final float c() {
        return this.f13801c;
    }

    public final float d() {
        return this.f13802d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!(this.f13799a == bVar.f13799a)) {
            return false;
        }
        if (!(this.f13800b == bVar.f13800b)) {
            return false;
        }
        if (!(this.f13801c == bVar.f13801c)) {
            return false;
        }
        return (this.f13802d > bVar.f13802d ? 1 : (this.f13802d == bVar.f13802d ? 0 : -1)) == 0;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f13799a) * 31) + Float.floatToIntBits(this.f13800b)) * 31) + Float.floatToIntBits(this.f13801c)) * 31) + Float.floatToIntBits(this.f13802d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f13799a + ", focusedAlpha=" + this.f13800b + ", hoveredAlpha=" + this.f13801c + ", pressedAlpha=" + this.f13802d + ')';
    }
}
