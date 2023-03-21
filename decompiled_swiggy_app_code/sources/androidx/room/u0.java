package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import t3.i;
import t3.j;

/* compiled from: RoomSQLiteQuery */
public class u0 implements j, i {

    /* renamed from: i  reason: collision with root package name */
    static final TreeMap<Integer, u0> f11624i = new TreeMap<>();

    /* renamed from: a  reason: collision with root package name */
    private volatile String f11625a;

    /* renamed from: b  reason: collision with root package name */
    final long[] f11626b;

    /* renamed from: c  reason: collision with root package name */
    final double[] f11627c;

    /* renamed from: d  reason: collision with root package name */
    final String[] f11628d;

    /* renamed from: e  reason: collision with root package name */
    final byte[][] f11629e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f11630f;

    /* renamed from: g  reason: collision with root package name */
    final int f11631g;

    /* renamed from: h  reason: collision with root package name */
    int f11632h;

    private u0(int i11) {
        this.f11631g = i11;
        int i12 = i11 + 1;
        this.f11630f = new int[i12];
        this.f11626b = new long[i12];
        this.f11627c = new double[i12];
        this.f11628d = new String[i12];
        this.f11629e = new byte[i12][];
    }

    public static u0 f(String str, int i11) {
        TreeMap<Integer, u0> treeMap = f11624i;
        synchronized (treeMap) {
            Map.Entry<Integer, u0> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i11));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                u0 value = ceilingEntry.getValue();
                value.g(str, i11);
                return value;
            }
            u0 u0Var = new u0(i11);
            u0Var.g(str, i11);
            return u0Var;
        }
    }

    private static void j() {
        TreeMap<Integer, u0> treeMap = f11624i;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it2 = treeMap.descendingKeySet().iterator();
            while (true) {
                int i11 = size - 1;
                if (size > 0) {
                    it2.next();
                    it2.remove();
                    size = i11;
                } else {
                    return;
                }
            }
        }
    }

    public void K(int i11, String str) {
        this.f11630f[i11] = 4;
        this.f11628d[i11] = str;
    }

    public void R(int i11, long j) {
        this.f11630f[i11] = 2;
        this.f11626b[i11] = j;
    }

    public void S(int i11, byte[] bArr) {
        this.f11630f[i11] = 5;
        this.f11629e[i11] = bArr;
    }

    public String a() {
        return this.f11625a;
    }

    public void b(i iVar) {
        for (int i11 = 1; i11 <= this.f11632h; i11++) {
            int i12 = this.f11630f[i11];
            if (i12 == 1) {
                iVar.b0(i11);
            } else if (i12 == 2) {
                iVar.R(i11, this.f11626b[i11]);
            } else if (i12 == 3) {
                iVar.o0(i11, this.f11627c[i11]);
            } else if (i12 == 4) {
                iVar.K(i11, this.f11628d[i11]);
            } else if (i12 == 5) {
                iVar.S(i11, this.f11629e[i11]);
            }
        }
    }

    public void b0(int i11) {
        this.f11630f[i11] = 1;
    }

    public void close() {
    }

    /* access modifiers changed from: package-private */
    public void g(String str, int i11) {
        this.f11625a = str;
        this.f11632h = i11;
    }

    public void o0(int i11, double d11) {
        this.f11630f[i11] = 3;
        this.f11627c[i11] = d11;
    }

    public void release() {
        TreeMap<Integer, u0> treeMap = f11624i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f11631g), this);
            j();
        }
    }
}
