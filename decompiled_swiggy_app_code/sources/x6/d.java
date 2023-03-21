package x6;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ImageResult.kt */
public final class d extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f17769a;

    /* renamed from: b  reason: collision with root package name */
    private final g f17770b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f17771c;

    public d(Drawable drawable, g gVar, Throwable th2) {
        super((i) null);
        this.f17769a = drawable;
        this.f17770b = gVar;
        this.f17771c = th2;
    }

    public Drawable a() {
        return this.f17769a;
    }

    public g b() {
        return this.f17770b;
    }

    public final Throwable c() {
        return this.f17771c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (!p.e(a(), dVar.a()) || !p.e(b(), dVar.b()) || !p.e(this.f17771c, dVar.f17771c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Drawable a11 = a();
        return ((((a11 == null ? 0 : a11.hashCode()) * 31) + b().hashCode()) * 31) + this.f17771c.hashCode();
    }
}
