package amazonpay.silentpay;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.api.authorization.c;

final class p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static Handler.Callback f1281a;

    private static class b implements f8.a<c, AuthError> {

        /* renamed from: a  reason: collision with root package name */
        private final Message f1282a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f1283b;

        private b() {
            this.f1282a = new Message();
            this.f1283b = new Bundle();
        }

        /* renamed from: e */
        public void c(AuthError authError) {
            this.f1283b.putSerializable("AUTH_ERROR", authError);
            this.f1282a.setData(new Bundle());
            p.f1281a.handleMessage(this.f1282a);
        }

        /* renamed from: f */
        public void onSuccess(c cVar) {
            if (cVar.a() != null) {
                this.f1283b.putString("TOKEN", cVar.a());
                this.f1282a.setData(this.f1283b);
            }
            p.f1281a.handleMessage(this.f1282a);
        }
    }

    static void b(Context context, Handler.Callback callback) {
        f1281a = callback;
        com.amazon.identity.auth.device.api.authorization.a.c(context, a.f1156b.u(), new b());
    }
}
