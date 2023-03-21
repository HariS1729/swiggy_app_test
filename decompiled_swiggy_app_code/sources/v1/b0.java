package v1;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;
import p1.a0;
import s2.a;
import v1.l;
import v1.q;
import v1.r;

/* compiled from: TextInputServiceAndroid.android.kt */
public final class b0 {
    private static final boolean a(int i11, int i12) {
        return (i11 & i12) == i12;
    }

    public static final void b(EditorInfo editorInfo, m mVar, TextFieldValue textFieldValue) {
        p.j(editorInfo, "<this>");
        p.j(mVar, "imeOptions");
        p.j(textFieldValue, "textFieldValue");
        int d11 = mVar.d();
        l.a aVar = l.f17134b;
        int i11 = 6;
        if (l.l(d11, aVar.a())) {
            if (!mVar.f()) {
                i11 = 0;
            }
        } else if (l.l(d11, aVar.e())) {
            i11 = 1;
        } else if (l.l(d11, aVar.c())) {
            i11 = 2;
        } else if (l.l(d11, aVar.d())) {
            i11 = 5;
        } else if (l.l(d11, aVar.f())) {
            i11 = 7;
        } else if (l.l(d11, aVar.g())) {
            i11 = 3;
        } else if (l.l(d11, aVar.h())) {
            i11 = 4;
        } else if (!l.l(d11, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i11;
        int e11 = mVar.e();
        r.a aVar2 = r.f17183a;
        if (r.k(e11, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (r.k(e11, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (r.k(e11, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (r.k(e11, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (r.k(e11, aVar2.i())) {
            editorInfo.inputType = 17;
        } else if (r.k(e11, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (r.k(e11, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (r.k(e11, aVar2.e())) {
            editorInfo.inputType = 18;
        } else if (r.k(e11, aVar2.b())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!mVar.f() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= PDChoice.FLAG_COMBO;
            if (l.l(mVar.d(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int c11 = mVar.c();
            q.a aVar3 = q.f17178a;
            if (q.f(c11, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (q.f(c11, aVar3.d())) {
                editorInfo.inputType |= 8192;
            } else if (q.f(c11, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (mVar.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = a0.n(textFieldValue.g());
        editorInfo.initialSelEnd = a0.i(textFieldValue.g());
        a.f(editorInfo, textFieldValue.h());
        editorInfo.imeOptions |= PDButton.FLAG_RADIOS_IN_UNISON;
    }
}
