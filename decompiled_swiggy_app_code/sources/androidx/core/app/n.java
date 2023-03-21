package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.brentvatne.react.ReactVideoViewManager;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import in.swiggy.android.tejas.network.HttpRequest;

/* compiled from: Person */
public class n {

    /* renamed from: a  reason: collision with root package name */
    CharSequence f9130a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f9131b;

    /* renamed from: c  reason: collision with root package name */
    String f9132c;

    /* renamed from: d  reason: collision with root package name */
    String f9133d;

    /* renamed from: e  reason: collision with root package name */
    boolean f9134e;

    /* renamed from: f  reason: collision with root package name */
    boolean f9135f;

    /* compiled from: Person */
    static class a {
        static n a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.c(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(n nVar) {
            return new Person.Builder().setName(nVar.e()).setIcon(nVar.c() != null ? nVar.c().x() : null).setUri(nVar.f()).setKey(nVar.d()).setBot(nVar.g()).setImportant(nVar.h()).build();
        }
    }

    /* compiled from: Person */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        CharSequence f9136a;

        /* renamed from: b  reason: collision with root package name */
        IconCompat f9137b;

        /* renamed from: c  reason: collision with root package name */
        String f9138c;

        /* renamed from: d  reason: collision with root package name */
        String f9139d;

        /* renamed from: e  reason: collision with root package name */
        boolean f9140e;

        /* renamed from: f  reason: collision with root package name */
        boolean f9141f;

        public n a() {
            return new n(this);
        }

        public b b(boolean z11) {
            this.f9140e = z11;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f9137b = iconCompat;
            return this;
        }

        public b d(boolean z11) {
            this.f9141f = z11;
            return this;
        }

        public b e(String str) {
            this.f9139d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f9136a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f9138c = str;
            return this;
        }
    }

    n(b bVar) {
        this.f9130a = bVar.f9136a;
        this.f9131b = bVar.f9137b;
        this.f9132c = bVar.f9138c;
        this.f9133d = bVar.f9139d;
        this.f9134e = bVar.f9140e;
        this.f9135f = bVar.f9141f;
    }

    public static n a(Person person) {
        return a.a(person);
    }

    public static n b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(MenuConstants.MENU_OFFER_ICON);
        return new b().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.b(bundle2) : null).g(bundle.getString(ReactVideoViewManager.PROP_SRC_URI)).e(bundle.getString(HttpRequest.HEADER_KEY)).b(bundle.getBoolean("isBot")).d(bundle.getBoolean("isImportant")).a();
    }

    public IconCompat c() {
        return this.f9131b;
    }

    public String d() {
        return this.f9133d;
    }

    public CharSequence e() {
        return this.f9130a;
    }

    public String f() {
        return this.f9132c;
    }

    public boolean g() {
        return this.f9134e;
    }

    public boolean h() {
        return this.f9135f;
    }

    public String i() {
        String str = this.f9132c;
        if (str != null) {
            return str;
        }
        if (this.f9130a == null) {
            return "";
        }
        return "name:" + this.f9130a;
    }

    public Person j() {
        return a.b(this);
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f9130a);
        IconCompat iconCompat = this.f9131b;
        bundle.putBundle(MenuConstants.MENU_OFFER_ICON, iconCompat != null ? iconCompat.w() : null);
        bundle.putString(ReactVideoViewManager.PROP_SRC_URI, this.f9132c);
        bundle.putString(HttpRequest.HEADER_KEY, this.f9133d);
        bundle.putBoolean("isBot", this.f9134e);
        bundle.putBoolean("isImportant", this.f9135f);
        return bundle;
    }
}
