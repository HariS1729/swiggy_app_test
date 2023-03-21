package in.swiggy.android.tejas.feature.address.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: AddressTag.kt */
public final class AddressTag {
    public static final int FRIENDS_AND_FAMILY = 4;
    public static final int HOME = 1;
    public static final AddressTag INSTANCE = new AddressTag();
    public static final int OTHER = 3;
    public static final int WORK = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: AddressTag.kt */
    public @interface Type {
    }

    /* compiled from: AddressTag.kt */
    public static final class TypeString {
        public static final String FRIENDS_AND_FAMILY_TAG_STRING = "Friends and Family";
        public static final String HOME_TAG_STRING = "Home";
        public static final TypeString INSTANCE = new TypeString();
        public static final String OTHER_TAG_STRING = "Other";
        public static final String WORK_TAG_STRING = "Work";

        private TypeString() {
        }
    }

    private AddressTag() {
    }
}
