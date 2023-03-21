package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.g;

/* compiled from: AppCompatTextClassifierHelper */
final class r {

    /* renamed from: a  reason: collision with root package name */
    private TextView f2248a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f2249b;

    r(TextView textView) {
        this.f2248a = (TextView) g.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f2249b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f2248a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f2249b = textClassifier;
    }
}
