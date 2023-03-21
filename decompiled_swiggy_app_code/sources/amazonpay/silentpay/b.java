package amazonpay.silentpay;

import java.util.UUID;

public class b extends k {

    /* renamed from: c  reason: collision with root package name */
    private final String f1165c;

    /* renamed from: d  reason: collision with root package name */
    private String f1166d;

    /* renamed from: e  reason: collision with root package name */
    private String f1167e;

    /* renamed from: f  reason: collision with root package name */
    private String f1168f = UUID.randomUUID().toString();

    public b(String str, String str2, String str3, boolean z11) {
        this.f1165c = str;
        this.f1166d = str2;
        this.f1167e = str3;
        this.f1277a = z11;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f1165c;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f1166d;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f1167e;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return this.f1168f;
    }
}
