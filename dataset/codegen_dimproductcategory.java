// ORM class for table 'dimproductcategory'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 05 02:05:40 PST 2018
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

public class codegen_dimproductcategory extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("ProductCategoryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ProductCategoryKey = (Integer)value;
      }
    });
    setters.put("ProductCategoryAlternateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ProductCategoryAlternateKey = (Integer)value;
      }
    });
    setters.put("EnglishProductCategoryName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EnglishProductCategoryName = (String)value;
      }
    });
    setters.put("SpanishProductCategoryName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SpanishProductCategoryName = (String)value;
      }
    });
    setters.put("FrenchProductCategoryName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FrenchProductCategoryName = (String)value;
      }
    });
  }
  public codegen_dimproductcategory() {
    init0();
  }
  private Integer ProductCategoryKey;
  public Integer get_ProductCategoryKey() {
    return ProductCategoryKey;
  }
  public void set_ProductCategoryKey(Integer ProductCategoryKey) {
    this.ProductCategoryKey = ProductCategoryKey;
  }
  public codegen_dimproductcategory with_ProductCategoryKey(Integer ProductCategoryKey) {
    this.ProductCategoryKey = ProductCategoryKey;
    return this;
  }
  private Integer ProductCategoryAlternateKey;
  public Integer get_ProductCategoryAlternateKey() {
    return ProductCategoryAlternateKey;
  }
  public void set_ProductCategoryAlternateKey(Integer ProductCategoryAlternateKey) {
    this.ProductCategoryAlternateKey = ProductCategoryAlternateKey;
  }
  public codegen_dimproductcategory with_ProductCategoryAlternateKey(Integer ProductCategoryAlternateKey) {
    this.ProductCategoryAlternateKey = ProductCategoryAlternateKey;
    return this;
  }
  private String EnglishProductCategoryName;
  public String get_EnglishProductCategoryName() {
    return EnglishProductCategoryName;
  }
  public void set_EnglishProductCategoryName(String EnglishProductCategoryName) {
    this.EnglishProductCategoryName = EnglishProductCategoryName;
  }
  public codegen_dimproductcategory with_EnglishProductCategoryName(String EnglishProductCategoryName) {
    this.EnglishProductCategoryName = EnglishProductCategoryName;
    return this;
  }
  private String SpanishProductCategoryName;
  public String get_SpanishProductCategoryName() {
    return SpanishProductCategoryName;
  }
  public void set_SpanishProductCategoryName(String SpanishProductCategoryName) {
    this.SpanishProductCategoryName = SpanishProductCategoryName;
  }
  public codegen_dimproductcategory with_SpanishProductCategoryName(String SpanishProductCategoryName) {
    this.SpanishProductCategoryName = SpanishProductCategoryName;
    return this;
  }
  private String FrenchProductCategoryName;
  public String get_FrenchProductCategoryName() {
    return FrenchProductCategoryName;
  }
  public void set_FrenchProductCategoryName(String FrenchProductCategoryName) {
    this.FrenchProductCategoryName = FrenchProductCategoryName;
  }
  public codegen_dimproductcategory with_FrenchProductCategoryName(String FrenchProductCategoryName) {
    this.FrenchProductCategoryName = FrenchProductCategoryName;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimproductcategory)) {
      return false;
    }
    codegen_dimproductcategory that = (codegen_dimproductcategory) o;
    boolean equal = true;
    equal = equal && (this.ProductCategoryKey == null ? that.ProductCategoryKey == null : this.ProductCategoryKey.equals(that.ProductCategoryKey));
    equal = equal && (this.ProductCategoryAlternateKey == null ? that.ProductCategoryAlternateKey == null : this.ProductCategoryAlternateKey.equals(that.ProductCategoryAlternateKey));
    equal = equal && (this.EnglishProductCategoryName == null ? that.EnglishProductCategoryName == null : this.EnglishProductCategoryName.equals(that.EnglishProductCategoryName));
    equal = equal && (this.SpanishProductCategoryName == null ? that.SpanishProductCategoryName == null : this.SpanishProductCategoryName.equals(that.SpanishProductCategoryName));
    equal = equal && (this.FrenchProductCategoryName == null ? that.FrenchProductCategoryName == null : this.FrenchProductCategoryName.equals(that.FrenchProductCategoryName));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimproductcategory)) {
      return false;
    }
    codegen_dimproductcategory that = (codegen_dimproductcategory) o;
    boolean equal = true;
    equal = equal && (this.ProductCategoryKey == null ? that.ProductCategoryKey == null : this.ProductCategoryKey.equals(that.ProductCategoryKey));
    equal = equal && (this.ProductCategoryAlternateKey == null ? that.ProductCategoryAlternateKey == null : this.ProductCategoryAlternateKey.equals(that.ProductCategoryAlternateKey));
    equal = equal && (this.EnglishProductCategoryName == null ? that.EnglishProductCategoryName == null : this.EnglishProductCategoryName.equals(that.EnglishProductCategoryName));
    equal = equal && (this.SpanishProductCategoryName == null ? that.SpanishProductCategoryName == null : this.SpanishProductCategoryName.equals(that.SpanishProductCategoryName));
    equal = equal && (this.FrenchProductCategoryName == null ? that.FrenchProductCategoryName == null : this.FrenchProductCategoryName.equals(that.FrenchProductCategoryName));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ProductCategoryKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.ProductCategoryAlternateKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.EnglishProductCategoryName = JdbcWritableBridge.readString(3, __dbResults);
    this.SpanishProductCategoryName = JdbcWritableBridge.readString(4, __dbResults);
    this.FrenchProductCategoryName = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ProductCategoryKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.ProductCategoryAlternateKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.EnglishProductCategoryName = JdbcWritableBridge.readString(3, __dbResults);
    this.SpanishProductCategoryName = JdbcWritableBridge.readString(4, __dbResults);
    this.FrenchProductCategoryName = JdbcWritableBridge.readString(5, __dbResults);
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
    JdbcWritableBridge.writeInteger(ProductCategoryKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductCategoryAlternateKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(EnglishProductCategoryName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishProductCategoryName, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchProductCategoryName, 5 + __off, 12, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ProductCategoryKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductCategoryAlternateKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(EnglishProductCategoryName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishProductCategoryName, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchProductCategoryName, 5 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ProductCategoryKey = null;
    } else {
    this.ProductCategoryKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ProductCategoryAlternateKey = null;
    } else {
    this.ProductCategoryAlternateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.EnglishProductCategoryName = null;
    } else {
    this.EnglishProductCategoryName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SpanishProductCategoryName = null;
    } else {
    this.SpanishProductCategoryName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FrenchProductCategoryName = null;
    } else {
    this.FrenchProductCategoryName = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ProductCategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductCategoryKey);
    }
    if (null == this.ProductCategoryAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductCategoryAlternateKey);
    }
    if (null == this.EnglishProductCategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishProductCategoryName);
    }
    if (null == this.SpanishProductCategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishProductCategoryName);
    }
    if (null == this.FrenchProductCategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchProductCategoryName);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ProductCategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductCategoryKey);
    }
    if (null == this.ProductCategoryAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductCategoryAlternateKey);
    }
    if (null == this.EnglishProductCategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishProductCategoryName);
    }
    if (null == this.SpanishProductCategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishProductCategoryName);
    }
    if (null == this.FrenchProductCategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchProductCategoryName);
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
    __sb.append(FieldFormatter.escapeAndEnclose(ProductCategoryKey==null?"null":"" + ProductCategoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductCategoryAlternateKey==null?"null":"" + ProductCategoryAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishProductCategoryName==null?"null":EnglishProductCategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishProductCategoryName==null?"null":SpanishProductCategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchProductCategoryName==null?"null":FrenchProductCategoryName, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ProductCategoryKey==null?"null":"" + ProductCategoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductCategoryAlternateKey==null?"null":"" + ProductCategoryAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishProductCategoryName==null?"null":EnglishProductCategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishProductCategoryName==null?"null":SpanishProductCategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchProductCategoryName==null?"null":FrenchProductCategoryName, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductCategoryKey = null; } else {
      this.ProductCategoryKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductCategoryAlternateKey = null; } else {
      this.ProductCategoryAlternateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishProductCategoryName = null; } else {
      this.EnglishProductCategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishProductCategoryName = null; } else {
      this.SpanishProductCategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchProductCategoryName = null; } else {
      this.FrenchProductCategoryName = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductCategoryKey = null; } else {
      this.ProductCategoryKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductCategoryAlternateKey = null; } else {
      this.ProductCategoryAlternateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishProductCategoryName = null; } else {
      this.EnglishProductCategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishProductCategoryName = null; } else {
      this.SpanishProductCategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchProductCategoryName = null; } else {
      this.FrenchProductCategoryName = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_dimproductcategory o = (codegen_dimproductcategory) super.clone();
    return o;
  }

  public void clone0(codegen_dimproductcategory o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ProductCategoryKey", this.ProductCategoryKey);
    __sqoop$field_map.put("ProductCategoryAlternateKey", this.ProductCategoryAlternateKey);
    __sqoop$field_map.put("EnglishProductCategoryName", this.EnglishProductCategoryName);
    __sqoop$field_map.put("SpanishProductCategoryName", this.SpanishProductCategoryName);
    __sqoop$field_map.put("FrenchProductCategoryName", this.FrenchProductCategoryName);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ProductCategoryKey", this.ProductCategoryKey);
    __sqoop$field_map.put("ProductCategoryAlternateKey", this.ProductCategoryAlternateKey);
    __sqoop$field_map.put("EnglishProductCategoryName", this.EnglishProductCategoryName);
    __sqoop$field_map.put("SpanishProductCategoryName", this.SpanishProductCategoryName);
    __sqoop$field_map.put("FrenchProductCategoryName", this.FrenchProductCategoryName);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
