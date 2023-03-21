package in.swiggy.android.swiggylocation.location;

import android.content.SharedPreferences;
import bp0.k;
import com.newrelic.agent.android.instrumentation.Instrumented;
import ig0.e;
import in.swiggy.android.swiggylocation.utils.eventmanager.interfaces.ILocationEventManager;
import in.swiggy.android.tejas.feature.address.model.Address;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.a;

@Instrumented
/* compiled from: LocationContextExtension.kt */
final class LocationContextExtensionKt$prepareGpsOffLocationAttributes$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f18812a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SharedPreferences f18813b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<Address> f18814c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ILocationEventManager f18815d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LocationContextExtensionKt$prepareGpsOffLocationAttributes$1(e eVar, SharedPreferences sharedPreferences, List<Address> list, ILocationEventManager iLocationEventManager) {
        super(0);
        this.f18812a = eVar;
        this.f18813b = sharedPreferences;
        this.f18814c = list;
        this.f18815d = iLocationEventManager;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r18 = this;
            r1 = r18
            ig0.e r0 = r1.f18812a
            java.lang.String r2 = "gps_off_default_address_experiment"
            java.lang.String r3 = "null"
            java.lang.String r6 = r0.a(r2, r3)
            android.content.SharedPreferences r0 = r1.f18813b
            java.lang.String r2 = "gps_off_location_attributes"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)
            r2 = 0
            if (r0 == 0) goto L_0x005f
            int r3 = r0.length()     // Catch:{ Exception -> 0x0059 }
            if (r3 != 0) goto L_0x0021
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r3 != 0) goto L_0x005f
            com.google.gson.Gson r3 = os.g0.i()     // Catch:{ Exception -> 0x0059 }
            java.lang.Class<in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes> r4 = in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes.class
            boolean r5 = r3 instanceof com.google.gson.Gson     // Catch:{ Exception -> 0x0059 }
            if (r5 != 0) goto L_0x0033
            java.lang.Object r0 = r3.fromJson((java.lang.String) r0, r4)     // Catch:{ Exception -> 0x0059 }
            goto L_0x0037
        L_0x0033:
            java.lang.Object r0 = com.newrelic.agent.android.instrumentation.GsonInstrumentation.fromJson((com.google.gson.Gson) r3, (java.lang.String) r0, r4)     // Catch:{ Exception -> 0x0059 }
        L_0x0037:
            r3 = r0
            in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes r3 = (in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes) r3     // Catch:{ Exception -> 0x0059 }
            r3.xpFlag = r6     // Catch:{ Exception -> 0x0056 }
            r3.lastDeliveredAddress = r2     // Catch:{ Exception -> 0x0056 }
            in.swiggy.android.tejas.feature.location.model.AddressAttribute r0 = r3.lastOrderFinalAddressInfo     // Catch:{ Exception -> 0x0056 }
            if (r0 != 0) goto L_0x0043
            goto L_0x0054
        L_0x0043:
            java.util.List<in.swiggy.android.tejas.feature.address.model.Address> r4 = r1.f18814c     // Catch:{ Exception -> 0x0056 }
            if (r0 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            java.lang.String r2 = r0.Id     // Catch:{ Exception -> 0x0056 }
        L_0x004a:
            int r2 = in.swiggy.android.swiggylocation.location.c.g(r4, r2)     // Catch:{ Exception -> 0x0056 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0056 }
            r0.addressRank = r2     // Catch:{ Exception -> 0x0056 }
        L_0x0054:
            r2 = r3
            goto L_0x005f
        L_0x0056:
            r0 = move-exception
            r2 = r3
            goto L_0x005a
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            java.lang.String r3 = "LocationContext"
            os.u.h(r3, r0)
        L_0x005f:
            if (r2 != 0) goto L_0x007d
            in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes r2 = new in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes
            r8 = 0
            in.swiggy.android.tejas.feature.location.model.AddressAttribute r0 = new in.swiggy.android.tejas.feature.location.model.AddressAttribute
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 62
            r17 = 0
            java.lang.String r10 = ""
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x007d:
            in.swiggy.android.swiggylocation.utils.eventmanager.interfaces.ILocationEventManager r0 = r1.f18815d
            r0.B(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylocation.location.LocationContextExtensionKt$prepareGpsOffLocationAttributes$1.invoke():void");
    }
}
