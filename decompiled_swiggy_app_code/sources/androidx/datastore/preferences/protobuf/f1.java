package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite */
public final class f1 {

    /* renamed from: f  reason: collision with root package name */
    private static final f1 f10008f = new f1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f10009a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f10010b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f10011c;

    /* renamed from: d  reason: collision with root package name */
    private int f10012d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10013e;

    private f1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i11 = this.f10009a;
        int[] iArr = this.f10010b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f10010b = Arrays.copyOf(iArr, i12);
            this.f10011c = Arrays.copyOf(this.f10011c, i12);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] != iArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (!objArr[i12].equals(objArr2[i12])) {
                return false;
            }
        }
        return true;
    }

    public static f1 e() {
        return f10008f;
    }

    private static int h(int[] iArr, int i11) {
        int i12 = 17;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        return i12;
    }

    private static int i(Object[] objArr, int i11) {
        int i12 = 17;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + objArr[i13].hashCode();
        }
        return i12;
    }

    static f1 k(f1 f1Var, f1 f1Var2) {
        int i11 = f1Var.f10009a + f1Var2.f10009a;
        int[] copyOf = Arrays.copyOf(f1Var.f10010b, i11);
        System.arraycopy(f1Var2.f10010b, 0, copyOf, f1Var.f10009a, f1Var2.f10009a);
        Object[] copyOf2 = Arrays.copyOf(f1Var.f10011c, i11);
        System.arraycopy(f1Var2.f10011c, 0, copyOf2, f1Var.f10009a, f1Var2.f10009a);
        return new f1(i11, copyOf, copyOf2, true);
    }

    static f1 l() {
        return new f1();
    }

    private static void p(int i11, Object obj, Writer writer) throws IOException {
        int a11 = WireFormat.a(i11);
        int b11 = WireFormat.b(i11);
        if (b11 == 0) {
            writer.writeInt64(a11, ((Long) obj).longValue());
        } else if (b11 == 1) {
            writer.writeFixed64(a11, ((Long) obj).longValue());
        } else if (b11 == 2) {
            writer.a(a11, (ByteString) obj);
        } else if (b11 != 3) {
            if (b11 == 5) {
                writer.writeFixed32(a11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.d());
        } else if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            writer.writeStartGroup(a11);
            ((f1) obj).q(writer);
            writer.writeEndGroup(a11);
        } else {
            writer.writeEndGroup(a11);
            ((f1) obj).q(writer);
            writer.writeStartGroup(a11);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f10013e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        int i11 = this.f10009a;
        return i11 == f1Var.f10009a && c(this.f10010b, f1Var.f10010b, i11) && d(this.f10011c, f1Var.f10011c, this.f10009a);
    }

    public int f() {
        int i11;
        int i12 = this.f10012d;
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f10009a; i14++) {
            int i15 = this.f10010b[i14];
            int a11 = WireFormat.a(i15);
            int b11 = WireFormat.b(i15);
            if (b11 == 0) {
                i11 = CodedOutputStream.Y(a11, ((Long) this.f10011c[i14]).longValue());
            } else if (b11 == 1) {
                i11 = CodedOutputStream.o(a11, ((Long) this.f10011c[i14]).longValue());
            } else if (b11 == 2) {
                i11 = CodedOutputStream.g(a11, (ByteString) this.f10011c[i14]);
            } else if (b11 == 3) {
                i11 = (CodedOutputStream.V(a11) * 2) + ((f1) this.f10011c[i14]).f();
            } else if (b11 == 5) {
                i11 = CodedOutputStream.m(a11, ((Integer) this.f10011c[i14]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.d());
            }
            i13 += i11;
        }
        this.f10012d = i13;
        return i13;
    }

    public int g() {
        int i11 = this.f10012d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f10009a; i13++) {
            i12 += CodedOutputStream.J(WireFormat.a(this.f10010b[i13]), (ByteString) this.f10011c[i13]);
        }
        this.f10012d = i12;
        return i12;
    }

    public int hashCode() {
        int i11 = this.f10009a;
        return ((((527 + i11) * 31) + h(this.f10010b, i11)) * 31) + i(this.f10011c, this.f10009a);
    }

    public void j() {
        this.f10013e = false;
    }

    /* access modifiers changed from: package-private */
    public final void m(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.f10009a; i12++) {
            m0.c(sb2, i11, String.valueOf(WireFormat.a(this.f10010b[i12])), this.f10011c[i12]);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i11, Object obj) {
        a();
        b();
        int[] iArr = this.f10010b;
        int i12 = this.f10009a;
        iArr[i12] = i11;
        this.f10011c[i12] = obj;
        this.f10009a = i12 + 1;
    }

    /* access modifiers changed from: package-private */
    public void o(Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (int i11 = this.f10009a - 1; i11 >= 0; i11--) {
                writer.writeMessageSetItem(WireFormat.a(this.f10010b[i11]), this.f10011c[i11]);
            }
            return;
        }
        for (int i12 = 0; i12 < this.f10009a; i12++) {
            writer.writeMessageSetItem(WireFormat.a(this.f10010b[i12]), this.f10011c[i12]);
        }
    }

    public void q(Writer writer) throws IOException {
        if (this.f10009a != 0) {
            if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
                for (int i11 = 0; i11 < this.f10009a; i11++) {
                    p(this.f10010b[i11], this.f10011c[i11], writer);
                }
                return;
            }
            for (int i12 = this.f10009a - 1; i12 >= 0; i12--) {
                p(this.f10010b[i12], this.f10011c[i12], writer);
            }
        }
    }

    private f1(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f10012d = -1;
        this.f10009a = i11;
        this.f10010b = iArr;
        this.f10011c = objArr;
        this.f10013e = z11;
    }
}
