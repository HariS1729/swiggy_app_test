package mg0;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import qg0.a;

/* compiled from: ViewHandpickedLoaderBinding */
public abstract class i extends ViewDataBinding {
    public final ImageView B;
    public final LottieAnimationView C;
    protected a D;

    protected i(Object obj, View view, int i11, ImageView imageView, LottieAnimationView lottieAnimationView) {
        super(obj, view, i11);
        this.B = imageView;
        this.C = lottieAnimationView;
    }

    public abstract void x0(a aVar);
}
