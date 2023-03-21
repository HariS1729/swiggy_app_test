package in.swiggy.android.services;

import android.content.SharedPreferences;
import bp0.g;
import bp0.k;
import ef0.f;
import fp0.c;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.oldapi.network.responses.SettingsMessageResponse;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import pl0.q1;
import wp0.j0;

@d(c = "in.swiggy.android.services.SyncSettingsWorker$doWork$1$1", f = "SyncSettingsWorker.kt", l = {}, m = "invokeSuspend")
/* compiled from: SyncSettingsWorker.kt */
final class SyncSettingsWorker$doWork$1$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18677a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SyncSettingsWorker f18678b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SwiggyApiResponse<SettingsMessageResponse> f18679c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SyncSettingsWorker$doWork$1$1(SyncSettingsWorker syncSettingsWorker, SwiggyApiResponse<SettingsMessageResponse> swiggyApiResponse, c<? super SyncSettingsWorker$doWork$1$1> cVar) {
        super(2, cVar);
        this.f18678b = syncSettingsWorker;
        this.f18679c = swiggyApiResponse;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new SyncSettingsWorker$doWork$1$1(this.f18678b, this.f18679c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SyncSettingsWorker$doWork$1$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f18677a == 0) {
            g.b(obj);
            q1 q1Var = q1.f22471a;
            SharedPreferences B = this.f18678b.k;
            SettingsMessageResponse data = this.f18679c.getData();
            HashMap<String, String> hashMap = null;
            q1Var.b(B, data == null ? null : data.options);
            SharedPreferences B2 = this.f18678b.k;
            SettingsMessageResponse data2 = this.f18679c.getData();
            q1Var.a(B2, data2 == null ? null : data2.messages);
            f C = this.f18678b.f18676l;
            SettingsMessageResponse data3 = this.f18679c.getData();
            if (data3 != null) {
                hashMap = data3.xpConfigMap;
            }
            C.K1(hashMap);
            this.f18678b.k.edit().putLong("settings_api_call_time", System.currentTimeMillis()).apply();
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
