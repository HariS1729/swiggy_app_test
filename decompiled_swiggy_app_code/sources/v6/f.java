package v6;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;

/* compiled from: WeakMemoryCache.kt */
public final class f implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f17341c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<MemoryCache.Key, ArrayList<b>> f17342a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private int f17343b;

    /* compiled from: WeakMemoryCache.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: WeakMemoryCache.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f17344a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<Bitmap> f17345b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, Object> f17346c;

        /* renamed from: d  reason: collision with root package name */
        private final int f17347d;

        public b(int i11, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i12) {
            this.f17344a = i11;
            this.f17345b = weakReference;
            this.f17346c = map;
            this.f17347d = i12;
        }

        public final WeakReference<Bitmap> a() {
            return this.f17345b;
        }

        public final Map<String, Object> b() {
            return this.f17346c;
        }

        public final int c() {
            return this.f17344a;
        }

        public final int d() {
            return this.f17347d;
        }
    }

    private final void e() {
        int i11 = this.f17343b;
        this.f17343b = i11 + 1;
        if (i11 >= 10) {
            d();
        }
    }

    public synchronized void a(int i11) {
        if (i11 >= 10 && i11 != 20) {
            d();
        }
    }

    public synchronized MemoryCache.b b(MemoryCache.Key key) {
        ArrayList arrayList = this.f17342a.get(key);
        MemoryCache.b bVar = null;
        if (arrayList == null) {
            return null;
        }
        int i11 = 0;
        int size = arrayList.size();
        while (true) {
            if (i11 >= size) {
                break;
            }
            int i12 = i11 + 1;
            b bVar2 = (b) arrayList.get(i11);
            Bitmap bitmap = (Bitmap) bVar2.a().get();
            MemoryCache.b bVar3 = bitmap == null ? null : new MemoryCache.b(bitmap, bVar2.b());
            if (bVar3 != null) {
                bVar = bVar3;
                break;
            }
            i11 = i12;
        }
        e();
        return bVar;
    }

    public synchronized void c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map, int i11) {
        LinkedHashMap<MemoryCache.Key, ArrayList<b>> linkedHashMap = this.f17342a;
        ArrayList<b> arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        int identityHashCode = System.identityHashCode(bitmap);
        b bVar = new b(identityHashCode, new WeakReference(bitmap), map, i11);
        int i12 = 0;
        int size = arrayList2.size();
        while (true) {
            if (i12 >= size) {
                arrayList2.add(bVar);
                break;
            }
            int i13 = i12 + 1;
            b bVar2 = (b) arrayList2.get(i12);
            if (i11 < bVar2.d()) {
                i12 = i13;
            } else if (bVar2.c() == identityHashCode && bVar2.a().get() == bitmap) {
                arrayList2.set(i12, bVar);
            } else {
                arrayList2.add(i12, bVar);
            }
        }
        e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r9 = this;
            r0 = 0
            r9.f17343b = r0
            java.util.LinkedHashMap<coil.memory.MemoryCache$Key, java.util.ArrayList<v6.f$b>> r1 = r9.f17342a
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r1.next()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = 1
            if (r3 > r4) goto L_0x003e
            java.lang.Object r2 = kotlin.collections.s.Y(r2)
            v6.f$b r2 = (v6.f.b) r2
            r3 = 0
            if (r2 != 0) goto L_0x002a
            goto L_0x0038
        L_0x002a:
            java.lang.ref.WeakReference r2 = r2.a()
            if (r2 != 0) goto L_0x0031
            goto L_0x0038
        L_0x0031:
            java.lang.Object r2 = r2.get()
            r3 = r2
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
        L_0x0038:
            if (r3 != 0) goto L_0x000d
            r1.remove()
            goto L_0x000d
        L_0x003e:
            int r3 = r2.size()
            r5 = 0
            r6 = 0
        L_0x0044:
            if (r5 >= r3) goto L_0x0065
            int r7 = r5 + 1
            int r5 = r5 - r6
            java.lang.Object r8 = r2.get(r5)
            v6.f$b r8 = (v6.f.b) r8
            java.lang.ref.WeakReference r8 = r8.a()
            java.lang.Object r8 = r8.get()
            if (r8 != 0) goto L_0x005b
            r8 = 1
            goto L_0x005c
        L_0x005b:
            r8 = 0
        L_0x005c:
            if (r8 == 0) goto L_0x0063
            r2.remove(r5)
            int r6 = r6 + 1
        L_0x0063:
            r5 = r7
            goto L_0x0044
        L_0x0065:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x000d
            r1.remove()
            goto L_0x000d
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.f.d():void");
    }
}
