package ph0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.brentvatne.react.ReactVideoViewManager;
import com.xiaomi.mipush.sdk.Constants;
import in.juspay.hyper.constants.LogCategory;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import oh0.b;

/* compiled from: TwitterIntentProvider.kt */
public final class l extends a {
    public static final a Companion = new a((i) null);

    /* renamed from: d  reason: collision with root package name */
    private final Context f19843d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f19844e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f19845f;

    /* renamed from: g  reason: collision with root package name */
    private final String f19846g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f19847h;

    /* compiled from: TwitterIntentProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context, SharedPreferences sharedPreferences, Uri uri, String str) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
        p.j(sharedPreferences, "sharedPreferences");
        p.j(uri, ReactVideoViewManager.PROP_SRC_URI);
        this.f19843d = context;
        this.f19844e = sharedPreferences;
        this.f19845f = uri;
        this.f19846g = str;
        String string = sharedPreferences.getString("twitter_activities", "com.twitter.composer.ComposerActivity");
        this.f19847h = StringsKt__StringsKt.I0(string == null ? "" : string, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SP}, false, 0, 6, (Object) null);
    }

    public Intent a() {
        if (e() == null) {
            Intent b11 = b.Companion.b(this.f19845f, this.f19846g);
            b11.setPackage("com.twitter.android");
            List<ResolveInfo> queryIntentActivities = this.f19843d.getPackageManager().queryIntentActivities(b11, 0);
            p.i(queryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                String str = activityInfo.targetActivity;
                if (str == null) {
                    str = activityInfo.name;
                }
                if (this.f19847h.contains(str)) {
                    p.i(resolveInfo, "resolveInfo");
                    g(resolveInfo);
                    b11.setComponent(new ComponentName("com.twitter.android", activityInfo.name));
                    h(b11);
                }
            }
        }
        return e();
    }

    public String b() {
        return "Twitter";
    }

    public String c() {
        return "Tweet";
    }
}
