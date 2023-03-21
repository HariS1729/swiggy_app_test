package in.swiggy.android.tejas.feature.edm.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: EdmPostableRating.kt */
public final class EdmPostableRating implements Serializable {
    @SerializedName("comments")
    private String comments;
    @SerializedName("dispositions")
    private List<Integer> dispositions;
    @SerializedName("feedback_questions")
    private List<Map<String, String>> feedbackQuestionsMapList;
    @SerializedName("order_id")
    private String orderId;
    @SerializedName("ordered_items")
    private List<Integer> orderedItems;
    @SerializedName("rating")
    private Integer rating;
    @SerializedName("rating_type")
    private EdmRatingType ratingType;
    @SerializedName("to_skip")
    private boolean toSkip;

    /* compiled from: EdmPostableRating.kt */
    public static final class Builder {
        private String comments;
        private List<Integer> dispositions;
        private List<Map<String, String>> feedbackQuestionsMapList = k.f(new HashMap());
        private String orderId = "";
        private List<Integer> orderedItems;
        private Integer rating;
        private EdmRatingType ratingType;
        private boolean toSkip;

        public final EdmPostableRating build() {
            return new EdmPostableRating(this, (i) null);
        }

        public final Builder comments(String str) {
            p.j(str, "comments");
            this.comments = str;
            return this;
        }

        public final Builder dispositions(List<Integer> list) {
            p.j(list, "dispositions");
            this.dispositions = list;
            return this;
        }

        public final Builder feedBackQuestionMapList(List<Map<String, String>> list) {
            p.j(list, "feedbackQuestionsMapList");
            this.feedbackQuestionsMapList = list;
            return this;
        }

        public final String getComments() {
            return this.comments;
        }

        public final List<Integer> getDispositions() {
            return this.dispositions;
        }

        public final List<Map<String, String>> getFeedbackQuestionsMapList() {
            return this.feedbackQuestionsMapList;
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public final List<Integer> getOrderedItems() {
            return this.orderedItems;
        }

        public final Integer getRating() {
            return this.rating;
        }

        public final EdmRatingType getRatingType() {
            EdmRatingType edmRatingType = this.ratingType;
            if (edmRatingType != null) {
                return edmRatingType;
            }
            p.B("ratingType");
            return null;
        }

        public final boolean getToSkip() {
            return this.toSkip;
        }

        public final Builder orderId(String str) {
            p.j(str, "orderId");
            this.orderId = str;
            return this;
        }

        public final Builder orderedItems(List<Integer> list) {
            p.j(list, "orderedItems");
            this.orderedItems = list;
            return this;
        }

        public final Builder rating(int i11) {
            this.rating = Integer.valueOf(i11);
            return this;
        }

        public final Builder ratingType(EdmRatingType edmRatingType) {
            p.j(edmRatingType, "ratingType");
            this.ratingType = edmRatingType;
            return this;
        }

        public final Builder toSkip(boolean z11) {
            this.toSkip = z11;
            return this;
        }
    }

    public EdmPostableRating() {
        this((String) null, (EdmRatingType) null, (List) null, (List) null, (Integer) null, (String) null, false, (List) null, 255, (i) null);
    }

    public /* synthetic */ EdmPostableRating(Builder builder, i iVar) {
        this(builder);
    }

    public EdmPostableRating(String str, EdmRatingType edmRatingType, List<Integer> list, List<Integer> list2, Integer num, String str2, boolean z11, List<Map<String, String>> list3) {
        p.j(edmRatingType, "ratingType");
        p.j(str2, "orderId");
        p.j(list3, "feedbackQuestionsMapList");
        this.comments = str;
        this.ratingType = edmRatingType;
        this.dispositions = list;
        this.orderedItems = list2;
        this.rating = num;
        this.orderId = str2;
        this.toSkip = z11;
        this.feedbackQuestionsMapList = list3;
    }

    public final String getComments() {
        return this.comments;
    }

    public final List<Integer> getDispositions() {
        return this.dispositions;
    }

    public final List<Map<String, String>> getFeedbackQuestionsMapList() {
        return this.feedbackQuestionsMapList;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final List<Integer> getOrderedItems() {
        return this.orderedItems;
    }

    public final Integer getRating() {
        return this.rating;
    }

    public final EdmRatingType getRatingType() {
        return this.ratingType;
    }

    public final boolean getToSkip() {
        return this.toSkip;
    }

    public final void setComments(String str) {
        this.comments = str;
    }

    public final void setDispositions(List<Integer> list) {
        this.dispositions = list;
    }

    public final void setFeedbackQuestionsMapList(List<Map<String, String>> list) {
        p.j(list, "<set-?>");
        this.feedbackQuestionsMapList = list;
    }

    public final void setOrderId(String str) {
        p.j(str, "<set-?>");
        this.orderId = str;
    }

    public final void setOrderedItems(List<Integer> list) {
        this.orderedItems = list;
    }

    public final void setRating(Integer num) {
        this.rating = num;
    }

    public final void setRatingType(EdmRatingType edmRatingType) {
        p.j(edmRatingType, "<set-?>");
        this.ratingType = edmRatingType;
    }

    public final void setToSkip(boolean z11) {
        this.toSkip = z11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EdmPostableRating(java.lang.String r11, in.swiggy.android.tejas.feature.edm.model.EdmRatingType r12, java.util.List r13, java.util.List r14, java.lang.Integer r15, java.lang.String r16, boolean r17, java.util.List r18, int r19, kotlin.jvm.internal.i r20) {
        /*
            r10 = this;
            r0 = r19
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            in.swiggy.android.tejas.feature.edm.model.EdmRatingType r3 = in.swiggy.android.tejas.feature.edm.model.EdmRatingType.restaurant
            goto L_0x0012
        L_0x0011:
            r3 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r13
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r2 = r14
        L_0x001f:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0029
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            goto L_0x002a
        L_0x0029:
            r5 = r15
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            java.lang.String r7 = ""
            goto L_0x0033
        L_0x0031:
            r7 = r16
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = 0
            goto L_0x003b
        L_0x0039:
            r8 = r17
        L_0x003b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004e
            r0 = 1
            java.util.Map[] r0 = new java.util.Map[r0]
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r0[r6] = r9
            java.util.ArrayList r0 = kotlin.collections.k.f(r0)
            goto L_0x0050
        L_0x004e:
            r0 = r18
        L_0x0050:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r2
            r16 = r5
            r17 = r7
            r18 = r8
            r19 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.edm.model.EdmPostableRating.<init>(java.lang.String, in.swiggy.android.tejas.feature.edm.model.EdmRatingType, java.util.List, java.util.List, java.lang.Integer, java.lang.String, boolean, java.util.List, int, kotlin.jvm.internal.i):void");
    }

    private EdmPostableRating(Builder builder) {
        this(builder.getComments(), builder.getRatingType(), builder.getDispositions(), builder.getOrderedItems(), builder.getRating(), builder.getOrderId(), builder.getToSkip(), builder.getFeedbackQuestionsMapList());
    }
}
