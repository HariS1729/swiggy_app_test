package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin;

import android.location.Location;
import androidx.appcompat.app.AppCompatActivity;
import zj.f;
import zp.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwiggyLynxCorePlugin f19404a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f19405b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f19406c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f19407d;

    public /* synthetic */ a(SwiggyLynxCorePlugin swiggyLynxCorePlugin, String str, b bVar, AppCompatActivity appCompatActivity) {
        this.f19404a = swiggyLynxCorePlugin;
        this.f19405b = str;
        this.f19406c = bVar;
        this.f19407d = appCompatActivity;
    }

    public final void onSuccess(Object obj) {
        SwiggyLynxCorePlugin$getGpsLocation$1$1.c(this.f19404a, this.f19405b, this.f19406c, this.f19407d, (Location) obj);
    }
}
