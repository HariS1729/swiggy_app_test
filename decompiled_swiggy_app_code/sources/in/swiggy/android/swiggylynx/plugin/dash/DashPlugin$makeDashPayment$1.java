package in.swiggy.android.swiggylynx.plugin.dash;

import bp0.k;
import in.swiggy.android.swiggylynx.plugin.dash.payment.DashPaymentPayload;
import kotlin.jvm.internal.Lambda;
import lp.b;
import lp0.a;

/* compiled from: DashPlugin.kt */
final class DashPlugin$makeDashPayment$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DashPlugin f19091a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f19092b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f19093c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f19094d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DashPlugin$makeDashPayment$1(DashPlugin dashPlugin, b bVar, String str, String str2) {
        super(0);
        this.f19091a = dashPlugin;
        this.f19092b = bVar;
        this.f19093c = str;
        this.f19094d = str2;
    }

    public final void invoke() {
        this.f19091a.c1(this.f19093c, this.f19094d, this.f19091a.f1(((DashPaymentPayload) this.f19092b).b().toString()));
    }
}
