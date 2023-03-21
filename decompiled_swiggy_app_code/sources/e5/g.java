package e5;

import com.newrelic.agent.android.agentdata.HexAttribute;
import kotlin.jvm.internal.p;

/* compiled from: MuxerConfiguration.kt */
public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    private final String f14386a;

    /* renamed from: b  reason: collision with root package name */
    private final Exception f14387b;

    public g(String str, Exception exc) {
        p.j(str, HexAttribute.HEX_ATTR_MESSAGE);
        p.j(exc, "exception");
        this.f14386a = str;
        this.f14387b = exc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p.e(this.f14386a, gVar.f14386a) && p.e(this.f14387b, gVar.f14387b);
    }

    public int hashCode() {
        String str = this.f14386a;
        int i11 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Exception exc = this.f14387b;
        if (exc != null) {
            i11 = exc.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "MuxingError(message=" + this.f14386a + ", exception=" + this.f14387b + ")";
    }
}
