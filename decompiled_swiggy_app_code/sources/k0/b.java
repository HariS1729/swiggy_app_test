package k0;

import kotlin.jvm.internal.i;

/* compiled from: MutableCounter.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f15320a;

    public b() {
        this(0, 1, (i) null);
    }

    public b(int i11) {
        this.f15320a = i11;
    }

    public final int a() {
        return this.f15320a;
    }

    public final void b(int i11) {
        this.f15320a += i11;
    }

    public final void c(int i11) {
        this.f15320a = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f15320a == ((b) obj).f15320a;
    }

    public int hashCode() {
        return this.f15320a;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f15320a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, int i12, i iVar) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
