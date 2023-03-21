package x6;

import a0.h;
import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ImageResult.kt */
public final class n extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f17837a;

    /* renamed from: b  reason: collision with root package name */
    private final g f17838b;

    /* renamed from: c  reason: collision with root package name */
    private final DataSource f17839c;

    /* renamed from: d  reason: collision with root package name */
    private final MemoryCache.Key f17840d;

    /* renamed from: e  reason: collision with root package name */
    private final String f17841e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f17842f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f17843g;

    public n(Drawable drawable, g gVar, DataSource dataSource, MemoryCache.Key key, String str, boolean z11, boolean z12) {
        super((i) null);
        this.f17837a = drawable;
        this.f17838b = gVar;
        this.f17839c = dataSource;
        this.f17840d = key;
        this.f17841e = str;
        this.f17842f = z11;
        this.f17843g = z12;
    }

    public Drawable a() {
        return this.f17837a;
    }

    public g b() {
        return this.f17838b;
    }

    public final DataSource c() {
        return this.f17839c;
    }

    public final boolean d() {
        return this.f17843g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (!p.e(a(), nVar.a()) || !p.e(b(), nVar.b()) || this.f17839c != nVar.f17839c || !p.e(this.f17840d, nVar.f17840d) || !p.e(this.f17841e, nVar.f17841e) || this.f17842f != nVar.f17842f || this.f17843g != nVar.f17843g) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.f17839c.hashCode()) * 31;
        MemoryCache.Key key = this.f17840d;
        int i11 = 0;
        int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
        String str = this.f17841e;
        if (str != null) {
            i11 = str.hashCode();
        }
        return ((((hashCode2 + i11) * 31) + h.a(this.f17842f)) * 31) + h.a(this.f17843g);
    }
}
