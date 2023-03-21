package s;

import androidx.compose.foundation.layout.PaddingKt;
import defpackage.a2;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.d0;
import u0.f0;

/* compiled from: OverscrollConfiguration.kt */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final long f16548a;

    /* renamed from: b  reason: collision with root package name */
    private final a2.p f16549b;

    private k(long j, a2.p pVar) {
        this.f16548a = j;
        this.f16549b = pVar;
    }

    public /* synthetic */ k(long j, a2.p pVar, i iVar) {
        this(j, pVar);
    }

    public final a2.p a() {
        return this.f16549b;
    }

    public final long b() {
        return this.f16548a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        k kVar = (k) obj;
        return d0.n(this.f16548a, kVar.f16548a) && p.e(this.f16549b, kVar.f16549b);
    }

    public int hashCode() {
        return (d0.t(this.f16548a) * 31) + this.f16549b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + d0.u(this.f16548a) + ", drawPadding=" + this.f16549b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(long j, a2.p pVar, int i11, i iVar) {
        this((i11 & 1) != 0 ? f0.c(4284900966L) : j, (i11 & 2) != 0 ? PaddingKt.c(0.0f, 0.0f, 3, (Object) null) : pVar, (i) null);
    }
}
