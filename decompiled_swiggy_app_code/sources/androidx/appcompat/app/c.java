package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertDialog */
public class c extends g {

    /* renamed from: c  reason: collision with root package name */
    final AlertController f1513c = new AlertController(getContext(), this, getWindow());

    /* compiled from: AlertDialog */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f1514a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1515b;

        public a(Context context) {
            this(context, c.g(context, 0));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1514a;
            fVar.f1493w = listAdapter;
            fVar.f1494x = onClickListener;
            return this;
        }

        public a b(boolean z11) {
            this.f1514a.f1490r = z11;
            return this;
        }

        public a c(View view) {
            this.f1514a.f1483g = view;
            return this;
        }

        public c create() {
            c cVar = new c(this.f1514a.f1477a, this.f1515b);
            this.f1514a.a(cVar.f1513c);
            cVar.setCancelable(this.f1514a.f1490r);
            if (this.f1514a.f1490r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f1514a.f1491s);
            cVar.setOnDismissListener(this.f1514a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f1514a.f1492u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a d(Drawable drawable) {
            this.f1514a.f1480d = drawable;
            return this;
        }

        public a e(CharSequence charSequence) {
            this.f1514a.f1484h = charSequence;
            return this;
        }

        public a f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1514a;
            fVar.f1486l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public a g(DialogInterface.OnDismissListener onDismissListener) {
            this.f1514a.t = onDismissListener;
            return this;
        }

        public Context getContext() {
            return this.f1514a.f1477a;
        }

        public a h(DialogInterface.OnKeyListener onKeyListener) {
            this.f1514a.f1492u = onKeyListener;
            return this;
        }

        public a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1514a;
            fVar.f1485i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public a j(ListAdapter listAdapter, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1514a;
            fVar.f1493w = listAdapter;
            fVar.f1494x = onClickListener;
            fVar.I = i11;
            fVar.H = true;
            return this;
        }

        public a k(int i11) {
            AlertController.f fVar = this.f1514a;
            fVar.f1496z = null;
            fVar.f1495y = i11;
            fVar.E = false;
            return this;
        }

        public c l() {
            c create = create();
            create.show();
            return create;
        }

        public a setNegativeButton(int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1514a;
            fVar.f1486l = fVar.f1477a.getText(i11);
            this.f1514a.n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f1514a;
            fVar.f1485i = fVar.f1477a.getText(i11);
            this.f1514a.k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f1514a.f1482f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.f fVar = this.f1514a;
            fVar.f1496z = view;
            fVar.f1495y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i11) {
            this.f1514a = new AlertController.f(new ContextThemeWrapper(context, c.g(context, i11)));
            this.f1515b = i11;
        }
    }

    protected c(Context context, int i11) {
        super(context, g(context, i11));
    }

    static int g(Context context, int i11) {
        if (((i11 >>> 24) & 255) >= 1) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button e(int i11) {
        return this.f1513c.c(i11);
    }

    public ListView f() {
        return this.f1513c.e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1513c.f();
    }

    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (this.f1513c.h(i11, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (this.f1513c.i(i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1513c.r(charSequence);
    }
}
