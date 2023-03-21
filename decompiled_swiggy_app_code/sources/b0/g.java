package b0;

import p1.b0;

/* compiled from: SelectionAdjustment.kt */
public final class g {
    public static final long a(int i11, int i12, boolean z11, boolean z12) {
        if (i12 == 0) {
            return b0.b(i11, i11);
        }
        if (i11 == 0) {
            if (z11) {
                return b0.b(1, 0);
            }
            return b0.b(0, 1);
        } else if (i11 == i12) {
            if (z11) {
                return b0.b(i12 - 1, i12);
            }
            return b0.b(i12, i12 - 1);
        } else if (z11) {
            if (!z12) {
                return b0.b(i11 - 1, i11);
            }
            return b0.b(i11 + 1, i11);
        } else if (!z12) {
            return b0.b(i11, i11 + 1);
        } else {
            return b0.b(i11, i11 - 1);
        }
    }
}
