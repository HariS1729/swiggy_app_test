package mg0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import ph0.g;

/* compiled from: CustomIntentItemBinding */
public abstract class c extends ViewDataBinding {
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    protected g E;

    protected c(Object obj, View view, int i11, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i11);
        this.B = imageView;
        this.C = textView;
        this.D = textView2;
    }
}
