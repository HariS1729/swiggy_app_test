package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList */
final class v0<E> extends c<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final v0<Object> f10116d;

    /* renamed from: b  reason: collision with root package name */
    private E[] f10117b;

    /* renamed from: c  reason: collision with root package name */
    private int f10118c;

    static {
        v0<Object> v0Var = new v0<>(new Object[0], 0);
        f10116d = v0Var;
        v0Var.makeImmutable();
    }

    private v0(E[] eArr, int i11) {
        this.f10117b = eArr;
        this.f10118c = i11;
    }

    private static <E> E[] d(int i11) {
        return new Object[i11];
    }

    public static <E> v0<E> f() {
        return f10116d;
    }

    private void g(int i11) {
        if (i11 < 0 || i11 >= this.f10118c) {
            throw new IndexOutOfBoundsException(h(i11));
        }
    }

    private String h(int i11) {
        return "Index:" + i11 + ", Size:" + this.f10118c;
    }

    public boolean add(E e11) {
        c();
        int i11 = this.f10118c;
        E[] eArr = this.f10117b;
        if (i11 == eArr.length) {
            this.f10117b = Arrays.copyOf(eArr, ((i11 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f10117b;
        int i12 = this.f10118c;
        this.f10118c = i12 + 1;
        eArr2[i12] = e11;
        this.modCount++;
        return true;
    }

    public E get(int i11) {
        g(i11);
        return this.f10117b[i11];
    }

    /* renamed from: i */
    public v0<E> mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f10118c) {
            return new v0<>(Arrays.copyOf(this.f10117b, i11), this.f10118c);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i11) {
        c();
        g(i11);
        E[] eArr = this.f10117b;
        E e11 = eArr[i11];
        int i12 = this.f10118c;
        if (i11 < i12 - 1) {
            System.arraycopy(eArr, i11 + 1, eArr, i11, (i12 - i11) - 1);
        }
        this.f10118c--;
        this.modCount++;
        return e11;
    }

    public E set(int i11, E e11) {
        c();
        g(i11);
        E[] eArr = this.f10117b;
        E e12 = eArr[i11];
        eArr[i11] = e11;
        this.modCount++;
        return e12;
    }

    public int size() {
        return this.f10118c;
    }

    public void add(int i11, E e11) {
        int i12;
        c();
        if (i11 < 0 || i11 > (i12 = this.f10118c)) {
            throw new IndexOutOfBoundsException(h(i11));
        }
        E[] eArr = this.f10117b;
        if (i12 < eArr.length) {
            System.arraycopy(eArr, i11, eArr, i11 + 1, i12 - i11);
        } else {
            E[] d11 = d(((i12 * 3) / 2) + 1);
            System.arraycopy(this.f10117b, 0, d11, 0, i11);
            System.arraycopy(this.f10117b, i11, d11, i11 + 1, this.f10118c - i11);
            this.f10117b = d11;
        }
        this.f10117b[i11] = e11;
        this.f10118c++;
        this.modCount++;
    }
}
