package z5;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PDFUtils */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f18068a = "co.hyperverge.hypersnapsdk.f.d";

    @SuppressLint({"LogNotTimber"})
    public static List<Bitmap> a(File file) {
        ArrayList arrayList = new ArrayList();
        try {
            PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(file, 268435456));
            int pageCount = pdfRenderer.getPageCount();
            for (int i11 = 0; i11 < pageCount; i11++) {
                PdfRenderer.Page openPage = pdfRenderer.openPage(i11);
                Bitmap createBitmap = Bitmap.createBitmap(openPage.getWidth(), openPage.getHeight(), Bitmap.Config.ARGB_8888);
                openPage.render(createBitmap, (Rect) null, (Matrix) null, 1);
                arrayList.add(createBitmap);
                openPage.close();
            }
            pdfRenderer.close();
        } catch (Exception e11) {
            Log.e(f18068a, "asBitmaps: ex", e11);
        }
        return arrayList;
    }
}
