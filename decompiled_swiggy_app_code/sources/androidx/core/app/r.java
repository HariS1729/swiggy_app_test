package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import androidx.core.util.g;
import java.util.ArrayList;

/* compiled from: ShareCompat */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9158a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f9159b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f9160c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<String> f9161d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<String> f9162e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<String> f9163f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<Uri> f9164g;

    public r(Context context) {
        Activity activity;
        this.f9158a = (Context) g.g(context);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.f9159b = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            this.f9159b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            this.f9159b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    private void a(String str, ArrayList<String> arrayList) {
        String[] stringArrayExtra = this.f9159b.getStringArrayExtra(str);
        int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
        String[] strArr = new String[(arrayList.size() + length)];
        arrayList.toArray(strArr);
        if (stringArrayExtra != null) {
            System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
        }
        this.f9159b.putExtra(str, strArr);
    }

    @Deprecated
    public static r c(Activity activity) {
        return new r(activity);
    }

    public Intent b() {
        return Intent.createChooser(d(), this.f9160c);
    }

    public Intent d() {
        ArrayList<String> arrayList = this.f9161d;
        if (arrayList != null) {
            a("android.intent.extra.EMAIL", arrayList);
            this.f9161d = null;
        }
        ArrayList<String> arrayList2 = this.f9162e;
        if (arrayList2 != null) {
            a("android.intent.extra.CC", arrayList2);
            this.f9162e = null;
        }
        ArrayList<String> arrayList3 = this.f9163f;
        if (arrayList3 != null) {
            a("android.intent.extra.BCC", arrayList3);
            this.f9163f = null;
        }
        ArrayList<Uri> arrayList4 = this.f9164g;
        boolean z11 = true;
        if (arrayList4 == null || arrayList4.size() <= 1) {
            z11 = false;
        }
        if (!z11) {
            this.f9159b.setAction("android.intent.action.SEND");
            ArrayList<Uri> arrayList5 = this.f9164g;
            if (arrayList5 == null || arrayList5.isEmpty()) {
                this.f9159b.removeExtra("android.intent.extra.STREAM");
                q.c(this.f9159b);
            } else {
                this.f9159b.putExtra("android.intent.extra.STREAM", this.f9164g.get(0));
                q.b(this.f9159b, this.f9164g);
            }
        } else {
            this.f9159b.setAction("android.intent.action.SEND_MULTIPLE");
            this.f9159b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f9164g);
            q.b(this.f9159b, this.f9164g);
        }
        return this.f9159b;
    }

    public r e(CharSequence charSequence) {
        this.f9160c = charSequence;
        return this;
    }

    public r f(CharSequence charSequence) {
        this.f9159b.putExtra("android.intent.extra.TEXT", charSequence);
        return this;
    }

    public r g(String str) {
        this.f9159b.setType(str);
        return this;
    }

    public void h() {
        this.f9158a.startActivity(b());
    }
}
