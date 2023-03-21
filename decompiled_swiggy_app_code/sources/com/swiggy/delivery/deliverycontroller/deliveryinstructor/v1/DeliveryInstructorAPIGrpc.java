package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.common.util.concurrent.b;
import com.google.protobuf.Descriptors;
import io.grpc.MethodDescriptor;
import io.grpc.c;
import io.grpc.r;
import io.grpc.s;
import io.grpc.stub.a;
import io.grpc.stub.d;
import io.grpc.stub.f;
import io.grpc.stub.g;

public final class DeliveryInstructorAPIGrpc {
    private static final int METHODID_CREATE_UPDATE_INSTRUCTIONS_FOR_ORDER = 3;
    private static final int METHODID_GET_INSTRUCTIONS = 2;
    private static final int METHODID_GET_INSTRUCTIONS_BY_ORDER = 4;
    private static final int METHODID_POST_ORDER_ELIGIBLE_INSTRUCTIONS = 1;
    private static final int METHODID_PRE_ORDER_ELIGIBLE_INSTRUCTIONS = 0;
    public static final String SERVICE_NAME = "swiggy.delivery.deliverycontroller.deliveryinstructor.v1.DeliveryInstructorAPI";
    private static volatile MethodDescriptor<CreateUpdateInstructionsForOrderRequest, CreateUpdateInstructionsForOrderResponse> getCreateUpdateInstructionsForOrderMethod;
    private static volatile MethodDescriptor<GetInstructionsByOrderRequest, GetInstructionsByOrderResponse> getGetInstructionsByOrderMethod;
    private static volatile MethodDescriptor<GetInstructionsRequest, GetInstructionsResponse> getGetInstructionsMethod;
    private static volatile MethodDescriptor<PostOrderEligibleInstructionsRequest, PostOrderEligibleInstructionsResponse> getPostOrderEligibleInstructionsMethod;
    private static volatile MethodDescriptor<PreOrderEligibleInstructionsRequest, PreOrderEligibleInstructionsResponse> getPreOrderEligibleInstructionsMethod;
    private static volatile s serviceDescriptor;

    private static abstract class DeliveryInstructorAPIBaseDescriptorSupplier {
        DeliveryInstructorAPIBaseDescriptorSupplier() {
        }

        public Descriptors.FileDescriptor getFileDescriptor() {
            return DeliveryInstructorApiProto.getDescriptor();
        }

