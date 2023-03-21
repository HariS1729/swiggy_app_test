package co.hyperverge.hypersnapsdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import co.hyperverge.hypersnapsdk.R;
import z5.f;

public class TopBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    int f13353a = 3;

    public TopBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            a();
        }
    }

    private void a() {
        int i11 = 0;
        setOrientation(0);
        while (i11 < this.f13353a) {
            View inflate = LinearLayout.inflate(getContext(), R.layout.view_top_tick, (ViewGroup) null);
            if (i11 == 0) {
                b(inflate, R.drawable.circular_dots);
            } else {
                b(inflate, R.drawable.grey_dots);
            }
            int i12 = i11 + 1;
            inflate.setTag("dot" + i12);
            addView(inflate);
            if (i11 < 2) {
                View inflate2 = LinearLayout.inflate(getContext(), R.layout.view_bar, (ViewGroup) null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f.b(getContext(), 40.0f), f.b(getContext(), 1.0f));
                layoutParams.gravity = 17;
                inflate2.setTag("bar" + i12);
                inflate2.setLayoutParams(layoutParams);
                addView(inflate2);
            }
            i11 = i12;
        }
    }

    public void b(View view, int i11) {
        view.setBackground(getContext().getDrawable(i11));
    }
}
