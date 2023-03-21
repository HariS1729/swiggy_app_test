package ph0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.brentvatne.react.ReactVideoViewManager;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: InstagramStoryIntentProvider.kt */
public final class j extends a {
    public static final a Companion = new a((i) null);

    /* renamed from: d  reason: collision with root package name */
    private final Context f19835d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri f19836e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19837f;

    /* compiled from: InstagramStoryIntentProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context, Uri uri, String str) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
        p.j(uri, ReactVideoViewManager.PROP_SRC_URI);
        this.f19835d = context;
        this.f19836e = uri;
        this.f19837f = str;
    }

    public Intent a() {
        if (e() == null) {
            PackageManager packageManager = this.f19835d.getPackageManager();
            Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
            intent.putExtra("source_application", this.f19835d.getPackageName());
            intent.setDataAndType(this.f19836e, "image/png");
            intent.setPackage("com.instagram.android");
            intent.setFlags(1);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            if (resolveActivity != null) {
                g(resolveActivity);
                h(intent);
            }
        }
        return e();
    }

    public String b() {
        return "Instagram";
    }

    public String c() {
        return "Stories";
    }
}
