package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class WorkInfo {

    /* renamed from: a  reason: collision with root package name */
    private UUID f12295a;

    /* renamed from: b  reason: collision with root package name */
    private State f12296b;

    /* renamed from: c  reason: collision with root package name */
    private b f12297c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f12298d;

    /* renamed from: e  reason: collision with root package name */
    private b f12299e;

    /* renamed from: f  reason: collision with root package name */
    private int f12300f;

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public WorkInfo(UUID uuid, State state, b bVar, List<String> list, b bVar2, int i11) {
        this.f12295a = uuid;
        this.f12296b = state;
        this.f12297c = bVar;
        this.f12298d = new HashSet(list);
        this.f12299e = bVar2;
        this.f12300f = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f12300f == workInfo.f12300f && this.f12295a.equals(workInfo.f12295a) && this.f12296b == workInfo.f12296b && this.f12297c.equals(workInfo.f12297c) && this.f12298d.equals(workInfo.f12298d)) {
            return this.f12299e.equals(workInfo.f12299e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f12295a.hashCode() * 31) + this.f12296b.hashCode()) * 31) + this.f12297c.hashCode()) * 31) + this.f12298d.hashCode()) * 31) + this.f12299e.hashCode()) * 31) + this.f12300f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f12295a + '\'' + ", mState=" + this.f12296b + ", mOutputData=" + this.f12297c + ", mTags=" + this.f12298d + ", mProgress=" + this.f12299e + '}';
    }
}
