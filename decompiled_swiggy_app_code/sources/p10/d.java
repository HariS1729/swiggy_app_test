package p10;

import android.content.SharedPreferences;
import ba0.c;
import ba0.e;
import fb0.i;
import in.swiggy.android.fragments.AccountFragment;
import in.swiggy.android.fragmentservices.impl.AccountFragmentService;
import in.swiggy.android.tejas.feature.address.model.AddressTag;
import in.swiggy.android.tejas.generated.ISwiggyNetworkWrapper;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import kotlin.jvm.internal.p;
import p90.a;
import pc0.t;
import pl0.d2;
import x40.b;

/* compiled from: AccountFragmentModule.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f16203a = new d();

    private d() {
    }

    public final c a(AccountFragment accountFragment, d2 d2Var) {
        p.j(accountFragment, "fragment");
        p.j(d2Var, "appUpdateManager");
        AccountFragmentService accountFragmentService = new AccountFragmentService(accountFragment, d2Var);
        accountFragment.g1().injectMembers(accountFragmentService);
        return accountFragmentService;
    }

    public final ISwiggyNetworkWrapper b(AccountFragment accountFragment, IApiGeneratedService iApiGeneratedService) {
        p.j(accountFragment, "fragment");
        p.j(iApiGeneratedService, "apiGeneratedService");
        return new t(accountFragment, iApiGeneratedService);
    }

    public final b c(e eVar) {
        p.j(eVar, "clickActionNavigationService");
        return new b(eVar);
    }

    public final e d(a aVar, i iVar, jz.c cVar, SharedPreferences sharedPreferences) {
        p.j(aVar, "webConstants");
        p.j(iVar, "uiComponent");
        p.j(cVar, "deepLinkHandler");
        p.j(sharedPreferences, "sharedPreferences");
        return new ba0.a(aVar, iVar, cVar, sharedPreferences, AddressTag.TypeString.HOME_TAG_STRING);
    }
}
