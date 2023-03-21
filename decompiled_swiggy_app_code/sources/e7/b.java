package e7;

import com.newrelic.agent.android.util.SafeJsonPrimitive;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;

public class b extends PushbackReader {

    /* renamed from: a  reason: collision with root package name */
    private int f14393a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f14394b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f14395c = 0;

    public b(Reader reader) {
        super(reader, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (e7.h.c((char) r10.f14394b) != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (e7.h.c((char) r10.f14394b) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private char a(char r11) {
        /*
            r10 = this;
            int r0 = r10.f14393a
            r1 = 1
            if (r0 == 0) goto L_0x00af
            r2 = 2
            r3 = 5
            if (r0 == r1) goto L_0x00a5
            r4 = 10
            r5 = 57
            r6 = 48
            r7 = 3
            r8 = 4
            r9 = 0
            if (r0 == r2) goto L_0x0088
            r2 = 59
            if (r0 == r7) goto L_0x004d
            if (r0 == r8) goto L_0x0020
            if (r0 == r3) goto L_0x001d
            return r11
        L_0x001d:
            r10.f14393a = r9
            return r11
        L_0x0020:
            if (r6 > r11) goto L_0x0039
            if (r11 > r5) goto L_0x0039
            int r0 = r10.f14394b
            int r0 = r0 * 10
            int r2 = java.lang.Character.digit(r11, r4)
            int r0 = r0 + r2
            r10.f14394b = r0
            int r0 = r10.f14395c
            int r0 = r0 + r1
            r10.f14395c = r0
            if (r0 > r3) goto L_0x004a
            r10.f14393a = r8
            goto L_0x004c
        L_0x0039:
            if (r11 != r2) goto L_0x004a
            int r0 = r10.f14394b
            char r0 = (char) r0
            boolean r0 = e7.h.c(r0)
            if (r0 == 0) goto L_0x004a
        L_0x0044:
            r10.f14393a = r9
            int r11 = r10.f14394b
            char r11 = (char) r11
            return r11
        L_0x004a:
            r10.f14393a = r3
        L_0x004c:
            return r11
        L_0x004d:
            if (r6 > r11) goto L_0x0051
            if (r11 <= r5) goto L_0x0061
        L_0x0051:
            r0 = 97
            if (r0 > r11) goto L_0x0059
            r0 = 102(0x66, float:1.43E-43)
            if (r11 <= r0) goto L_0x0061
        L_0x0059:
            r0 = 65
            if (r0 > r11) goto L_0x007b
            r0 = 70
            if (r11 > r0) goto L_0x007b
        L_0x0061:
            int r0 = r10.f14394b
            r2 = 16
            int r0 = r0 * 16
            int r2 = java.lang.Character.digit(r11, r2)
            int r0 = r0 + r2
            r10.f14394b = r0
            int r0 = r10.f14395c
            int r0 = r0 + r1
            r10.f14395c = r0
            if (r0 > r8) goto L_0x0078
            r10.f14393a = r7
            goto L_0x0087
        L_0x0078:
            r10.f14393a = r3
            goto L_0x0087
        L_0x007b:
            if (r11 != r2) goto L_0x0078
            int r0 = r10.f14394b
            char r0 = (char) r0
            boolean r0 = e7.h.c(r0)
            if (r0 == 0) goto L_0x0078
            goto L_0x0044
        L_0x0087:
            return r11
        L_0x0088:
            r0 = 120(0x78, float:1.68E-43)
            if (r11 != r0) goto L_0x0093
            r10.f14394b = r9
            r10.f14395c = r9
            r10.f14393a = r7
            goto L_0x00a4
        L_0x0093:
            if (r6 > r11) goto L_0x00a2
            if (r11 > r5) goto L_0x00a2
            int r0 = java.lang.Character.digit(r11, r4)
            r10.f14394b = r0
            r10.f14395c = r1
            r10.f14393a = r8
            goto L_0x00a4
        L_0x00a2:
            r10.f14393a = r3
        L_0x00a4:
            return r11
        L_0x00a5:
            r0 = 35
            if (r11 != r0) goto L_0x00ac
            r10.f14393a = r2
            goto L_0x00ae
        L_0x00ac:
            r10.f14393a = r3
        L_0x00ae:
            return r11
        L_0x00af:
            r0 = 38
            if (r11 != r0) goto L_0x00b5
            r10.f14393a = r1
        L_0x00b5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.b.a(char):char");
    }

    public int read(char[] cArr, int i11, int i12) throws IOException {
        char[] cArr2 = new char[8];
        boolean z11 = true;
        int i13 = 0;
        loop0:
        while (true) {
            int i14 = 0;
            while (z11 && i13 < i12) {
                z11 = super.read(cArr2, i14, 1) == 1;
                if (z11) {
                    char a11 = a(cArr2[i14]);
                    int i15 = this.f14393a;
                    if (i15 == 0) {
                        if (h.c(a11)) {
                            a11 = SafeJsonPrimitive.NULL_CHAR;
                        }
                        cArr[i11] = a11;
                        i13++;
                        i11++;
                    } else {
                        i14++;
                        if (i15 == 5) {
                            unread(cArr2, 0, i14);
                        }
                    }
                } else if (i14 > 0) {
                    unread(cArr2, 0, i14);
                    this.f14393a = 5;
                    z11 = true;
                }
            }
        }
        if (i13 > 0 || z11) {
            return i13;
        }
        return -1;
    }
}
