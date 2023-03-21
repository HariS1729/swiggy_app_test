package cf0;

import android.content.SharedPreferences;
import ao0.d;
import in.swiggy.android.tejas.oldapi.models.cart.CartType;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart;
import java.util.HashMap;
import java.util.Map;
import os.d0;
import ye0.b;
import ze0.a;

/* compiled from: MealCartService */
public class m extends h implements k {

    /* renamed from: x  reason: collision with root package name */
    private String f18128x;

    /* renamed from: y  reason: collision with root package name */
    private Map<String, a> f18129y = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    private int f18130z = 0;

    public m(String str, ye0.a aVar, b bVar, SharedPreferences sharedPreferences) {
        super(aVar, bVar, sharedPreferences);
        this.f18128x = str;
        this.f18102c = null;
    }

    public static m q0(String str) {
        return new m(str, (ye0.a) null, (b) null, (SharedPreferences) null);
    }

    public int A() {
        int i11 = 0;
        for (a v : this.f18129y.values()) {
            i11 += v.v();
        }
        return i11;
    }

    public void C(int i11) {
        this.f18130z = i11;
    }

    public d<MenuItemInCart> K(String str) {
        return this.f18102c.A0();
    }

    /* access modifiers changed from: protected */
    public void Z() {
    }

    public void a() {
    }

    public void b() {
        this.f18129y.clear();
    }

    /* access modifiers changed from: protected */
    public void b0(CartType cartType, boolean z11) {
    }

    public void h(String str) {
        if (!d0.e(str)) {
            if (this.f18129y.containsKey(str)) {
                this.f18102c = this.f18129y.get(str);
                return;
            }
            ze0.d dVar = new ze0.d(new in.swiggy.android.repositories.cart.data.b(), this.f18106g);
            this.f18102c = dVar;
            this.f18129y.put(str, dVar);
        }
    }

    public Map<String, a> j() {
        return this.f18129y;
    }

    public void m0() {
    }

    /* access modifiers changed from: protected */
    public void o0() {
    }

    public int p0() {
        return this.f18130z;
    }

    public bf0.a v(CartType cartType) {
        return this.f18102c;
    }
}
