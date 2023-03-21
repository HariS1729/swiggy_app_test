package w;

import d2.b;
import d2.c;
import java.util.Map;
import kotlin.jvm.internal.i;
import x.e;

/* compiled from: LazyMeasuredItemProvider.kt */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final k f17416a;

    /* renamed from: b  reason: collision with root package name */
    private final e f17417b;

    /* renamed from: c  reason: collision with root package name */
    private final u f17418c;

    /* renamed from: d  reason: collision with root package name */
    private final long f17419d;

    private t(long j, boolean z11, k kVar, e eVar, u uVar) {
        this.f17416a = kVar;
        this.f17417b = eVar;
        this.f17418c = uVar;
        this.f17419d = c.b(0, z11 ? b.n(j) : Integer.MAX_VALUE, 0, !z11 ? b.m(j) : Integer.MAX_VALUE, 5, (Object) null);
    }

    public /* synthetic */ t(long j, boolean z11, k kVar, e eVar, u uVar, i iVar) {
        this(j, z11, kVar, eVar, uVar);
    }

    public final s a(int i11) {
        return this.f17418c.a(i11, this.f17416a.c(i11), this.f17417b.u(i11, this.f17419d));
    }

    public final long b() {
        return this.f17419d;
    }

    public final Map<Object, Integer> c() {
        return this.f17416a.b();
    }
}
