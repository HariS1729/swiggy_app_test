package ng0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.p;

/* compiled from: DnsUtils.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f19786a = new b();

    private b() {
    }

    public final byte[] a(InputStream inputStream) throws IOException {
        p.j(inputStream, "inputStream");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
