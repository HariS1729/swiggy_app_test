package xh0;

import in.swiggy.android.swiggylynx.ui.fragment.LynxTransactionType;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LynxWebViewConfig.kt */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f20006a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20007b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f20008c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f20009d;

    /* renamed from: e  reason: collision with root package name */
    private final String f20010e;

    /* renamed from: f  reason: collision with root package name */
    private final LynxTransactionType f20011f;

    /* renamed from: g  reason: collision with root package name */
    private final String f20012g;

    public m(String str, String str2, Map<String, String> map, boolean z11, String str3, LynxTransactionType lynxTransactionType, String str4) {
        p.j(str, "url");
        p.j(str2, "webFlow");
        p.j(map, "headers");
        p.j(lynxTransactionType, "transactionType");
        this.f20006a = str;
        this.f20007b = str2;
        this.f20008c = map;
        this.f20009d = z11;
        this.f20010e = str3;
        this.f20011f = lynxTransactionType;
        this.f20012g = str4;
    }

    public final boolean a() {
        return this.f20009d;
    }

    public final Map<String, String> b() {
        return this.f20008c;
    }

    public final LynxTransactionType c() {
        return this.f20011f;
    }

    public final String d() {
        return this.f20006a;
    }

    public final String e() {
        return this.f20007b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p.e(this.f20006a, mVar.f20006a) && p.e(this.f20007b, mVar.f20007b) && p.e(this.f20008c, mVar.f20008c) && this.f20009d == mVar.f20009d && p.e(this.f20010e, mVar.f20010e) && this.f20011f == mVar.f20011f && p.e(this.f20012g, mVar.f20012g);
    }

    public int hashCode() {
        int hashCode = ((((this.f20006a.hashCode() * 31) + this.f20007b.hashCode()) * 31) + this.f20008c.hashCode()) * 31;
        boolean z11 = this.f20009d;
        if (z11) {
            z11 = true;
        }
        int i11 = (hashCode + (z11 ? 1 : 0)) * 31;
        String str = this.f20010e;
        int i12 = 0;
        int hashCode2 = (((i11 + (str == null ? 0 : str.hashCode())) * 31) + this.f20011f.hashCode()) * 31;
        String str2 = this.f20012g;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return hashCode2 + i12;
    }

    public String toString() {
        return "LynxWebViewConfig(url=" + this.f20006a + ", webFlow=" + this.f20007b + ", headers=" + this.f20008c + ", clearHistory=" + this.f20009d + ", title=" + this.f20010e + ", transactionType=" + this.f20011f + ", backClickUrl=" + this.f20012g + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, String str2, Map map, boolean z11, String str3, LynxTransactionType lynxTransactionType, String str4, int i11, i iVar) {
        this(str, str2, map, z11, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? LynxTransactionType.ADD : lynxTransactionType, str4);
    }
}
