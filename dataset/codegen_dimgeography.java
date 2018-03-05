// ORM class for table 'dimgeography'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 05 02:05:11 PST 2018
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

public class codegen_dimgeography extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("GeographyKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GeographyKey = (Integer)value;
      }
    });
    setters.put("City", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        City = (String)value;
      }
    });
    setters.put("StateProvinceCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        StateProvinceCode = (String)value;
      }
    });
    setters.put("StateProvinceName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        StateProvinceName = (String)value;
      }
    });
    setters.put("CountryRegionCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CountryRegionCode = (String)value;
      }
    });
    setters.put("EnglishCountryRegionName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EnglishCountryRegionName = (String)value;
      }
    });
    setters.put("SpanishCountryRegionName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SpanishCountryRegionName = (String)value;
      }
    });
    setters.put("FrenchCountryRegionName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FrenchCountryRegionName = (String)value;
      }
    });
    setters.put("PostalCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PostalCode = (String)value;
      }
    });
    setters.put("SalesTerritoryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SalesTerritoryKey = (Integer)value;
      }
    });
  }
  public codegen_dimgeography() {
    init0();
  }
  private Integer GeographyKey;
  public Integer get_GeographyKey() {
    return GeographyKey;
  }
  public void set_GeographyKey(Integer GeographyKey) {
    this.GeographyKey = GeographyKey;
  }
  public codegen_dimgeography with_GeographyKey(Integer GeographyKey) {
    this.GeographyKey = GeographyKey;
    return this;
  }
  private String City;
  public String get_City() {
    return City;
  }
  public void set_City(String City) {
    this.City = City;
  }
  public codegen_dimgeography with_City(String City) {
    this.City = City;
    return this;
  }
  private String StateProvinceCode;
  public String get_StateProvinceCode() {
    return StateProvinceCode;
  }
  public void set_StateProvinceCode(String StateProvinceCode) {
    this.StateProvinceCode = StateProvinceCode;
  }
  public codegen_dimgeography with_StateProvinceCode(String StateProvinceCode) {
    this.StateProvinceCode = StateProvinceCode;
    return this;
  }
  private String StateProvinceName;
  public String get_StateProvinceName() {
    return StateProvinceName;
  }
  public void set_StateProvinceName(String StateProvinceName) {
    this.StateProvinceName = StateProvinceName;
  }
  public codegen_dimgeography with_StateProvinceName(String StateProvinceName) {
    this.StateProvinceName = StateProvinceName;
    return this;
  }
  private String CountryRegionCode;
  public String get_CountryRegionCode() {
    return CountryRegionCode;
  }
  public void set_CountryRegionCode(String CountryRegionCode) {
    this.CountryRegionCode = CountryRegionCode;
  }
  public codegen_dimgeography with_CountryRegionCode(String CountryRegionCode) {
    this.CountryRegionCode = CountryRegionCode;
    return this;
  }
  private String EnglishCountryRegionName;
  public String get_EnglishCountryRegionName() {
    return EnglishCountryRegionName;
  }
  public void set_EnglishCountryRegionName(String EnglishCountryRegionName) {
    this.EnglishCountryRegionName = EnglishCountryRegionName;
  }
  public codegen_dimgeography with_EnglishCountryRegionName(String EnglishCountryRegionName) {
    this.EnglishCountryRegionName = EnglishCountryRegionName;
    return this;
  }
  private String SpanishCountryRegionName;
  public String get_SpanishCountryRegionName() {
    return SpanishCountryRegionName;
  }
  public void set_SpanishCountryRegionName(String SpanishCountryRegionName) {
    this.SpanishCountryRegionName = SpanishCountryRegionName;
  }
  public codegen_dimgeography with_SpanishCountryRegionName(String SpanishCountryRegionName) {
    this.SpanishCountryRegionName = SpanishCountryRegionName;
    return this;
  }
  private String FrenchCountryRegionName;
  public String get_FrenchCountryRegionName() {
    return FrenchCountryRegionName;
  }
  public void set_FrenchCountryRegionName(String FrenchCountryRegionName) {
    this.FrenchCountryRegionName = FrenchCountryRegionName;
  }
  public codegen_dimgeography with_FrenchCountryRegionName(String FrenchCountryRegionName) {
    this.FrenchCountryRegionName = FrenchCountryRegionName;
    return this;
  }
  private String PostalCode;
  public String get_PostalCode() {
    return PostalCode;
  }
  public void set_PostalCode(String PostalCode) {
    this.PostalCode = PostalCode;
  }
  public codegen_dimgeography with_PostalCode(String PostalCode) {
    this.PostalCode = PostalCode;
    return this;
  }
  private Integer SalesTerritoryKey;
  public Integer get_SalesTerritoryKey() {
    return SalesTerritoryKey;
  }
  public void set_SalesTerritoryKey(Integer SalesTerritoryKey) {
    this.SalesTerritoryKey = SalesTerritoryKey;
  }
  public codegen_dimgeography with_SalesTerritoryKey(Integer SalesTerritoryKey) {
    this.SalesTerritoryKey = SalesTerritoryKey;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimgeography)) {
      return false;
    }
    codegen_dimgeography that = (codegen_dimgeography) o;
    boolean equal = true;
    equal = equal && (this.GeographyKey == null ? that.GeographyKey == null : this.GeographyKey.equals(that.GeographyKey));
    equal = equal && (this.City == null ? that.City == null : this.City.equals(that.City));
    equal = equal && (this.StateProvinceCode == null ? that.StateProvinceCode == null : this.StateProvinceCode.equals(that.StateProvinceCode));
    equal = equal && (this.StateProvinceName == null ? that.StateProvinceName == null : this.StateProvinceName.equals(that.StateProvinceName));
    equal = equal && (this.CountryRegionCode == null ? that.CountryRegionCode == null : this.CountryRegionCode.equals(that.CountryRegionCode));
    equal = equal && (this.EnglishCountryRegionName == null ? that.EnglishCountryRegionName == null : this.EnglishCountryRegionName.equals(that.EnglishCountryRegionName));
    equal = equal && (this.SpanishCountryRegionName == null ? that.SpanishCountryRegionName == null : this.SpanishCountryRegionName.equals(that.SpanishCountryRegionName));
    equal = equal && (this.FrenchCountryRegionName == null ? that.FrenchCountryRegionName == null : this.FrenchCountryRegionName.equals(that.FrenchCountryRegionName));
    equal = equal && (this.PostalCode == null ? that.PostalCode == null : this.PostalCode.equals(that.PostalCode));
    equal = equal && (this.SalesTerritoryKey == null ? that.SalesTerritoryKey == null : this.SalesTerritoryKey.equals(that.SalesTerritoryKey));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimgeography)) {
      return false;
    }
    codegen_dimgeography that = (codegen_dimgeography) o;
    boolean equal = true;
    equal = equal && (this.GeographyKey == null ? that.GeographyKey == null : this.GeographyKey.equals(that.GeographyKey));
    equal = equal && (this.City == null ? that.City == null : this.City.equals(that.City));
    equal = equal && (this.StateProvinceCode == null ? that.StateProvinceCode == null : this.StateProvinceCode.equals(that.StateProvinceCode));
    equal = equal && (this.StateProvinceName == null ? that.StateProvinceName == null : this.StateProvinceName.equals(that.StateProvinceName));
    equal = equal && (this.CountryRegionCode == null ? that.CountryRegionCode == null : this.CountryRegionCode.equals(that.CountryRegionCode));
    equal = equal && (this.EnglishCountryRegionName == null ? that.EnglishCountryRegionName == null : this.EnglishCountryRegionName.equals(that.EnglishCountryRegionName));
    equal = equal && (this.SpanishCountryRegionName == null ? that.SpanishCountryRegionName == null : this.SpanishCountryRegionName.equals(that.SpanishCountryRegionName));
    equal = equal && (this.FrenchCountryRegionName == null ? that.FrenchCountryRegionName == null : this.FrenchCountryRegionName.equals(that.FrenchCountryRegionName));
    equal = equal && (this.PostalCode == null ? that.PostalCode == null : this.PostalCode.equals(that.PostalCode));
    equal = equal && (this.SalesTerritoryKey == null ? that.SalesTerritoryKey == null : this.SalesTerritoryKey.equals(that.SalesTerritoryKey));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.GeographyKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.City = JdbcWritableBridge.readString(2, __dbResults);
    this.StateProvinceCode = JdbcWritableBridge.readString(3, __dbResults);
    this.StateProvinceName = JdbcWritableBridge.readString(4, __dbResults);
    this.CountryRegionCode = JdbcWritableBridge.readString(5, __dbResults);
    this.EnglishCountryRegionName = JdbcWritableBridge.readString(6, __dbResults);
    this.SpanishCountryRegionName = JdbcWritableBridge.readString(7, __dbResults);
    this.FrenchCountryRegionName = JdbcWritableBridge.readString(8, __dbResults);
    this.PostalCode = JdbcWritableBridge.readString(9, __dbResults);
    this.SalesTerritoryKey = JdbcWritableBridge.readInteger(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.GeographyKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.City = JdbcWritableBridge.readString(2, __dbResults);
    this.StateProvinceCode = JdbcWritableBridge.readString(3, __dbResults);
    this.StateProvinceName = JdbcWritableBridge.readString(4, __dbResults);
    this.CountryRegionCode = JdbcWritableBridge.readString(5, __dbResults);
    this.EnglishCountryRegionName = JdbcWritableBridge.readString(6, __dbResults);
    this.SpanishCountryRegionName = JdbcWritableBridge.readString(7, __dbResults);
    this.FrenchCountryRegionName = JdbcWritableBridge.readString(8, __dbResults);
    this.PostalCode = JdbcWritableBridge.readString(9, __dbResults);
    this.SalesTerritoryKey = JdbcWritableBridge.readInteger(10, __dbResults);
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
    JdbcWritableBridge.writeInteger(GeographyKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(City, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(StateProvinceCode, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(StateProvinceName, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CountryRegionCode, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EnglishCountryRegionName, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishCountryRegionName, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchCountryRegionName, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PostalCode, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesTerritoryKey, 10 + __off, 4, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(GeographyKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(City, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(StateProvinceCode, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(StateProvinceName, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CountryRegionCode, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EnglishCountryRegionName, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishCountryRegionName, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchCountryRegionName, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PostalCode, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesTerritoryKey, 10 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.GeographyKey = null;
    } else {
    this.GeographyKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.City = null;
    } else {
    this.City = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.StateProvinceCode = null;
    } else {
    this.StateProvinceCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.StateProvinceName = null;
    } else {
    this.StateProvinceName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CountryRegionCode = null;
    } else {
    this.CountryRegionCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EnglishCountryRegionName = null;
    } else {
    this.EnglishCountryRegionName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SpanishCountryRegionName = null;
    } else {
    this.SpanishCountryRegionName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FrenchCountryRegionName = null;
    } else {
    this.FrenchCountryRegionName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PostalCode = null;
    } else {
    this.PostalCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SalesTerritoryKey = null;
    } else {
    this.SalesTerritoryKey = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.GeographyKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.GeographyKey);
    }
    if (null == this.City) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, City);
    }
    if (null == this.StateProvinceCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, StateProvinceCode);
    }
    if (null == this.StateProvinceName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, StateProvinceName);
    }
    if (null == this.CountryRegionCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryRegionCode);
    }
    if (null == this.EnglishCountryRegionName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishCountryRegionName);
    }
    if (null == this.SpanishCountryRegionName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishCountryRegionName);
    }
    if (null == this.FrenchCountryRegionName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchCountryRegionName);
    }
    if (null == this.PostalCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PostalCode);
    }
    if (null == this.SalesTerritoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesTerritoryKey);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.GeographyKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.GeographyKey);
    }
    if (null == this.City) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, City);
    }
    if (null == this.StateProvinceCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, StateProvinceCode);
    }
    if (null == this.StateProvinceName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, StateProvinceName);
    }
    if (null == this.CountryRegionCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CountryRegionCode);
    }
    if (null == this.EnglishCountryRegionName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishCountryRegionName);
    }
    if (null == this.SpanishCountryRegionName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishCountryRegionName);
    }
    if (null == this.FrenchCountryRegionName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchCountryRegionName);
    }
    if (null == this.PostalCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PostalCode);
    }
    if (null == this.SalesTerritoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesTerritoryKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(GeographyKey==null?"null":"" + GeographyKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(City==null?"null":City, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StateProvinceCode==null?"null":StateProvinceCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StateProvinceName==null?"null":StateProvinceName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CountryRegionCode==null?"null":CountryRegionCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishCountryRegionName==null?"null":EnglishCountryRegionName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishCountryRegionName==null?"null":SpanishCountryRegionName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchCountryRegionName==null?"null":FrenchCountryRegionName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PostalCode==null?"null":PostalCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryKey==null?"null":"" + SalesTerritoryKey, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(GeographyKey==null?"null":"" + GeographyKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(City==null?"null":City, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StateProvinceCode==null?"null":StateProvinceCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StateProvinceName==null?"null":StateProvinceName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CountryRegionCode==null?"null":CountryRegionCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishCountryRegionName==null?"null":EnglishCountryRegionName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishCountryRegionName==null?"null":SpanishCountryRegionName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchCountryRegionName==null?"null":FrenchCountryRegionName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PostalCode==null?"null":PostalCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryKey==null?"null":"" + SalesTerritoryKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GeographyKey = null; } else {
      this.GeographyKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.City = null; } else {
      this.City = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.StateProvinceCode = null; } else {
      this.StateProvinceCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.StateProvinceName = null; } else {
      this.StateProvinceName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CountryRegionCode = null; } else {
      this.CountryRegionCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishCountryRegionName = null; } else {
      this.EnglishCountryRegionName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishCountryRegionName = null; } else {
      this.SpanishCountryRegionName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchCountryRegionName = null; } else {
      this.FrenchCountryRegionName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PostalCode = null; } else {
      this.PostalCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesTerritoryKey = null; } else {
      this.SalesTerritoryKey = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GeographyKey = null; } else {
      this.GeographyKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.City = null; } else {
      this.City = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.StateProvinceCode = null; } else {
      this.StateProvinceCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.StateProvinceName = null; } else {
      this.StateProvinceName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CountryRegionCode = null; } else {
      this.CountryRegionCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishCountryRegionName = null; } else {
      this.EnglishCountryRegionName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishCountryRegionName = null; } else {
      this.SpanishCountryRegionName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchCountryRegionName = null; } else {
      this.FrenchCountryRegionName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PostalCode = null; } else {
      this.PostalCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesTerritoryKey = null; } else {
      this.SalesTerritoryKey = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_dimgeography o = (codegen_dimgeography) super.clone();
    return o;
  }

  public void clone0(codegen_dimgeography o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("GeographyKey", this.GeographyKey);
    __sqoop$field_map.put("City", this.City);
    __sqoop$field_map.put("StateProvinceCode", this.StateProvinceCode);
    __sqoop$field_map.put("StateProvinceName", this.StateProvinceName);
    __sqoop$field_map.put("CountryRegionCode", this.CountryRegionCode);
    __sqoop$field_map.put("EnglishCountryRegionName", this.EnglishCountryRegionName);
    __sqoop$field_map.put("SpanishCountryRegionName", this.SpanishCountryRegionName);
    __sqoop$field_map.put("FrenchCountryRegionName", this.FrenchCountryRegionName);
    __sqoop$field_map.put("PostalCode", this.PostalCode);
    __sqoop$field_map.put("SalesTerritoryKey", this.SalesTerritoryKey);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("GeographyKey", this.GeographyKey);
    __sqoop$field_map.put("City", this.City);
    __sqoop$field_map.put("StateProvinceCode", this.StateProvinceCode);
    __sqoop$field_map.put("StateProvinceName", this.StateProvinceName);
    __sqoop$field_map.put("CountryRegionCode", this.CountryRegionCode);
    __sqoop$field_map.put("EnglishCountryRegionName", this.EnglishCountryRegionName);
    __sqoop$field_map.put("SpanishCountryRegionName", this.SpanishCountryRegionName);
    __sqoop$field_map.put("FrenchCountryRegionName", this.FrenchCountryRegionName);
    __sqoop$field_map.put("PostalCode", this.PostalCode);
    __sqoop$field_map.put("SalesTerritoryKey", this.SalesTerritoryKey);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
