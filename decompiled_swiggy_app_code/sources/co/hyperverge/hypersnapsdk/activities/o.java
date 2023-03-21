package co.hyperverge.hypersnapsdk.activities;

import android.app.ProgressDialog;
import co.hyperverge.hypersnapsdk.objects.HVError;
import org.json.JSONObject;
import w5.c;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HVDocsActivity f13306a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProgressDialog f13307b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13308c;

    public /* synthetic */ o(HVDocsActivity hVDocsActivity, ProgressDialog progressDialog, String str) {
        this.f13306a = hVDocsActivity;
        this.f13307b = progressDialog;
        this.f13308c = str;
    }

    public final void a(boolean z11, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, HVError hVError) {
        this.f13306a.W1(this.f13307b, this.f13308c, z11, str, str2, jSONObject, jSONObject2, hVError);
    }
}
