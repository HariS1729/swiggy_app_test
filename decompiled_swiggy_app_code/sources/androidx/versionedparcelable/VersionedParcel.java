package androidx.versionedparcelable;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import z3.b;

public abstract class VersionedParcel {

    /* renamed from: a  reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f12119a;

    /* renamed from: b  reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f12120b;

    /* renamed from: c  reason: collision with root package name */
    protected final androidx.collection.a<String, Class> f12121c;

    public static class ParcelException extends RuntimeException {
    }

    class a extends ObjectInputStream {
        a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            if (cls != null) {
                return cls;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public VersionedParcel(androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        this.f12119a = aVar;
        this.f12120b = aVar2;
        this.f12121c = aVar3;
    }

    private void T(Serializable serializable) {
        if (serializable == null) {
            U((String) null);
            return;
        }
        String name = serializable.getClass().getName();
        U(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            J(byteArrayOutputStream.toByteArray());
        } catch (IOException e11) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e11);
        }
    }

    private void a0(b bVar) {
        try {
            U(c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e11);
        }
    }

    private Class c(Class<? extends b> cls) throws ClassNotFoundException {
        Class cls2 = this.f12121c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f12121c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method method = this.f12119a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f12119a.put(str, declaredMethod);
        return declaredMethod;
    }

    private <T> int e(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof b) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    private Method f(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f12120b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c11 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c11.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.f12120b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public abstract IBinder A();

    /* access modifiers changed from: protected */
    public <T extends b> T B() {
        String y11 = y();
        if (y11 == null) {
            return null;
        }
        return q(y11, b());
    }

    public <T extends b> T C(T t, int i11) {
        if (!p(i11)) {
            return t;
        }
        return B();
    }

    /* access modifiers changed from: protected */
    public abstract void D(int i11);

    public void E(boolean z11, boolean z12) {
    }

    /* access modifiers changed from: protected */
    public <T> void F(T[] tArr) {
        if (tArr == null) {
            N(-1);
            return;
        }
        int length = tArr.length;
        N(length);
        if (length > 0) {
            int i11 = 0;
            int e11 = e(tArr[0]);
            N(e11);
            if (e11 == 1) {
                while (i11 < length) {
                    Y((b) tArr[i11]);
                    i11++;
                }
            } else if (e11 == 2) {
                while (i11 < length) {
                    R((Parcelable) tArr[i11]);
                    i11++;
                }
            } else if (e11 == 3) {
                while (i11 < length) {
                    T((Serializable) tArr[i11]);
                    i11++;
                }
            } else if (e11 == 4) {
                while (i11 < length) {
                    U((String) tArr[i11]);
                    i11++;
                }
            } else if (e11 == 5) {
                while (i11 < length) {
                    W((IBinder) tArr[i11]);
                    i11++;
                }
            }
        }
    }

    public <T> void G(T[] tArr, int i11) {
        D(i11);
        F(tArr);
    }

    /* access modifiers changed from: protected */
    public abstract void H(boolean z11);

    public void I(boolean z11, int i11) {
        D(i11);
        H(z11);
    }

    /* access modifiers changed from: protected */
    public abstract void J(byte[] bArr);

    public void K(byte[] bArr, int i11) {
        D(i11);
        J(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract void L(CharSequence charSequence);

    public void M(CharSequence charSequence, int i11) {
        D(i11);
        L(charSequence);
    }

    /* access modifiers changed from: protected */
    public abstract void N(int i11);

    public void O(int i11, int i12) {
        D(i12);
        N(i11);
    }

    /* access modifiers changed from: protected */
    public abstract void P(long j);

    public void Q(long j, int i11) {
        D(i11);
        P(j);
    }

    /* access modifiers changed from: protected */
    public abstract void R(Parcelable parcelable);

    public void S(Parcelable parcelable, int i11) {
        D(i11);
        R(parcelable);
    }

    /* access modifiers changed from: protected */
    public abstract void U(String str);

    public void V(String str, int i11) {
        D(i11);
        U(str);
    }

    /* access modifiers changed from: protected */
    public abstract void W(IBinder iBinder);

    /* access modifiers changed from: protected */
    public <T extends b> void X(T t, VersionedParcel versionedParcel) {
        try {
            f(t.getClass()).invoke((Object) null, new Object[]{t, versionedParcel});
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e14);
        }
    }

    /* access modifiers changed from: protected */
    public void Y(b bVar) {
        if (bVar == null) {
            U((String) null);
            return;
        }
        a0(bVar);
        VersionedParcel b11 = b();
        X(bVar, b11);
        b11.a();
    }

    public void Z(b bVar, int i11) {
        D(i11);
        Y(bVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract VersionedParcel b();

    public boolean g() {
        return false;
    }

    /* access modifiers changed from: protected */
    public <T> T[] h(T[] tArr) {
        int r11 = r();
        if (r11 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(r11);
        if (r11 != 0) {
            int r12 = r();
            if (r11 < 0) {
                return null;
            }
            if (r12 == 1) {
                while (r11 > 0) {
                    arrayList.add(B());
                    r11--;
                }
            } else if (r12 == 2) {
                while (r11 > 0) {
                    arrayList.add(v());
                    r11--;
                }
            } else if (r12 == 3) {
                while (r11 > 0) {
                    arrayList.add(x());
                    r11--;
                }
            } else if (r12 == 4) {
                while (r11 > 0) {
                    arrayList.add(y());
                    r11--;
                }
            } else if (r12 == 5) {
                while (r11 > 0) {
                    arrayList.add(A());
                    r11--;
                }
            }
        }
        return arrayList.toArray(tArr);
    }

    public <T> T[] i(T[] tArr, int i11) {
        if (!p(i11)) {
            return tArr;
        }
        return h(tArr);
    }

    /* access modifiers changed from: protected */
    public abstract boolean j();

    public boolean k(boolean z11, int i11) {
        if (!p(i11)) {
            return z11;
        }
        return j();
    }

    /* access modifiers changed from: protected */
    public abstract byte[] l();

    public byte[] m(byte[] bArr, int i11) {
        if (!p(i11)) {
            return bArr;
        }
        return l();
    }

    /* access modifiers changed from: protected */
    public abstract CharSequence n();

    public CharSequence o(CharSequence charSequence, int i11) {
        if (!p(i11)) {
            return charSequence;
        }
        return n();
    }

    /* access modifiers changed from: protected */
    public abstract boolean p(int i11);

    /* access modifiers changed from: protected */
    public <T extends b> T q(String str, VersionedParcel versionedParcel) {
        try {
            return (b) d(str).invoke((Object) null, new Object[]{versionedParcel});
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e14);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int r();

    public int s(int i11, int i12) {
        if (!p(i12)) {
            return i11;
        }
        return r();
    }

    /* access modifiers changed from: protected */
    public abstract long t();

    public long u(long j, int i11) {
        if (!p(i11)) {
            return j;
        }
        return t();
    }

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T v();

    public <T extends Parcelable> T w(T t, int i11) {
        if (!p(i11)) {
            return t;
        }
        return v();
    }

    /* access modifiers changed from: protected */
    public Serializable x() {
        String y11 = y();
        if (y11 == null) {
            return null;
        }
        try {
            return (Serializable) new a(new ByteArrayInputStream(l())).readObject();
        } catch (IOException e11) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + y11 + ")", e11);
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + y11 + ")", e12);
        }
    }

    /* access modifiers changed from: protected */
    public abstract String y();

    public String z(String str, int i11) {
        if (!p(i11)) {
            return str;
        }
        return y();
    }
}
