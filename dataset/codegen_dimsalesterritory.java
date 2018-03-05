// ORM class for table 'dimsalesterritory'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 05 02:04:25 PST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class codegen_dimsalesterritory extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("SalesTerritoryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SalesTerritoryKey = (Integer)value;
      }
    });
    setters.put("SalesTerritoryAlternateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SalesTerritoryAlternateKey = (Integer)value;
      }
    });
    setters.put("SalesTerritoryRegion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SalesTerritoryRegion = (String)value;
      }
    });
    setters.put("SalesTerritoryCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SalesTerritoryCountry = (String)value;
      }
    });
    setters.put("SalesTerritoryGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SalesTerritoryGroup = (String)value;
      }
    });
  }
  public codegen_dimsalesterritory() {
    init0();
  }
  private Integer SalesTerritoryKey;
  public Integer get_SalesTerritoryKey() {
    return SalesTerritoryKey;
  }
  public void set_SalesTerritoryKey(Integer SalesTerritoryKey) {
    this.SalesTerritoryKey = SalesTerritoryKey;
  }
  public codegen_dimsalesterritory with_SalesTerritoryKey(Integer SalesTerritoryKey) {
    this.SalesTerritoryKey = SalesTerritoryKey;
    return this;
  }
  private Integer SalesTerritoryAlternateKey;
  public Integer get_SalesTerritoryAlternateKey() {
    return SalesTerritoryAlternateKey;
  }
  public void set_SalesTerritoryAlternateKey(Integer SalesTerritoryAlternateKey) {
    this.SalesTerritoryAlternateKey = SalesTerritoryAlternateKey;
  }
  public codegen_dimsalesterritory with_SalesTerritoryAlternateKey(Integer SalesTerritoryAlternateKey) {
    this.SalesTerritoryAlternateKey = SalesTerritoryAlternateKey;
    return this;
  }
  private String SalesTerritoryRegion;
  public String get_SalesTerritoryRegion() {
    return SalesTerritoryRegion;
  }
  public void set_SalesTerritoryRegion(String SalesTerritoryRegion) {
    this.SalesTerritoryRegion = SalesTerritoryRegion;
  }
  public codegen_dimsalesterritory with_SalesTerritoryRegion(String SalesTerritoryRegion) {
    this.SalesTerritoryRegion = SalesTerritoryRegion;
    return this;
  }
  private String SalesTerritoryCountry;
  public String get_SalesTerritoryCountry() {
    return SalesTerritoryCountry;
  }
  public void set_SalesTerritoryCountry(String SalesTerritoryCountry) {
    this.SalesTerritoryCountry = SalesTerritoryCountry;
  }
  public codegen_dimsalesterritory with_SalesTerritoryCountry(String SalesTerritoryCountry) {
    this.SalesTerritoryCountry = SalesTerritoryCountry;
    return this;
  }
  private String SalesTerritoryGroup;
  public String get_SalesTerritoryGroup() {
    return SalesTerritoryGroup;
  }
  public void set_SalesTerritoryGroup(String SalesTerritoryGroup) {
    this.SalesTerritoryGroup = SalesTerritoryGroup;
  }
  public codegen_dimsalesterritory with_SalesTerritoryGroup(String SalesTerritoryGroup) {
    this.SalesTerritoryGroup = SalesTerritoryGroup;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimsalesterritory)) {
      return false;
    }
    codegen_dimsalesterritory that = (codegen_dimsalesterritory) o;
    boolean equal = true;
    equal = equal && (this.SalesTerritoryKey == null ? that.SalesTerritoryKey == null : this.SalesTerritoryKey.equals(that.SalesTerritoryKey));
    equal = equal && (this.SalesTerritoryAlternateKey == null ? that.SalesTerritoryAlternateKey == null : this.SalesTerritoryAlternateKey.equals(that.SalesTerritoryAlternateKey));
    equal = equal && (this.SalesTerritoryRegion == null ? that.SalesTerritoryRegion == null : this.SalesTerritoryRegion.equals(that.SalesTerritoryRegion));
    equal = equal && (this.SalesTerritoryCountry == null ? that.SalesTerritoryCountry == null : this.SalesTerritoryCountry.equals(that.SalesTerritoryCountry));
    equal = equal && (this.SalesTerritoryGroup == null ? that.SalesTerritoryGroup == null : this.SalesTerritoryGroup.equals(that.SalesTerritoryGroup));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimsalesterritory)) {
      return false;
    }
    codegen_dimsalesterritory that = (codegen_dimsalesterritory) o;
    boolean equal = true;
    equal = equal && (this.SalesTerritoryKey == null ? that.SalesTerritoryKey == null : this.SalesTerritoryKey.equals(that.SalesTerritoryKey));
    equal = equal && (this.SalesTerritoryAlternateKey == null ? that.SalesTerritoryAlternateKey == null : this.SalesTerritoryAlternateKey.equals(that.SalesTerritoryAlternateKey));
    equal = equal && (this.SalesTerritoryRegion == null ? that.SalesTerritoryRegion == null : this.SalesTerritoryRegion.equals(that.SalesTerritoryRegion));
    equal = equal && (this.SalesTerritoryCountry == null ? that.SalesTerritoryCountry == null : this.SalesTerritoryCountry.equals(that.SalesTerritoryCountry));
    equal = equal && (this.SalesTerritoryGroup == null ? that.SalesTerritoryGroup == null : this.SalesTerritoryGroup.equals(that.SalesTerritoryGroup));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.SalesTerritoryKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.SalesTerritoryAlternateKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.SalesTerritoryRegion = JdbcWritableBridge.readString(3, __dbResults);
    this.SalesTerritoryCountry = JdbcWritableBridge.readString(4, __dbResults);
    this.SalesTerritoryGroup = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.SalesTerritoryKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.SalesTerritoryAlternateKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.SalesTerritoryRegion = JdbcWritableBridge.readString(3, __dbResults);
    this.SalesTerritoryCountry = JdbcWritableBridge.readString(4, __dbResults);
    this.SalesTerritoryGroup = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(SalesTerritoryKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesTerritoryAlternateKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(SalesTerritoryRegion, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SalesTerritoryCountry, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SalesTerritoryGroup, 5 + __off, 12, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(SalesTerritoryKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesTerritoryAlternateKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(SalesTerritoryRegion, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SalesTerritoryCountry, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SalesTerritoryGroup, 5 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.SalesTerritoryKey = null;
    } else {
    this.SalesTerritoryKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SalesTerritoryAlternateKey = null;
    } else {
    this.SalesTerritoryAlternateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SalesTerritoryRegion = null;
    } else {
    this.SalesTerritoryRegion = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SalesTerritoryCountry = null;
    } else {
    this.SalesTerritoryCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SalesTerritoryGroup = null;
    } else {
    this.SalesTerritoryGroup = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.SalesTerritoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesTerritoryKey);
    }
    if (null == this.SalesTerritoryAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesTerritoryAlternateKey);
    }
    if (null == this.SalesTerritoryRegion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SalesTerritoryRegion);
    }
    if (null == this.SalesTerritoryCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SalesTerritoryCountry);
    }
    if (null == this.SalesTerritoryGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SalesTerritoryGroup);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.SalesTerritoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesTerritoryKey);
    }
    if (null == this.SalesTerritoryAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesTerritoryAlternateKey);
    }
    if (null == this.SalesTerritoryRegion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SalesTerritoryRegion);
    }
    if (null == this.SalesTerritoryCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SalesTerritoryCountry);
    }
    if (null == this.SalesTerritoryGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SalesTerritoryGroup);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryKey==null?"null":"" + SalesTerritoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryAlternateKey==null?"null":"" + SalesTerritoryAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryRegion==null?"null":SalesTerritoryRegion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryCountry==null?"null":SalesTerritoryCountry, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryGroup==null?"null":SalesTerritoryGroup, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryKey==null?"null":"" + SalesTerritoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryAlternateKey==null?"null":"" + SalesTerritoryAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryRegion==null?"null":SalesTerritoryRegion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryCountry==null?"null":SalesTerritoryCountry, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryGroup==null?"null":SalesTerritoryGroup, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesTerritoryKey = null; } else {
      this.SalesTerritoryKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesTerritoryAlternateKey = null; } else {
      this.SalesTerritoryAlternateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SalesTerritoryRegion = null; } else {
      this.SalesTerritoryRegion = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SalesTerritoryCountry = null; } else {
      this.SalesTerritoryCountry = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SalesTerritoryGroup = null; } else {
      this.SalesTerritoryGroup = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesTerritoryKey = null; } else {
      this.SalesTerritoryKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesTerritoryAlternateKey = null; } else {
      this.SalesTerritoryAlternateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SalesTerritoryRegion = null; } else {
      this.SalesTerritoryRegion = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SalesTerritoryCountry = null; } else {
      this.SalesTerritoryCountry = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SalesTerritoryGroup = null; } else {
      this.SalesTerritoryGroup = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_dimsalesterritory o = (codegen_dimsalesterritory) super.clone();
    return o;
  }

  public void clone0(codegen_dimsalesterritory o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("SalesTerritoryKey", this.SalesTerritoryKey);
    __sqoop$field_map.put("SalesTerritoryAlternateKey", this.SalesTerritoryAlternateKey);
    __sqoop$field_map.put("SalesTerritoryRegion", this.SalesTerritoryRegion);
    __sqoop$field_map.put("SalesTerritoryCountry", this.SalesTerritoryCountry);
    __sqoop$field_map.put("SalesTerritoryGroup", this.SalesTerritoryGroup);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("SalesTerritoryKey", this.SalesTerritoryKey);
    __sqoop$field_map.put("SalesTerritoryAlternateKey", this.SalesTerritoryAlternateKey);
    __sqoop$field_map.put("SalesTerritoryRegion", this.SalesTerritoryRegion);
    __sqoop$field_map.put("SalesTerritoryCountry", this.SalesTerritoryCountry);
    __sqoop$field_map.put("SalesTerritoryGroup", this.SalesTerritoryGroup);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
