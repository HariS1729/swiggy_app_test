package in.swiggy.android.services;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.apiinterface.ISpnsApi;
import in.swiggy.android.tejas.oldapi.network.requests.PostableDeviceAddSPNS;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import os.u;
import retrofit2.Response;
import wp0.j0;

@d(c = "in.swiggy.android.services.RegistrationWorker$sendRegistrationToServer$$inlined$ioWith$1", f = "RegistrationWorker.kt", l = {63}, m = "invokeSuspend")
/* compiled from: DispatchProvider.kt */
public final class RegistrationWorker$sendRegistrationToServer$$inlined$ioWith$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18659a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f18660b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RegistrationWorker f18661c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostableDeviceAddSPNS f18662d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegistrationWorker$sendRegistrationToServer$$inlined$ioWith$1(c cVar, RegistrationWorker registrationWorker, PostableDeviceAddSPNS postableDeviceAddSPNS) {
        super(2, cVar);
        this.f18661c = registrationWorker;
        this.f18662d = postableDeviceAddSPNS;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        RegistrationWorker$sendRegistrationToServer$$inlined$ioWith$1 registrationWorker$sendRegistrationToServer$$inlined$ioWith$1 = new RegistrationWorker$sendRegistrationToServer$$inlined$ioWith$1(cVar, this.f18661c, this.f18662d);
        registrationWorker$sendRegistrationToServer$$inlined$ioWith$1.f18660b = obj;
        return registrationWorker$sendRegistrationToServer$$inlined$ioWith$1;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((RegistrationWorker$sendRegistrationToServer$$inlined$ioWith$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f18659a;
        if (i11 == 0) {
            g.b(obj);
            j0 j0Var = (j0) this.f18660b;
            ISpnsApi E = this.f18661c.n;
            PostableDeviceAddSPNS postableDeviceAddSPNS = this.f18662d;
            this.f18659a = 1;
            obj = E.registerDeviceSPNS(postableDeviceAddSPNS, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            try {
                g.b(obj);
            } catch (Exception e11) {
                u.h("RegIntentService", e11);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Response response = (Response) obj;
        if (!response.isSuccessful()) {
            SwiggyBaseResponse swiggyBaseResponse = (SwiggyBaseResponse) response.body();
            HashMap hashMap = new HashMap();
            if (swiggyBaseResponse != null) {
                Integer statusCode = swiggyBaseResponse.getStatusCode();
                if (statusCode != null) {
                    hashMap.put("status_code", a.d(statusCode.intValue()));
                }
            }
            if (swiggyBaseResponse != null) {
                String statusMessage = swiggyBaseResponse.getStatusMessage();
                if (statusMessage != null) {
                    hashMap.put("status_message", statusMessage);
                }
            }
            this.f18661c.f18658m.e("registration_worker_trace", "fcm_token_update_failed", hashMap);
        }
        return k.f22762a;
    }
}
