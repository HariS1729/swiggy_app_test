package in.swiggy.android.tejas.feature.cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Message.kt */
public final class Message implements Parcelable {
    public static final Parcelable.Creator<Message> CREATOR = new Creator();
    @SerializedName("crouton")
    private final Crouton crouton;
    @SerializedName("inline")
    private final Popup inline;
    @SerializedName("popup")
    private final Popup popup;

    /* compiled from: Message.kt */
    public static final class Creator implements Parcelable.Creator<Message> {
        public final Message createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            Crouton crouton = null;
            Popup createFromParcel = parcel.readInt() == 0 ? null : Popup.CREATOR.createFromParcel(parcel);
            Popup createFromParcel2 = parcel.readInt() == 0 ? null : Popup.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                crouton = Crouton.CREATOR.createFromParcel(parcel);
            }
            return new Message(createFromParcel, createFromParcel2, crouton);
        }

        public final Message[] newArray(int i11) {
            return new Message[i11];
        }
    }

    public Message() {
        this((Popup) null, (Popup) null, (Crouton) null, 7, (i) null);
    }

    public Message(Popup popup2, Popup popup3, Crouton crouton2) {
        this.inline = popup2;
        this.popup = popup3;
        this.crouton = crouton2;
    }

    public static /* synthetic */ Message copy$default(Message message, Popup popup2, Popup popup3, Crouton crouton2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            popup2 = message.inline;
        }
        if ((i11 & 2) != 0) {
            popup3 = message.popup;
        }
        if ((i11 & 4) != 0) {
            crouton2 = message.crouton;
        }
        return message.copy(popup2, popup3, crouton2);
    }

    public final Popup component1() {
        return this.inline;
    }

    public final Popup component2() {
        return this.popup;
    }

    public final Crouton component3() {
        return this.crouton;
    }

    public final Message copy(Popup popup2, Popup popup3, Crouton crouton2) {
        return new Message(popup2, popup3, crouton2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return p.e(this.inline, message.inline) && p.e(this.popup, message.popup) && p.e(this.crouton, message.crouton);
    }

    public final Crouton getCrouton() {
        return this.crouton;
    }

    public final Popup getInline() {
        return this.inline;
    }

    public final Popup getPopup() {
        return this.popup;
    }

    public int hashCode() {
        Popup popup2 = this.inline;
        int i11 = 0;
        int hashCode = (popup2 == null ? 0 : popup2.hashCode()) * 31;
        Popup popup3 = this.popup;
        int hashCode2 = (hashCode + (popup3 == null ? 0 : popup3.hashCode())) * 31;
        Crouton crouton2 = this.crouton;
        if (crouton2 != null) {
            i11 = crouton2.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "Message(inline=" + this.inline + ", popup=" + this.popup + ", crouton=" + this.crouton + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        Popup popup2 = this.inline;
        if (popup2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popup2.writeToParcel(parcel, i11);
        }
        Popup popup3 = this.popup;
        if (popup3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popup3.writeToParcel(parcel, i11);
        }
        Crouton crouton2 = this.crouton;
        if (crouton2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        crouton2.writeToParcel(parcel, i11);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Message(Popup popup2, Popup popup3, Crouton crouton2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : popup2, (i11 & 2) != 0 ? null : popup3, (i11 & 4) != 0 ? null : crouton2);
    }
}
