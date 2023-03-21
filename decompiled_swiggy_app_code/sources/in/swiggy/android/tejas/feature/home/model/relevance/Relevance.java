package in.swiggy.android.tejas.feature.home.model.relevance;

import kotlin.jvm.internal.p;

/* compiled from: Relevance.kt */
public final class Relevance {
    private final RelevanceType type;

    public Relevance(RelevanceType relevanceType) {
        p.j(relevanceType, "type");
        this.type = relevanceType;
    }

    public static /* synthetic */ Relevance copy$default(Relevance relevance, RelevanceType relevanceType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            relevanceType = relevance.type;
        }
        return relevance.copy(relevanceType);
    }

    public final RelevanceType component1() {
        return this.type;
    }

    public final Relevance copy(RelevanceType relevanceType) {
        p.j(relevanceType, "type");
        return new Relevance(relevanceType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Relevance) && this.type == ((Relevance) obj).type;
    }

    public final RelevanceType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public String toString() {
        return "Relevance(type=" + this.type + ')';
    }
}
