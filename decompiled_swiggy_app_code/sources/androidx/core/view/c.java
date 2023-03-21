package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* compiled from: ContentInfoCompat */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final f f9486a;

    /* compiled from: ContentInfoCompat */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C0051c f9487a;

        public a(ClipData clipData, int i11) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f9487a = new b(clipData, i11);
            } else {
                this.f9487a = new d(clipData, i11);
            }
        }

        public c a() {
            return this.f9487a.build();
        }

        public a b(Bundle bundle) {
            this.f9487a.setExtras(bundle);
            return this;
        }

        public a c(int i11) {
            this.f9487a.b(i11);
            return this;
        }

        public a d(Uri uri) {
            this.f9487a.a(uri);
            return this;
        }
    }

    /* compiled from: ContentInfoCompat */
    private static final class b implements C0051c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo.Builder f9488a;

        b(ClipData clipData, int i11) {
            this.f9488a = new ContentInfo.Builder(clipData, i11);
        }

        public void a(Uri uri) {
            this.f9488a.setLinkUri(uri);
        }

        public void b(int i11) {
            this.f9488a.setFlags(i11);
        }

        public c build() {
            return new c(new e(this.f9488a.build()));
        }

        public void setExtras(Bundle bundle) {
            this.f9488a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.c$c  reason: collision with other inner class name */
    /* compiled from: ContentInfoCompat */
    private interface C0051c {
        void a(Uri uri);

        void b(int i11);

        c build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat */
    private static final class d implements C0051c {

        /* renamed from: a  reason: collision with root package name */
        ClipData f9489a;

        /* renamed from: b  reason: collision with root package name */
        int f9490b;

        /* renamed from: c  reason: collision with root package name */
        int f9491c;

        /* renamed from: d  reason: collision with root package name */
        Uri f9492d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f9493e;

        d(ClipData clipData, int i11) {
            this.f9489a = clipData;
            this.f9490b = i11;
        }

        public void a(Uri uri) {
            this.f9492d = uri;
        }

        public void b(int i11) {
            this.f9491c = i11;
        }

        public c build() {
            return new c(new g(this));
        }

        public void setExtras(Bundle bundle) {
            this.f9493e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat */
    private static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo f9494a;

        e(ContentInfo contentInfo) {
            this.f9494a = (ContentInfo) androidx.core.util.g.g(contentInfo);
        }

        public ClipData a() {
            return this.f9494a.getClip();
        }

        public ContentInfo b() {
            return this.f9494a;
        }

        public int c() {
            return this.f9494a.getFlags();
        }

        public int getSource() {
            return this.f9494a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f9494a + "}";
        }
    }

    /* compiled from: ContentInfoCompat */
    private interface f {
        ClipData a();

        ContentInfo b();

        int c();

        int getSource();
    }

    /* compiled from: ContentInfoCompat */
    private static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ClipData f9495a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9496b;

        /* renamed from: c  reason: collision with root package name */
        private final int f9497c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f9498d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f9499e;

        g(d dVar) {
            this.f9495a = (ClipData) androidx.core.util.g.g(dVar.f9489a);
            this.f9496b = androidx.core.util.g.c(dVar.f9490b, 0, 5, "source");
            this.f9497c = androidx.core.util.g.f(dVar.f9491c, 1);
            this.f9498d = dVar.f9492d;
            this.f9499e = dVar.f9493e;
        }

        public ClipData a() {
            return this.f9495a;
        }

        public ContentInfo b() {
            return null;
        }

        public int c() {
            return this.f9497c;
        }

        public int getSource() {
            return this.f9496b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f9495a.getDescription());
            sb2.append(", source=");
            sb2.append(c.e(this.f9496b));
            sb2.append(", flags=");
            sb2.append(c.a(this.f9497c));
            String str2 = "";
            if (this.f9498d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f9498d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f9499e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    c(f fVar) {
        this.f9486a = fVar;
    }

    static String a(int i11) {
        return (i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11);
    }

    static String e(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? String.valueOf(i11) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static c g(ContentInfo contentInfo) {
        return new c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f9486a.a();
    }

    public int c() {
        return this.f9486a.c();
    }

    public int d() {
        return this.f9486a.getSource();
    }

    public ContentInfo f() {
        ContentInfo b11 = this.f9486a.b();
        Objects.requireNonNull(b11);
        ContentInfo contentInfo = b11;
        return b11;
    }

    public String toString() {
        return this.f9486a.toString();
    }
}
