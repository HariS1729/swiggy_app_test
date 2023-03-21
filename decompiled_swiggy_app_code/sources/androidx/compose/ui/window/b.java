package androidx.compose.ui.window;

import a0.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AndroidDialog.android.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7860a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7861b;

    /* renamed from: c  reason: collision with root package name */
    private final SecureFlagPolicy f7862c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7863d;

    public b() {
        this(false, false, (SecureFlagPolicy) null, false, 15, (i) null);
    }

    public b(boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy, boolean z13) {
        p.j(secureFlagPolicy, "securePolicy");
        this.f7860a = z11;
        this.f7861b = z12;
        this.f7862c = secureFlagPolicy;
        this.f7863d = z13;
    }

    public final boolean a() {
        return this.f7860a;
    }

    public final boolean b() {
        return this.f7861b;
    }

    public final SecureFlagPolicy c() {
        return this.f7862c;
    }

    public final boolean d() {
        return this.f7863d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7860a == bVar.f7860a && this.f7861b == bVar.f7861b && this.f7862c == bVar.f7862c && this.f7863d == bVar.f7863d;
    }

    public int hashCode() {
        return (((((h.a(this.f7860a) * 31) + h.a(this.f7861b)) * 31) + this.f7862c.hashCode()) * 31) + h.a(this.f7863d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy, boolean z13, int i11, i iVar) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i11 & 8) != 0 ? true : z13);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy, int i11, i iVar) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy) {
        this(z11, z12, secureFlagPolicy, true);
        p.j(secureFlagPolicy, "securePolicy");
    }
}
