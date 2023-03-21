package t1;

import kotlin.jvm.internal.p;

/* compiled from: ContainerHelpers.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f16686a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Object[] f16687b = new Object[0];

    public static final int a(int[] iArr, int i11, int i12) {
        p.j(iArr, "<this>");
        int i13 = i11 - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            int i16 = iArr[i15];
            if (i16 < i12) {
                i14 = i15 + 1;
            } else if (i16 <= i12) {
                return i15;
            } else {
                i13 = i15 - 1;
            }
        }
        return ~i14;
    }
}
