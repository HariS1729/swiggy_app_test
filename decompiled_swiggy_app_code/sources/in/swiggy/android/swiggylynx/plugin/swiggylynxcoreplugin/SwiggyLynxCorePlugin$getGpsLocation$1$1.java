package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin;

import android.location.Location;
import androidx.appcompat.app.AppCompatActivity;
import bp0.k;
import com.google.android.gms.location.i;
import com.google.android.gms.location.j;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import zp.b;

/* compiled from: SwiggyLynxCorePlugin.kt */
final class SwiggyLynxCorePlugin$getGpsLocation$1$1 extends Lambda implements p<AppCompatActivity, j, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwiggyLynxCorePlugin f19400a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f19401b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f19402c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwiggyLynxCorePlugin$getGpsLocation$1$1(SwiggyLynxCorePlugin swiggyLynxCorePlugin, String str, b bVar) {
        super(2);
        this.f19400a = swiggyLynxCorePlugin;
        this.f19401b = str;
        this.f19402c = bVar;
    }

    /* access modifiers changed from: private */
    public static final void c(SwiggyLynxCorePlugin swiggyLynxCorePlugin, String str, b bVar, AppCompatActivity appCompatActivity, Location location) {
        kotlin.jvm.internal.p.j(swiggyLynxCorePlugin, "this$0");
        kotlin.jvm.internal.p.j(str, "$requestId");
        kotlin.jvm.internal.p.j(bVar, "$responseHandler");
        kotlin.jvm.internal.p.j(appCompatActivity, "$fragmentActivity");
        if (location != null) {
            swiggyLynxCorePlugin.P1(location, str, bVar);
        } else {
            swiggyLynxCorePlugin.V1(appCompatActivity, swiggyLynxCorePlugin.C1(), str, bVar);
        }
    }

    public final void b(AppCompatActivity appCompatActivity, j jVar) {
        kotlin.jvm.internal.p.j(appCompatActivity, "fragmentActivity");
        kotlin.jvm.internal.p.j(jVar, "settingResponse");
        if (jVar.f().x0()) {
            i.a(appCompatActivity).b().g(appCompatActivity, new a(this.f19400a, this.f19401b, this.f19402c, appCompatActivity));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        b((AppCompatActivity) obj, (j) obj2);
        return k.f22762a;
    }
}
