package a0;

import kotlin.jvm.internal.p;
import p1.b0;

/* compiled from: StringHelpers.kt */
public final class k {
    public static final int a(CharSequence charSequence, int i11) {
        p.j(charSequence, "<this>");
        int length = charSequence.length();
        for (int i12 = i11 + 1; i12 < length; i12++) {
            if (charSequence.charAt(i12) == 10) {
                return i12;
            }
        }
        return charSequence.length();
    }

    public static final int b(CharSequence charSequence, int i11) {
        p.j(charSequence, "<this>");
        for (int i12 = i11 - 1; i12 > 0; i12--) {
            if (charSequence.charAt(i12 - 1) == 10) {
                return i12;
            }
        }
        return 0;
    }

    public static final long c(CharSequence charSequence, int i11) {
        p.j(charSequence, "<this>");
        return b0.b(b(charSequence, i11), a(charSequence, i11));
    }
}
