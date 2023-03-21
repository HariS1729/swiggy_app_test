package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import defpackage.q1;

/* renamed from: d  reason: default package */
public class d extends z1<q1> {

    /* renamed from: d  reason: collision with root package name */
    private static final String f13796d = d.class.getName();

    public d() {
        k1.i(f13796d, "ThirdPartyAuthorizationServiceInterface created");
    }

    public IInterface a(IBinder iBinder) {
        return q1.a.u(iBinder);
    }

    public Class<q1> b() {
        return q1.class;
    }
}
