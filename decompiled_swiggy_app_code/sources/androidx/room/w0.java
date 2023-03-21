package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import t3.h;

/* compiled from: SQLiteCopyOpenHelperFactory */
class w0 implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f11644a;

    /* renamed from: b  reason: collision with root package name */
    private final File f11645b;

    /* renamed from: c  reason: collision with root package name */
    private final Callable<InputStream> f11646c;

    /* renamed from: d  reason: collision with root package name */
    private final h.c f11647d;

    w0(String str, File file, Callable<InputStream> callable, h.c cVar) {
        this.f11644a = str;
        this.f11645b = file;
        this.f11646c = callable;
        this.f11647d = cVar;
    }

    public h a(h.b bVar) {
        return new v0(bVar.f16715a, this.f11644a, this.f11645b, this.f11646c, bVar.f16717c.f16714a, this.f11647d.a(bVar));
    }
}
