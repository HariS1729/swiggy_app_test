package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil */
final class i1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f10044a = Logger.getLogger(i1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f10045b = B();

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f10046c = d.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f10047d = m(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f10048e = m(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final e f10049f = z();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f10050g = Q();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f10051h = P();

    /* renamed from: i  reason: collision with root package name */
    static final long f10052i;
    private static final long j;
    private static final long k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f10053l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f10054m;
    private static final long n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f10055o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f10056p;
    private static final long q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f10057r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f10058s;
    private static final long t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f10059u;
    private static final long v = o(l());

    /* renamed from: w  reason: collision with root package name */
    private static final int f10060w;

    /* renamed from: x  reason: collision with root package name */
    static final boolean f10061x = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* compiled from: UnsafeUtil */
    static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* compiled from: UnsafeUtil */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j) {
            if (i1.f10061x) {
                return i1.q(obj, j);
            }
            return i1.r(obj, j);
        }

        public byte d(Object obj, long j) {
            if (i1.f10061x) {
                return i1.t(obj, j);
            }
            return i1.u(obj, j);
        }

        public double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        public float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        public void k(Object obj, long j, boolean z11) {
            if (i1.f10061x) {
                i1.F(obj, j, z11);
            } else {
                i1.G(obj, j, z11);
            }
        }

        public void l(Object obj, long j, byte b11) {
            if (i1.f10061x) {
                i1.I(obj, j, b11);
            } else {
                i1.J(obj, j, b11);
            }
        }

        public void m(Object obj, long j, double d11) {
            p(obj, j, Double.doubleToLongBits(d11));
        }

        public void n(Object obj, long j, float f11) {
            o(obj, j, Float.floatToIntBits(f11));
        }
    }

    /* compiled from: UnsafeUtil */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j) {
            if (i1.f10061x) {
                return i1.q(obj, j);
            }
            return i1.r(obj, j);
        }

        public byte d(Object obj, long j) {
            if (i1.f10061x) {
                return i1.t(obj, j);
            }
            return i1.u(obj, j);
        }

        public double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        public float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        public void k(Object obj, long j, boolean z11) {
            if (i1.f10061x) {
                i1.F(obj, j, z11);
            } else {
                i1.G(obj, j, z11);
            }
        }

        public void l(Object obj, long j, byte b11) {
            if (i1.f10061x) {
                i1.I(obj, j, b11);
            } else {
                i1.J(obj, j, b11);
            }
        }

        public void m(Object obj, long j, double d11) {
            p(obj, j, Double.doubleToLongBits(d11));
        }

        public void n(Object obj, long j, float f11) {
            o(obj, j, Float.floatToIntBits(f11));
        }
    }

    /* compiled from: UnsafeUtil */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j) {
            return this.f10062a.getBoolean(obj, j);
        }

        public byte d(Object obj, long j) {
            return this.f10062a.getByte(obj, j);
        }

        public double e(Object obj, long j) {
            return this.f10062a.getDouble(obj, j);
        }

        public float f(Object obj, long j) {
            return this.f10062a.getFloat(obj, j);
        }

        public void k(Object obj, long j, boolean z11) {
            this.f10062a.putBoolean(obj, j, z11);
        }

        public void l(Object obj, long j, byte b11) {
            this.f10062a.putByte(obj, j, b11);
        }

        public void m(Object obj, long j, double d11) {
            this.f10062a.putDouble(obj, j, d11);
        }

        public void n(Object obj, long j, float f11) {
            this.f10062a.putFloat(obj, j, f11);
        }
    }

    /* compiled from: UnsafeUtil */
    private static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f10062a;

        e(Unsafe unsafe) {
            this.f10062a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f10062a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f10062a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j);

        public abstract byte d(Object obj, long j);

        public abstract double e(Object obj, long j);

        public abstract float f(Object obj, long j);

        public final int g(Object obj, long j) {
            return this.f10062a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.f10062a.getLong(obj, j);
        }

        public final Object i(Object obj, long j) {
            return this.f10062a.getObject(obj, j);
        }

        public final long j(Field field) {
            return this.f10062a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j, boolean z11);

        public abstract void l(Object obj, long j, byte b11);

        public abstract void m(Object obj, long j, double d11);

        public abstract void n(Object obj, long j, float f11);

        public final void o(Object obj, long j, int i11) {
            this.f10062a.putInt(obj, j, i11);
        }

        public final void p(Object obj, long j, long j11) {
            this.f10062a.putLong(obj, j, j11);
        }

        public final void q(Object obj, long j, Object obj2) {
            this.f10062a.putObject(obj, j, obj2);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        long j11 = (long) j(byte[].class);
        f10052i = j11;
        j = (long) j(cls6);
        k = (long) k(cls6);
        f10053l = (long) j(cls5);
        f10054m = (long) k(cls5);
        n = (long) j(cls4);
        f10055o = (long) k(cls4);
        f10056p = (long) j(cls3);
        q = (long) k(cls3);
        f10057r = (long) j(cls2);
        f10058s = (long) k(cls2);
        t = (long) j(cls);
        f10059u = (long) k(cls);
        f10060w = (int) (7 & j11);
    }

    private i1() {
    }

    static Object A(Object obj, long j11) {
        return f10049f.i(obj, j11);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return f10051h;
    }

    static boolean D() {
        return f10050g;
    }

    static void E(Object obj, long j11, boolean z11) {
        f10049f.k(obj, j11, z11);
    }

    /* access modifiers changed from: private */
    public static void F(Object obj, long j11, boolean z11) {
        I(obj, j11, z11 ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void G(Object obj, long j11, boolean z11) {
        J(obj, j11, z11 ? (byte) 1 : 0);
    }

    static void H(byte[] bArr, long j11, byte b11) {
        f10049f.l(bArr, f10052i + j11, b11);
    }

    /* access modifiers changed from: private */
    public static void I(Object obj, long j11, byte b11) {
        long j12 = -4 & j11;
        int x11 = x(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        M(obj, j12, ((255 & b11) << i11) | (x11 & (~(255 << i11))));
    }

    /* access modifiers changed from: private */
    public static void J(Object obj, long j11, byte b11) {
        long j12 = -4 & j11;
        int i11 = (((int) j11) & 3) << 3;
        M(obj, j12, ((255 & b11) << i11) | (x(obj, j12) & (~(255 << i11))));
    }

    static void K(Object obj, long j11, double d11) {
        f10049f.m(obj, j11, d11);
    }

    static void L(Object obj, long j11, float f11) {
        f10049f.n(obj, j11, f11);
    }

    static void M(Object obj, long j11, int i11) {
        f10049f.o(obj, j11, i11);
    }

    static void N(Object obj, long j11, long j12) {
        f10049f.p(obj, j11, j12);
    }

    static void O(Object obj, long j11, Object obj2) {
        f10049f.q(obj, j11, obj2);
    }

    private static boolean P() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f10045b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getInt", new Class[]{cls, cls3});
            cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
            cls2.getMethod("getObject", new Class[]{cls, cls3});
            cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
            if (d.c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th2) {
            Logger logger = f10044a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    private static boolean Q() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f10045b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (l() == null) {
                return false;
            }
            if (d.c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th2) {
            Logger logger = f10044a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    static <T> T i(Class<T> cls) {
        try {
            return f10045b.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static int j(Class<?> cls) {
        if (f10051h) {
            return f10049f.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f10051h) {
            return f10049f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n11;
        if (d.c() && (n11 = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n11;
        }
        Field n12 = n(Buffer.class, "address");
        if (n12 == null || n12.getType() != Long.TYPE) {
            return null;
        }
        return n12;
    }

    private static boolean m(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!d.c()) {
            return false;
        }
        try {
            Class<?> cls3 = f10046c;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f10049f) == null) {
            return -1;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j11) {
        return f10049f.c(obj, j11);
    }

    /* access modifiers changed from: private */
    public static boolean q(Object obj, long j11) {
        return t(obj, j11) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean r(Object obj, long j11) {
        return u(obj, j11) != 0;
    }

    static byte s(byte[] bArr, long j11) {
        return f10049f.d(bArr, f10052i + j11);
    }

    /* access modifiers changed from: private */
    public static byte t(Object obj, long j11) {
        return (byte) ((x(obj, -4 & j11) >>> ((int) (((~j11) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    public static byte u(Object obj, long j11) {
        return (byte) ((x(obj, -4 & j11) >>> ((int) ((j11 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j11) {
        return f10049f.e(obj, j11);
    }

    static float w(Object obj, long j11) {
        return f10049f.f(obj, j11);
    }

    static int x(Object obj, long j11) {
        return f10049f.g(obj, j11);
    }

    static long y(Object obj, long j11) {
        return f10049f.h(obj, j11);
    }

    private static e z() {
        Unsafe unsafe = f10045b;
        if (unsafe == null) {
            return null;
        }
        if (!d.c()) {
            return new d(unsafe);
        }
        if (f10047d) {
            return new c(unsafe);
        }
        if (f10048e) {
            return new b(unsafe);
        }
        return null;
    }
}
