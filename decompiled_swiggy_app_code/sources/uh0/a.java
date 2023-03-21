package uh0;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import bp0.k;
import cg0.n;
import in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressDirectionsRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressRequestPayload;
import in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType;
import in.swiggy.android.tejas.feature.address.model.Address;
import lp0.p;
import lp0.q;
import mb0.n1;

/* compiled from: ISwiggyLynxInterface.kt */
public interface a {

    /* renamed from: uh0.a$a  reason: collision with other inner class name */
    /* compiled from: ISwiggyLynxInterface.kt */
    public static final class C0246a {
        public static /* synthetic */ void a(a aVar, Activity activity, String str, boolean z11, Boolean bool, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 8) != 0) {
                    bool = Boolean.FALSE;
                }
                aVar.d(activity, str, z11, bool);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchTrackFromOrderId");
        }
    }

    void a(AppCompatActivity appCompatActivity, EditAddressRequestPayload editAddressRequestPayload, boolean z11, n1 n1Var, q<? super Address, ? super OperationType, ? super Integer, k> qVar);

    void b(AddNewAddressRequestPayload addNewAddressRequestPayload, n1 n1Var, AppCompatActivity appCompatActivity);

    void c(Activity activity, String str, String str2, String str3);

    void d(Activity activity, String str, boolean z11, Boolean bool);

    void e(Activity activity);

    void f(Activity activity, String str, String str2, String str3);

    void g(AppCompatActivity appCompatActivity, EditAddressDirectionsRequestPayload editAddressDirectionsRequestPayload, boolean z11, n1 n1Var, p<? super Boolean, ? super String, k> pVar);

    boolean h(n nVar);
}
