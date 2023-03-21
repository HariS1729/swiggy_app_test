package androidx.datastore.core;

import bp0.k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.s;
import lp0.p;
import wp0.j0;
import wp0.k1;
import wp0.w;
import wp0.y;
import y2.e;
import y2.f;

/* compiled from: SingleProcessDataStore.kt */
public final class SingleProcessDataStore<T> implements y2.c<T> {
    public static final a k = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Set<String> f9774l = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Object f9775m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final lp0.a<File> f9776a;

    /* renamed from: b  reason: collision with root package name */
    private final f<T> f9777b;

    /* renamed from: c  reason: collision with root package name */
    private final y2.a<T> f9778c;

    /* renamed from: d  reason: collision with root package name */
    private final j0 f9779d;

    /* renamed from: e  reason: collision with root package name */
    private final d<T> f9780e = kotlinx.coroutines.flow.f.x(new SingleProcessDataStore$data$1(this, (fp0.c<? super SingleProcessDataStore$data$1>) null));

    /* renamed from: f  reason: collision with root package name */
    private final String f9781f = ".tmp";

    /* renamed from: g  reason: collision with root package name */
    private final bp0.f f9782g = b.b(new SingleProcessDataStore$file$2(this));
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final kotlinx.coroutines.flow.i<d<T>> f9783h = s.a(e.f9875a);

    /* renamed from: i  reason: collision with root package name */
    private List<? extends p<? super e<T>, ? super fp0.c<? super k>, ? extends Object>> f9784i;
    /* access modifiers changed from: private */
    public final SimpleActor<b<T>> j;

    /* compiled from: SingleProcessDataStore.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final Set<String> a() {
            return SingleProcessDataStore.f9774l;
        }

        public final Object b() {
            return SingleProcessDataStore.f9775m;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    private static abstract class b<T> {

        /* compiled from: SingleProcessDataStore.kt */
        public static final class a<T> extends b<T> {

            /* renamed from: a  reason: collision with root package name */
            private final d<T> f9795a;

            public a(d<T> dVar) {
                super((i) null);
                this.f9795a = dVar;
            }

            public d<T> a() {
                return this.f9795a;
            }
        }

        /* renamed from: androidx.datastore.core.SingleProcessDataStore$b$b  reason: collision with other inner class name */
        /* compiled from: SingleProcessDataStore.kt */
        public static final class C0055b<T> extends b<T> {

            /* renamed from: a  reason: collision with root package name */
            private final p<T, fp0.c<? super T>, Object> f9796a;

            /* renamed from: b  reason: collision with root package name */
            private final w<T> f9797b;

            /* renamed from: c  reason: collision with root package name */
            private final d<T> f9798c;

            /* renamed from: d  reason: collision with root package name */
            private final CoroutineContext f9799d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0055b(p<? super T, ? super fp0.c<? super T>, ? extends Object> pVar, w<T> wVar, d<T> dVar, CoroutineContext coroutineContext) {
                super((i) null);
                kotlin.jvm.internal.p.j(pVar, "transform");
                kotlin.jvm.internal.p.j(wVar, "ack");
                kotlin.jvm.internal.p.j(coroutineContext, "callerContext");
                this.f9796a = pVar;
                this.f9797b = wVar;
                this.f9798c = dVar;
                this.f9799d = coroutineContext;
            }

            public final w<T> a() {
                return this.f9797b;
            }

            public final CoroutineContext b() {
                return this.f9799d;
            }

            public d<T> c() {
                return this.f9798c;
            }

            public final p<T, fp0.c<? super T>, Object> d() {
                return this.f9796a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    private static final class c extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final FileOutputStream f9800a;

        public c(FileOutputStream fileOutputStream) {
            kotlin.jvm.internal.p.j(fileOutputStream, "fileOutputStream");
            this.f9800a = fileOutputStream;
        }

        public void close() {
        }

        public void flush() {
            this.f9800a.flush();
        }

        public void write(int i11) {
            this.f9800a.write(i11);
        }

        public void write(byte[] bArr) {
            kotlin.jvm.internal.p.j(bArr, "b");
            this.f9800a.write(bArr);
        }

        public void write(byte[] bArr, int i11, int i12) {
            kotlin.jvm.internal.p.j(bArr, "bytes");
            this.f9800a.write(bArr, i11, i12);
        }
    }

