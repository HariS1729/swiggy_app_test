package j0;

import k0.c;

/* compiled from: PersistentOrderedSet.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f15257a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f15258b;

    public a(Object obj, Object obj2) {
        this.f15257a = obj;
        this.f15258b = obj2;
    }

    public final boolean a() {
        return this.f15258b != c.f15321a;
    }

    public final boolean b() {
        return this.f15257a != c.f15321a;
    }

    public final Object c() {
        return this.f15258b;
    }

    public final Object d() {
        return this.f15257a;
    }

    public final a e(Object obj) {
        return new a(this.f15257a, obj);
    }

    public final a f(Object obj) {
        return new a(obj, this.f15258b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a() {
        /*
            r1 = this;
            k0.c r0 = k0.c.f15321a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.<init>():void");
    }

    public a(Object obj) {
        this(obj, c.f15321a);
    }
}
