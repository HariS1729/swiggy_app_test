package e;

import android.content.Context;
import android.content.Intent;
import bp0.h;
import e.a;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ActivityResultContracts.kt */
public final class b extends a<String[], Map<String, Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14157a = new a((i) null);

    /* compiled from: ActivityResultContracts.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            p.j(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            p.i(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        p.j(context, LogCategory.CONTEXT);
        p.j(strArr, "input");
        return f14157a.a(strArr);
    }

    /* renamed from: e */
    public a.C0118a<Map<String, Boolean>> b(Context context, String[] strArr) {
        p.j(context, LogCategory.CONTEXT);
        p.j(strArr, "input");
        boolean z11 = true;
        if (strArr.length == 0) {
            return new a.C0118a<>(x.f());
        }
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (!(androidx.core.content.a.a(context, strArr[i11]) == 0)) {
                z11 = false;
                break;
            }
            i11++;
        }
        if (!z11) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(l.d(w.b(strArr.length), 16));
        for (String a11 : strArr) {
            Pair a12 = h.a(a11, Boolean.TRUE);
            linkedHashMap.put(a12.c(), a12.d());
        }
        return new a.C0118a<>(linkedHashMap);
    }

    /* renamed from: f */
    public Map<String, Boolean> c(int i11, Intent intent) {
        if (i11 != -1) {
            return x.f();
        }
        if (intent == null) {
            return x.f();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return x.f();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i12 = 0; i12 < length; i12++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i12] == 0));
        }
        return x.p(s.J0(ArraysKt___ArraysKt.H(stringArrayExtra), arrayList));
    }
}