    public SingleProcessDataStore(lp0.a<? extends File> aVar, f<T> fVar, List<? extends p<? super e<T>, ? super fp0.c<? super k>, ? extends Object>> list, y2.a<T> aVar2, j0 j0Var) {
        kotlin.jvm.internal.p.j(aVar, "produceFile");
        kotlin.jvm.internal.p.j(fVar, "serializer");
        kotlin.jvm.internal.p.j(list, "initTasksList");
        kotlin.jvm.internal.p.j(aVar2, "corruptionHandler");
        kotlin.jvm.internal.p.j(j0Var, "scope");
        this.f9776a = aVar;
        this.f9777b = fVar;
        this.f9778c = aVar2;
        this.f9779d = j0Var;
        this.f9784i = s.E0(list);
        this.j = new SimpleActor<>(j0Var, new SingleProcessDataStore$actor$1(this), SingleProcessDataStore$actor$2.f9791a, new SingleProcessDataStore$actor$3(this, (fp0.c<? super SingleProcessDataStore$actor$3>) null));
    }

    private final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(kotlin.jvm.internal.p.s("Unable to create parent directories of ", file));
            }
        }
    }

    /* access modifiers changed from: private */
    public final File q() {
        return (File) this.f9782g.getValue();
    }

    /* access modifiers changed from: private */
    public final Object r(b.a<T> aVar, fp0.c<? super k> cVar) {
        d<T> value = this.f9783h.getValue();
        if (!(value instanceof a)) {
            if (value instanceof c) {
                if (value == aVar.a()) {
                    Object v = v(cVar);
                    return v == b.d() ? v : k.f22762a;
                }
            } else if (kotlin.jvm.internal.p.e(value, e.f9875a)) {
                Object v11 = v(cVar);
                return v11 == b.d() ? v11 : k.f22762a;
            } else if (value instanceof b) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return k.f22762a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(androidx.datastore.core.SingleProcessDataStore.b.C0055b<T> r9, fp0.c<? super bp0.k> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.SingleProcessDataStore$handleUpdate$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.datastore.core.SingleProcessDataStore$handleUpdate$1 r0 = (androidx.datastore.core.SingleProcessDataStore$handleUpdate$1) r0
            int r1 = r0.f9813f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9813f = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$handleUpdate$1 r0 = new androidx.datastore.core.SingleProcessDataStore$handleUpdate$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f9811d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f9813f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r9 = r0.f9808a
            wp0.w r9 = (wp0.w) r9
            goto L_0x004e
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.f9810c
            wp0.w r9 = (wp0.w) r9
            java.lang.Object r2 = r0.f9809b
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            java.lang.Object r4 = r0.f9808a
            androidx.datastore.core.SingleProcessDataStore$b$b r4 = (androidx.datastore.core.SingleProcessDataStore.b.C0055b) r4
            bp0.g.b(r10)     // Catch:{ all -> 0x0052 }
            r10 = r9
            r9 = r4
            goto L_0x00a0
        L_0x004a:
            java.lang.Object r9 = r0.f9808a
            wp0.w r9 = (wp0.w) r9
        L_0x004e:
            bp0.g.b(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00b8
        L_0x0052:
            r10 = move-exception
            goto L_0x00d9
        L_0x0055:
            bp0.g.b(r10)
            wp0.w r10 = r9.a()
            kotlin.Result$a r2 = kotlin.Result.f25582b     // Catch:{ all -> 0x00d5 }
            kotlinx.coroutines.flow.i<androidx.datastore.core.d<T>> r2 = r8.f9783h     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00d5 }
            androidx.datastore.core.d r2 = (androidx.datastore.core.d) r2     // Catch:{ all -> 0x00d5 }
            boolean r6 = r2 instanceof androidx.datastore.core.a     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0081
            lp0.p r2 = r9.d()     // Catch:{ all -> 0x00d5 }
            kotlin.coroutines.CoroutineContext r9 = r9.b()     // Catch:{ all -> 0x00d5 }
            r0.f9808a = r10     // Catch:{ all -> 0x00d5 }
            r0.f9813f = r5     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r8.y(r2, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00b8
        L_0x0081:
            boolean r6 = r2 instanceof androidx.datastore.core.c     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            boolean r5 = r2 instanceof androidx.datastore.core.e     // Catch:{ all -> 0x00d5 }
        L_0x0088:
            if (r5 == 0) goto L_0x00c4
            androidx.datastore.core.d r5 = r9.c()     // Catch:{ all -> 0x00d5 }
            if (r2 != r5) goto L_0x00bd
            r0.f9808a = r9     // Catch:{ all -> 0x00d5 }
            r0.f9809b = r8     // Catch:{ all -> 0x00d5 }
            r0.f9810c = r10     // Catch:{ all -> 0x00d5 }
            r0.f9813f = r4     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r8.u(r0)     // Catch:{ all -> 0x00d5 }
            if (r2 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r2 = r8
        L_0x00a0:
            lp0.p r4 = r9.d()     // Catch:{ all -> 0x00d5 }
            kotlin.coroutines.CoroutineContext r9 = r9.b()     // Catch:{ all -> 0x00d5 }
            r0.f9808a = r10     // Catch:{ all -> 0x00d5 }
            r5 = 0
            r0.f9809b = r5     // Catch:{ all -> 0x00d5 }
            r0.f9810c = r5     // Catch:{ all -> 0x00d5 }
            r0.f9813f = r3     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r2.y(r4, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x00b8:
            java.lang.Object r10 = kotlin.Result.b(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00e3
        L_0x00bd:
            androidx.datastore.core.c r2 = (androidx.datastore.core.c) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00c4:
            boolean r9 = r2 instanceof androidx.datastore.core.b     // Catch:{ all -> 0x00d5 }
            if (r9 == 0) goto L_0x00cf
            androidx.datastore.core.b r2 = (androidx.datastore.core.b) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00cf:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00d5 }
            r9.<init>()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00d9:
            kotlin.Result$a r0 = kotlin.Result.f25582b
            java.lang.Object r10 = bp0.g.a(r10)
            java.lang.Object r10 = kotlin.Result.b(r10)
        L_0x00e3:
            wp0.y.c(r9, r10)
            bp0.k r9 = bp0.k.f22762a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.s(androidx.datastore.core.SingleProcessDataStore$b$b, fp0.c):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(fp0.c<? super bp0.k> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInit$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.datastore.core.SingleProcessDataStore$readAndInit$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInit$1) r0
            int r1 = r0.f9822i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9822i = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInit$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f9820g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f9822i
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x007b
            if (r2 == r6) goto L_0x0067
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r1 = r0.f9817d
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.c) r1
            java.lang.Object r2 = r0.f9816c
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref$BooleanRef) r2
            java.lang.Object r3 = r0.f9815b
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
            java.lang.Object r0 = r0.f9814a
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            bp0.g.b(r14)
            goto L_0x0117
        L_0x0042:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x004a:
            java.lang.Object r2 = r0.f9819f
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r8 = r0.f9818e
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1 r8 = (androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1) r8
            java.lang.Object r9 = r0.f9817d
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r10 = r0.f9816c
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r0.f9815b
            kotlinx.coroutines.sync.c r11 = (kotlinx.coroutines.sync.c) r11
            java.lang.Object r12 = r0.f9814a
            androidx.datastore.core.SingleProcessDataStore r12 = (androidx.datastore.core.SingleProcessDataStore) r12
            bp0.g.b(r14)
            goto L_0x00d8
        L_0x0067:
            java.lang.Object r2 = r0.f9817d
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r8 = r0.f9816c
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
            java.lang.Object r9 = r0.f9815b
            kotlinx.coroutines.sync.c r9 = (kotlinx.coroutines.sync.c) r9
            java.lang.Object r10 = r0.f9814a
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            bp0.g.b(r14)
            goto L_0x00b8
        L_0x007b:
            bp0.g.b(r14)
            kotlinx.coroutines.flow.i<androidx.datastore.core.d<T>> r14 = r13.f9783h
            java.lang.Object r14 = r14.getValue()
            androidx.datastore.core.e r2 = androidx.datastore.core.e.f9875a
            boolean r14 = kotlin.jvm.internal.p.e(r14, r2)
            if (r14 != 0) goto L_0x0099
            kotlinx.coroutines.flow.i<androidx.datastore.core.d<T>> r14 = r13.f9783h
            java.lang.Object r14 = r14.getValue()
            boolean r14 = r14 instanceof androidx.datastore.core.c
            if (r14 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r14 = 0
            goto L_0x009a
        L_0x0099:
            r14 = 1
        L_0x009a:
            if (r14 == 0) goto L_0x0136
            kotlinx.coroutines.sync.c r9 = kotlinx.coroutines.sync.d.b(r5, r6, r7)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r0.f9814a = r13
            r0.f9815b = r9
            r0.f9816c = r2
            r0.f9817d = r2
            r0.f9822i = r6
            java.lang.Object r14 = r13.x(r0)
            if (r14 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r10 = r13
            r8 = r2
        L_0x00b8:
            r2.f25666a = r14
            kotlin.jvm.internal.Ref$BooleanRef r14 = new kotlin.jvm.internal.Ref$BooleanRef
            r14.<init>()
            androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1 r2 = new androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1
            r2.<init>(r9, r14, r8, r10)
            java.util.List<? extends lp0.p<? super y2.e<T>, ? super fp0.c<? super bp0.k>, ? extends java.lang.Object>> r11 = r10.f9784i
            if (r11 != 0) goto L_0x00ce
            r2 = r1
            r1 = r9
            r9 = r14
            r14 = r0
            r0 = r10
            goto L_0x00fe
        L_0x00ce:
            java.util.Iterator r11 = r11.iterator()
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r11
            r11 = r9
            r9 = r14
        L_0x00d8:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00f9
            java.lang.Object r14 = r2.next()
            lp0.p r14 = (lp0.p) r14
            r0.f9814a = r12
            r0.f9815b = r11
            r0.f9816c = r10
            r0.f9817d = r9
            r0.f9818e = r8
            r0.f9819f = r2
            r0.f9822i = r4
            java.lang.Object r14 = r14.invoke(r8, r0)
            if (r14 != r1) goto L_0x00d8
            return r1
        L_0x00f9:
            r14 = r0
            r2 = r1
            r8 = r10
            r1 = r11
            r0 = r12
        L_0x00fe:
            r0.f9784i = r7
            r14.f9814a = r0
            r14.f9815b = r8
            r14.f9816c = r9
            r14.f9817d = r1
            r14.f9818e = r7
            r14.f9819f = r7
            r14.f9822i = r3
            java.lang.Object r14 = r1.a(r7, r14)
            if (r14 != r2) goto L_0x0115
            return r2
        L_0x0115:
            r3 = r8
            r2 = r9
        L_0x0117:
            r2.f25661a = r6     // Catch:{ all -> 0x0131 }
            bp0.k r14 = bp0.k.f22762a     // Catch:{ all -> 0x0131 }
            r1.c(r7)
            kotlinx.coroutines.flow.i<androidx.datastore.core.d<T>> r0 = r0.f9783h
            androidx.datastore.core.a r1 = new androidx.datastore.core.a
            T r2 = r3.f25666a
            if (r2 == 0) goto L_0x012a
            int r5 = r2.hashCode()
        L_0x012a:
            r1.<init>(r2, r5)
            r0.setValue(r1)
            return r14
        L_0x0131:
            r14 = move-exception
            r1.c(r7)
            throw r14
        L_0x0136:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.t(fp0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(fp0.c<? super bp0.k> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.f9838d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9838d = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f9836b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f9838d
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f9835a
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            bp0.g.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r5 = move-exception
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            bp0.g.b(r5)
            r0.f9835a = r4     // Catch:{ all -> 0x0048 }
            r0.f9838d = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r4.t(r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            bp0.k r5 = bp0.k.f22762a
            return r5
        L_0x0048:
            r5 = move-exception
            r0 = r4
        L_0x004a:
            kotlinx.coroutines.flow.i<androidx.datastore.core.d<T>> r0 = r0.f9783h
            androidx.datastore.core.c r1 = new androidx.datastore.core.c
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.u(fp0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(fp0.c<? super bp0.k> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1) r0
            int r1 = r0.f9842d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9842d = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f9840b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f9842d
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f9839a
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            bp0.g.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0051
        L_0x002d:
            r5 = move-exception
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            bp0.g.b(r5)
            r0.f9839a = r4     // Catch:{ all -> 0x0045 }
            r0.f9842d = r3     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r4.t(r0)     // Catch:{ all -> 0x0045 }
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0045:
            r5 = move-exception
            r0 = r4
        L_0x0047:
            kotlinx.coroutines.flow.i<androidx.datastore.core.d<T>> r0 = r0.f9783h
            androidx.datastore.core.c r1 = new androidx.datastore.core.c
            r1.<init>(r5)
            r0.setValue(r1)
        L_0x0051:
            bp0.k r5 = bp0.k.f22762a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.v(fp0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        jp0.b.a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:24:0x0064, B:30:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(fp0.c<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore$readData$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readData$1) r0
            int r1 = r0.f9848f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9848f = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readData$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f9846d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f9848f
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f9845c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f9844b
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f9843a
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            bp0.g.b(r6)     // Catch:{ all -> 0x0035 }
            goto L_0x0064
        L_0x0035:
            r6 = move-exception
            goto L_0x006c
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003f:
            bp0.g.b(r6)
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0072 }
            java.io.File r2 = r5.q()     // Catch:{ FileNotFoundException -> 0x0072 }
            r6.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0072 }
            java.io.FileInputStream r2 = io.sentry.instrumentation.file.h.b.a(r6, r2)     // Catch:{ FileNotFoundException -> 0x0072 }
            r6 = 0
            y2.f<T> r4 = r5.f9777b     // Catch:{ all -> 0x006a }
            r0.f9843a = r5     // Catch:{ all -> 0x006a }
            r0.f9844b = r2     // Catch:{ all -> 0x006a }
            r0.f9845c = r6     // Catch:{ all -> 0x006a }
            r0.f9848f = r3     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r4.b(r2, r0)     // Catch:{ all -> 0x006a }
            if (r0 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r1 = r6
            r6 = r0
            r0 = r5
        L_0x0064:
            jp0.b.a(r2, r1)     // Catch:{ FileNotFoundException -> 0x0068 }
            return r6
        L_0x0068:
            r6 = move-exception
            goto L_0x0074
        L_0x006a:
            r6 = move-exception
            r0 = r5
        L_0x006c:
            throw r6     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            jp0.b.a(r2, r6)     // Catch:{ FileNotFoundException -> 0x0068 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0068 }
        L_0x0072:
            r6 = move-exception
            r0 = r5
        L_0x0074:
            java.io.File r1 = r0.q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0085
            y2.f<T> r6 = r0.f9777b
            java.lang.Object r6 = r6.getDefaultValue()
            return r6
        L_0x0085:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.w(fp0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(fp0.c<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = (androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1) r0
            int r1 = r0.f9853e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9853e = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 r0 = new androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f9851c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f9853e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f9850b
            java.lang.Object r0 = r0.f9849a
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            bp0.g.b(r8)     // Catch:{ IOException -> 0x0035 }
            goto L_0x0087
        L_0x0035:
            r8 = move-exception
            goto L_0x008a
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            java.lang.Object r2 = r0.f9850b
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.f9849a
            androidx.datastore.core.SingleProcessDataStore r4 = (androidx.datastore.core.SingleProcessDataStore) r4
            bp0.g.b(r8)
            goto L_0x0079
        L_0x004b:
            java.lang.Object r2 = r0.f9849a
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            bp0.g.b(r8)     // Catch:{ CorruptionException -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r8 = move-exception
            goto L_0x0066
        L_0x0055:
            bp0.g.b(r8)
            r0.f9849a = r7     // Catch:{ CorruptionException -> 0x0064 }
            r0.f9853e = r5     // Catch:{ CorruptionException -> 0x0064 }
            java.lang.Object r8 = r7.w(r0)     // Catch:{ CorruptionException -> 0x0064 }
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r8
        L_0x0064:
            r8 = move-exception
            r2 = r7
        L_0x0066:
            y2.a<T> r5 = r2.f9778c
            r0.f9849a = r2
            r0.f9850b = r8
            r0.f9853e = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L_0x0079:
            r0.f9849a = r2     // Catch:{ IOException -> 0x0088 }
            r0.f9850b = r8     // Catch:{ IOException -> 0x0088 }
            r0.f9853e = r3     // Catch:{ IOException -> 0x0088 }
            java.lang.Object r0 = r4.z(r8, r0)     // Catch:{ IOException -> 0x0088 }
            if (r0 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r1 = r8
        L_0x0087:
            return r1
        L_0x0088:
            r8 = move-exception
            r0 = r2
        L_0x008a:
            bp0.b.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.x(fp0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(lp0.p<? super T, ? super fp0.c<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.CoroutineContext r9, fp0.c<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = (androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1) r0
            int r1 = r0.f9859f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9859f = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 r0 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f9857d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f9859f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r8 = r0.f9855b
            java.lang.Object r9 = r0.f9854a
            androidx.datastore.core.SingleProcessDataStore r9 = (androidx.datastore.core.SingleProcessDataStore) r9
            bp0.g.b(r10)
            goto L_0x008e
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.f9856c
            java.lang.Object r9 = r0.f9855b
            androidx.datastore.core.a r9 = (androidx.datastore.core.a) r9
            java.lang.Object r2 = r0.f9854a
            androidx.datastore.core.SingleProcessDataStore r2 = (androidx.datastore.core.SingleProcessDataStore) r2
            bp0.g.b(r10)
            goto L_0x0073
        L_0x0049:
            bp0.g.b(r10)
            kotlinx.coroutines.flow.i<androidx.datastore.core.d<T>> r10 = r7.f9783h
            java.lang.Object r10 = r10.getValue()
            androidx.datastore.core.a r10 = (androidx.datastore.core.a) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1 r6 = new androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1
            r6.<init>(r8, r2, r3)
            r0.f9854a = r7
            r0.f9855b = r10
            r0.f9856c = r2
            r0.f9859f = r5
            java.lang.Object r8 = wp0.h.g(r9, r6, r0)
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L_0x0073:
            r9.a()
            boolean r9 = kotlin.jvm.internal.p.e(r8, r10)
            if (r9 == 0) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            r0.f9854a = r2
            r0.f9855b = r10
            r0.f9856c = r3
            r0.f9859f = r4
            java.lang.Object r8 = r2.z(r10, r0)
            if (r8 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r8 = r10
            r9 = r2
        L_0x008e:
            kotlinx.coroutines.flow.i<androidx.datastore.core.d<T>> r9 = r9.f9783h
            androidx.datastore.core.a r10 = new androidx.datastore.core.a
            if (r8 == 0) goto L_0x0099
            int r0 = r8.hashCode()
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        L_0x00a0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.y(lp0.p, kotlin.coroutines.CoroutineContext, fp0.c):java.lang.Object");
    }

    public Object a(p<? super T, ? super fp0.c<? super T>, ? extends Object> pVar, fp0.c<? super T> cVar) {
        w b11 = y.b((k1) null, 1, (Object) null);
        this.j.e(new b.C0055b(pVar, b11, this.f9783h.getValue(), cVar.getContext()));
        return b11.Q(cVar);
    }

    public d<T> getData() {
        return this.f9780e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c3, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        jp0.b.a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c7, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x0096, B:34:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3 A[Catch:{ all -> 0x00c3, IOException -> 0x00c8 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4 A[Catch:{ all -> 0x00c3, IOException -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(T r8, fp0.c<? super bp0.k> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessDataStore$writeData$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = (androidx.datastore.core.SingleProcessDataStore$writeData$1) r0
            int r1 = r0.f9870h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9870h = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.SingleProcessDataStore$writeData$1 r0 = new androidx.datastore.core.SingleProcessDataStore$writeData$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f9868f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f9870h
            r3 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r8 = r0.f9867e
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f9866d
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f9865c
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f9864b
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f9863a
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            bp0.g.b(r9)     // Catch:{ all -> 0x003d }
            goto L_0x008d
        L_0x003d:
            r8 = move-exception
            goto L_0x00c2
        L_0x0040:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0048:
            bp0.g.b(r9)
            java.io.File r9 = r7.q()
            r7.p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.q()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f9781f
            java.lang.String r2 = kotlin.jvm.internal.p.s(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00cb }
            r2.<init>(r9)     // Catch:{ IOException -> 0x00cb }
            java.io.FileOutputStream r2 = io.sentry.instrumentation.file.l.b.a(r2, r9)     // Catch:{ IOException -> 0x00cb }
            r4 = 0
            y2.f<T> r5 = r7.f9777b     // Catch:{ all -> 0x00c0 }
            androidx.datastore.core.SingleProcessDataStore$c r6 = new androidx.datastore.core.SingleProcessDataStore$c     // Catch:{ all -> 0x00c0 }
            r6.<init>(r2)     // Catch:{ all -> 0x00c0 }
            r0.f9863a = r7     // Catch:{ all -> 0x00c0 }
            r0.f9864b = r9     // Catch:{ all -> 0x00c0 }
            r0.f9865c = r2     // Catch:{ all -> 0x00c0 }
            r0.f9866d = r4     // Catch:{ all -> 0x00c0 }
            r0.f9867e = r2     // Catch:{ all -> 0x00c0 }
            r0.f9870h = r3     // Catch:{ all -> 0x00c0 }
            java.lang.Object r8 = r5.a(r8, r6, r0)     // Catch:{ all -> 0x00c0 }
            if (r8 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r4
        L_0x008d:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch:{ all -> 0x003d }
            r8.sync()     // Catch:{ all -> 0x003d }
            bp0.k r8 = bp0.k.f22762a     // Catch:{ all -> 0x003d }
            jp0.b.a(r2, r1)     // Catch:{ IOException -> 0x00c8 }
            java.io.File r9 = r0.q()     // Catch:{ IOException -> 0x00c8 }
            boolean r9 = r3.renameTo(r9)     // Catch:{ IOException -> 0x00c8 }
            if (r9 == 0) goto L_0x00a4
            return r8
        L_0x00a4:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x00c8 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c8 }
            r9.<init>()     // Catch:{ IOException -> 0x00c8 }
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch:{ IOException -> 0x00c8 }
            r9.append(r3)     // Catch:{ IOException -> 0x00c8 }
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch:{ IOException -> 0x00c8 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x00c8 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00c8 }
            throw r8     // Catch:{ IOException -> 0x00c8 }
        L_0x00c0:
            r8 = move-exception
            r3 = r9
        L_0x00c2:
            throw r8     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r9 = move-exception
            jp0.b.a(r2, r8)     // Catch:{ IOException -> 0x00c8 }
            throw r9     // Catch:{ IOException -> 0x00c8 }
        L_0x00c8:
            r8 = move-exception
            r9 = r3
            goto L_0x00cc
        L_0x00cb:
            r8 = move-exception
        L_0x00cc:
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x00d5
            r9.delete()
        L_0x00d5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.z(java.lang.Object, fp0.c):java.lang.Object");
    }
}
