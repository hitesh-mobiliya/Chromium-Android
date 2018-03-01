
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/interfaces/serial.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class SerialDeviceEnumerator_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<SerialDeviceEnumerator, SerialDeviceEnumerator.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<SerialDeviceEnumerator, SerialDeviceEnumerator.Proxy>() {
    
        public String getName() {
            return "device::mojom::SerialDeviceEnumerator";
        }
    
        public int getVersion() {
          return 0;
        }
    
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }
    
        public Stub buildStub(org.chromium.mojo.system.Core core, SerialDeviceEnumerator impl) {
            return new Stub(core, impl);
        }
    
        public SerialDeviceEnumerator[] buildArray(int size) {
          return new SerialDeviceEnumerator[size];
        }
    };


    private static final int GET_DEVICES_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements SerialDeviceEnumerator.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void getDevices(

GetDevicesResponse callback) {

            SerialDeviceEnumeratorGetDevicesParams _message = new SerialDeviceEnumeratorGetDevicesParams();


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_DEVICES_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new SerialDeviceEnumeratorGetDevicesResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<SerialDeviceEnumerator> {

        Stub(org.chromium.mojo.system.Core core, SerialDeviceEnumerator impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                SerialDeviceEnumerator_Internal.MANAGER, messageWithHeader);
            
            
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), SerialDeviceEnumerator_Internal.MANAGER, messageWithHeader, receiver);
            
            
            
            
            
            
            
                    case GET_DEVICES_ORDINAL: {
            
                        SerialDeviceEnumeratorGetDevicesParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().getDevices(new SerialDeviceEnumeratorGetDevicesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class SerialDeviceEnumeratorGetDevicesParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    
        private SerialDeviceEnumeratorGetDevicesParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public SerialDeviceEnumeratorGetDevicesParams() {
            this(0);
        }
    
        public static SerialDeviceEnumeratorGetDevicesParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SerialDeviceEnumeratorGetDevicesParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static SerialDeviceEnumeratorGetDevicesParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SerialDeviceEnumeratorGetDevicesParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new SerialDeviceEnumeratorGetDevicesParams(mainDataHeader.elementsOrVersion);
            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            return result;
        }
    }



    
    static final class SerialDeviceEnumeratorGetDevicesResponseParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public SerialDeviceInfo[] devices;
    
        private SerialDeviceEnumeratorGetDevicesResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public SerialDeviceEnumeratorGetDevicesResponseParams() {
            this(0);
        }
    
        public static SerialDeviceEnumeratorGetDevicesResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SerialDeviceEnumeratorGetDevicesResponseParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static SerialDeviceEnumeratorGetDevicesResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SerialDeviceEnumeratorGetDevicesResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new SerialDeviceEnumeratorGetDevicesResponseParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.devices = new SerialDeviceInfo[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.devices[i1] = SerialDeviceInfo.decode(decoder2);
                        }
                    }
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            if (this.devices == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.devices.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.devices.length; ++i0) {
                    
                    encoder1.encode(this.devices[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            SerialDeviceEnumeratorGetDevicesResponseParams other = (SerialDeviceEnumeratorGetDevicesResponseParams) object;
            if (!java.util.Arrays.deepEquals(this.devices, other.devices))
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            result = prime * result + java.util.Arrays.deepHashCode(this.devices);
            return result;
        }
    }

    static class SerialDeviceEnumeratorGetDevicesResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final SerialDeviceEnumerator.GetDevicesResponse mCallback;

        SerialDeviceEnumeratorGetDevicesResponseParamsForwardToCallback(SerialDeviceEnumerator.GetDevicesResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_DEVICES_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                SerialDeviceEnumeratorGetDevicesResponseParams response = SerialDeviceEnumeratorGetDevicesResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.devices);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class SerialDeviceEnumeratorGetDevicesResponseParamsProxyToResponder implements SerialDeviceEnumerator.GetDevicesResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        SerialDeviceEnumeratorGetDevicesResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(SerialDeviceInfo[] devices) {
            SerialDeviceEnumeratorGetDevicesResponseParams _response = new SerialDeviceEnumeratorGetDevicesResponseParams();

            _response.devices = devices;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_DEVICES_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
