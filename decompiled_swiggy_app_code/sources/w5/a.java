package w5;

import a6.b;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: AdvertisingIDHelper */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f17498c = "co.hyperverge.hypersnapsdk.c.a";

    /* renamed from: d  reason: collision with root package name */
    static a f17499d;

    /* renamed from: a  reason: collision with root package name */
    b f17500a = b.a();

    /* renamed from: b  reason: collision with root package name */
    String f17501b = null;

    /* renamed from: w5.a$a  reason: collision with other inner class name */
    /* compiled from: AdvertisingIDHelper */
    class C0206a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f17502a;

        C0206a(Context context) {
            this.f17502a = context;
        }

        public void run() {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f17502a.getApplicationContext());
                a.this.f17501b = advertisingIdInfo != null ? advertisingIdInfo.getId() : null;
            } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException e11) {
                Log.e(a.f17498c, e11.getMessage());
            }
        }
    }

    public static a a() {
        if (f17499d == null) {
            f17499d = new a();
        }
        return f17499d;
    }

    public void b(Context context) {
        if (this.f17501b == null) {
            this.f17500a.b(new C0206a(context));
        }
    }
}
