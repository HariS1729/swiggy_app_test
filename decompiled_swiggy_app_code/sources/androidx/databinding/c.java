package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* compiled from: CallbackRegistry */
public class c<C, T, A> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private List<C> f9718a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private long f9719b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long[] f9720c;

    /* renamed from: d  reason: collision with root package name */
    private int f9721d;

    /* renamed from: e  reason: collision with root package name */
    private final a<C, T, A> f9722e;

    /* compiled from: CallbackRegistry */
    public static abstract class a<C, T, A> {
        public abstract void a(C c11, T t, int i11, A a11);
    }

    public c(a<C, T, A> aVar) {
        this.f9722e = aVar;
    }

    private boolean f(int i11) {
        int i12;
        if (i11 < 64) {
            return ((1 << i11) & this.f9719b) != 0;
        }
        long[] jArr = this.f9720c;
        if (jArr == null || (i12 = (i11 / 64) - 1) >= jArr.length) {
            return false;
        }
        if (((1 << (i11 % 64)) & jArr[i12]) != 0) {
            return true;
        }
        return false;
    }

    private void h(T t, int i11, A a11, int i12, int i13, long j) {
        long j11 = 1;
        while (i12 < i13) {
            if ((j & j11) == 0) {
                this.f9722e.a(this.f9718a.get(i12), t, i11, a11);
            }
            j11 <<= 1;
            i12++;
        }
    }

    private void i(T t, int i11, A a11) {
        h(t, i11, a11, 0, Math.min(64, this.f9718a.size()), this.f9719b);
    }

    private void j(T t, int i11, A a11) {
        int size = this.f9718a.size();
        long[] jArr = this.f9720c;
        int length = jArr == null ? -1 : jArr.length - 1;
        k(t, i11, a11, length);
        h(t, i11, a11, (length + 2) * 64, size, 0);
    }

    private void k(T t, int i11, A a11, int i12) {
        if (i12 < 0) {
            i(t, i11, a11);
            return;
        }
        long j = this.f9720c[i12];
        int i13 = (i12 + 1) * 64;
        int min = Math.min(this.f9718a.size(), i13 + 64);
        k(t, i11, a11, i12 - 1);
        h(t, i11, a11, i13, min, j);
    }

    private void m(int i11, long j) {
        long j11 = Long.MIN_VALUE;
        for (int i12 = (i11 + 64) - 1; i12 >= i11; i12--) {
            if ((j & j11) != 0) {
                this.f9718a.remove(i12);
            }
            j11 >>>= 1;
        }
    }

    private void n(int i11) {
        if (i11 < 64) {
            this.f9719b = (1 << i11) | this.f9719b;
            return;
        }
        int i12 = (i11 / 64) - 1;
        long[] jArr = this.f9720c;
        if (jArr == null) {
            this.f9720c = new long[(this.f9718a.size() / 64)];
        } else if (jArr.length <= i12) {
            long[] jArr2 = new long[(this.f9718a.size() / 64)];
            long[] jArr3 = this.f9720c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f9720c = jArr2;
        }
        long j = 1 << (i11 % 64);
        long[] jArr4 = this.f9720c;
        jArr4[i12] = j | jArr4[i12];
    }

    public synchronized void b(C c11) {
        if (c11 != null) {
            int lastIndexOf = this.f9718a.lastIndexOf(c11);
            if (lastIndexOf < 0 || f(lastIndexOf)) {
                this.f9718a.add(c11);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    /* renamed from: e */
    public synchronized c<C, T, A> clone() {
        c<C, T, A> cVar;
        CloneNotSupportedException e11;
        try {
            cVar = (c) super.clone();
            try {
                cVar.f9719b = 0;
                cVar.f9720c = null;
                cVar.f9721d = 0;
                cVar.f9718a = new ArrayList();
                int size = this.f9718a.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (!f(i11)) {
                        cVar.f9718a.add(this.f9718a.get(i11));
                    }
                }
            } catch (CloneNotSupportedException e12) {
                e11 = e12;
                e11.printStackTrace();
                return cVar;
            }
        } catch (CloneNotSupportedException e13) {
            CloneNotSupportedException cloneNotSupportedException = e13;
            cVar = null;
            e11 = cloneNotSupportedException;
            e11.printStackTrace();
            return cVar;
        }
        return cVar;
    }

    public synchronized void g(T t, int i11, A a11) {
        this.f9721d++;
        j(t, i11, a11);
        int i12 = this.f9721d - 1;
        this.f9721d = i12;
        if (i12 == 0) {
            long[] jArr = this.f9720c;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j = this.f9720c[length];
                    if (j != 0) {
                        m((length + 1) * 64, j);
                        this.f9720c[length] = 0;
                    }
                }
            }
            long j11 = this.f9719b;
            if (j11 != 0) {
                m(0, j11);
                this.f9719b = 0;
            }
        }
    }

    public synchronized void l(C c11) {
        if (this.f9721d == 0) {
            this.f9718a.remove(c11);
        } else {
            int lastIndexOf = this.f9718a.lastIndexOf(c11);
            if (lastIndexOf >= 0) {
                n(lastIndexOf);
            }
        }
    }
}
