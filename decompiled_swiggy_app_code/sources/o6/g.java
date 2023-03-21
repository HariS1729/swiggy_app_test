package o6;

import java.io.InputStream;

/* compiled from: ExifUtils.kt */
final class g extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f15963a;

    /* renamed from: b  reason: collision with root package name */
    private int f15964b = 1073741824;

    public g(InputStream inputStream) {
        this.f15963a = inputStream;
    }

    private final int a(int i11) {
        if (i11 == -1) {
            this.f15964b = 0;
        }
        return i11;
    }

    public int available() {
        return this.f15964b;
    }

    public void close() {
        this.f15963a.close();
    }

    public int read() {
        return a(this.f15963a.read());
    }

    public long skip(long j) {
        return this.f15963a.skip(j);
    }

    public int read(byte[] bArr) {
        return a(this.f15963a.read(bArr));
    }

    public int read(byte[] bArr, int i11, int i12) {
        return a(this.f15963a.read(bArr, i11, i12));
    }
}
