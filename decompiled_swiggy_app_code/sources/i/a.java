package i;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* compiled from: AllCapsTransformationMethod */
public class a implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    private Locale f14814a;

    public a(Context context) {
        this.f14814a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f14814a);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z11, int i11, Rect rect) {
    }
}
