package n3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import androidx.savedstate.Recreator;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@SuppressLint({"RestrictedApi"})
/* compiled from: SavedStateRegistry.kt */
public final class b {

    /* renamed from: g  reason: collision with root package name */
    private static final C0150b f15826g = new C0150b((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final m.b<String, c> f15827a = new m.b<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f15828b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f15829c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15830d;

    /* renamed from: e  reason: collision with root package name */
    private Recreator.b f15831e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15832f = true;

    /* compiled from: SavedStateRegistry.kt */
    public interface a {
        void a(d dVar);
    }

    /* renamed from: n3.b$b  reason: collision with other inner class name */
    /* compiled from: SavedStateRegistry.kt */
    private static final class C0150b {
        private C0150b() {
        }

        public /* synthetic */ C0150b(i iVar) {
            this();
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    public interface c {
        Bundle c();
    }

    /* access modifiers changed from: private */
    public static final void d(b bVar, r rVar, Lifecycle.Event event) {
        p.j(bVar, "this$0");
        p.j(rVar, "<anonymous parameter 0>");
        p.j(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            bVar.f15832f = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            bVar.f15832f = false;
        }
    }

    public final Bundle b(String str) {
        p.j(str, HttpRequest.HEADER_KEY);
        if (this.f15830d) {
            Bundle bundle = this.f15829c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f15829c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f15829c;
            boolean z11 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z11 = true;
            }
            if (!z11) {
                this.f15829c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c c(String str) {
        p.j(str, HttpRequest.HEADER_KEY);
        Iterator<Map.Entry<String, c>> it2 = this.f15827a.iterator();
        while (it2.hasNext()) {
            Map.Entry next = it2.next();
            p.i(next, "components");
            c cVar = (c) next.getValue();
            if (p.e((String) next.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(Lifecycle lifecycle) {
        p.j(lifecycle, LogCategory.LIFECYCLE);
        if (!this.f15828b) {
            lifecycle.a(new a(this));
            this.f15828b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void f(Bundle bundle) {
        if (!this.f15828b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f15830d) {
            this.f15829c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            this.f15830d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    public final void g(Bundle bundle) {
        p.j(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f15829c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.b<K, V>.d f11 = this.f15827a.f();
        p.i(f11, "this.components.iteratorWithAdditions()");
        while (f11.hasNext()) {
            Map.Entry entry = (Map.Entry) f11.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).c());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, c cVar) {
        p.j(str, HttpRequest.HEADER_KEY);
        p.j(cVar, "provider");
        if (!(this.f15827a.i(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class<? extends a> cls) {
        p.j(cls, "clazz");
        if (this.f15832f) {
            Recreator.b bVar = this.f15831e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.f15831e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.f15831e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    p.i(name, "clazz.name");
                    bVar2.a(name);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }

    public final void j(String str) {
        p.j(str, HttpRequest.HEADER_KEY);
        this.f15827a.k(str);
    }
}
