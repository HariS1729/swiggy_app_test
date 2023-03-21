package e0;

import java.util.ArrayList;
import kotlin.jvm.internal.p;

/* compiled from: SlotTable.kt */
public final class w0 {
    /* access modifiers changed from: private */
    public static final int A(int[] iArr, int i11) {
        int i12 = i11 * 5;
        if (i12 >= iArr.length) {
            return iArr.length;
        }
        return D(iArr[i12 + 1] >> 29) + iArr[i12 + 4];
    }

    /* access modifiers changed from: private */
    public static final boolean B(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 201326592) != 0;
    }

    /* access modifiers changed from: private */
    public static final boolean C(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 67108864) != 0;
    }

    /* access modifiers changed from: private */
    public static final int D(int i11) {
        switch (i11) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* access modifiers changed from: private */
    public static final int E(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 4];
    }

    /* access modifiers changed from: private */
    public static final int F(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 1];
    }

    /* access modifiers changed from: private */
    public static final int G(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 3];
    }

    /* access modifiers changed from: private */
    public static final boolean H(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 268435456) != 0;
    }

    /* access modifiers changed from: private */
    public static final boolean I(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 134217728) != 0;
    }

    /* access modifiers changed from: private */
    public static final boolean J(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 536870912) != 0;
    }

    /* access modifiers changed from: private */
    public static final void K(int[] iArr, int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, int i14) {
        int i15 = z11 ? 1073741824 : 0;
        int i16 = z12 ? 536870912 : 0;
        int i17 = z13 ? 268435456 : 0;
        int i18 = i11 * 5;
        iArr[i18 + 0] = i12;
        iArr[i18 + 1] = i15 | i16 | i17;
        iArr[i18 + 2] = i13;
        iArr[i18 + 3] = 0;
        iArr[i18 + 4] = i14;
    }

    /* access modifiers changed from: private */
    public static final boolean L(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 1073741824) != 0;
    }

    /* access modifiers changed from: private */
    public static final int M(int[] iArr, int i11) {
        return iArr[i11 * 5];
    }

    /* access modifiers changed from: private */
    public static final int N(ArrayList<c> arrayList, int i11, int i12) {
        int S = S(arrayList, i11, i12);
        return S >= 0 ? S : -(S + 1);
    }

    /* access modifiers changed from: private */
    public static final int O(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 1] & 67108863;
    }

    /* access modifiers changed from: private */
    public static final int P(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 4];
    }

    /* access modifiers changed from: private */
    public static final int Q(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + D(iArr[i12 + 1] >> 30);
    }

    /* access modifiers changed from: private */
    public static final int R(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 2];
    }

    /* access modifiers changed from: private */
    public static final int S(ArrayList<c> arrayList, int i11, int i12) {
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            int a11 = arrayList.get(i14).a();
            if (a11 < 0) {
                a11 += i12;
            }
            int l11 = p.l(a11, i11);
            if (l11 < 0) {
                i13 = i14 + 1;
            } else if (l11 <= 0) {
                return i14;
            } else {
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    /* access modifiers changed from: private */
    public static final int T(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + D(iArr[i12 + 1] >> 28);
    }

    /* access modifiers changed from: private */
    public static final void U(int[] iArr, int i11, boolean z11) {
        int i12 = (i11 * 5) + 1;
        if (z11) {
            iArr[i12] = iArr[i12] | 67108864;
        } else {
            iArr[i12] = iArr[i12] & -67108865;
        }
    }

    /* access modifiers changed from: private */
    public static final void V(int[] iArr, int i11, int i12) {
        iArr[(i11 * 5) + 4] = i12;
    }

    /* access modifiers changed from: private */
    public static final void W(int[] iArr, int i11, int i12) {
        if (i12 >= 0) {
            iArr[(i11 * 5) + 3] = i12;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: private */
    public static final void X(int[] iArr, int i11, boolean z11) {
        int i12 = (i11 * 5) + 1;
        if (z11) {
            iArr[i12] = iArr[i12] | 134217728;
        } else {
            iArr[i12] = iArr[i12] & -134217729;
        }
    }

    /* access modifiers changed from: private */
    public static final void Y(int[] iArr, int i11, int i12) {
        if (i12 >= 0 && i12 < 67108863) {
            int i13 = (i11 * 5) + 1;
            iArr[i13] = i12 | (iArr[i13] & -67108864);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: private */
    public static final void Z(int[] iArr, int i11, int i12) {
        iArr[(i11 * 5) + 2] = i12;
    }
}
