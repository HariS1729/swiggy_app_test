package amazonpay.silentpay;

import amazonpay.silentpay.APayError;
import amazonpay.silentpay.e;
import amazonpay.silentpay.i;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import com.amazon.identity.auth.device.AuthError;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.network.HttpRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import org.json.JSONObject;

@Instrumented
final class h {

    static class a implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f1242a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f1243b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a.a f1244c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f1245d;

        a(e.a aVar, k kVar, a.a aVar2, Context context) {
            this.f1242a = aVar;
            this.f1243b = kVar;
            this.f1244c = aVar2;
            this.f1245d = context;
        }

        public boolean handleMessage(Message message) {
            if (message.getData().containsKey("TOKEN")) {
                n.d(i.a.TOKEN_FETCH_SUCCESSFUL);
                String string = message.getData().getString("TOKEN");
                int i11 = f.f1251a[this.f1242a.ordinal()];
                if (i11 == 1) {
                    h.l(string, (f) this.f1243b, this.f1244c);
                } else if (i11 == 2) {
                    h.n(string, (b) this.f1243b, this.f1244c);
                } else if (i11 == 3) {
                    h.k(string, (b) this.f1243b, this.f1244c, this.f1245d);
                } else if (i11 == 4) {
                    h.m(string, (b) this.f1243b, this.f1244c);
                }
            } else if (message.getData().containsKey("AUTH_ERROR")) {
                n.d(i.a.TOKEN_FETCH_FAILED);
                this.f1244c.b(new APayError(APayError.ErrorType.AUTH_ERROR, (AuthError) message.getData().getSerializable("AUTH_ERROR")));
            } else {
                n.d(i.a.TOKEN_FETCH_FAILED);
                this.f1244c.b(new APayError(APayError.ErrorType.APAY_ERROR, "Unable to authenticate user"));
            }
            return true;
        }
    }

    static class b implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.a f1246a;

        b(a.a aVar) {
            this.f1246a = aVar;
        }

        public boolean handleMessage(Message message) {
            if (message == null || message.getData() == null) {
                n.d(i.a.GET_BALANCE_FAILED);
                this.f1246a.b(new APayError(APayError.ErrorType.APAY_ERROR, "Unable to retrieve balance"));
                return true;
            } else if (message.getData().containsKey("RESPONSE")) {
                Bundle bundle = new Bundle();
                bundle.putString("GET_BALANCE_RESPONSE", message.getData().getString("RESPONSE"));
                n.c(e.a.GET_BALANCE);
                this.f1246a.a(bundle);
                return true;
            } else if (message.getData().containsKey("AUTH_ERROR")) {
                n.d(i.a.GET_BALANCE_FAILED);
                this.f1246a.b((APayError) message.getData().getSerializable("AUTH_ERROR"));
                return true;
            } else {
                n.d(i.a.GET_BALANCE_FAILED);
                this.f1246a.b(new APayError(APayError.ErrorType.APAY_SERVICE_ERROR, "Received unexpected response for get balance"));
                return true;
            }
        }
    }

    static class c implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.a f1247a;

        c(a.a aVar) {
            this.f1247a = aVar;
        }

        public boolean handleMessage(Message message) {
            if (message == null || message.getData() == null) {
                n.d(i.a.GET_CUSTOMER_INFO_FAILED);
                this.f1247a.b(new APayError(APayError.ErrorType.APAY_ERROR, "Unable to retrieve customer info"));
                return true;
            } else if (message.getData().containsKey("RESPONSE")) {
                Bundle bundle = new Bundle();
                bundle.putString("GET_CUSTOMER_INFO_RESPONSE", message.getData().getString("RESPONSE"));
                this.f1247a.a(bundle);
                return true;
            } else if (message.getData().containsKey("AUTH_ERROR")) {
                n.d(i.a.GET_CUSTOMER_INFO_FAILED);
                this.f1247a.b((APayError) message.getData().getSerializable("AUTH_ERROR"));
                return true;
            } else {
                n.d(i.a.GET_CUSTOMER_INFO_FAILED);
                this.f1247a.b(new APayError(APayError.ErrorType.APAY_SERVICE_ERROR, "Received unexpected response for get customer info"));
                return true;
            }
        }
    }

    static class d implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.a f1248a;

        d(a.a aVar) {
            this.f1248a = aVar;
        }

        public boolean handleMessage(Message message) {
            if (message == null || message.getData() == null) {
                n.d(i.a.PROCESS_CHARGE_FAILED);
                this.f1248a.b(new APayError(APayError.ErrorType.APAY_ERROR, "Unable to process charge"));
                return true;
            } else if (message.getData().containsKey("RESPONSE")) {
                Bundle bundle = new Bundle();
                bundle.putString("PROCESS_CHARGE_RESPONSE", message.getData().getString("RESPONSE"));
                this.f1248a.a(bundle);
                return true;
            } else if (message.getData().containsKey("AUTH_ERROR")) {
                n.d(i.a.PROCESS_CHARGE_FAILED);
                this.f1248a.b((APayError) message.getData().getSerializable("AUTH_ERROR"));
                return true;
            } else {
                n.d(i.a.PROCESS_CHARGE_FAILED);
                this.f1248a.b(new APayError(APayError.ErrorType.APAY_SERVICE_ERROR, "Received unexpected response for process charge"));
                return true;
            }
        }
    }

    static class e implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.a f1249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1250b;

        e(a.a aVar, Context context) {
            this.f1249a = aVar;
            this.f1250b = context;
        }

        public boolean handleMessage(Message message) {
            if (message == null || message.getData() == null) {
                n.d(i.a.GET_CHARGE_STATUS_FAILED);
                this.f1249a.b(new APayError(APayError.ErrorType.APAY_ERROR, "Unable to get charge status"));
                return true;
            } else if (message.getData().containsKey("RESPONSE")) {
                Bundle bundle = new Bundle();
                bundle.putString("GET_CHARGE_STATUS_RESPONSE", message.getData().getString("RESPONSE"));
                try {
                    if (!l.a(this.f1250b.getApplicationContext(), "MEMORY_STATE").equalsIgnoreCase("LOW_MEMORY") || new JSONObject(new JSONObject(message.getData().getString("RESPONSE")).getString("response")).getString("transactionStatusCode").equalsIgnoreCase("01")) {
                        n.c(e.a.GET_CHARGE_STATUS);
                        this.f1249a.a(bundle);
                        return true;
                    }
                    l.c(this.f1250b.getApplicationContext(), "MEMORY_STATE");
                    n.c(e.a.GET_CHARGE_STATUS);
                    this.f1249a.a(bundle);
                    return true;
                } catch (FileNotFoundException unused) {
                    n.c(e.a.GET_CHARGE_STATUS);
                    this.f1249a.a(bundle);
                    return true;
                } catch (Exception unused2) {
                    this.f1249a.b(new APayError(APayError.ErrorType.APAY_ERROR, "error while performing get charge status in low memory state"));
                    return true;
                }
            } else if (message.getData().containsKey("AUTH_ERROR")) {
                n.d(i.a.GET_CHARGE_STATUS_FAILED);
                this.f1249a.b((APayError) message.getData().getSerializable("AUTH_ERROR"));
                return true;
            } else {
                n.d(i.a.GET_CHARGE_STATUS_FAILED);
                this.f1249a.b(new APayError(APayError.ErrorType.APAY_SERVICE_ERROR, "Received unexpected response for get charge status"));
                return true;
            }
        }
    }

    static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1251a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                amazonpay.silentpay.e$a[] r0 = amazonpay.silentpay.e.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1251a = r0
                amazonpay.silentpay.e$a r1 = amazonpay.silentpay.e.a.GET_BALANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1251a     // Catch:{ NoSuchFieldError -> 0x001d }
                amazonpay.silentpay.e$a r1 = amazonpay.silentpay.e.a.PROCESS_CHARGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1251a     // Catch:{ NoSuchFieldError -> 0x0028 }
                amazonpay.silentpay.e$a r1 = amazonpay.silentpay.e.a.GET_CHARGE_STATUS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1251a     // Catch:{ NoSuchFieldError -> 0x0033 }
                amazonpay.silentpay.e$a r1 = amazonpay.silentpay.e.a.GET_CUSTOMER_INFO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: amazonpay.silentpay.h.f.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void a(android.content.Context r3, amazonpay.silentpay.k r4, a.a r5, amazonpay.silentpay.e.a r6) {
        /*
            java.lang.Class<amazonpay.silentpay.h> r0 = amazonpay.silentpay.h.class
            monitor-enter(r0)
            boolean r1 = amazonpay.silentpay.m.a(r3)     // Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x0017
            amazonpay.silentpay.APayError r3 = new amazonpay.silentpay.APayError     // Catch:{ all -> 0x0043 }
            amazonpay.silentpay.APayError$ErrorType r4 = amazonpay.silentpay.APayError.ErrorType.NETWORK_ERROR     // Catch:{ all -> 0x0043 }
            java.lang.String r6 = "No internet connectivity"
            r3.<init>((amazonpay.silentpay.APayError.ErrorType) r4, (java.lang.String) r6)     // Catch:{ all -> 0x0043 }
            r5.b(r3)     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)
            return
        L_0x0017:
            boolean r1 = i(r3, r6)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0026
            amazonpay.silentpay.h$a r1 = new amazonpay.silentpay.h$a     // Catch:{ all -> 0x0043 }
            r1.<init>(r6, r4, r5, r3)     // Catch:{ all -> 0x0043 }
            amazonpay.silentpay.p.b(r3, r1)     // Catch:{ all -> 0x0043 }
            goto L_0x0041
        L_0x0026:
            int[] r1 = amazonpay.silentpay.h.f.f1251a     // Catch:{ all -> 0x0043 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0043 }
            r6 = r1[r6]     // Catch:{ all -> 0x0043 }
            r1 = 2
            r2 = 0
            if (r6 == r1) goto L_0x003c
            r1 = 3
            if (r6 == r1) goto L_0x0036
            goto L_0x0041
        L_0x0036:
            amazonpay.silentpay.b r4 = (amazonpay.silentpay.b) r4     // Catch:{ all -> 0x0043 }
            k(r2, r4, r5, r3)     // Catch:{ all -> 0x0043 }
            goto L_0x0041
        L_0x003c:
            amazonpay.silentpay.b r4 = (amazonpay.silentpay.b) r4     // Catch:{ all -> 0x0043 }
            n(r2, r4, r5)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r0)
            return
        L_0x0043:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: amazonpay.silentpay.h.a(android.content.Context, amazonpay.silentpay.k, a.a, amazonpay.silentpay.e$a):void");
    }

    static synchronized void b(Context context, PendingIntent pendingIntent, APayError.ErrorType errorType, Exception exc) {
        synchronized (h.class) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString(errorType.name(), (String) null);
                if (exc.getMessage() != null) {
                    bundle.putString("ERROR_MESSAGE", exc.getMessage());
                }
                if (exc.getCause() != null) {
                    bundle.putSerializable("ERROR_CAUSE", exc.getCause());
                }
                if (errorType == APayError.ErrorType.AUTH_ERROR) {
                    bundle.putSerializable("AUTH_ERROR_TYPE", ((AuthError) exc).W3());
                }
                Intent intent = new Intent();
                intent.putExtras(bundle);
                pendingIntent.send(context, -1, intent);
            } catch (PendingIntent.CanceledException e11) {
                j.g("PaymentsManager", "Unable to start completionIntent", e11);
            }
        }
        return;
    }

    static synchronized void c(Context context, PendingIntent pendingIntent, PendingIntent pendingIntent2, o.a aVar, String str) {
        synchronized (h.class) {
            if (!str.contains("auth_sp?")) {
                h(aVar, context, pendingIntent, pendingIntent2, str);
            } else {
                final String str2 = str;
                final o.a aVar2 = aVar;
                final Context context2 = context;
                final PendingIntent pendingIntent3 = pendingIntent;
                final PendingIntent pendingIntent4 = pendingIntent2;
                p.b(context, new Handler.Callback() {
                    public boolean handleMessage(Message message) {
                        if (message.getData().containsKey("TOKEN")) {
                            n.d(i.a.TOKEN_FETCH_SUCCESSFUL);
                            h.h(aVar2, context2, pendingIntent3, pendingIntent4, q.a(Uri.parse(str2), new HashMap<String, String>(message.getData().getString("TOKEN")) {

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ String f1240a;

                                {
                                    this.f1240a = r2;
                                    put("authToken", Base64.encodeToString(r2.getBytes(), 0));
                                }
                            }).toString());
                            return true;
                        } else if (message.getData().containsKey("AUTH_ERROR")) {
                            n.d(i.a.TOKEN_FETCH_FAILED);
                            h.b(context2, pendingIntent3, APayError.ErrorType.AUTH_ERROR, (AuthError) message.getData().getSerializable("AUTH_ERROR"));
                            return true;
                        } else {
                            n.d(i.a.TOKEN_FETCH_FAILED);
                            h.b(context2, pendingIntent3, APayError.ErrorType.APAY_ERROR, new RuntimeException("Unable to authenticate user"));
                            return true;
                        }
                    }
                });
            }
        }
    }

    static synchronized void d(Context context, PendingIntent pendingIntent, Bundle bundle) {
        synchronized (h.class) {
            try {
                Intent intent = new Intent();
                intent.putExtras(bundle);
                n.c(e.a.PROCESS_CHARGE);
                pendingIntent.send(context, -1, intent);
            } catch (PendingIntent.CanceledException e11) {
                j.g("PaymentsManager", "Unable to start completionIntent", e11);
            }
        }
        return;
    }

    static void h(o.a aVar, Context context, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str) {
        a.f1155a = aVar;
        Intent intent = new Intent(context, APayActivity.class);
        intent.putExtra("COMPLETION_INTENT", pendingIntent);
        intent.putExtra("CANCEL_INTENT", pendingIntent2);
        intent.putExtra("PAY_URL", str);
        context.startActivity(intent);
    }

    private static boolean i(Context context, e.a aVar) {
        if (aVar != e.a.PROCESS_CHARGE && aVar != e.a.GET_CHARGE_STATUS) {
            return true;
        }
        try {
            String a11 = l.a(context.getApplicationContext(), "MEMORY_STATE");
            if (a11 == null || !a11.equalsIgnoreCase("LOW_MEMORY")) {
                return true;
            }
            return false;
        } catch (IOException e11) {
            j.b("PaymentsManager", "state info not available", e11);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static void k(String str, b bVar, a.a aVar, Context context) {
        c.a().i(str, bVar, new e(aVar, context));
    }

    /* access modifiers changed from: private */
    public static void l(String str, f fVar, a.a aVar) {
        c.a().e(str, fVar, new b(aVar));
    }

    /* access modifiers changed from: private */
    public static void m(String str, b bVar, a.a aVar) {
        c.a().d(str, bVar, new c(aVar));
    }

    /* access modifiers changed from: private */
    public static void n(String str, b bVar, a.a aVar) {
        if (str == null) {
            try {
                String uri = q.b(new URL("https://amazonpay.amazon.in"), new HashMap<String, String>(bVar) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f1234a;

                    {
                        this.f1234a = r4;
                        put("iv", r4.e());
                        put(HttpRequest.HEADER_KEY, r4.d());
                        put(PaymentConstants.PAYLOAD, r4.c());
                        put("requestId", r4.f());
                        put("redirectUrl", String.format("amzn://amazonpay.amazon.in/%s", new Object[]{a.f1156b.v()}));
                        put("lowMemoryFlow", String.valueOf(true));
                    }
                }, "initiatePayment").toString();
                Bundle bundle = new Bundle();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("transactionId", SafeJsonPrimitive.NULL_STRING);
                jSONObject.put("payUrl", uri);
                jSONObject2.put("response", jSONObject);
                jSONObject2.put(PaymentConstants.SIGNATURE, SafeJsonPrimitive.NULL_STRING);
                bundle.putString("PROCESS_CHARGE_RESPONSE", JSONObjectInstrumentation.toString(jSONObject2));
                aVar.a(bundle);
            } catch (Exception unused) {
                j.f("PaymentsManager", "error while making a process charge call");
                aVar.b(new APayError(APayError.ErrorType.APAY_ERROR, "error while making process charge call"));
            }
        } else {
            c.a().h(str, bVar, new d(aVar));
        }
    }
}
