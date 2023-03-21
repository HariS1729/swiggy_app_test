package in.swiggy.android.feature.menu.componentviewmodel;

import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import bp0.k;
import dt.c;
import in.swiggy.android.R;
import in.swiggy.android.commonsui.view.fonts.Font;
import in.swiggy.android.tejas.oldapi.models.restaurant.MenuNudgeTagInfo;
import in.swiggy.android.view.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import lp0.p;
import pl0.c0;
import wt.a;
import wt.b;

/* compiled from: MenuOfferNudgeViewModel.kt */
final class MenuOfferNudgeViewModel$getMessageWithBxGyTagIfApplicable$1 extends Lambda implements p<MenuNudgeTagInfo, String, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SpannableString f15254a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<SpannableString> f15255b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MenuOfferNudgeViewModel f15256c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MenuOfferNudgeViewModel$getMessageWithBxGyTagIfApplicable$1(SpannableString spannableString, Ref$ObjectRef<SpannableString> ref$ObjectRef, MenuOfferNudgeViewModel menuOfferNudgeViewModel) {
        super(2);
        this.f15254a = spannableString;
        this.f15255b = ref$ObjectRef;
        this.f15256c = menuOfferNudgeViewModel;
    }

    public final void a(MenuNudgeTagInfo menuNudgeTagInfo, String str) {
        String str2 = str;
        kotlin.jvm.internal.p.j(menuNudgeTagInfo, "tag");
        kotlin.jvm.internal.p.j(str2, "tagText");
        String spannableString = this.f15254a.toString();
        kotlin.jvm.internal.p.i(spannableString, "offerMessage.toString()");
        String H = o.H(spannableString, "<TagInfo>", kotlin.jvm.internal.p.s(" ", str2), false, 4, (Object) null);
        this.f15255b.f25666a = new SpannableString(H);
        int h02 = StringsKt__StringsKt.h0(H, str, 0, false, 6, (Object) null);
        int length = str.length() + h02;
        int c11 = c.c(menuNudgeTagInfo.getSeparatorColor(), this.f15256c.l().o(R.color.offer_icon_color));
        Font a11 = c0.a(menuNudgeTagInfo.getFontName(), Font.CondensedBold);
        int c12 = c.c(menuNudgeTagInfo.getTextColor(), this.f15256c.l().o(R.color.offer_icon_color));
        int c13 = c.c(menuNudgeTagInfo.getBackgroundColor(), this.f15256c.l().o(R.color.default_menu_discount_tag_color));
        ((SpannableString) this.f15255b.f25666a).setSpan(new a(-0.02f), h02, length, 18);
        ((SpannableString) this.f15255b.f25666a).setSpan(new BackgroundColorSpan(c11), h02 - 1, h02, 18);
        ((SpannableString) this.f15255b.f25666a).setSpan(new b(this.f15256c.a().a(a11)), h02, length, 18);
        ((SpannableString) this.f15255b.f25666a).setSpan(new d(c12, c13, this.f15256c.l().n(R.dimen.dimen_2dp), this.f15256c.l().n(R.dimen.dimen_0dp), this.f15256c.l().n(R.dimen.dimen_4dp), false, true, true, false), h02, length, 18);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((MenuNudgeTagInfo) obj, (String) obj2);
        return k.f22762a;
    }
}
