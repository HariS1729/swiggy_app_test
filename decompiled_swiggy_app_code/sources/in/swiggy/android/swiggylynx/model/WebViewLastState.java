package in.swiggy.android.swiggylynx.model;

import fq0.d;
import gq0.a1;
import gq0.x0;
import hq0.a;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import lp.b;

/* compiled from: WebViewLastState.kt */
public final class WebViewLastState extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final JsonElement f18962a;

    /* renamed from: b  reason: collision with root package name */
    private final JsonElement f18963b;

    /* renamed from: c  reason: collision with root package name */
    private String f18964c;

    /* renamed from: d  reason: collision with root package name */
    private final String f18965d;

    /* compiled from: WebViewLastState.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<WebViewLastState> serializer() {
            return WebViewLastState$$serializer.INSTANCE;
        }
    }

    public WebViewLastState() {
        this((JsonElement) null, (JsonElement) null, (String) null, (String) null, 15, (i) null);
    }

    public /* synthetic */ WebViewLastState(int i11, JsonElement jsonElement, JsonElement jsonElement2, String str, String str2, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) == 0) {
            this.f18962a = null;
        } else {
            this.f18962a = jsonElement;
        }
        if ((i11 & 2) == 0) {
            this.f18963b = null;
        } else {
            this.f18963b = jsonElement2;
        }
        if ((i11 & 4) == 0) {
            this.f18964c = null;
        } else {
            this.f18964c = str;
        }
        if ((i11 & 8) == 0) {
            this.f18965d = null;
        } else {
            this.f18965d = str2;
        }
    }

    public static final void f(WebViewLastState webViewLastState, d dVar, SerialDescriptor serialDescriptor) {
        p.j(webViewLastState, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || webViewLastState.f18962a != null) {
            dVar.E(serialDescriptor, 0, JsonElementSerializer.f26449b, webViewLastState.f18962a);
        }
        if (dVar.o(serialDescriptor, 1) || webViewLastState.f18963b != null) {
            dVar.E(serialDescriptor, 1, JsonElementSerializer.f26449b, webViewLastState.f18963b);
        }
        if (dVar.o(serialDescriptor, 2) || webViewLastState.f18964c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, webViewLastState.f18964c);
        }
        if (dVar.o(serialDescriptor, 3) || webViewLastState.f18965d != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 3, a1.f23069b, webViewLastState.f18965d);
        }
    }

    public final String b() {
        return this.f18965d;
    }

    public final PaymentType c() {
        PaymentType paymentType;
        PaymentType[] values = PaymentType.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                paymentType = null;
                break;
            }
            paymentType = values[i11];
            if (o.x(paymentType.getIdentifier(), b(), true)) {
                break;
            }
            i11++;
        }
        return paymentType == null ? PaymentType.NONE : paymentType;
    }

    public final String d() {
        return a.f23147b.c(Companion.serializer(), this);
    }

    public final void e(String str) {
        this.f18964c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewLastState)) {
            return false;
        }
        WebViewLastState webViewLastState = (WebViewLastState) obj;
        return p.e(this.f18962a, webViewLastState.f18962a) && p.e(this.f18963b, webViewLastState.f18963b) && p.e(this.f18964c, webViewLastState.f18964c) && p.e(this.f18965d, webViewLastState.f18965d);
    }

    public int hashCode() {
        JsonElement jsonElement = this.f18962a;
        int i11 = 0;
        int hashCode = (jsonElement == null ? 0 : jsonElement.hashCode()) * 31;
        JsonElement jsonElement2 = this.f18963b;
        int hashCode2 = (hashCode + (jsonElement2 == null ? 0 : jsonElement2.hashCode())) * 31;
        String str = this.f18964c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18965d;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "WebViewLastState(state=" + this.f18962a + ", infoObject=" + this.f18963b + ", amazonPayTransactionId=" + this.f18964c + ", paymentCode=" + this.f18965d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewLastState(JsonElement jsonElement, JsonElement jsonElement2, String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : jsonElement, (i11 & 2) != 0 ? null : jsonElement2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2);
    }

    public WebViewLastState(JsonElement jsonElement, JsonElement jsonElement2, String str, String str2) {
        this.f18962a = jsonElement;
        this.f18963b = jsonElement2;
        this.f18964c = str;
        this.f18965d = str2;
    }
}
