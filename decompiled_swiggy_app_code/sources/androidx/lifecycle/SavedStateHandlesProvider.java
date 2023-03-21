package androidx.lifecycle;

import android.os.Bundle;
import bp0.f;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.Map;
import kotlin.jvm.internal.p;
import n3.b;

/* compiled from: SavedStateHandleSupport.kt */
public final class SavedStateHandlesProvider implements b.c {

    /* renamed from: a  reason: collision with root package name */
    private final b f10693a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10694b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f10695c;

    /* renamed from: d  reason: collision with root package name */
    private final f f10696d;

    public SavedStateHandlesProvider(b bVar, p0 p0Var) {
        p.j(bVar, "savedStateRegistry");
        p.j(p0Var, "viewModelStoreOwner");
        this.f10693a = bVar;
        this.f10696d = b.b(new SavedStateHandlesProvider$viewModel$2(p0Var));
    }

    private final e0 b() {
        return (e0) this.f10696d.getValue();
    }

    public final Bundle a(String str) {
        p.j(str, HttpRequest.HEADER_KEY);
        d();
        Bundle bundle = this.f10695c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f10695c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f10695c;
        boolean z11 = true;
        if (bundle4 == null || !bundle4.isEmpty()) {
            z11 = false;
        }
        if (z11) {
            this.f10695c = null;
        }
        return bundle2;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f10695c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : b().k1().entrySet()) {
            String str = (String) next.getKey();
            Bundle c11 = ((d0) next.getValue()).d().c();
            if (!p.e(c11, Bundle.EMPTY)) {
                bundle.putBundle(str, c11);
            }
        }
        this.f10694b = false;
        return bundle;
    }

    public final void d() {
        if (!this.f10694b) {
            this.f10695c = this.f10693a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f10694b = true;
            b();
        }
    }
}
