package t1;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import x1.k;
import x1.l;

/* compiled from: LruCache.kt */
public class b<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final l f16688a = k.a();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<K, V> f16689b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<K> f16690c;

    /* renamed from: d  reason: collision with root package name */
    private int f16691d;

    /* renamed from: e  reason: collision with root package name */
    private int f16692e;

    /* renamed from: f  reason: collision with root package name */
    private int f16693f;

    /* renamed from: g  reason: collision with root package name */
    private int f16694g;

    /* renamed from: h  reason: collision with root package name */
    private int f16695h;

    /* renamed from: i  reason: collision with root package name */
    private int f16696i;
    private int j;

    public b(int i11) {
        if (i11 > 0) {
            this.f16692e = i11;
            this.f16689b = new HashMap<>(0, 0.75f);
            this.f16690c = new LinkedHashSet<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final int g(K k, V v) {
        int i11 = i(k, v);
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalStateException(("Negative size: " + k + '=' + v).toString());
    }

    /* access modifiers changed from: protected */
    public V b(K k) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void c(boolean z11, K k, V v, V v11) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r2 = r5.f16688a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5.f16694g++;
        r3 = r5.f16689b.put(r6, r0);
        r5.f16690c.remove(r6);
        r5.f16690c.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r3 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r5.f16689b.put(r6, r3);
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r5.f16691d = h() + g(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r3 = bp0.k.f22762a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        c(false, r6, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        j(r5.f16692e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V d(K r6) {
        /*
            r5 = this;
            x1.l r0 = r5.f16688a
            monitor-enter(r0)
            java.util.HashMap<K, V> r1 = r5.f16689b     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x001d
            java.util.LinkedHashSet<K> r2 = r5.f16690c     // Catch:{ all -> 0x006c }
            r2.remove(r6)     // Catch:{ all -> 0x006c }
            java.util.LinkedHashSet<K> r2 = r5.f16690c     // Catch:{ all -> 0x006c }
            r2.add(r6)     // Catch:{ all -> 0x006c }
            int r6 = r5.f16696i     // Catch:{ all -> 0x006c }
            int r6 = r6 + 1
            r5.f16696i = r6     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            return r1
        L_0x001d:
            int r2 = r5.j     // Catch:{ all -> 0x006c }
            int r2 = r2 + 1
            r5.j = r2     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            java.lang.Object r0 = r5.b(r6)
            if (r0 != 0) goto L_0x002c
            r6 = 0
            return r6
        L_0x002c:
            x1.l r2 = r5.f16688a
            monitor-enter(r2)
            int r3 = r5.f16694g     // Catch:{ all -> 0x0069 }
            int r3 = r3 + 1
            r5.f16694g = r3     // Catch:{ all -> 0x0069 }
            java.util.HashMap<K, V> r3 = r5.f16689b     // Catch:{ all -> 0x0069 }
            java.lang.Object r3 = r3.put(r6, r0)     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashSet<K> r4 = r5.f16690c     // Catch:{ all -> 0x0069 }
            r4.remove(r6)     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashSet<K> r4 = r5.f16690c     // Catch:{ all -> 0x0069 }
            r4.add(r6)     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x004e
            java.util.HashMap<K, V> r1 = r5.f16689b     // Catch:{ all -> 0x0069 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0069 }
            r1 = r3
            goto L_0x0059
        L_0x004e:
            int r3 = r5.h()     // Catch:{ all -> 0x0069 }
            int r4 = r5.g(r6, r0)     // Catch:{ all -> 0x0069 }
            int r3 = r3 + r4
            r5.f16691d = r3     // Catch:{ all -> 0x0069 }
        L_0x0059:
            bp0.k r3 = bp0.k.f22762a     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)
            if (r1 == 0) goto L_0x0063
            r2 = 0
            r5.c(r2, r6, r0, r1)
            return r1
        L_0x0063:
            int r6 = r5.f16692e
            r5.j(r6)
            return r0
        L_0x0069:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        L_0x006c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.d(java.lang.Object):java.lang.Object");
    }

    public final V e(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw null;
        }
        synchronized (this.f16688a) {
            this.f16693f++;
            this.f16691d = h() + g(k, v);
            put = this.f16689b.put(k, v);
            if (put != null) {
                this.f16691d = h() - g(k, put);
            }
            if (this.f16690c.contains(k)) {
                this.f16690c.remove(k);
            }
            this.f16690c.add(k);
        }
        if (put != null) {
            c(false, k, put, v);
        }
        j(this.f16692e);
        return put;
    }

    public final V f(K k) {
        V remove;
        Objects.requireNonNull(k);
        synchronized (this.f16688a) {
            remove = this.f16689b.remove(k);
            this.f16690c.remove(k);
            if (remove != null) {
                this.f16691d = h() - g(k, remove);
            }
            bp0.k kVar = bp0.k.f22762a;
        }
        if (remove != null) {
            c(false, k, remove, (V) null);
        }
        return remove;
    }

    public final int h() {
        int i11;
        synchronized (this.f16688a) {
            i11 = this.f16691d;
        }
        return i11;
    }

    /* access modifiers changed from: protected */
    public int i(K k, V v) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(int r8) {
        /*
            r7 = this;
        L_0x0000:
            x1.l r0 = r7.f16688a
            monitor-enter(r0)
            int r1 = r7.h()     // Catch:{ all -> 0x0091 }
            if (r1 < 0) goto L_0x0089
            java.util.HashMap<K, V> r1 = r7.f16689b     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x0017
            int r1 = r7.h()     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x0089
        L_0x0017:
            java.util.HashMap<K, V> r1 = r7.f16689b     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            java.util.LinkedHashSet<K> r2 = r7.f16690c     // Catch:{ all -> 0x0091 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 != r2) goto L_0x0089
            int r1 = r7.h()     // Catch:{ all -> 0x0091 }
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L_0x0074
            java.util.HashMap<K, V> r1 = r7.f16689b     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x0074
            java.util.LinkedHashSet<K> r1 = r7.f16690c     // Catch:{ all -> 0x0091 }
            java.lang.Object r1 = kotlin.collections.s.V(r1)     // Catch:{ all -> 0x0091 }
            java.util.HashMap<K, V> r4 = r7.f16689b     // Catch:{ all -> 0x0091 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x006c
            java.util.HashMap<K, V> r5 = r7.f16689b     // Catch:{ all -> 0x0091 }
            java.util.Map r5 = kotlin.jvm.internal.x.d(r5)     // Catch:{ all -> 0x0091 }
            r5.remove(r1)     // Catch:{ all -> 0x0091 }
            java.util.LinkedHashSet<K> r5 = r7.f16690c     // Catch:{ all -> 0x0091 }
            java.util.Collection r5 = kotlin.jvm.internal.x.a(r5)     // Catch:{ all -> 0x0091 }
            r5.remove(r1)     // Catch:{ all -> 0x0091 }
            int r5 = r7.h()     // Catch:{ all -> 0x0091 }
            kotlin.jvm.internal.p.g(r1)     // Catch:{ all -> 0x0091 }
            kotlin.jvm.internal.p.g(r4)     // Catch:{ all -> 0x0091 }
            int r6 = r7.g(r1, r4)     // Catch:{ all -> 0x0091 }
            int r5 = r5 - r6
            r7.f16691d = r5     // Catch:{ all -> 0x0091 }
            int r5 = r7.f16695h     // Catch:{ all -> 0x0091 }
            int r5 = r5 + r2
            r7.f16695h = r5     // Catch:{ all -> 0x0091 }
            goto L_0x0076
        L_0x006c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch:{ all -> 0x0091 }
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0074:
            r1 = r3
            r4 = r1
        L_0x0076:
            bp0.k r5 = bp0.k.f22762a     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)
            if (r1 != 0) goto L_0x007e
            if (r4 != 0) goto L_0x007e
            return
        L_0x007e:
            kotlin.jvm.internal.p.g(r1)
            kotlin.jvm.internal.p.g(r4)
            r7.c(r2, r1, r4, r3)
            goto L_0x0000
        L_0x0089:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch:{ all -> 0x0091 }
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.j(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f16688a) {
            int i11 = this.f16696i;
            int i12 = this.j + i11;
            str = "LruCache[maxSize=" + this.f16692e + ",hits=" + this.f16696i + ",misses=" + this.j + ",hitRate=" + (i12 != 0 ? (i11 * 100) / i12 : 0) + "%]";
        }
        return str;
    }
}
