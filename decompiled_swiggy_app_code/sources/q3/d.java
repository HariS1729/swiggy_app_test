package q3;

import androidx.slice.Slice;
import androidx.slice.SliceSpec;
import o3.a;
import o3.g;

/* compiled from: TemplateBuilderImpl */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private Slice.a f16372a;

    /* renamed from: b  reason: collision with root package name */
    private final SliceSpec f16373b;

    /* renamed from: c  reason: collision with root package name */
    private a f16374c;

    protected d(Slice.a aVar, SliceSpec sliceSpec) {
        this(aVar, sliceSpec, new g());
    }

    public abstract void c(Slice.a aVar);

    public Slice d() {
        this.f16372a.o(this.f16373b);
        c(this.f16372a);
        return this.f16372a.m();
    }

    public Slice.a e() {
        return new Slice.a(this.f16372a);
    }

    public Slice.a f() {
        return this.f16372a;
    }

    public a g() {
        return this.f16374c;
    }

    /* access modifiers changed from: protected */
    public void h(Slice.a aVar) {
        this.f16372a = aVar;
    }

    protected d(Slice.a aVar, SliceSpec sliceSpec, a aVar2) {
        this.f16372a = aVar;
        this.f16373b = sliceSpec;
        this.f16374c = aVar2;
    }
}
