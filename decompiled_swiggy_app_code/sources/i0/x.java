package i0;

import java.util.Arrays;
import kotlin.jvm.internal.p;

/* compiled from: TrieNode.kt */
public final class x {
    public static final int f(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    /* access modifiers changed from: private */
    public static final <K, V> Object[] g(Object[] objArr, int i11, K k, V v) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        Object[] unused = g.n(objArr, objArr2, 0, 0, i11, 6, (Object) null);
        Object[] unused2 = g.j(objArr, objArr2, i11 + 2, i11, objArr.length);
        objArr2[i11] = k;
        objArr2[i11 + 1] = v;
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] h(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[(objArr.length - 2)];
        Object[] unused = g.n(objArr, objArr2, 0, 0, i11, 6, (Object) null);
        Object[] unused2 = g.j(objArr, objArr2, i11, i11 + 2, objArr.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] i(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        Object[] unused = g.n(objArr, objArr2, 0, 0, i11, 6, (Object) null);
        Object[] unused2 = g.j(objArr, objArr2, i11, i11 + 1, objArr.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] j(Object[] objArr, int i11, int i12, t<?, ?> tVar) {
        int i13 = i12 - 2;
        Object[] objArr2 = new Object[((objArr.length - 2) + 1)];
        Object[] unused = g.n(objArr, objArr2, 0, 0, i11, 6, (Object) null);
        Object[] unused2 = g.j(objArr, objArr2, i11, i11 + 2, i12);
        objArr2[i13] = tVar;
        Object[] unused3 = g.j(objArr, objArr2, i13 + 1, i12, objArr.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final <K, V> Object[] k(Object[] objArr, int i11, int i12, K k, V v) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        p.i(copyOf, "copyOf(this, newSize)");
        Object[] unused = g.j(copyOf, copyOf, i11 + 2, i11 + 1, objArr.length);
        Object[] unused2 = g.j(copyOf, copyOf, i12 + 2, i12, i11);
        copyOf[i12] = k;
        copyOf[i12 + 1] = v;
        return copyOf;
    }
}
