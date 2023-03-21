package in.swiggy.android.feature.menu.componentviewmodel;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.databinding.ObservableBoolean;
import bp0.k;
import in.swiggy.android.R;
import in.swiggy.android.commonsui.view.fonts.Font;
import in.swiggy.android.mvvm.viewmodels.SwiggyBaseViewModel;
import in.swiggy.android.tejas.feature.listing.removefilter.model.HighlightedText;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItem;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItemInCart;
import in.swiggy.android.tejas.oldapi.models.restaurant.DiscountInfo;
import in.swiggy.android.tejas.oldapi.models.restaurant.MenuNudgeTagInfo;
import in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge;
import in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant;
import in.swiggy.android.tejas.utils.HighlightTextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import js.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.u;
import n60.f;
import os.z;
import wt.b;

/* compiled from: MenuOfferNudgeViewModel.kt */
public final class MenuOfferNudgeViewModel extends SwiggyBaseViewModel {

    /* renamed from: o0  reason: collision with root package name */
    public static final a f15244o0 = new a((i) null);

    /* renamed from: p0  reason: collision with root package name */
    public static final int f15245p0 = 8;
    private final eo0.a N;
    private final u<SpannableString, Integer, Integer, Float, Boolean, String, Boolean, k> O;
    private final lp0.a<k> P;
    private final l<Boolean, k> Q;
    private final lp0.a<k> R;
    private final ObservableBoolean S = new ObservableBoolean(false);
    private MenuOfferNudge T;
    private Font U = Font.Regular;
    private MenuOfferNudge V;
    private Restaurant W;

    /* renamed from: c0  reason: collision with root package name */
    public f f15246c0;

    /* renamed from: n0  reason: collision with root package name */
    private final HashMap<String, MenuItemInCart> f15247n0 = new HashMap<>();

    /* compiled from: MenuOfferNudgeViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public MenuOfferNudgeViewModel(eo0.a aVar, u<? super SpannableString, ? super Integer, ? super Integer, ? super Float, ? super Boolean, ? super String, ? super Boolean, k> uVar, lp0.a<k> aVar2, l<? super Boolean, k> lVar, lp0.a<k> aVar3) {
        p.j(aVar, "allSubscription");
        p.j(uVar, "showCrouton");
        p.j(aVar2, "resetCrouton");
        p.j(lVar, "croutonShown");
        p.j(aVar3, "refreshCart");
        this.N = aVar;
        this.O = uVar;
        this.P = aVar2;
        this.Q = lVar;
        this.R = aVar3;
    }

    private final SpannableString C2(String str, double d11) {
        String valueOf = String.valueOf((long) Math.floor(d11));
        String H = o.H(str, "<discounted_amount>", valueOf, false, 4, (Object) null);
        SpannableString x22 = x2(H);
        int h02 = StringsKt__StringsKt.h0(H, valueOf, 0, false, 6, (Object) null);
        x22.setSpan(new b(a().a(Font.ExtraBold)), h02, valueOf.length() + h02, 18);
        return x22;
    }

    private final SpannableString D2(String str, double d11) {
        String a11 = z.a(d11);
        int o11 = l().o(R.color.laser_lemon_yellow);
        p.i(a11, "formattedAmount");
        String H = o.H(str, "<X>", a11, false, 4, (Object) null);
        SpannableString x22 = x2(H);
        int h02 = StringsKt__StringsKt.h0(H, a11, 0, false, 6, (Object) null);
        int length = a11.length() + h02;
        x22.setSpan(new ForegroundColorSpan(o11), h02, length, 18);
        x22.setSpan(new b(a().a(Font.ExtraBold)), h02, length, 18);
        return x22;
    }

    private final void K2(boolean z11) {
        if (!S1().isEmpty()) {
            String restaurantId = S1().getRestaurantId();
            Restaurant restaurant = this.W;
            if (p.e(restaurantId, restaurant == null ? null : restaurant.mId)) {
                N2(z11);
                return;
            }
        }
        F2();
    }

    /* access modifiers changed from: private */
    public static final k M2(Ref$ObjectRef ref$ObjectRef) {
        p.j(ref$ObjectRef, "$finalOfferNudge");
        ((MenuOfferNudge) ref$ObjectRef.f25666a).setLottieShown(true);
        return k.f22762a;
    }

