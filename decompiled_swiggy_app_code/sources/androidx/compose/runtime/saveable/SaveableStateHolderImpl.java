package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import bp0.k;
import e0.g;
import e0.n0;
import e0.s0;
import e0.u;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import m0.b;
import m0.c;

/* compiled from: SaveableStateHolder.kt */
final class SaveableStateHolderImpl implements m0.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f6190d = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final c<SaveableStateHolderImpl, ?> f6191e = SaverKt.a(SaveableStateHolderImpl$Companion$Saver$1.f6195a, SaveableStateHolderImpl$Companion$Saver$2.f6196a);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<Object, Map<String, List<Object>>> f6192a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<Object, RegistryHolder> f6193b;

    /* renamed from: c  reason: collision with root package name */
    private b f6194c;

    /* compiled from: SaveableStateHolder.kt */
    public final class RegistryHolder {

        /* renamed from: a  reason: collision with root package name */
        private final Object f6197a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f6198b = true;

        /* renamed from: c  reason: collision with root package name */
        private final b f6199c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SaveableStateHolderImpl f6200d;

        public RegistryHolder(SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
            p.j(obj, HttpRequest.HEADER_KEY);
            this.f6200d = saveableStateHolderImpl;
            this.f6197a = obj;
            this.f6199c = SaveableStateRegistryKt.a((Map) saveableStateHolderImpl.f6192a.get(obj), new SaveableStateHolderImpl$RegistryHolder$registry$1(saveableStateHolderImpl));
        }

        public final b a() {
            return this.f6199c;
        }

        public final void b(Map<Object, Map<String, List<Object>>> map) {
            p.j(map, "map");
            if (this.f6198b) {
                Map<String, List<Object>> b11 = this.f6199c.b();
                if (b11.isEmpty()) {
                    map.remove(this.f6197a);
                } else {
                    map.put(this.f6197a, b11);
                }
            }
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c<SaveableStateHolderImpl, ?> a() {
            return SaveableStateHolderImpl.f6191e;
        }
    }

    public SaveableStateHolderImpl() {
        this((Map) null, 1, (i) null);
    }

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> map) {
        p.j(map, "savedStates");
        this.f6192a = map;
        this.f6193b = new LinkedHashMap();
    }

    /* access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> g() {
        Map<Object, Map<String, List<Object>>> t = x.t(this.f6192a);
        for (RegistryHolder b11 : this.f6193b.values()) {
            b11.b(t);
        }
        if (t.isEmpty()) {
            return null;
        }
        return t;
    }

    public void a(Object obj, lp0.p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        p.j(obj, HttpRequest.HEADER_KEY);
        p.j(pVar, "content");
        g t = gVar.t(-1198538093);
        t.E(444418301);
        t.g(207, obj);
        t.E(-642722479);
        t.E(-492369756);
        Object F = t.F();
        if (F == g.f14172a.a()) {
            b bVar = this.f6194c;
            if (bVar != null ? bVar.a(obj) : true) {
                F = new RegistryHolder(this, obj);
                t.y(F);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        t.P();
        RegistryHolder registryHolder = (RegistryHolder) F;
        CompositionLocalKt.a(new n0[]{SaveableStateRegistryKt.b().c(registryHolder.a())}, pVar, t, (i11 & 112) | 8);
        u.b(k.f22762a, new SaveableStateHolderImpl$SaveableStateProvider$1$1(this, obj, registryHolder), t, 0);
        t.P();
        t.D();
        t.P();
        s0 v = t.v();
        if (v != null) {
            v.a(new SaveableStateHolderImpl$SaveableStateProvider$2(this, obj, pVar, i11));
        }
    }

    public final b f() {
        return this.f6194c;
    }

    public final void h(b bVar) {
        this.f6194c = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveableStateHolderImpl(Map map, int i11, i iVar) {
        this((i11 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
