package in.swiggy.android.feature.menu.componentviewmodel;

import bp0.k;
import in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: MenuOfferNudgeViewModel.kt */
final class MenuOfferNudgeViewModel$bannerValidationByQty$1 extends Lambda implements p<MenuOfferNudge, MenuOfferNudge, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MenuOfferNudgeViewModel f15251a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f15252b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f15253c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MenuOfferNudgeViewModel$bannerValidationByQty$1(MenuOfferNudgeViewModel menuOfferNudgeViewModel, boolean z11, int i11) {
        super(2);
        this.f15251a = menuOfferNudgeViewModel;
        this.f15252b = z11;
        this.f15253c = i11;
    }

    public final void a(MenuOfferNudge menuOfferNudge, MenuOfferNudge menuOfferNudge2) {
        kotlin.jvm.internal.p.j(menuOfferNudge, "selectedBanner");
        kotlin.jvm.internal.p.j(menuOfferNudge2, "validBanner");
        if (kotlin.jvm.internal.p.e(menuOfferNudge, menuOfferNudge2)) {
            this.f15251a.P2(menuOfferNudge2, this.f15252b);
        } else if (this.f15253c >= menuOfferNudge2.getMaxItemCount()) {
            this.f15251a.P2(menuOfferNudge2, this.f15252b);
        } else if (this.f15253c < menuOfferNudge.getMaxItemCount() || menuOfferNudge.getLottieShown()) {
            this.f15251a.P2(menuOfferNudge2, this.f15252b);
        } else {
            this.f15251a.P2(menuOfferNudge, this.f15252b);
            this.f15251a.J2((MenuOfferNudge) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((MenuOfferNudge) obj, (MenuOfferNudge) obj2);
        return k.f22762a;
    }
}
