package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import t3.g;
import t3.h;
import t3.j;
import t3.k;

public abstract class RoomDatabase {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    protected volatile g f11498a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f11499b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f11500c;

    /* renamed from: d  reason: collision with root package name */
    private h f11501d;

    /* renamed from: e  reason: collision with root package name */
    private final x f11502e = g();

    /* renamed from: f  reason: collision with root package name */
    private boolean f11503f;

    /* renamed from: g  reason: collision with root package name */
    boolean f11504g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    protected List<b> f11505h;

    /* renamed from: i  reason: collision with root package name */
    protected Map<Class<? extends l3.a>, l3.a> f11506i = new HashMap();
    private final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
    private a k;

    /* renamed from: l  reason: collision with root package name */
    private final ThreadLocal<Integer> f11507l = new ThreadLocal<>();

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, Object> f11508m = Collections.synchronizedMap(new HashMap());
    private final Map<Class<?>, Object> n = new HashMap();

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            return t3.c.b(activityManager);
        }

        /* access modifiers changed from: package-private */
        public JournalMode resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || isLowRamDevice(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    public static class a<T extends RoomDatabase> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f11509a;

        /* renamed from: b  reason: collision with root package name */
        private final String f11510b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f11511c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<b> f11512d;

        /* renamed from: e  reason: collision with root package name */
        private e f11513e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f11514f;

        /* renamed from: g  reason: collision with root package name */
        private List<Object> f11515g;

        /* renamed from: h  reason: collision with root package name */
        private List<l3.a> f11516h;

        /* renamed from: i  reason: collision with root package name */
        private Executor f11517i;
        private Executor j;
        private h.c k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f11518l;

        /* renamed from: m  reason: collision with root package name */
        private JournalMode f11519m;
        private Intent n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f11520o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f11521p;
        private long q = -1;

        /* renamed from: r  reason: collision with root package name */
        private TimeUnit f11522r;

        /* renamed from: s  reason: collision with root package name */
        private final c f11523s;
        private Set<Integer> t;

        /* renamed from: u  reason: collision with root package name */
        private Set<Integer> f11524u;
        private String v;

        /* renamed from: w  reason: collision with root package name */
        private File f11525w;

        /* renamed from: x  reason: collision with root package name */
        private Callable<InputStream> f11526x;

        a(Context context, Class<T> cls, String str) {
            this.f11511c = context;
            this.f11509a = cls;
            this.f11510b = str;
            this.f11519m = JournalMode.AUTOMATIC;
            this.f11520o = true;
            this.f11523s = new c();
        }

        public a<T> a(b bVar) {
            if (this.f11512d == null) {
                this.f11512d = new ArrayList<>();
            }
            this.f11512d.add(bVar);
            return this;
        }

        public a<T> b(l3.b... bVarArr) {
            if (this.f11524u == null) {
                this.f11524u = new HashSet();
            }
            for (l3.b bVar : bVarArr) {
                this.f11524u.add(Integer.valueOf(bVar.f15459a));
                this.f11524u.add(Integer.valueOf(bVar.f15460b));
            }
            this.f11523s.b(bVarArr);
            return this;
        }

        public a<T> c() {
            this.f11518l = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public T d() {
            Executor executor;
            if (this.f11511c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f11509a != null) {
                Executor executor2 = this.f11517i;
                if (executor2 == null && this.j == null) {
                    Executor d11 = l.a.d();
                    this.j = d11;
                    this.f11517i = d11;
                } else if (executor2 != null && this.j == null) {
                    this.j = executor2;
                } else if (executor2 == null && (executor = this.j) != null) {
                    this.f11517i = executor;
                }
                Set<Integer> set = this.f11524u;
                if (!(set == null || this.t == null)) {
                    for (Integer next : set) {
                        if (this.t.contains(next)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + next);
                        }
                    }
                }
                m mVar = this.k;
                if (mVar == null) {
                    mVar = new u3.c();
                }
                long j11 = this.q;
                if (j11 > 0) {
                    if (this.f11510b != null) {
                        mVar = new m(mVar, new a(j11, this.f11522r, this.j));
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                }
                String str = this.v;
                if (!(str == null && this.f11525w == null && this.f11526x == null)) {
                    if (this.f11510b != null) {
                        int i11 = 0;
                        int i12 = str == null ? 0 : 1;
                        File file = this.f11525w;
                        int i13 = i12 + (file == null ? 0 : 1);
                        Callable<InputStream> callable = this.f11526x;
                        if (callable != null) {
                            i11 = 1;
                        }
                        if (i13 + i11 == 1) {
                            mVar = new w0(str, file, callable, mVar);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                }
                e eVar = this.f11513e;
                k0 k0Var = eVar != null ? new k0(mVar, eVar, this.f11514f) : mVar;
                Context context = this.f11511c;
                o oVar = new o(context, this.f11510b, k0Var, this.f11523s, this.f11512d, this.f11518l, this.f11519m.resolve(context), this.f11517i, this.j, this.n, this.f11520o, this.f11521p, this.t, this.v, this.f11525w, this.f11526x, (d) null, this.f11515g, this.f11516h);
                T t11 = (RoomDatabase) p0.b(this.f11509a, "_Impl");
                t11.s(oVar);
                return t11;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        public a<T> e() {
            this.f11520o = false;
            this.f11521p = true;
            return this;
        }

        public a<T> f(h.c cVar) {
            this.k = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f11517i = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(g gVar) {
        }

        public void b(g gVar) {
        }

        public void c(g gVar) {
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private HashMap<Integer, TreeMap<Integer, l3.b>> f11527a = new HashMap<>();

        private void a(l3.b bVar) {
            int i11 = bVar.f15459a;
            int i12 = bVar.f15460b;
            TreeMap treeMap = this.f11527a.get(Integer.valueOf(i11));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f11527a.put(Integer.valueOf(i11), treeMap);
            }
            l3.b bVar2 = (l3.b) treeMap.get(Integer.valueOf(i12));
            if (bVar2 != null) {
                Log.w("ROOM", "Overriding migration " + bVar2 + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i12), bVar);
        }

        private List<l3.b> d(List<l3.b> list, boolean z11, int i11, int i12) {
            Set set;
            boolean z12;
            do {
                if (z11) {
                    if (i11 >= i12) {
                        return list;
                    }
                } else if (i11 <= i12) {
                    return list;
                }
                TreeMap treeMap = this.f11527a.get(Integer.valueOf(i11));
                if (treeMap != null) {
                    if (z11) {
                        set = treeMap.descendingKeySet();
                    } else {
                        set = treeMap.keySet();
                    }
                    Iterator it2 = set.iterator();
                    while (true) {
                        z12 = true;
                        boolean z13 = false;
                        if (!it2.hasNext()) {
                            z12 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it2.next()).intValue();
                        if (!z11 ? !(intValue < i12 || intValue >= i11) : !(intValue > i12 || intValue <= i11)) {
                            z13 = true;
                            continue;
                        }
                        if (z13) {
                            list.add((l3.b) treeMap.get(Integer.valueOf(intValue)));
                            i11 = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z12);
            return null;
        }

        public void b(l3.b... bVarArr) {
            for (l3.b a11 : bVarArr) {
                a(a11);
            }
        }

        public List<l3.b> c(int i11, int i12) {
            if (i11 == i12) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i12 > i11, i11, i12);
        }

        public Map<Integer, Map<Integer, l3.b>> e() {
            return Collections.unmodifiableMap(this.f11527a);
        }
    }

    public static abstract class d {
    }

    public interface e {
        void a(String str, List<Object> list);
    }

    private <T> T D(Class<T> cls, h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof p) {
            return D(cls, ((p) hVar).getDelegate());
        }
        return null;
    }

    private void t() {
        c();
        g i11 = this.f11501d.i();
        this.f11502e.p(i11);
        if (i11.g1()) {
            i11.s();
        } else {
            i11.l();
        }
    }

    private void u() {
        this.f11501d.i().C0();
        if (!r()) {
            this.f11502e.h();
        }
    }

    private static boolean w() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object y(g gVar) {
        t();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object z(g gVar) {
        u();
        return null;
    }

    public Cursor A(j jVar) {
        return B(jVar, (CancellationSignal) null);
    }

    public Cursor B(j jVar, CancellationSignal cancellationSignal) {
        c();
        d();
        if (cancellationSignal != null) {
            return this.f11501d.i().c0(jVar, cancellationSignal);
        }
        return this.f11501d.i().j0(jVar);
    }

    @Deprecated
    public void C() {
        this.f11501d.i().y0();
    }

    public void c() {
        if (!this.f11503f && w()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!r() && this.f11507l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void e() {
        c();
        a aVar = this.k;
        if (aVar == null) {
            t();
        } else {
            aVar.c(new q0(this));
        }
    }

    public k f(String str) {
        c();
        d();
        return this.f11501d.i().T0(str);
    }

    /* access modifiers changed from: protected */
    public abstract x g();

    /* access modifiers changed from: protected */
    public abstract h h(o oVar);

    @Deprecated
    public void i() {
        a aVar = this.k;
        if (aVar == null) {
            u();
        } else {
            aVar.c(new r0(this));
        }
    }

    public List<l3.b> j(Map<Class<? extends l3.a>, l3.a> map) {
        return Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> k() {
        return this.f11508m;
    }

    /* access modifiers changed from: package-private */
    public Lock l() {
        return this.j.readLock();
    }

    public h m() {
        return this.f11501d;
    }

    public Executor n() {
        return this.f11499b;
    }

    public Set<Class<? extends l3.a>> o() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> p() {
        return Collections.emptyMap();
    }

    public Executor q() {
        return this.f11500c;
    }

    public boolean r() {
        return this.f11501d.i().f1();
    }

    public void s(o oVar) {
        boolean z11;
        this.f11501d = h(oVar);
        Set<Class<? extends l3.a>> o11 = o();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends l3.a>> it2 = o11.iterator();
        while (true) {
            int i11 = -1;
            if (it2.hasNext()) {
                Class next = it2.next();
                int size = oVar.f11597g.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (next.isAssignableFrom(oVar.f11597g.get(size).getClass())) {
                        bitSet.set(size);
                        i11 = size;
                        break;
                    } else {
                        size--;
                    }
                }
                if (i11 >= 0) {
                    this.f11506i.put(next, oVar.f11597g.get(i11));
                } else {
                    throw new IllegalArgumentException("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.");
                }
            } else {
                int size2 = oVar.f11597g.size() - 1;
                while (size2 >= 0) {
                    if (bitSet.get(size2)) {
                        size2--;
                    } else {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                Iterator<l3.b> it3 = j(this.f11506i).iterator();
                while (true) {
                    z11 = false;
                    if (!it3.hasNext()) {
                        break;
                    }
                    l3.b next2 = it3.next();
                    if (!oVar.f11594d.e().containsKey(Integer.valueOf(next2.f15459a))) {
                        oVar.f11594d.b(next2);
                    }
                }
                v0 v0Var = (v0) D(v0.class, this.f11501d);
                if (v0Var != null) {
                    v0Var.f(oVar);
                }
                i iVar = (i) D(i.class, this.f11501d);
                if (iVar != null) {
                    a a11 = iVar.a();
                    this.k = a11;
                    this.f11502e.k(a11);
                }
                if (oVar.f11599i == JournalMode.WRITE_AHEAD_LOGGING) {
                    z11 = true;
                }
                this.f11501d.setWriteAheadLoggingEnabled(z11);
                this.f11505h = oVar.f11595e;
                this.f11499b = oVar.j;
                this.f11500c = new z0(oVar.k);
                this.f11503f = oVar.f11598h;
                this.f11504g = z11;
                Intent intent = oVar.f11601m;
                if (intent != null) {
                    this.f11502e.l(oVar.f11592b, oVar.f11593c, intent);
                }
                Map<Class<?>, List<Class<?>>> p11 = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry next3 : p11.entrySet()) {
                    Class cls = (Class) next3.getKey();
                    Iterator it4 = ((List) next3.getValue()).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Class cls2 = (Class) it4.next();
                            int size3 = oVar.f11596f.size() - 1;
                            while (true) {
                                if (size3 < 0) {
                                    size3 = -1;
                                    break;
                                } else if (cls2.isAssignableFrom(oVar.f11596f.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else {
                                    size3--;
                                }
                            }
                            if (size3 >= 0) {
                                this.n.put(cls2, oVar.f11596f.get(size3));
                            } else {
                                throw new IllegalArgumentException("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.");
                            }
                        }
                    }
                }
                int size4 = oVar.f11596f.size() - 1;
                while (size4 >= 0) {
                    if (bitSet2.get(size4)) {
                        size4--;
                    } else {
                        throw new IllegalArgumentException("Unexpected type converter " + oVar.f11596f.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void v(g gVar) {
        this.f11502e.e(gVar);
    }

    public boolean x() {
        a aVar = this.k;
        if (aVar != null) {
            return aVar.g();
        }
        g gVar = this.f11498a;
        return gVar != null && gVar.isOpen();
    }
}
