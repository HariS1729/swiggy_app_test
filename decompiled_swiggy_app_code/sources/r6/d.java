package r6;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import coil.ImageLoader;
import coil.decode.DataSource;
import java.io.InputStream;
import kotlin.jvm.internal.p;
import o6.b;
import o6.l;
import okio.u;
import org.apache.pdfbox.pdmodel.common.PDPageLabelRange;
import r6.h;
import x6.k;
import y6.c;

/* compiled from: ContentUriFetcher.kt */
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f16488a;

    /* renamed from: b  reason: collision with root package name */
    private final k f16489b;

    /* compiled from: ContentUriFetcher.kt */
    public static final class a implements h.a<Uri> {
        private final boolean c(Uri uri) {
            return p.e(uri.getScheme(), "content");
        }

        /* renamed from: b */
        public h a(Uri uri, k kVar, ImageLoader imageLoader) {
            if (!c(uri)) {
                return null;
            }
            return new d(uri, kVar);
        }
    }

    public d(Uri uri, k kVar) {
        this.f16488a = uri;
        this.f16489b = kVar;
    }

    private final Bundle d() {
        c b11 = this.f16489b.n().b();
        c.a aVar = b11 instanceof c.a ? (c.a) b11 : null;
        Integer valueOf = aVar == null ? null : Integer.valueOf(aVar.f18024a);
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        c a11 = this.f16489b.n().a();
        c.a aVar2 = a11 instanceof c.a ? (c.a) a11 : null;
        Integer valueOf2 = aVar2 == null ? null : Integer.valueOf(aVar2.f18024a);
        if (valueOf2 == null) {
            return null;
        }
        int intValue2 = valueOf2.intValue();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(intValue, intValue2));
        return bundle;
    }

    public Object a(fp0.c<? super g> cVar) {
        ContentResolver contentResolver = this.f16489b.g().getContentResolver();
        InputStream inputStream = null;
        if (b(this.f16488a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f16488a, PDPageLabelRange.STYLE_ROMAN_LOWER);
            if (openAssetFileDescriptor != null) {
                inputStream = openAssetFileDescriptor.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f16488a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.f16488a)) {
            inputStream = contentResolver.openInputStream(this.f16488a);
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f16488a + "'.").toString());
            }
        } else {
            AssetFileDescriptor openTypedAssetFile = contentResolver.openTypedAssetFile(this.f16488a, "image/*", d(), (CancellationSignal) null);
            if (openTypedAssetFile != null) {
                inputStream = openTypedAssetFile.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f16488a + "'.").toString());
            }
        }
        return new k(l.b(u.d(u.l(inputStream)), this.f16489b.g(), new b(this.f16488a)), contentResolver.getType(this.f16488a), DataSource.DISK);
    }

    public final boolean b(Uri uri) {
        return p.e(uri.getAuthority(), "com.android.contacts") && p.e(uri.getLastPathSegment(), "display_photo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r5 = r5.getPathSegments();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getAuthority()
            java.lang.String r1 = "media"
            boolean r0 = kotlin.jvm.internal.p.e(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.List r5 = r5.getPathSegments()
            int r0 = r5.size()
            r2 = 3
            if (r0 < r2) goto L_0x0036
            int r2 = r0 + -3
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r3 = "audio"
            boolean r2 = kotlin.jvm.internal.p.e(r2, r3)
            if (r2 == 0) goto L_0x0036
            int r0 = r0 + -2
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r0 = "albums"
            boolean r5 = kotlin.jvm.internal.p.e(r5, r0)
            if (r5 == 0) goto L_0x0036
            r1 = 1
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.d.c(android.net.Uri):boolean");
    }
}
