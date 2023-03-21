package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;

/* compiled from: AppCompatSeekBar */
public class p extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    private final q f2223a;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2223a.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2223a.i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2223a.g(canvas);
    }

    public p(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        j0.a(this, getContext());
        q qVar = new q(this);
        this.f2223a = qVar;
        qVar.c(attributeSet, i11);
    }
}
