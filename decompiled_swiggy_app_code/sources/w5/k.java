package w5;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.JPEGFactory;

/* compiled from: ImageToPDFConverter */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17580a = "co.hyperverge.hypersnapsdk.c.j";

    public static String a(Bitmap bitmap, String str) {
        File file = new File(str);
        try {
            PDDocument pDDocument = new PDDocument();
            PDPage pDPage = new PDPage(new PDRectangle((float) bitmap.getWidth(), (float) bitmap.getHeight()));
            pDDocument.addPage(pDPage);
            PDPageContentStream pDPageContentStream = new PDPageContentStream(pDDocument, pDPage);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            pDPageContentStream.drawImage(JPEGFactory.createFromStream(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray())), 0.0f, 0.0f);
            pDPageContentStream.close();
            pDDocument.save(file);
            pDDocument.close();
            return file.getAbsolutePath();
        } catch (Exception e11) {
            Log.e(f17580a, e11.getMessage());
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e11);
            return null;
        }
    }
}
