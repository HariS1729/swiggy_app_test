package d7;

import com.adobe.xmp.XMPException;
import e7.l;
import e7.p;
import java.io.InputStream;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static e f14143a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static g f14144b = null;

    public static e a() {
        return f14143a;
    }

    public static c b(InputStream inputStream) throws XMPException {
        return c(inputStream, (g7.d) null);
    }

    public static c c(InputStream inputStream, g7.d dVar) throws XMPException {
        return l.c(inputStream, dVar);
    }

    public static c d(byte[] bArr) throws XMPException {
        return e(bArr, (g7.d) null);
    }

    public static c e(byte[] bArr, g7.d dVar) throws XMPException {
        return l.c(bArr, dVar);
    }

    public static c f(String str) throws XMPException {
        return g(str, (g7.d) null);
    }

    public static c g(String str, g7.d dVar) throws XMPException {
        return l.c(str, dVar);
    }
}
