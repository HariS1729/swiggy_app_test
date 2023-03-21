package androidx.compose.ui.text.platform.extensions;

import kotlin.jvm.internal.p;

/* compiled from: SpannableExtensions.android.kt */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7663a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7664b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7665c;

    public a(Object obj, int i11, int i12) {
        p.j(obj, "span");
        this.f7663a = obj;
        this.f7664b = i11;
        this.f7665c = i12;
    }

    public final Object a() {
        return this.f7663a;
    }

    public final int b() {
        return this.f7664b;
    }

    public final int c() {
        return this.f7665c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p.e(this.f7663a, aVar.f7663a) && this.f7664b == aVar.f7664b && this.f7665c == aVar.f7665c;
    }

    public int hashCode() {
        return (((this.f7663a.hashCode() * 31) + this.f7664b) * 31) + this.f7665c;
    }

    public String toString() {
        return "SpanRange(span=" + this.f7663a + ", start=" + this.f7664b + ", end=" + this.f7665c + ')';
    }
}
