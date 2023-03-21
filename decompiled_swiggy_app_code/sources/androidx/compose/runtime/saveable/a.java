package androidx.compose.runtime.saveable;

import in.swiggy.android.tejas.network.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.b;

/* compiled from: SaveableStateRegistry.kt */
final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final l<Object, Boolean> f6220a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<Object>> f6221b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<lp0.a<Object>>> f6222c;

    /* renamed from: androidx.compose.runtime.saveable.a$a  reason: collision with other inner class name */
    /* compiled from: SaveableStateRegistry.kt */
    public static final class C0019a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f6223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6224b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ lp0.a<Object> f6225c;

        C0019a(a aVar, String str, lp0.a<? extends Object> aVar2) {
            this.f6223a = aVar;
            this.f6224b = str;
            this.f6225c = aVar2;
        }

        public void unregister() {
            List list = (List) this.f6223a.f6222c.remove(this.f6224b);
            if (list != null) {
                list.remove(this.f6225c);
            }
            if (list != null && (!list.isEmpty())) {
                this.f6223a.f6222c.put(this.f6224b, list);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = kotlin.collections.x.t(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> r2, lp0.l<java.lang.Object, java.lang.Boolean> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "canBeSaved"
            kotlin.jvm.internal.p.j(r3, r0)
            r1.<init>()
            r1.f6220a = r3
            if (r2 == 0) goto L_0x0012
            java.util.Map r2 = kotlin.collections.x.t(r2)
            if (r2 != 0) goto L_0x0017
        L_0x0012:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L_0x0017:
            r1.f6221b = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f6222c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.a.<init>(java.util.Map, lp0.l):void");
    }

    public boolean a(Object obj) {
        p.j(obj, "value");
        return this.f6220a.invoke(obj).booleanValue();
    }

    public Map<String, List<Object>> b() {
        Map<String, List<Object>> t = x.t(this.f6221b);
        for (Map.Entry next : this.f6222c.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            int i11 = 0;
            if (list.size() == 1) {
                Object invoke = ((lp0.a) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (a(invoke)) {
                    t.put(str, k.f(invoke));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                while (i11 < size) {
                    Object invoke2 = ((lp0.a) list.get(i11)).invoke();
                    if (invoke2 == null || a(invoke2)) {
                        arrayList.add(invoke2);
                        i11++;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                t.put(str, arrayList);
            }
        }
        return t;
    }

    public Object c(String str) {
        p.j(str, HttpRequest.HEADER_KEY);
        List remove = this.f6221b.remove(str);
        if (remove == null || !(!remove.isEmpty())) {
            return null;
        }
        if (remove.size() > 1) {
            this.f6221b.put(str, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }

    public b.a d(String str, lp0.a<? extends Object> aVar) {
        p.j(str, HttpRequest.HEADER_KEY);
        p.j(aVar, "valueProvider");
        if (!o.A(str)) {
            Map<String, List<lp0.a<Object>>> map = this.f6222c;
            List<lp0.a<Object>> list = map.get(str);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str, list);
            }
            list.add(aVar);
            return new C0019a(this, str, aVar);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
}
