package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.g;

/* compiled from: AppCompatProgressBarHelper */
class m {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f2210c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    private final ProgressBar f2211a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f2212b;

    m(ProgressBar progressBar) {
        this.f2211a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    private Drawable d(Drawable drawable, boolean z11) {
        if (drawable instanceof g) {
            g gVar = (g) drawable;
            Drawable b11 = gVar.b();
            if (b11 != null) {
                gVar.a(d(b11, z11));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                int id2 = layerDrawable.getId(i11);
                drawableArr[i11] = d(layerDrawable.getDrawable(i11), id2 == 16908301 || id2 == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                layerDrawable2.setId(i12, layerDrawable.getId(i12));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2212b == null) {
                this.f2212b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z11 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i11 = 0; i11 < numberOfFrames; i11++) {
            Drawable d11 = d(animationDrawable.getFrame(i11), true);
            d11.setLevel(10000);
            animationDrawable2.addFrame(d11, animationDrawable.getDuration(i11));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* access modifiers changed from: package-private */
    public Bitmap b() {
        return this.f2212b;
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i11) {
        o0 v = o0.v(this.f2211a.getContext(), attributeSet, f2210c, i11, 0);
        Drawable h11 = v.h(0);
        if (h11 != null) {
            this.f2211a.setIndeterminateDrawable(e(h11));
        }
        Drawable h12 = v.h(1);
        if (h12 != null) {
            this.f2211a.setProgressDrawable(d(h12, false));
        }
        v.w();
    }
}
