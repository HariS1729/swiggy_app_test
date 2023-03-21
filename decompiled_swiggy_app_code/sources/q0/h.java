package q0;

import androidx.compose.ui.autofill.AutofillType;
import bp0.k;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Autofill.kt */
public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f16276d = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16277e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final List<AutofillType> f16278a;

    /* renamed from: b  reason: collision with root package name */
    private t0.h f16279b;

    /* renamed from: c  reason: collision with root package name */
    private final l<String, k> f16280c;

    /* compiled from: Autofill.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public final List<AutofillType> a() {
        return this.f16278a;
    }

    public final t0.h b() {
        return this.f16279b;
    }

    public final l<String, k> c() {
        return this.f16280c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p.e(this.f16278a, hVar.f16278a) && p.e(this.f16279b, hVar.f16279b) && p.e(this.f16280c, hVar.f16280c);
    }

    public int hashCode() {
        int hashCode = this.f16278a.hashCode() * 31;
        t0.h hVar = this.f16279b;
        int i11 = 0;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        l<String, k> lVar = this.f16280c;
        if (lVar != null) {
            i11 = lVar.hashCode();
        }
        return hashCode2 + i11;
    }
}
