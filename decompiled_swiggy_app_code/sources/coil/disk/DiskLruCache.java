package coil.disk;

import bp0.k;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import okio.f0;
import okio.j;
import okio.u;
import okio.z;
import wp0.e2;
import wp0.j0;
import wp0.k0;
import wp0.k1;

/* compiled from: DiskLruCache.kt */
public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: s  reason: collision with root package name */
    public static final a f13510s = new a((i) null);
    private static final Regex t = new Regex("[a-z0-9_-]{1,120}");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final z f13511a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13512b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13513c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f13514d;

    /* renamed from: e  reason: collision with root package name */
    private final z f13515e;

    /* renamed from: f  reason: collision with root package name */
    private final z f13516f;

    /* renamed from: g  reason: collision with root package name */
    private final z f13517g;

    /* renamed from: h  reason: collision with root package name */
    private final LinkedHashMap<String, c> f13518h;

    /* renamed from: i  reason: collision with root package name */
    private final j0 f13519i;
    private long j;
    private int k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public okio.d f13520l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f13521m;
    /* access modifiers changed from: private */
    public boolean n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f13522o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f13523p;
    /* access modifiers changed from: private */
    public boolean q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final e f13524r;

    /* compiled from: DiskLruCache.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f13525a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f13526b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean[] f13527c;

        public b(c cVar) {
            this.f13525a = cVar;
            this.f13527c = new boolean[DiskLruCache.this.f13514d];
        }

        private final void d(boolean z11) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!this.f13526b) {
                    if (p.e(g().b(), this)) {
                        diskLruCache.M(this, z11);
                    }
                    this.f13526b = true;
                    k kVar = k.f22762a;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d Y;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                b();
                Y = diskLruCache.Y(g().d());
            }
            return Y;
        }

        public final void e() {
            if (p.e(this.f13525a.b(), this)) {
                this.f13525a.m(true);
            }
        }

        public final z f(int i11) {
            z zVar;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (!this.f13526b) {
                    h()[i11] = true;
                    z zVar2 = g().c().get(i11);
                    c7.e.a(diskLruCache.f13524r, zVar2);
                    zVar = zVar2;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
            return zVar;
        }

        public final c g() {
            return this.f13525a;
        }

        public final boolean[] h() {
            return this.f13527c;
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f13529a;

        /* renamed from: b  reason: collision with root package name */
        private final long[] f13530b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<z> f13531c;

        /* renamed from: d  reason: collision with root package name */
        private final ArrayList<z> f13532d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f13533e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f13534f;

        /* renamed from: g  reason: collision with root package name */
        private b f13535g;

        /* renamed from: h  reason: collision with root package name */
        private int f13536h;

        public c(String str) {
            this.f13529a = str;
            this.f13530b = new long[DiskLruCache.this.f13514d];
            this.f13531c = new ArrayList<>(DiskLruCache.this.f13514d);
            this.f13532d = new ArrayList<>(DiskLruCache.this.f13514d);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int t = DiskLruCache.this.f13514d;
            for (int i11 = 0; i11 < t; i11++) {
                sb2.append(i11);
                this.f13531c.add(DiskLruCache.this.f13511a.p(sb2.toString()));
                sb2.append(".tmp");
                this.f13532d.add(DiskLruCache.this.f13511a.p(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList<z> a() {
            return this.f13531c;
        }

        public final b b() {
            return this.f13535g;
        }

        public final ArrayList<z> c() {
            return this.f13532d;
        }

        public final String d() {
            return this.f13529a;
        }

        public final long[] e() {
            return this.f13530b;
        }

        public final int f() {
            return this.f13536h;
        }

        public final boolean g() {
            return this.f13533e;
        }

        public final boolean h() {
            return this.f13534f;
        }

        public final void i(b bVar) {
            this.f13535g = bVar;
        }

        public final void j(List<String> list) {
            if (list.size() == DiskLruCache.this.f13514d) {
                int i11 = 0;
                try {
                    int size = list.size();
                    while (i11 < size) {
                        int i12 = i11 + 1;
                        this.f13530b[i11] = Long.parseLong(list.get(i11));
                        i11 = i12;
                    }
                } catch (NumberFormatException unused) {
                    throw new IOException(p.s("unexpected journal line: ", list));
                }
            } else {
                throw new IOException(p.s("unexpected journal line: ", list));
            }
        }

        public final void k(int i11) {
            this.f13536h = i11;
        }

        public final void l(boolean z11) {
            this.f13533e = z11;
        }

        public final void m(boolean z11) {
            this.f13534f = z11;
        }

        public final d n() {
            if (!this.f13533e || this.f13535g != null || this.f13534f) {
                return null;
            }
            ArrayList<z> arrayList = this.f13531c;
            DiskLruCache diskLruCache = DiskLruCache.this;
            int i11 = 0;
            int size = arrayList.size();
            while (i11 < size) {
                int i12 = i11 + 1;
                if (!diskLruCache.f13524r.j(arrayList.get(i11))) {
                    try {
                        boolean unused = diskLruCache.L0(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
                i11 = i12;
            }
            this.f13536h++;
            return new d(this);
        }

        public final void o(okio.d dVar) {
            long[] jArr = this.f13530b;
            int length = jArr.length;
            int i11 = 0;
            while (i11 < length) {
                long j = jArr[i11];
                i11++;
                dVar.O(32).G(j);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class d implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final c f13538a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f13539b;

        public d(c cVar) {
            this.f13538a = cVar;
        }

        public final b a() {
            b Q;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                close();
                Q = diskLruCache.Q(f().d());
            }
            return Q;
        }

        public final z b(int i11) {
            if (!this.f13539b) {
                return this.f13538a.a().get(i11);
            }
            throw new IllegalStateException("snapshot is closed".toString());
        }

        public void close() {
            if (!this.f13539b) {
                this.f13539b = true;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    c f11 = f();
                    f11.k(f11.f() - 1);
                    if (f().f() == 0 && f().h()) {
                        boolean unused = diskLruCache.L0(f());
                    }
                    k kVar = k.f22762a;
                }
            }
        }

        public final c f() {
            return this.f13538a;
        }
    }

    /* compiled from: DiskLruCache.kt */
    public static final class e extends j {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ okio.i f13541f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(okio.i iVar) {
            super(iVar);
            this.f13541f = iVar;
        }

        public f0 p(z zVar, boolean z11) {
            z n = zVar.n();
            if (n != null) {
                d(n);
            }
            return super.p(zVar, z11);
        }
    }

    public DiskLruCache(okio.i iVar, z zVar, CoroutineDispatcher coroutineDispatcher, long j11, int i11, int i12) {
        this.f13511a = zVar;
        this.f13512b = j11;
        this.f13513c = i11;
        this.f13514d = i12;
        if (j11 > 0) {
            if (i12 > 0) {
                this.f13515e = zVar.p("journal");
                this.f13516f = zVar.p("journal.tmp");
                this.f13517g = zVar.p("journal.bkp");
                this.f13518h = new LinkedHashMap<>(0, 0.75f, true);
                this.f13519i = k0.a(e2.b((k1) null, 1, (Object) null).plus(coroutineDispatcher.L0(1)));
                this.f13524r = new e(iVar);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|(1:22)(1:23)|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r12.k = r9 - r12.f13518h.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r1.V0() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        S0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        r12.f13520l = w0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        r0 = bp0.k.f22762a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void H0() {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            coil.disk.DiskLruCache$e r1 = r12.f13524r
            okio.z r2 = r12.f13515e
            okio.h0 r1 = r1.q(r2)
            okio.e r1 = okio.u.d(r1)
            r2 = 0
            java.lang.String r3 = r1.F0()     // Catch:{ all -> 0x00b1 }
            java.lang.String r4 = r1.F0()     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = r1.F0()     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = r1.F0()     // Catch:{ all -> 0x00b1 }
            java.lang.String r7 = r1.F0()     // Catch:{ all -> 0x00b1 }
            java.lang.String r8 = "libcore.io.DiskLruCache"
            boolean r8 = kotlin.jvm.internal.p.e(r8, r3)     // Catch:{ all -> 0x00b1 }
            if (r8 == 0) goto L_0x007d
            java.lang.String r8 = "1"
            boolean r8 = kotlin.jvm.internal.p.e(r8, r4)     // Catch:{ all -> 0x00b1 }
            if (r8 == 0) goto L_0x007d
            int r8 = r12.f13513c     // Catch:{ all -> 0x00b1 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00b1 }
            boolean r8 = kotlin.jvm.internal.p.e(r8, r5)     // Catch:{ all -> 0x00b1 }
            if (r8 == 0) goto L_0x007d
            int r8 = r12.f13514d     // Catch:{ all -> 0x00b1 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00b1 }
            boolean r8 = kotlin.jvm.internal.p.e(r8, r6)     // Catch:{ all -> 0x00b1 }
            if (r8 == 0) goto L_0x007d
            int r8 = r7.length()     // Catch:{ all -> 0x00b1 }
            r9 = 0
            if (r8 <= 0) goto L_0x0054
            r8 = 1
            goto L_0x0055
        L_0x0054:
            r8 = 0
        L_0x0055:
            if (r8 != 0) goto L_0x007d
        L_0x0057:
            java.lang.String r0 = r1.F0()     // Catch:{ EOFException -> 0x0061 }
            r12.I0(r0)     // Catch:{ EOFException -> 0x0061 }
            int r9 = r9 + 1
            goto L_0x0057
        L_0x0061:
            java.util.LinkedHashMap<java.lang.String, coil.disk.DiskLruCache$c> r0 = r12.f13518h     // Catch:{ all -> 0x00b1 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b1 }
            int r9 = r9 - r0
            r12.k = r9     // Catch:{ all -> 0x00b1 }
            boolean r0 = r1.V0()     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0074
            r12.S0()     // Catch:{ all -> 0x00b1 }
            goto L_0x007a
        L_0x0074:
            okio.d r0 = r12.w0()     // Catch:{ all -> 0x00b1 }
            r12.f13520l = r0     // Catch:{ all -> 0x00b1 }
        L_0x007a:
            bp0.k r0 = bp0.k.f22762a     // Catch:{ all -> 0x00b1 }
            goto L_0x00b5
        L_0x007d:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00b1 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r9.<init>()     // Catch:{ all -> 0x00b1 }
            java.lang.String r10 = "unexpected journal header: ["
            r9.append(r10)     // Catch:{ all -> 0x00b1 }
            r9.append(r3)     // Catch:{ all -> 0x00b1 }
            r9.append(r0)     // Catch:{ all -> 0x00b1 }
            r9.append(r4)     // Catch:{ all -> 0x00b1 }
            r9.append(r0)     // Catch:{ all -> 0x00b1 }
            r9.append(r5)     // Catch:{ all -> 0x00b1 }
            r9.append(r0)     // Catch:{ all -> 0x00b1 }
            r9.append(r6)     // Catch:{ all -> 0x00b1 }
            r9.append(r0)     // Catch:{ all -> 0x00b1 }
            r9.append(r7)     // Catch:{ all -> 0x00b1 }
            r0 = 93
            r9.append(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x00b1 }
            r8.<init>(r0)     // Catch:{ all -> 0x00b1 }
            throw r8     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            r11 = r2
            r2 = r0
            r0 = r11
        L_0x00b5:
            if (r1 != 0) goto L_0x00b8
            goto L_0x00c4
        L_0x00b8:
            r1.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00c4
        L_0x00bc:
            r1 = move-exception
            if (r2 != 0) goto L_0x00c1
            r2 = r1
            goto L_0x00c4
        L_0x00c1:
            bp0.b.a(r2, r1)
        L_0x00c4:
            if (r2 != 0) goto L_0x00ca
            kotlin.jvm.internal.p.g(r0)
            return
        L_0x00ca:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.H0():void");
    }

    private final void I0(String str) {
        String str2;
        int g02 = StringsKt__StringsKt.g0(str, SafeJsonPrimitive.NULL_CHAR, 0, false, 6, (Object) null);
        if (g02 != -1) {
            int i11 = g02 + 1;
            int g03 = StringsKt__StringsKt.g0(str, SafeJsonPrimitive.NULL_CHAR, i11, false, 4, (Object) null);
            if (g03 == -1) {
                str2 = str.substring(i11);
                p.i(str2, "this as java.lang.String).substring(startIndex)");
                if (g02 == 6 && o.N(str, "REMOVE", false, 2, (Object) null)) {
                    this.f13518h.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i11, g03);
                p.i(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            LinkedHashMap<String, c> linkedHashMap = this.f13518h;
            c cVar = linkedHashMap.get(str2);
            if (cVar == null) {
                cVar = new c(str2);
                linkedHashMap.put(str2, cVar);
            }
            c cVar2 = cVar;
            if (g03 != -1 && g02 == 5 && o.N(str, "CLEAN", false, 2, (Object) null)) {
                String substring = str.substring(g03 + 1);
                p.i(substring, "this as java.lang.String).substring(startIndex)");
                List H0 = StringsKt__StringsKt.H0(substring, new char[]{SafeJsonPrimitive.NULL_CHAR}, false, 0, 6, (Object) null);
                cVar2.l(true);
                cVar2.i((b) null);
                cVar2.j(H0);
            } else if (g03 == -1 && g02 == 5 && o.N(str, "DIRTY", false, 2, (Object) null)) {
                cVar2.i(new b(cVar2));
            } else if (g03 != -1 || g02 != 4 || !o.N(str, "READ", false, 2, (Object) null)) {
                throw new IOException(p.s("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(p.s("unexpected journal line: ", str));
        }
    }

    private final void L() {
        if (!(!this.f13522o)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* access modifiers changed from: private */
    public final boolean L0(c cVar) {
        okio.d dVar;
        if (cVar.f() > 0 && (dVar = this.f13520l) != null) {
            dVar.B0("DIRTY");
            dVar.O(32);
            dVar.B0(cVar.d());
            dVar.O(10);
            dVar.flush();
        }
        if (cVar.f() > 0 || cVar.b() != null) {
            cVar.m(true);
            return true;
        }
        b b11 = cVar.b();
        if (b11 != null) {
            b11.e();
        }
        int i11 = this.f13514d;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f13524r.h(cVar.a().get(i12));
            this.j -= cVar.e()[i12];
            cVar.e()[i12] = 0;
        }
        this.k++;
        okio.d dVar2 = this.f13520l;
        if (dVar2 != null) {
            dVar2.B0("REMOVE");
            dVar2.O(32);
            dVar2.B0(cVar.d());
            dVar2.O(10);
        }
        this.f13518h.remove(cVar.d());
        if (e0()) {
            q0();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0125, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void M(coil.disk.DiskLruCache.b r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            coil.disk.DiskLruCache$c r0 = r10.g()     // Catch:{ all -> 0x0132 }
            coil.disk.DiskLruCache$b r1 = r0.b()     // Catch:{ all -> 0x0132 }
            boolean r1 = kotlin.jvm.internal.p.e(r1, r10)     // Catch:{ all -> 0x0132 }
            if (r1 == 0) goto L_0x0126
            r1 = 0
            if (r11 == 0) goto L_0x009e
            boolean r2 = r0.h()     // Catch:{ all -> 0x0132 }
            if (r2 != 0) goto L_0x009e
            int r2 = r9.f13514d     // Catch:{ all -> 0x0132 }
            r3 = 0
        L_0x001b:
            if (r3 >= r2) goto L_0x0040
            int r4 = r3 + 1
            boolean[] r5 = r10.h()     // Catch:{ all -> 0x0132 }
            boolean r5 = r5[r3]     // Catch:{ all -> 0x0132 }
            if (r5 == 0) goto L_0x003e
            coil.disk.DiskLruCache$e r5 = r9.f13524r     // Catch:{ all -> 0x0132 }
            java.util.ArrayList r6 = r0.c()     // Catch:{ all -> 0x0132 }
            java.lang.Object r3 = r6.get(r3)     // Catch:{ all -> 0x0132 }
            okio.z r3 = (okio.z) r3     // Catch:{ all -> 0x0132 }
            boolean r3 = r5.j(r3)     // Catch:{ all -> 0x0132 }
            if (r3 != 0) goto L_0x003e
            r10.a()     // Catch:{ all -> 0x0132 }
            monitor-exit(r9)
            return
        L_0x003e:
            r3 = r4
            goto L_0x001b
        L_0x0040:
            int r10 = r9.f13514d     // Catch:{ all -> 0x0132 }
        L_0x0042:
            if (r1 >= r10) goto L_0x00b5
            int r2 = r1 + 1
            java.util.ArrayList r3 = r0.c()     // Catch:{ all -> 0x0132 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0132 }
            okio.z r3 = (okio.z) r3     // Catch:{ all -> 0x0132 }
            java.util.ArrayList r4 = r0.a()     // Catch:{ all -> 0x0132 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0132 }
            okio.z r4 = (okio.z) r4     // Catch:{ all -> 0x0132 }
            coil.disk.DiskLruCache$e r5 = r9.f13524r     // Catch:{ all -> 0x0132 }
            boolean r5 = r5.j(r3)     // Catch:{ all -> 0x0132 }
            if (r5 == 0) goto L_0x0068
            coil.disk.DiskLruCache$e r5 = r9.f13524r     // Catch:{ all -> 0x0132 }
            r5.c(r3, r4)     // Catch:{ all -> 0x0132 }
            goto L_0x0077
        L_0x0068:
            coil.disk.DiskLruCache$e r3 = r9.f13524r     // Catch:{ all -> 0x0132 }
            java.util.ArrayList r5 = r0.a()     // Catch:{ all -> 0x0132 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ all -> 0x0132 }
            okio.z r5 = (okio.z) r5     // Catch:{ all -> 0x0132 }
            c7.e.a(r3, r5)     // Catch:{ all -> 0x0132 }
        L_0x0077:
            long[] r3 = r0.e()     // Catch:{ all -> 0x0132 }
            r5 = r3[r1]     // Catch:{ all -> 0x0132 }
            coil.disk.DiskLruCache$e r3 = r9.f13524r     // Catch:{ all -> 0x0132 }
            okio.h r3 = r3.l(r4)     // Catch:{ all -> 0x0132 }
            java.lang.Long r3 = r3.d()     // Catch:{ all -> 0x0132 }
            if (r3 != 0) goto L_0x008c
            r3 = 0
            goto L_0x0090
        L_0x008c:
            long r3 = r3.longValue()     // Catch:{ all -> 0x0132 }
        L_0x0090:
            long[] r7 = r0.e()     // Catch:{ all -> 0x0132 }
            r7[r1] = r3     // Catch:{ all -> 0x0132 }
            long r7 = r9.j     // Catch:{ all -> 0x0132 }
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.j = r7     // Catch:{ all -> 0x0132 }
            r1 = r2
            goto L_0x0042
        L_0x009e:
            int r10 = r9.f13514d     // Catch:{ all -> 0x0132 }
        L_0x00a0:
            if (r1 >= r10) goto L_0x00b5
            int r2 = r1 + 1
            coil.disk.DiskLruCache$e r3 = r9.f13524r     // Catch:{ all -> 0x0132 }
            java.util.ArrayList r4 = r0.c()     // Catch:{ all -> 0x0132 }
            java.lang.Object r1 = r4.get(r1)     // Catch:{ all -> 0x0132 }
            okio.z r1 = (okio.z) r1     // Catch:{ all -> 0x0132 }
            r3.h(r1)     // Catch:{ all -> 0x0132 }
            r1 = r2
            goto L_0x00a0
        L_0x00b5:
            r10 = 0
            r0.i(r10)     // Catch:{ all -> 0x0132 }
            boolean r10 = r0.h()     // Catch:{ all -> 0x0132 }
            if (r10 == 0) goto L_0x00c4
            r9.L0(r0)     // Catch:{ all -> 0x0132 }
            monitor-exit(r9)
            return
        L_0x00c4:
            int r10 = r9.k     // Catch:{ all -> 0x0132 }
            r1 = 1
            int r10 = r10 + r1
            r9.k = r10     // Catch:{ all -> 0x0132 }
            okio.d r10 = r9.f13520l     // Catch:{ all -> 0x0132 }
            kotlin.jvm.internal.p.g(r10)     // Catch:{ all -> 0x0132 }
            r2 = 10
            r3 = 32
            if (r11 != 0) goto L_0x00f8
            boolean r11 = r0.g()     // Catch:{ all -> 0x0132 }
            if (r11 == 0) goto L_0x00dc
            goto L_0x00f8
        L_0x00dc:
            java.util.LinkedHashMap<java.lang.String, coil.disk.DiskLruCache$c> r11 = r9.f13518h     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x0132 }
            r11.remove(r1)     // Catch:{ all -> 0x0132 }
            java.lang.String r11 = "REMOVE"
            r10.B0(r11)     // Catch:{ all -> 0x0132 }
            r10.O(r3)     // Catch:{ all -> 0x0132 }
            java.lang.String r11 = r0.d()     // Catch:{ all -> 0x0132 }
            r10.B0(r11)     // Catch:{ all -> 0x0132 }
            r10.O(r2)     // Catch:{ all -> 0x0132 }
            goto L_0x0110
        L_0x00f8:
            r0.l(r1)     // Catch:{ all -> 0x0132 }
            java.lang.String r11 = "CLEAN"
            r10.B0(r11)     // Catch:{ all -> 0x0132 }
            r10.O(r3)     // Catch:{ all -> 0x0132 }
            java.lang.String r11 = r0.d()     // Catch:{ all -> 0x0132 }
            r10.B0(r11)     // Catch:{ all -> 0x0132 }
            r0.o(r10)     // Catch:{ all -> 0x0132 }
            r10.O(r2)     // Catch:{ all -> 0x0132 }
        L_0x0110:
            r10.flush()     // Catch:{ all -> 0x0132 }
            long r10 = r9.j     // Catch:{ all -> 0x0132 }
            long r0 = r9.f13512b     // Catch:{ all -> 0x0132 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0121
            boolean r10 = r9.e0()     // Catch:{ all -> 0x0132 }
            if (r10 == 0) goto L_0x0124
        L_0x0121:
            r9.q0()     // Catch:{ all -> 0x0132 }
        L_0x0124:
            monitor-exit(r9)
            return
        L_0x0126:
            java.lang.String r10 = "Check failed."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0132 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0132 }
            r11.<init>(r10)     // Catch:{ all -> 0x0132 }
            throw r11     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.M(coil.disk.DiskLruCache$b, boolean):void");
    }

    private final boolean N0() {
        for (c next : this.f13518h.values()) {
            if (!next.h()) {
                L0(next);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void O0() {
        while (this.j > this.f13512b) {
            if (!N0()) {
                return;
            }
        }
        this.f13523p = false;
    }

    private final void P() {
        close();
        c7.e.b(this.f13524r, this.f13511a);
    }

    private final void Q0(String str) {
        if (!t.e(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void S0() {
        k kVar;
        okio.d dVar = this.f13520l;
        if (dVar != null) {
            dVar.close();
        }
        okio.d c11 = u.c(this.f13524r.p(this.f13516f, false));
        Throwable th2 = null;
        try {
            c11.B0("libcore.io.DiskLruCache").O(10);
            c11.B0("1").O(10);
            c11.G((long) this.f13513c).O(10);
            c11.G((long) this.f13514d).O(10);
            c11.O(10);
            for (c next : this.f13518h.values()) {
                if (next.b() != null) {
                    c11.B0("DIRTY");
                    c11.O(32);
                    c11.B0(next.d());
                    c11.O(10);
                } else {
                    c11.B0("CLEAN");
                    c11.O(32);
                    c11.B0(next.d());
                    next.o(c11);
                    c11.O(10);
                }
            }
            kVar = k.f22762a;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            kVar = null;
            th2 = th4;
        }
        if (c11 != null) {
            try {
                c11.close();
            } catch (Throwable th5) {
                if (th2 == null) {
                    th2 = th5;
                } else {
                    b.a(th2, th5);
                }
            }
        }
        if (th2 == null) {
            p.g(kVar);
            if (this.f13524r.j(this.f13515e)) {
                this.f13524r.c(this.f13515e, this.f13517g);
                this.f13524r.c(this.f13516f, this.f13515e);
                this.f13524r.h(this.f13517g);
            } else {
                this.f13524r.c(this.f13516f, this.f13515e);
            }
            this.f13520l = w0();
            this.k = 0;
            this.f13521m = false;
            this.q = false;
        } else {
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public final boolean e0() {
        return this.k >= 2000;
    }

    private final void q0() {
        k1 unused = j.d(this.f13519i, (CoroutineContext) null, (CoroutineStart) null, new DiskLruCache$launchCleanup$1(this, (fp0.c<? super DiskLruCache$launchCleanup$1>) null), 3, (Object) null);
    }

    private final okio.d w0() {
        return u.c(new p6.b(this.f13524r.a(this.f13515e), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void x0() {
        Iterator<c> it2 = this.f13518h.values().iterator();
        long j11 = 0;
        while (it2.hasNext()) {
            c next = it2.next();
            int i11 = 0;
            if (next.b() == null) {
                int i12 = this.f13514d;
                while (i11 < i12) {
                    j11 += next.e()[i11];
                    i11++;
                }
            } else {
                next.i((b) null);
                int i13 = this.f13514d;
                while (i11 < i13) {
                    this.f13524r.h(next.a().get(i11));
                    this.f13524r.h(next.c().get(i11));
                    i11++;
                }
                it2.remove();
            }
        }
        this.j = j11;
    }

    public final synchronized b Q(String str) {
        b bVar;
        L();
        Q0(str);
        Z();
        c cVar = this.f13518h.get(str);
        if (cVar == null) {
            bVar = null;
        } else {
            bVar = cVar.b();
        }
        if (bVar != null) {
            return null;
        }
        if (cVar != null) {
            if (cVar.f() != 0) {
                return null;
            }
        }
        if (!this.f13523p) {
            if (!this.q) {
                okio.d dVar = this.f13520l;
                p.g(dVar);
                dVar.B0("DIRTY");
                dVar.O(32);
                dVar.B0(str);
                dVar.O(10);
                dVar.flush();
                if (this.f13521m) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(str);
                    this.f13518h.put(str, cVar);
                }
                b bVar2 = new b(cVar);
                cVar.i(bVar2);
                return bVar2;
            }
        }
        q0();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized coil.disk.DiskLruCache.d Y(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.L()     // Catch:{ all -> 0x0047 }
            r3.Q0(r4)     // Catch:{ all -> 0x0047 }
            r3.Z()     // Catch:{ all -> 0x0047 }
            java.util.LinkedHashMap<java.lang.String, coil.disk.DiskLruCache$c> r0 = r3.f13518h     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0047 }
            coil.disk.DiskLruCache$c r0 = (coil.disk.DiskLruCache.c) r0     // Catch:{ all -> 0x0047 }
            r1 = 0
            if (r0 != 0) goto L_0x0017
            r0 = r1
            goto L_0x001b
        L_0x0017:
            coil.disk.DiskLruCache$d r0 = r0.n()     // Catch:{ all -> 0x0047 }
        L_0x001b:
            if (r0 != 0) goto L_0x001f
            monitor-exit(r3)
            return r1
        L_0x001f:
            int r1 = r3.k     // Catch:{ all -> 0x0047 }
            int r1 = r1 + 1
            r3.k = r1     // Catch:{ all -> 0x0047 }
            okio.d r1 = r3.f13520l     // Catch:{ all -> 0x0047 }
            kotlin.jvm.internal.p.g(r1)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "READ"
            r1.B0(r2)     // Catch:{ all -> 0x0047 }
            r2 = 32
            r1.O(r2)     // Catch:{ all -> 0x0047 }
            r1.B0(r4)     // Catch:{ all -> 0x0047 }
            r4 = 10
            r1.O(r4)     // Catch:{ all -> 0x0047 }
            boolean r4 = r3.e0()     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0045
            r3.q0()     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r3)
            return r0
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.Y(java.lang.String):coil.disk.DiskLruCache$d");
    }

    public final synchronized void Z() {
        if (!this.n) {
            this.f13524r.h(this.f13516f);
            if (this.f13524r.j(this.f13517g)) {
                if (this.f13524r.j(this.f13515e)) {
                    this.f13524r.h(this.f13517g);
                } else {
                    this.f13524r.c(this.f13517g, this.f13515e);
                }
            }
            if (this.f13524r.j(this.f13515e)) {
                try {
                    H0();
                    x0();
                    this.n = true;
                    return;
                } catch (IOException unused) {
                    P();
                    this.f13522o = false;
                } catch (Throwable th2) {
                    this.f13522o = false;
                    throw th2;
                }
            }
            S0();
            this.n = true;
        }
    }

    public synchronized void close() {
        if (this.n) {
            if (!this.f13522o) {
                int i11 = 0;
                Object[] array = this.f13518h.values().toArray(new c[0]);
                if (array != null) {
                    c[] cVarArr = (c[]) array;
                    int length = cVarArr.length;
                    while (i11 < length) {
                        c cVar = cVarArr[i11];
                        i11++;
                        if (cVar.b() != null) {
                            b b11 = cVar.b();
                            if (b11 != null) {
                                b11.e();
                            }
                        }
                    }
                    O0();
                    k0.d(this.f13519i, (CancellationException) null, 1, (Object) null);
                    okio.d dVar = this.f13520l;
                    p.g(dVar);
                    dVar.close();
                    this.f13520l = null;
                    this.f13522o = true;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        this.f13522o = true;
    }

    public synchronized void flush() {
        if (this.n) {
            L();
            O0();
            okio.d dVar = this.f13520l;
            p.g(dVar);
            dVar.flush();
        }
    }
}
