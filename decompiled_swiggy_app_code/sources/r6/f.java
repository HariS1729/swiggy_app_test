package r6;

import a0.h;
import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FetchResult.kt */
public final class f extends g {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f16492a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16493b;

    /* renamed from: c  reason: collision with root package name */
    private final DataSource f16494c;

    public f(Drawable drawable, boolean z11, DataSource dataSource) {
        super((i) null);
        this.f16492a = drawable;
        this.f16493b = z11;
        this.f16494c = dataSource;
    }

    public final DataSource a() {
        return this.f16494c;
    }

    public final Drawable b() {
        return this.f16492a;
    }

    public final boolean c() {
        return this.f16493b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (p.e(this.f16492a, fVar.f16492a) && this.f16493b == fVar.f16493b && this.f16494c == fVar.f16494c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f16492a.hashCode() * 31) + h.a(this.f16493b)) * 31) + this.f16494c.hashCode();
    }
}
