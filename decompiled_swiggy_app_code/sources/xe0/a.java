package xe0;

import android.app.Application;
import android.content.SharedPreferences;
import cf0.h;
import cf0.i;
import cf0.j;
import cg0.n;
import cg0.o;
import dg0.b;
import ef0.c;
import ef0.d;
import if0.f;
import if0.g;
import ig0.e;
import in.swiggy.android.repositories.saveablecontexts.UserLocationManager;
import in.swiggy.android.swiggylocation.utils.eventmanager.interfaces.ILocationEventManager;
import in.swiggy.android.tejas.feature.address.v2.api.IAddressExp;

/* compiled from: RepositoriesDaggerModule */
public abstract class a {
    static i a(Application application, if0.a aVar, n nVar, SharedPreferences sharedPreferences) {
        return new h(new cf0.a(application, aVar, nVar), new j(aVar), sharedPreferences);
    }

    static n b(Application application, String str, ILocationEventManager iLocationEventManager, kg0.a aVar, e eVar, b bVar) {
        return new in.swiggy.android.swiggylocation.location.b(application, str, iLocationEventManager, aVar, eVar, bVar);
    }

    static if0.a c(Application application) {
        return new f(application);
    }

    static ef0.b d(Application application) {
        return new g(application);
    }

    static c e(Application application) {
        return new if0.h(application);
    }

    static ef0.e f(Application application, os.a aVar, IAddressExp iAddressExp) {
        return new if0.j(application, aVar, iAddressExp);
    }

    static o g(n nVar, ef0.e eVar, SharedPreferences sharedPreferences) {
        return new UserLocationManager(nVar, eVar, sharedPreferences);
    }

    static d h() {
        return new ff0.a();
    }
}
