package o6;

import android.graphics.Paint;
import androidx.exifinterface.media.a;
import java.io.InputStream;
import okio.e;

/* compiled from: ExifUtils.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f15965a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f15966b = {"image/jpeg", "image/webp", "image/heic", "image/heif"};

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f15967c = new Paint(3);

    private h() {
    }

    public final f a(String str, e eVar) {
        if (str == null || !ArraysKt___ArraysKt.G(f15966b, str)) {
            return f.f15960d;
        }
        a aVar = new a((InputStream) new g(eVar.peek().j1()));
        return new f(aVar.D(), aVar.s());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r3 == false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(android.graphics.Bitmap r8, o6.f r9) {
        /*
            r7 = this;
            boolean r0 = r9.b()
            if (r0 != 0) goto L_0x000d
            boolean r0 = o6.i.a(r9)
            if (r0 != 0) goto L_0x000d
            return r8
        L_0x000d:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r8.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            boolean r2 = r9.b()
            if (r2 == 0) goto L_0x002d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r2, r4, r1, r3)
        L_0x002d:
            boolean r2 = o6.i.a(r9)
            if (r2 == 0) goto L_0x003b
            int r2 = r9.a()
            float r2 = (float) r2
            r0.postRotate(r2, r1, r3)
        L_0x003b:
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r8.getWidth()
            float r2 = (float) r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r0.mapRect(r1)
            float r2 = r1.left
            r3 = 1
            r5 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0058
            r6 = 1
            goto L_0x0059
        L_0x0058:
            r6 = 0
        L_0x0059:
            if (r6 == 0) goto L_0x0065
            float r6 = r1.top
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            if (r3 != 0) goto L_0x006c
        L_0x0065:
            float r2 = -r2
            float r1 = r1.top
            float r1 = -r1
            r0.postTranslate(r2, r1)
        L_0x006c:
            boolean r9 = o6.i.b(r9)
            java.lang.String r1 = "createBitmap(width, height, config)"
            if (r9 == 0) goto L_0x0088
            int r9 = r8.getHeight()
            int r2 = r8.getWidth()
            android.graphics.Bitmap$Config r3 = c7.a.c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            kotlin.jvm.internal.p.i(r9, r1)
            goto L_0x009b
        L_0x0088:
            int r9 = r8.getWidth()
            int r2 = r8.getHeight()
            android.graphics.Bitmap$Config r3 = c7.a.c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            kotlin.jvm.internal.p.i(r9, r1)
        L_0x009b:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r9)
            android.graphics.Paint r2 = f15967c
            r1.drawBitmap(r8, r0, r2)
            r8.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.h.b(android.graphics.Bitmap, o6.f):android.graphics.Bitmap");
    }
}
