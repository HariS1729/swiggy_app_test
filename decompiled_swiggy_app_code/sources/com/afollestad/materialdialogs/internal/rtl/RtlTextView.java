package com.afollestad.materialdialogs.internal.rtl;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;
import q7.f;

/* compiled from: RtlTextView.kt */
public final class RtlTextView extends AppCompatTextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.k(context, LogCategory.CONTEXT);
        f.g(this);
    }
}
