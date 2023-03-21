package amazonpay.silentpay;

import amazonpay.silentpay.e;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import in.swiggy.android.tejas.payment.model.payment.models.PaymentType;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static o.a f1155a;

    /* renamed from: b  reason: collision with root package name */
    static d f1156b;

    /* renamed from: c  reason: collision with root package name */
    static e.a f1157c;

    /* renamed from: d  reason: collision with root package name */
    static Map<e.a, Long> f1158d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e  reason: collision with root package name */
    static Set<String> f1159e;

    /* renamed from: amazonpay.silentpay.a$a  reason: collision with other inner class name */
    static class C0004a implements a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f1160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PendingIntent f1161b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PendingIntent f1162c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o.a f1163d;

        C0004a(Context context, PendingIntent pendingIntent, PendingIntent pendingIntent2, o.a aVar) {
            this.f1160a = context;
            this.f1161b = pendingIntent;
            this.f1162c = pendingIntent2;
            this.f1163d = aVar;
        }

        public void a(Bundle bundle) {
            String d11 = ProcessChargeResponse.d(bundle);
            if (d11 != null) {
                h.c(this.f1160a, this.f1161b, this.f1162c, this.f1163d, d11);
            } else {
                h.d(this.f1160a, this.f1161b, bundle);
            }
        }

        public void b(APayError aPayError) {
            h.b(this.f1160a, this.f1161b, aPayError.c(), aPayError);
        }
    }

    private static void a(Context context, e.a aVar) {
        r.b(context);
        f1158d.put(aVar, Long.valueOf(System.currentTimeMillis()));
        f1157c = aVar;
        f1156b = d.a(context);
        n.e(context);
    }

    public static Intent b(Context context, o.a aVar) throws IllegalArgumentException {
        a(context, e.a.GET_AUTHORIZATION_INTENT);
        f1155a = aVar;
        boolean z11 = true;
        Object[] objArr = new Object[1];
        if (aVar == null) {
            z11 = false;
        }
        objArr[0] = String.valueOf(z11);
        j.a(PaymentType.AMAZONPAY, String.format("getAuthorizationIntent called. Custom tab intent supplied: %s", objArr));
        return new Intent(context, APayActivity.class);
    }

    public static void c(Context context, f fVar, a.a aVar) throws IllegalArgumentException {
        r.a(fVar, "GetBalanceRequest");
        r.a(aVar, "APayCallback");
        e.a aVar2 = e.a.GET_BALANCE;
        a(context, aVar2);
        h.a(context, fVar, aVar, aVar2);
    }

    public static void d(Context context, b bVar, a.a aVar) throws IllegalArgumentException {
        r.a(bVar, "GetChargeRequest");
        r.a(aVar, "APay callback");
        e.a aVar2 = e.a.GET_CHARGE_STATUS;
        a(context, aVar2);
        j.a(PaymentType.AMAZONPAY, "getChargeStatus called");
        h.a(context, bVar, aVar, aVar2);
    }

    public static void e(Context context, o.a aVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, b bVar) throws IllegalArgumentException {
        r.a(pendingIntent, "CompletionIntent");
        r.a(bVar, "ProcessChargeRequest");
        e.a aVar2 = e.a.PROCESS_CHARGE;
        a(context, aVar2);
        if (f1159e == null) {
            f1159e = new HashSet();
        }
        f1159e.add(bVar.f());
        Object[] objArr = new Object[3];
        boolean z11 = false;
        objArr[0] = String.valueOf(bVar.f());
        objArr[1] = String.valueOf(aVar != null);
        if (pendingIntent2 != null) {
            z11 = true;
        }
        objArr[2] = String.valueOf(z11);
        j.a(PaymentType.AMAZONPAY, String.format("processCharge called for request id: %s. Custom tab intent supplied: %s , cancel Intent supplied = %s", objArr));
        h.a(context, bVar, new C0004a(context, pendingIntent, pendingIntent2, aVar), aVar2);
    }
}
