/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetSchemaResponse implements org.apache.thrift.TBase<GetSchemaResponse, GetSchemaResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetSchemaResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetSchemaResponse");

  private static final org.apache.thrift.protocol.TField FIELDS_FIELD_DESC = new org.apache.thrift.protocol.TField("fields", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetSchemaResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetSchemaResponseTupleSchemeFactory());
  }

  private List<FieldSchema> fields; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELDS((short)1, "fields");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FIELDS
          return FIELDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIELDS, new org.apache.thrift.meta_data.FieldMetaData("fields", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FieldSchema.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetSchemaResponse.class, metaDataMap);
  }

  public GetSchemaResponse() {
  }

  public GetSchemaResponse(
    List<FieldSchema> fields)
  {
    this();
    this.fields = fields;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSchemaResponse(GetSchemaResponse other) {
    if (other.isSetFields()) {
      List<FieldSchema> __this__fields = new ArrayList<FieldSchema>(other.fields.size());
      for (FieldSchema other_element : other.fields) {
        __this__fields.add(new FieldSchema(other_element));
      }
      this.fields = __this__fields;
    }
  }

  public GetSchemaResponse deepCopy() {
    return new GetSchemaResponse(this);
  }

  @Override
  public void clear() {
    this.fields = null;
  }

  public int getFieldsSize() {
    return (this.fields == null) ? 0 : this.fields.size();
  }

  public java.util.Iterator<FieldSchema> getFieldsIterator() {
    return (this.fields == null) ? null : this.fields.iterator();
  }

  public void addToFields(FieldSchema elem) {
    if (this.fields == null) {
      this.fields = new ArrayList<FieldSchema>();
    }
    this.fields.add(elem);
  }

  public List<FieldSchema> getFields() {
    return this.fields;
  }

  public void setFields(List<FieldSchema> fields) {
    this.fields = fields;
  }

  public void unsetFields() {
    this.fields = null;
  }

  /** Returns true if field fields is set (has been assigned a value) and false otherwise */
  public boolean isSetFields() {
    return this.fields != null;
  }

  public void setFieldsIsSet(boolean value) {
    if (!value) {
      this.fields = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIELDS:
      if (value == null) {
        unsetFields();
      } else {
        setFields((List<FieldSchema>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELDS:
      return getFields();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIELDS:
      return isSetFields();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSchemaResponse)
      return this.equals((GetSchemaResponse)that);
    return false;
  }

  public boolean equals(GetSchemaResponse that) {
    if (that == null)
      return false;

    boolean this_present_fields = true && this.isSetFields();
    boolean that_present_fields = true && that.isSetFields();
    if (this_present_fields || that_present_fields) {
      if (!(this_present_fields && that_present_fields))
        return false;
      if (!this.fields.equals(that.fields))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fields = true && (isSetFields());
    list.add(present_fields);
    if (present_fields)
      list.add(fields);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetSchemaResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFields()).compareTo(other.isSetFields());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFields()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fields, other.fields);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetSchemaResponse(");
    boolean first = true;

    sb.append("fields:");
    if (this.fields == null) {
      sb.append("null");
    } else {
      sb.append(this.fields);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetFields()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fields' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetSchemaResponseStandardSchemeFactory implements SchemeFactory {
    public GetSchemaResponseStandardScheme getScheme() {
      return new GetSchemaResponseStandardScheme();
    }
  }

  private static class GetSchemaResponseStandardScheme extends StandardScheme<GetSchemaResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetSchemaResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIELDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1216 = iprot.readListBegin();
                struct.fields = new ArrayList<FieldSchema>(_list1216.size);
                FieldSchema _elem1217;
                for (int _i1218 = 0; _i1218 < _list1216.size; ++_i1218)
                {
                  _elem1217 = new FieldSchema();
                  _elem1217.read(iprot);
                  struct.fields.add(_elem1217);
                }
                iprot.readListEnd();
              }
              struct.setFieldsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetSchemaResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fields != null) {
        oprot.writeFieldBegin(FIELDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.fields.size()));
          for (FieldSchema _iter1219 : struct.fields)
          {
            _iter1219.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetSchemaResponseTupleSchemeFactory implements SchemeFactory {
    public GetSchemaResponseTupleScheme getScheme() {
      return new GetSchemaResponseTupleScheme();
    }
  }

  private static class GetSchemaResponseTupleScheme extends TupleScheme<GetSchemaResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetSchemaResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.fields.size());
        for (FieldSchema _iter1220 : struct.fields)
        {
          _iter1220.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetSchemaResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list1221 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.fields = new ArrayList<FieldSchema>(_list1221.size);
        FieldSchema _elem1222;
        for (int _i1223 = 0; _i1223 < _list1221.size; ++_i1223)
        {
          _elem1222 = new FieldSchema();
          _elem1222.read(iprot);
          struct.fields.add(_elem1222);
        }
      }
      struct.setFieldsIsSet(true);
    }
  }

}

