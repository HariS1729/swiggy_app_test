package mh0;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import kotlin.jvm.internal.p;

/* compiled from: DeeplinkCreator.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19753a = new a();

    private a() {
    }

    public final String a(String str) {
        p.j(str, "url");
        return p.s("swiggy://chat?url=", str);
    }

    public final String b(String str, String str2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "tenant");
        return "swiggy://order-detail?id=" + str + "&tenant=" + str2;
    }

    public final String c(String str, String str2, boolean z11) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "tenant");
        return "swiggy://order-detail?id=" + str + "&tenant=" + str2 + "&expandRefund=" + z11;
    }

    public final String d() {
        return "swiggy://refundHistory";
    }

    public final String e(String str) {
        p.j(str, "orderId");
        return p.s("swiggy://timeline?orderJobId=", str);
    }
}
