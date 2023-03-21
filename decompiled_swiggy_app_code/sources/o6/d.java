package o6;

import coil.size.Scale;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DecodeUtils.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f15957a = new d();

    /* compiled from: DecodeUtils.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15958a;

        static {
            int[] iArr = new int[Scale.values().length];
            iArr[Scale.FILL.ordinal()] = 1;
            iArr[Scale.FIT.ordinal()] = 2;
            f15958a = iArr;
        }
    }

    private d() {
    }

    public static final int a(int i11, int i12, int i13, int i14, Scale scale) {
        int i15;
        int highestOneBit = Integer.highestOneBit(i11 / i13);
        int highestOneBit2 = Integer.highestOneBit(i12 / i14);
        int i16 = a.f15958a[scale.ordinal()];
        if (i16 == 1) {
            i15 = Math.min(highestOneBit, highestOneBit2);
        } else if (i16 == 2) {
            i15 = Math.max(highestOneBit, highestOneBit2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return l.d(i15, 1);
    }

    public static final double b(double d11, double d12, double d13, double d14, Scale scale) {
        double d15 = d13 / d11;
        double d16 = d14 / d12;
        int i11 = a.f15958a[scale.ordinal()];
        if (i11 == 1) {
            return Math.max(d15, d16);
        }
        if (i11 == 2) {
            return Math.min(d15, d16);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final double c(int i11, int i12, int i13, int i14, Scale scale) {
        double d11 = ((double) i13) / ((double) i11);
        double d12 = ((double) i14) / ((double) i12);
        int i15 = a.f15958a[scale.ordinal()];
        if (i15 == 1) {
            return Math.max(d11, d12);
        }
        if (i15 == 2) {
            return Math.min(d11, d12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
