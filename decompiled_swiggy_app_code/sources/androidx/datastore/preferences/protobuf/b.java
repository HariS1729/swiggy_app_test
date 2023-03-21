package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;

/* compiled from: AbstractParser */
public abstract class b<MessageType extends k0> implements s0<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final n f9950a = n.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().j(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).g();
        }
        return new UninitializedMessageException(messagetype);
    }

    /* renamed from: e */
    public MessageType b(ByteString byteString, n nVar) throws InvalidProtocolBufferException {
        return c(f(byteString, nVar));
    }

    public MessageType f(ByteString byteString, n nVar) throws InvalidProtocolBufferException {
        MessageType messagetype;
        try {
            h p11 = byteString.p();
            messagetype = (k0) a(p11, nVar);
            p11.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e11) {
            throw e11.j(messagetype);
        } catch (InvalidProtocolBufferException e12) {
            throw e12;
        }
    }
}
