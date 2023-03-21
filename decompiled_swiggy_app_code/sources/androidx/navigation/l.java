package androidx.navigation;

import android.content.Intent;
import android.net.Uri;

/* compiled from: NavDeepLinkRequest */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f10940a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10941b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10942c;

    l(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    public String a() {
        return this.f10941b;
    }

    public String b() {
        return this.f10942c;
    }

    public Uri c() {
        return this.f10940a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (this.f10940a != null) {
            sb2.append(" uri=");
            sb2.append(this.f10940a.toString());
        }
        if (this.f10941b != null) {
            sb2.append(" action=");
            sb2.append(this.f10941b);
        }
        if (this.f10942c != null) {
            sb2.append(" mimetype=");
            sb2.append(this.f10942c);
        }
        sb2.append(" }");
        return sb2.toString();
    }

    l(Uri uri, String str, String str2) {
        this.f10940a = uri;
        this.f10941b = str;
        this.f10942c = str2;
    }
}
