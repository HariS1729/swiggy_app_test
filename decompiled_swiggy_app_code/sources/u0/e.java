package u0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.p;

/* compiled from: AndroidImageBitmap.android.kt */
public final class e implements l0 {

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f16768b;

    public e(Bitmap bitmap) {
        p.j(bitmap, "bitmap");
        this.f16768b = bitmap;
    }

    public void a() {
        this.f16768b.prepareToDraw();
    }

    public int b() {
        Bitmap.Config config = this.f16768b.getConfig();
        p.i(config, "bitmap.config");
        return f.e(config);
    }

    public final Bitmap c() {
        return this.f16768b;
    }

    public int getHeight() {
        return this.f16768b.getHeight();
    }

    public int getWidth() {
        return this.f16768b.getWidth();
    }
}
