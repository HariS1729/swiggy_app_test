package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility;

import bp0.k;
import in.swiggy.android.swiggylynx.model.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: JuspaySdkWrapper.kt */
final class JuspaySdkWrapper$deEnrollOneClick$1 extends Lambda implements l<String, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ JuspaySdkWrapper f19265a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f19266b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JuspaySdkWrapper$deEnrollOneClick$1(JuspaySdkWrapper juspaySdkWrapper, String str) {
        super(1);
        this.f19265a = juspaySdkWrapper;
        this.f19266b = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return k.f22762a;
    }

    public final void invoke(String str) {
        p.j(str, "it");
        this.f19265a.S(new b(this.f19266b, str));
    }
}
