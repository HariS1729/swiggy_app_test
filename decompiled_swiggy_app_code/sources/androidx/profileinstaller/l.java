package androidx.profileinstaller;

import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ProfileTranscoder */
class l {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f11080a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f11081b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) throws IOException {
        d.h(inputStream);
        int j = d.j(inputStream);
        if (j != 6 && j != 7) {
            while (j > 0) {
                d.j(inputStream);
                for (int j11 = d.j(inputStream); j11 > 0; j11--) {
                    d.h(inputStream);
                }
                j--;
            }
        }
    }

    static boolean B(OutputStream outputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, m.f11082a)) {
            N(outputStream, cVarArr);
            return true;
        } else if (Arrays.equals(bArr, m.f11083b)) {
            M(outputStream, cVarArr);
            return true;
        } else if (Arrays.equals(bArr, m.f11085d)) {
            K(outputStream, cVarArr);
            return true;
        } else if (Arrays.equals(bArr, m.f11084c)) {
            L(outputStream, cVarArr);
            return true;
        } else if (!Arrays.equals(bArr, m.f11086e)) {
            return false;
        } else {
            J(outputStream, cVarArr);
            return true;
        }
    }

    private static void C(OutputStream outputStream, c cVar) throws IOException {
        int i11 = 0;
        for (int valueOf : cVar.f11067h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            d.p(outputStream, valueOf2.intValue() - i11);
            i11 = valueOf2.intValue();
        }
    }

    private static n D(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d.p(byteArrayOutputStream, cVarArr.length);
            int i11 = 2;
            for (c cVar : cVarArr) {
                d.q(byteArrayOutputStream, cVar.f11062c);
                d.q(byteArrayOutputStream, cVar.f11063d);
                d.q(byteArrayOutputStream, (long) cVar.f11066g);
                String j = j(cVar.f11060a, cVar.f11061b, m.f11082a);
                int k = d.k(j);
                d.p(byteArrayOutputStream, k);
                i11 = i11 + 4 + 4 + 4 + 2 + (k * 1);
                d.n(byteArrayOutputStream, j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i11 == byteArray.length) {
                n nVar = new n(FileSectionType.DEX_FILES, i11, byteArray, false);
                byteArrayOutputStream.close();
                return nVar;
            }
            throw d.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f11080a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, c cVar) throws IOException {
        I(outputStream, cVar);
        C(outputStream, cVar);
        H(outputStream, cVar);
    }

    private static void G(OutputStream outputStream, c cVar, String str) throws IOException {
        d.p(outputStream, d.k(str));
        d.p(outputStream, cVar.f11064e);
        d.q(outputStream, (long) cVar.f11065f);
        d.q(outputStream, cVar.f11062c);
        d.q(outputStream, (long) cVar.f11066g);
        d.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, c cVar) throws IOException {
        byte[] bArr = new byte[k(cVar.f11066g)];
        for (Map.Entry next : cVar.f11068i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, cVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, cVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, c cVar) throws IOException {
        int i11 = 0;
        for (Map.Entry next : cVar.f11068i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                d.p(outputStream, intValue - i11);
                d.p(outputStream, 0);
                i11 = intValue;
            }
        }
    }

    private static void J(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.p(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String j = j(cVar.f11060a, cVar.f11061b, m.f11086e);
            d.p(outputStream, d.k(j));
            d.p(outputStream, cVar.f11068i.size());
            d.p(outputStream, cVar.f11067h.length);
            d.q(outputStream, cVar.f11062c);
            d.n(outputStream, j);
            for (Integer intValue : cVar.f11068i.keySet()) {
                d.p(outputStream, intValue.intValue());
            }
            for (int p11 : cVar.f11067h) {
                d.p(outputStream, p11);
            }
        }
    }

    private static void K(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.r(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String j = j(cVar.f11060a, cVar.f11061b, m.f11085d);
            d.p(outputStream, d.k(j));
            d.p(outputStream, cVar.f11067h.length);
            d.q(outputStream, (long) (cVar.f11068i.size() * 4));
            d.q(outputStream, cVar.f11062c);
            d.n(outputStream, j);
            for (Integer intValue : cVar.f11068i.keySet()) {
                d.p(outputStream, intValue.intValue());
                d.p(outputStream, 0);
            }
            for (int p11 : cVar.f11067h) {
                d.p(outputStream, p11);
            }
        }
    }

    private static void L(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] b11 = b(cVarArr, m.f11084c);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, b11);
    }

    private static void M(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] b11 = b(cVarArr, m.f11083b);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, b11);
    }

    private static void N(OutputStream outputStream, c[] cVarArr) throws IOException {
        O(outputStream, cVarArr);
    }

    private static void O(OutputStream outputStream, c[] cVarArr) throws IOException {
        int i11;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(cVarArr));
        arrayList.add(c(cVarArr));
        arrayList.add(d(cVarArr));
        long length = ((long) m.f11082a.length) + ((long) f11080a.length) + 4 + ((long) (arrayList.size() * 16));
        d.q(outputStream, (long) arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            n nVar = (n) arrayList.get(i12);
            d.q(outputStream, nVar.f11089a.getValue());
            d.q(outputStream, length);
            if (nVar.f11092d) {
                byte[] bArr = nVar.f11091c;
                byte[] b11 = d.b(bArr);
                arrayList2.add(b11);
                d.q(outputStream, (long) b11.length);
                d.q(outputStream, (long) bArr.length);
                i11 = b11.length;
            } else {
                arrayList2.add(nVar.f11091c);
                d.q(outputStream, (long) nVar.f11091c.length);
                d.q(outputStream, 0);
                i11 = nVar.f11091c.length;
            }
            length += (long) i11;
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            outputStream.write((byte[]) arrayList2.get(i13));
        }
    }

    private static int a(c cVar) {
        int i11 = 0;
        for (Map.Entry<Integer, Integer> value : cVar.f11068i.entrySet()) {
            i11 |= ((Integer) value.getValue()).intValue();
        }
        return i11;
    }

    private static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int i11 = 0;
        int i12 = 0;
        for (c cVar : cVarArr) {
            i12 += d.k(j(cVar.f11060a, cVar.f11061b, bArr)) + 16 + (cVar.f11064e * 2) + cVar.f11065f + k(cVar.f11066g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i12);
        if (Arrays.equals(bArr, m.f11084c)) {
            int length = cVarArr.length;
            while (i11 < length) {
                c cVar2 = cVarArr[i11];
                G(byteArrayOutputStream, cVar2, j(cVar2.f11060a, cVar2.f11061b, bArr));
                F(byteArrayOutputStream, cVar2);
                i11++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                G(byteArrayOutputStream, cVar3, j(cVar3.f11060a, cVar3.f11061b, bArr));
            }
            int length2 = cVarArr.length;
            while (i11 < length2) {
                F(byteArrayOutputStream, cVarArr[i11]);
                i11++;
            }
        }
        if (byteArrayOutputStream.size() == i12) {
            return byteArrayOutputStream.toByteArray();
        }
        throw d.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i12);
    }

    private static n c(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        int i12 = 0;
        while (i11 < cVarArr.length) {
            try {
                c cVar = cVarArr[i11];
                d.p(byteArrayOutputStream, i11);
                d.p(byteArrayOutputStream, cVar.f11064e);
                i12 = i12 + 2 + 2 + (cVar.f11064e * 2);
                C(byteArrayOutputStream, cVar);
                i11++;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i12 == byteArray.length) {
            n nVar = new n(FileSectionType.CLASSES, i12, byteArray, true);
            byteArrayOutputStream.close();
            return nVar;
        }
        throw d.c("Expected size " + i12 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    private static n d(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        int i12 = 0;
        while (i11 < cVarArr.length) {
            try {
                c cVar = cVarArr[i11];
                int a11 = a(cVar);
                byte[] e11 = e(cVar);
                byte[] f11 = f(cVar);
                d.p(byteArrayOutputStream, i11);
                int length = e11.length + 2 + f11.length;
                d.q(byteArrayOutputStream, (long) length);
                d.p(byteArrayOutputStream, a11);
                byteArrayOutputStream.write(e11);
                byteArrayOutputStream.write(f11);
                i12 = i12 + 2 + 4 + length;
                i11++;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i12 == byteArray.length) {
            n nVar = new n(FileSectionType.METHODS, i12, byteArray, true);
            byteArrayOutputStream.close();
            return nVar;
        }
        throw d.c("Expected size " + i12 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    private static byte[] e(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private static byte[] f(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private static String g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(Constants.COLON_SEPARATOR, "!");
        }
        return Constants.COLON_SEPARATOR.equals(str2) ? str.replace("!", Constants.COLON_SEPARATOR) : str;
    }

    private static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(Constants.COLON_SEPARATOR);
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    private static c i(c[] cVarArr, String str) {
        if (cVarArr.length <= 0) {
            return null;
        }
        String h11 = h(str);
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            if (cVarArr[i11].f11061b.equals(h11)) {
                return cVarArr[i11];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String a11 = m.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a11);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(Constants.COLON_SEPARATOR)) {
            return g(str2, a11);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + m.a(bArr) + str2;
    }

    private static int k(int i11) {
        return y(i11 * 2) / 8;
    }

    private static int l(int i11, int i12, int i13) {
        if (i11 == 1) {
            throw d.c("HOT methods are not stored in the bitmap");
        } else if (i11 == 2) {
            return i12;
        } else {
            if (i11 == 4) {
                return i12 + i13;
            }
            throw d.c("Unexpected flag: " + i11);
        }
    }

    private static int[] m(InputStream inputStream, int i11) throws IOException {
        int[] iArr = new int[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += d.h(inputStream);
            iArr[i13] = i12;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i11, int i12) {
        int i13 = 2;
        if (!bitSet.get(l(2, i11, i12))) {
            i13 = 0;
        }
        return bitSet.get(l(4, i11, i12)) ? i13 | 4 : i13;
    }

    static byte[] o(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, d.d(inputStream, bArr.length))) {
            return d.d(inputStream, m.f11083b.length);
        }
        throw d.c("Invalid magic");
    }

    private static void p(InputStream inputStream, c cVar) throws IOException {
        int available = inputStream.available() - cVar.f11065f;
        int i11 = 0;
        while (inputStream.available() > available) {
            i11 += d.h(inputStream);
            cVar.f11068i.put(Integer.valueOf(i11), 1);
            for (int h11 = d.h(inputStream); h11 > 0; h11--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw d.c("Read too much data during profile line parse");
        }
    }

    static c[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, m.f11087f)) {
            if (!Arrays.equals(m.f11082a, bArr2)) {
                return r(inputStream, bArr, cVarArr);
            }
            throw d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, m.f11088g)) {
            return t(inputStream, bArr2, cVarArr);
        } else {
            throw d.c("Unsupported meta version");
        }
    }

    static c[] r(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, m.f11087f)) {
            int j = d.j(inputStream);
            byte[] e11 = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e11);
                try {
                    c[] s11 = s(byteArrayInputStream, j, cVarArr);
                    byteArrayInputStream.close();
                    return s11;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw d.c("Content found after the end of file");
            }
        } else {
            throw d.c("Unsupported meta version");
        }
        throw th;
    }

    private static c[] s(InputStream inputStream, int i11, c[] cVarArr) throws IOException {
        int i12 = 0;
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i11 == cVarArr.length) {
            String[] strArr = new String[i11];
            int[] iArr = new int[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                int h11 = d.h(inputStream);
                iArr[i13] = d.h(inputStream);
                strArr[i13] = d.f(inputStream, h11);
            }
            while (i12 < i11) {
                c cVar = cVarArr[i12];
                if (cVar.f11061b.equals(strArr[i12])) {
                    int i14 = iArr[i12];
                    cVar.f11064e = i14;
                    cVar.f11067h = m(inputStream, i14);
                    i12++;
                } else {
                    throw d.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw d.c("Mismatched number of dex files found in metadata");
    }

    static c[] t(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        int h11 = d.h(inputStream);
        byte[] e11 = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e11);
            try {
                c[] u11 = u(byteArrayInputStream, bArr, h11, cVarArr);
                byteArrayInputStream.close();
                return u11;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw d.c("Content found after the end of file");
        }
        throw th;
    }

    private static c[] u(InputStream inputStream, byte[] bArr, int i11, c[] cVarArr) throws IOException {
        int i12 = 0;
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i11 == cVarArr.length) {
            while (i12 < i11) {
                d.h(inputStream);
                String f11 = d.f(inputStream, d.h(inputStream));
                long i13 = d.i(inputStream);
                int h11 = d.h(inputStream);
                c i14 = i(cVarArr, f11);
                if (i14 != null) {
                    i14.f11063d = i13;
                    int[] m11 = m(inputStream, h11);
                    if (Arrays.equals(bArr, m.f11086e)) {
                        i14.f11064e = h11;
                        i14.f11067h = m11;
                    }
                    i12++;
                } else {
                    throw d.c("Missing profile key: " + f11);
                }
            }
            return cVarArr;
        }
        throw d.c("Mismatched number of dex files found in metadata");
    }

    private static void v(InputStream inputStream, c cVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(d.d(inputStream, d.a(cVar.f11066g * 2)));
        int i11 = 0;
        while (true) {
            int i12 = cVar.f11066g;
            if (i11 < i12) {
                int n = n(valueOf, i11, i12);
                if (n != 0) {
                    Integer num = cVar.f11068i.get(Integer.valueOf(i11));
                    if (num == null) {
                        num = 0;
                    }
                    cVar.f11068i.put(Integer.valueOf(i11), Integer.valueOf(n | num.intValue()));
                }
                i11++;
            } else {
                return;
            }
        }
    }

    static c[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, m.f11083b)) {
            int j = d.j(inputStream);
            byte[] e11 = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e11);
                try {
                    c[] x11 = x(byteArrayInputStream, str, j);
                    byteArrayInputStream.close();
                    return x11;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw d.c("Content found after the end of file");
            }
        } else {
            throw d.c("Unsupported version");
        }
        throw th;
    }

    private static c[] x(InputStream inputStream, String str, int i11) throws IOException {
        InputStream inputStream2 = inputStream;
        int i12 = i11;
        if (inputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int h11 = d.h(inputStream);
            int h12 = d.h(inputStream);
            long i14 = d.i(inputStream);
            long i15 = d.i(inputStream);
            long i16 = d.i(inputStream);
            String str2 = str;
            cVarArr[i13] = new c(str2, d.f(inputStream2, h11), i15, 0, h12, (int) i14, (int) i16, new int[h12], new TreeMap());
        }
        for (int i17 = 0; i17 < i12; i17++) {
            c cVar = cVarArr[i17];
            p(inputStream2, cVar);
            cVar.f11067h = m(inputStream2, cVar.f11064e);
            v(inputStream2, cVar);
        }
        return cVarArr;
    }

    private static int y(int i11) {
        return ((i11 + 8) - 1) & -8;
    }

    private static void z(byte[] bArr, int i11, int i12, c cVar) {
        int l11 = l(i11, i12, cVar.f11066g);
        int i13 = l11 / 8;
        bArr[i13] = (byte) ((1 << (l11 % 8)) | bArr[i13]);
    }
}
