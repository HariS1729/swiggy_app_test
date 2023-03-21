package jg0;

import in.swiggy.android.swiggylocation.utils.eventmanager.interfaces.ILocationEventManager;
import qq.e;
import qq.i;

/* compiled from: LocationEventManagerModule_ProvidesLocationEventManagerFactory */
public final class b implements e<ILocationEventManager> {

    /* compiled from: LocationEventManagerModule_ProvidesLocationEventManagerFactory */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final b f19628a = new b();
    }

    public static b a() {
        return a.f19628a;
    }

    public static ILocationEventManager c() {
        return (ILocationEventManager) i.e(a.a());
    }

    /* renamed from: b */
    public ILocationEventManager get() {
        return c();
    }
}
