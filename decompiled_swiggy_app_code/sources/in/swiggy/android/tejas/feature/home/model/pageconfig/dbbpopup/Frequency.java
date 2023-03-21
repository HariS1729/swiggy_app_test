package in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup;

/* compiled from: Frequency.kt */
public final class Frequency {
    private final int count;
    private final int durationInDays;

    public Frequency(int i11, int i12) {
        this.count = i11;
        this.durationInDays = i12;
    }

    public static /* synthetic */ Frequency copy$default(Frequency frequency, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = frequency.count;
        }
        if ((i13 & 2) != 0) {
            i12 = frequency.durationInDays;
        }
        return frequency.copy(i11, i12);
    }

    public final int component1() {
        return this.count;
    }

    public final int component2() {
        return this.durationInDays;
    }

    public final Frequency copy(int i11, int i12) {
        return new Frequency(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Frequency)) {
            return false;
        }
        Frequency frequency = (Frequency) obj;
        return this.count == frequency.count && this.durationInDays == frequency.durationInDays;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getDurationInDays() {
        return this.durationInDays;
    }

    public int hashCode() {
        return (this.count * 31) + this.durationInDays;
    }

    public String toString() {
        return "Frequency(count=" + this.count + ", durationInDays=" + this.durationInDays + ')';
    }
}
