// ORM class for table 'dimproductsubcategory'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 05 02:06:03 PST 2018
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

public class codegen_dimproductsubcategory extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("ProductSubcategoryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ProductSubcategoryKey = (Integer)value;
      }
    });
    setters.put("ProductSubcategoryAlternateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ProductSubcategoryAlternateKey = (Integer)value;
      }
    });
    setters.put("EnglishProductSubcategoryName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EnglishProductSubcategoryName = (String)value;
      }
    });
    setters.put("SpanishProductSubcategoryName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SpanishProductSubcategoryName = (String)value;
      }
    });
    setters.put("FrenchProductSubcategoryName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FrenchProductSubcategoryName = (String)value;
      }
    });
    setters.put("ProductCategoryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ProductCategoryKey = (Integer)value;
      }
    });
  }
  public codegen_dimproductsubcategory() {
    init0();
  }
  private Integer ProductSubcategoryKey;
  public Integer get_ProductSubcategoryKey() {
    return ProductSubcategoryKey;
  }
  public void set_ProductSubcategoryKey(Integer ProductSubcategoryKey) {
    this.ProductSubcategoryKey = ProductSubcategoryKey;
  }
  public codegen_dimproductsubcategory with_ProductSubcategoryKey(Integer ProductSubcategoryKey) {
    this.ProductSubcategoryKey = ProductSubcategoryKey;
    return this;
  }
  private Integer ProductSubcategoryAlternateKey;
  public Integer get_ProductSubcategoryAlternateKey() {
    return ProductSubcategoryAlternateKey;
  }
  public void set_ProductSubcategoryAlternateKey(Integer ProductSubcategoryAlternateKey) {
    this.ProductSubcategoryAlternateKey = ProductSubcategoryAlternateKey;
  }
  public codegen_dimproductsubcategory with_ProductSubcategoryAlternateKey(Integer ProductSubcategoryAlternateKey) {
    this.ProductSubcategoryAlternateKey = ProductSubcategoryAlternateKey;
    return this;
  }
  private String EnglishProductSubcategoryName;
  public String get_EnglishProductSubcategoryName() {
    return EnglishProductSubcategoryName;
  }
  public void set_EnglishProductSubcategoryName(String EnglishProductSubcategoryName) {
    this.EnglishProductSubcategoryName = EnglishProductSubcategoryName;
  }
  public codegen_dimproductsubcategory with_EnglishProductSubcategoryName(String EnglishProductSubcategoryName) {
    this.EnglishProductSubcategoryName = EnglishProductSubcategoryName;
    return this;
  }
  private String SpanishProductSubcategoryName;
  public String get_SpanishProductSubcategoryName() {
    return SpanishProductSubcategoryName;
  }
  public void set_SpanishProductSubcategoryName(String SpanishProductSubcategoryName) {
    this.SpanishProductSubcategoryName = SpanishProductSubcategoryName;
  }
  public codegen_dimproductsubcategory with_SpanishProductSubcategoryName(String SpanishProductSubcategoryName) {
    this.SpanishProductSubcategoryName = SpanishProductSubcategoryName;
    return this;
  }
  private String FrenchProductSubcategoryName;
  public String get_FrenchProductSubcategoryName() {
    return FrenchProductSubcategoryName;
  }
  public void set_FrenchProductSubcategoryName(String FrenchProductSubcategoryName) {
    this.FrenchProductSubcategoryName = FrenchProductSubcategoryName;
  }
  public codegen_dimproductsubcategory with_FrenchProductSubcategoryName(String FrenchProductSubcategoryName) {
    this.FrenchProductSubcategoryName = FrenchProductSubcategoryName;
    return this;
  }
  private Integer ProductCategoryKey;
  public Integer get_ProductCategoryKey() {
    return ProductCategoryKey;
  }
  public void set_ProductCategoryKey(Integer ProductCategoryKey) {
    this.ProductCategoryKey = ProductCategoryKey;
  }
  public codegen_dimproductsubcategory with_ProductCategoryKey(Integer ProductCategoryKey) {
    this.ProductCategoryKey = ProductCategoryKey;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimproductsubcategory)) {
      return false;
    }
    codegen_dimproductsubcategory that = (codegen_dimproductsubcategory) o;
    boolean equal = true;
    equal = equal && (this.ProductSubcategoryKey == null ? that.ProductSubcategoryKey == null : this.ProductSubcategoryKey.equals(that.ProductSubcategoryKey));
    equal = equal && (this.ProductSubcategoryAlternateKey == null ? that.ProductSubcategoryAlternateKey == null : this.ProductSubcategoryAlternateKey.equals(that.ProductSubcategoryAlternateKey));
    equal = equal && (this.EnglishProductSubcategoryName == null ? that.EnglishProductSubcategoryName == null : this.EnglishProductSubcategoryName.equals(that.EnglishProductSubcategoryName));
    equal = equal && (this.SpanishProductSubcategoryName == null ? that.SpanishProductSubcategoryName == null : this.SpanishProductSubcategoryName.equals(that.SpanishProductSubcategoryName));
    equal = equal && (this.FrenchProductSubcategoryName == null ? that.FrenchProductSubcategoryName == null : this.FrenchProductSubcategoryName.equals(that.FrenchProductSubcategoryName));
    equal = equal && (this.ProductCategoryKey == null ? that.ProductCategoryKey == null : this.ProductCategoryKey.equals(that.ProductCategoryKey));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimproductsubcategory)) {
      return false;
    }
    codegen_dimproductsubcategory that = (codegen_dimproductsubcategory) o;
    boolean equal = true;
    equal = equal && (this.ProductSubcategoryKey == null ? that.ProductSubcategoryKey == null : this.ProductSubcategoryKey.equals(that.ProductSubcategoryKey));
    equal = equal && (this.ProductSubcategoryAlternateKey == null ? that.ProductSubcategoryAlternateKey == null : this.ProductSubcategoryAlternateKey.equals(that.ProductSubcategoryAlternateKey));
    equal = equal && (this.EnglishProductSubcategoryName == null ? that.EnglishProductSubcategoryName == null : this.EnglishProductSubcategoryName.equals(that.EnglishProductSubcategoryName));
    equal = equal && (this.SpanishProductSubcategoryName == null ? that.SpanishProductSubcategoryName == null : this.SpanishProductSubcategoryName.equals(that.SpanishProductSubcategoryName));
    equal = equal && (this.FrenchProductSubcategoryName == null ? that.FrenchProductSubcategoryName == null : this.FrenchProductSubcategoryName.equals(that.FrenchProductSubcategoryName));
    equal = equal && (this.ProductCategoryKey == null ? that.ProductCategoryKey == null : this.ProductCategoryKey.equals(that.ProductCategoryKey));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ProductSubcategoryKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.ProductSubcategoryAlternateKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.EnglishProductSubcategoryName = JdbcWritableBridge.readString(3, __dbResults);
    this.SpanishProductSubcategoryName = JdbcWritableBridge.readString(4, __dbResults);
    this.FrenchProductSubcategoryName = JdbcWritableBridge.readString(5, __dbResults);
    this.ProductCategoryKey = JdbcWritableBridge.readInteger(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ProductSubcategoryKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.ProductSubcategoryAlternateKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.EnglishProductSubcategoryName = JdbcWritableBridge.readString(3, __dbResults);
    this.SpanishProductSubcategoryName = JdbcWritableBridge.readString(4, __dbResults);
    this.FrenchProductSubcategoryName = JdbcWritableBridge.readString(5, __dbResults);
    this.ProductCategoryKey = JdbcWritableBridge.readInteger(6, __dbResults);
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
    JdbcWritableBridge.writeInteger(ProductSubcategoryKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductSubcategoryAlternateKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(EnglishProductSubcategoryName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishProductSubcategoryName, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchProductSubcategoryName, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductCategoryKey, 6 + __off, 4, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ProductSubcategoryKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductSubcategoryAlternateKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(EnglishProductSubcategoryName, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishProductSubcategoryName, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchProductSubcategoryName, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductCategoryKey, 6 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ProductSubcategoryKey = null;
    } else {
    this.ProductSubcategoryKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ProductSubcategoryAlternateKey = null;
    } else {
    this.ProductSubcategoryAlternateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.EnglishProductSubcategoryName = null;
    } else {
    this.EnglishProductSubcategoryName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SpanishProductSubcategoryName = null;
    } else {
    this.SpanishProductSubcategoryName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FrenchProductSubcategoryName = null;
    } else {
    this.FrenchProductSubcategoryName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProductCategoryKey = null;
    } else {
    this.ProductCategoryKey = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ProductSubcategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductSubcategoryKey);
    }
    if (null == this.ProductSubcategoryAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductSubcategoryAlternateKey);
    }
    if (null == this.EnglishProductSubcategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishProductSubcategoryName);
    }
    if (null == this.SpanishProductSubcategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishProductSubcategoryName);
    }
    if (null == this.FrenchProductSubcategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchProductSubcategoryName);
    }
    if (null == this.ProductCategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductCategoryKey);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ProductSubcategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductSubcategoryKey);
    }
    if (null == this.ProductSubcategoryAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductSubcategoryAlternateKey);
    }
    if (null == this.EnglishProductSubcategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishProductSubcategoryName);
    }
    if (null == this.SpanishProductSubcategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishProductSubcategoryName);
    }
    if (null == this.FrenchProductSubcategoryName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchProductSubcategoryName);
    }
    if (null == this.ProductCategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductCategoryKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(ProductSubcategoryKey==null?"null":"" + ProductSubcategoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductSubcategoryAlternateKey==null?"null":"" + ProductSubcategoryAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishProductSubcategoryName==null?"null":EnglishProductSubcategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishProductSubcategoryName==null?"null":SpanishProductSubcategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchProductSubcategoryName==null?"null":FrenchProductSubcategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductCategoryKey==null?"null":"" + ProductCategoryKey, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ProductSubcategoryKey==null?"null":"" + ProductSubcategoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductSubcategoryAlternateKey==null?"null":"" + ProductSubcategoryAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishProductSubcategoryName==null?"null":EnglishProductSubcategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishProductSubcategoryName==null?"null":SpanishProductSubcategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchProductSubcategoryName==null?"null":FrenchProductSubcategoryName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductCategoryKey==null?"null":"" + ProductCategoryKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductSubcategoryKey = null; } else {
      this.ProductSubcategoryKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductSubcategoryAlternateKey = null; } else {
      this.ProductSubcategoryAlternateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishProductSubcategoryName = null; } else {
      this.EnglishProductSubcategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishProductSubcategoryName = null; } else {
      this.SpanishProductSubcategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchProductSubcategoryName = null; } else {
      this.FrenchProductSubcategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductCategoryKey = null; } else {
      this.ProductCategoryKey = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductSubcategoryKey = null; } else {
      this.ProductSubcategoryKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductSubcategoryAlternateKey = null; } else {
      this.ProductSubcategoryAlternateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishProductSubcategoryName = null; } else {
      this.EnglishProductSubcategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishProductSubcategoryName = null; } else {
      this.SpanishProductSubcategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchProductSubcategoryName = null; } else {
      this.FrenchProductSubcategoryName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductCategoryKey = null; } else {
      this.ProductCategoryKey = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_dimproductsubcategory o = (codegen_dimproductsubcategory) super.clone();
    return o;
  }

  public void clone0(codegen_dimproductsubcategory o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ProductSubcategoryKey", this.ProductSubcategoryKey);
    __sqoop$field_map.put("ProductSubcategoryAlternateKey", this.ProductSubcategoryAlternateKey);
    __sqoop$field_map.put("EnglishProductSubcategoryName", this.EnglishProductSubcategoryName);
    __sqoop$field_map.put("SpanishProductSubcategoryName", this.SpanishProductSubcategoryName);
    __sqoop$field_map.put("FrenchProductSubcategoryName", this.FrenchProductSubcategoryName);
    __sqoop$field_map.put("ProductCategoryKey", this.ProductCategoryKey);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ProductSubcategoryKey", this.ProductSubcategoryKey);
    __sqoop$field_map.put("ProductSubcategoryAlternateKey", this.ProductSubcategoryAlternateKey);
    __sqoop$field_map.put("EnglishProductSubcategoryName", this.EnglishProductSubcategoryName);
    __sqoop$field_map.put("SpanishProductSubcategoryName", this.SpanishProductSubcategoryName);
    __sqoop$field_map.put("FrenchProductSubcategoryName", this.FrenchProductSubcategoryName);
    __sqoop$field_map.put("ProductCategoryKey", this.ProductCategoryKey);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
