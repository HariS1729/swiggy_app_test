package v1;

import kotlin.jvm.internal.p;
import p1.b;

/* compiled from: VisualTransformation.kt */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f17069a;

    /* renamed from: b  reason: collision with root package name */
    private final s f17070b;

    public d0(b bVar, s sVar) {
        p.j(bVar, "text");
        p.j(sVar, "offsetMapping");
        this.f17069a = bVar;
        this.f17070b = sVar;
    }

    public final s a() {
        return this.f17070b;
    }

    public final b b() {
        return this.f17069a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p.e(this.f17069a, d0Var.f17069a) && p.e(this.f17070b, d0Var.f17070b);
    }

    public int hashCode() {
        return (this.f17069a.hashCode() * 31) + this.f17070b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + this.f17069a + ", offsetMapping=" + this.f17070b + ')';
    }
}
