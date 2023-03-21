package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.R;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.j;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;

/* compiled from: MenuDialogHelper */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a  reason: collision with root package name */
    private e f1758a;

    /* renamed from: b  reason: collision with root package name */
    private c f1759b;

    /* renamed from: c  reason: collision with root package name */
    c f1760c;

    /* renamed from: d  reason: collision with root package name */
    private j.a f1761d;

    public f(e eVar) {
        this.f1758a = eVar;
    }

    public void a() {
        c cVar = this.f1759b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        e eVar = this.f1758a;
        c.a aVar = new c.a(eVar.w());
        c cVar = new c(aVar.getContext(), R.layout.abc_list_menu_item_layout);
        this.f1760c = cVar;
        cVar.k(this);
        this.f1758a.b(this.f1760c);
        aVar.a(this.f1760c.a(), this);
        View A = eVar.A();
        if (A != null) {
            aVar.c(A);
        } else {
            aVar.d(eVar.y()).setTitle(eVar.z());
        }
        aVar.h(this);
        c create = aVar.create();
        this.f1759b = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1759b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= PDChoice.FLAG_COMBO;
        this.f1759b.show();
    }

    public void c(e eVar, boolean z11) {
        if (z11 || eVar == this.f1758a) {
            a();
        }
        j.a aVar = this.f1761d;
        if (aVar != null) {
            aVar.c(eVar, z11);
        }
    }

    public boolean d(e eVar) {
        j.a aVar = this.f1761d;
        if (aVar != null) {
            return aVar.d(eVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i11) {
        this.f1758a.N((g) this.f1760c.a().getItem(i11), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1760c.c(this.f1758a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i11 == 82 || i11 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1759b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1759b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1758a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1758a.performShortcut(i11, keyEvent, 0);
    }
}
