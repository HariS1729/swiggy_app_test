package o6;

import in.swiggy.android.tejas.oldapi.models.restaurant.RestaurantState;
import java.io.Closeable;
import o6.k;
import okio.e;
import okio.i;
import okio.u;
import okio.z;

/* compiled from: ImageSource.kt */
public final class j extends k {

    /* renamed from: a  reason: collision with root package name */
    private final z f15968a;

    /* renamed from: b  reason: collision with root package name */
    private final i f15969b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15970c;

    /* renamed from: d  reason: collision with root package name */
    private final Closeable f15971d;

    /* renamed from: e  reason: collision with root package name */
    private final k.a f15972e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15973f;

    /* renamed from: g  reason: collision with root package name */
    private e f15974g;

    public j(z zVar, i iVar, String str, Closeable closeable, k.a aVar) {
        super((kotlin.jvm.internal.i) null);
        this.f15968a = zVar;
        this.f15969b = iVar;
        this.f15970c = str;
        this.f15971d = closeable;
        this.f15972e = aVar;
    }

    private final void f() {
        if (!(!this.f15973f)) {
            throw new IllegalStateException(RestaurantState.CLOSED.toString());
        }
    }

    public k.a a() {
        return this.f15972e;
    }

    public synchronized e b() {
        f();
        e eVar = this.f15974g;
        if (eVar != null) {
            return eVar;
        }
        e d11 = u.d(j().q(this.f15968a));
        this.f15974g = d11;
        return d11;
    }

    public synchronized void close() {
        this.f15973f = true;
        e eVar = this.f15974g;
        if (eVar != null) {
            c7.i.c(eVar);
        }
        Closeable closeable = this.f15971d;
        if (closeable != null) {
            c7.i.c(closeable);
        }
    }

    public final String g() {
        return this.f15970c;
    }

    public i j() {
        return this.f15969b;
    }
}
