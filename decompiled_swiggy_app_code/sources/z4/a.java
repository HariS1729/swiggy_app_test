package z4;

import bp0.g;
import bp0.k;
import co.hyperverge.crashguard.data.models.CrashEvent;
import hq0.a;
import ip.b;
import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.Result;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;

/* compiled from: CrashEventConverter.kt */
public final class a implements b.a<CrashEvent> {
    /* renamed from: c */
    public CrashEvent b(byte[] bArr) {
        p.j(bArr, "bytes");
        a.C0293a aVar = hq0.a.f23147b;
        return (CrashEvent) aVar.b(kotlinx.serialization.a.serializer(aVar.a(), s.k(CrashEvent.class)), new String(bArr, up0.a.f29102b));
    }

    /* renamed from: d */
    public void a(CrashEvent crashEvent, OutputStream outputStream) {
        p.j(crashEvent, "crashEvent");
        p.j(outputStream, "outputStream");
        try {
            Result.a aVar = Result.f25582b;
            a.C0293a aVar2 = hq0.a.f23147b;
            String c11 = aVar2.c(kotlinx.serialization.a.serializer(aVar2.a(), s.k(CrashEvent.class)), crashEvent);
            Charset charset = up0.a.f29102b;
            if (c11 != null) {
                byte[] bytes = c11.getBytes(charset);
                p.i(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                Result.b(k.f22762a);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            Result.a aVar3 = Result.f25582b;
            Result.b(g.a(th2));
        }
    }
}
