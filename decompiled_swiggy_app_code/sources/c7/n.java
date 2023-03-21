package c7;

import kotlin.jvm.internal.i;

/* compiled from: ImageLoaderOptions.kt */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12868a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12869b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12870c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12871d;

    public n(boolean z11, boolean z12, boolean z13, int i11) {
        this.f12868a = z11;
        this.f12869b = z12;
        this.f12870c = z13;
        this.f12871d = i11;
    }

    public final boolean a() {
        return this.f12868a;
    }

    public final int b() {
        return this.f12871d;
    }

    public final boolean c() {
        return this.f12869b;
    }

    public final boolean d() {
        return this.f12870c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(boolean z11, boolean z12, boolean z13, int i11, int i12, i iVar) {
        this((i12 & 1) != 0 ? true : z11, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? true : z13, (i12 & 8) != 0 ? 4 : i11);
    }
}
