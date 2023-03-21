package androidx.compose.ui.platform;

import bp0.k;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.a;
import m0.b;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
public final class i0 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a<k> f7309a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b f7310b;

    public i0(b bVar, a<k> aVar) {
        p.j(bVar, "saveableStateRegistry");
        p.j(aVar, "onDispose");
        this.f7309a = aVar;
        this.f7310b = bVar;
    }

    public boolean a(Object obj) {
        p.j(obj, "value");
        return this.f7310b.a(obj);
    }

    public Map<String, List<Object>> b() {
        return this.f7310b.b();
    }

    public Object c(String str) {
        p.j(str, HttpRequest.HEADER_KEY);
        return this.f7310b.c(str);
    }

    public b.a d(String str, a<? extends Object> aVar) {
        p.j(str, HttpRequest.HEADER_KEY);
        p.j(aVar, "valueProvider");
        return this.f7310b.d(str, aVar);
    }

    public final void e() {
        this.f7309a.invoke();
    }
}
