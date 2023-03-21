package t3;

/* compiled from: SimpleSQLiteQuery */
public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    private final String f16712a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f16713b;

    public a(String str, Object[] objArr) {
        this.f16712a = str;
        this.f16713b = objArr;
    }

    private static void c(i iVar, int i11, Object obj) {
        if (obj == null) {
            iVar.b0(i11);
        } else if (obj instanceof byte[]) {
            iVar.S(i11, (byte[]) obj);
        } else if (obj instanceof Float) {
            iVar.o0(i11, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            iVar.o0(i11, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            iVar.R(i11, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            iVar.R(i11, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            iVar.R(i11, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            iVar.R(i11, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            iVar.K(i11, (String) obj);
        } else if (obj instanceof Boolean) {
            iVar.R(i11, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i11 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    public static void d(i iVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i11 = 0;
            while (i11 < length) {
                Object obj = objArr[i11];
                i11++;
                c(iVar, i11, obj);
            }
        }
    }

    public String a() {
        return this.f16712a;
    }

    public void b(i iVar) {
        d(iVar, this.f16713b);
    }

    public a(String str) {
        this(str, (Object[]) null);
    }
}
