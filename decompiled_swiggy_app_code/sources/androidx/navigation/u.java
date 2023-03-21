package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import okhttp3.HttpUrl;

/* compiled from: NavType */
public abstract class u<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final u<Integer> f10979b = new c(false);

    /* renamed from: c  reason: collision with root package name */
    public static final u<Integer> f10980c = new d(false);

    /* renamed from: d  reason: collision with root package name */
    public static final u<int[]> f10981d = new e(true);

    /* renamed from: e  reason: collision with root package name */
    public static final u<Long> f10982e = new f(false);

    /* renamed from: f  reason: collision with root package name */
    public static final u<long[]> f10983f = new g(true);

    /* renamed from: g  reason: collision with root package name */
    public static final u<Float> f10984g = new h(false);

    /* renamed from: h  reason: collision with root package name */
    public static final u<float[]> f10985h = new i(true);

    /* renamed from: i  reason: collision with root package name */
    public static final u<Boolean> f10986i = new j(false);
    public static final u<boolean[]> j = new k(true);
    public static final u<String> k = new a(true);

    /* renamed from: l  reason: collision with root package name */
    public static final u<String[]> f10987l = new b(true);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10988a;

    /* compiled from: NavType */
    class a extends u<String> {
        a(boolean z11) {
            super(z11);
        }

        public String c() {
            return "string";
        }

        /* renamed from: j */
        public String b(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        /* renamed from: k */
        public String h(String str) {
            return str;
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    /* compiled from: NavType */
    class b extends u<String[]> {
        b(boolean z11) {
            super(z11);
        }

        public String c() {
            return "string[]";
        }

        /* renamed from: j */
        public String[] b(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        /* renamed from: k */
        public String[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    /* compiled from: NavType */
    class c extends u<Integer> {
        c(boolean z11) {
            super(z11);
        }

        public String c() {
            return "integer";
        }

        /* renamed from: j */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: k */
        public Integer h(String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* compiled from: NavType */
    class d extends u<Integer> {
        d(boolean z11) {
            super(z11);
        }

        public String c() {
            return "reference";
        }

        /* renamed from: j */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: k */
        public Integer h(String str) {
            throw new UnsupportedOperationException("References don't support parsing string values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* compiled from: NavType */
    class e extends u<int[]> {
        e(boolean z11) {
            super(z11);
        }

        public String c() {
            return "integer[]";
        }

        /* renamed from: j */
        public int[] b(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        /* renamed from: k */
        public int[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    /* compiled from: NavType */
    class f extends u<Long> {
        f(boolean z11) {
            super(z11);
        }

        public String c() {
            return "long";
        }

        /* renamed from: j */
        public Long b(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        /* renamed from: k */
        public Long h(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                return Long.valueOf(Long.parseLong(str.substring(2), 16));
            }
            return Long.valueOf(Long.parseLong(str));
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Long l11) {
            bundle.putLong(str, l11.longValue());
        }
    }

    /* compiled from: NavType */
    class g extends u<long[]> {
        g(boolean z11) {
            super(z11);
        }

        public String c() {
            return "long[]";
        }

        /* renamed from: j */
        public long[] b(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        /* renamed from: k */
        public long[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    /* compiled from: NavType */
    class h extends u<Float> {
        h(boolean z11) {
            super(z11);
        }

        public String c() {
            return "float";
        }

        /* renamed from: j */
        public Float b(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        /* renamed from: k */
        public Float h(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Float f11) {
            bundle.putFloat(str, f11.floatValue());
        }
    }

    /* compiled from: NavType */
    class i extends u<float[]> {
        i(boolean z11) {
            super(z11);
        }

        public String c() {
            return "float[]";
        }

        /* renamed from: j */
        public float[] b(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        /* renamed from: k */
        public float[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    /* compiled from: NavType */
    class j extends u<Boolean> {
        j(boolean z11) {
            super(z11);
        }

        public String c() {
            return "boolean";
        }

        /* renamed from: j */
        public Boolean b(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        /* renamed from: k */
        public Boolean h(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* compiled from: NavType */
    class k extends u<boolean[]> {
        k(boolean z11) {
            super(z11);
        }

        public String c() {
            return "boolean[]";
        }

        /* renamed from: j */
        public boolean[] b(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        /* renamed from: k */
        public boolean[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* compiled from: NavType */
    public static final class l<D extends Enum> extends p<D> {
        private final Class<D> n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        public String c() {
            return this.n.getName();
        }

        /* renamed from: m */
        public D k(String str) {
            for (D d11 : (Enum[]) this.n.getEnumConstants()) {
                if (d11.name().equals(str)) {
                    return d11;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.n.getName() + ".");
        }
    }

    /* compiled from: NavType */
    public static final class m<D extends Parcelable> extends u<D[]> {

        /* renamed from: m  reason: collision with root package name */
        private final Class<D[]> f10989m;

        public m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f10989m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e11) {
                    throw new RuntimeException(e11);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
        }

        public String c() {
            return this.f10989m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.f10989m.equals(((m) obj).f10989m);
        }

        public int hashCode() {
            return this.f10989m.hashCode();
        }

        /* renamed from: j */
        public D[] b(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        /* renamed from: k */
        public D[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.f10989m.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    /* compiled from: NavType */
    public static final class n<D> extends u<D> {

        /* renamed from: m  reason: collision with root package name */
        private final Class<D> f10990m;

        public n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f10990m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        public D b(Bundle bundle, String str) {
            return bundle.get(str);
        }

        public String c() {
            return this.f10990m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.f10990m.equals(((n) obj).f10990m);
        }

        public D h(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.f10990m.hashCode();
        }

        public void i(Bundle bundle, String str, D d11) {
            this.f10990m.cast(d11);
            if (d11 == null || (d11 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d11);
            } else if (d11 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d11);
            }
        }
    }

    /* compiled from: NavType */
    public static final class o<D extends Serializable> extends u<D[]> {

        /* renamed from: m  reason: collision with root package name */
        private final Class<D[]> f10991m;

        public o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f10991m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e11) {
                    throw new RuntimeException(e11);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
        }

        public String c() {
            return this.f10991m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.f10991m.equals(((o) obj).f10991m);
        }

        public int hashCode() {
            return this.f10991m.hashCode();
        }

        /* renamed from: j */
        public D[] b(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        /* renamed from: k */
        public D[] h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [D[], java.lang.Object, java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void i(android.os.Bundle r2, java.lang.String r3, D[] r4) {
            /*
                r1 = this;
                java.lang.Class<D[]> r0 = r1.f10991m
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.u.o.i(android.os.Bundle, java.lang.String, java.io.Serializable[]):void");
        }
    }

    u(boolean z11) {
        this.f10988a = z11;
    }

    public static u<?> a(String str, String str2) {
        String str3;
        u<Integer> uVar = f10979b;
        if (uVar.c().equals(str)) {
            return uVar;
        }
        u<int[]> uVar2 = f10981d;
        if (uVar2.c().equals(str)) {
            return uVar2;
        }
        u<Long> uVar3 = f10982e;
        if (uVar3.c().equals(str)) {
            return uVar3;
        }
        u<long[]> uVar4 = f10983f;
        if (uVar4.c().equals(str)) {
            return uVar4;
        }
        u<Boolean> uVar5 = f10986i;
        if (uVar5.c().equals(str)) {
            return uVar5;
        }
        u<boolean[]> uVar6 = j;
        if (uVar6.c().equals(str)) {
            return uVar6;
        }
        u<String> uVar7 = k;
        if (uVar7.c().equals(str)) {
            return uVar7;
        }
        u<String[]> uVar8 = f10987l;
        if (uVar8.c().equals(str)) {
            return uVar8;
        }
        u<Float> uVar9 = f10984g;
        if (uVar9.c().equals(str)) {
            return uVar9;
        }
        u<float[]> uVar10 = f10985h;
        if (uVar10.c().equals(str)) {
            return uVar10;
        }
        u<Integer> uVar11 = f10980c;
        if (uVar11.c().equals(str)) {
            return uVar11;
        }
        if (str == null || str.isEmpty()) {
            return uVar7;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                str3 = str;
            } else {
                str3 = str2 + str;
            }
            if (str.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                str3 = str3.substring(0, str3.length() - 2);
                Class<?> cls = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new m(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new o(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new n(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new l(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new p(cls2);
                }
            }
            throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = f10986i;
        r0.h(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        return k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r0 = f10982e;
        r0.h(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = f10984g;
        r0.h(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0006 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.navigation.u d(java.lang.String r1) {
        /*
            androidx.navigation.u<java.lang.Integer> r0 = f10979b     // Catch:{ IllegalArgumentException -> 0x0006 }
            r0.h(r1)     // Catch:{ IllegalArgumentException -> 0x0006 }
            return r0
        L_0x0006:
            androidx.navigation.u<java.lang.Long> r0 = f10982e     // Catch:{ IllegalArgumentException -> 0x000c }
            r0.h(r1)     // Catch:{ IllegalArgumentException -> 0x000c }
            return r0
        L_0x000c:
            androidx.navigation.u<java.lang.Float> r0 = f10984g     // Catch:{ IllegalArgumentException -> 0x0012 }
            r0.h(r1)     // Catch:{ IllegalArgumentException -> 0x0012 }
            return r0
        L_0x0012:
            androidx.navigation.u<java.lang.Boolean> r0 = f10986i     // Catch:{ IllegalArgumentException -> 0x0018 }
            r0.h(r1)     // Catch:{ IllegalArgumentException -> 0x0018 }
            return r0
        L_0x0018:
            androidx.navigation.u<java.lang.String> r1 = k
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.u.d(java.lang.String):androidx.navigation.u");
    }

    static u e(Object obj) {
        if (obj instanceof Integer) {
            return f10979b;
        }
        if (obj instanceof int[]) {
            return f10981d;
        }
        if (obj instanceof Long) {
            return f10982e;
        }
        if (obj instanceof long[]) {
            return f10983f;
        }
        if (obj instanceof Float) {
            return f10984g;
        }
        if (obj instanceof float[]) {
            return f10985h;
        }
        if (obj instanceof Boolean) {
            return f10986i;
        }
        if (obj instanceof boolean[]) {
            return j;
        }
        if ((obj instanceof String) || obj == null) {
            return k;
        }
        if (obj instanceof String[]) {
            return f10987l;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new m(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new o(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new n(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new l(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new p(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    public abstract T b(Bundle bundle, String str);

    public abstract String c();

    public boolean f() {
        return this.f10988a;
    }

    /* access modifiers changed from: package-private */
    public T g(Bundle bundle, String str, String str2) {
        T h11 = h(str2);
        i(bundle, str, h11);
        return h11;
    }

    public abstract T h(String str);

    public abstract void i(Bundle bundle, String str, T t);

    public String toString() {
        return c();
    }

    /* compiled from: NavType */
    public static class p<D extends Serializable> extends u<D> {

        /* renamed from: m  reason: collision with root package name */
        private final Class<D> f10992m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.f10992m = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        public String c() {
            return this.f10992m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return this.f10992m.equals(((p) obj).f10992m);
        }

        public int hashCode() {
            return this.f10992m.hashCode();
        }

        /* renamed from: j */
        public D b(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        /* renamed from: k */
        public D h(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, D d11) {
            this.f10992m.cast(d11);
            bundle.putSerializable(str, d11);
        }

        p(boolean z11, Class<D> cls) {
            super(z11);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f10992m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }
    }
}
