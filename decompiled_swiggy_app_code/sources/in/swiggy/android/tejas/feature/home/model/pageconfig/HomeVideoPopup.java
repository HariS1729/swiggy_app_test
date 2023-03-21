package in.swiggy.android.tejas.feature.home.model.pageconfig;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.feature.home.model.FrequencyCapping;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: HomeVideoPopup.kt */
public final class HomeVideoPopup extends HomePopup {
    private final PopupPosition position;
    private final List<Videos> videos;

    public HomeVideoPopup(PopupPosition popupPosition, List<Videos> list) {
        p.j(popupPosition, "position");
        p.j(list, "videos");
        this.position = popupPosition;
        this.videos = list;
    }

    public static /* synthetic */ HomeVideoPopup copy$default(HomeVideoPopup homeVideoPopup, PopupPosition popupPosition, List<Videos> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            popupPosition = homeVideoPopup.position;
        }
        if ((i11 & 2) != 0) {
            list = homeVideoPopup.videos;
        }
        return homeVideoPopup.copy(popupPosition, list);
    }

    public final PopupPosition component1() {
        return this.position;
    }

    public final List<Videos> component2() {
        return this.videos;
    }

    public final HomeVideoPopup copy(PopupPosition popupPosition, List<Videos> list) {
        p.j(popupPosition, "position");
        p.j(list, "videos");
        return new HomeVideoPopup(popupPosition, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeVideoPopup)) {
            return false;
        }
        HomeVideoPopup homeVideoPopup = (HomeVideoPopup) obj;
        return this.position == homeVideoPopup.position && p.e(this.videos, homeVideoPopup.videos);
    }

    public final PopupPosition getPosition() {
        return this.position;
    }

    public final List<Videos> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return (this.position.hashCode() * 31) + this.videos.hashCode();
    }

    public String toString() {
        return "HomeVideoPopup(position=" + this.position + ", videos=" + this.videos + ')';
    }

    /* compiled from: HomeVideoPopup.kt */
    public static final class Videos {
        private final CTA cta;
        private final String entityType;
        private final FrequencyCapping frequencyCapping;

        /* renamed from: id  reason: collision with root package name */
        private String f20248id;
        private final int maxCount;
        private final Map<String, String> meta_info;
        private final String videoId;

        public Videos(String str, String str2, String str3, int i11, CTA cta2, Map<String, String> map, FrequencyCapping frequencyCapping2) {
            p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
            p.j(str2, "videoId");
            p.j(str3, "entityType");
            this.f20248id = str;
            this.videoId = str2;
            this.entityType = str3;
            this.maxCount = i11;
            this.cta = cta2;
            this.meta_info = map;
            this.frequencyCapping = frequencyCapping2;
        }

        public static /* synthetic */ Videos copy$default(Videos videos, String str, String str2, String str3, int i11, CTA cta2, Map<String, String> map, FrequencyCapping frequencyCapping2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = videos.f20248id;
            }
            if ((i12 & 2) != 0) {
                str2 = videos.videoId;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                str3 = videos.entityType;
            }
            String str5 = str3;
            if ((i12 & 8) != 0) {
                i11 = videos.maxCount;
            }
            int i13 = i11;
            if ((i12 & 16) != 0) {
                cta2 = videos.cta;
            }
            CTA cta3 = cta2;
            if ((i12 & 32) != 0) {
                map = videos.meta_info;
            }
            Map<String, String> map2 = map;
            if ((i12 & 64) != 0) {
                frequencyCapping2 = videos.frequencyCapping;
            }
            return videos.copy(str, str4, str5, i13, cta3, map2, frequencyCapping2);
        }

        public final String component1() {
            return this.f20248id;
        }

        public final String component2() {
            return this.videoId;
        }

        public final String component3() {
            return this.entityType;
        }

        public final int component4() {
            return this.maxCount;
        }

        public final CTA component5() {
            return this.cta;
        }

        public final Map<String, String> component6() {
            return this.meta_info;
        }

        public final FrequencyCapping component7() {
            return this.frequencyCapping;
        }

        public final Videos copy(String str, String str2, String str3, int i11, CTA cta2, Map<String, String> map, FrequencyCapping frequencyCapping2) {
            p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
            p.j(str2, "videoId");
            p.j(str3, "entityType");
            return new Videos(str, str2, str3, i11, cta2, map, frequencyCapping2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Videos)) {
                return false;
            }
            Videos videos = (Videos) obj;
            return p.e(this.f20248id, videos.f20248id) && p.e(this.videoId, videos.videoId) && p.e(this.entityType, videos.entityType) && this.maxCount == videos.maxCount && p.e(this.cta, videos.cta) && p.e(this.meta_info, videos.meta_info) && p.e(this.frequencyCapping, videos.frequencyCapping);
        }

        public final CTA getCta() {
            return this.cta;
        }

        public final String getEntityType() {
            return this.entityType;
        }

        public final FrequencyCapping getFrequencyCapping() {
            return this.frequencyCapping;
        }

        public final String getId() {
            return this.f20248id;
        }

        public final int getMaxCount() {
            return this.maxCount;
        }

        public final Map<String, String> getMeta_info() {
            return this.meta_info;
        }

        public final String getVideoId() {
            return this.videoId;
        }

        public int hashCode() {
            int hashCode = ((((((this.f20248id.hashCode() * 31) + this.videoId.hashCode()) * 31) + this.entityType.hashCode()) * 31) + this.maxCount) * 31;
            CTA cta2 = this.cta;
            int i11 = 0;
            int hashCode2 = (hashCode + (cta2 == null ? 0 : cta2.hashCode())) * 31;
            Map<String, String> map = this.meta_info;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            FrequencyCapping frequencyCapping2 = this.frequencyCapping;
            if (frequencyCapping2 != null) {
                i11 = frequencyCapping2.hashCode();
            }
            return hashCode3 + i11;
        }

        public final void setId(String str) {
            p.j(str, "<set-?>");
            this.f20248id = str;
        }

        public String toString() {
            return "Videos(id=" + this.f20248id + ", videoId=" + this.videoId + ", entityType=" + this.entityType + ", maxCount=" + this.maxCount + ", cta=" + this.cta + ", meta_info=" + this.meta_info + ", frequencyCapping=" + this.frequencyCapping + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Videos(String str, String str2, String str3, int i11, CTA cta2, Map map, FrequencyCapping frequencyCapping2, int i12, i iVar) {
            this(str, str2, str3, i11, cta2, map, (i12 & 64) != 0 ? null : frequencyCapping2);
        }
    }
}
