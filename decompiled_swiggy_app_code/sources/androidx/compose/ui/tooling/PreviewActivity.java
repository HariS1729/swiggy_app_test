package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import c.a;
import kotlin.jvm.internal.p;
import l0.b;

/* compiled from: PreviewActivity.kt */
public final class PreviewActivity extends ComponentActivity {

    /* renamed from: a  reason: collision with root package name */
    private final String f7674a = "PreviewActivity";

    private final void b1(String str) {
        Log.d(this.f7674a, p.s("PreviewActivity has composable ", str));
        String f12 = StringsKt__StringsKt.f1(str, '.', (String) null, 2, (Object) null);
        String X0 = StringsKt__StringsKt.X0(str, '.', (String) null, 2, (Object) null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra == null) {
            String str2 = this.f7674a;
            Log.d(str2, "Previewing '" + X0 + "' without a parameter provider.");
            a.b(this, (androidx.compose.runtime.a) null, b.c(-985531688, true, new PreviewActivity$setComposableContent$2(f12, X0)), 1, (Object) null);
            return;
        }
        c1(f12, X0, stringExtra);
    }

    private final void c1(String str, String str2, String str3) {
        String str4 = this.f7674a;
        Log.d(str4, "Previewing '" + str2 + "' with parameter provider: '" + str3 + '\'');
        Object[] b11 = b2.b.b(b2.b.a(str3), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (b11.length > 1) {
            a.b(this, (androidx.compose.runtime.a) null, b.c(-985538154, true, new PreviewActivity$setParameterizedContent$1(b11, str, str2)), 1, (Object) null);
        } else {
            a.b(this, (androidx.compose.runtime.a) null, b.c(-985537892, true, new PreviewActivity$setParameterizedContent$2(str, str2, b11)), 1, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.f7674a, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("composable")) != null) {
            b1(stringExtra);
        }
    }
}
