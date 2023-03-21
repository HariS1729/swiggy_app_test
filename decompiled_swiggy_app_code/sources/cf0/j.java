package cf0;

import if0.a;
import kotlin.jvm.internal.p;
import ye0.b;

/* compiled from: IMCartIOService.kt */
public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private a f18120a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18121b = "instamart_cart";

    /* renamed from: c  reason: collision with root package name */
    private ze0.b f18122c;

    public j(a aVar) {
        p.j(aVar, "persistentContextService");
        this.f18120a = aVar;
    }

    public bf0.b a() {
        ze0.b bVar = (ze0.b) this.f18120a.r2(this.f18121b, ze0.b.class);
        this.f18122c = bVar;
        if (bVar == null) {
            this.f18122c = new ze0.b();
        }
        return this.f18122c;
    }

    public void d() {
        this.f18120a.S1(this.f18121b, this.f18122c);
    }

    public void e() {
        this.f18120a.U(this.f18121b);
    }
}
