// ORM class for table 'dimcurrency'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 05 02:03:41 PST 2018
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

public class codegen_dimcurrency extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("CurrencyKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CurrencyKey = (Integer)value;
      }
    });
    setters.put("CurrencyAlternateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CurrencyAlternateKey = (String)value;
      }
    });
    setters.put("CurrencyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CurrencyName = (String)value;
      }
    });
  }
  public codegen_dimcurrency() {
    init0();
  }
  private Integer CurrencyKey;
  public Integer get_CurrencyKey() {
    return CurrencyKey;
  }
  public void set_CurrencyKey(Integer CurrencyKey) {
    this.CurrencyKey = CurrencyKey;
  }
  public codegen_dimcurrency with_CurrencyKey(Integer CurrencyKey) {
    this.CurrencyKey = CurrencyKey;
    return this;
  }
  private String CurrencyAlternateKey;
  public String get_CurrencyAlternateKey() {
    return CurrencyAlternateKey;
  }
  public void set_CurrencyAlternateKey(String CurrencyAlternateKey) {
    this.CurrencyAlternateKey = CurrencyAlternateKey;
  }
  public codegen_dimcurrency with_CurrencyAlternateKey(String CurrencyAlternateKey) {
    this.CurrencyAlternateKey = CurrencyAlternateKey;
    return this;
  }
  private String CurrencyName;
  public String get_CurrencyName() {
    return CurrencyName;
  }
  public void set_CurrencyName(String CurrencyName) {
    this.CurrencyName = CurrencyName;
  }
  public codegen_dimcurrency with_CurrencyName(String CurrencyName) {
    this.CurrencyName = CurrencyName;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimcurrency)) {
      return false;
    }
    codegen_dimcurrency that = (codegen_dimcurrency) o;
    boolean equal = true;
    equal = equal && (this.CurrencyKey == null ? that.CurrencyKey == null : this.CurrencyKey.equals(that.CurrencyKey));
    equal = equal && (this.CurrencyAlternateKey == null ? that.CurrencyAlternateKey == null : this.CurrencyAlternateKey.equals(that.CurrencyAlternateKey));
    equal = equal && (this.CurrencyName == null ? that.CurrencyName == null : this.CurrencyName.equals(that.CurrencyName));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimcurrency)) {
      return false;
    }
    codegen_dimcurrency that = (codegen_dimcurrency) o;
    boolean equal = true;
    equal = equal && (this.CurrencyKey == null ? that.CurrencyKey == null : this.CurrencyKey.equals(that.CurrencyKey));
    equal = equal && (this.CurrencyAlternateKey == null ? that.CurrencyAlternateKey == null : this.CurrencyAlternateKey.equals(that.CurrencyAlternateKey));
    equal = equal && (this.CurrencyName == null ? that.CurrencyName == null : this.CurrencyName.equals(that.CurrencyName));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CurrencyKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.CurrencyAlternateKey = JdbcWritableBridge.readString(2, __dbResults);
    this.CurrencyName = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CurrencyKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.CurrencyAlternateKey = JdbcWritableBridge.readString(2, __dbResults);
    this.CurrencyName = JdbcWritableBridge.readString(3, __dbResults);
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
    JdbcWritableBridge.writeInteger(CurrencyKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CurrencyAlternateKey, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(CurrencyName, 3 + __off, 12, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(CurrencyKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CurrencyAlternateKey, 2 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(CurrencyName, 3 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CurrencyKey = null;
    } else {
    this.CurrencyKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CurrencyAlternateKey = null;
    } else {
    this.CurrencyAlternateKey = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CurrencyName = null;
    } else {
    this.CurrencyName = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CurrencyKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CurrencyKey);
    }
    if (null == this.CurrencyAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CurrencyAlternateKey);
    }
    if (null == this.CurrencyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CurrencyName);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CurrencyKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CurrencyKey);
    }
    if (null == this.CurrencyAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CurrencyAlternateKey);
    }
    if (null == this.CurrencyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CurrencyName);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyKey==null?"null":"" + CurrencyKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyAlternateKey==null?"null":CurrencyAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyName==null?"null":CurrencyName, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyKey==null?"null":"" + CurrencyKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyAlternateKey==null?"null":CurrencyAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyName==null?"null":CurrencyName, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CurrencyKey = null; } else {
      this.CurrencyKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CurrencyAlternateKey = null; } else {
      this.CurrencyAlternateKey = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CurrencyName = null; } else {
      this.CurrencyName = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CurrencyKey = null; } else {
      this.CurrencyKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CurrencyAlternateKey = null; } else {
      this.CurrencyAlternateKey = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CurrencyName = null; } else {
      this.CurrencyName = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_dimcurrency o = (codegen_dimcurrency) super.clone();
    return o;
  }

  public void clone0(codegen_dimcurrency o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("CurrencyKey", this.CurrencyKey);
    __sqoop$field_map.put("CurrencyAlternateKey", this.CurrencyAlternateKey);
    __sqoop$field_map.put("CurrencyName", this.CurrencyName);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CurrencyKey", this.CurrencyKey);
    __sqoop$field_map.put("CurrencyAlternateKey", this.CurrencyAlternateKey);
    __sqoop$field_map.put("CurrencyName", this.CurrencyName);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
