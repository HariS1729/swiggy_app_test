package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.w;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema */
abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final b0 f9951a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final b0 f9952b = new c();

    /* compiled from: ListFieldSchema */
    private static final class b extends b0 {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?> f9953c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j) {
            return (List) i1.A(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.datastore.preferences.protobuf.z} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: androidx.datastore.preferences.protobuf.z} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: androidx.datastore.preferences.protobuf.z} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.a0
                if (r1 == 0) goto L_0x0014
                androidx.datastore.preferences.protobuf.z r0 = new androidx.datastore.preferences.protobuf.z
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.t0
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.w.i
                if (r1 == 0) goto L_0x0024
                androidx.datastore.preferences.protobuf.w$i r0 = (androidx.datastore.preferences.protobuf.w.i) r0
                androidx.datastore.preferences.protobuf.w$i r6 = r0.mutableCopyWithCapacity(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                androidx.datastore.preferences.protobuf.i1.O(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f9953c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                androidx.datastore.preferences.protobuf.i1.O(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.h1
                if (r1 == 0) goto L_0x0062
                androidx.datastore.preferences.protobuf.z r1 = new androidx.datastore.preferences.protobuf.z
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                androidx.datastore.preferences.protobuf.h1 r0 = (androidx.datastore.preferences.protobuf.h1) r0
                r1.addAll(r0)
                androidx.datastore.preferences.protobuf.i1.O(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.t0
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.w.i
                if (r1 == 0) goto L_0x007f
                r1 = r0
                androidx.datastore.preferences.protobuf.w$i r1 = (androidx.datastore.preferences.protobuf.w.i) r1
                boolean r2 = r1.isModifiable()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                androidx.datastore.preferences.protobuf.w$i r0 = r1.mutableCopyWithCapacity(r0)
                androidx.datastore.preferences.protobuf.i1.O(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.b.g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j) {
            Object obj2;
            List list = (List) i1.A(obj, j);
            if (list instanceof a0) {
                obj2 = ((a0) list).getUnmodifiableView();
            } else if (!f9953c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof t0) || !(list instanceof w.i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    w.i iVar = (w.i) list;
                    if (iVar.isModifiable()) {
                        iVar.makeImmutable();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            i1.O(obj, j, obj2);
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j) {
            List f11 = f(obj2, j);
            List g11 = g(obj, j, f11.size());
            int size = g11.size();
            int size2 = f11.size();
            if (size > 0 && size2 > 0) {
                g11.addAll(f11);
            }
            if (size > 0) {
                f11 = g11;
            }
            i1.O(obj, j, f11);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    /* compiled from: ListFieldSchema */
    private static final class c extends b0 {
        private c() {
            super();
        }

        static <E> w.i<E> f(Object obj, long j) {
            return (w.i) i1.A(obj, j);
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j) {
            f(obj, j).makeImmutable();
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j) {
            w.i f11 = f(obj, j);
            w.i f12 = f(obj2, j);
            int size = f11.size();
            int size2 = f12.size();
            if (size > 0 && size2 > 0) {
                if (!f11.isModifiable()) {
                    f11 = f11.mutableCopyWithCapacity(size2 + size);
                }
                f11.addAll(f12);
            }
            if (size > 0) {
                f12 = f11;
            }
            i1.O(obj, j, f12);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j) {
            w.i f11 = f(obj, j);
            if (f11.isModifiable()) {
                return f11;
            }
            int size = f11.size();
            w.i mutableCopyWithCapacity = f11.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            i1.O(obj, j, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
    }

    static b0 a() {
        return f9951a;
    }

    static b0 b() {
        return f9952b;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j);

    private b0() {
    }
}
