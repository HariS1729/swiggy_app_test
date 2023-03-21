package e0;

import java.util.Arrays;
import kotlin.jvm.internal.p;

/* compiled from: Stack.kt */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private int[] f14245a = new int[10];

    /* renamed from: b  reason: collision with root package name */
    private int f14246b;

    public final void a() {
        this.f14246b = 0;
    }

    public final int b() {
        return this.f14246b;
    }

    public final int c(int i11) {
        int i12 = this.f14246b;
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f14245a[i13] == i11) {
                return i13;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.f14246b == 0;
    }

    public final int e() {
        return this.f14245a[this.f14246b - 1];
    }

    public final int f(int i11) {
        return this.f14245a[i11];
    }

    public final int g(int i11) {
        return this.f14246b > 0 ? e() : i11;
    }

    public final int h() {
        int[] iArr = this.f14245a;
        int i11 = this.f14246b - 1;
        this.f14246b = i11;
        return iArr[i11];
    }

    public final void i(int i11) {
        int i12 = this.f14246b;
        int[] iArr = this.f14245a;
        if (i12 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            p.i(copyOf, "copyOf(this, newSize)");
            this.f14245a = copyOf;
        }
        int[] iArr2 = this.f14245a;
        int i13 = this.f14246b;
        this.f14246b = i13 + 1;
        iArr2[i13] = i11;
    }
}
