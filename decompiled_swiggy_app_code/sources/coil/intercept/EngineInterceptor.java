package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c7.q;
import coil.ImageLoader;
import coil.decode.DataSource;
import java.util.List;
import kotlin.jvm.internal.i;
import v6.c;
import wp0.h;
import x6.g;
import x6.k;
import x6.m;

/* compiled from: EngineInterceptor.kt */
public final class EngineInterceptor implements s6.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f13565e = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final ImageLoader f13566a;

    /* renamed from: b  reason: collision with root package name */
    private final m f13567b;

    /* renamed from: c  reason: collision with root package name */
    private final q f13568c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final c f13569d;

    /* compiled from: EngineInterceptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: EngineInterceptor.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable f13570a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f13571b;

        /* renamed from: c  reason: collision with root package name */
        private final DataSource f13572c;

        /* renamed from: d  reason: collision with root package name */
        private final String f13573d;

        public b(Drawable drawable, boolean z11, DataSource dataSource, String str) {
            this.f13570a = drawable;
            this.f13571b = z11;
            this.f13572c = dataSource;
            this.f13573d = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z11, DataSource dataSource, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                drawable = bVar.f13570a;
            }
            if ((i11 & 2) != 0) {
                z11 = bVar.f13571b;
            }
            if ((i11 & 4) != 0) {
                dataSource = bVar.f13572c;
            }
            if ((i11 & 8) != 0) {
                str = bVar.f13573d;
            }
            return bVar.a(drawable, z11, dataSource, str);
        }

        public final b a(Drawable drawable, boolean z11, DataSource dataSource, String str) {
            return new b(drawable, z11, dataSource, str);
        }

        public final DataSource c() {
            return this.f13572c;
        }

        public final String d() {
            return this.f13573d;
        }

        public final Drawable e() {
            return this.f13570a;
        }

        public final boolean f() {
            return this.f13571b;
        }
    }

    public EngineInterceptor(ImageLoader imageLoader, m mVar, q qVar) {
        this.f13566a = imageLoader;
        this.f13567b = mVar;
        this.f13568c = qVar;
        this.f13569d = new c(imageLoader, mVar, qVar);
    }

    /* access modifiers changed from: private */
    public final Bitmap g(Drawable drawable, k kVar, List<? extends a7.a> list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config c11 = c7.a.c(bitmap);
            if (ArraysKt___ArraysKt.G(c7.i.o(), c11)) {
                return bitmap;
            }
            q qVar = this.f13568c;
            if (qVar != null && qVar.getLevel() <= 4) {
                qVar.a("EngineInterceptor", 4, "Converting bitmap with config " + c11 + " to apply transformations: " + list + '.', (Throwable) null);
            }
        } else {
            q qVar2 = this.f13568c;
            if (qVar2 != null && qVar2.getLevel() <= 4) {
                qVar2.a("EngineInterceptor", 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + list + '.', (Throwable) null);
            }
        }
        return c7.k.f12862a.a(drawable, kVar.f(), kVar.n(), kVar.m(), kVar.c());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(r6.k r17, m6.b r18, x6.g r19, java.lang.Object r20, x6.k r21, m6.c r22, fp0.c<? super coil.intercept.EngineInterceptor.b> r23) {
        /*
            r16 = this;
            r0 = r23
            boolean r1 = r0 instanceof coil.intercept.EngineInterceptor$decode$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            coil.intercept.EngineInterceptor$decode$1 r1 = (coil.intercept.EngineInterceptor$decode$1) r1
            int r2 = r1.f13583l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f13583l = r2
            r2 = r16
            goto L_0x001e
        L_0x0017:
            coil.intercept.EngineInterceptor$decode$1 r1 = new coil.intercept.EngineInterceptor$decode$1
            r2 = r16
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.j
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.d()
            int r4 = r1.f13583l
            r5 = 1
            if (r4 == 0) goto L_0x005f
            if (r4 != r5) goto L_0x0057
            int r4 = r1.f13582i
            java.lang.Object r6 = r1.f13581h
            o6.e r6 = (o6.e) r6
            java.lang.Object r7 = r1.f13580g
            m6.c r7 = (m6.c) r7
            java.lang.Object r8 = r1.f13579f
            x6.k r8 = (x6.k) r8
            java.lang.Object r9 = r1.f13578e
            java.lang.Object r10 = r1.f13577d
            x6.g r10 = (x6.g) r10
            java.lang.Object r11 = r1.f13576c
            m6.b r11 = (m6.b) r11
            java.lang.Object r12 = r1.f13575b
            r6.k r12 = (r6.k) r12
            java.lang.Object r13 = r1.f13574a
            coil.intercept.EngineInterceptor r13 = (coil.intercept.EngineInterceptor) r13
            bp0.g.b(r0)
            r14 = r10
            r10 = r1
            r1 = r11
            r11 = r3
            r3 = r14
            r15 = r9
            r9 = r4
            r4 = r15
            goto L_0x00b3
        L_0x0057:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005f:
            bp0.g.b(r0)
            r0 = 0
            r0 = r17
            r4 = r20
            r6 = r21
            r7 = r22
            r9 = r1
            r13 = r2
            r10 = r3
            r8 = 0
            r1 = r18
            r3 = r19
        L_0x0073:
            coil.ImageLoader r11 = r13.f13566a
            kotlin.Pair r8 = r1.i(r0, r6, r11, r8)
            if (r8 == 0) goto L_0x00e6
            java.lang.Object r11 = r8.c()
            o6.e r11 = (o6.e) r11
            java.lang.Object r8 = r8.d()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r8 = r8 + r5
            r7.k(r3, r11, r6)
            r9.f13574a = r13
            r9.f13575b = r0
            r9.f13576c = r1
            r9.f13577d = r3
            r9.f13578e = r4
            r9.f13579f = r6
            r9.f13580g = r7
            r9.f13581h = r11
            r9.f13582i = r8
            r9.f13583l = r5
            java.lang.Object r12 = r11.a(r9)
            if (r12 != r10) goto L_0x00aa
            return r10
        L_0x00aa:
            r14 = r12
            r12 = r0
            r0 = r14
            r15 = r8
            r8 = r6
            r6 = r11
            r11 = r10
            r10 = r9
            r9 = r15
        L_0x00b3:
            o6.c r0 = (o6.c) r0
            r7.r(r3, r6, r8, r0)
            if (r0 == 0) goto L_0x00e0
            coil.intercept.EngineInterceptor$b r1 = new coil.intercept.EngineInterceptor$b
            android.graphics.drawable.Drawable r3 = r0.a()
            boolean r0 = r0.b()
            coil.decode.DataSource r4 = r12.a()
            o6.k r5 = r12.b()
            boolean r6 = r5 instanceof o6.j
            r7 = 0
            if (r6 == 0) goto L_0x00d4
            o6.j r5 = (o6.j) r5
            goto L_0x00d5
        L_0x00d4:
            r5 = r7
        L_0x00d5:
            if (r5 != 0) goto L_0x00d8
            goto L_0x00dc
        L_0x00d8:
            java.lang.String r7 = r5.g()
        L_0x00dc:
            r1.<init>(r3, r0, r4, r7)
            return r1
        L_0x00e0:
            r6 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r0 = r12
            goto L_0x0073
        L_0x00e6:
            java.lang.String r0 = "Unable to create a decoder that supports: "
            java.lang.String r0 = kotlin.jvm.internal.p.s(r0, r4)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.h(r6.k, m6.b, x6.g, java.lang.Object, x6.k, m6.c, fp0.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: r6.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015c A[Catch:{ all -> 0x0216 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019c A[SYNTHETIC, Splitter:B:53:0x019c] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(x6.g r36, java.lang.Object r37, x6.k r38, m6.c r39, fp0.c<? super coil.intercept.EngineInterceptor.b> r40) {
        /*
            r35 = this;
            r8 = r35
            r0 = r40
            boolean r1 = r0 instanceof coil.intercept.EngineInterceptor$execute$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            coil.intercept.EngineInterceptor$execute$1 r1 = (coil.intercept.EngineInterceptor$execute$1) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.k = r2
            goto L_0x001c
        L_0x0017:
            coil.intercept.EngineInterceptor$execute$1 r1 = new coil.intercept.EngineInterceptor$execute$1
            r1.<init>(r8, r0)
        L_0x001c:
            r0 = r1
            java.lang.Object r1 = r0.f13592i
            java.lang.Object r9 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.k
            r10 = 3
            r11 = 2
            r3 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0087
            if (r2 == r3) goto L_0x005a
            if (r2 == r11) goto L_0x003e
            if (r2 != r10) goto L_0x0036
            bp0.g.b(r1)
            goto L_0x01f5
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            java.lang.Object r2 = r0.f13588e
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r3 = r0.f13587d
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
            java.lang.Object r4 = r0.f13586c
            m6.c r4 = (m6.c) r4
            java.lang.Object r5 = r0.f13585b
            x6.g r5 = (x6.g) r5
            java.lang.Object r6 = r0.f13584a
            coil.intercept.EngineInterceptor r6 = (coil.intercept.EngineInterceptor) r6
            bp0.g.b(r1)     // Catch:{ all -> 0x0057 }
            goto L_0x0190
        L_0x0057:
            r0 = move-exception
            goto L_0x0218
        L_0x005a:
            java.lang.Object r2 = r0.f13591h
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r3 = r0.f13590g
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
            java.lang.Object r4 = r0.f13589f
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r0.f13588e
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            java.lang.Object r6 = r0.f13587d
            m6.c r6 = (m6.c) r6
            java.lang.Object r7 = r0.f13586c
            java.lang.Object r13 = r0.f13585b
            x6.g r13 = (x6.g) r13
            java.lang.Object r14 = r0.f13584a
            coil.intercept.EngineInterceptor r14 = (coil.intercept.EngineInterceptor) r14
            bp0.g.b(r1)     // Catch:{ all -> 0x0083 }
            r15 = r3
            r19 = r4
            r3 = r5
            r21 = r7
            goto L_0x0151
        L_0x0083:
            r0 = move-exception
            r2 = r3
            goto L_0x0218
        L_0x0087:
            bp0.g.b(r1)
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            r1 = r38
            r13.f25666a = r1
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            coil.ImageLoader r1 = r8.f13566a
            m6.b r1 = r1.getComponents()
            r14.f25666a = r1
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
            r15.<init>()
            x6.m r1 = r8.f13567b     // Catch:{ all -> 0x0216 }
            T r2 = r13.f25666a     // Catch:{ all -> 0x0216 }
            x6.k r2 = (x6.k) r2     // Catch:{ all -> 0x0216 }
            boolean r1 = r1.a(r2)     // Catch:{ all -> 0x0216 }
            if (r1 != 0) goto L_0x00df
            T r1 = r13.f25666a     // Catch:{ all -> 0x0216 }
            r16 = r1
            x6.k r16 = (x6.k) r16     // Catch:{ all -> 0x0216 }
            r17 = 0
            android.graphics.Bitmap$Config r18 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0216 }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 32765(0x7ffd, float:4.5914E-41)
            r33 = 0
            x6.k r1 = x6.k.b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0216 }
            r13.f25666a = r1     // Catch:{ all -> 0x0216 }
        L_0x00df:
            kotlin.Pair r1 = r36.w()     // Catch:{ all -> 0x0216 }
            if (r1 != 0) goto L_0x00eb
            o6.e$a r1 = r36.o()     // Catch:{ all -> 0x0216 }
            if (r1 == 0) goto L_0x0114
        L_0x00eb:
            T r1 = r14.f25666a     // Catch:{ all -> 0x0216 }
            m6.b r1 = (m6.b) r1     // Catch:{ all -> 0x0216 }
            m6.b$a r1 = r1.h()     // Catch:{ all -> 0x0216 }
            kotlin.Pair r2 = r36.w()     // Catch:{ all -> 0x0216 }
            r4 = 0
            if (r2 == 0) goto L_0x0101
            java.util.List r5 = r1.g()     // Catch:{ all -> 0x0216 }
            r5.add(r4, r2)     // Catch:{ all -> 0x0216 }
        L_0x0101:
            o6.e$a r2 = r36.o()     // Catch:{ all -> 0x0216 }
            if (r2 == 0) goto L_0x010e
            java.util.List r5 = r1.f()     // Catch:{ all -> 0x0216 }
            r5.add(r4, r2)     // Catch:{ all -> 0x0216 }
        L_0x010e:
            m6.b r1 = r1.e()     // Catch:{ all -> 0x0216 }
            r14.f25666a = r1     // Catch:{ all -> 0x0216 }
        L_0x0114:
            T r1 = r14.f25666a     // Catch:{ all -> 0x0216 }
            r2 = r1
            m6.b r2 = (m6.b) r2     // Catch:{ all -> 0x0216 }
            T r1 = r13.f25666a     // Catch:{ all -> 0x0216 }
            r5 = r1
            x6.k r5 = (x6.k) r5     // Catch:{ all -> 0x0216 }
            r0.f13584a = r8     // Catch:{ all -> 0x0216 }
            r7 = r36
            r0.f13585b = r7     // Catch:{ all -> 0x0216 }
            r6 = r37
            r0.f13586c = r6     // Catch:{ all -> 0x0216 }
            r4 = r39
            r0.f13587d = r4     // Catch:{ all -> 0x0216 }
            r0.f13588e = r13     // Catch:{ all -> 0x0216 }
            r0.f13589f = r14     // Catch:{ all -> 0x0216 }
            r0.f13590g = r15     // Catch:{ all -> 0x0216 }
            r0.f13591h = r15     // Catch:{ all -> 0x0216 }
            r0.k = r3     // Catch:{ all -> 0x0216 }
            r1 = r35
            r3 = r36
            r4 = r37
            r6 = r39
            r7 = r0
            java.lang.Object r1 = r1.j(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0216 }
            if (r1 != r9) goto L_0x0146
            return r9
        L_0x0146:
            r21 = r37
            r6 = r39
            r3 = r13
            r19 = r14
            r2 = r15
            r13 = r36
            r14 = r8
        L_0x0151:
            r2.f25666a = r1     // Catch:{ all -> 0x0216 }
            T r1 = r15.f25666a     // Catch:{ all -> 0x0216 }
            r2 = r1
            r6.g r2 = (r6.g) r2     // Catch:{ all -> 0x0216 }
            boolean r4 = r2 instanceof r6.k     // Catch:{ all -> 0x0216 }
            if (r4 == 0) goto L_0x019c
            kotlinx.coroutines.CoroutineDispatcher r1 = r13.n()     // Catch:{ all -> 0x0216 }
            coil.intercept.EngineInterceptor$execute$executeResult$1 r2 = new coil.intercept.EngineInterceptor$execute$executeResult$1     // Catch:{ all -> 0x0216 }
            r24 = 0
            r16 = r2
            r17 = r14
            r18 = r15
            r20 = r13
            r22 = r3
            r23 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0216 }
            r0.f13584a = r14     // Catch:{ all -> 0x0216 }
            r0.f13585b = r13     // Catch:{ all -> 0x0216 }
            r0.f13586c = r6     // Catch:{ all -> 0x0216 }
            r0.f13587d = r3     // Catch:{ all -> 0x0216 }
            r0.f13588e = r15     // Catch:{ all -> 0x0216 }
            r0.f13589f = r12     // Catch:{ all -> 0x0216 }
            r0.f13590g = r12     // Catch:{ all -> 0x0216 }
            r0.f13591h = r12     // Catch:{ all -> 0x0216 }
            r0.k = r11     // Catch:{ all -> 0x0216 }
            java.lang.Object r1 = wp0.h.g(r1, r2, r0)     // Catch:{ all -> 0x0216 }
            if (r1 != r9) goto L_0x018c
            return r9
        L_0x018c:
            r4 = r6
            r5 = r13
            r6 = r14
            r2 = r15
        L_0x0190:
            coil.intercept.EngineInterceptor$b r1 = (coil.intercept.EngineInterceptor.b) r1     // Catch:{ all -> 0x0057 }
            r15 = r2
            r2 = r6
            r6 = r4
            r4 = r5
            r34 = r3
            r3 = r1
            r1 = r34
            goto L_0x01bf
        L_0x019c:
            boolean r2 = r2 instanceof r6.f     // Catch:{ all -> 0x0216 }
            if (r2 == 0) goto L_0x0210
            coil.intercept.EngineInterceptor$b r2 = new coil.intercept.EngineInterceptor$b     // Catch:{ all -> 0x0216 }
            r6.f r1 = (r6.f) r1     // Catch:{ all -> 0x0216 }
            android.graphics.drawable.Drawable r1 = r1.b()     // Catch:{ all -> 0x0216 }
            T r4 = r15.f25666a     // Catch:{ all -> 0x0216 }
            r6.f r4 = (r6.f) r4     // Catch:{ all -> 0x0216 }
            boolean r4 = r4.c()     // Catch:{ all -> 0x0216 }
            T r5 = r15.f25666a     // Catch:{ all -> 0x0216 }
            r6.f r5 = (r6.f) r5     // Catch:{ all -> 0x0216 }
            coil.decode.DataSource r5 = r5.a()     // Catch:{ all -> 0x0216 }
            r2.<init>(r1, r4, r5, r12)     // Catch:{ all -> 0x0216 }
            r1 = r3
            r4 = r13
            r3 = r2
            r2 = r14
        L_0x01bf:
            T r5 = r15.f25666a
            boolean r7 = r5 instanceof r6.k
            if (r7 == 0) goto L_0x01c8
            r6.k r5 = (r6.k) r5
            goto L_0x01c9
        L_0x01c8:
            r5 = r12
        L_0x01c9:
            if (r5 != 0) goto L_0x01cc
            goto L_0x01d6
        L_0x01cc:
            o6.k r5 = r5.b()
            if (r5 != 0) goto L_0x01d3
            goto L_0x01d6
        L_0x01d3:
            c7.i.c(r5)
        L_0x01d6:
            T r1 = r1.f25666a
            r5 = r1
            x6.k r5 = (x6.k) r5
            r0.f13584a = r12
            r0.f13585b = r12
            r0.f13586c = r12
            r0.f13587d = r12
            r0.f13588e = r12
            r0.f13589f = r12
            r0.f13590g = r12
            r0.f13591h = r12
            r0.k = r10
            r7 = r0
            java.lang.Object r1 = r2.k(r3, r4, r5, r6, r7)
            if (r1 != r9) goto L_0x01f5
            return r9
        L_0x01f5:
            coil.intercept.EngineInterceptor$b r1 = (coil.intercept.EngineInterceptor.b) r1
            android.graphics.drawable.Drawable r0 = r1.e()
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L_0x0202
            r12 = r0
            android.graphics.drawable.BitmapDrawable r12 = (android.graphics.drawable.BitmapDrawable) r12
        L_0x0202:
            if (r12 != 0) goto L_0x0205
            goto L_0x020f
        L_0x0205:
            android.graphics.Bitmap r0 = r12.getBitmap()
            if (r0 != 0) goto L_0x020c
            goto L_0x020f
        L_0x020c:
            r0.prepareToDraw()
        L_0x020f:
            return r1
        L_0x0210:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0216 }
            r0.<init>()     // Catch:{ all -> 0x0216 }
            throw r0     // Catch:{ all -> 0x0216 }
        L_0x0216:
            r0 = move-exception
            r2 = r15
        L_0x0218:
            T r1 = r2.f25666a
            boolean r2 = r1 instanceof r6.k
            if (r2 == 0) goto L_0x0221
            r12 = r1
            r6.k r12 = (r6.k) r12
        L_0x0221:
            if (r12 == 0) goto L_0x022d
            o6.k r1 = r12.b()
            if (r1 != 0) goto L_0x022a
            goto L_0x022d
        L_0x022a:
            c7.i.c(r1)
        L_0x022d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.i(x6.g, java.lang.Object, x6.k, m6.c, fp0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(m6.b r10, x6.g r11, java.lang.Object r12, x6.k r13, m6.c r14, fp0.c<? super r6.g> r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof coil.intercept.EngineInterceptor$fetch$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            coil.intercept.EngineInterceptor$fetch$1 r0 = (coil.intercept.EngineInterceptor$fetch$1) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.k = r1
            goto L_0x0018
        L_0x0013:
            coil.intercept.EngineInterceptor$fetch$1 r0 = new coil.intercept.EngineInterceptor$fetch$1
            r0.<init>(r9, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f13609i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 != r3) goto L_0x0050
            int r10 = r0.f13608h
            java.lang.Object r11 = r0.f13607g
            r6.h r11 = (r6.h) r11
            java.lang.Object r12 = r0.f13606f
            m6.c r12 = (m6.c) r12
            java.lang.Object r13 = r0.f13605e
            x6.k r13 = (x6.k) r13
            java.lang.Object r14 = r0.f13604d
            java.lang.Object r2 = r0.f13603c
            x6.g r2 = (x6.g) r2
            java.lang.Object r4 = r0.f13602b
            m6.b r4 = (m6.b) r4
            java.lang.Object r5 = r0.f13601a
            coil.intercept.EngineInterceptor r5 = (coil.intercept.EngineInterceptor) r5
            bp0.g.b(r15)
            r6 = r0
            r0 = r10
            r10 = r4
            r4 = r1
            r1 = r6
            r7 = r2
            r2 = r11
            r11 = r7
            r8 = r14
            r14 = r12
            r12 = r8
            goto L_0x0097
        L_0x0050:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0058:
            bp0.g.b(r15)
            r15 = 0
            r5 = r9
        L_0x005d:
            coil.ImageLoader r2 = r5.f13566a
            kotlin.Pair r15 = r10.j(r12, r13, r2, r15)
            if (r15 == 0) goto L_0x00b9
            java.lang.Object r2 = r15.c()
            r6.h r2 = (r6.h) r2
            java.lang.Object r15 = r15.d()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            int r15 = r15 + r3
            r14.o(r11, r2, r13)
            r0.f13601a = r5
            r0.f13602b = r10
            r0.f13603c = r11
            r0.f13604d = r12
            r0.f13605e = r13
            r0.f13606f = r14
            r0.f13607g = r2
            r0.f13608h = r15
            r0.k = r3
            java.lang.Object r4 = r2.a(r0)
            if (r4 != r1) goto L_0x0092
            return r1
        L_0x0092:
            r6 = r0
            r0 = r15
            r15 = r4
            r4 = r1
            r1 = r6
        L_0x0097:
            r6.g r15 = (r6.g) r15
            r14.i(r11, r2, r13, r15)     // Catch:{ all -> 0x00a3 }
            if (r15 == 0) goto L_0x009f
            return r15
        L_0x009f:
            r15 = r0
            r0 = r1
            r1 = r4
            goto L_0x005d
        L_0x00a3:
            r10 = move-exception
            boolean r11 = r15 instanceof r6.k
            if (r11 == 0) goto L_0x00ab
            r6.k r15 = (r6.k) r15
            goto L_0x00ac
        L_0x00ab:
            r15 = 0
        L_0x00ac:
            if (r15 == 0) goto L_0x00b8
            o6.k r11 = r15.b()
            if (r11 != 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            c7.i.c(r11)
        L_0x00b8:
            throw r10
        L_0x00b9:
            java.lang.String r10 = "Unable to create a fetcher that supports: "
            java.lang.String r10 = kotlin.jvm.internal.p.s(r10, r12)
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.j(m6.b, x6.g, java.lang.Object, x6.k, m6.c, fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(s6.a.C0186a r14, fp0.c<? super x6.h> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof coil.intercept.EngineInterceptor$intercept$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            coil.intercept.EngineInterceptor$intercept$1 r0 = (coil.intercept.EngineInterceptor$intercept$1) r0
            int r1 = r0.f13614e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13614e = r1
            goto L_0x0018
        L_0x0013:
            coil.intercept.EngineInterceptor$intercept$1 r0 = new coil.intercept.EngineInterceptor$intercept$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f13612c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f13614e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r14 = r0.f13611b
            s6.a$a r14 = (s6.a.C0186a) r14
            java.lang.Object r0 = r0.f13610a
            coil.intercept.EngineInterceptor r0 = (coil.intercept.EngineInterceptor) r0
            bp0.g.b(r15)     // Catch:{ all -> 0x0031 }
            goto L_0x009b
        L_0x0031:
            r15 = move-exception
            goto L_0x009e
        L_0x0033:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003b:
            bp0.g.b(r15)
            x6.g r6 = r14.c()     // Catch:{ all -> 0x009c }
            java.lang.Object r15 = r6.m()     // Catch:{ all -> 0x009c }
            y6.g r2 = r14.a()     // Catch:{ all -> 0x009c }
            m6.c r9 = c7.i.g(r14)     // Catch:{ all -> 0x009c }
            x6.m r4 = r13.f13567b     // Catch:{ all -> 0x009c }
            x6.k r8 = r4.f(r6, r2)     // Catch:{ all -> 0x009c }
            coil.size.Scale r4 = r8.m()     // Catch:{ all -> 0x009c }
            r9.l(r6, r15)     // Catch:{ all -> 0x009c }
            coil.ImageLoader r5 = r13.f13566a     // Catch:{ all -> 0x009c }
            m6.b r5 = r5.getComponents()     // Catch:{ all -> 0x009c }
            java.lang.Object r7 = r5.g(r15, r8)     // Catch:{ all -> 0x009c }
            r9.p(r6, r7)     // Catch:{ all -> 0x009c }
            v6.c r15 = r13.f13569d     // Catch:{ all -> 0x009c }
            coil.memory.MemoryCache$Key r10 = r15.f(r6, r7, r8, r9)     // Catch:{ all -> 0x009c }
            if (r10 != 0) goto L_0x0072
            r15 = 0
            goto L_0x0078
        L_0x0072:
            v6.c r15 = r13.f13569d     // Catch:{ all -> 0x009c }
            coil.memory.MemoryCache$b r15 = r15.a(r6, r10, r2, r4)     // Catch:{ all -> 0x009c }
        L_0x0078:
            if (r15 == 0) goto L_0x0081
            v6.c r0 = r13.f13569d     // Catch:{ all -> 0x009c }
            x6.n r14 = r0.g(r14, r6, r10, r15)     // Catch:{ all -> 0x009c }
            return r14
        L_0x0081:
            kotlinx.coroutines.CoroutineDispatcher r15 = r6.v()     // Catch:{ all -> 0x009c }
            coil.intercept.EngineInterceptor$intercept$2 r2 = new coil.intercept.EngineInterceptor$intercept$2     // Catch:{ all -> 0x009c }
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x009c }
            r0.f13610a = r13     // Catch:{ all -> 0x009c }
            r0.f13611b = r14     // Catch:{ all -> 0x009c }
            r0.f13614e = r3     // Catch:{ all -> 0x009c }
            java.lang.Object r15 = wp0.h.g(r15, r2, r0)     // Catch:{ all -> 0x009c }
            if (r15 != r1) goto L_0x009b
            return r1
        L_0x009b:
            return r15
        L_0x009c:
            r15 = move-exception
            r0 = r13
        L_0x009e:
            boolean r1 = r15 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L_0x00ad
            x6.m r0 = r0.f13567b
            x6.g r14 = r14.c()
            x6.d r14 = r0.b(r14, r15)
            return r14
        L_0x00ad:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.a(s6.a$a, fp0.c):java.lang.Object");
    }

    public final Object k(b bVar, g gVar, k kVar, m6.c cVar, fp0.c<? super b> cVar2) {
        List<a7.a> O = gVar.O();
        if (O.isEmpty()) {
            return bVar;
        }
        if ((bVar.e() instanceof BitmapDrawable) || gVar.g()) {
            return h.g(gVar.N(), new EngineInterceptor$transform$3(this, bVar, kVar, O, cVar, gVar, (fp0.c<? super EngineInterceptor$transform$3>) null), cVar2);
        }
        q qVar = this.f13568c;
        if (qVar != null && qVar.getLevel() <= 4) {
            String canonicalName = bVar.e().getClass().getCanonicalName();
            qVar.a("EngineInterceptor", 4, "allowConversionToBitmap=false, skipping transformations for type " + canonicalName + '.', (Throwable) null);
        }
        return bVar;
    }
}
