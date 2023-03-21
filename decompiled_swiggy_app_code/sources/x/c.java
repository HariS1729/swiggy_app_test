package x;

import f0.e;
import x.b;

/* compiled from: IntervalList.kt */
public final class c {
    /* access modifiers changed from: private */
    public static final <T> int b(e<b.a<T>> eVar, int i11) {
        int m11 = eVar.m() - 1;
        int i12 = 0;
        while (i12 < m11) {
            int i13 = ((m11 - i12) / 2) + i12;
            int b11 = ((b.a) eVar.l()[i13]).b();
            if (b11 == i11) {
                return i13;
            }
            if (b11 < i11) {
                i12 = i13 + 1;
                if (i11 < ((b.a) eVar.l()[i12]).b()) {
                    return i13;
                }
            } else {
                m11 = i13 - 1;
            }
        }
        return i12;
    }
}
