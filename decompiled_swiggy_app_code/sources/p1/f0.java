package p1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: TtsAnnotation.kt */
public final class f0 extends e0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f16091a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(String str) {
        super((i) null);
        p.j(str, "verbatim");
        this.f16091a = str;
    }

    public final String a() {
        return this.f16091a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && p.e(this.f16091a, ((f0) obj).f16091a);
    }

    public int hashCode() {
        return this.f16091a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f16091a + ')';
    }
}
