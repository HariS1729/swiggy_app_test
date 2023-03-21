package z3;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import org.apache.pdfbox.pdmodel.common.PDPageLabelRange;

/* compiled from: ParcelUtils */
public class a {
    private a() {
    }

    public static <T extends b> T a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static <T extends b> T b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(a.class.getClassLoader());
            return a(bundle2.getParcelable(PDPageLabelRange.STYLE_LETTERS_LOWER));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static Parcelable c(b bVar) {
        return new ParcelImpl(bVar);
    }
}
