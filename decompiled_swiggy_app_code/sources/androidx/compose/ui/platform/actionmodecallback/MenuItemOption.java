package androidx.compose.ui.platform.actionmodecallback;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextActionModeCallback.android.kt */
public enum MenuItemOption {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f7267id;
    private final int order;

    /* compiled from: TextActionModeCallback.android.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7268a = null;

        static {
            int[] iArr = new int[MenuItemOption.values().length];
            iArr[MenuItemOption.Copy.ordinal()] = 1;
            iArr[MenuItemOption.Paste.ordinal()] = 2;
            iArr[MenuItemOption.Cut.ordinal()] = 3;
            iArr[MenuItemOption.SelectAll.ordinal()] = 4;
            f7268a = iArr;
        }
    }

    private MenuItemOption(int i11) {
        this.f7267id = i11;
        this.order = i11;
    }

    public final int getId() {
        return this.f7267id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i11 = a.f7268a[ordinal()];
        if (i11 == 1) {
            return 17039361;
        }
        if (i11 == 2) {
            return 17039371;
        }
        if (i11 == 3) {
            return 17039363;
        }
        if (i11 == 4) {
            return 17039373;
        }
        throw new NoWhenBranchMatchedException();
    }
}
