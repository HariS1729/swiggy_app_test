package in.swiggy.android.tejas.feature.home.grid.model.fliptext;

import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;

/* compiled from: DynamicFlipTextItem.kt */
public final class DynamicFlipTextItem {
    private final String bgImage;
    private CTA cta;
    private final String ctaImage;
    private final RemoteLottieItem ctaLottieItem;

    /* renamed from: id  reason: collision with root package name */
    private final String f20231id;
    private final String logoImage;
    private final RemoteLottieItem logoLottieItem;
    private final String title;
    private String titleColor;

    public DynamicFlipTextItem(String str, RemoteLottieItem remoteLottieItem, String str2, RemoteLottieItem remoteLottieItem2, String str3, String str4, String str5, String str6, CTA cta2) {
        this.f20231id = str;
        this.logoLottieItem = remoteLottieItem;
        this.logoImage = str2;
        this.ctaLottieItem = remoteLottieItem2;
        this.ctaImage = str3;
        this.bgImage = str4;
        this.title = str5;
        this.titleColor = str6;
        this.cta = cta2;
    }

    public final String getBgImage() {
        return this.bgImage;
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final String getCtaImage() {
        return this.ctaImage;
    }

    public final RemoteLottieItem getCtaLottieItem() {
        return this.ctaLottieItem;
    }

    public final String getId() {
        return this.f20231id;
    }

    public final String getLogoImage() {
        return this.logoImage;
    }

    public final RemoteLottieItem getLogoLottieItem() {
        return this.logoLottieItem;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public final void setCta(CTA cta2) {
        this.cta = cta2;
    }

    public final void setTitleColor(String str) {
        this.titleColor = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DynamicFlipTextItem(java.lang.String r14, in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem r15, java.lang.String r16, in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, in.swiggy.android.tejas.feature.listing.cta.model.CTA r22, int r23, kotlin.jvm.internal.i r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r19
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r20
        L_0x0013:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r21
        L_0x001b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0021
            r12 = r2
            goto L_0x0023
        L_0x0021:
            r12 = r22
        L_0x0023:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextItem.<init>(java.lang.String, in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem, java.lang.String, in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem, java.lang.String, java.lang.String, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.listing.cta.model.CTA, int, kotlin.jvm.internal.i):void");
    }
}
