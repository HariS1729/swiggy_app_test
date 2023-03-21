package a2;

import kotlin.jvm.internal.i;

/* compiled from: TextGeometricTransform.kt */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f927c = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final h f928d = new h(1.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final float f929a;

    /* renamed from: b  reason: collision with root package name */
    private final float f930b;

    /* compiled from: TextGeometricTransform.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final h a() {
            return h.f928d;
        }
    }

    public h() {
        this(0.0f, 0.0f, 3, (i) null);
    }

    public h(float f11, float f12) {
        this.f929a = f11;
        this.f930b = f12;
    }

    public final float b() {
        return this.f929a;
    }

    public final float c() {
        return this.f930b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!(this.f929a == hVar.f929a)) {
            return false;
        }
        return (this.f930b > hVar.f930b ? 1 : (this.f930b == hVar.f930b ? 0 : -1)) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f929a) * 31) + Float.floatToIntBits(this.f930b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f929a + ", skewX=" + this.f930b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(float f11, float f12, int i11, i iVar) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? 0.0f : f12);
    }
}
