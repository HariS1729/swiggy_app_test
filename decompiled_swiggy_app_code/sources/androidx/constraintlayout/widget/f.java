package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Placeholder */
public class f extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f8890a;

    /* renamed from: b  reason: collision with root package name */
    private View f8891b;

    /* renamed from: c  reason: collision with root package name */
    private int f8892c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f8891b != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f8891b.getLayoutParams();
            bVar2.f8749v0.p1(0);
            ConstraintWidget.DimensionBehaviour C = bVar.f8749v0.C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
            if (C != dimensionBehaviour) {
                bVar.f8749v0.q1(bVar2.f8749v0.a0());
            }
            if (bVar.f8749v0.X() != dimensionBehaviour) {
                bVar.f8749v0.R0(bVar2.f8749v0.z());
            }
            bVar2.f8749v0.p1(8);
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f8890a == -1 && !isInEditMode()) {
            setVisibility(this.f8892c);
        }
        View findViewById = constraintLayout.findViewById(this.f8890a);
        this.f8891b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f8730j0 = true;
            this.f8891b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f8891b;
    }

    public int getEmptyVisibility() {
        return this.f8892c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i11) {
        View findViewById;
        if (this.f8890a != i11) {
            View view = this.f8891b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.b) this.f8891b.getLayoutParams()).f8730j0 = false;
                this.f8891b = null;
            }
            this.f8890a = i11;
            if (i11 != -1 && (findViewById = ((View) getParent()).findViewById(i11)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i11) {
        this.f8892c = i11;
    }
}
