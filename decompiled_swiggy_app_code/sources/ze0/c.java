package ze0;

import cg0.n;
import in.swiggy.android.repositories.cart.data.a;

/* compiled from: PopCart */
public class c extends d {
    public c(a aVar, n nVar) {
        super(aVar, nVar);
    }

    public int d() {
        if (B() != null) {
            return B().getSubTotal();
        }
        return 0;
    }
}
