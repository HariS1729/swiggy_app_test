package q0;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.jvm.internal.p;

/* compiled from: AndroidAutofill.android.kt */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final View f16269a;

    /* renamed from: b  reason: collision with root package name */
    private final i f16270b;

    /* renamed from: c  reason: collision with root package name */
    private final AutofillManager f16271c;

    public a(View view, i iVar) {
        p.j(view, "view");
        p.j(iVar, "autofillTree");
        this.f16269a = view;
        this.f16270b = iVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f16271c = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    public final AutofillManager a() {
        return this.f16271c;
    }

    public final i b() {
        return this.f16270b;
    }

    public final View c() {
        return this.f16269a;
    }
}
