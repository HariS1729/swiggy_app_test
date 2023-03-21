package d3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: TypefaceEmojiSpan */
public final class h extends d {

    /* renamed from: f  reason: collision with root package name */
    private static Paint f14105f;

    public h(b bVar) {
        super(bVar);
    }

    private static Paint c() {
        if (f14105f == null) {
            TextPaint textPaint = new TextPaint();
            f14105f = textPaint;
            textPaint.setColor(a.a().b());
            f14105f.setStyle(Paint.Style.FILL);
        }
        return f14105f;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        if (a.a().g()) {
            canvas.drawRect(f11, (float) i13, f11 + ((float) b()), (float) i15, c());
        }
        a().a(canvas, f11, (float) i14, paint);
    }
}
