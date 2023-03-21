package n1;

import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: SemanticsProperties.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final a<Float> f15786a;

    /* renamed from: b  reason: collision with root package name */
    private final a<Float> f15787b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15788c;

    public h(a<Float> aVar, a<Float> aVar2, boolean z11) {
        p.j(aVar, "value");
        p.j(aVar2, "maxValue");
        this.f15786a = aVar;
        this.f15787b = aVar2;
        this.f15788c = z11;
    }

    public final a<Float> a() {
        return this.f15787b;
    }

    public final boolean b() {
        return this.f15788c;
    }

    public final a<Float> c() {
        return this.f15786a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.f15786a.invoke().floatValue() + ", maxValue=" + this.f15787b.invoke().floatValue() + ", reverseScrolling=" + this.f15788c + ')';
    }
}
