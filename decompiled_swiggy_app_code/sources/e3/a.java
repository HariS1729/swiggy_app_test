package e3;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.emoji.R;

/* compiled from: EditTextAttributeHelper */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f14283a;

    public a(View view, AttributeSet attributeSet, int i11, int i12) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.EmojiEditText, i11, i12);
            this.f14283a = obtainStyledAttributes.getInteger(R.styleable.EmojiEditText_maxEmojiCount, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }

    public int a() {
        return this.f14283a;
    }
}
