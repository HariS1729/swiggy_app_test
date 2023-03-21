package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import t3.g;
import t3.k;

/* compiled from: InvalidationTracker */
public class x {

    /* renamed from: o  reason: collision with root package name */
    private static final String[] f11648o = {"UPDATE", HttpRequest.METHOD_DELETE, "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, Integer> f11649a;

    /* renamed from: b  reason: collision with root package name */
    final String[] f11650b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Set<String>> f11651c;

    /* renamed from: d  reason: collision with root package name */
    a f11652d = null;

    /* renamed from: e  reason: collision with root package name */
    final RoomDatabase f11653e;

    /* renamed from: f  reason: collision with root package name */
    AtomicBoolean f11654f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f11655g;

    /* renamed from: h  reason: collision with root package name */
    volatile k f11656h;

    /* renamed from: i  reason: collision with root package name */
    private final b f11657i;
    private final v j;
    @SuppressLint({"RestrictedApi"})
    final m.b<c, d> k;

    /* renamed from: l  reason: collision with root package name */
    private y f11658l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f11659m;
    Runnable n;

    /* compiled from: InvalidationTracker */
    class a implements Runnable {
        a() {
        }

        /* JADX INFO: finally extract failed */
        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor A = x.this.f11653e.A(new t3.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (A.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(A.getInt(0)));
                } catch (Throwable th2) {
                    A.close();
                    throw th2;
                }
            }
            A.close();
            if (!hashSet.isEmpty()) {
                x.this.f11656h.n();
            }
            return hashSet;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
            if (r0 != null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
            r0.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
            if (r0 == null) goto L_0x0092;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
            if (r1.isEmpty() != false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
            r0 = r5.f11660a.k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            r2 = r5.f11660a.k.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ab, code lost:
            if (r2.hasNext() == false) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ad, code lost:
            ((androidx.room.x.d) r2.next().getValue()).a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bd, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                androidx.room.x r0 = androidx.room.x.this
                androidx.room.RoomDatabase r0 = r0.f11653e
                java.util.concurrent.locks.Lock r0 = r0.l()
                r0.lock()
                r1 = 0
                androidx.room.x r2 = androidx.room.x.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r2 = r2.d()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r2 != 0) goto L_0x0021
                r0.unlock()
                androidx.room.x r0 = androidx.room.x.this
                androidx.room.a r0 = r0.f11652d
                if (r0 == 0) goto L_0x0020
                r0.b()
            L_0x0020:
                return
            L_0x0021:
                androidx.room.x r2 = androidx.room.x.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f11654f     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r2 != 0) goto L_0x003a
                r0.unlock()
                androidx.room.x r0 = androidx.room.x.this
                androidx.room.a r0 = r0.f11652d
                if (r0 == 0) goto L_0x0039
                r0.b()
            L_0x0039:
                return
            L_0x003a:
                androidx.room.x r2 = androidx.room.x.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                androidx.room.RoomDatabase r2 = r2.f11653e     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r2 = r2.r()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r2 == 0) goto L_0x0051
                r0.unlock()
                androidx.room.x r0 = androidx.room.x.this
                androidx.room.a r0 = r0.f11652d
                if (r0 == 0) goto L_0x0050
                r0.b()
            L_0x0050:
                return
            L_0x0051:
                androidx.room.x r2 = androidx.room.x.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                androidx.room.RoomDatabase r2 = r2.f11653e     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                t3.h r2 = r2.m()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                t3.g r2 = r2.i()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                r2.s()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                java.util.Set r1 = r5.a()     // Catch:{ all -> 0x0077 }
                r2.y0()     // Catch:{ all -> 0x0077 }
                r2.C0()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                r0.unlock()
                androidx.room.x r0 = androidx.room.x.this
                androidx.room.a r0 = r0.f11652d
                if (r0 == 0) goto L_0x0092
            L_0x0073:
                r0.b()
                goto L_0x0092
            L_0x0077:
                r3 = move-exception
                r2.C0()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                throw r3     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
            L_0x007c:
                r1 = move-exception
                goto L_0x00c3
            L_0x007e:
                r2 = move-exception
                goto L_0x0081
            L_0x0080:
                r2 = move-exception
            L_0x0081:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x007c }
                r0.unlock()
                androidx.room.x r0 = androidx.room.x.this
                androidx.room.a r0 = r0.f11652d
                if (r0 == 0) goto L_0x0092
                goto L_0x0073
            L_0x0092:
                if (r1 == 0) goto L_0x00c2
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto L_0x00c2
                androidx.room.x r0 = androidx.room.x.this
                m.b<androidx.room.x$c, androidx.room.x$d> r0 = r0.k
                monitor-enter(r0)
                androidx.room.x r2 = androidx.room.x.this     // Catch:{ all -> 0x00bf }
                m.b<androidx.room.x$c, androidx.room.x$d> r2 = r2.k     // Catch:{ all -> 0x00bf }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00bf }
            L_0x00a7:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00bf }
                if (r3 == 0) goto L_0x00bd
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00bf }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00bf }
                java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00bf }
                androidx.room.x$d r3 = (androidx.room.x.d) r3     // Catch:{ all -> 0x00bf }
                r3.a(r1)     // Catch:{ all -> 0x00bf }
                goto L_0x00a7
            L_0x00bd:
                monitor-exit(r0)     // Catch:{ all -> 0x00bf }
                goto L_0x00c2
            L_0x00bf:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00bf }
                throw r1
            L_0x00c2:
                return
            L_0x00c3:
                r0.unlock()
                androidx.room.x r0 = androidx.room.x.this
                androidx.room.a r0 = r0.f11652d
                if (r0 == 0) goto L_0x00cf
                r0.b()
            L_0x00cf:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.x.a.run():void");
        }
    }

    /* compiled from: InvalidationTracker */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final long[] f11661a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f11662b;

        /* renamed from: c  reason: collision with root package name */
        final int[] f11663c;

        /* renamed from: d  reason: collision with root package name */
        boolean f11664d;

        b(int i11) {
            long[] jArr = new long[i11];
            this.f11661a = jArr;
            boolean[] zArr = new boolean[i11];
            this.f11662b = zArr;
            this.f11663c = new int[i11];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            synchronized (this) {
                if (!this.f11664d) {
                    return null;
                }
                int length = this.f11661a.length;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = 1;
                    boolean z11 = this.f11661a[i11] > 0;
                    boolean[] zArr = this.f11662b;
                    if (z11 != zArr[i11]) {
                        int[] iArr = this.f11663c;
                        if (!z11) {
                            i12 = 2;
                        }
                        iArr[i11] = i12;
                    } else {
                        this.f11663c[i11] = 0;
                    }
                    zArr[i11] = z11;
                }
                this.f11664d = false;
                int[] iArr2 = (int[]) this.f11663c.clone();
                return iArr2;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(int... iArr) {
            boolean z11;
            synchronized (this) {
                z11 = false;
                for (int i11 : iArr) {
                    long[] jArr = this.f11661a;
                    long j = jArr[i11];
                    jArr[i11] = 1 + j;
                    if (j == 0) {
                        this.f11664d = true;
                        z11 = true;
                    }
                }
            }
            return z11;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int... iArr) {
            boolean z11;
            synchronized (this) {
                z11 = false;
                for (int i11 : iArr) {
                    long[] jArr = this.f11661a;
                    long j = jArr[i11];
                    jArr[i11] = j - 1;
                    if (j == 1) {
                        this.f11664d = true;
                        z11 = true;
                    }
                }
            }
            return z11;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            synchronized (this) {
                Arrays.fill(this.f11662b, false);
                this.f11664d = true;
            }
        }
    }

    /* compiled from: InvalidationTracker */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String[] f11665a;

        public c(String[] strArr) {
            this.f11665a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* compiled from: InvalidationTracker */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        final int[] f11666a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f11667b;

        /* renamed from: c  reason: collision with root package name */
        final c f11668c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<String> f11669d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f11668c = cVar;
            this.f11666a = iArr;
            this.f11667b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f11669d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f11669d = null;
        }

        /* access modifiers changed from: package-private */
        public void a(Set<Integer> set) {
            int length = this.f11666a.length;
            Set set2 = null;
            for (int i11 = 0; i11 < length; i11++) {
                if (set.contains(Integer.valueOf(this.f11666a[i11]))) {
                    if (length == 1) {
                        set2 = this.f11669d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f11667b[i11]);
                    }
                }
            }
            if (set2 != null) {
                this.f11668c.b(set2);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(String[] strArr) {
            Set<String> set = null;
            if (this.f11667b.length == 1) {
                int length = strArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (strArr[i11].equalsIgnoreCase(this.f11667b[0])) {
                        set = this.f11669d;
                        break;
                    } else {
                        i11++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f11667b;
                    int length2 = strArr2.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i12];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i12++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f11668c.b(set);
            }
        }
    }

    public x(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f11654f = new AtomicBoolean(false);
        this.f11655g = false;
        this.k = new m.b<>();
        this.f11659m = new Object();
        this.n = new a();
        this.f11653e = roomDatabase;
        this.f11657i = new b(strArr.length);
        this.f11649a = new HashMap<>();
        this.f11651c = map2;
        this.j = new v(roomDatabase);
        int length = strArr.length;
        this.f11650b = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArr[i11];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f11649a.put(lowerCase, Integer.valueOf(i11));
            String str2 = map.get(strArr[i11]);
            if (str2 != null) {
                this.f11650b[i11] = str2.toLowerCase(locale);
            } else {
                this.f11650b[i11] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f11649a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f11649a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    private static void c(g gVar) {
        if (gVar.g1()) {
            gVar.s();
        } else {
            gVar.l();
        }
    }

    private String[] j(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f11651c.containsKey(lowerCase)) {
                hashSet.addAll(this.f11651c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void m(g gVar, int i11) {
        gVar.m0("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i11 + ", 0)");
        String str = this.f11650b[i11];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f11648o) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i11);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            gVar.m0(sb2.toString());
        }
    }

    private void n(g gVar, int i11) {
        String str = this.f11650b[i11];
        StringBuilder sb2 = new StringBuilder();
        for (String b11 : f11648o) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            b(sb2, str, b11);
            gVar.m0(sb2.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d i11;
        String[] j11 = j(cVar.f11665a);
        int[] iArr = new int[j11.length];
        int length = j11.length;
        int i12 = 0;
        while (i12 < length) {
            Integer num = this.f11649a.get(j11[i12].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i12] = num.intValue();
                i12++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + j11[i12]);
            }
        }
        d dVar = new d(cVar, iArr, j11);
        synchronized (this.k) {
            i11 = this.k.i(cVar, dVar);
        }
        if (i11 == null && this.f11657i.b(iArr)) {
            o();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        if (!this.f11653e.x()) {
            return false;
        }
        if (!this.f11655g) {
            this.f11653e.m().i();
        }
        if (this.f11655g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* access modifiers changed from: package-private */
    public void e(g gVar) {
        synchronized (this) {
            if (this.f11655g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.m0("PRAGMA temp_store = MEMORY;");
            gVar.m0("PRAGMA recursive_triggers='ON';");
            gVar.m0("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            p(gVar);
            this.f11656h = gVar.T0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f11655g = true;
        }
    }

    public void f(String... strArr) {
        synchronized (this.k) {
            Iterator<Map.Entry<c, d>> it2 = this.k.iterator();
            while (it2.hasNext()) {
                Map.Entry next = it2.next();
                if (!((c) next.getKey()).a()) {
                    ((d) next.getValue()).b(strArr);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        synchronized (this) {
            this.f11655g = false;
            this.f11657i.d();
        }
    }

    public void h() {
        if (this.f11654f.compareAndSet(false, true)) {
            a aVar = this.f11652d;
            if (aVar != null) {
                aVar.e();
            }
            this.f11653e.n().execute(this.n);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void i(c cVar) {
        d k11;
        synchronized (this.k) {
            k11 = this.k.k(cVar);
        }
        if (k11 != null && this.f11657i.c(k11.f11666a)) {
            o();
        }
    }

    /* access modifiers changed from: package-private */
    public void k(a aVar) {
        this.f11652d = aVar;
        aVar.h(new w(this));
    }

    /* access modifiers changed from: package-private */
    public void l(Context context, String str, Intent intent) {
        this.f11658l = new y(context, str, intent, this, this.f11653e.n());
    }

    /* access modifiers changed from: package-private */
    public void o() {
        if (this.f11653e.x()) {
            p(this.f11653e.m().i());
        }
    }

    /* access modifiers changed from: package-private */
    public void p(g gVar) {
        if (!gVar.f1()) {
            try {
                Lock l11 = this.f11653e.l();
                l11.lock();
                try {
                    synchronized (this.f11659m) {
                        int[] a11 = this.f11657i.a();
                        if (a11 != null) {
                            int length = a11.length;
                            c(gVar);
                            int i11 = 0;
                            while (i11 < length) {
                                try {
                                    int i12 = a11[i11];
                                    if (i12 == 1) {
                                        m(gVar, i11);
                                    } else if (i12 == 2) {
                                        n(gVar, i11);
                                    }
                                    i11++;
                                } catch (Throwable th2) {
                                    gVar.C0();
                                    throw th2;
                                }
                            }
                            gVar.y0();
                            gVar.C0();
                            l11.unlock();
                        }
                    }
                } finally {
                    l11.unlock();
                }
            } catch (SQLiteException | IllegalStateException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
            }
        }
    }
}
