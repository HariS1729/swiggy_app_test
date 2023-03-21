package in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin;

import amazonpay.silentpay.GetChargeStatusResponse;
import bp0.k;
import in.swiggy.android.swiggylynx.plugin.payment.amazonpayplugin.payusingamazon.responsedata.CheckChargeStatusResponsePayload;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import zp.b;

/* compiled from: AmazonPlugin.kt */
final class AmazonPlugin$processCheckChargeStatus$1$1 extends Lambda implements l<GetChargeStatusResponse, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f19171a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f19172b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonPlugin$processCheckChargeStatus$1$1(b bVar, String str) {
        super(1);
        this.f19171a = bVar;
        this.f19172b = str;
    }

    public final void a(GetChargeStatusResponse getChargeStatusResponse) {
        p.j(getChargeStatusResponse, "getChargeStatusResponse");
        Map<String, String> b11 = getChargeStatusResponse.b();
        p.i(b11, "getChargeStatusResponse.verificationParameters");
        b.a.a(this.f19171a, this.f19172b, 0, (String) null, new CheckChargeStatusResponsePayload(b11), CheckChargeStatusResponsePayload.Companion.serializer(), 2, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((GetChargeStatusResponse) obj);
        return k.f22762a;
    }
}
