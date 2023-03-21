package r6;

import coil.ImageLoader;
import coil.decode.DataSource;
import java.nio.ByteBuffer;
import o6.l;
import r6.h;
import x6.k;

/* compiled from: ByteBufferFetcher.kt */
public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f16486a;

    /* renamed from: b  reason: collision with root package name */
    private final k f16487b;

    /* compiled from: ByteBufferFetcher.kt */
    public static final class a implements h.a<ByteBuffer> {
        /* renamed from: b */
        public h a(ByteBuffer byteBuffer, k kVar, ImageLoader imageLoader) {
            return new c(byteBuffer, kVar);
        }
    }

    public c(ByteBuffer byteBuffer, k kVar) {
        this.f16486a = byteBuffer;
        this.f16487b = kVar;
    }

    /* JADX INFO: finally extract failed */
    public Object a(fp0.c<? super g> cVar) {
        try {
            okio.c cVar2 = new okio.c();
            cVar2.write(this.f16486a);
            this.f16486a.position(0);
            return new k(l.a(cVar2, this.f16487b.g()), (String) null, DataSource.MEMORY);
        } catch (Throwable th2) {
            this.f16486a.position(0);
            throw th2;
        }
    }
}
