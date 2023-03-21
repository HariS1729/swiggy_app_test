package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.p;
import p1.b;

/* compiled from: AndroidClipboardManager.android.kt */
public final class k implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final ClipboardManager f7316a;

    public k(ClipboardManager clipboardManager) {
        p.j(clipboardManager, "clipboardManager");
        this.f7316a = clipboardManager;
    }

    public void a(b bVar) {
        p.j(bVar, "annotatedString");
        this.f7316a.setPrimaryClip(ClipData.newPlainText("plain text", l.b(bVar)));
    }

    public final boolean b() {
        ClipDescription primaryClipDescription = this.f7316a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType(HttpRequest.SHARE_TYPE);
        }
        return false;
    }

    public b getText() {
        ClipData primaryClip = this.f7316a.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt != null) {
            charSequence = itemAt.getText();
        }
        return l.a(charSequence);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.p.j(r2, r0)
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            java.util.Objects.requireNonNull(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>((android.content.ClipboardManager) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.k.<init>(android.content.Context):void");
    }
}
