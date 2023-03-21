package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ArraySet */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: d  reason: collision with root package name */
    private static Object[] f2359d;

    /* renamed from: e  reason: collision with root package name */
    private static int f2360e;

    /* renamed from: f  reason: collision with root package name */
    private static Object[] f2361f;

    /* renamed from: g  reason: collision with root package name */
    private static int f2362g;

    /* renamed from: h  reason: collision with root package name */
    private static final Object f2363h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static final Object f2364i = new Object();

    /* renamed from: a  reason: collision with root package name */
    private int[] f2365a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f2366b;

    /* renamed from: c  reason: collision with root package name */
    int f2367c;

    /* compiled from: ArraySet */
    private class a extends d<E> {
        a() {
            super(b.this.f2367c);
        }

        /* access modifiers changed from: protected */
        public E a(int i11) {
            return b.this.k(i11);
        }

        /* access modifiers changed from: protected */
        public void b(int i11) {
            b.this.i(i11);
        }
    }

    public b() {
        this(0);
    }

    private void c(int i11) {
        if (i11 == 8) {
            synchronized (f2364i) {
                Object[] objArr = f2361f;
                if (objArr != null) {
                    try {
                        this.f2366b = objArr;
                        f2361f = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f2365a = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f2362g--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f2361f = null;
                    f2362g = 0;
                }
            }
        } else if (i11 == 4) {
            synchronized (f2363h) {
                Object[] objArr2 = f2359d;
                if (objArr2 != null) {
                    try {
                        this.f2366b = objArr2;
                        f2359d = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f2365a = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f2360e--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f2359d = null;
                    f2360e = 0;
                }
            }
        }
        this.f2365a = new int[i11];
        this.f2366b = new Object[i11];
    }

    private int d(int i11) {
        try {
            return c.a(this.f2365a, this.f2367c, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void f(int[] iArr, Object[] objArr, int i11) {
        if (iArr.length == 8) {
            synchronized (f2364i) {
                if (f2362g < 10) {
                    objArr[0] = f2361f;
                    objArr[1] = iArr;
                    for (int i12 = i11 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f2361f = objArr;
                    f2362g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f2363h) {
                if (f2360e < 10) {
                    objArr[0] = f2359d;
                    objArr[1] = iArr;
                    for (int i13 = i11 - 1; i13 >= 2; i13--) {
                        objArr[i13] = null;
                    }
                    f2359d = objArr;
                    f2360e++;
                }
            }
        }
    }

    private int g(Object obj, int i11) {
        int i12 = this.f2367c;
        if (i12 == 0) {
            return -1;
        }
        int d11 = d(i11);
        if (d11 < 0 || obj.equals(this.f2366b[d11])) {
            return d11;
        }
        int i13 = d11 + 1;
        while (i13 < i12 && this.f2365a[i13] == i11) {
            if (obj.equals(this.f2366b[i13])) {
                return i13;
            }
            i13++;
        }
        int i14 = d11 - 1;
        while (i14 >= 0 && this.f2365a[i14] == i11) {
            if (obj.equals(this.f2366b[i14])) {
                return i14;
            }
            i14--;
        }
        return ~i13;
    }

    private int h() {
        int i11 = this.f2367c;
        if (i11 == 0) {
            return -1;
        }
        int d11 = d(0);
        if (d11 < 0 || this.f2366b[d11] == null) {
            return d11;
        }
        int i12 = d11 + 1;
        while (i12 < i11 && this.f2365a[i12] == 0) {
            if (this.f2366b[i12] == null) {
                return i12;
            }
            i12++;
        }
        int i13 = d11 - 1;
        while (i13 >= 0 && this.f2365a[i13] == 0) {
            if (this.f2366b[i13] == null) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    public boolean add(E e11) {
        int i11;
        int i12;
        int i13 = this.f2367c;
        if (e11 == null) {
            i12 = h();
            i11 = 0;
        } else {
            int hashCode = e11.hashCode();
            i11 = hashCode;
            i12 = g(e11, hashCode);
        }
        if (i12 >= 0) {
            return false;
        }
        int i14 = ~i12;
        int[] iArr = this.f2365a;
        if (i13 >= iArr.length) {
            int i15 = 4;
            if (i13 >= 8) {
                i15 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i15 = 8;
            }
            Object[] objArr = this.f2366b;
            c(i15);
            if (i13 == this.f2367c) {
                int[] iArr2 = this.f2365a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f2366b, 0, objArr.length);
                }
                f(iArr, objArr, i13);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i13) {
            int[] iArr3 = this.f2365a;
            int i16 = i14 + 1;
            int i17 = i13 - i14;
            System.arraycopy(iArr3, i14, iArr3, i16, i17);
            Object[] objArr2 = this.f2366b;
            System.arraycopy(objArr2, i14, objArr2, i16, i17);
        }
        int i18 = this.f2367c;
        if (i13 == i18) {
            int[] iArr4 = this.f2365a;
            if (i14 < iArr4.length) {
                iArr4[i14] = i11;
                this.f2366b[i14] = e11;
                this.f2367c = i18 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        e(this.f2367c + collection.size());
        boolean z11 = false;
        for (Object add : collection) {
            z11 |= add(add);
        }
        return z11;
    }

    public void clear() {
        int i11 = this.f2367c;
        if (i11 != 0) {
            int[] iArr = this.f2365a;
            Object[] objArr = this.f2366b;
            this.f2365a = c.f2369a;
            this.f2366b = c.f2371c;
            this.f2367c = 0;
            f(iArr, objArr, i11);
        }
        if (this.f2367c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public void e(int i11) {
        int i12 = this.f2367c;
        int[] iArr = this.f2365a;
        if (iArr.length < i11) {
            Object[] objArr = this.f2366b;
            c(i11);
            int i13 = this.f2367c;
            if (i13 > 0) {
                System.arraycopy(iArr, 0, this.f2365a, 0, i13);
                System.arraycopy(objArr, 0, this.f2366b, 0, this.f2367c);
            }
            f(iArr, objArr, this.f2367c);
        }
        if (this.f2367c != i12) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i11 = 0;
            while (i11 < this.f2367c) {
                try {
                    if (!set.contains(k(i11))) {
                        return false;
                    }
                    i11++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f2365a;
        int i11 = this.f2367c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += iArr[i13];
        }
        return i12;
    }

    public E i(int i11) {
        int i12 = this.f2367c;
        E[] eArr = this.f2366b;
        E e11 = eArr[i11];
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f2365a;
            int i14 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i11 < i13) {
                    int i15 = i11 + 1;
                    int i16 = i13 - i11;
                    System.arraycopy(iArr, i15, iArr, i11, i16);
                    Object[] objArr = this.f2366b;
                    System.arraycopy(objArr, i15, objArr, i11, i16);
                }
                this.f2366b[i13] = null;
            } else {
                if (i12 > 8) {
                    i14 = i12 + (i12 >> 1);
                }
                c(i14);
                if (i11 > 0) {
                    System.arraycopy(iArr, 0, this.f2365a, 0, i11);
                    System.arraycopy(eArr, 0, this.f2366b, 0, i11);
                }
                if (i11 < i13) {
                    int i17 = i11 + 1;
                    int i18 = i13 - i11;
                    System.arraycopy(iArr, i17, this.f2365a, i11, i18);
                    System.arraycopy(eArr, i17, this.f2366b, i11, i18);
                }
            }
            if (i12 == this.f2367c) {
                this.f2367c = i13;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e11;
    }

    public int indexOf(Object obj) {
        return obj == null ? h() : g(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f2367c <= 0;
    }

    public Iterator<E> iterator() {
        return new a();
    }

    public E k(int i11) {
        return this.f2366b[i11];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        i(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z11 = false;
        for (Object remove : collection) {
            z11 |= remove(remove);
        }
        return z11;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z11 = false;
        for (int i11 = this.f2367c - 1; i11 >= 0; i11--) {
            if (!collection.contains(this.f2366b[i11])) {
                i(i11);
                z11 = true;
            }
        }
        return z11;
    }

    public int size() {
        return this.f2367c;
    }

    public Object[] toArray() {
        int i11 = this.f2367c;
        Object[] objArr = new Object[i11];
        System.arraycopy(this.f2366b, 0, objArr, 0, i11);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2367c * 14);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f2367c; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object k = k(i11);
            if (k != this) {
                sb2.append(k);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public b(int i11) {
        if (i11 == 0) {
            this.f2365a = c.f2369a;
            this.f2366b = c.f2371c;
        } else {
            c(i11);
        }
        this.f2367c = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2367c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2367c);
        }
        System.arraycopy(this.f2366b, 0, tArr, 0, this.f2367c);
        int length = tArr.length;
        int i11 = this.f2367c;
        if (length > i11) {
            tArr[i11] = null;
        }
        return tArr;
    }

    public b(Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }
}
