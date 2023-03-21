package ph0;

import android.content.Intent;
import android.net.Uri;
import androidx.databinding.ObservableArrayList;
import com.brentvatne.react.ReactVideoViewManager;
import hb0.d;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
import kotlin.jvm.internal.p;
import lb0.c;

/* compiled from: CustomIntentBottomSheetViewModel.kt */
public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final List<i> f19820a;

    /* renamed from: b  reason: collision with root package name */
    private final d f19821b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19822c;

    /* renamed from: d  reason: collision with root package name */
    private final Uri f19823d;

    /* renamed from: e  reason: collision with root package name */
    private final ObservableArrayList<d> f19824e = new ObservableArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private final c<g> f19825f = new e(this);

    public f(List<? extends i> list, d dVar, String str, Uri uri) {
        p.j(list, "providers");
        p.j(dVar, PaymentConstants.SERVICE);
        p.j(uri, ReactVideoViewManager.PROP_SRC_URI);
        this.f19820a = list;
        this.f19821b = dVar;
        this.f19822c = str;
        this.f19823d = uri;
    }

    /* access modifiers changed from: private */
    public static final void b(f fVar, g gVar, int i11) {
        p.j(fVar, "this$0");
        Intent b11 = gVar.b();
        if (b11 != null) {
            fVar.e().a(b11);
        }
    }

    public final c<g> c() {
        return this.f19825f;
    }

    public final ObservableArrayList<d> d() {
        return this.f19824e;
    }

    public final d e() {
        return this.f19821b;
    }

    public final String f() {
        return this.f19822c;
    }

    public final Uri g() {
        return this.f19823d;
    }

    public void init() {
        for (i iVar : this.f19820a) {
            if (iVar.a() != null) {
                d().add(new g(iVar));
            }
        }
    }
}
