package in.swiggy.android.swiggylynx.lynxFragment;

import androidx.fragment.app.Fragment;
import bp0.k;
import in.swiggy.android.dash.imageImport.ImageImportFragment;
import in.swiggy.android.swiggylynx.plugin.dash.imageupload.ImageUploadPayload;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import zp.b;

/* compiled from: DashFragmentPlugin.kt */
final class DashFragmentPlugin$processGoogleImageUpload$1 extends Lambda implements a<Fragment> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ImageUploadPayload f18950a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f18951b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f18952c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DashFragmentPlugin f18953d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DashFragmentPlugin$processGoogleImageUpload$1(ImageUploadPayload imageUploadPayload, String str, b bVar, DashFragmentPlugin dashFragmentPlugin) {
        super(0);
        this.f18950a = imageUploadPayload;
        this.f18951b = str;
        this.f18952c = bVar;
        this.f18953d = dashFragmentPlugin;
    }

    /* renamed from: a */
    public final Fragment invoke() {
        ImageImportFragment.a aVar = ImageImportFragment.f60967l;
        String b11 = this.f18950a.b();
        String str = this.f18951b;
        b bVar = this.f18952c;
        final DashFragmentPlugin dashFragmentPlugin = this.f18953d;
        return aVar.e(b11, "launch_mode_no_search", str, bVar, new a<k>() {
            public final void invoke() {
                dashFragmentPlugin.q.I1();
            }
        });
    }
}
