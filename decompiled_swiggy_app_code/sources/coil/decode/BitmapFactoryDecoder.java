package coil.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import coil.ImageLoader;
import coil.size.Scale;
import com.newrelic.agent.android.instrumentation.Instrumented;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.sync.f;
import o6.d;
import o6.e;
import o6.k;
import o6.m;
import okio.h0;
import okio.l;
import y6.g;

@Instrumented
/* compiled from: BitmapFactoryDecoder.kt */
public final class BitmapFactoryDecoder implements e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f13498d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final k f13499a;

    /* renamed from: b  reason: collision with root package name */
    private final x6.k f13500b;

    /* renamed from: c  reason: collision with root package name */
    private final kotlinx.coroutines.sync.e f13501c;

    /* compiled from: BitmapFactoryDecoder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: BitmapFactoryDecoder.kt */
    private static final class b extends l {

        /* renamed from: a  reason: collision with root package name */
        private Exception f13502a;

        public b(h0 h0Var) {
            super(h0Var);
        }

        public final Exception a() {
            return this.f13502a;
        }

        public long read(okio.c cVar, long j) {
            try {
                return super.read(cVar, j);
            } catch (Exception e11) {
                this.f13502a = e11;
                throw e11;
            }
        }
    }

    /* compiled from: BitmapFactoryDecoder.kt */
    public static final class c implements e.a {

        /* renamed from: a  reason: collision with root package name */
        private final kotlinx.coroutines.sync.e f13503a;

        public c(int i11) {
            this.f13503a = f.b(i11, 0, 2, (Object) null);
        }

        public e a(r6.k kVar, x6.k kVar2, ImageLoader imageLoader) {
            return new BitmapFactoryDecoder(kVar.b(), kVar2, this.f13503a);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }
    }

    public BitmapFactoryDecoder(k kVar, x6.k kVar2, kotlinx.coroutines.sync.e eVar) {
        this.f13499a = kVar;
        this.f13500b = kVar2;
        this.f13501c = eVar;
    }

    private final void c(BitmapFactory.Options options, o6.f fVar) {
        Bitmap.Config f11 = this.f13500b.f();
        if (fVar.b() || o6.i.a(fVar)) {
            f11 = c7.a.e(f11);
        }
        if (this.f13500b.d() && f11 == Bitmap.Config.ARGB_8888 && p.e(options.outMimeType, "image/jpeg")) {
            f11 = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && f11 != Bitmap.Config.HARDWARE) {
            f11 = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = f11;
    }

    private final void d(BitmapFactory.Options options, o6.f fVar) {
        int i11;
        int i12;
        BitmapFactory.Options options2 = options;
        k.a a11 = this.f13499a.a();
        if (!(a11 instanceof m) || !y6.b.a(this.f13500b.n())) {
            boolean z11 = false;
            if (options2.outWidth <= 0 || options2.outHeight <= 0) {
                options2.inSampleSize = 1;
                options2.inScaled = false;
                return;
            }
            int i13 = o6.i.b(fVar) ? options2.outHeight : options2.outWidth;
            int i14 = o6.i.b(fVar) ? options2.outWidth : options2.outHeight;
            g n = this.f13500b.n();
            Scale m11 = this.f13500b.m();
            if (y6.b.a(n)) {
                i11 = i13;
            } else {
                i11 = c7.i.z(n.b(), m11);
            }
            g n11 = this.f13500b.n();
            Scale m12 = this.f13500b.m();
            if (y6.b.a(n11)) {
                i12 = i14;
            } else {
                i12 = c7.i.z(n11.a(), m12);
            }
            int a12 = d.a(i13, i14, i11, i12, this.f13500b.m());
            options2.inSampleSize = a12;
            double b11 = d.b(((double) i13) / ((double) a12), ((double) i14) / ((double) a12), (double) i11, (double) i12, this.f13500b.m());
            if (this.f13500b.c()) {
                b11 = l.g(b11, 1.0d);
            }
            if (b11 == 1.0d) {
                z11 = true;
            }
            boolean z12 = !z11;
            options2.inScaled = z12;
            if (!z12) {
                return;
            }
            if (b11 > 1.0d) {
                options2.inDensity = c.b(((double) Integer.MAX_VALUE) / b11);
                options2.inTargetDensity = Integer.MAX_VALUE;
                return;
            }
            options2.inDensity = Integer.MAX_VALUE;
            options2.inTargetDensity = c.b(((double) Integer.MAX_VALUE) * b11);
            return;
        }
        options2.inSampleSize = 1;
        options2.inScaled = true;
        options2.inDensity = ((m) a11).a();
        options2.inTargetDensity = this.f13500b.g().getResources().getDisplayMetrics().densityDpi;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b4, code lost:
        jp0.b.a(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o6.c e(android.graphics.BitmapFactory.Options r10) {
        /*
            r9 = this;
            coil.decode.BitmapFactoryDecoder$b r0 = new coil.decode.BitmapFactoryDecoder$b
            o6.k r1 = r9.f13499a
            okio.e r1 = r1.b()
            r0.<init>(r1)
            okio.e r1 = okio.u.d(r0)
            r2 = 1
            r10.inJustDecodeBounds = r2
            okio.e r3 = r1.peek()
            java.io.InputStream r3 = r3.j1()
            r4 = 0
            com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation.decodeStream(r3, r4, r10)
            java.lang.Exception r3 = r0.a()
            if (r3 != 0) goto L_0x00b9
            r3 = 0
            r10.inJustDecodeBounds = r3
            o6.h r5 = o6.h.f15965a
            java.lang.String r6 = r10.outMimeType
            o6.f r6 = r5.a(r6, r1)
            java.lang.Exception r7 = r0.a()
            if (r7 != 0) goto L_0x00b8
            r10.inMutable = r3
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r7 < r8) goto L_0x004d
            x6.k r7 = r9.f13500b
            android.graphics.ColorSpace r7 = r7.e()
            if (r7 == 0) goto L_0x004d
            x6.k r7 = r9.f13500b
            android.graphics.ColorSpace r7 = r7.e()
            r10.inPreferredColorSpace = r7
        L_0x004d:
            x6.k r7 = r9.f13500b
            boolean r7 = r7.l()
            r10.inPremultiplied = r7
            r9.c(r10, r6)
            r9.d(r10, r6)
            java.io.InputStream r7 = r1.j1()     // Catch:{ all -> 0x00b1 }
            android.graphics.Bitmap r7 = com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation.decodeStream(r7, r4, r10)     // Catch:{ all -> 0x00b1 }
            jp0.b.a(r1, r4)
            java.lang.Exception r0 = r0.a()
            if (r0 != 0) goto L_0x00b0
            if (r7 == 0) goto L_0x00a4
            x6.k r0 = r9.f13500b
            android.content.Context r0 = r0.g()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            r7.setDensity(r0)
            android.graphics.Bitmap r0 = r5.b(r7, r6)
            o6.c r1 = new o6.c
            x6.k r4 = r9.f13500b
            android.content.Context r4 = r4.g()
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            r5.<init>(r4, r0)
            int r0 = r10.inSampleSize
            if (r0 > r2) goto L_0x00a0
            boolean r10 = r10.inScaled
            if (r10 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r2 = 0
        L_0x00a0:
            r1.<init>(r5, r2)
            return r1
        L_0x00a4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format."
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00b0:
            throw r0
        L_0x00b1:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r0 = move-exception
            jp0.b.a(r1, r10)
            throw r0
        L_0x00b8:
            throw r7
        L_0x00b9:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.decode.BitmapFactoryDecoder.e(android.graphics.BitmapFactory$Options):o6.c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(fp0.c<? super o6.c> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            coil.decode.BitmapFactoryDecoder$decode$1 r0 = (coil.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.f13508e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13508e = r1
            goto L_0x0018
        L_0x0013:
            coil.decode.BitmapFactoryDecoder$decode$1 r0 = new coil.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f13506c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f13508e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r0 = r0.f13504a
            kotlinx.coroutines.sync.e r0 = (kotlinx.coroutines.sync.e) r0
            bp0.g.b(r8)     // Catch:{ all -> 0x0030 }
            goto L_0x0070
        L_0x0030:
            r8 = move-exception
            goto L_0x007a
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003a:
            java.lang.Object r2 = r0.f13505b
            kotlinx.coroutines.sync.e r2 = (kotlinx.coroutines.sync.e) r2
            java.lang.Object r5 = r0.f13504a
            coil.decode.BitmapFactoryDecoder r5 = (coil.decode.BitmapFactoryDecoder) r5
            bp0.g.b(r8)
            r8 = r2
            goto L_0x005a
        L_0x0047:
            bp0.g.b(r8)
            kotlinx.coroutines.sync.e r8 = r7.f13501c
            r0.f13504a = r7
            r0.f13505b = r8
            r0.f13508e = r4
            java.lang.Object r2 = r8.a(r0)
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r5 = r7
        L_0x005a:
            coil.decode.BitmapFactoryDecoder$decode$2$1 r2 = new coil.decode.BitmapFactoryDecoder$decode$2$1     // Catch:{ all -> 0x0076 }
            r2.<init>(r5)     // Catch:{ all -> 0x0076 }
            r0.f13504a = r8     // Catch:{ all -> 0x0076 }
            r5 = 0
            r0.f13505b = r5     // Catch:{ all -> 0x0076 }
            r0.f13508e = r3     // Catch:{ all -> 0x0076 }
            java.lang.Object r0 = kotlinx.coroutines.InterruptibleKt.c(r5, r2, r0, r4, r5)     // Catch:{ all -> 0x0076 }
            if (r0 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0070:
            o6.c r8 = (o6.c) r8     // Catch:{ all -> 0x0030 }
            r0.release()
            return r8
        L_0x0076:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x007a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.decode.BitmapFactoryDecoder.a(fp0.c):java.lang.Object");
    }
}
