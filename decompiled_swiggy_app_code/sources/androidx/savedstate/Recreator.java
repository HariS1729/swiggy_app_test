package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import com.newrelic.agent.android.agentdata.HexAttribute;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import n3.b;
import n3.d;

/* compiled from: Recreator.kt */
public final class Recreator implements o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f11698b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f11699a;

    /* compiled from: Recreator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: Recreator.kt */
    public static final class b implements b.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<String> f11700a = new LinkedHashSet();

        public b(n3.b bVar) {
            p.j(bVar, "registry");
            bVar.h("androidx.savedstate.Restarter", this);
        }

        public final void a(String str) {
            p.j(str, HexAttribute.HEX_ATTR_CLASS_NAME);
            this.f11700a.add(str);
        }

        public Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f11700a));
            return bundle;
        }
    }

    public Recreator(d dVar) {
        p.j(dVar, "owner");
        this.f11699a = dVar;
    }

    private final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(b.a.class);
            p.i(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    p.i(newInstance, "{\n                constr…wInstance()\n            }");
                    ((b.a) newInstance).a(this.f11699a);
                } catch (Exception e11) {
                    throw new RuntimeException("Failed to instantiate " + str, e11);
                }
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e12);
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("Class " + str + " wasn't found", e13);
        }
    }

    public void b(r rVar, Lifecycle.Event event) {
        p.j(rVar, "source");
        p.j(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            rVar.getLifecycle().c(this);
            Bundle b11 = this.f11699a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
            if (b11 != null) {
                ArrayList<String> stringArrayList = b11.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String a11 : stringArrayList) {
                        a(a11);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
