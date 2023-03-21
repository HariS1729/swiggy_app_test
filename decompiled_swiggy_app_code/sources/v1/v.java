package v1;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.input.TextFieldValue;
import com.newrelic.agent.android.agentdata.HexAttribute;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import p1.a0;

/* compiled from: RecordingInputConnection.android.kt */
public final class v implements InputConnection {

    /* renamed from: a  reason: collision with root package name */
    private final n f17220a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f17221b;

    /* renamed from: c  reason: collision with root package name */
    private int f17222c;

    /* renamed from: d  reason: collision with root package name */
    private TextFieldValue f17223d;

    /* renamed from: e  reason: collision with root package name */
    private int f17224e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17225f;

    /* renamed from: g  reason: collision with root package name */
    private final List<d> f17226g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private boolean f17227h = true;

    public v(TextFieldValue textFieldValue, n nVar, boolean z11) {
        p.j(textFieldValue, "initState");
        p.j(nVar, "eventCallback");
        this.f17220a = nVar;
        this.f17221b = z11;
        this.f17223d = textFieldValue;
    }

    private final void a(d dVar) {
        b();
        try {
            this.f17226g.add(dVar);
        } finally {
            c();
        }
    }

    private final boolean b() {
        this.f17222c++;
        return true;
    }

    private final boolean c() {
        int i11 = this.f17222c - 1;
        this.f17222c = i11;
        if (i11 == 0 && (!this.f17226g.isEmpty())) {
            this.f17220a.c(s.G0(this.f17226g));
            this.f17226g.clear();
        }
        if (this.f17222c > 0) {
            return true;
        }
        return false;
    }

    private final void d(int i11) {
        sendKeyEvent(new KeyEvent(0, i11));
        sendKeyEvent(new KeyEvent(1, i11));
    }

    public boolean beginBatchEdit() {
        boolean z11 = this.f17227h;
        return z11 ? b() : z11;
    }

    public boolean clearMetaKeyStates(int i11) {
        boolean z11 = this.f17227h;
        if (z11) {
            return false;
        }
        return z11;
    }

    public void closeConnection() {
        this.f17226g.clear();
        this.f17222c = 0;
        this.f17227h = false;
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z11 = this.f17227h;
        if (z11) {
            return false;
        }
        return z11;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        p.j(inputContentInfo, "inputContentInfo");
        boolean z11 = this.f17227h;
        if (z11) {
            return false;
        }
        return z11;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z11 = this.f17227h;
        return z11 ? this.f17221b : z11;
    }

    public boolean commitText(CharSequence charSequence, int i11) {
        boolean z11 = this.f17227h;
        if (z11) {
            a(new a(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    public boolean deleteSurroundingText(int i11, int i12) {
        boolean z11 = this.f17227h;
        if (!z11) {
            return z11;
        }
        a(new b(i11, i12));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        boolean z11 = this.f17227h;
        if (!z11) {
            return z11;
        }
        a(new c(i11, i12));
        return true;
    }

    public final void e(TextFieldValue textFieldValue) {
        p.j(textFieldValue, "value");
        this.f17223d = textFieldValue;
    }

    public boolean endBatchEdit() {
        return c();
    }

    public final void f(TextFieldValue textFieldValue, o oVar, View view) {
        p.j(textFieldValue, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(oVar, "inputMethodManager");
        p.j(view, "view");
        if (this.f17227h) {
            e(textFieldValue);
            if (this.f17225f) {
                oVar.d(view, this.f17224e, p.a(textFieldValue));
            }
            a0 f11 = textFieldValue.f();
            int l11 = f11 != null ? a0.l(f11.r()) : -1;
            a0 f12 = textFieldValue.f();
            oVar.c(view, a0.l(textFieldValue.g()), a0.k(textFieldValue.g()), l11, f12 != null ? a0.k(f12.r()) : -1);
        }
    }

    public boolean finishComposingText() {
        boolean z11 = this.f17227h;
        if (!z11) {
            return z11;
        }
        a(new i());
        return true;
    }

    public int getCursorCapsMode(int i11) {
        return TextUtils.getCapsMode(this.f17223d.h(), a0.l(this.f17223d.g()), i11);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i11) {
        boolean z11 = true;
        int i12 = 0;
        if ((i11 & 1) == 0) {
            z11 = false;
        }
        this.f17225f = z11;
        if (z11) {
            if (extractedTextRequest != null) {
                i12 = extractedTextRequest.token;
            }
            this.f17224e = i12;
        }
        return p.a(this.f17223d);
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i11) {
        if (a0.h(this.f17223d.g())) {
            return null;
        }
        return z.a(this.f17223d).toString();
    }

    public CharSequence getTextAfterCursor(int i11, int i12) {
        return z.b(this.f17223d, i11).toString();
    }

    public CharSequence getTextBeforeCursor(int i11, int i12) {
        return z.c(this.f17223d, i11).toString();
    }

    public boolean performContextMenuAction(int i11) {
        boolean z11 = this.f17227h;
        if (z11) {
            z11 = false;
            switch (i11) {
                case 16908319:
                    a(new y(0, this.f17223d.h().length()));
                    break;
                case 16908320:
                    d(277);
                    break;
                case 16908321:
                    d(278);
                    break;
                case 16908322:
                    d(279);
                    break;
            }
        }
        return z11;
    }

    public boolean performEditorAction(int i11) {
        int i12;
        boolean z11 = this.f17227h;
        if (!z11) {
            return z11;
        }
        if (i11 != 0) {
            switch (i11) {
                case 2:
                    i12 = l.f17134b.c();
                    break;
                case 3:
                    i12 = l.f17134b.g();
                    break;
                case 4:
                    i12 = l.f17134b.h();
                    break;
                case 5:
                    i12 = l.f17134b.d();
                    break;
                case 6:
                    i12 = l.f17134b.b();
                    break;
                case 7:
                    i12 = l.f17134b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i11);
                    i12 = l.f17134b.a();
                    break;
            }
        } else {
            i12 = l.f17134b.a();
        }
        this.f17220a.b(i12);
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z11 = this.f17227h;
        if (z11) {
            return true;
        }
        return z11;
    }

    public boolean reportFullscreenMode(boolean z11) {
        return false;
    }

    public boolean requestCursorUpdates(int i11) {
        boolean z11 = this.f17227h;
        if (!z11) {
            return z11;
        }
        Log.w("RecordingIC", "requestCursorUpdates is not supported");
        return false;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        p.j(keyEvent, "event");
        boolean z11 = this.f17227h;
        if (!z11) {
            return z11;
        }
        this.f17220a.a(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i11, int i12) {
        boolean z11 = this.f17227h;
        if (z11) {
            a(new w(i11, i12));
        }
        return z11;
    }

    public boolean setComposingText(CharSequence charSequence, int i11) {
        boolean z11 = this.f17227h;
        if (z11) {
            a(new x(String.valueOf(charSequence), i11));
        }
        return z11;
    }

    public boolean setSelection(int i11, int i12) {
        boolean z11 = this.f17227h;
        if (!z11) {
            return z11;
        }
        a(new y(i11, i12));
        return true;
    }
}
