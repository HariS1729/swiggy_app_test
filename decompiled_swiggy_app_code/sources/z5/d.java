package z5;

import android.app.Activity;
import android.os.Build;
import androidx.core.app.b;
import java.util.ArrayList;
import java.util.List;
import w5.n;

/* compiled from: PermissionManager */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private Activity f18069a;

    /* compiled from: PermissionManager */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<String> f18070a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<String> f18071b;

        a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            this.f18071b = arrayList2;
            this.f18070a = arrayList;
        }
    }

    public boolean a(Activity activity, List<String> list) {
        this.f18069a = activity;
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (androidx.core.content.a.a(activity.getApplicationContext(), next) != 0) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        if (arrayList.contains("android.permission.CAMERA")) {
            n.w().a(activity.getApplicationContext()).m();
        }
        b.v(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), 1212);
        return false;
    }

    public a b(Activity activity, List<String> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String next : list) {
            if (androidx.core.content.a.a(activity.getApplicationContext(), next) == 0) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        return new a(arrayList, arrayList2);
    }
}
