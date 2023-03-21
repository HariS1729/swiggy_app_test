package androidx.slice;

import androidx.core.util.c;
import java.lang.reflect.Array;

/* compiled from: ArrayUtils */
class a {
    public static <T> T[] a(Class<T> cls, T[] tArr, T t) {
        T[] tArr2;
        int i11 = 0;
        if (tArr != null) {
            int length = tArr.length;
            tArr2 = (Object[]) Array.newInstance(cls, length + 1);
            System.arraycopy(tArr, 0, tArr2, 0, length);
            i11 = length;
        } else {
            tArr2 = (Object[]) Array.newInstance(cls, 1);
        }
        tArr2[i11] = t;
        return tArr2;
    }

    public static <T> boolean b(T[] tArr, T t) {
        for (T a11 : tArr) {
            if (c.a(a11, t)) {
                return true;
            }
        }
        return false;
    }

    public static <T> T[] c(Class<T> cls, T[] tArr, T t) {
        if (tArr == null || !b(tArr, t)) {
            return tArr;
        }
        int length = tArr.length;
        int i11 = 0;
        while (i11 < length) {
            if (!c.a(tArr[i11], t)) {
                i11++;
            } else if (length == 1) {
                return null;
            } else {
                T[] tArr2 = (Object[]) Array.newInstance(cls, length - 1);
                System.arraycopy(tArr, 0, tArr2, 0, i11);
                System.arraycopy(tArr, i11 + 1, tArr2, i11, (length - i11) - 1);
                return tArr2;
            }
        }
        return tArr;
    }
}
