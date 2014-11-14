package Protocol;
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registration_message_from_phone.proto
public final class RegistrationMessageFromPhoneClass {
  private RegistrationMessageFromPhoneClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RegistrationMessageFromPhoneOrBuilder extends
      // @@protoc_insertion_point(interface_extends:messageFromPhone.RegistrationMessageFromPhone)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string teamName = 1;</code>
     */
    boolean hasTeamName();
    /**
     * <code>optional string teamName = 1;</code>
     */
    java.lang.String getTeamName();
    /**
     * <code>optional string teamName = 1;</code>
     */
    com.google.protobuf.ByteString
        getTeamNameBytes();

    /**
     * <code>optional string colorHex = 2;</code>
     */
    boolean hasColorHex();
    /**
     * <code>optional string colorHex = 2;</code>
     */
    java.lang.String getColorHex();
    /**
     * <code>optional string colorHex = 2;</code>
     */
    com.google.protobuf.ByteString
        getColorHexBytes();

    /**
     * <code>optional string versionNumber = 3;</code>
     */
    boolean hasVersionNumber();
    /**
     * <code>optional string versionNumber = 3;</code>
     */
    java.lang.String getVersionNumber();
    /**
     * <code>optional string versionNumber = 3;</code>
     */
    com.google.protobuf.ByteString
        getVersionNumberBytes();

