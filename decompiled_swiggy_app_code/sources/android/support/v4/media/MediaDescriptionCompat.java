package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f1291a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f1292b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f1293c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f1294d;

    /* renamed from: e  reason: collision with root package name */
    private final Bitmap f1295e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f1296f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f1297g;

    /* renamed from: h  reason: collision with root package name */
    private final Uri f1298h;

    /* renamed from: i  reason: collision with root package name */
    private MediaDescription f1299i;

    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i11) {
            return new MediaDescriptionCompat[i11];
        }
    }

    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f1300a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f1301b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f1302c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f1303d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f1304e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f1305f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f1306g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f1307h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f1300a, this.f1301b, this.f1302c, this.f1303d, this.f1304e, this.f1305f, this.f1306g, this.f1307h);
        }

        public d b(CharSequence charSequence) {
            this.f1303d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f1306g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f1304e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f1305f = uri;
            return this;
        }

        public d f(String str) {
            this.f1300a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f1307h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f1302c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f1301b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1291a = str;
        this.f1292b = charSequence;
        this.f1293c = charSequence2;
        this.f1294d = charSequence3;
        this.f1295e = bitmap;
        this.f1296f = uri;
        this.f1297g = bundle;
        this.f1298h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x007f
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$d r2 = new android.support.v4.media.MediaDescriptionCompat$d
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = android.support.v4.media.MediaDescriptionCompat.b.g(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.i(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.h(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.b.c(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.MediaDescriptionCompat.b.e(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.MediaDescriptionCompat.b.f(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.MediaDescriptionCompat.b.d(r9)
            if (r3 == 0) goto L_0x0040
            android.os.Bundle r3 = android.support.v4.media.session.MediaSessionCompat.b(r3)
        L_0x0040:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x004b
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x004c
        L_0x004b:
            r5 = r0
        L_0x004c:
            if (r5 == 0) goto L_0x0064
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x005e
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x005e
            goto L_0x0065
        L_0x005e:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0064:
            r0 = r3
        L_0x0065:
            r2.c(r0)
            if (r5 == 0) goto L_0x006e
            r2.g(r5)
            goto L_0x0079
        L_0x006e:
            r0 = 23
            if (r1 < r0) goto L_0x0079
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.c.a(r9)
            r2.g(r0)
        L_0x0079:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f1299i = r9
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        Bundle bundle;
        MediaDescription mediaDescription = this.f1299i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        int i11 = Build.VERSION.SDK_INT;
        MediaDescription.Builder b11 = b.b();
        b.n(b11, this.f1291a);
        b.p(b11, this.f1292b);
        b.o(b11, this.f1293c);
        b.j(b11, this.f1294d);
        b.l(b11, this.f1295e);
        b.m(b11, this.f1296f);
        if (i11 >= 23 || this.f1298h == null) {
            b.k(b11, this.f1297g);
        } else {
            if (this.f1297g == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(this.f1297g);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f1298h);
            b.k(b11, bundle);
        }
        if (i11 >= 23) {
            c.b(b11, this.f1298h);
        }
        MediaDescription a11 = b.a(b11);
        this.f1299i = a11;
        return a11;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f1292b + ", " + this.f1293c + ", " + this.f1294d;
    }

    public void writeToParcel(Parcel parcel, int i11) {
        ((MediaDescription) b()).writeToParcel(parcel, i11);
    }
}
