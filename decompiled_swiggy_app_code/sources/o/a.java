package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.f;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f15896a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f15897b;

    /* renamed from: o.a$a  reason: collision with other inner class name */
    /* compiled from: CustomTabsIntent */
    public static final class C0154a {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f15898a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<Bundle> f15899b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f15900c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<Bundle> f15901d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f15902e;

        public C0154a() {
            this((b) null);
        }

        public a a() {
            ArrayList<Bundle> arrayList = this.f15899b;
            if (arrayList != null) {
                this.f15898a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f15901d;
            if (arrayList2 != null) {
                this.f15898a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f15898a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f15902e);
            return new a(this.f15898a, this.f15900c);
        }

        public C0154a b(int i11) {
            this.f15898a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i11);
            return this;
        }

        public C0154a(b bVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f15898a = intent;
            this.f15899b = null;
            this.f15900c = null;
            this.f15901d = null;
            this.f15902e = true;
            Bundle bundle = new Bundle();
            f.b(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
            intent.putExtras(bundle);
        }
    }

    a(Intent intent, Bundle bundle) {
        this.f15896a = intent;
        this.f15897b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f15896a.setData(uri);
        androidx.core.content.a.m(context, this.f15896a, this.f15897b);
    }
}
