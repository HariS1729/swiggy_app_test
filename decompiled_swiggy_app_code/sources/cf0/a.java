package cf0;

import android.content.Context;
import cg0.n;
import in.swiggy.android.tejas.oldapi.models.cart.CartType;
import os.u;
import ze0.c;
import ze0.d;

/* compiled from: CartIOService */
public class a implements ye0.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f18090a = "cart_new";

    /* renamed from: b  reason: collision with root package name */
    private final String f18091b = "instamart_cart";

    /* renamed from: c  reason: collision with root package name */
    private final String f18092c = "CartIOService";

    /* renamed from: d  reason: collision with root package name */
    ze0.a f18093d;

    /* renamed from: e  reason: collision with root package name */
    ze0.a f18094e;

    /* renamed from: f  reason: collision with root package name */
    n f18095f;

    /* renamed from: g  reason: collision with root package name */
    if0.a f18096g;

    /* renamed from: h  reason: collision with root package name */
    private Context f18097h;

    /* renamed from: cf0.a$a  reason: collision with other inner class name */
    /* compiled from: CartIOService */
    static /* synthetic */ class C0217a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18098a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                in.swiggy.android.tejas.oldapi.models.cart.CartType[] r0 = in.swiggy.android.tejas.oldapi.models.cart.CartType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18098a = r0
                in.swiggy.android.tejas.oldapi.models.cart.CartType r1 = in.swiggy.android.tejas.oldapi.models.cart.CartType.POP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18098a     // Catch:{ NoSuchFieldError -> 0x001d }
                in.swiggy.android.tejas.oldapi.models.cart.CartType r1 = in.swiggy.android.tejas.oldapi.models.cart.CartType.REGULAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cf0.a.C0217a.<clinit>():void");
        }
    }

    public a(Context context, if0.a aVar, n nVar) {
        this.f18097h = context;
        this.f18096g = aVar;
        this.f18095f = nVar;
    }

    private void d() {
        in.swiggy.android.repositories.cart.data.a aVar;
        try {
            aVar = (in.swiggy.android.repositories.cart.data.a) this.f18096g.r2("cart_new", in.swiggy.android.repositories.cart.data.a.class);
        } catch (Exception e11) {
            u.b("CartIOService", e11.toString());
            aVar = null;
        }
        if (aVar == null) {
            aVar = new in.swiggy.android.repositories.cart.data.a();
        }
        this.f18093d = new d(aVar, this.f18095f);
    }

    public bf0.a a(CartType cartType) {
        if (C0217a.f18098a[cartType.ordinal()] != 1) {
            if (this.f18093d == null) {
                d();
            }
            return this.f18093d;
        }
        if (this.f18094e == null) {
            this.f18094e = new c(new in.swiggy.android.repositories.cart.data.a(), this.f18095f);
        }
        return this.f18094e;
    }

    public void b(CartType cartType) {
        if (C0217a.f18098a[cartType.ordinal()] == 2) {
            this.f18096g.S1("cart_new", this.f18093d.f20044a);
        }
    }

    public void c(CartType cartType) {
        if (C0217a.f18098a[cartType.ordinal()] == 2) {
            this.f18096g.U("cart_new");
        }
    }
}
