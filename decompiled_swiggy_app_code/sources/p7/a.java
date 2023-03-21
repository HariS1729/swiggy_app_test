package p7;

import android.text.Html;
import android.widget.TextView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import kotlin.jvm.internal.p;
import q7.e;

/* compiled from: DialogMessageSettings.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f16265a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16266b;

    /* renamed from: c  reason: collision with root package name */
    private final MaterialDialog f16267c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f16268d;

    public a(MaterialDialog materialDialog, TextView textView) {
        p.k(materialDialog, "dialog");
        p.k(textView, "messageTextView");
        this.f16267c = materialDialog;
        this.f16268d = textView;
    }

    private final CharSequence b(CharSequence charSequence, boolean z11) {
        if (charSequence == null) {
            return null;
        }
        return z11 ? Html.fromHtml(charSequence.toString()) : charSequence;
    }

    public final a a(float f11) {
        this.f16266b = true;
        this.f16268d.setLineSpacing(0.0f, f11);
        return this;
    }

    public final void c(Integer num, CharSequence charSequence) {
        if (!this.f16266b) {
            a(e.f16390a.n(this.f16267c.e(), R.attr.md_line_spacing_body, 1.1f));
        }
        TextView textView = this.f16268d;
        CharSequence b11 = b(charSequence, this.f16265a);
        if (b11 == null) {
            b11 = e.r(e.f16390a, this.f16267c, num, (Integer) null, this.f16265a, 4, (Object) null);
        }
        textView.setText(b11);
    }
}
