package n0;

import kotlin.jvm.internal.p;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: SnapshotIdSet.kt */
public final class g {
    public static final int b(int[] iArr, int i11) {
        p.j(iArr, "<this>");
        int length = iArr.length - 1;
        int i12 = 0;
        while (i12 <= length) {
            int i13 = (i12 + length) >>> 1;
            int i14 = iArr[i13];
            if (i11 > i14) {
                i12 = i13 + 1;
            } else if (i11 >= i14) {
                return i13;
            } else {
                length = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* access modifiers changed from: private */
    public static final int c(long j) {
        int i11 = 32;
        if ((4294967295L & j) == 0) {
            j >>= 32;
        } else {
            i11 = 0;
        }
        if ((WebSocketProtocol.PAYLOAD_SHORT_MAX & j) == 0) {
            i11 += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i11 += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i11 += 4;
            j >>= 4;
        }
        if ((1 & j) != 0) {
            return i11;
        }
        if ((2 & j) != 0) {
            return i11 + 1;
        }
        if ((4 & j) != 0) {
            return i11 + 2;
        }
        if ((j & 8) != 0) {
            return i11 + 3;
        }
        return -1;
    }
}
