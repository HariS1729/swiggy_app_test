package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: NotificationCompatJellybean */
class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f9105a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f9106b = new Object();

    private static p a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it2 = stringArrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next());
            }
        }
        return new p(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    private static p[] b(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        p[] pVarArr = new p[bundleArr.length];
        for (int i11 = 0; i11 < bundleArr.length; i11++) {
            pVarArr[i11] = a(bundleArr[i11]);
        }
        return pVarArr;
    }

    static j.b c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new j.b(bundle.getInt(MenuConstants.MENU_OFFER_ICON), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), b(d(bundle, "remoteInputs")), b(d(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    private static Bundle[] d(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    static Bundle e(j.b bVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat d11 = bVar.d();
        bundle2.putInt(MenuConstants.MENU_OFFER_ICON, d11 != null ? d11.m() : 0);
        bundle2.putCharSequence("title", bVar.h());
        bundle2.putParcelable("actionIntent", bVar.a());
        if (bVar.c() != null) {
            bundle = new Bundle(bVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", g(bVar.e()));
        bundle2.putBoolean("showsUserInterface", bVar.g());
        bundle2.putInt("semanticAction", bVar.f());
        return bundle2;
    }

    private static Bundle f(p pVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", pVar.j());
        bundle.putCharSequence("label", pVar.i());
        bundle.putCharSequenceArray("choices", pVar.f());
        bundle.putBoolean("allowFreeFormInput", pVar.d());
        bundle.putBundle("extras", pVar.h());
        Set<String> e11 = pVar.e();
        if (e11 != null && !e11.isEmpty()) {
            ArrayList arrayList = new ArrayList(e11.size());
            for (String add : e11) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] g(p[] pVarArr) {
        if (pVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[pVarArr.length];
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            bundleArr[i11] = f(pVarArr[i11]);
        }
        return bundleArr;
    }
}