        public Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("DeliveryInstructorAPI");
        }
    }

    public static final class DeliveryInstructorAPIBlockingStub extends a<DeliveryInstructorAPIBlockingStub> {
        public CreateUpdateInstructionsForOrderResponse createUpdateInstructionsForOrder(CreateUpdateInstructionsForOrderRequest createUpdateInstructionsForOrderRequest) {
            return (CreateUpdateInstructionsForOrderResponse) d.f(getChannel(), DeliveryInstructorAPIGrpc.getCreateUpdateInstructionsForOrderMethod(), getCallOptions(), createUpdateInstructionsForOrderRequest);
        }

        public GetInstructionsResponse getInstructions(GetInstructionsRequest getInstructionsRequest) {
            return (GetInstructionsResponse) d.f(getChannel(), DeliveryInstructorAPIGrpc.getGetInstructionsMethod(), getCallOptions(), getInstructionsRequest);
        }

        public GetInstructionsByOrderResponse getInstructionsByOrder(GetInstructionsByOrderRequest getInstructionsByOrderRequest) {
            return (GetInstructionsByOrderResponse) d.f(getChannel(), DeliveryInstructorAPIGrpc.getGetInstructionsByOrderMethod(), getCallOptions(), getInstructionsByOrderRequest);
        }

        public PostOrderEligibleInstructionsResponse postOrderEligibleInstructions(PostOrderEligibleInstructionsRequest postOrderEligibleInstructionsRequest) {
            return (PostOrderEligibleInstructionsResponse) d.f(getChannel(), DeliveryInstructorAPIGrpc.getPostOrderEligibleInstructionsMethod(), getCallOptions(), postOrderEligibleInstructionsRequest);
        }

        public PreOrderEligibleInstructionsResponse preOrderEligibleInstructions(PreOrderEligibleInstructionsRequest preOrderEligibleInstructionsRequest) {
            return (PreOrderEligibleInstructionsResponse) d.f(getChannel(), DeliveryInstructorAPIGrpc.getPreOrderEligibleInstructionsMethod(), getCallOptions(), preOrderEligibleInstructionsRequest);
        }

        private DeliveryInstructorAPIBlockingStub(io.grpc.d dVar) {
            super(dVar);
        }

        /* access modifiers changed from: protected */
        public DeliveryInstructorAPIBlockingStub build(io.grpc.d dVar, c cVar) {
            return new DeliveryInstructorAPIBlockingStub(dVar, cVar);
        }

        private DeliveryInstructorAPIBlockingStub(io.grpc.d dVar, c cVar) {
            super(dVar, cVar);
        }
    }

    private static final class DeliveryInstructorAPIFileDescriptorSupplier extends DeliveryInstructorAPIBaseDescriptorSupplier {
        DeliveryInstructorAPIFileDescriptorSupplier() {
        }
    }

    public static final class DeliveryInstructorAPIFutureStub extends a<DeliveryInstructorAPIFutureStub> {
        public b<CreateUpdateInstructionsForOrderResponse> createUpdateInstructionsForOrder(CreateUpdateInstructionsForOrderRequest createUpdateInstructionsForOrderRequest) {
            return d.h(getChannel().a(DeliveryInstructorAPIGrpc.getCreateUpdateInstructionsForOrderMethod(), getCallOptions()), createUpdateInstructionsForOrderRequest);
        }

        public b<GetInstructionsResponse> getInstructions(GetInstructionsRequest getInstructionsRequest) {
            return d.h(getChannel().a(DeliveryInstructorAPIGrpc.getGetInstructionsMethod(), getCallOptions()), getInstructionsRequest);
        }

        public b<GetInstructionsByOrderResponse> getInstructionsByOrder(GetInstructionsByOrderRequest getInstructionsByOrderRequest) {
            return d.h(getChannel().a(DeliveryInstructorAPIGrpc.getGetInstructionsByOrderMethod(), getCallOptions()), getInstructionsByOrderRequest);
        }

        public b<PostOrderEligibleInstructionsResponse> postOrderEligibleInstructions(PostOrderEligibleInstructionsRequest postOrderEligibleInstructionsRequest) {
            return d.h(getChannel().a(DeliveryInstructorAPIGrpc.getPostOrderEligibleInstructionsMethod(), getCallOptions()), postOrderEligibleInstructionsRequest);
        }

        public b<PreOrderEligibleInstructionsResponse> preOrderEligibleInstructions(PreOrderEligibleInstructionsRequest preOrderEligibleInstructionsRequest) {
            return d.h(getChannel().a(DeliveryInstructorAPIGrpc.getPreOrderEligibleInstructionsMethod(), getCallOptions()), preOrderEligibleInstructionsRequest);
        }

        private DeliveryInstructorAPIFutureStub(io.grpc.d dVar) {
            super(dVar);
        }

        /* access modifiers changed from: protected */
        public DeliveryInstructorAPIFutureStub build(io.grpc.d dVar, c cVar) {
            return new DeliveryInstructorAPIFutureStub(dVar, cVar);
        }

        private DeliveryInstructorAPIFutureStub(io.grpc.d dVar, c cVar) {
            super(dVar, cVar);
        }
    }

    public static abstract class DeliveryInstructorAPIImplBase {
        public final r bindService() {
            return r.a(DeliveryInstructorAPIGrpc.getServiceDescriptor()).a(DeliveryInstructorAPIGrpc.getPreOrderEligibleInstructionsMethod(), f.b(new MethodHandlers(this, 0))).a(DeliveryInstructorAPIGrpc.getPostOrderEligibleInstructionsMethod(), f.b(new MethodHandlers(this, 1))).a(DeliveryInstructorAPIGrpc.getGetInstructionsMethod(), f.b(new MethodHandlers(this, 2))).a(DeliveryInstructorAPIGrpc.getCreateUpdateInstructionsForOrderMethod(), f.b(new MethodHandlers(this, 3))).a(DeliveryInstructorAPIGrpc.getGetInstructionsByOrderMethod(), f.b(new MethodHandlers(this, 4))).c();
        }

        public void createUpdateInstructionsForOrder(CreateUpdateInstructionsForOrderRequest createUpdateInstructionsForOrderRequest, g<CreateUpdateInstructionsForOrderResponse> gVar) {
            f.d(DeliveryInstructorAPIGrpc.getCreateUpdateInstructionsForOrderMethod(), gVar);
        }

        public void getInstructions(GetInstructionsRequest getInstructionsRequest, g<GetInstructionsResponse> gVar) {
            f.d(DeliveryInstructorAPIGrpc.getGetInstructionsMethod(), gVar);
        }

        public void getInstructionsByOrder(GetInstructionsByOrderRequest getInstructionsByOrderRequest, g<GetInstructionsByOrderResponse> gVar) {
            f.d(DeliveryInstructorAPIGrpc.getGetInstructionsByOrderMethod(), gVar);
        }

        public void postOrderEligibleInstructions(PostOrderEligibleInstructionsRequest postOrderEligibleInstructionsRequest, g<PostOrderEligibleInstructionsResponse> gVar) {
            f.d(DeliveryInstructorAPIGrpc.getPostOrderEligibleInstructionsMethod(), gVar);
        }

        public void preOrderEligibleInstructions(PreOrderEligibleInstructionsRequest preOrderEligibleInstructionsRequest, g<PreOrderEligibleInstructionsResponse> gVar) {
            f.d(DeliveryInstructorAPIGrpc.getPreOrderEligibleInstructionsMethod(), gVar);
        }
    }

    private static final class DeliveryInstructorAPIMethodDescriptorSupplier extends DeliveryInstructorAPIBaseDescriptorSupplier {
        private final String methodName;

        DeliveryInstructorAPIMethodDescriptorSupplier(String str) {
            this.methodName = str;
        }

        public Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(this.methodName);
        }
    }

    public static final class DeliveryInstructorAPIStub extends a<DeliveryInstructorAPIStub> {
        public void createUpdateInstructionsForOrder(CreateUpdateInstructionsForOrderRequest createUpdateInstructionsForOrderRequest, g<CreateUpdateInstructionsForOrderResponse> gVar) {
            d.b(getChannel().a(DeliveryInstructorAPIGrpc.getCreateUpdateInstructionsForOrderMethod(), getCallOptions()), createUpdateInstructionsForOrderRequest, gVar);
        }

        public void getInstructions(GetInstructionsRequest getInstructionsRequest, g<GetInstructionsResponse> gVar) {
            d.b(getChannel().a(DeliveryInstructorAPIGrpc.getGetInstructionsMethod(), getCallOptions()), getInstructionsRequest, gVar);
        }

        public void getInstructionsByOrder(GetInstructionsByOrderRequest getInstructionsByOrderRequest, g<GetInstructionsByOrderResponse> gVar) {
            d.b(getChannel().a(DeliveryInstructorAPIGrpc.getGetInstructionsByOrderMethod(), getCallOptions()), getInstructionsByOrderRequest, gVar);
        }

        public void postOrderEligibleInstructions(PostOrderEligibleInstructionsRequest postOrderEligibleInstructionsRequest, g<PostOrderEligibleInstructionsResponse> gVar) {
            d.b(getChannel().a(DeliveryInstructorAPIGrpc.getPostOrderEligibleInstructionsMethod(), getCallOptions()), postOrderEligibleInstructionsRequest, gVar);
        }

        public void preOrderEligibleInstructions(PreOrderEligibleInstructionsRequest preOrderEligibleInstructionsRequest, g<PreOrderEligibleInstructionsResponse> gVar) {
            d.b(getChannel().a(DeliveryInstructorAPIGrpc.getPreOrderEligibleInstructionsMethod(), getCallOptions()), preOrderEligibleInstructionsRequest, gVar);
        }

        private DeliveryInstructorAPIStub(io.grpc.d dVar) {
            super(dVar);
        }

        /* access modifiers changed from: protected */
        public DeliveryInstructorAPIStub build(io.grpc.d dVar, c cVar) {
            return new DeliveryInstructorAPIStub(dVar, cVar);
        }

        private DeliveryInstructorAPIStub(io.grpc.d dVar, c cVar) {
            super(dVar, cVar);
        }
    }

    private DeliveryInstructorAPIGrpc() {
    }

    public static MethodDescriptor<CreateUpdateInstructionsForOrderRequest, CreateUpdateInstructionsForOrderResponse> getCreateUpdateInstructionsForOrderMethod() {
        MethodDescriptor<CreateUpdateInstructionsForOrderRequest, CreateUpdateInstructionsForOrderResponse> methodDescriptor = getCreateUpdateInstructionsForOrderMethod;
        if (methodDescriptor == null) {
            synchronized (DeliveryInstructorAPIGrpc.class) {
                methodDescriptor = getCreateUpdateInstructionsForOrderMethod;
                if (methodDescriptor == null) {
                    methodDescriptor = MethodDescriptor.d().g(MethodDescriptor.MethodType.UNARY).b(MethodDescriptor.b(SERVICE_NAME, "CreateUpdateInstructionsForOrder")).e(true).c(xn0.a.a(CreateUpdateInstructionsForOrderRequest.getDefaultInstance())).d(xn0.a.a(CreateUpdateInstructionsForOrderResponse.getDefaultInstance())).f(new DeliveryInstructorAPIMethodDescriptorSupplier("CreateUpdateInstructionsForOrder")).a();
                    getCreateUpdateInstructionsForOrderMethod = methodDescriptor;
                }
            }
        }
        return methodDescriptor;
    }

    public static MethodDescriptor<GetInstructionsByOrderRequest, GetInstructionsByOrderResponse> getGetInstructionsByOrderMethod() {
        MethodDescriptor<GetInstructionsByOrderRequest, GetInstructionsByOrderResponse> methodDescriptor = getGetInstructionsByOrderMethod;
        if (methodDescriptor == null) {
            synchronized (DeliveryInstructorAPIGrpc.class) {
                methodDescriptor = getGetInstructionsByOrderMethod;
                if (methodDescriptor == null) {
                    methodDescriptor = MethodDescriptor.d().g(MethodDescriptor.MethodType.UNARY).b(MethodDescriptor.b(SERVICE_NAME, "GetInstructionsByOrder")).e(true).c(xn0.a.a(GetInstructionsByOrderRequest.getDefaultInstance())).d(xn0.a.a(GetInstructionsByOrderResponse.getDefaultInstance())).f(new DeliveryInstructorAPIMethodDescriptorSupplier("GetInstructionsByOrder")).a();
                    getGetInstructionsByOrderMethod = methodDescriptor;
                }
            }
        }
        return methodDescriptor;
    }

    public static MethodDescriptor<GetInstructionsRequest, GetInstructionsResponse> getGetInstructionsMethod() {
        MethodDescriptor<GetInstructionsRequest, GetInstructionsResponse> methodDescriptor = getGetInstructionsMethod;
        if (methodDescriptor == null) {
            synchronized (DeliveryInstructorAPIGrpc.class) {
                methodDescriptor = getGetInstructionsMethod;
                if (methodDescriptor == null) {
                    methodDescriptor = MethodDescriptor.d().g(MethodDescriptor.MethodType.UNARY).b(MethodDescriptor.b(SERVICE_NAME, "GetInstructions")).e(true).c(xn0.a.a(GetInstructionsRequest.getDefaultInstance())).d(xn0.a.a(GetInstructionsResponse.getDefaultInstance())).f(new DeliveryInstructorAPIMethodDescriptorSupplier("GetInstructions")).a();
                    getGetInstructionsMethod = methodDescriptor;
                }
            }
        }
        return methodDescriptor;
    }

    public static MethodDescriptor<PostOrderEligibleInstructionsRequest, PostOrderEligibleInstructionsResponse> getPostOrderEligibleInstructionsMethod() {
        MethodDescriptor<PostOrderEligibleInstructionsRequest, PostOrderEligibleInstructionsResponse> methodDescriptor = getPostOrderEligibleInstructionsMethod;
        if (methodDescriptor == null) {
            synchronized (DeliveryInstructorAPIGrpc.class) {
                methodDescriptor = getPostOrderEligibleInstructionsMethod;
                if (methodDescriptor == null) {
                    methodDescriptor = MethodDescriptor.d().g(MethodDescriptor.MethodType.UNARY).b(MethodDescriptor.b(SERVICE_NAME, "PostOrderEligibleInstructions")).e(true).c(xn0.a.a(PostOrderEligibleInstructionsRequest.getDefaultInstance())).d(xn0.a.a(PostOrderEligibleInstructionsResponse.getDefaultInstance())).f(new DeliveryInstructorAPIMethodDescriptorSupplier("PostOrderEligibleInstructions")).a();
                    getPostOrderEligibleInstructionsMethod = methodDescriptor;
                }
            }
        }
        return methodDescriptor;
    }

    public static MethodDescriptor<PreOrderEligibleInstructionsRequest, PreOrderEligibleInstructionsResponse> getPreOrderEligibleInstructionsMethod() {
        MethodDescriptor<PreOrderEligibleInstructionsRequest, PreOrderEligibleInstructionsResponse> methodDescriptor = getPreOrderEligibleInstructionsMethod;
        if (methodDescriptor == null) {
            synchronized (DeliveryInstructorAPIGrpc.class) {
                methodDescriptor = getPreOrderEligibleInstructionsMethod;
                if (methodDescriptor == null) {
                    methodDescriptor = MethodDescriptor.d().g(MethodDescriptor.MethodType.UNARY).b(MethodDescriptor.b(SERVICE_NAME, "PreOrderEligibleInstructions")).e(true).c(xn0.a.a(PreOrderEligibleInstructionsRequest.getDefaultInstance())).d(xn0.a.a(PreOrderEligibleInstructionsResponse.getDefaultInstance())).f(new DeliveryInstructorAPIMethodDescriptorSupplier("PreOrderEligibleInstructions")).a();
                    getPreOrderEligibleInstructionsMethod = methodDescriptor;
                }
            }
        }
        return methodDescriptor;
    }

    public static s getServiceDescriptor() {
        s sVar = serviceDescriptor;
        if (sVar == null) {
            synchronized (DeliveryInstructorAPIGrpc.class) {
                sVar = serviceDescriptor;
                if (sVar == null) {
                    sVar = s.c(SERVICE_NAME).i(new DeliveryInstructorAPIFileDescriptorSupplier()).f(getPreOrderEligibleInstructionsMethod()).f(getPostOrderEligibleInstructionsMethod()).f(getGetInstructionsMethod()).f(getCreateUpdateInstructionsForOrderMethod()).f(getGetInstructionsByOrderMethod()).g();
                    serviceDescriptor = sVar;
                }
            }
        }
        return sVar;
    }

    public static DeliveryInstructorAPIBlockingStub newBlockingStub(io.grpc.d dVar) {
        return new DeliveryInstructorAPIBlockingStub(dVar);
    }

    public static DeliveryInstructorAPIFutureStub newFutureStub(io.grpc.d dVar) {
        return new DeliveryInstructorAPIFutureStub(dVar);
    }

    public static DeliveryInstructorAPIStub newStub(io.grpc.d dVar) {
        return new DeliveryInstructorAPIStub(dVar);
    }

    private static final class MethodHandlers<Req, Resp> implements f.b<Req, Resp>, f.a<Req, Resp> {
        private final int methodId;
        private final DeliveryInstructorAPIImplBase serviceImpl;

        MethodHandlers(DeliveryInstructorAPIImplBase deliveryInstructorAPIImplBase, int i11) {
            this.serviceImpl = deliveryInstructorAPIImplBase;
            this.methodId = i11;
        }

        public void invoke(Req req, g<Resp> gVar) {
            int i11 = this.methodId;
            if (i11 == 0) {
                this.serviceImpl.preOrderEligibleInstructions((PreOrderEligibleInstructionsRequest) req, gVar);
            } else if (i11 == 1) {
                this.serviceImpl.postOrderEligibleInstructions((PostOrderEligibleInstructionsRequest) req, gVar);
            } else if (i11 == 2) {
                this.serviceImpl.getInstructions((GetInstructionsRequest) req, gVar);
            } else if (i11 == 3) {
                this.serviceImpl.createUpdateInstructionsForOrder((CreateUpdateInstructionsForOrderRequest) req, gVar);
            } else if (i11 == 4) {
                this.serviceImpl.getInstructionsByOrder((GetInstructionsByOrderRequest) req, gVar);
            } else {
                throw new AssertionError();
            }
        }

        public g<Req> invoke(g<Resp> gVar) {
            throw new AssertionError();
        }
    }
}
