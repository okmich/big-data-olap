// ORM class for table 'dimdate'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 05 02:04:03 PST 2018
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

public class codegen_dimdate extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("DateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DateKey = (Integer)value;
      }
    });
    setters.put("FullDateAlternateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FullDateAlternateKey = (java.sql.Date)value;
      }
    });
    setters.put("DayNumberOfWeek", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DayNumberOfWeek = (Integer)value;
      }
    });
    setters.put("EnglishDayNameOfWeek", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EnglishDayNameOfWeek = (String)value;
      }
    });
    setters.put("SpanishDayNameOfWeek", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SpanishDayNameOfWeek = (String)value;
      }
    });
    setters.put("FrenchDayNameOfWeek", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FrenchDayNameOfWeek = (String)value;
      }
    });
    setters.put("DayNumberOfMonth", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DayNumberOfMonth = (Integer)value;
      }
    });
    setters.put("DayNumberOfYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DayNumberOfYear = (Integer)value;
      }
    });
    setters.put("WeekNumberOfYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WeekNumberOfYear = (Integer)value;
      }
    });
    setters.put("EnglishMonthName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EnglishMonthName = (String)value;
      }
    });
    setters.put("SpanishMonthName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SpanishMonthName = (String)value;
      }
    });
    setters.put("FrenchMonthName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FrenchMonthName = (String)value;
      }
    });
    setters.put("MonthNumberOfYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MonthNumberOfYear = (Integer)value;
      }
    });
    setters.put("CalendarQuarter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CalendarQuarter = (Integer)value;
      }
    });
    setters.put("CalendarYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CalendarYear = (Integer)value;
      }
    });
    setters.put("CalendarSemester", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CalendarSemester = (Integer)value;
      }
    });
    setters.put("FiscalQuarter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FiscalQuarter = (Integer)value;
      }
    });
    setters.put("FiscalYear", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FiscalYear = (Integer)value;
      }
    });
    setters.put("FiscalSemester", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FiscalSemester = (Integer)value;
      }
    });
  }
  public codegen_dimdate() {
    init0();
  }
  private Integer DateKey;
  public Integer get_DateKey() {
    return DateKey;
  }
  public void set_DateKey(Integer DateKey) {
    this.DateKey = DateKey;
  }
  public codegen_dimdate with_DateKey(Integer DateKey) {
    this.DateKey = DateKey;
    return this;
  }
  private java.sql.Date FullDateAlternateKey;
  public java.sql.Date get_FullDateAlternateKey() {
    return FullDateAlternateKey;
  }
  public void set_FullDateAlternateKey(java.sql.Date FullDateAlternateKey) {
    this.FullDateAlternateKey = FullDateAlternateKey;
  }
  public codegen_dimdate with_FullDateAlternateKey(java.sql.Date FullDateAlternateKey) {
    this.FullDateAlternateKey = FullDateAlternateKey;
    return this;
  }
  private Integer DayNumberOfWeek;
  public Integer get_DayNumberOfWeek() {
    return DayNumberOfWeek;
  }
  public void set_DayNumberOfWeek(Integer DayNumberOfWeek) {
    this.DayNumberOfWeek = DayNumberOfWeek;
  }
  public codegen_dimdate with_DayNumberOfWeek(Integer DayNumberOfWeek) {
    this.DayNumberOfWeek = DayNumberOfWeek;
    return this;
  }
  private String EnglishDayNameOfWeek;
  public String get_EnglishDayNameOfWeek() {
    return EnglishDayNameOfWeek;
  }
  public void set_EnglishDayNameOfWeek(String EnglishDayNameOfWeek) {
    this.EnglishDayNameOfWeek = EnglishDayNameOfWeek;
  }
  public codegen_dimdate with_EnglishDayNameOfWeek(String EnglishDayNameOfWeek) {
    this.EnglishDayNameOfWeek = EnglishDayNameOfWeek;
    return this;
  }
  private String SpanishDayNameOfWeek;
  public String get_SpanishDayNameOfWeek() {
    return SpanishDayNameOfWeek;
  }
  public void set_SpanishDayNameOfWeek(String SpanishDayNameOfWeek) {
    this.SpanishDayNameOfWeek = SpanishDayNameOfWeek;
  }
  public codegen_dimdate with_SpanishDayNameOfWeek(String SpanishDayNameOfWeek) {
    this.SpanishDayNameOfWeek = SpanishDayNameOfWeek;
    return this;
  }
  private String FrenchDayNameOfWeek;
  public String get_FrenchDayNameOfWeek() {
    return FrenchDayNameOfWeek;
  }
  public void set_FrenchDayNameOfWeek(String FrenchDayNameOfWeek) {
    this.FrenchDayNameOfWeek = FrenchDayNameOfWeek;
  }
  public codegen_dimdate with_FrenchDayNameOfWeek(String FrenchDayNameOfWeek) {
    this.FrenchDayNameOfWeek = FrenchDayNameOfWeek;
    return this;
  }
  private Integer DayNumberOfMonth;
  public Integer get_DayNumberOfMonth() {
    return DayNumberOfMonth;
  }
  public void set_DayNumberOfMonth(Integer DayNumberOfMonth) {
    this.DayNumberOfMonth = DayNumberOfMonth;
  }
  public codegen_dimdate with_DayNumberOfMonth(Integer DayNumberOfMonth) {
    this.DayNumberOfMonth = DayNumberOfMonth;
    return this;
  }
  private Integer DayNumberOfYear;
  public Integer get_DayNumberOfYear() {
    return DayNumberOfYear;
  }
  public void set_DayNumberOfYear(Integer DayNumberOfYear) {
    this.DayNumberOfYear = DayNumberOfYear;
  }
  public codegen_dimdate with_DayNumberOfYear(Integer DayNumberOfYear) {
    this.DayNumberOfYear = DayNumberOfYear;
    return this;
  }
  private Integer WeekNumberOfYear;
  public Integer get_WeekNumberOfYear() {
    return WeekNumberOfYear;
  }
  public void set_WeekNumberOfYear(Integer WeekNumberOfYear) {
    this.WeekNumberOfYear = WeekNumberOfYear;
  }
  public codegen_dimdate with_WeekNumberOfYear(Integer WeekNumberOfYear) {
    this.WeekNumberOfYear = WeekNumberOfYear;
    return this;
  }
  private String EnglishMonthName;
  public String get_EnglishMonthName() {
    return EnglishMonthName;
  }
  public void set_EnglishMonthName(String EnglishMonthName) {
    this.EnglishMonthName = EnglishMonthName;
  }
  public codegen_dimdate with_EnglishMonthName(String EnglishMonthName) {
    this.EnglishMonthName = EnglishMonthName;
    return this;
  }
  private String SpanishMonthName;
  public String get_SpanishMonthName() {
    return SpanishMonthName;
  }
  public void set_SpanishMonthName(String SpanishMonthName) {
    this.SpanishMonthName = SpanishMonthName;
  }
  public codegen_dimdate with_SpanishMonthName(String SpanishMonthName) {
    this.SpanishMonthName = SpanishMonthName;
    return this;
  }
  private String FrenchMonthName;
  public String get_FrenchMonthName() {
    return FrenchMonthName;
  }
  public void set_FrenchMonthName(String FrenchMonthName) {
    this.FrenchMonthName = FrenchMonthName;
  }
  public codegen_dimdate with_FrenchMonthName(String FrenchMonthName) {
    this.FrenchMonthName = FrenchMonthName;
    return this;
  }
  private Integer MonthNumberOfYear;
  public Integer get_MonthNumberOfYear() {
    return MonthNumberOfYear;
  }
  public void set_MonthNumberOfYear(Integer MonthNumberOfYear) {
    this.MonthNumberOfYear = MonthNumberOfYear;
  }
  public codegen_dimdate with_MonthNumberOfYear(Integer MonthNumberOfYear) {
    this.MonthNumberOfYear = MonthNumberOfYear;
    return this;
  }
  private Integer CalendarQuarter;
  public Integer get_CalendarQuarter() {
    return CalendarQuarter;
  }
  public void set_CalendarQuarter(Integer CalendarQuarter) {
    this.CalendarQuarter = CalendarQuarter;
  }
  public codegen_dimdate with_CalendarQuarter(Integer CalendarQuarter) {
    this.CalendarQuarter = CalendarQuarter;
    return this;
  }
  private Integer CalendarYear;
  public Integer get_CalendarYear() {
    return CalendarYear;
  }
  public void set_CalendarYear(Integer CalendarYear) {
    this.CalendarYear = CalendarYear;
  }
  public codegen_dimdate with_CalendarYear(Integer CalendarYear) {
    this.CalendarYear = CalendarYear;
    return this;
  }
  private Integer CalendarSemester;
  public Integer get_CalendarSemester() {
    return CalendarSemester;
  }
  public void set_CalendarSemester(Integer CalendarSemester) {
    this.CalendarSemester = CalendarSemester;
  }
  public codegen_dimdate with_CalendarSemester(Integer CalendarSemester) {
    this.CalendarSemester = CalendarSemester;
    return this;
  }
  private Integer FiscalQuarter;
  public Integer get_FiscalQuarter() {
    return FiscalQuarter;
  }
  public void set_FiscalQuarter(Integer FiscalQuarter) {
    this.FiscalQuarter = FiscalQuarter;
  }
  public codegen_dimdate with_FiscalQuarter(Integer FiscalQuarter) {
    this.FiscalQuarter = FiscalQuarter;
    return this;
  }
  private Integer FiscalYear;
  public Integer get_FiscalYear() {
    return FiscalYear;
  }
  public void set_FiscalYear(Integer FiscalYear) {
    this.FiscalYear = FiscalYear;
  }
  public codegen_dimdate with_FiscalYear(Integer FiscalYear) {
    this.FiscalYear = FiscalYear;
    return this;
  }
  private Integer FiscalSemester;
  public Integer get_FiscalSemester() {
    return FiscalSemester;
  }
  public void set_FiscalSemester(Integer FiscalSemester) {
    this.FiscalSemester = FiscalSemester;
  }
  public codegen_dimdate with_FiscalSemester(Integer FiscalSemester) {
    this.FiscalSemester = FiscalSemester;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimdate)) {
      return false;
    }
    codegen_dimdate that = (codegen_dimdate) o;
    boolean equal = true;
    equal = equal && (this.DateKey == null ? that.DateKey == null : this.DateKey.equals(that.DateKey));
    equal = equal && (this.FullDateAlternateKey == null ? that.FullDateAlternateKey == null : this.FullDateAlternateKey.equals(that.FullDateAlternateKey));
    equal = equal && (this.DayNumberOfWeek == null ? that.DayNumberOfWeek == null : this.DayNumberOfWeek.equals(that.DayNumberOfWeek));
    equal = equal && (this.EnglishDayNameOfWeek == null ? that.EnglishDayNameOfWeek == null : this.EnglishDayNameOfWeek.equals(that.EnglishDayNameOfWeek));
    equal = equal && (this.SpanishDayNameOfWeek == null ? that.SpanishDayNameOfWeek == null : this.SpanishDayNameOfWeek.equals(that.SpanishDayNameOfWeek));
    equal = equal && (this.FrenchDayNameOfWeek == null ? that.FrenchDayNameOfWeek == null : this.FrenchDayNameOfWeek.equals(that.FrenchDayNameOfWeek));
    equal = equal && (this.DayNumberOfMonth == null ? that.DayNumberOfMonth == null : this.DayNumberOfMonth.equals(that.DayNumberOfMonth));
    equal = equal && (this.DayNumberOfYear == null ? that.DayNumberOfYear == null : this.DayNumberOfYear.equals(that.DayNumberOfYear));
    equal = equal && (this.WeekNumberOfYear == null ? that.WeekNumberOfYear == null : this.WeekNumberOfYear.equals(that.WeekNumberOfYear));
    equal = equal && (this.EnglishMonthName == null ? that.EnglishMonthName == null : this.EnglishMonthName.equals(that.EnglishMonthName));
    equal = equal && (this.SpanishMonthName == null ? that.SpanishMonthName == null : this.SpanishMonthName.equals(that.SpanishMonthName));
    equal = equal && (this.FrenchMonthName == null ? that.FrenchMonthName == null : this.FrenchMonthName.equals(that.FrenchMonthName));
    equal = equal && (this.MonthNumberOfYear == null ? that.MonthNumberOfYear == null : this.MonthNumberOfYear.equals(that.MonthNumberOfYear));
    equal = equal && (this.CalendarQuarter == null ? that.CalendarQuarter == null : this.CalendarQuarter.equals(that.CalendarQuarter));
    equal = equal && (this.CalendarYear == null ? that.CalendarYear == null : this.CalendarYear.equals(that.CalendarYear));
    equal = equal && (this.CalendarSemester == null ? that.CalendarSemester == null : this.CalendarSemester.equals(that.CalendarSemester));
    equal = equal && (this.FiscalQuarter == null ? that.FiscalQuarter == null : this.FiscalQuarter.equals(that.FiscalQuarter));
    equal = equal && (this.FiscalYear == null ? that.FiscalYear == null : this.FiscalYear.equals(that.FiscalYear));
    equal = equal && (this.FiscalSemester == null ? that.FiscalSemester == null : this.FiscalSemester.equals(that.FiscalSemester));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimdate)) {
      return false;
    }
    codegen_dimdate that = (codegen_dimdate) o;
    boolean equal = true;
    equal = equal && (this.DateKey == null ? that.DateKey == null : this.DateKey.equals(that.DateKey));
    equal = equal && (this.FullDateAlternateKey == null ? that.FullDateAlternateKey == null : this.FullDateAlternateKey.equals(that.FullDateAlternateKey));
    equal = equal && (this.DayNumberOfWeek == null ? that.DayNumberOfWeek == null : this.DayNumberOfWeek.equals(that.DayNumberOfWeek));
    equal = equal && (this.EnglishDayNameOfWeek == null ? that.EnglishDayNameOfWeek == null : this.EnglishDayNameOfWeek.equals(that.EnglishDayNameOfWeek));
    equal = equal && (this.SpanishDayNameOfWeek == null ? that.SpanishDayNameOfWeek == null : this.SpanishDayNameOfWeek.equals(that.SpanishDayNameOfWeek));
    equal = equal && (this.FrenchDayNameOfWeek == null ? that.FrenchDayNameOfWeek == null : this.FrenchDayNameOfWeek.equals(that.FrenchDayNameOfWeek));
    equal = equal && (this.DayNumberOfMonth == null ? that.DayNumberOfMonth == null : this.DayNumberOfMonth.equals(that.DayNumberOfMonth));
    equal = equal && (this.DayNumberOfYear == null ? that.DayNumberOfYear == null : this.DayNumberOfYear.equals(that.DayNumberOfYear));
    equal = equal && (this.WeekNumberOfYear == null ? that.WeekNumberOfYear == null : this.WeekNumberOfYear.equals(that.WeekNumberOfYear));
    equal = equal && (this.EnglishMonthName == null ? that.EnglishMonthName == null : this.EnglishMonthName.equals(that.EnglishMonthName));
    equal = equal && (this.SpanishMonthName == null ? that.SpanishMonthName == null : this.SpanishMonthName.equals(that.SpanishMonthName));
    equal = equal && (this.FrenchMonthName == null ? that.FrenchMonthName == null : this.FrenchMonthName.equals(that.FrenchMonthName));
    equal = equal && (this.MonthNumberOfYear == null ? that.MonthNumberOfYear == null : this.MonthNumberOfYear.equals(that.MonthNumberOfYear));
    equal = equal && (this.CalendarQuarter == null ? that.CalendarQuarter == null : this.CalendarQuarter.equals(that.CalendarQuarter));
    equal = equal && (this.CalendarYear == null ? that.CalendarYear == null : this.CalendarYear.equals(that.CalendarYear));
    equal = equal && (this.CalendarSemester == null ? that.CalendarSemester == null : this.CalendarSemester.equals(that.CalendarSemester));
    equal = equal && (this.FiscalQuarter == null ? that.FiscalQuarter == null : this.FiscalQuarter.equals(that.FiscalQuarter));
    equal = equal && (this.FiscalYear == null ? that.FiscalYear == null : this.FiscalYear.equals(that.FiscalYear));
    equal = equal && (this.FiscalSemester == null ? that.FiscalSemester == null : this.FiscalSemester.equals(that.FiscalSemester));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.DateKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FullDateAlternateKey = JdbcWritableBridge.readDate(2, __dbResults);
    this.DayNumberOfWeek = JdbcWritableBridge.readInteger(3, __dbResults);
    this.EnglishDayNameOfWeek = JdbcWritableBridge.readString(4, __dbResults);
    this.SpanishDayNameOfWeek = JdbcWritableBridge.readString(5, __dbResults);
    this.FrenchDayNameOfWeek = JdbcWritableBridge.readString(6, __dbResults);
    this.DayNumberOfMonth = JdbcWritableBridge.readInteger(7, __dbResults);
    this.DayNumberOfYear = JdbcWritableBridge.readInteger(8, __dbResults);
    this.WeekNumberOfYear = JdbcWritableBridge.readInteger(9, __dbResults);
    this.EnglishMonthName = JdbcWritableBridge.readString(10, __dbResults);
    this.SpanishMonthName = JdbcWritableBridge.readString(11, __dbResults);
    this.FrenchMonthName = JdbcWritableBridge.readString(12, __dbResults);
    this.MonthNumberOfYear = JdbcWritableBridge.readInteger(13, __dbResults);
    this.CalendarQuarter = JdbcWritableBridge.readInteger(14, __dbResults);
    this.CalendarYear = JdbcWritableBridge.readInteger(15, __dbResults);
    this.CalendarSemester = JdbcWritableBridge.readInteger(16, __dbResults);
    this.FiscalQuarter = JdbcWritableBridge.readInteger(17, __dbResults);
    this.FiscalYear = JdbcWritableBridge.readInteger(18, __dbResults);
    this.FiscalSemester = JdbcWritableBridge.readInteger(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.DateKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FullDateAlternateKey = JdbcWritableBridge.readDate(2, __dbResults);
    this.DayNumberOfWeek = JdbcWritableBridge.readInteger(3, __dbResults);
    this.EnglishDayNameOfWeek = JdbcWritableBridge.readString(4, __dbResults);
    this.SpanishDayNameOfWeek = JdbcWritableBridge.readString(5, __dbResults);
    this.FrenchDayNameOfWeek = JdbcWritableBridge.readString(6, __dbResults);
    this.DayNumberOfMonth = JdbcWritableBridge.readInteger(7, __dbResults);
    this.DayNumberOfYear = JdbcWritableBridge.readInteger(8, __dbResults);
    this.WeekNumberOfYear = JdbcWritableBridge.readInteger(9, __dbResults);
    this.EnglishMonthName = JdbcWritableBridge.readString(10, __dbResults);
    this.SpanishMonthName = JdbcWritableBridge.readString(11, __dbResults);
    this.FrenchMonthName = JdbcWritableBridge.readString(12, __dbResults);
    this.MonthNumberOfYear = JdbcWritableBridge.readInteger(13, __dbResults);
    this.CalendarQuarter = JdbcWritableBridge.readInteger(14, __dbResults);
    this.CalendarYear = JdbcWritableBridge.readInteger(15, __dbResults);
    this.CalendarSemester = JdbcWritableBridge.readInteger(16, __dbResults);
    this.FiscalQuarter = JdbcWritableBridge.readInteger(17, __dbResults);
    this.FiscalYear = JdbcWritableBridge.readInteger(18, __dbResults);
    this.FiscalSemester = JdbcWritableBridge.readInteger(19, __dbResults);
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
    JdbcWritableBridge.writeInteger(DateKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(FullDateAlternateKey, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(DayNumberOfWeek, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(EnglishDayNameOfWeek, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishDayNameOfWeek, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchDayNameOfWeek, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(DayNumberOfMonth, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(DayNumberOfYear, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(WeekNumberOfYear, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(EnglishMonthName, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishMonthName, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchMonthName, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(MonthNumberOfYear, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(CalendarQuarter, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(CalendarYear, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(CalendarSemester, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FiscalQuarter, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FiscalYear, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(FiscalSemester, 19 + __off, -6, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(DateKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(FullDateAlternateKey, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(DayNumberOfWeek, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(EnglishDayNameOfWeek, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishDayNameOfWeek, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchDayNameOfWeek, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(DayNumberOfMonth, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(DayNumberOfYear, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(WeekNumberOfYear, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(EnglishMonthName, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishMonthName, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchMonthName, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(MonthNumberOfYear, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(CalendarQuarter, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(CalendarYear, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(CalendarSemester, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FiscalQuarter, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(FiscalYear, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(FiscalSemester, 19 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.DateKey = null;
    } else {
    this.DateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FullDateAlternateKey = null;
    } else {
    this.FullDateAlternateKey = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.DayNumberOfWeek = null;
    } else {
    this.DayNumberOfWeek = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.EnglishDayNameOfWeek = null;
    } else {
    this.EnglishDayNameOfWeek = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SpanishDayNameOfWeek = null;
    } else {
    this.SpanishDayNameOfWeek = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FrenchDayNameOfWeek = null;
    } else {
    this.FrenchDayNameOfWeek = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DayNumberOfMonth = null;
    } else {
    this.DayNumberOfMonth = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DayNumberOfYear = null;
    } else {
    this.DayNumberOfYear = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WeekNumberOfYear = null;
    } else {
    this.WeekNumberOfYear = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.EnglishMonthName = null;
    } else {
    this.EnglishMonthName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SpanishMonthName = null;
    } else {
    this.SpanishMonthName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FrenchMonthName = null;
    } else {
    this.FrenchMonthName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MonthNumberOfYear = null;
    } else {
    this.MonthNumberOfYear = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CalendarQuarter = null;
    } else {
    this.CalendarQuarter = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CalendarYear = null;
    } else {
    this.CalendarYear = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CalendarSemester = null;
    } else {
    this.CalendarSemester = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FiscalQuarter = null;
    } else {
    this.FiscalQuarter = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FiscalYear = null;
    } else {
    this.FiscalYear = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FiscalSemester = null;
    } else {
    this.FiscalSemester = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.DateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DateKey);
    }
    if (null == this.FullDateAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FullDateAlternateKey.getTime());
    }
    if (null == this.DayNumberOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayNumberOfWeek);
    }
    if (null == this.EnglishDayNameOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishDayNameOfWeek);
    }
    if (null == this.SpanishDayNameOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishDayNameOfWeek);
    }
    if (null == this.FrenchDayNameOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchDayNameOfWeek);
    }
    if (null == this.DayNumberOfMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayNumberOfMonth);
    }
    if (null == this.DayNumberOfYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayNumberOfYear);
    }
    if (null == this.WeekNumberOfYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WeekNumberOfYear);
    }
    if (null == this.EnglishMonthName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishMonthName);
    }
    if (null == this.SpanishMonthName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishMonthName);
    }
    if (null == this.FrenchMonthName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchMonthName);
    }
    if (null == this.MonthNumberOfYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.MonthNumberOfYear);
    }
    if (null == this.CalendarQuarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CalendarQuarter);
    }
    if (null == this.CalendarYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CalendarYear);
    }
    if (null == this.CalendarSemester) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CalendarSemester);
    }
    if (null == this.FiscalQuarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FiscalQuarter);
    }
    if (null == this.FiscalYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FiscalYear);
    }
    if (null == this.FiscalSemester) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FiscalSemester);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.DateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DateKey);
    }
    if (null == this.FullDateAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FullDateAlternateKey.getTime());
    }
    if (null == this.DayNumberOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayNumberOfWeek);
    }
    if (null == this.EnglishDayNameOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishDayNameOfWeek);
    }
    if (null == this.SpanishDayNameOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishDayNameOfWeek);
    }
    if (null == this.FrenchDayNameOfWeek) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchDayNameOfWeek);
    }
    if (null == this.DayNumberOfMonth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayNumberOfMonth);
    }
    if (null == this.DayNumberOfYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DayNumberOfYear);
    }
    if (null == this.WeekNumberOfYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WeekNumberOfYear);
    }
    if (null == this.EnglishMonthName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishMonthName);
    }
    if (null == this.SpanishMonthName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishMonthName);
    }
    if (null == this.FrenchMonthName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchMonthName);
    }
    if (null == this.MonthNumberOfYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.MonthNumberOfYear);
    }
    if (null == this.CalendarQuarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CalendarQuarter);
    }
    if (null == this.CalendarYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CalendarYear);
    }
    if (null == this.CalendarSemester) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CalendarSemester);
    }
    if (null == this.FiscalQuarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FiscalQuarter);
    }
    if (null == this.FiscalYear) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FiscalYear);
    }
    if (null == this.FiscalSemester) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.FiscalSemester);
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
    __sb.append(FieldFormatter.escapeAndEnclose(DateKey==null?"null":"" + DateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FullDateAlternateKey==null?"null":"" + FullDateAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayNumberOfWeek==null?"null":"" + DayNumberOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishDayNameOfWeek==null?"null":EnglishDayNameOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishDayNameOfWeek==null?"null":SpanishDayNameOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchDayNameOfWeek==null?"null":FrenchDayNameOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayNumberOfMonth==null?"null":"" + DayNumberOfMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayNumberOfYear==null?"null":"" + DayNumberOfYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WeekNumberOfYear==null?"null":"" + WeekNumberOfYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishMonthName==null?"null":EnglishMonthName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishMonthName==null?"null":SpanishMonthName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchMonthName==null?"null":FrenchMonthName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MonthNumberOfYear==null?"null":"" + MonthNumberOfYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CalendarQuarter==null?"null":"" + CalendarQuarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CalendarYear==null?"null":"" + CalendarYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CalendarSemester==null?"null":"" + CalendarSemester, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FiscalQuarter==null?"null":"" + FiscalQuarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FiscalYear==null?"null":"" + FiscalYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FiscalSemester==null?"null":"" + FiscalSemester, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(DateKey==null?"null":"" + DateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FullDateAlternateKey==null?"null":"" + FullDateAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayNumberOfWeek==null?"null":"" + DayNumberOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishDayNameOfWeek==null?"null":EnglishDayNameOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishDayNameOfWeek==null?"null":SpanishDayNameOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchDayNameOfWeek==null?"null":FrenchDayNameOfWeek, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayNumberOfMonth==null?"null":"" + DayNumberOfMonth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DayNumberOfYear==null?"null":"" + DayNumberOfYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WeekNumberOfYear==null?"null":"" + WeekNumberOfYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishMonthName==null?"null":EnglishMonthName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishMonthName==null?"null":SpanishMonthName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchMonthName==null?"null":FrenchMonthName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MonthNumberOfYear==null?"null":"" + MonthNumberOfYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CalendarQuarter==null?"null":"" + CalendarQuarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CalendarYear==null?"null":"" + CalendarYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CalendarSemester==null?"null":"" + CalendarSemester, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FiscalQuarter==null?"null":"" + FiscalQuarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FiscalYear==null?"null":"" + FiscalYear, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FiscalSemester==null?"null":"" + FiscalSemester, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DateKey = null; } else {
      this.DateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FullDateAlternateKey = null; } else {
      this.FullDateAlternateKey = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayNumberOfWeek = null; } else {
      this.DayNumberOfWeek = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishDayNameOfWeek = null; } else {
      this.EnglishDayNameOfWeek = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishDayNameOfWeek = null; } else {
      this.SpanishDayNameOfWeek = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchDayNameOfWeek = null; } else {
      this.FrenchDayNameOfWeek = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayNumberOfMonth = null; } else {
      this.DayNumberOfMonth = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayNumberOfYear = null; } else {
      this.DayNumberOfYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WeekNumberOfYear = null; } else {
      this.WeekNumberOfYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishMonthName = null; } else {
      this.EnglishMonthName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishMonthName = null; } else {
      this.SpanishMonthName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchMonthName = null; } else {
      this.FrenchMonthName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MonthNumberOfYear = null; } else {
      this.MonthNumberOfYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CalendarQuarter = null; } else {
      this.CalendarQuarter = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CalendarYear = null; } else {
      this.CalendarYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CalendarSemester = null; } else {
      this.CalendarSemester = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FiscalQuarter = null; } else {
      this.FiscalQuarter = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FiscalYear = null; } else {
      this.FiscalYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FiscalSemester = null; } else {
      this.FiscalSemester = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DateKey = null; } else {
      this.DateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FullDateAlternateKey = null; } else {
      this.FullDateAlternateKey = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayNumberOfWeek = null; } else {
      this.DayNumberOfWeek = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishDayNameOfWeek = null; } else {
      this.EnglishDayNameOfWeek = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishDayNameOfWeek = null; } else {
      this.SpanishDayNameOfWeek = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchDayNameOfWeek = null; } else {
      this.FrenchDayNameOfWeek = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayNumberOfMonth = null; } else {
      this.DayNumberOfMonth = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DayNumberOfYear = null; } else {
      this.DayNumberOfYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WeekNumberOfYear = null; } else {
      this.WeekNumberOfYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishMonthName = null; } else {
      this.EnglishMonthName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishMonthName = null; } else {
      this.SpanishMonthName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchMonthName = null; } else {
      this.FrenchMonthName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MonthNumberOfYear = null; } else {
      this.MonthNumberOfYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CalendarQuarter = null; } else {
      this.CalendarQuarter = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CalendarYear = null; } else {
      this.CalendarYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CalendarSemester = null; } else {
      this.CalendarSemester = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FiscalQuarter = null; } else {
      this.FiscalQuarter = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FiscalYear = null; } else {
      this.FiscalYear = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FiscalSemester = null; } else {
      this.FiscalSemester = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_dimdate o = (codegen_dimdate) super.clone();
    o.FullDateAlternateKey = (o.FullDateAlternateKey != null) ? (java.sql.Date) o.FullDateAlternateKey.clone() : null;
    return o;
  }

  public void clone0(codegen_dimdate o) throws CloneNotSupportedException {
    o.FullDateAlternateKey = (o.FullDateAlternateKey != null) ? (java.sql.Date) o.FullDateAlternateKey.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("DateKey", this.DateKey);
    __sqoop$field_map.put("FullDateAlternateKey", this.FullDateAlternateKey);
    __sqoop$field_map.put("DayNumberOfWeek", this.DayNumberOfWeek);
    __sqoop$field_map.put("EnglishDayNameOfWeek", this.EnglishDayNameOfWeek);
    __sqoop$field_map.put("SpanishDayNameOfWeek", this.SpanishDayNameOfWeek);
    __sqoop$field_map.put("FrenchDayNameOfWeek", this.FrenchDayNameOfWeek);
    __sqoop$field_map.put("DayNumberOfMonth", this.DayNumberOfMonth);
    __sqoop$field_map.put("DayNumberOfYear", this.DayNumberOfYear);
    __sqoop$field_map.put("WeekNumberOfYear", this.WeekNumberOfYear);
    __sqoop$field_map.put("EnglishMonthName", this.EnglishMonthName);
    __sqoop$field_map.put("SpanishMonthName", this.SpanishMonthName);
    __sqoop$field_map.put("FrenchMonthName", this.FrenchMonthName);
    __sqoop$field_map.put("MonthNumberOfYear", this.MonthNumberOfYear);
    __sqoop$field_map.put("CalendarQuarter", this.CalendarQuarter);
    __sqoop$field_map.put("CalendarYear", this.CalendarYear);
    __sqoop$field_map.put("CalendarSemester", this.CalendarSemester);
    __sqoop$field_map.put("FiscalQuarter", this.FiscalQuarter);
    __sqoop$field_map.put("FiscalYear", this.FiscalYear);
    __sqoop$field_map.put("FiscalSemester", this.FiscalSemester);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("DateKey", this.DateKey);
    __sqoop$field_map.put("FullDateAlternateKey", this.FullDateAlternateKey);
    __sqoop$field_map.put("DayNumberOfWeek", this.DayNumberOfWeek);
    __sqoop$field_map.put("EnglishDayNameOfWeek", this.EnglishDayNameOfWeek);
    __sqoop$field_map.put("SpanishDayNameOfWeek", this.SpanishDayNameOfWeek);
    __sqoop$field_map.put("FrenchDayNameOfWeek", this.FrenchDayNameOfWeek);
    __sqoop$field_map.put("DayNumberOfMonth", this.DayNumberOfMonth);
    __sqoop$field_map.put("DayNumberOfYear", this.DayNumberOfYear);
    __sqoop$field_map.put("WeekNumberOfYear", this.WeekNumberOfYear);
    __sqoop$field_map.put("EnglishMonthName", this.EnglishMonthName);
    __sqoop$field_map.put("SpanishMonthName", this.SpanishMonthName);
    __sqoop$field_map.put("FrenchMonthName", this.FrenchMonthName);
    __sqoop$field_map.put("MonthNumberOfYear", this.MonthNumberOfYear);
    __sqoop$field_map.put("CalendarQuarter", this.CalendarQuarter);
    __sqoop$field_map.put("CalendarYear", this.CalendarYear);
    __sqoop$field_map.put("CalendarSemester", this.CalendarSemester);
    __sqoop$field_map.put("FiscalQuarter", this.FiscalQuarter);
    __sqoop$field_map.put("FiscalYear", this.FiscalYear);
    __sqoop$field_map.put("FiscalSemester", this.FiscalSemester);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
