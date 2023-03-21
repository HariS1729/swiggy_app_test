package l6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import co.hyperverge.hypersnapsdk.R;

/* compiled from: CrossHairView */
public class b extends View {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f15555a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15556b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f15557c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f15558d;

    /* renamed from: e  reason: collision with root package name */
    private int f15559e;

    /* renamed from: f  reason: collision with root package name */
    private int f15560f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f15561g = new a();

    /* compiled from: CrossHairView */
    class a implements Runnable {
        a() {
        }

        public void run() {
            boolean unused = b.this.f15555a = false;
            b.this.invalidate();
        }
    }

    public b(Context context) {
        super(context);
        a();
    }

    private void a() {
        Resources resources = getContext().getResources();
        int i11 = R.drawable.ic_camera_focus_white_svg;
        this.f15557c = resources.getDrawable(i11);
        this.f15558d = getContext().getResources().getDrawable(i11);
    }

    public void b(float f11, float f12) {
        this.f15559e = (int) f11;
        this.f15560f = (int) f12;
        removeCallbacks(this.f15561g);
        this.f15555a = true;
        invalidate();
        postDelayed(this.f15561g, 1000);
    }

    public void c(float f11, float f12, boolean z11) {
        this.f15556b = z11;
        b(f11, f12);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15555a) {
            int intrinsicWidth = this.f15557c.getIntrinsicWidth();
            int intrinsicHeight = this.f15557c.getIntrinsicHeight();
            if (this.f15556b) {
                Drawable drawable = this.f15558d;
                int i11 = this.f15559e;
                int i12 = intrinsicWidth / 2;
                int i13 = this.f15560f;
                int i14 = intrinsicHeight / 2;
                drawable.setBounds(i11 - i12, i13 - i14, i11 + i12, i13 + i14);
                this.f15558d.draw(canvas);
                return;
            }
            Drawable drawable2 = this.f15557c;
            int i15 = this.f15559e;
            int i16 = intrinsicWidth / 2;
            int i17 = this.f15560f;
            int i18 = intrinsicHeight / 2;
            drawable2.setBounds(i15 - i16, i17 - i18, i15 + i16, i17 + i18);
            this.f15557c.draw(canvas);
        }
    }
}
