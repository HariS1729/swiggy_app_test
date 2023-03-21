package e7;

import in.swiggy.android.tejas.network.HttpRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f14390a;

    /* renamed from: b  reason: collision with root package name */
    private int f14391b;

    /* renamed from: c  reason: collision with root package name */
    private String f14392c;

    public a(int i11) {
        this.f14392c = null;
        this.f14390a = new byte[i11];
        this.f14391b = 0;
    }

    public a(InputStream inputStream) throws IOException {
        this.f14392c = null;
        this.f14391b = 0;
        this.f14390a = new byte[16384];
        while (true) {
            int read = inputStream.read(this.f14390a, this.f14391b, 16384);
            if (read > 0) {
                int i11 = this.f14391b + read;
                this.f14391b = i11;
                if (read == 16384) {
                    e(i11 + 16384);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public a(byte[] bArr) {
        this.f14392c = null;
        this.f14390a = bArr;
        this.f14391b = bArr.length;
    }

    public a(byte[] bArr, int i11, int i12) {
        this.f14392c = null;
        if (i12 <= bArr.length - i11) {
            byte[] bArr2 = new byte[i12];
            this.f14390a = bArr2;
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            this.f14391b = i12;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Valid length exceeds the buffer length.");
    }

    private void e(int i11) {
        byte[] bArr = this.f14390a;
        if (i11 > bArr.length) {
            byte[] bArr2 = new byte[(bArr.length * 2)];
            this.f14390a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    public void a(byte b11) {
        e(this.f14391b + 1);
        byte[] bArr = this.f14390a;
        int i11 = this.f14391b;
        this.f14391b = i11 + 1;
        bArr[i11] = b11;
    }

    public void b(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public void c(byte[] bArr, int i11, int i12) {
        e(this.f14391b + i12);
        System.arraycopy(bArr, i11, this.f14390a, this.f14391b, i12);
        this.f14391b += i12;
    }

    public int d(int i11) {
        if (i11 < this.f14391b) {
            return this.f14390a[i11] & 255;
        }
        throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
    }

    public InputStream f() {
        return new ByteArrayInputStream(this.f14390a, 0, this.f14391b);
    }

    public String g() {
        String str;
        if (this.f14392c == null) {
            int i11 = this.f14391b;
            if (i11 >= 2) {
                byte[] bArr = this.f14390a;
                if (bArr[0] == 0) {
                    if (i11 < 4 || bArr[1] != 0) {
                        str = "UTF-16BE";
                        this.f14392c = str;
                    } else if ((bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) {
                        str = "UTF-32BE";
                        this.f14392c = str;
                    }
                } else if ((bArr[0] & 255) < 128) {
                    if (bArr[1] == 0) {
                        str = (i11 < 4 || bArr[2] != 0) ? "UTF-16LE" : "UTF-32LE";
                        this.f14392c = str;
                    }
                } else if ((bArr[0] & 255) != 239) {
                    if ((bArr[0] & 255) == 254 || i11 < 4 || bArr[2] != 0) {
                        this.f14392c = "UTF-16";
                    }
                }
                this.f14392c = "UTF-32";
            }
            this.f14392c = HttpRequest.CHARSET_UTF8;
        }
        return this.f14392c;
    }

    public int h() {
        return this.f14391b;
    }
}
