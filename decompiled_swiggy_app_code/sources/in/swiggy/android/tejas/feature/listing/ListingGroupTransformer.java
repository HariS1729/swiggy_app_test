package in.swiggy.android.tejas.feature.listing;

import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.CardInfo;
import com.swiggy.gandalf.widgets.v2.GroupedCard;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ListingGroupTransformer.kt */
public final class ListingGroupTransformer implements ITransformer<GroupedCard, List<? extends ListingCardEntity<?>>> {
    private final ITransformer<Card, List<ListingCardEntity<?>>> resultEntityFactory;

    /* compiled from: ListingGroupTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardInfo.InfoCase.values().length];
            iArr[CardInfo.InfoCase.CARD.ordinal()] = 1;
            iArr[CardInfo.InfoCase.GROUPED_CARD.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ListingGroupTransformer(ITransformer<Card, List<ListingCardEntity<?>>> iTransformer) {
        p.j(iTransformer, "resultEntityFactory");
        this.resultEntityFactory = iTransformer;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0060: MOVE  (r5v6 in.swiggy.android.tejas.feature.listing.navigation.model.NavigationEntity) = 
          (r2v2 in.swiggy.android.tejas.feature.listing.navigation.model.NavigationEntity)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    public java.util.List<in.swiggy.android.tejas.feature.listing.ListingCardEntity<?>> transform(com.swiggy.gandalf.widgets.v2.GroupedCard r8) {
        /*
            r7 = this;
            java.lang.String r0 = "t"
            kotlin.jvm.internal.p.j(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map r8 = r8.getCardGroupMapMap()
            java.lang.String r1 = "t.cardGroupMapMap"
            kotlin.jvm.internal.p.i(r8, r1)
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
            r2 = r1
        L_0x001d:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00ab
            java.lang.Object r3 = r8.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            com.swiggy.gandalf.widgets.v2.GroupedCardInfo r3 = (com.swiggy.gandalf.widgets.v2.GroupedCardInfo) r3
            java.util.List r3 = r3.getCardsList()
            java.lang.String r4 = "it.value.cardsList"
            kotlin.jvm.internal.p.i(r3, r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x003c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x001d
            java.lang.Object r4 = r3.next()
            com.swiggy.gandalf.widgets.v2.CardInfo r4 = (com.swiggy.gandalf.widgets.v2.CardInfo) r4
            com.swiggy.gandalf.widgets.v2.CardInfo$InfoCase r5 = r4.getInfoCase()
            if (r5 != 0) goto L_0x0050
            r5 = -1
            goto L_0x0058
        L_0x0050:
            int[] r6 = in.swiggy.android.tejas.feature.listing.ListingGroupTransformer.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r6[r5]
        L_0x0058:
            r6 = 1
            if (r5 == r6) goto L_0x0084
            r6 = 2
            if (r5 == r6) goto L_0x005f
            goto L_0x003c
        L_0x005f:
            r5 = r2
            in.swiggy.android.tejas.feature.listing.navigation.model.NavigationEntity r5 = (in.swiggy.android.tejas.feature.listing.navigation.model.NavigationEntity) r5
            if (r5 != 0) goto L_0x0065
            goto L_0x003c
        L_0x0065:
            com.swiggy.gandalf.widgets.v2.GroupedCard r4 = r4.getGroupedCard()
            java.lang.String r6 = "cardInfo.groupedCard"
            kotlin.jvm.internal.p.i(r4, r6)
            java.util.List r4 = r7.transform((com.swiggy.gandalf.widgets.v2.GroupedCard) r4)
            if (r4 != 0) goto L_0x0075
            goto L_0x003c
        L_0x0075:
            in.swiggy.android.tejas.feature.listing.navigation.model.NestedNavigationEntity r2 = new in.swiggy.android.tejas.feature.listing.navigation.model.NestedNavigationEntity
            in.swiggy.android.tejas.feature.listing.navigation.model.NestedNavigation r6 = new in.swiggy.android.tejas.feature.listing.navigation.model.NestedNavigation
            r6.<init>(r5, r4)
            r2.<init>(r6)
            r0.add(r2)
            r2 = r1
            goto L_0x003c
        L_0x0084:
            in.swiggy.android.tejas.transformer.ITransformer<com.swiggy.gandalf.widgets.v2.Card, java.util.List<in.swiggy.android.tejas.feature.listing.ListingCardEntity<?>>> r5 = r7.resultEntityFactory
            com.swiggy.gandalf.widgets.v2.Card r4 = r4.getCard()
            java.lang.String r6 = "cardInfo.card"
            kotlin.jvm.internal.p.i(r4, r6)
            java.lang.Object r4 = r5.transform(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0098
            goto L_0x003c
        L_0x0098:
            java.lang.Object r5 = kotlin.collections.s.Y(r4)
            in.swiggy.android.tejas.feature.listing.ListingCardEntity r5 = (in.swiggy.android.tejas.feature.listing.ListingCardEntity) r5
            if (r5 != 0) goto L_0x00a1
            goto L_0x003c
        L_0x00a1:
            boolean r6 = r5 instanceof in.swiggy.android.tejas.feature.listing.navigation.model.NavigationEntity
            if (r6 == 0) goto L_0x00a7
            r2 = r5
            goto L_0x003c
        L_0x00a7:
            r0.addAll(r4)
            goto L_0x003c
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.listing.ListingGroupTransformer.transform(com.swiggy.gandalf.widgets.v2.GroupedCard):java.util.List");
    }
}
