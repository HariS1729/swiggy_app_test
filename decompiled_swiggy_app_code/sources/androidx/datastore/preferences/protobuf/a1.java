package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.w;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil */
final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f9946a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final e1<?, ?> f9947b = C(false);

    /* renamed from: c  reason: collision with root package name */
    private static final e1<?, ?> f9948c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final e1<?, ?> f9949d = new g1();

    static <UT, UB> UB A(int i11, List<Integer> list, w.e eVar, UB ub2, e1<UT, UB> e1Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                int intValue = list.get(i13).intValue();
                if (eVar.isInRange(intValue)) {
                    if (i13 != i12) {
                        list.set(i12, Integer.valueOf(intValue));
                    }
                    i12++;
                } else {
                    ub2 = L(i11, intValue, ub2, e1Var);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (!eVar.isInRange(intValue2)) {
                    ub2 = L(i11, intValue2, ub2, e1Var);
                    it2.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static e1<?, ?> C(boolean z11) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (e1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z11)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends s.b<FT>> void E(o<FT> oVar, T t, T t11) {
        s<FT> c11 = oVar.c(t11);
        if (!c11.n()) {
            oVar.d(t).u(c11);
        }
    }

    static <T> void F(f0 f0Var, T t, T t11, long j) {
        i1.O(t, j, f0Var.mergeFrom(i1.A(t, j), i1.A(t11, j)));
    }

    static <T, UT, UB> void G(e1<UT, UB> e1Var, T t, T t11) {
        e1Var.p(t, e1Var.k(e1Var.g(t), e1Var.g(t11)));
    }

    public static e1<?, ?> H() {
        return f9947b;
    }

    public static e1<?, ?> I() {
        return f9948c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f9946a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB L(int i11, int i12, UB ub2, e1<UT, UB> e1Var) {
        if (ub2 == null) {
            ub2 = e1Var.n();
        }
        e1Var.e(ub2, i11, (long) i12);
        return ub2;
    }

    public static e1<?, ?> M() {
        return f9949d;
    }

    public static void N(int i11, List<Boolean> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeBoolList(i11, list, z11);
        }
    }

    public static void O(int i11, List<ByteString> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeBytesList(i11, list);
        }
    }

    public static void P(int i11, List<Double> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeDoubleList(i11, list, z11);
        }
    }

    public static void Q(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeEnumList(i11, list, z11);
        }
    }

    public static void R(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeFixed32List(i11, list, z11);
        }
    }

    public static void S(int i11, List<Long> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeFixed64List(i11, list, z11);
        }
    }

    public static void T(int i11, List<Float> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeFloatList(i11, list, z11);
        }
    }

    public static void U(int i11, List<?> list, Writer writer, y0 y0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.d(i11, list, y0Var);
        }
    }

    public static void V(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeInt32List(i11, list, z11);
        }
    }

    public static void W(int i11, List<Long> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeInt64List(i11, list, z11);
        }
    }

    public static void X(int i11, List<?> list, Writer writer, y0 y0Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.f(i11, list, y0Var);
        }
    }

    public static void Y(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeSFixed32List(i11, list, z11);
        }
    }

    public static void Z(int i11, List<Long> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeSFixed64List(i11, list, z11);
        }
    }

    static int a(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.V(i11) + CodedOutputStream.C(size);
        }
        return size * CodedOutputStream.d(i11, true);
    }

    public static void a0(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeSInt32List(i11, list, z11);
        }
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i11, List<Long> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeSInt64List(i11, list, z11);
        }
    }

    static int c(int i11, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * CodedOutputStream.V(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            V += CodedOutputStream.h(list.get(i12));
        }
        return V;
    }

    public static void c0(int i11, List<String> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeStringList(i11, list);
        }
    }

    static int d(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e11 = e(list);
        if (z11) {
            return CodedOutputStream.V(i11) + CodedOutputStream.C(e11);
        }
        return e11 + (size * CodedOutputStream.V(i11));
    }

    public static void d0(int i11, List<Integer> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeUInt32List(i11, list, z11);
        }
    }

    static int e(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v) {
            v vVar = (v) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.l(vVar.getInt(i12));
                i12++;
            }
        } else {
            int i13 = 0;
            while (i12 < size) {
                i13 = i11 + CodedOutputStream.l(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    public static void e0(int i11, List<Long> list, Writer writer, boolean z11) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeUInt64List(i11, list, z11);
        }
    }

    static int f(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.V(i11) + CodedOutputStream.C(size * 4);
        }
        return size * CodedOutputStream.m(i11, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.V(i11) + CodedOutputStream.C(size * 8);
        }
        return size * CodedOutputStream.o(i11, 0);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i11, List<k0> list, y0 y0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += CodedOutputStream.s(i11, list.get(i13), y0Var);
        }
        return i12;
    }

    static int k(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l11 = l(list);
        if (z11) {
            return CodedOutputStream.V(i11) + CodedOutputStream.C(l11);
        }
        return l11 + (size * CodedOutputStream.V(i11));
    }

    static int l(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v) {
            v vVar = (v) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.w(vVar.getInt(i12));
                i12++;
            }
        } else {
            int i13 = 0;
            while (i12 < size) {
                i13 = i11 + CodedOutputStream.w(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    static int m(int i11, List<Long> list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        int n = n(list);
        if (z11) {
            return CodedOutputStream.V(i11) + CodedOutputStream.C(n);
        }
        return n + (list.size() * CodedOutputStream.V(i11));
    }

    static int n(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.y(c0Var.getLong(i12));
                i12++;
            }
        } else {
            int i13 = 0;
            while (i12 < size) {
                i13 = i11 + CodedOutputStream.y(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    static int o(int i11, Object obj, y0 y0Var) {
        if (obj instanceof y) {
            return CodedOutputStream.A(i11, (y) obj);
        }
        return CodedOutputStream.F(i11, (k0) obj, y0Var);
    }

    static int p(int i11, List<?> list, y0 y0Var) {
        int i12;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.V(i11) * size;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            if (obj instanceof y) {
                i12 = CodedOutputStream.B((y) obj);
            } else {
                i12 = CodedOutputStream.H((k0) obj, y0Var);
            }
            V += i12;
        }
        return V;
    }

    static int q(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r11 = r(list);
        if (z11) {
            return CodedOutputStream.V(i11) + CodedOutputStream.C(r11);
        }
        return r11 + (size * CodedOutputStream.V(i11));
    }

    static int r(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v) {
            v vVar = (v) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.Q(vVar.getInt(i12));
                i12++;
            }
        } else {
            int i13 = 0;
            while (i12 < size) {
                i13 = i11 + CodedOutputStream.Q(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    static int s(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = t(list);
        if (z11) {
            return CodedOutputStream.V(i11) + CodedOutputStream.C(t);
        }
        return t + (size * CodedOutputStream.V(i11));
    }

    static int t(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.S(c0Var.getLong(i12));
                i12++;
            }
        } else {
            int i13 = 0;
            while (i12 < size) {
                i13 = i11 + CodedOutputStream.S(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    static int u(int i11, List<?> list) {
        int i12;
        int i13;
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.V(i11) * size;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            while (i14 < size) {
                Object raw = a0Var.getRaw(i14);
                if (raw instanceof ByteString) {
                    i13 = CodedOutputStream.h((ByteString) raw);
                } else {
                    i13 = CodedOutputStream.U((String) raw);
                }
                V += i13;
                i14++;
            }
        } else {
            while (i14 < size) {
                Object obj = list.get(i14);
                if (obj instanceof ByteString) {
                    i12 = CodedOutputStream.h((ByteString) obj);
                } else {
                    i12 = CodedOutputStream.U((String) obj);
                }
                V += i12;
                i14++;
            }
        }
        return V;
    }

    static int v(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w11 = w(list);
        if (z11) {
            return CodedOutputStream.V(i11) + CodedOutputStream.C(w11);
        }
        return w11 + (size * CodedOutputStream.V(i11));
    }

    static int w(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v) {
            v vVar = (v) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.X(vVar.getInt(i12));
                i12++;
            }
        } else {
            int i13 = 0;
            while (i12 < size) {
                i13 = i11 + CodedOutputStream.X(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    static int x(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y11 = y(list);
        if (z11) {
            return CodedOutputStream.V(i11) + CodedOutputStream.C(y11);
        }
        return y11 + (size * CodedOutputStream.V(i11));
    }

    static int y(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.Z(c0Var.getLong(i12));
                i12++;
            }
        } else {
            int i13 = 0;
            while (i12 < size) {
                i13 = i11 + CodedOutputStream.Z(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    static <UT, UB> UB z(int i11, List<Integer> list, w.d<?> dVar, UB ub2, e1<UT, UB> e1Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                int intValue = list.get(i13).intValue();
                if (dVar.findValueByNumber(intValue) != null) {
                    if (i13 != i12) {
                        list.set(i12, Integer.valueOf(intValue));
                    }
                    i12++;
                } else {
                    ub2 = L(i11, intValue, ub2, e1Var);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (dVar.findValueByNumber(intValue2) == null) {
                    ub2 = L(i11, intValue2, ub2, e1Var);
                    it2.remove();
                }
            }
        }
        return ub2;
    }
}
