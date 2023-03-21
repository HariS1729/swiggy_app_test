package in.swiggy.android.swiggylynx.plugin.dash;

import androidx.fragment.app.Fragment;
import bp0.k;
import in.swiggy.android.dash.imageImport.ImageImportFragment;
import in.swiggy.android.swiggylynx.plugin.dash.imageupload.ImageUploadPayload;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import zp.b;

/* compiled from: DashPlugin.kt */
final class DashPlugin$processImageUpload$1 extends Lambda implements a<Fragment> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ImageUploadPayload f19101a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f19102b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f19103c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DashPlugin f19104d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DashPlugin$processImageUpload$1(ImageUploadPayload imageUploadPayload, String str, b bVar, DashPlugin dashPlugin) {
        super(0);
        this.f19101a = imageUploadPayload;
        this.f19102b = str;
        this.f19103c = bVar;
        this.f19104d = dashPlugin;
    }

    /* renamed from: a */
    public final Fragment invoke() {
        ImageImportFragment.a aVar = ImageImportFragment.f60967l;
        String b11 = this.f19101a.b();
        String str = this.f19102b;
        b bVar = this.f19103c;
        final DashPlugin dashPlugin = this.f19104d;
        return aVar.e(b11, "launch_mode_no_search", str, bVar, new a<k>() {
            public final void invoke() {
                dashPlugin.X0().getSupportFragmentManager().a1();
            }
        });
    }
}
