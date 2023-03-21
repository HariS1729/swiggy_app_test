package w5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.Log;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import z5.g;

@Instrumented
/* compiled from: WaterMarkHelper */
public class q {

    /* renamed from: c  reason: collision with root package name */
    static q f17609c;

    /* renamed from: a  reason: collision with root package name */
    HVFaceConfig f17610a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17611b = q.class.getSimpleName();

    private Paint a(boolean z11) {
        Paint paint = new Paint();
        if (z11) {
            paint.setTextSize((float) this.f17610a.getCropImageWaterMarkTextSizePx());
        } else {
            paint.setTextSize((float) this.f17610a.getFullImageWaterMarkTextSizePx());
        }
        paint.setColor(this.f17610a.getWaterMarkColor());
        paint.setFakeBoldText(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        return paint;
    }

    public static q c() {
        if (f17609c == null) {
            f17609c = new q();
        }
        return f17609c;
    }

    private void d(boolean z11, Canvas canvas, String str, String str2, Bitmap bitmap) {
        Rect rect = new Rect();
        a(z11).getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, 0.0f, ((float) (bitmap.getHeight() - rect.height())) - 20.0f, a(z11));
        canvas.drawText(str2, 0.0f, (float) (bitmap.getHeight() - 10), a(z11));
    }

    private String e() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    public String b(Context context, HVFaceConfig hVFaceConfig, String str, String str2, boolean z11) {
        FileOutputStream fileOutputStream;
        Exception e11;
        String e12 = e();
        this.f17610a = hVFaceConfig;
        new BitmapFactory.Options().inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeFile = BitmapFactoryInstrumentation.decodeFile(str2);
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        FileOutputStream fileOutputStream2 = null;
        canvas.drawBitmap(decodeFile, 0.0f, 0.0f, (Paint) null);
        d(z11, canvas, e12, str, decodeFile);
        File file = new File(context.getFilesDir(), "hv");
        if (!file.exists()) {
            file.mkdirs();
        }
        String str3 = z11 ? "FD_watermark_crop_image_" : "FD_watermark_full_image_";
        String absolutePath = file.getAbsolutePath();
        File file2 = new File(absolutePath, str3 + System.currentTimeMillis() + ".jpg");
        try {
            fileOutputStream = new FileOutputStream(file2);
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, g.f18075b, fileOutputStream);
            } catch (Exception e13) {
                e11 = e13;
                fileOutputStream2 = fileOutputStream;
            }
        } catch (Exception e14) {
            e11 = e14;
            Log.e(this.f17611b, e11.getMessage());
            fileOutputStream = fileOutputStream2;
            fileOutputStream.close();
            return file2.getAbsolutePath();
        }
        try {
            fileOutputStream.close();
        } catch (IOException e15) {
            Log.e(this.f17611b, e15.getMessage());
        }
        return file2.getAbsolutePath();
    }
}
