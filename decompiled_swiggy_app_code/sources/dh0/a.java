package dh0;

import java.util.HashMap;
import kotlin.jvm.internal.p;

/* compiled from: PaymentNewrelicLoggingUtil.kt */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f18254a;

    /* renamed from: b  reason: collision with root package name */
    private final jr.a f18255b;

    public a(String str, jr.a aVar) {
        p.j(str, "paymentType");
        p.j(aVar, "newrelicePerformanceUtils");
        this.f18254a = str;
        this.f18255b = aVar;
    }

    public final void a(String str, String str2) {
        String str3 = this.f18254a + '_' + str2;
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        hashMap.put("payment_platform", "web");
        this.f18255b.b(p.s(this.f18254a, "_error_event"), hashMap);
    }
}