    /**
     * <code>optional string authentication = 4;</code>
     */
    boolean hasAuthentication();
    /**
     * <code>optional string authentication = 4;</code>
     */
    java.lang.String getAuthentication();
    /**
     * <code>optional string authentication = 4;</code>
     */
    com.google.protobuf.ByteString
        getAuthenticationBytes();
  }
  /**
   * Protobuf type {@code messageFromPhone.RegistrationMessageFromPhone}
   *
   * <pre>
   * define the structure of the actual protocol message that 
   * will be sent from the phone to the "parent" quiz show app
   * </pre>
   */
  public static final class RegistrationMessageFromPhone extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:messageFromPhone.RegistrationMessageFromPhone)
      RegistrationMessageFromPhoneOrBuilder {
    // Use RegistrationMessageFromPhone.newBuilder() to construct.
    private RegistrationMessageFromPhone(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RegistrationMessageFromPhone(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RegistrationMessageFromPhone defaultInstance;
    public static RegistrationMessageFromPhone getDefaultInstance() {
      return defaultInstance;
    }

    public RegistrationMessageFromPhone getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RegistrationMessageFromPhone(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              teamName_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              colorHex_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              versionNumber_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              authentication_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protocol.RegistrationMessageFromPhoneClass.internal_static_messageFromPhone_RegistrationMessageFromPhone_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protocol.RegistrationMessageFromPhoneClass.internal_static_messageFromPhone_RegistrationMessageFromPhone_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone.class, Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone.Builder.class);
    }

    public static com.google.protobuf.Parser<RegistrationMessageFromPhone> PARSER =
        new com.google.protobuf.AbstractParser<RegistrationMessageFromPhone>() {
      public RegistrationMessageFromPhone parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegistrationMessageFromPhone(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RegistrationMessageFromPhone> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TEAMNAME_FIELD_NUMBER = 1;
    private java.lang.Object teamName_;
    /**
     * <code>optional string teamName = 1;</code>
     */
    public boolean hasTeamName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string teamName = 1;</code>
     */
    public java.lang.String getTeamName() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          teamName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string teamName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTeamNameBytes() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        teamName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COLORHEX_FIELD_NUMBER = 2;
    private java.lang.Object colorHex_;
    /**
     * <code>optional string colorHex = 2;</code>
     */
    public boolean hasColorHex() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string colorHex = 2;</code>
     */
    public java.lang.String getColorHex() {
      java.lang.Object ref = colorHex_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          colorHex_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string colorHex = 2;</code>
     */
    public com.google.protobuf.ByteString
        getColorHexBytes() {
      java.lang.Object ref = colorHex_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        colorHex_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERSIONNUMBER_FIELD_NUMBER = 3;
    private java.lang.Object versionNumber_;
    /**
     * <code>optional string versionNumber = 3;</code>
     */
    public boolean hasVersionNumber() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string versionNumber = 3;</code>
     */
    public java.lang.String getVersionNumber() {
      java.lang.Object ref = versionNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          versionNumber_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string versionNumber = 3;</code>
     */
    public com.google.protobuf.ByteString
        getVersionNumberBytes() {
      java.lang.Object ref = versionNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        versionNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AUTHENTICATION_FIELD_NUMBER = 4;
    private java.lang.Object authentication_;
    /**
     * <code>optional string authentication = 4;</code>
     */
    public boolean hasAuthentication() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string authentication = 4;</code>
     */
    public java.lang.String getAuthentication() {
      java.lang.Object ref = authentication_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          authentication_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string authentication = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAuthenticationBytes() {
      java.lang.Object ref = authentication_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authentication_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      teamName_ = "";
      colorHex_ = "";
      versionNumber_ = "";
      authentication_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTeamNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getColorHexBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getVersionNumberBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getAuthenticationBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTeamNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getColorHexBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getVersionNumberBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getAuthenticationBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code messageFromPhone.RegistrationMessageFromPhone}
     *
     * <pre>
     * define the structure of the actual protocol message that 
     * will be sent from the phone to the "parent" quiz show app
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:messageFromPhone.RegistrationMessageFromPhone)
        Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhoneOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protocol.RegistrationMessageFromPhoneClass.internal_static_messageFromPhone_RegistrationMessageFromPhone_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protocol.RegistrationMessageFromPhoneClass.internal_static_messageFromPhone_RegistrationMessageFromPhone_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone.class, Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone.Builder.class);
      }

      // Construct using proto.fromPhone.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        teamName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        colorHex_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        versionNumber_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        authentication_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protocol.RegistrationMessageFromPhoneClass.internal_static_messageFromPhone_RegistrationMessageFromPhone_descriptor;
      }

      public Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone getDefaultInstanceForType() {
        return Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone.getDefaultInstance();
      }

      public Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone build() {
        Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone buildPartial() {
        Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone result = new Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.teamName_ = teamName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.colorHex_ = colorHex_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.versionNumber_ = versionNumber_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.authentication_ = authentication_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone) {
          return mergeFrom((Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone other) {
        if (other == Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone.getDefaultInstance()) return this;
        if (other.hasTeamName()) {
          bitField0_ |= 0x00000001;
          teamName_ = other.teamName_;
          onChanged();
        }
        if (other.hasColorHex()) {
          bitField0_ |= 0x00000002;
          colorHex_ = other.colorHex_;
          onChanged();
        }
        if (other.hasVersionNumber()) {
          bitField0_ |= 0x00000004;
          versionNumber_ = other.versionNumber_;
          onChanged();
        }
        if (other.hasAuthentication()) {
          bitField0_ |= 0x00000008;
          authentication_ = other.authentication_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Protocol.RegistrationMessageFromPhoneClass.RegistrationMessageFromPhone) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object teamName_ = "";
      /**
       * <code>optional string teamName = 1;</code>
       */
      public boolean hasTeamName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string teamName = 1;</code>
       */
      public java.lang.String getTeamName() {
        java.lang.Object ref = teamName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            teamName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string teamName = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTeamNameBytes() {
        java.lang.Object ref = teamName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          teamName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string teamName = 1;</code>
       */
      public Builder setTeamName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        teamName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string teamName = 1;</code>
       */
      public Builder clearTeamName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        teamName_ = getDefaultInstance().getTeamName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string teamName = 1;</code>
       */
      public Builder setTeamNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        teamName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object colorHex_ = "";
      /**
       * <code>optional string colorHex = 2;</code>
       */
      public boolean hasColorHex() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string colorHex = 2;</code>
       */
      public java.lang.String getColorHex() {
        java.lang.Object ref = colorHex_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            colorHex_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string colorHex = 2;</code>
       */
      public com.google.protobuf.ByteString
          getColorHexBytes() {
        java.lang.Object ref = colorHex_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          colorHex_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string colorHex = 2;</code>
       */
      public Builder setColorHex(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        colorHex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string colorHex = 2;</code>
       */
      public Builder clearColorHex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        colorHex_ = getDefaultInstance().getColorHex();
        onChanged();
        return this;
      }
      /**
       * <code>optional string colorHex = 2;</code>
       */
      public Builder setColorHexBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        colorHex_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object versionNumber_ = "";
      /**
       * <code>optional string versionNumber = 3;</code>
       */
      public boolean hasVersionNumber() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string versionNumber = 3;</code>
       */
      public java.lang.String getVersionNumber() {
        java.lang.Object ref = versionNumber_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            versionNumber_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string versionNumber = 3;</code>
       */
      public com.google.protobuf.ByteString
          getVersionNumberBytes() {
        java.lang.Object ref = versionNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          versionNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string versionNumber = 3;</code>
       */
      public Builder setVersionNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        versionNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string versionNumber = 3;</code>
       */
      public Builder clearVersionNumber() {
        bitField0_ = (bitField0_ & ~0x00000004);
        versionNumber_ = getDefaultInstance().getVersionNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional string versionNumber = 3;</code>
       */
      public Builder setVersionNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        versionNumber_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object authentication_ = "";
      /**
       * <code>optional string authentication = 4;</code>
       */
      public boolean hasAuthentication() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string authentication = 4;</code>
       */
      public java.lang.String getAuthentication() {
        java.lang.Object ref = authentication_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            authentication_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string authentication = 4;</code>
       */
      public com.google.protobuf.ByteString
          getAuthenticationBytes() {
        java.lang.Object ref = authentication_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authentication_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string authentication = 4;</code>
       */
      public Builder setAuthentication(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        authentication_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string authentication = 4;</code>
       */
      public Builder clearAuthentication() {
        bitField0_ = (bitField0_ & ~0x00000008);
        authentication_ = getDefaultInstance().getAuthentication();
        onChanged();
        return this;
      }
      /**
       * <code>optional string authentication = 4;</code>
       */
      public Builder setAuthenticationBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        authentication_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:messageFromPhone.RegistrationMessageFromPhone)
    }

    static {
      defaultInstance = new RegistrationMessageFromPhone(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:messageFromPhone.RegistrationMessageFromPhone)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messageFromPhone_RegistrationMessageFromPhone_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_messageFromPhone_RegistrationMessageFromPhone_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%registration_message_from_phone.proto\022" +
      "\020messageFromPhone\"q\n\034RegistrationMessage" +
      "FromPhone\022\020\n\010teamName\030\001 \001(\t\022\020\n\010colorHex\030" +
      "\002 \001(\t\022\025\n\rversionNumber\030\003 \001(\t\022\026\n\016authenti" +
      "cation\030\004 \001(\tB4\n\017proto.fromPhoneB!Registr" +
      "ationMessageFromPhoneClass"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_messageFromPhone_RegistrationMessageFromPhone_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_messageFromPhone_RegistrationMessageFromPhone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_messageFromPhone_RegistrationMessageFromPhone_descriptor,
        new java.lang.String[] { "TeamName", "ColorHex", "VersionNumber", "Authentication", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
