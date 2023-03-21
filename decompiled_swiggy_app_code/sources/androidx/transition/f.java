package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.g0;
import java.util.Map;

/* compiled from: ChangeImageTransform */
public class f extends b0 {
    private static final String[] L = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    private static final TypeEvaluator<Matrix> M = new a();
    private static final Property<ImageView, Matrix> N = new b(Matrix.class, "animatedTransform");

    /* compiled from: ChangeImageTransform */
    static class a implements TypeEvaluator<Matrix> {
        a() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f11, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* compiled from: ChangeImageTransform */
    static class b extends Property<ImageView, Matrix> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            s.a(imageView, matrix);
        }
    }

    /* compiled from: ChangeImageTransform */
    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11902a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11902a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11902a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.f.c.<clinit>():void");
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void t0(h0 h0Var) {
        View view = h0Var.f11936b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = h0Var.f11935a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put("android:changeImageTransform:matrix", v0(imageView));
            }
        }
    }

    private static Matrix u0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = (float) imageView.getWidth();
        float f11 = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = (float) imageView.getHeight();
        float f12 = (float) intrinsicHeight;
        float max = Math.max(width / f11, height / f12);
        int round = Math.round((width - (f11 * max)) / 2.0f);
        int round2 = Math.round((height - (f12 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }

    private static Matrix v0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i11 = c.f11902a[imageView.getScaleType().ordinal()];
            if (i11 == 1) {
                return y0(imageView);
            }
            if (i11 == 2) {
                return u0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    private ObjectAnimator w0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, N, new g0.a(), new Matrix[]{matrix, matrix2});
    }

    private ObjectAnimator x0(ImageView imageView) {
        Property<ImageView, Matrix> property = N;
        TypeEvaluator<Matrix> typeEvaluator = M;
        Matrix matrix = t.f12004a;
        return ObjectAnimator.ofObject(imageView, property, typeEvaluator, new Matrix[]{matrix, matrix});
    }

    private static Matrix y0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    public String[] P() {
        return L;
    }

    public void k(h0 h0Var) {
        t0(h0Var);
    }

    public void n(h0 h0Var) {
        t0(h0Var);
    }

    public Animator r(ViewGroup viewGroup, h0 h0Var, h0 h0Var2) {
        if (h0Var == null || h0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) h0Var.f11935a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) h0Var2.f11935a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) h0Var.f11935a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) h0Var2.f11935a.get("android:changeImageTransform:matrix");
        boolean z11 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z11) {
            return null;
        }
        ImageView imageView = (ImageView) h0Var2.f11936b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return x0(imageView);
        }
        if (matrix == null) {
            matrix = t.f12004a;
        }
        if (matrix2 == null) {
            matrix2 = t.f12004a;
        }
        N.set(imageView, matrix);
        return w0(imageView, matrix, matrix2);
    }
}
