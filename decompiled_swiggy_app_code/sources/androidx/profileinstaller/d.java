package androidx.profileinstaller;

import com.truecaller.android.sdk.TruecallerSdkScope;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: Encoding */
class d {
    static int a(int i11) {
        return (((i11 + 8) - 1) & -8) / 8;
    }

    static byte[] b(byte[] bArr) throws IOException {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
        throw th;
    }

    static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    static byte[] d(InputStream inputStream, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int read = inputStream.read(bArr, i12, i11 - i12);
            if (read >= 0) {
                i12 += read;
            } else {
                throw c("Not enough bytes to read: " + i11);
            }
        }
        return bArr;
    }

    static byte[] e(InputStream inputStream, int i11, int i12) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i12];
            byte[] bArr2 = new byte[2048];
            int i13 = 0;
            int i14 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i13 < i11) {
                int read = inputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i14 += inflater.inflate(bArr, i14, i12 - i14);
                    i13 += read;
                } else {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i11 + " bytes");
                }
            }
            if (i13 != i11) {
                throw c("Didn't read enough bytes during decompression. expected=" + i11 + " actual=" + i13);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw c("Inflater did not finish");
            }
        } catch (DataFormatException e11) {
            throw c(e11.getMessage());
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    static String f(InputStream inputStream, int i11) throws IOException {
        return new String(d(inputStream, i11), StandardCharsets.UTF_8);
    }

    static long g(InputStream inputStream, int i11) throws IOException {
        byte[] d11 = d(inputStream, i11);
        long j = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j += ((long) (d11[i12] & 255)) << (i12 * 8);
        }
        return j;
    }

    static int h(InputStream inputStream) throws IOException {
        return (int) g(inputStream, 2);
    }

    static long i(InputStream inputStream) throws IOException {
        return g(inputStream, 4);
    }

    static int j(InputStream inputStream) throws IOException {
        return (int) g(inputStream, 1);
    }

    static int k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static void l(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[TruecallerSdkScope.FOOTER_TYPE_MANUALLY];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    static void m(OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, (long) bArr.length);
        byte[] b11 = b(bArr);
        q(outputStream, (long) b11.length);
        outputStream.write(b11);
    }

    static void n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void o(OutputStream outputStream, long j, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) ((int) ((j >> (i12 * 8)) & 255));
        }
        outputStream.write(bArr);
    }

    static void p(OutputStream outputStream, int i11) throws IOException {
        o(outputStream, (long) i11, 2);
    }

    static void q(OutputStream outputStream, long j) throws IOException {
        o(outputStream, j, 4);
    }

    static void r(OutputStream outputStream, int i11) throws IOException {
        o(outputStream, (long) i11, 1);
    }
}
