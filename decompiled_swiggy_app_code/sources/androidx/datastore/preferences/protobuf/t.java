package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.w;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList */
final class t extends c<Float> implements w.f, RandomAccess, t0 {

    /* renamed from: d  reason: collision with root package name */
    private static final t f10106d;

    /* renamed from: b  reason: collision with root package name */
    private float[] f10107b;

    /* renamed from: c  reason: collision with root package name */
    private int f10108c;

    static {
        t tVar = new t(new float[0], 0);
        f10106d = tVar;
        tVar.makeImmutable();
    }

    t() {
        this(new float[10], 0);
    }

    private void f(int i11, float f11) {
        int i12;
        c();
        if (i11 < 0 || i11 > (i12 = this.f10108c)) {
            throw new IndexOutOfBoundsException(i(i11));
        }
        float[] fArr = this.f10107b;
        if (i12 < fArr.length) {
            System.arraycopy(fArr, i11, fArr, i11 + 1, i12 - i11);
        } else {
            float[] fArr2 = new float[(((i12 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            System.arraycopy(this.f10107b, i11, fArr2, i11 + 1, this.f10108c - i11);
            this.f10107b = fArr2;
        }
        this.f10107b[i11] = f11;
        this.f10108c++;
        this.modCount++;
    }

    private void g(int i11) {
        if (i11 < 0 || i11 >= this.f10108c) {
            throw new IndexOutOfBoundsException(i(i11));
        }
    }

    private String i(int i11) {
        return "Index:" + i11 + ", Size:" + this.f10108c;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        c();
        w.a(collection);
        if (!(collection instanceof t)) {
            return super.addAll(collection);
        }
        t tVar = (t) collection;
        int i11 = tVar.f10108c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f10108c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            float[] fArr = this.f10107b;
            if (i13 > fArr.length) {
                this.f10107b = Arrays.copyOf(fArr, i13);
            }
            System.arraycopy(tVar.f10107b, 0, this.f10107b, this.f10108c, tVar.f10108c);
            this.f10108c = i13;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addFloat(float f11) {
        c();
        int i11 = this.f10108c;
        float[] fArr = this.f10107b;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            this.f10107b = fArr2;
        }
        float[] fArr3 = this.f10107b;
        int i12 = this.f10108c;
        this.f10108c = i12 + 1;
        fArr3[i12] = f11;
    }

    /* renamed from: d */
    public void add(int i11, Float f11) {
        f(i11, f11.floatValue());
    }

    /* renamed from: e */
    public boolean add(Float f11) {
        addFloat(f11.floatValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return super.equals(obj);
        }
        t tVar = (t) obj;
        if (this.f10108c != tVar.f10108c) {
            return false;
        }
        float[] fArr = tVar.f10107b;
        for (int i11 = 0; i11 < this.f10108c; i11++) {
            if (Float.floatToIntBits(this.f10107b[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public float getFloat(int i11) {
        g(i11);
        return this.f10107b[i11];
    }

    /* renamed from: h */
    public Float get(int i11) {
        return Float.valueOf(getFloat(i11));
    }

    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f10108c; i12++) {
            i11 = (i11 * 31) + Float.floatToIntBits(this.f10107b[i12]);
        }
        return i11;
    }

    /* renamed from: k */
    public w.f mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f10108c) {
            return new t(Arrays.copyOf(this.f10107b, i11), this.f10108c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public Float remove(int i11) {
        c();
        g(i11);
        float[] fArr = this.f10107b;
        float f11 = fArr[i11];
        int i12 = this.f10108c;
        if (i11 < i12 - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (i12 - i11) - 1);
        }
        this.f10108c--;
        this.modCount++;
        return Float.valueOf(f11);
    }

    /* renamed from: m */
    public Float set(int i11, Float f11) {
        return Float.valueOf(setFloat(i11, f11.floatValue()));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i11, int i12) {
        c();
        if (i12 >= i11) {
            float[] fArr = this.f10107b;
            System.arraycopy(fArr, i12, fArr, i11, this.f10108c - i12);
            this.f10108c -= i12 - i11;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public float setFloat(int i11, float f11) {
        c();
        g(i11);
        float[] fArr = this.f10107b;
        float f12 = fArr[i11];
        fArr[i11] = f11;
        return f12;
    }

    public int size() {
        return this.f10108c;
    }

    private t(float[] fArr, int i11) {
        this.f10107b = fArr;
        this.f10108c = i11;
    }

    public boolean remove(Object obj) {
        c();
        for (int i11 = 0; i11 < this.f10108c; i11++) {
            if (obj.equals(Float.valueOf(this.f10107b[i11]))) {
                float[] fArr = this.f10107b;
                System.arraycopy(fArr, i11 + 1, fArr, i11, (this.f10108c - i11) - 1);
                this.f10108c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
