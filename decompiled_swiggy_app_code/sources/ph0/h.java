package ph0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.brentvatne.react.ReactVideoViewManager;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.swiggylynx.R;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.Regex;

/* compiled from: FacebookStoryIntentProvider.kt */
public final class h extends a {
    public static final a Companion = new a((i) null);

    /* renamed from: h  reason: collision with root package name */
    private static final Regex f19830h = new Regex("[sS]tory");

    /* renamed from: d  reason: collision with root package name */
    private final Context f19831d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri f19832e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19833f;

    /* renamed from: g  reason: collision with root package name */
    private final String f19834g;

    /* compiled from: FacebookStoryIntentProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, Uri uri, String str) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
        p.j(uri, ReactVideoViewManager.PROP_SRC_URI);
        this.f19831d = context;
        this.f19832e = uri;
        this.f19833f = str;
        String string = context.getString(R.string.app_id);
        p.i(string, "context.getString(R.string.app_id)");
        this.f19834g = string;
    }

    public Intent a() {
        if (e() == null) {
            Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
            intent.setDataAndType(this.f19832e, "image/png");
            intent.setFlags(1);
            intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", this.f19834g);
            intent.setPackage("com.facebook.katana");
            ResolveInfo resolveActivity = this.f19831d.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity != null) {
                g(resolveActivity);
                h(intent);
            } else {
                i();
            }
        }
        return e();
    }

    public String b() {
        return "Facebook";
    }

    public String c() {
        return "Story";
    }

    public final void i() {
        Intent intent = new Intent("android.intent.action.SEND");
        List<ResolveInfo> queryIntentActivities = this.f19831d.getPackageManager().queryIntentActivities(intent, 0);
        p.i(queryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            CharSequence loadLabel = resolveInfo.loadLabel(f());
            if (loadLabel != null && f19830h.a(loadLabel)) {
                p.i(resolveInfo, "resolveInfo");
                g(resolveInfo);
                intent.putExtra("android.intent.extra.STREAM", j());
                intent.setComponent(new ComponentName("com.facebook.katana", resolveInfo.activityInfo.name));
                h(intent);
            }
        }
    }

    public final Uri j() {
        return this.f19832e;
    }
}
