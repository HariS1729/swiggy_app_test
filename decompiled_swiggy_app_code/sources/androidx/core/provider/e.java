package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.g;
import java.util.List;

/* compiled from: FontRequest */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f9328a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9329b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9330c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f9331d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9332e;

    /* renamed from: f  reason: collision with root package name */
    private final String f9333f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f9328a = (String) g.g(str);
        this.f9329b = (String) g.g(str2);
        this.f9330c = (String) g.g(str3);
        this.f9331d = (List) g.g(list);
        this.f9332e = 0;
        this.f9333f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f9331d;
    }

    public int c() {
        return this.f9332e;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f9333f;
    }

    public String e() {
        return this.f9328a;
    }

    public String f() {
        return this.f9329b;
    }

    public String g() {
        return this.f9330c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f9328a + ", mProviderPackage: " + this.f9329b + ", mQuery: " + this.f9330c + ", mCertificates:");
        for (int i11 = 0; i11 < this.f9331d.size(); i11++) {
            sb2.append(" [");
            List list = this.f9331d.get(i11);
            for (int i12 = 0; i12 < list.size(); i12++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i12), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f9332e);
        return sb2.toString();
    }

    public e(String str, String str2, String str3, int i11) {
        this.f9328a = (String) g.g(str);
        this.f9329b = (String) g.g(str2);
        this.f9330c = (String) g.g(str3);
        this.f9331d = null;
        g.a(i11 != 0);
        this.f9332e = i11;
        this.f9333f = a(str, str2, str3);
    }
}
