package in.swiggy.android.feature.menu.componentviewmodel;

import bp0.k;
import in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: MenuOfferNudgeViewModel.kt */
final class MenuOfferNudgeViewModel$bannerValidationByAmount$1 extends Lambda implements p<MenuOfferNudge, MenuOfferNudge, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MenuOfferNudgeViewModel f15248a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f15249b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ double f15250c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MenuOfferNudgeViewModel$bannerValidationByAmount$1(MenuOfferNudgeViewModel menuOfferNudgeViewModel, boolean z11, double d11) {
        super(2);
        this.f15248a = menuOfferNudgeViewModel;
        this.f15249b = z11;
        this.f15250c = d11;
    }

    public final void a(MenuOfferNudge menuOfferNudge, MenuOfferNudge menuOfferNudge2) {
        kotlin.jvm.internal.p.j(menuOfferNudge, "selectedBanner");
        kotlin.jvm.internal.p.j(menuOfferNudge2, "validBanner");
        if (kotlin.jvm.internal.p.e(menuOfferNudge, menuOfferNudge2)) {
            this.f15248a.O2(menuOfferNudge2, this.f15249b);
        } else if (this.f15250c >= menuOfferNudge2.getMaxValue()) {
            this.f15248a.O2(menuOfferNudge2, this.f15249b);
        } else if (this.f15250c < menuOfferNudge.getMaxValue() || menuOfferNudge.getLottieShown()) {
            this.f15248a.O2(menuOfferNudge2, this.f15249b);
        } else {
            this.f15248a.O2(menuOfferNudge, this.f15249b);
            this.f15248a.J2((MenuOfferNudge) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((MenuOfferNudge) obj, (MenuOfferNudge) obj2);
        return k.f22762a;
    }
}
