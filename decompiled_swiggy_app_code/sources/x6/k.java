package x6;

import a0.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import coil.request.CachePolicy;
import coil.size.Scale;
import com.truecaller.android.sdk.TruecallerSdkScope;
import kotlin.jvm.internal.p;
import okhttp3.Headers;
import y6.g;

/* compiled from: Options.kt */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17816a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap.Config f17817b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorSpace f17818c;

    /* renamed from: d  reason: collision with root package name */
    private final g f17819d;

    /* renamed from: e  reason: collision with root package name */
    private final Scale f17820e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f17821f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f17822g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f17823h;

    /* renamed from: i  reason: collision with root package name */
    private final String f17824i;
    private final Headers j;
    private final o k;

    /* renamed from: l  reason: collision with root package name */
    private final l f17825l;

    /* renamed from: m  reason: collision with root package name */
    private final CachePolicy f17826m;
    private final CachePolicy n;

    /* renamed from: o  reason: collision with root package name */
    private final CachePolicy f17827o;

    public k(Context context, Bitmap.Config config, ColorSpace colorSpace, g gVar, Scale scale, boolean z11, boolean z12, boolean z13, String str, Headers headers, o oVar, l lVar, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.f17816a = context;
        this.f17817b = config;
        this.f17818c = colorSpace;
        this.f17819d = gVar;
        this.f17820e = scale;
        this.f17821f = z11;
        this.f17822g = z12;
        this.f17823h = z13;
        this.f17824i = str;
        this.j = headers;
        this.k = oVar;
        this.f17825l = lVar;
        this.f17826m = cachePolicy;
        this.n = cachePolicy2;
        this.f17827o = cachePolicy3;
    }

    public static /* synthetic */ k b(k kVar, Context context, Bitmap.Config config, ColorSpace colorSpace, g gVar, Scale scale, boolean z11, boolean z12, boolean z13, String str, Headers headers, o oVar, l lVar, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i11, Object obj) {
        k kVar2 = kVar;
        int i12 = i11;
        return kVar.a((i12 & 1) != 0 ? kVar2.f17816a : context, (i12 & 2) != 0 ? kVar2.f17817b : config, (i12 & 4) != 0 ? kVar2.f17818c : colorSpace, (i12 & 8) != 0 ? kVar2.f17819d : gVar, (i12 & 16) != 0 ? kVar2.f17820e : scale, (i12 & 32) != 0 ? kVar2.f17821f : z11, (i12 & 64) != 0 ? kVar2.f17822g : z12, (i12 & 128) != 0 ? kVar2.f17823h : z13, (i12 & 256) != 0 ? kVar2.f17824i : str, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? kVar2.j : headers, (i12 & 1024) != 0 ? kVar2.k : oVar, (i12 & 2048) != 0 ? kVar2.f17825l : lVar, (i12 & 4096) != 0 ? kVar2.f17826m : cachePolicy, (i12 & 8192) != 0 ? kVar2.n : cachePolicy2, (i12 & 16384) != 0 ? kVar2.f17827o : cachePolicy3);
    }

    public final k a(Context context, Bitmap.Config config, ColorSpace colorSpace, g gVar, Scale scale, boolean z11, boolean z12, boolean z13, String str, Headers headers, o oVar, l lVar, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        return new k(context, config, colorSpace, gVar, scale, z11, z12, z13, str, headers, oVar, lVar, cachePolicy, cachePolicy2, cachePolicy3);
    }

    public final boolean c() {
        return this.f17821f;
    }

    public final boolean d() {
        return this.f17822g;
    }

    public final ColorSpace e() {
        return this.f17818c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (p.e(this.f17816a, kVar.f17816a) && this.f17817b == kVar.f17817b && ((Build.VERSION.SDK_INT < 26 || p.e(this.f17818c, kVar.f17818c)) && p.e(this.f17819d, kVar.f17819d) && this.f17820e == kVar.f17820e && this.f17821f == kVar.f17821f && this.f17822g == kVar.f17822g && this.f17823h == kVar.f17823h && p.e(this.f17824i, kVar.f17824i) && p.e(this.j, kVar.j) && p.e(this.k, kVar.k) && p.e(this.f17825l, kVar.f17825l) && this.f17826m == kVar.f17826m && this.n == kVar.n && this.f17827o == kVar.f17827o)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final Bitmap.Config f() {
        return this.f17817b;
    }

    public final Context g() {
        return this.f17816a;
    }

    public final String h() {
        return this.f17824i;
    }

    public int hashCode() {
        int hashCode = ((this.f17816a.hashCode() * 31) + this.f17817b.hashCode()) * 31;
        ColorSpace colorSpace = this.f17818c;
        int i11 = 0;
        int hashCode2 = (((((((((((hashCode + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31) + this.f17819d.hashCode()) * 31) + this.f17820e.hashCode()) * 31) + h.a(this.f17821f)) * 31) + h.a(this.f17822g)) * 31) + h.a(this.f17823h)) * 31;
        String str = this.f17824i;
        if (str != null) {
            i11 = str.hashCode();
        }
        return ((((((((((((hashCode2 + i11) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.f17825l.hashCode()) * 31) + this.f17826m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.f17827o.hashCode();
    }

    public final CachePolicy i() {
        return this.n;
    }

    public final Headers j() {
        return this.j;
    }

    public final CachePolicy k() {
        return this.f17827o;
    }

    public final boolean l() {
        return this.f17823h;
    }

    public final Scale m() {
        return this.f17820e;
    }

    public final g n() {
        return this.f17819d;
    }

    public final o o() {
        return this.k;
    }
}
