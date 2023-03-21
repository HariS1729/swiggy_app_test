package o6;

import in.swiggy.android.tejas.oldapi.models.restaurant.RestaurantState;
import java.io.File;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import o6.k;
import okio.e;
import okio.u;
import okio.z;

/* compiled from: ImageSource.kt */
public final class n extends k {

    /* renamed from: a  reason: collision with root package name */
    private final File f15978a;

    /* renamed from: b  reason: collision with root package name */
    private final k.a f15979b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15980c;

    /* renamed from: d  reason: collision with root package name */
    private e f15981d;

    /* renamed from: e  reason: collision with root package name */
    private z f15982e;

    public n(e eVar, File file, k.a aVar) {
        super((i) null);
        this.f15978a = file;
        this.f15979b = aVar;
        this.f15981d = eVar;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.".toString());
        }
    }

    private final void f() {
        if (!(!this.f15980c)) {
            throw new IllegalStateException(RestaurantState.CLOSED.toString());
        }
    }

    public k.a a() {
        return this.f15979b;
    }

    public synchronized e b() {
        f();
        e eVar = this.f15981d;
        if (eVar != null) {
            return eVar;
        }
        okio.i g11 = g();
        z zVar = this.f15982e;
        p.g(zVar);
        e d11 = u.d(g11.q(zVar));
        this.f15981d = d11;
        return d11;
    }

    public synchronized void close() {
        this.f15980c = true;
        e eVar = this.f15981d;
        if (eVar != null) {
            c7.i.c(eVar);
        }
        z zVar = this.f15982e;
        if (zVar != null) {
            g().h(zVar);
        }
    }

    public okio.i g() {
        return okio.i.f27240b;
    }
}