    /* access modifiers changed from: private */
    public static final void R2(MenuOfferNudgeViewModel menuOfferNudgeViewModel, MenuItemInCart menuItemInCart) {
        p.j(menuOfferNudgeViewModel, "this$0");
        menuOfferNudgeViewModel.n2(menuItemInCart);
    }

    /* access modifiers changed from: private */
    public static final void S2(Throwable th2) {
        os.u.h("MenuOfferNudgeViewModel", th2);
    }

    private final void n2(MenuItemInCart menuItemInCart) {
        MenuItem menuItem;
        if (!(menuItemInCart == null || (menuItem = menuItemInCart.getMenuItem()) == null)) {
            if (c.e(Boolean.valueOf(S1().x(menuItem))) && c.h(Boolean.valueOf(z2().containsKey(menuItem.mId)))) {
                z2().remove(menuItem.mId);
            } else if (c.h(Boolean.valueOf(S1().x(menuItem))) && c.h(Boolean.valueOf(z2().containsKey(menuItem.mId)))) {
                HashMap<String, MenuItemInCart> z22 = z2();
                String str = menuItem.mId;
                p.i(str, "menuItem.mId");
                z22.put(str, menuItemInCart);
            } else if (c.h(Boolean.valueOf(S1().x(menuItem))) && c.e(Boolean.valueOf(z2().containsKey(menuItem.mId)))) {
                String str2 = menuItem.nudgeType;
                if (c.e(Boolean.valueOf(str2 == null || str2.length() == 0))) {
                    HashMap<String, MenuItemInCart> z23 = z2();
                    String str3 = menuItem.mId;
                    p.i(str3, "menuItem.mId");
                    z23.put(str3, menuItemInCart);
                }
            }
        }
        K2(false);
    }

    private final void o2(HighlightedText highlightedText, SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length();
        if (highlightedText instanceof HighlightedText.Bold) {
            spannableStringBuilder.append(highlightedText.getText());
            spannableStringBuilder.setSpan(new b(a().a(Font.ExtraBold)), length, spannableStringBuilder.length(), 33);
            return;
        }
        spannableStringBuilder.append(highlightedText.getText());
        spannableStringBuilder.setSpan(new b(a().a(this.U)), length, spannableStringBuilder.length(), 33);
    }

    private final void p2(MenuOfferNudge menuOfferNudge, boolean z11, double d11) {
        if (((k) c.o(this.T, menuOfferNudge, new MenuOfferNudgeViewModel$bannerValidationByAmount$1(this, z11, d11))) == null && menuOfferNudge != null) {
            O2(menuOfferNudge, z11);
        }
    }

    private final void q2(MenuOfferNudge menuOfferNudge, boolean z11, int i11) {
        if (((k) c.o(this.T, menuOfferNudge, new MenuOfferNudgeViewModel$bannerValidationByQty$1(this, z11, i11))) == null && menuOfferNudge != null) {
            P2(menuOfferNudge, z11);
        }
    }

