package u1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FontFamily.kt */
public final class x extends i0 {

    /* renamed from: h  reason: collision with root package name */
    private final String f16965h;

    /* renamed from: i  reason: collision with root package name */
    private final String f16966i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(String str, String str2) {
        super((i) null);
        p.j(str, "name");
        p.j(str2, "fontFamilyName");
        this.f16965h = str;
        this.f16966i = str2;
    }

    public final String f() {
        return this.f16965h;
    }

    public String toString() {
        return this.f16966i;
    }
}
