package o6;

import a0.h;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.p;

/* compiled from: DecodeResult.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f15955a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15956b;

    public c(Drawable drawable, boolean z11) {
        this.f15955a = drawable;
        this.f15956b = z11;
    }

    public final Drawable a() {
        return this.f15955a;
    }

    public final boolean b() {
        return this.f15956b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (!p.e(this.f15955a, cVar.f15955a) || this.f15956b != cVar.f15956b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f15955a.hashCode() * 31) + h.a(this.f15956b);
    }
}
