
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     gpu/ipc/common/gpu_info.mojom
//

package org.chromium.gpu.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class GpuInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 216;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(216, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo.common.mojom.TimeDelta initializationTime;
    public boolean optimus;
    public boolean amdSwitchable;
    public GpuDevice gpu;
    public GpuDevice[] secondaryGpus;
    public String driverVendor;
    public String driverVersion;
    public String driverDate;
    public String pixelShaderVersion;
    public String vertexShaderVersion;
    public String maxMsaaSamples;
    public String machineModelName;
    public String machineModelVersion;
    public String glVersion;
    public String glVendor;
    public String glRenderer;
    public String glExtensions;
    public String glWsVendor;
    public String glWsVersion;
    public String glWsExtensions;
    public int glResetNotificationStrategy;
    public boolean softwareRendering;
    public boolean directRendering;
    public boolean sandboxed;
    public int processCrashCount;
    public boolean inProcessGpu;
    public boolean passthroughCmdDecoder;
    public boolean supportsOverlays;
    public boolean canSupportThreadedTextureMailbox;
    public int basicInfoState;
    public int contextInfoState;
    public int dxDiagnosticsInfoState;
    public DxDiagNode dxDiagnostics;
    public VideoDecodeAcceleratorCapabilities videoDecodeAcceleratorCapabilities;
    public VideoEncodeAcceleratorSupportedProfile[] videoEncodeAcceleratorSupportedProfiles;
    public boolean jpegDecodeAcceleratorSupported;
    public long systemVisual;
    public long rgbaVisual;

    private GpuInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public GpuInfo() {
        this(0);
    }

    public static GpuInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static GpuInfo deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static GpuInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        GpuInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new GpuInfo(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.initializationTime = org.chromium.mojo.common.mojom.TimeDelta.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.optimus = decoder0.readBoolean(16, 0);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.amdSwitchable = decoder0.readBoolean(16, 1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.softwareRendering = decoder0.readBoolean(16, 2);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.directRendering = decoder0.readBoolean(16, 3);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.sandboxed = decoder0.readBoolean(16, 4);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.inProcessGpu = decoder0.readBoolean(16, 5);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.passthroughCmdDecoder = decoder0.readBoolean(16, 6);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.supportsOverlays = decoder0.readBoolean(16, 7);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.canSupportThreadedTextureMailbox = decoder0.readBoolean(17, 0);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.jpegDecodeAcceleratorSupported = decoder0.readBoolean(17, 1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.glResetNotificationStrategy = decoder0.readInt(20);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.gpu = GpuDevice.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.secondaryGpus = new GpuDevice[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.secondaryGpus[i1] = GpuDevice.decode(decoder2);
                    }
                }
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.driverVendor = decoder0.readString(40, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.driverVersion = decoder0.readString(48, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.driverDate = decoder0.readString(56, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.pixelShaderVersion = decoder0.readString(64, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.vertexShaderVersion = decoder0.readString(72, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.maxMsaaSamples = decoder0.readString(80, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.machineModelName = decoder0.readString(88, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.machineModelVersion = decoder0.readString(96, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.glVersion = decoder0.readString(104, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.glVendor = decoder0.readString(112, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.glRenderer = decoder0.readString(120, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.glExtensions = decoder0.readString(128, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.glWsVendor = decoder0.readString(136, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.glWsVersion = decoder0.readString(144, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.glWsExtensions = decoder0.readString(152, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.processCrashCount = decoder0.readInt(160);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.basicInfoState = decoder0.readInt(164);
                    CollectInfoResult.validate(result.basicInfoState);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.contextInfoState = decoder0.readInt(168);
                    CollectInfoResult.validate(result.contextInfoState);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.dxDiagnosticsInfoState = decoder0.readInt(172);
                    CollectInfoResult.validate(result.dxDiagnosticsInfoState);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(176, true);
                result.dxDiagnostics = DxDiagNode.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(184, false);
                result.videoDecodeAcceleratorCapabilities = VideoDecodeAcceleratorCapabilities.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(192, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.videoEncodeAcceleratorSupportedProfiles = new VideoEncodeAcceleratorSupportedProfile[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.videoEncodeAcceleratorSupportedProfiles[i1] = VideoEncodeAcceleratorSupportedProfile.decode(decoder2);
                    }
                }
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.systemVisual = decoder0.readLong(200);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.rgbaVisual = decoder0.readLong(208);
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
        
        encoder0.encode(this.initializationTime, 8, false);
        
        encoder0.encode(this.optimus, 16, 0);
        
        encoder0.encode(this.amdSwitchable, 16, 1);
        
        encoder0.encode(this.softwareRendering, 16, 2);
        
        encoder0.encode(this.directRendering, 16, 3);
        
        encoder0.encode(this.sandboxed, 16, 4);
        
        encoder0.encode(this.inProcessGpu, 16, 5);
        
        encoder0.encode(this.passthroughCmdDecoder, 16, 6);
        
        encoder0.encode(this.supportsOverlays, 16, 7);
        
        encoder0.encode(this.canSupportThreadedTextureMailbox, 17, 0);
        
        encoder0.encode(this.jpegDecodeAcceleratorSupported, 17, 1);
        
        encoder0.encode(this.glResetNotificationStrategy, 20);
        
        encoder0.encode(this.gpu, 24, false);
        
        if (this.secondaryGpus == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.secondaryGpus.length, 32, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.secondaryGpus.length; ++i0) {
                
                encoder1.encode(this.secondaryGpus[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.driverVendor, 40, false);
        
        encoder0.encode(this.driverVersion, 48, false);
        
        encoder0.encode(this.driverDate, 56, false);
        
        encoder0.encode(this.pixelShaderVersion, 64, false);
        
        encoder0.encode(this.vertexShaderVersion, 72, false);
        
        encoder0.encode(this.maxMsaaSamples, 80, false);
        
        encoder0.encode(this.machineModelName, 88, false);
        
        encoder0.encode(this.machineModelVersion, 96, false);
        
        encoder0.encode(this.glVersion, 104, false);
        
        encoder0.encode(this.glVendor, 112, false);
        
        encoder0.encode(this.glRenderer, 120, false);
        
        encoder0.encode(this.glExtensions, 128, false);
        
        encoder0.encode(this.glWsVendor, 136, false);
        
        encoder0.encode(this.glWsVersion, 144, false);
        
        encoder0.encode(this.glWsExtensions, 152, false);
        
        encoder0.encode(this.processCrashCount, 160);
        
        encoder0.encode(this.basicInfoState, 164);
        
        encoder0.encode(this.contextInfoState, 168);
        
        encoder0.encode(this.dxDiagnosticsInfoState, 172);
        
        encoder0.encode(this.dxDiagnostics, 176, true);
        
        encoder0.encode(this.videoDecodeAcceleratorCapabilities, 184, false);
        
        if (this.videoEncodeAcceleratorSupportedProfiles == null) {
            encoder0.encodeNullPointer(192, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.videoEncodeAcceleratorSupportedProfiles.length, 192, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.videoEncodeAcceleratorSupportedProfiles.length; ++i0) {
                
                encoder1.encode(this.videoEncodeAcceleratorSupportedProfiles[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.systemVisual, 200);
        
        encoder0.encode(this.rgbaVisual, 208);
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
        GpuInfo other = (GpuInfo) object;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.initializationTime, other.initializationTime))
            return false;
        if (this.optimus!= other.optimus)
            return false;
        if (this.amdSwitchable!= other.amdSwitchable)
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.gpu, other.gpu))
            return false;
        if (!java.util.Arrays.deepEquals(this.secondaryGpus, other.secondaryGpus))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.driverVendor, other.driverVendor))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.driverVersion, other.driverVersion))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.driverDate, other.driverDate))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.pixelShaderVersion, other.pixelShaderVersion))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.vertexShaderVersion, other.vertexShaderVersion))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.maxMsaaSamples, other.maxMsaaSamples))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.machineModelName, other.machineModelName))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.machineModelVersion, other.machineModelVersion))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.glVersion, other.glVersion))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.glVendor, other.glVendor))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.glRenderer, other.glRenderer))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.glExtensions, other.glExtensions))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.glWsVendor, other.glWsVendor))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.glWsVersion, other.glWsVersion))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.glWsExtensions, other.glWsExtensions))
            return false;
        if (this.glResetNotificationStrategy!= other.glResetNotificationStrategy)
            return false;
        if (this.softwareRendering!= other.softwareRendering)
            return false;
        if (this.directRendering!= other.directRendering)
            return false;
        if (this.sandboxed!= other.sandboxed)
            return false;
        if (this.processCrashCount!= other.processCrashCount)
            return false;
        if (this.inProcessGpu!= other.inProcessGpu)
            return false;
        if (this.passthroughCmdDecoder!= other.passthroughCmdDecoder)
            return false;
        if (this.supportsOverlays!= other.supportsOverlays)
            return false;
        if (this.canSupportThreadedTextureMailbox!= other.canSupportThreadedTextureMailbox)
            return false;
        if (this.basicInfoState!= other.basicInfoState)
            return false;
        if (this.contextInfoState!= other.contextInfoState)
            return false;
        if (this.dxDiagnosticsInfoState!= other.dxDiagnosticsInfoState)
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.dxDiagnostics, other.dxDiagnostics))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.videoDecodeAcceleratorCapabilities, other.videoDecodeAcceleratorCapabilities))
            return false;
        if (!java.util.Arrays.deepEquals(this.videoEncodeAcceleratorSupportedProfiles, other.videoEncodeAcceleratorSupportedProfiles))
            return false;
        if (this.jpegDecodeAcceleratorSupported!= other.jpegDecodeAcceleratorSupported)
            return false;
        if (this.systemVisual!= other.systemVisual)
            return false;
        if (this.rgbaVisual!= other.rgbaVisual)
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
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.initializationTime);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.optimus);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.amdSwitchable);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.gpu);
        result = prime * result + java.util.Arrays.deepHashCode(this.secondaryGpus);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.driverVendor);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.driverVersion);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.driverDate);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.pixelShaderVersion);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.vertexShaderVersion);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.maxMsaaSamples);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.machineModelName);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.machineModelVersion);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.glVersion);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.glVendor);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.glRenderer);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.glExtensions);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.glWsVendor);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.glWsVersion);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.glWsExtensions);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.glResetNotificationStrategy);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.softwareRendering);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.directRendering);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.sandboxed);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.processCrashCount);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.inProcessGpu);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.passthroughCmdDecoder);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.supportsOverlays);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.canSupportThreadedTextureMailbox);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.basicInfoState);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.contextInfoState);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.dxDiagnosticsInfoState);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.dxDiagnostics);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.videoDecodeAcceleratorCapabilities);
        result = prime * result + java.util.Arrays.deepHashCode(this.videoEncodeAcceleratorSupportedProfiles);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.jpegDecodeAcceleratorSupported);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.systemVisual);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.rgbaVisual);
        return result;
    }
}