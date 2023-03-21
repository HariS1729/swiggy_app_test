package ph0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.brentvatne.react.ReactVideoViewManager;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import oh0.b;

/* compiled from: WhatsAppStoryIntentProvider.kt */
public final class m extends a {
    public static final a Companion = new a((i) null);

    /* renamed from: d  reason: collision with root package name */
    private final Context f19848d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri f19849e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19850f;

    /* compiled from: WhatsAppStoryIntentProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Context context, Uri uri, String str) {
        super(context);
        p.j(context, LogCategory.CONTEXT);
        p.j(uri, ReactVideoViewManager.PROP_SRC_URI);
        this.f19848d = context;
        this.f19849e = uri;
        this.f19850f = str;
    }

    public Intent a() {
        if (e() == null) {
            Intent b11 = b.Companion.b(this.f19849e, this.f19850f);
            b11.setPackage("com.whatsapp");
            ResolveInfo resolveActivity = this.f19848d.getPackageManager().resolveActivity(b11, 0);
            if (resolveActivity != null) {
                g(resolveActivity);
                h(b11);
            }
        }
        return e();
    }

    public String b() {
        return "WhatsApp";
    }

    public String c() {
        return null;
    }
}
