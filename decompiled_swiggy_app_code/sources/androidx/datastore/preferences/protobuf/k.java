package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.w;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList */
final class k extends c<Double> implements w.b, RandomAccess, t0 {

    /* renamed from: d  reason: collision with root package name */
    private static final k f10065d;

    /* renamed from: b  reason: collision with root package name */
    private double[] f10066b;

    /* renamed from: c  reason: collision with root package name */
    private int f10067c;

    static {
        k kVar = new k(new double[0], 0);
        f10065d = kVar;
        kVar.makeImmutable();
    }

    k() {
        this(new double[10], 0);
    }

    private void f(int i11, double d11) {
        int i12;
        c();
        if (i11 < 0 || i11 > (i12 = this.f10067c)) {
            throw new IndexOutOfBoundsException(i(i11));
        }
        double[] dArr = this.f10066b;
        if (i12 < dArr.length) {
            System.arraycopy(dArr, i11, dArr, i11 + 1, i12 - i11);
        } else {
            double[] dArr2 = new double[(((i12 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            System.arraycopy(this.f10066b, i11, dArr2, i11 + 1, this.f10067c - i11);
            this.f10066b = dArr2;
        }
        this.f10066b[i11] = d11;
        this.f10067c++;
        this.modCount++;
    }

    private void g(int i11) {
        if (i11 < 0 || i11 >= this.f10067c) {
            throw new IndexOutOfBoundsException(i(i11));
        }
    }

    private String i(int i11) {
        return "Index:" + i11 + ", Size:" + this.f10067c;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        c();
        w.a(collection);
        if (!(collection instanceof k)) {
            return super.addAll(collection);
        }
        k kVar = (k) collection;
        int i11 = kVar.f10067c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f10067c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            double[] dArr = this.f10066b;
            if (i13 > dArr.length) {
                this.f10066b = Arrays.copyOf(dArr, i13);
            }
            System.arraycopy(kVar.f10066b, 0, this.f10066b, this.f10067c, kVar.f10067c);
            this.f10067c = i13;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addDouble(double d11) {
        c();
        int i11 = this.f10067c;
        double[] dArr = this.f10066b;
        if (i11 == dArr.length) {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            this.f10066b = dArr2;
        }
        double[] dArr3 = this.f10066b;
        int i12 = this.f10067c;
        this.f10067c = i12 + 1;
        dArr3[i12] = d11;
    }

    /* renamed from: d */
    public void add(int i11, Double d11) {
        f(i11, d11.doubleValue());
    }

    /* renamed from: e */
    public boolean add(Double d11) {
        addDouble(d11.doubleValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return super.equals(obj);
        }
        k kVar = (k) obj;
        if (this.f10067c != kVar.f10067c) {
            return false;
        }
        double[] dArr = kVar.f10066b;
        for (int i11 = 0; i11 < this.f10067c; i11++) {
            if (Double.doubleToLongBits(this.f10066b[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public double getDouble(int i11) {
        g(i11);
        return this.f10066b[i11];
    }

    /* renamed from: h */
    public Double get(int i11) {
        return Double.valueOf(getDouble(i11));
    }

    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f10067c; i12++) {
            i11 = (i11 * 31) + w.f(Double.doubleToLongBits(this.f10066b[i12]));
        }
        return i11;
    }

    /* renamed from: k */
    public w.b mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f10067c) {
            return new k(Arrays.copyOf(this.f10066b, i11), this.f10067c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public Double remove(int i11) {
        c();
        g(i11);
        double[] dArr = this.f10066b;
        double d11 = dArr[i11];
        int i12 = this.f10067c;
        if (i11 < i12 - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, (i12 - i11) - 1);
        }
        this.f10067c--;
        this.modCount++;
        return Double.valueOf(d11);
    }

    /* renamed from: m */
    public Double set(int i11, Double d11) {
        return Double.valueOf(setDouble(i11, d11.doubleValue()));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i11, int i12) {
        c();
        if (i12 >= i11) {
            double[] dArr = this.f10066b;
            System.arraycopy(dArr, i12, dArr, i11, this.f10067c - i12);
            this.f10067c -= i12 - i11;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public double setDouble(int i11, double d11) {
        c();
        g(i11);
        double[] dArr = this.f10066b;
        double d12 = dArr[i11];
        dArr[i11] = d11;
        return d12;
    }

    public int size() {
        return this.f10067c;
    }

    private k(double[] dArr, int i11) {
        this.f10066b = dArr;
        this.f10067c = i11;
    }

    public boolean remove(Object obj) {
        c();
        for (int i11 = 0; i11 < this.f10067c; i11++) {
            if (obj.equals(Double.valueOf(this.f10066b[i11]))) {
                double[] dArr = this.f10066b;
                System.arraycopy(dArr, i11 + 1, dArr, i11, (this.f10067c - i11) - 1);
                this.f10067c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
