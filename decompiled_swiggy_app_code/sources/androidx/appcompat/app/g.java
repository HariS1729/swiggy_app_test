package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.core.view.f;
import defpackage.p1;

/* compiled from: AppCompatDialog */
public class g extends Dialog implements d {

    /* renamed from: a  reason: collision with root package name */
    private e f1582a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f1583b = new a();

    /* compiled from: AppCompatDialog */
    class a implements f.a {
        a() {
        }

        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.c(keyEvent);
        }
    }

    public g(Context context, int i11) {
        super(context, b(context, i11));
        e a11 = a();
        a11.I(b(context, i11));
        a11.t((Bundle) null);
    }

    private static int b(Context context, int i11) {
        if (i11 != 0) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public e a() {
        if (this.f1582a == null) {
            this.f1582a = e.j(this, this);
        }
        return this.f1582a;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i11) {
        return a().C(i11);
    }

    public void dismiss() {
        super.dismiss();
        a().u();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f.e(this.f1583b, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i11) {
        return a().k(i11);
    }

    public void invalidateOptionsMenu() {
        a().r();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a().q();
        super.onCreate(bundle);
        a().t(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        a().z();
    }

    public void onSupportActionModeFinished(p1.c cVar) {
    }

    public void onSupportActionModeStarted(p1.c cVar) {
    }

    public p1.c onWindowStartingSupportActionMode(p1.c.a aVar) {
        return null;
    }

    public void setContentView(int i11) {
        a().D(i11);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().J(charSequence);
    }

    public void setContentView(View view) {
        a().E(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().F(view, layoutParams);
    }

    public void setTitle(int i11) {
        super.setTitle(i11);
        a().J(getContext().getString(i11));
    }
}
