package z1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.p;
import t0.l;
import u0.f1;

/* compiled from: ShaderBrushSpan.android.kt */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a  reason: collision with root package name */
    private final f1 f18065a;

    /* renamed from: b  reason: collision with root package name */
    private l f18066b;

    public a(f1 f1Var) {
        p.j(f1Var, "shaderBrush");
        this.f18065a = f1Var;
    }

    public final void a(l lVar) {
        this.f18066b = lVar;
    }

    public void updateDrawState(TextPaint textPaint) {
        l lVar;
        if (textPaint != null && (lVar = this.f18066b) != null) {
            textPaint.setShader(this.f18065a.b(lVar.m()));
        }
    }
}
