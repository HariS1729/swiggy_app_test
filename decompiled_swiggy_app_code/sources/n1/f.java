package n1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import rp0.b;

/* compiled from: SemanticsProperties.kt */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final a f15773d = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final f f15774e = new f(0.0f, k.b(0.0f, 0.0f), 0, 4, (i) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f15775a;

    /* renamed from: b  reason: collision with root package name */
    private final b<Float> f15776b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15777c;

    /* compiled from: SemanticsProperties.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final f a() {
            return f.f15774e;
        }
    }

    public f(float f11, b<Float> bVar, int i11) {
        p.j(bVar, "range");
        this.f15775a = f11;
        this.f15776b = bVar;
        this.f15777c = i11;
    }

    public final float b() {
        return this.f15775a;
    }

    public final b<Float> c() {
        return this.f15776b;
    }

    public final int d() {
        return this.f15777c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return ((this.f15775a > fVar.f15775a ? 1 : (this.f15775a == fVar.f15775a ? 0 : -1)) == 0) && p.e(this.f15776b, fVar.f15776b) && this.f15777c == fVar.f15777c;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f15775a) * 31) + this.f15776b.hashCode()) * 31) + this.f15777c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f15775a + ", range=" + this.f15776b + ", steps=" + this.f15777c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(float f11, b bVar, int i11, int i12, i iVar) {
        this(f11, bVar, (i12 & 4) != 0 ? 0 : i11);
    }
}
