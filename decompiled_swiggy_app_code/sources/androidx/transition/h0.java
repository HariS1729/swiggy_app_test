package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f11935a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f11936b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b0> f11937c = new ArrayList<>();

    @Deprecated
    public h0() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f11936b == h0Var.f11936b && this.f11935a.equals(h0Var.f11935a);
    }

    public int hashCode() {
        return (this.f11936b.hashCode() * 31) + this.f11935a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f11936b + "\n") + "    values:";
        for (String next : this.f11935a.keySet()) {
            str = str + "    " + next + ": " + this.f11935a.get(next) + "\n";
        }
        return str;
    }

    public h0(View view) {
        this.f11936b = view;
    }
}
