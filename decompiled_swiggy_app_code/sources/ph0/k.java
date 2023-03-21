package ph0;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.brentvatne.react.ReactVideoViewManager;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.swiggylynx.R;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import oh0.b;

/* compiled from: MoreImageIntentProvider.kt */
public final class k implements i {
    public static final a Companion = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f19838a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f19839b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19840c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19841d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f19842e;

    /* compiled from: MoreImageIntentProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public k(Context context, Uri uri, String str, String str2) {
        p.j(context, LogCategory.CONTEXT);
        p.j(uri, ReactVideoViewManager.PROP_SRC_URI);
        this.f19838a = context;
        this.f19839b = uri;
        this.f19840c = str;
        this.f19841d = str2;
    }

    public Intent a() {
        return b.Companion.a(this.f19839b, this.f19840c, this.f19841d);
    }

    public String b() {
        return "More";
    }

    public String c() {
        return null;
    }

    public Drawable d() {
        Drawable f11;
        if (this.f19842e == null && (f11 = androidx.core.content.a.f(this.f19838a, R.drawable.icon_more)) != null) {
            this.f19842e = f11;
        }
        Drawable drawable = this.f19842e;
        if (drawable != null) {
            return drawable;
        }
        p.B(MenuConstants.MENU_OFFER_ICON);
        return null;
    }
}