    private final double t2(int i11) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f15247n0.entrySet()) {
            String str = (String) next.getKey();
            List<MenuItemInCart> R2 = S1().R(((MenuItemInCart) next.getValue()).getMenuItem());
            if (R2 != null) {
                for (MenuItemInCart menuItemInCart : R2) {
                    int C = S1().C(menuItemInCart);
                    double localSubTotal = menuItemInCart.getLocalSubTotal() / ((double) C);
                    for (int i12 = 0; i12 < C; i12++) {
                        arrayList.add(Double.valueOf(localSubTotal));
                    }
                }
            }
        }
        return s.w0(s.t0(arrayList).subList(0, i11));
    }

    private final int u2() {
        int i11 = 0;
        for (Map.Entry next : this.f15247n0.entrySet()) {
            String str = (String) next.getKey();
            i11 += S1().L(((MenuItemInCart) next.getValue()).getMenuItem());
        }
        return i11;
    }

    private final double w2(DiscountInfo discountInfo) {
        Double maxValue;
        double d11 = 0.0d;
        if (!o.x(discountInfo == null ? null : discountInfo.getDiscountType(), "percentage", true)) {
            return 0.0d;
        }
        double a02 = S1().a0();
        if (!(discountInfo == null || (maxValue = discountInfo.getMaxValue()) == null)) {
            d11 = maxValue.doubleValue();
        }
        return (a02 * d11) / ((double) 100);
    }

    private final SpannableString y2(SpannableString spannableString, MenuNudgeTagInfo menuNudgeTagInfo) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f25666a = new SpannableString(spannableString);
        String str = null;
        if (StringsKt__StringsKt.S(spannableString, "<TagInfo>", false, 2, (Object) null)) {
            if (menuNudgeTagInfo != null) {
                str = menuNudgeTagInfo.getTitle();
            }
            c.o(menuNudgeTagInfo, str, new MenuOfferNudgeViewModel$getMessageWithBxGyTagIfApplicable$1(spannableString, ref$ObjectRef, this));
        }
        return (SpannableString) ref$ObjectRef.f25666a;
    }

    public final lp0.a<k> A2() {
        return this.R;
    }

    public final ObservableBoolean B2() {
        return this.S;
    }

    public final void E2(MenuOfferNudge menuOfferNudge, boolean z11, SpannableString spannableString) {
        String str;
        p.j(menuOfferNudge, "offerNudge");
        String s11 = p.s(menuOfferNudge.getCouponCode(), "-offer-nudge");
        if (z11 && !menuOfferNudge.getLockedImpressionRecorded()) {
            menuOfferNudge.setLockedImpressionRecorded(true);
            ir.b a22 = a2();
            ir.b a23 = a2();
            if (spannableString == null) {
                str = null;
            } else {
                str = spannableString.toString();
            }
            a22.i(a23.e("menu", s11, str, "-"));
        } else if (!z11 && !menuOfferNudge.getUnLockedImpressionRecorded()) {
            menuOfferNudge.setUnLockedImpressionRecorded(true);
            a2().i(a2().e("menu", s11, menuOfferNudge.getUnlockedMessage(), "-"));
        }
    }

    public final void F2() {
        String str = null;
        this.T = null;
        this.S.j(false);
        this.P.invoke();
        String restaurantId = S1().getRestaurantId();
        Restaurant restaurant = this.W;
        if (restaurant != null) {
            str = restaurant.mId;
        }
        if (p.e(restaurantId, str)) {
            S1().p(0.0d);
        }
        this.R.invoke();
    }

    public final void G2(Font font) {
        p.j(font, "<set-?>");
        this.U = font;
    }

    public final void H2(MenuOfferNudge menuOfferNudge) {
        this.V = menuOfferNudge;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = r2.i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I2(in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant r4) {
        /*
            r3 = this;
            r3.W = r4
            r0 = 0
            if (r4 != 0) goto L_0x0007
            r1 = r0
            goto L_0x0009
        L_0x0007:
            java.lang.String r1 = r4.mId
        L_0x0009:
            bf0.a r2 = r3.S1()
            if (r2 != 0) goto L_0x0011
        L_0x000f:
            r2 = r0
            goto L_0x001c
        L_0x0011:
            in.swiggy.android.tejas.oldapi.models.cart.RestaurantMetaData r2 = r2.i()
            if (r2 != 0) goto L_0x0018
            goto L_0x000f
        L_0x0018:
            java.lang.String r2 = r2.getId()
        L_0x001c:
            boolean r1 = kotlin.jvm.internal.p.e(r1, r2)
            if (r1 == 0) goto L_0x0034
            bf0.a r1 = r3.S1()
            in.swiggy.android.tejas.oldapi.models.cart.RestaurantMetaData r1 = r1.i()
            if (r1 != 0) goto L_0x002d
            goto L_0x0034
        L_0x002d:
            if (r4 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            java.util.List<in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge> r0 = r4.nudgeBanners
        L_0x0032:
            r1.nudgeBanners = r0
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.feature.menu.componentviewmodel.MenuOfferNudgeViewModel.I2(in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant):void");
    }

    public final void J2(MenuOfferNudge menuOfferNudge) {
        this.T = menuOfferNudge;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.CharSequence, android.text.SpannableString, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v12, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r0v18, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v23, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r11v6, types: [android.text.SpannableString] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L2(in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge r17, boolean r18, boolean r19, java.lang.String r20, boolean r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r20
            java.lang.String r3 = "offerNudge"
            kotlin.jvm.internal.p.j(r2, r3)
            java.lang.String r3 = "diff"
            kotlin.jvm.internal.p.j(r0, r3)
            mb0.r0 r3 = r16.l()
            r4 = 2131100893(0x7f0604dd, float:1.781418E38)
            int r3 = r3.o(r4)
            mb0.r0 r5 = r16.l()
            r6 = 2131100250(0x7f06025a, float:1.7812876E38)
            int r5 = r5.o(r6)
            java.lang.String r7 = r17.getLogo()
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r8.f25666a = r2
            in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge r9 = r1.V
            r10 = 0
            if (r9 != 0) goto L_0x0039
        L_0x0036:
            r9 = r18
            goto L_0x004e
        L_0x0039:
            bf0.a r11 = r16.S1()
            double r11 = r11.F()
            double r13 = r9.getMaxValue()
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x0036
            if (r21 == 0) goto L_0x0036
            r8.f25666a = r9
            r9 = 0
        L_0x004e:
            r11 = 0
            if (r9 == 0) goto L_0x009f
            java.lang.String r6 = r17.getLockedMessage()
            if (r6 != 0) goto L_0x0058
            goto L_0x008d
        L_0x0058:
            r16.H2(r17)
            in.swiggy.android.commonsui.view.fonts.Font r3 = in.swiggy.android.commonsui.view.fonts.Font.Regular
            r1.G2(r3)
            r5 = 2131100772(0x7f060464, float:1.7813935E38)
            in.swiggy.android.tejas.oldapi.models.restaurant.MenuNudgeBannerStyling r3 = r17.getNudgeBannerStyling()
            if (r3 != 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            java.lang.String r11 = r3.getTextColor()
        L_0x006e:
            mb0.r0 r3 = r16.l()
            int r3 = r3.o(r4)
            int r3 = dt.c.c(r11, r3)
            android.text.SpannableString r0 = r1.v2(r6, r0)
            in.swiggy.android.tejas.oldapi.models.restaurant.MenuNudgeTagInfo r4 = r17.getNudgeTagInfo()
            android.text.SpannableString r11 = r1.y2(r0, r4)
            androidx.databinding.ObservableBoolean r0 = r16.B2()
            r0.j(r10)
        L_0x008d:
            bf0.a r0 = r16.S1()
            r8 = 0
            r0.p(r8)
            lp0.a<bp0.k> r0 = r1.R
            r0.invoke()
        L_0x009b:
            r12 = r7
            r0 = r11
            goto L_0x018c
        L_0x009f:
            r1.V = r11
            T r0 = r8.f25666a
            in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge r0 = (in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge) r0
            if (r0 != 0) goto L_0x00a9
            r7 = r11
            goto L_0x00ae
        L_0x00a9:
            java.lang.String r0 = r0.getLogo()
            r7 = r0
        L_0x00ae:
            T r0 = r8.f25666a
            in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge r0 = (in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge) r0
            if (r0 != 0) goto L_0x00b5
            goto L_0x00bb
        L_0x00b5:
            java.lang.String r9 = r0.getUnlockedMessage()
            if (r9 != 0) goto L_0x00bc
        L_0x00bb:
            goto L_0x009b
        L_0x00bc:
            in.swiggy.android.commonsui.view.fonts.Font r0 = in.swiggy.android.commonsui.view.fonts.Font.Bold
            r1.G2(r0)
            T r0 = r8.f25666a     // Catch:{ all -> 0x00de }
            in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge r0 = (in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge) r0     // Catch:{ all -> 0x00de }
            in.swiggy.android.tejas.oldapi.models.restaurant.MenuNudgeBannerStyling r0 = r0.getUnLockednudgeBannerStyling()     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00cd
            r0 = r11
            goto L_0x00d1
        L_0x00cd:
            java.lang.String r0 = r0.getTextColor()     // Catch:{ all -> 0x00de }
        L_0x00d1:
            mb0.r0 r3 = r16.l()     // Catch:{ all -> 0x00de }
            int r3 = r3.o(r4)     // Catch:{ all -> 0x00de }
            int r0 = dt.c.c(r0, r3)     // Catch:{ all -> 0x00de }
            goto L_0x00f3
        L_0x00de:
            r0 = move-exception
            java.lang.String r3 = "MenuOfferNudgeViewModel"
            os.u.h(r3, r0)
            mb0.r0 r0 = r16.l()
            r0.o(r6)
            mb0.r0 r0 = r16.l()
            int r0 = r0.o(r4)
        L_0x00f3:
            r3 = r0
            T r0 = r8.f25666a
            in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge r0 = (in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge) r0
            boolean r0 = r0.getLottieShown()
            if (r0 != 0) goto L_0x0117
            m60.c r0 = new m60.c
            r0.<init>(r8)
            r4 = 100
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            ao0.r r12 = do0.a.a()
            ms.h.d(r0, r4, r6, r12)
            androidx.databinding.ObservableBoolean r0 = r16.B2()
            r4 = r19 ^ 1
            r0.j(r4)
        L_0x0117:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r9)
            java.lang.String r4 = "<X>"
            r5 = 2
            boolean r4 = kotlin.text.StringsKt__StringsKt.S(r0, r4, r10, r5, r11)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = js.c.h(r4)
            if (r4 == 0) goto L_0x013f
            T r0 = r8.f25666a
            in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge r0 = (in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge) r0
            int r0 = r0.getMinItemCount()
            double r4 = r1.t2(r0)
            android.text.SpannableString r0 = r1.D2(r9, r4)
        L_0x013d:
            r11 = r0
            goto L_0x0187
        L_0x013f:
            java.lang.String r4 = "<discounted_amount>"
            boolean r4 = kotlin.text.StringsKt__StringsKt.S(r0, r4, r10, r5, r11)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = js.c.h(r4)
            if (r4 == 0) goto L_0x016e
            T r0 = r8.f25666a
            in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge r0 = (in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge) r0
            in.swiggy.android.tejas.oldapi.models.restaurant.DiscountInfo r0 = r0.getDiscountInfo()
            double r4 = r1.w2(r0)
            bf0.a r0 = r16.S1()
            r0.p(r4)
            lp0.a r0 = r16.A2()
            r0.invoke()
            android.text.SpannableString r0 = r1.C2(r9, r4)
            goto L_0x013d
        L_0x016e:
            java.lang.String r4 = "<b>"
            boolean r4 = kotlin.text.StringsKt__StringsKt.S(r0, r4, r10, r5, r11)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = js.c.h(r4)
            if (r4 == 0) goto L_0x013d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.text.SpannableString r0 = r1.x2(r0)
            goto L_0x013d
        L_0x0187:
            r5 = 2131100770(0x7f060462, float:1.781393E38)
            goto L_0x009b
        L_0x018c:
            lp0.u<android.text.SpannableString, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Boolean, java.lang.String, java.lang.Boolean, bp0.k> r6 = r1.O
            if (r0 != 0) goto L_0x0199
            android.text.SpannableString r4 = new android.text.SpannableString
            java.lang.String r7 = ""
            r4.<init>(r7)
            r7 = r4
            goto L_0x019a
        L_0x0199:
            r7 = r0
        L_0x019a:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            mb0.r0 r3 = r16.l()
            r4 = 2131165599(0x7f07019f, float:1.794542E38)
            float r3 = r3.i(r4)
            java.lang.Float r10 = java.lang.Float.valueOf(r3)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r18)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r19)
            r6.l0(r7, r8, r9, r10, r11, r12, r13)
            lp0.l<java.lang.Boolean, bp0.k> r3 = r1.Q
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.invoke(r4)
            r3 = r18
            r1.E2(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.feature.menu.componentviewmodel.MenuOfferNudgeViewModel.L2(in.swiggy.android.tejas.oldapi.models.restaurant.MenuOfferNudge, boolean, boolean, java.lang.String, boolean):void");
    }

    public final void N2(boolean z11) {
        List<MenuOfferNudge> list;
        int i11;
        int i12;
        this.S.j(false);
        int u22 = u2();
        double F = S1().F();
        Restaurant restaurant = this.W;
        MenuOfferNudge menuOfferNudge = null;
        if (!(restaurant == null || (list = restaurant.nudgeBanners) == null)) {
            for (MenuOfferNudge menuOfferNudge2 : list) {
                boolean z12 = true;
                if (menuOfferNudge2.getMinValue() == 0.0d) {
                    if (menuOfferNudge2.getMaxValue() != 0.0d) {
                        z12 = false;
                    }
                    if (z12) {
                        int minItemCount = menuOfferNudge2.getMinItemCount();
                        if (menuOfferNudge == null) {
                            i12 = 0;
                        } else {
                            i12 = p.l(menuOfferNudge.getMinItemCount(), minItemCount);
                        }
                        if (u22 >= menuOfferNudge2.getMinItemCount()) {
                            if (i12 > 0) {
                            }
                            menuOfferNudge = menuOfferNudge2;
                        }
                    }
                }
                double minValue = menuOfferNudge2.getMinValue();
                if (menuOfferNudge == null) {
                    i11 = 0;
                } else {
                    i11 = Double.compare(menuOfferNudge.getMinValue(), minValue);
                }
                if (F >= menuOfferNudge2.getMinValue()) {
                    if (i11 > 0) {
                    }
                    menuOfferNudge = menuOfferNudge2;
                }
            }
        }
        if (menuOfferNudge == null) {
            F2();
        } else if (!p.b(Double.valueOf(menuOfferNudge.getMinValue()), 0.0d) || !p.b(Double.valueOf(menuOfferNudge.getMaxValue()), 0.0d)) {
            p2(menuOfferNudge, z11, F);
        } else {
            q2(menuOfferNudge, z11, u22);
        }
    }

    public final void O2(MenuOfferNudge menuOfferNudge, boolean z11) {
        p.j(menuOfferNudge, "offerNudge");
        double F = S1().F();
        L2(menuOfferNudge, F < menuOfferNudge.getMaxValue(), z11, String.valueOf((long) Math.ceil(menuOfferNudge.getMaxValue() - F)), true);
        this.T = menuOfferNudge;
    }

    public final void P2(MenuOfferNudge menuOfferNudge, boolean z11) {
        p.j(menuOfferNudge, "offerNudge");
        int u22 = u2();
        boolean z12 = u22 < menuOfferNudge.getMaxItemCount();
        this.T = menuOfferNudge;
        L2(menuOfferNudge, z12, z11, String.valueOf(menuOfferNudge.getMaxItemCount() - u22), false);
    }

    public final void Q2() {
        this.N.c(T1().H().Q(do0.a.a()).h0(new m60.a(this), m60.b.f26625a));
    }

    public void init() {
    }

    public final void r2(String str) {
        Q2();
        if (p.e(str, S1().getRestaurantId())) {
            List<MenuItemInCart> M = S1().M();
            p.i(M, "cart.cartItems");
            Iterator<T> it2 = M.iterator();
            while (true) {
                boolean z11 = true;
                if (it2.hasNext()) {
                    MenuItemInCart menuItemInCart = (MenuItemInCart) it2.next();
                    String str2 = menuItemInCart.getMenuItem().nudgeType;
                    if (!(str2 == null || str2.length() == 0)) {
                        z11 = false;
                    }
                    if (c.e(Boolean.valueOf(z11)) && !menuItemInCart.getMenuItem().isFreebie()) {
                        HashMap<String, MenuItemInCart> z22 = z2();
                        String str3 = menuItemInCart.getMenuItem().mId;
                        p.i(str3, "menuItemInCart.menuItem.mId");
                        p.i(menuItemInCart, "menuItemInCart");
                        z22.put(str3, menuItemInCart);
                    }
                } else {
                    N2(true);
                    return;
                }
            }
        }
    }

    public final void s2() {
        Restaurant restaurant = this.W;
        String str = null;
        if (p.e(restaurant == null ? null : restaurant.mId, S1().getRestaurantId())) {
            Restaurant restaurant2 = this.W;
            if (restaurant2 != null) {
                str = restaurant2.mId;
            }
            r2(str);
            return;
        }
        Q2();
        K2(true);
    }

    public final SpannableString v2(String str, String str2) {
        p.j(str, "formattedMessage");
        p.j(str2, "diff");
        return x2(o.H(str, "<amount>", str2, false, 4, (Object) null));
    }

    public final SpannableString x2(String str) {
        p.j(str, "formattedMessage");
        ArrayList<HighlightedText> highlightedTextList = HighlightTextUtils.INSTANCE.getHighlightedTextList(str, "<b>", "</b>");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (HighlightedText o22 : highlightedTextList) {
            o2(o22, spannableStringBuilder);
        }
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        p.i(valueOf, "valueOf(this)");
        return valueOf;
    }

    public final HashMap<String, MenuItemInCart> z2() {
        return this.f15247n0;
    }
}
