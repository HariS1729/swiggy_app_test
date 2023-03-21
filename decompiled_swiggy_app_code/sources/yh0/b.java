package yh0;

import android.content.SharedPreferences;
import cf0.i;
import cg0.n;
import cg0.o;
import ef0.e;
import in.juspay.hyper.constants.LogSubCategory;
import jr.a;
import kotlin.jvm.internal.p;
import okhttp3.OkHttpClient;
import ru.c;
import us.f;
import us.g;

/* compiled from: LynxFragmentDependencies.kt */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final OkHttpClient f20033a;

    /* renamed from: b  reason: collision with root package name */
    private final e f20034b;

    /* renamed from: c  reason: collision with root package name */
    private final n f20035c;

    /* renamed from: d  reason: collision with root package name */
    private final fr.e f20036d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f20037e;

    /* renamed from: f  reason: collision with root package name */
    private final ps.b f20038f;

    /* renamed from: g  reason: collision with root package name */
    private final c f20039g;

    /* renamed from: h  reason: collision with root package name */
    private final f f20040h;

    /* renamed from: i  reason: collision with root package name */
    private final i f20041i;
    private final o j;
    private final jz.c k;

    /* renamed from: l  reason: collision with root package name */
    private final g f20042l;

    /* renamed from: m  reason: collision with root package name */
    private final a f20043m;

    public b(OkHttpClient okHttpClient, e eVar, n nVar, fr.e eVar2, SharedPreferences sharedPreferences, ps.b bVar, c cVar, f fVar, i iVar, o oVar, jz.c cVar2, g gVar, a aVar) {
        p.j(okHttpClient, "okhttp");
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(nVar, "locationContext");
        p.j(eVar2, "mSwiggyEventLogger");
        p.j(sharedPreferences, "sharedPreferences");
        p.j(bVar, "contextService");
        p.j(cVar, "fontService");
        p.j(iVar, "cartService");
        p.j(oVar, "userLocationManager");
        p.j(cVar2, "deepLinkHandler");
        p.j(gVar, "viewHandler");
        p.j(aVar, "newrelicPerformanceUtils");
        this.f20033a = okHttpClient;
        this.f20034b = eVar;
        this.f20035c = nVar;
        this.f20036d = eVar2;
        this.f20037e = sharedPreferences;
        this.f20038f = bVar;
        this.f20039g = cVar;
        this.f20040h = fVar;
        this.f20041i = iVar;
        this.j = oVar;
        this.k = cVar2;
        this.f20042l = gVar;
        this.f20043m = aVar;
    }

    public c a() {
        return this.f20039g;
    }

    public e d() {
        return this.f20034b;
    }

    public n e() {
        return this.f20035c;
    }

    public i f() {
        return this.f20041i;
    }

    public ps.b g() {
        return this.f20038f;
    }

    public SharedPreferences getSharedPreferences() {
        return this.f20037e;
    }

    public o h() {
        return this.j;
    }

    public g i() {
        return this.f20042l;
    }

    public fr.e j() {
        return this.f20036d;
    }

    public f k() {
        return this.f20040h;
    }

    public jz.c l() {
        return this.k;
    }

    public a m() {
        return this.f20043m;
    }

    public OkHttpClient n() {
        return this.f20033a;
    }
}
