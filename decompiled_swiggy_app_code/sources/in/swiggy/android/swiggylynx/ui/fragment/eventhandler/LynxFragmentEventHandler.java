package in.swiggy.android.swiggylynx.ui.fragment.eventhandler;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.r;
import bi0.a;
import kotlin.jvm.internal.p;
import os.j;
import os.k;

/* compiled from: LynxFragmentEventHandler.kt */
public final class LynxFragmentEventHandler {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a f19586a;

    /* renamed from: b  reason: collision with root package name */
    private final r f19587b;

    public LynxFragmentEventHandler(a aVar, r rVar) {
        p.j(aVar, "fragmentService");
        p.j(rVar, "viewLifeCycleOwner");
        this.f19586a = aVar;
        this.f19587b = rVar;
    }

    public final void b(LiveData<j<zh0.a>> liveData) {
        p.j(liveData, "event");
        liveData.j(this.f19587b, new k(new LynxFragmentEventHandler$listenToEvents$1(this)));
    }
}
