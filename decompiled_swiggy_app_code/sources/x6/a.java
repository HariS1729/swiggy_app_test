package x6;

import a0.h;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import b7.c;
import coil.request.CachePolicy;
import coil.size.Precision;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: DefaultRequestOptions.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineDispatcher f17745a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineDispatcher f17746b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineDispatcher f17747c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineDispatcher f17748d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a f17749e;

    /* renamed from: f  reason: collision with root package name */
    private final Precision f17750f;

    /* renamed from: g  reason: collision with root package name */
    private final Bitmap.Config f17751g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f17752h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f17753i;
    private final Drawable j;
    private final Drawable k;

    /* renamed from: l  reason: collision with root package name */
    private final Drawable f17754l;

    /* renamed from: m  reason: collision with root package name */
    private final CachePolicy f17755m;
    private final CachePolicy n;

    /* renamed from: o  reason: collision with root package name */
    private final CachePolicy f17756o;

    public a() {
        this((CoroutineDispatcher) null, (CoroutineDispatcher) null, (CoroutineDispatcher) null, (CoroutineDispatcher) null, (c.a) null, (Precision) null, (Bitmap.Config) null, false, false, (Drawable) null, (Drawable) null, (Drawable) null, (CachePolicy) null, (CachePolicy) null, (CachePolicy) null, 32767, (i) null);
    }

    public a(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, c.a aVar, Precision precision, Bitmap.Config config, boolean z11, boolean z12, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.f17745a = coroutineDispatcher;
        this.f17746b = coroutineDispatcher2;
        this.f17747c = coroutineDispatcher3;
        this.f17748d = coroutineDispatcher4;
        this.f17749e = aVar;
        this.f17750f = precision;
        this.f17751g = config;
        this.f17752h = z11;
        this.f17753i = z12;
        this.j = drawable;
        this.k = drawable2;
        this.f17754l = drawable3;
        this.f17755m = cachePolicy;
        this.n = cachePolicy2;
        this.f17756o = cachePolicy3;
    }

    public final boolean a() {
        return this.f17752h;
    }

    public final boolean b() {
        return this.f17753i;
    }

    public final Bitmap.Config c() {
        return this.f17751g;
    }

    public final CoroutineDispatcher d() {
        return this.f17747c;
    }

    public final CachePolicy e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!p.e(this.f17745a, aVar.f17745a) || !p.e(this.f17746b, aVar.f17746b) || !p.e(this.f17747c, aVar.f17747c) || !p.e(this.f17748d, aVar.f17748d) || !p.e(this.f17749e, aVar.f17749e) || this.f17750f != aVar.f17750f || this.f17751g != aVar.f17751g || this.f17752h != aVar.f17752h || this.f17753i != aVar.f17753i || !p.e(this.j, aVar.j) || !p.e(this.k, aVar.k) || !p.e(this.f17754l, aVar.f17754l) || this.f17755m != aVar.f17755m || this.n != aVar.n || this.f17756o != aVar.f17756o) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Drawable f() {
        return this.k;
    }

    public final Drawable g() {
        return this.f17754l;
    }

    public final CoroutineDispatcher h() {
        return this.f17746b;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f17745a.hashCode() * 31) + this.f17746b.hashCode()) * 31) + this.f17747c.hashCode()) * 31) + this.f17748d.hashCode()) * 31) + this.f17749e.hashCode()) * 31) + this.f17750f.hashCode()) * 31) + this.f17751g.hashCode()) * 31) + h.a(this.f17752h)) * 31) + h.a(this.f17753i)) * 31;
        Drawable drawable = this.j;
        int i11 = 0;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.k;
        int hashCode3 = (hashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.f17754l;
        if (drawable3 != null) {
            i11 = drawable3.hashCode();
        }
        return ((((((hashCode3 + i11) * 31) + this.f17755m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.f17756o.hashCode();
    }

    public final CoroutineDispatcher i() {
        return this.f17745a;
    }

    public final CachePolicy j() {
        return this.f17755m;
    }

    public final CachePolicy k() {
        return this.f17756o;
    }

    public final Drawable l() {
        return this.j;
    }

    public final Precision m() {
        return this.f17750f;
    }

    public final CoroutineDispatcher n() {
        return this.f17748d;
    }

    public final c.a o() {
        return this.f17749e;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(kotlinx.coroutines.CoroutineDispatcher r16, kotlinx.coroutines.CoroutineDispatcher r17, kotlinx.coroutines.CoroutineDispatcher r18, kotlinx.coroutines.CoroutineDispatcher r19, b7.c.a r20, coil.size.Precision r21, android.graphics.Bitmap.Config r22, boolean r23, boolean r24, android.graphics.drawable.Drawable r25, android.graphics.drawable.Drawable r26, android.graphics.drawable.Drawable r27, coil.request.CachePolicy r28, coil.request.CachePolicy r29, coil.request.CachePolicy r30, int r31, kotlin.jvm.internal.i r32) {
        /*
            r15 = this;
            r0 = r31
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000f
            wp0.t1 r1 = wp0.u0.c()
            wp0.t1 r1 = r1.N0()
            goto L_0x0011
        L_0x000f:
            r1 = r16
        L_0x0011:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x001a
            kotlinx.coroutines.CoroutineDispatcher r2 = wp0.u0.b()
            goto L_0x001c
        L_0x001a:
            r2 = r17
        L_0x001c:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0025
            kotlinx.coroutines.CoroutineDispatcher r3 = wp0.u0.b()
            goto L_0x0027
        L_0x0025:
            r3 = r18
        L_0x0027:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0030
            kotlinx.coroutines.CoroutineDispatcher r4 = wp0.u0.b()
            goto L_0x0032
        L_0x0030:
            r4 = r19
        L_0x0032:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0039
            b7.c$a r5 = b7.c.a.f12592b
            goto L_0x003b
        L_0x0039:
            r5 = r20
        L_0x003b:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0042
            coil.size.Precision r6 = coil.size.Precision.AUTOMATIC
            goto L_0x0044
        L_0x0042:
            r6 = r21
        L_0x0044:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x004d
            android.graphics.Bitmap$Config r7 = c7.i.e()
            goto L_0x004f
        L_0x004d:
            r7 = r22
        L_0x004f:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0055
            r8 = 1
            goto L_0x0057
        L_0x0055:
            r8 = r23
        L_0x0057:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x005d
            r9 = 0
            goto L_0x005f
        L_0x005d:
            r9 = r24
        L_0x005f:
            r10 = r0 & 512(0x200, float:7.175E-43)
            r11 = 0
            if (r10 == 0) goto L_0x0066
            r10 = r11
            goto L_0x0068
        L_0x0066:
            r10 = r25
        L_0x0068:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x006e
            r12 = r11
            goto L_0x0070
        L_0x006e:
            r12 = r26
        L_0x0070:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r11 = r27
        L_0x0077:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x007e
            coil.request.CachePolicy r13 = coil.request.CachePolicy.ENABLED
            goto L_0x0080
        L_0x007e:
            r13 = r28
        L_0x0080:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x0087
            coil.request.CachePolicy r14 = coil.request.CachePolicy.ENABLED
            goto L_0x0089
        L_0x0087:
            r14 = r29
        L_0x0089:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0090
            coil.request.CachePolicy r0 = coil.request.CachePolicy.ENABLED
            goto L_0x0092
        L_0x0090:
            r0 = r30
        L_0x0092:
            r16 = r15
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r12
            r28 = r11
            r29 = r13
            r30 = r14
            r31 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.a.<init>(kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, b7.c$a, coil.size.Precision, android.graphics.Bitmap$Config, boolean, boolean, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, coil.request.CachePolicy, coil.request.CachePolicy, coil.request.CachePolicy, int, kotlin.jvm.internal.i):void");
    }
}
