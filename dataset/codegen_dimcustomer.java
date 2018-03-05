// ORM class for table 'dimcustomer'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 05 02:02:17 PST 2018
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

public class codegen_dimcustomer extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("CustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CustomerKey = (Integer)value;
      }
    });
    setters.put("GeographyKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GeographyKey = (Integer)value;
      }
    });
    setters.put("CustomerAlternateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CustomerAlternateKey = (String)value;
      }
    });
    setters.put("Title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Title = (String)value;
      }
    });
    setters.put("FirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FirstName = (String)value;
      }
    });
    setters.put("MiddleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MiddleName = (String)value;
      }
    });
    setters.put("LastName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LastName = (String)value;
      }
    });
    setters.put("NameStyle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NameStyle = (Boolean)value;
      }
    });
    setters.put("BirthDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BirthDate = (java.sql.Date)value;
      }
    });
    setters.put("MaritalStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MaritalStatus = (String)value;
      }
    });
    setters.put("Suffix", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Suffix = (String)value;
      }
    });
    setters.put("Gender", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Gender = (String)value;
      }
    });
    setters.put("EmailAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EmailAddress = (String)value;
      }
    });
    setters.put("YearlyIncome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        YearlyIncome = (java.math.BigDecimal)value;
      }
    });
    setters.put("TotalChildren", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TotalChildren = (Integer)value;
      }
    });
    setters.put("NumberChildrenAtHome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NumberChildrenAtHome = (Integer)value;
      }
    });
    setters.put("EnglishEducation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EnglishEducation = (String)value;
      }
    });
    setters.put("SpanishEducation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SpanishEducation = (String)value;
      }
    });
    setters.put("FrenchEducation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FrenchEducation = (String)value;
      }
    });
    setters.put("EnglishOccupation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EnglishOccupation = (String)value;
      }
    });
    setters.put("SpanishOccupation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SpanishOccupation = (String)value;
      }
    });
    setters.put("FrenchOccupation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FrenchOccupation = (String)value;
      }
    });
    setters.put("HouseOwnerFlag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HouseOwnerFlag = (String)value;
      }
    });
    setters.put("NumberCarsOwned", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NumberCarsOwned = (Integer)value;
      }
    });
    setters.put("AddressLine1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AddressLine1 = (String)value;
      }
    });
    setters.put("AddressLine2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AddressLine2 = (String)value;
      }
    });
    setters.put("Phone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Phone = (String)value;
      }
    });
    setters.put("DateFirstPurchase", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DateFirstPurchase = (java.sql.Date)value;
      }
    });
    setters.put("CommuteDistance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CommuteDistance = (String)value;
      }
    });
  }
  public codegen_dimcustomer() {
    init0();
  }
  private Integer CustomerKey;
  public Integer get_CustomerKey() {
    return CustomerKey;
  }
  public void set_CustomerKey(Integer CustomerKey) {
    this.CustomerKey = CustomerKey;
  }
  public codegen_dimcustomer with_CustomerKey(Integer CustomerKey) {
    this.CustomerKey = CustomerKey;
    return this;
  }
  private Integer GeographyKey;
  public Integer get_GeographyKey() {
    return GeographyKey;
  }
  public void set_GeographyKey(Integer GeographyKey) {
    this.GeographyKey = GeographyKey;
  }
  public codegen_dimcustomer with_GeographyKey(Integer GeographyKey) {
    this.GeographyKey = GeographyKey;
    return this;
  }
  private String CustomerAlternateKey;
  public String get_CustomerAlternateKey() {
    return CustomerAlternateKey;
  }
  public void set_CustomerAlternateKey(String CustomerAlternateKey) {
    this.CustomerAlternateKey = CustomerAlternateKey;
  }
  public codegen_dimcustomer with_CustomerAlternateKey(String CustomerAlternateKey) {
    this.CustomerAlternateKey = CustomerAlternateKey;
    return this;
  }
  private String Title;
  public String get_Title() {
    return Title;
  }
  public void set_Title(String Title) {
    this.Title = Title;
  }
  public codegen_dimcustomer with_Title(String Title) {
    this.Title = Title;
    return this;
  }
  private String FirstName;
  public String get_FirstName() {
    return FirstName;
  }
  public void set_FirstName(String FirstName) {
    this.FirstName = FirstName;
  }
  public codegen_dimcustomer with_FirstName(String FirstName) {
    this.FirstName = FirstName;
    return this;
  }
  private String MiddleName;
  public String get_MiddleName() {
    return MiddleName;
  }
  public void set_MiddleName(String MiddleName) {
    this.MiddleName = MiddleName;
  }
  public codegen_dimcustomer with_MiddleName(String MiddleName) {
    this.MiddleName = MiddleName;
    return this;
  }
  private String LastName;
  public String get_LastName() {
    return LastName;
  }
  public void set_LastName(String LastName) {
    this.LastName = LastName;
  }
  public codegen_dimcustomer with_LastName(String LastName) {
    this.LastName = LastName;
    return this;
  }
  private Boolean NameStyle;
  public Boolean get_NameStyle() {
    return NameStyle;
  }
  public void set_NameStyle(Boolean NameStyle) {
    this.NameStyle = NameStyle;
  }
  public codegen_dimcustomer with_NameStyle(Boolean NameStyle) {
    this.NameStyle = NameStyle;
    return this;
  }
  private java.sql.Date BirthDate;
  public java.sql.Date get_BirthDate() {
    return BirthDate;
  }
  public void set_BirthDate(java.sql.Date BirthDate) {
    this.BirthDate = BirthDate;
  }
  public codegen_dimcustomer with_BirthDate(java.sql.Date BirthDate) {
    this.BirthDate = BirthDate;
    return this;
  }
  private String MaritalStatus;
  public String get_MaritalStatus() {
    return MaritalStatus;
  }
  public void set_MaritalStatus(String MaritalStatus) {
    this.MaritalStatus = MaritalStatus;
  }
  public codegen_dimcustomer with_MaritalStatus(String MaritalStatus) {
    this.MaritalStatus = MaritalStatus;
    return this;
  }
  private String Suffix;
  public String get_Suffix() {
    return Suffix;
  }
  public void set_Suffix(String Suffix) {
    this.Suffix = Suffix;
  }
  public codegen_dimcustomer with_Suffix(String Suffix) {
    this.Suffix = Suffix;
    return this;
  }
  private String Gender;
  public String get_Gender() {
    return Gender;
  }
  public void set_Gender(String Gender) {
    this.Gender = Gender;
  }
  public codegen_dimcustomer with_Gender(String Gender) {
    this.Gender = Gender;
    return this;
  }
  private String EmailAddress;
  public String get_EmailAddress() {
    return EmailAddress;
  }
  public void set_EmailAddress(String EmailAddress) {
    this.EmailAddress = EmailAddress;
  }
  public codegen_dimcustomer with_EmailAddress(String EmailAddress) {
    this.EmailAddress = EmailAddress;
    return this;
  }
  private java.math.BigDecimal YearlyIncome;
  public java.math.BigDecimal get_YearlyIncome() {
    return YearlyIncome;
  }
  public void set_YearlyIncome(java.math.BigDecimal YearlyIncome) {
    this.YearlyIncome = YearlyIncome;
  }
  public codegen_dimcustomer with_YearlyIncome(java.math.BigDecimal YearlyIncome) {
    this.YearlyIncome = YearlyIncome;
    return this;
  }
  private Integer TotalChildren;
  public Integer get_TotalChildren() {
    return TotalChildren;
  }
  public void set_TotalChildren(Integer TotalChildren) {
    this.TotalChildren = TotalChildren;
  }
  public codegen_dimcustomer with_TotalChildren(Integer TotalChildren) {
    this.TotalChildren = TotalChildren;
    return this;
  }
  private Integer NumberChildrenAtHome;
  public Integer get_NumberChildrenAtHome() {
    return NumberChildrenAtHome;
  }
  public void set_NumberChildrenAtHome(Integer NumberChildrenAtHome) {
    this.NumberChildrenAtHome = NumberChildrenAtHome;
  }
  public codegen_dimcustomer with_NumberChildrenAtHome(Integer NumberChildrenAtHome) {
    this.NumberChildrenAtHome = NumberChildrenAtHome;
    return this;
  }
  private String EnglishEducation;
  public String get_EnglishEducation() {
    return EnglishEducation;
  }
  public void set_EnglishEducation(String EnglishEducation) {
    this.EnglishEducation = EnglishEducation;
  }
  public codegen_dimcustomer with_EnglishEducation(String EnglishEducation) {
    this.EnglishEducation = EnglishEducation;
    return this;
  }
  private String SpanishEducation;
  public String get_SpanishEducation() {
    return SpanishEducation;
  }
  public void set_SpanishEducation(String SpanishEducation) {
    this.SpanishEducation = SpanishEducation;
  }
  public codegen_dimcustomer with_SpanishEducation(String SpanishEducation) {
    this.SpanishEducation = SpanishEducation;
    return this;
  }
  private String FrenchEducation;
  public String get_FrenchEducation() {
    return FrenchEducation;
  }
  public void set_FrenchEducation(String FrenchEducation) {
    this.FrenchEducation = FrenchEducation;
  }
  public codegen_dimcustomer with_FrenchEducation(String FrenchEducation) {
    this.FrenchEducation = FrenchEducation;
    return this;
  }
  private String EnglishOccupation;
  public String get_EnglishOccupation() {
    return EnglishOccupation;
  }
  public void set_EnglishOccupation(String EnglishOccupation) {
    this.EnglishOccupation = EnglishOccupation;
  }
  public codegen_dimcustomer with_EnglishOccupation(String EnglishOccupation) {
    this.EnglishOccupation = EnglishOccupation;
    return this;
  }
  private String SpanishOccupation;
  public String get_SpanishOccupation() {
    return SpanishOccupation;
  }
  public void set_SpanishOccupation(String SpanishOccupation) {
    this.SpanishOccupation = SpanishOccupation;
  }
  public codegen_dimcustomer with_SpanishOccupation(String SpanishOccupation) {
    this.SpanishOccupation = SpanishOccupation;
    return this;
  }
  private String FrenchOccupation;
  public String get_FrenchOccupation() {
    return FrenchOccupation;
  }
  public void set_FrenchOccupation(String FrenchOccupation) {
    this.FrenchOccupation = FrenchOccupation;
  }
  public codegen_dimcustomer with_FrenchOccupation(String FrenchOccupation) {
    this.FrenchOccupation = FrenchOccupation;
    return this;
  }
  private String HouseOwnerFlag;
  public String get_HouseOwnerFlag() {
    return HouseOwnerFlag;
  }
  public void set_HouseOwnerFlag(String HouseOwnerFlag) {
    this.HouseOwnerFlag = HouseOwnerFlag;
  }
  public codegen_dimcustomer with_HouseOwnerFlag(String HouseOwnerFlag) {
    this.HouseOwnerFlag = HouseOwnerFlag;
    return this;
  }
  private Integer NumberCarsOwned;
  public Integer get_NumberCarsOwned() {
    return NumberCarsOwned;
  }
  public void set_NumberCarsOwned(Integer NumberCarsOwned) {
    this.NumberCarsOwned = NumberCarsOwned;
  }
  public codegen_dimcustomer with_NumberCarsOwned(Integer NumberCarsOwned) {
    this.NumberCarsOwned = NumberCarsOwned;
    return this;
  }
  private String AddressLine1;
  public String get_AddressLine1() {
    return AddressLine1;
  }
  public void set_AddressLine1(String AddressLine1) {
    this.AddressLine1 = AddressLine1;
  }
  public codegen_dimcustomer with_AddressLine1(String AddressLine1) {
    this.AddressLine1 = AddressLine1;
    return this;
  }
  private String AddressLine2;
  public String get_AddressLine2() {
    return AddressLine2;
  }
  public void set_AddressLine2(String AddressLine2) {
    this.AddressLine2 = AddressLine2;
  }
  public codegen_dimcustomer with_AddressLine2(String AddressLine2) {
    this.AddressLine2 = AddressLine2;
    return this;
  }
  private String Phone;
  public String get_Phone() {
    return Phone;
  }
  public void set_Phone(String Phone) {
    this.Phone = Phone;
  }
  public codegen_dimcustomer with_Phone(String Phone) {
    this.Phone = Phone;
    return this;
  }
  private java.sql.Date DateFirstPurchase;
  public java.sql.Date get_DateFirstPurchase() {
    return DateFirstPurchase;
  }
  public void set_DateFirstPurchase(java.sql.Date DateFirstPurchase) {
    this.DateFirstPurchase = DateFirstPurchase;
  }
  public codegen_dimcustomer with_DateFirstPurchase(java.sql.Date DateFirstPurchase) {
    this.DateFirstPurchase = DateFirstPurchase;
    return this;
  }
  private String CommuteDistance;
  public String get_CommuteDistance() {
    return CommuteDistance;
  }
  public void set_CommuteDistance(String CommuteDistance) {
    this.CommuteDistance = CommuteDistance;
  }
  public codegen_dimcustomer with_CommuteDistance(String CommuteDistance) {
    this.CommuteDistance = CommuteDistance;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimcustomer)) {
      return false;
    }
    codegen_dimcustomer that = (codegen_dimcustomer) o;
    boolean equal = true;
    equal = equal && (this.CustomerKey == null ? that.CustomerKey == null : this.CustomerKey.equals(that.CustomerKey));
    equal = equal && (this.GeographyKey == null ? that.GeographyKey == null : this.GeographyKey.equals(that.GeographyKey));
    equal = equal && (this.CustomerAlternateKey == null ? that.CustomerAlternateKey == null : this.CustomerAlternateKey.equals(that.CustomerAlternateKey));
    equal = equal && (this.Title == null ? that.Title == null : this.Title.equals(that.Title));
    equal = equal && (this.FirstName == null ? that.FirstName == null : this.FirstName.equals(that.FirstName));
    equal = equal && (this.MiddleName == null ? that.MiddleName == null : this.MiddleName.equals(that.MiddleName));
    equal = equal && (this.LastName == null ? that.LastName == null : this.LastName.equals(that.LastName));
    equal = equal && (this.NameStyle == null ? that.NameStyle == null : this.NameStyle.equals(that.NameStyle));
    equal = equal && (this.BirthDate == null ? that.BirthDate == null : this.BirthDate.equals(that.BirthDate));
    equal = equal && (this.MaritalStatus == null ? that.MaritalStatus == null : this.MaritalStatus.equals(that.MaritalStatus));
    equal = equal && (this.Suffix == null ? that.Suffix == null : this.Suffix.equals(that.Suffix));
    equal = equal && (this.Gender == null ? that.Gender == null : this.Gender.equals(that.Gender));
    equal = equal && (this.EmailAddress == null ? that.EmailAddress == null : this.EmailAddress.equals(that.EmailAddress));
    equal = equal && (this.YearlyIncome == null ? that.YearlyIncome == null : this.YearlyIncome.equals(that.YearlyIncome));
    equal = equal && (this.TotalChildren == null ? that.TotalChildren == null : this.TotalChildren.equals(that.TotalChildren));
    equal = equal && (this.NumberChildrenAtHome == null ? that.NumberChildrenAtHome == null : this.NumberChildrenAtHome.equals(that.NumberChildrenAtHome));
    equal = equal && (this.EnglishEducation == null ? that.EnglishEducation == null : this.EnglishEducation.equals(that.EnglishEducation));
    equal = equal && (this.SpanishEducation == null ? that.SpanishEducation == null : this.SpanishEducation.equals(that.SpanishEducation));
    equal = equal && (this.FrenchEducation == null ? that.FrenchEducation == null : this.FrenchEducation.equals(that.FrenchEducation));
    equal = equal && (this.EnglishOccupation == null ? that.EnglishOccupation == null : this.EnglishOccupation.equals(that.EnglishOccupation));
    equal = equal && (this.SpanishOccupation == null ? that.SpanishOccupation == null : this.SpanishOccupation.equals(that.SpanishOccupation));
    equal = equal && (this.FrenchOccupation == null ? that.FrenchOccupation == null : this.FrenchOccupation.equals(that.FrenchOccupation));
    equal = equal && (this.HouseOwnerFlag == null ? that.HouseOwnerFlag == null : this.HouseOwnerFlag.equals(that.HouseOwnerFlag));
    equal = equal && (this.NumberCarsOwned == null ? that.NumberCarsOwned == null : this.NumberCarsOwned.equals(that.NumberCarsOwned));
    equal = equal && (this.AddressLine1 == null ? that.AddressLine1 == null : this.AddressLine1.equals(that.AddressLine1));
    equal = equal && (this.AddressLine2 == null ? that.AddressLine2 == null : this.AddressLine2.equals(that.AddressLine2));
    equal = equal && (this.Phone == null ? that.Phone == null : this.Phone.equals(that.Phone));
    equal = equal && (this.DateFirstPurchase == null ? that.DateFirstPurchase == null : this.DateFirstPurchase.equals(that.DateFirstPurchase));
    equal = equal && (this.CommuteDistance == null ? that.CommuteDistance == null : this.CommuteDistance.equals(that.CommuteDistance));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimcustomer)) {
      return false;
    }
    codegen_dimcustomer that = (codegen_dimcustomer) o;
    boolean equal = true;
    equal = equal && (this.CustomerKey == null ? that.CustomerKey == null : this.CustomerKey.equals(that.CustomerKey));
    equal = equal && (this.GeographyKey == null ? that.GeographyKey == null : this.GeographyKey.equals(that.GeographyKey));
    equal = equal && (this.CustomerAlternateKey == null ? that.CustomerAlternateKey == null : this.CustomerAlternateKey.equals(that.CustomerAlternateKey));
    equal = equal && (this.Title == null ? that.Title == null : this.Title.equals(that.Title));
    equal = equal && (this.FirstName == null ? that.FirstName == null : this.FirstName.equals(that.FirstName));
    equal = equal && (this.MiddleName == null ? that.MiddleName == null : this.MiddleName.equals(that.MiddleName));
    equal = equal && (this.LastName == null ? that.LastName == null : this.LastName.equals(that.LastName));
    equal = equal && (this.NameStyle == null ? that.NameStyle == null : this.NameStyle.equals(that.NameStyle));
    equal = equal && (this.BirthDate == null ? that.BirthDate == null : this.BirthDate.equals(that.BirthDate));
    equal = equal && (this.MaritalStatus == null ? that.MaritalStatus == null : this.MaritalStatus.equals(that.MaritalStatus));
    equal = equal && (this.Suffix == null ? that.Suffix == null : this.Suffix.equals(that.Suffix));
    equal = equal && (this.Gender == null ? that.Gender == null : this.Gender.equals(that.Gender));
    equal = equal && (this.EmailAddress == null ? that.EmailAddress == null : this.EmailAddress.equals(that.EmailAddress));
    equal = equal && (this.YearlyIncome == null ? that.YearlyIncome == null : this.YearlyIncome.equals(that.YearlyIncome));
    equal = equal && (this.TotalChildren == null ? that.TotalChildren == null : this.TotalChildren.equals(that.TotalChildren));
    equal = equal && (this.NumberChildrenAtHome == null ? that.NumberChildrenAtHome == null : this.NumberChildrenAtHome.equals(that.NumberChildrenAtHome));
    equal = equal && (this.EnglishEducation == null ? that.EnglishEducation == null : this.EnglishEducation.equals(that.EnglishEducation));
    equal = equal && (this.SpanishEducation == null ? that.SpanishEducation == null : this.SpanishEducation.equals(that.SpanishEducation));
    equal = equal && (this.FrenchEducation == null ? that.FrenchEducation == null : this.FrenchEducation.equals(that.FrenchEducation));
    equal = equal && (this.EnglishOccupation == null ? that.EnglishOccupation == null : this.EnglishOccupation.equals(that.EnglishOccupation));
    equal = equal && (this.SpanishOccupation == null ? that.SpanishOccupation == null : this.SpanishOccupation.equals(that.SpanishOccupation));
    equal = equal && (this.FrenchOccupation == null ? that.FrenchOccupation == null : this.FrenchOccupation.equals(that.FrenchOccupation));
    equal = equal && (this.HouseOwnerFlag == null ? that.HouseOwnerFlag == null : this.HouseOwnerFlag.equals(that.HouseOwnerFlag));
    equal = equal && (this.NumberCarsOwned == null ? that.NumberCarsOwned == null : this.NumberCarsOwned.equals(that.NumberCarsOwned));
    equal = equal && (this.AddressLine1 == null ? that.AddressLine1 == null : this.AddressLine1.equals(that.AddressLine1));
    equal = equal && (this.AddressLine2 == null ? that.AddressLine2 == null : this.AddressLine2.equals(that.AddressLine2));
    equal = equal && (this.Phone == null ? that.Phone == null : this.Phone.equals(that.Phone));
    equal = equal && (this.DateFirstPurchase == null ? that.DateFirstPurchase == null : this.DateFirstPurchase.equals(that.DateFirstPurchase));
    equal = equal && (this.CommuteDistance == null ? that.CommuteDistance == null : this.CommuteDistance.equals(that.CommuteDistance));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CustomerKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.GeographyKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.CustomerAlternateKey = JdbcWritableBridge.readString(3, __dbResults);
    this.Title = JdbcWritableBridge.readString(4, __dbResults);
    this.FirstName = JdbcWritableBridge.readString(5, __dbResults);
    this.MiddleName = JdbcWritableBridge.readString(6, __dbResults);
    this.LastName = JdbcWritableBridge.readString(7, __dbResults);
    this.NameStyle = JdbcWritableBridge.readBoolean(8, __dbResults);
    this.BirthDate = JdbcWritableBridge.readDate(9, __dbResults);
    this.MaritalStatus = JdbcWritableBridge.readString(10, __dbResults);
    this.Suffix = JdbcWritableBridge.readString(11, __dbResults);
    this.Gender = JdbcWritableBridge.readString(12, __dbResults);
    this.EmailAddress = JdbcWritableBridge.readString(13, __dbResults);
    this.YearlyIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.TotalChildren = JdbcWritableBridge.readInteger(15, __dbResults);
    this.NumberChildrenAtHome = JdbcWritableBridge.readInteger(16, __dbResults);
    this.EnglishEducation = JdbcWritableBridge.readString(17, __dbResults);
    this.SpanishEducation = JdbcWritableBridge.readString(18, __dbResults);
    this.FrenchEducation = JdbcWritableBridge.readString(19, __dbResults);
    this.EnglishOccupation = JdbcWritableBridge.readString(20, __dbResults);
    this.SpanishOccupation = JdbcWritableBridge.readString(21, __dbResults);
    this.FrenchOccupation = JdbcWritableBridge.readString(22, __dbResults);
    this.HouseOwnerFlag = JdbcWritableBridge.readString(23, __dbResults);
    this.NumberCarsOwned = JdbcWritableBridge.readInteger(24, __dbResults);
    this.AddressLine1 = JdbcWritableBridge.readString(25, __dbResults);
    this.AddressLine2 = JdbcWritableBridge.readString(26, __dbResults);
    this.Phone = JdbcWritableBridge.readString(27, __dbResults);
    this.DateFirstPurchase = JdbcWritableBridge.readDate(28, __dbResults);
    this.CommuteDistance = JdbcWritableBridge.readString(29, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CustomerKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.GeographyKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.CustomerAlternateKey = JdbcWritableBridge.readString(3, __dbResults);
    this.Title = JdbcWritableBridge.readString(4, __dbResults);
    this.FirstName = JdbcWritableBridge.readString(5, __dbResults);
    this.MiddleName = JdbcWritableBridge.readString(6, __dbResults);
    this.LastName = JdbcWritableBridge.readString(7, __dbResults);
    this.NameStyle = JdbcWritableBridge.readBoolean(8, __dbResults);
    this.BirthDate = JdbcWritableBridge.readDate(9, __dbResults);
    this.MaritalStatus = JdbcWritableBridge.readString(10, __dbResults);
    this.Suffix = JdbcWritableBridge.readString(11, __dbResults);
    this.Gender = JdbcWritableBridge.readString(12, __dbResults);
    this.EmailAddress = JdbcWritableBridge.readString(13, __dbResults);
    this.YearlyIncome = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.TotalChildren = JdbcWritableBridge.readInteger(15, __dbResults);
    this.NumberChildrenAtHome = JdbcWritableBridge.readInteger(16, __dbResults);
    this.EnglishEducation = JdbcWritableBridge.readString(17, __dbResults);
    this.SpanishEducation = JdbcWritableBridge.readString(18, __dbResults);
    this.FrenchEducation = JdbcWritableBridge.readString(19, __dbResults);
    this.EnglishOccupation = JdbcWritableBridge.readString(20, __dbResults);
    this.SpanishOccupation = JdbcWritableBridge.readString(21, __dbResults);
    this.FrenchOccupation = JdbcWritableBridge.readString(22, __dbResults);
    this.HouseOwnerFlag = JdbcWritableBridge.readString(23, __dbResults);
    this.NumberCarsOwned = JdbcWritableBridge.readInteger(24, __dbResults);
    this.AddressLine1 = JdbcWritableBridge.readString(25, __dbResults);
    this.AddressLine2 = JdbcWritableBridge.readString(26, __dbResults);
    this.Phone = JdbcWritableBridge.readString(27, __dbResults);
    this.DateFirstPurchase = JdbcWritableBridge.readDate(28, __dbResults);
    this.CommuteDistance = JdbcWritableBridge.readString(29, __dbResults);
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
    JdbcWritableBridge.writeInteger(CustomerKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(GeographyKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CustomerAlternateKey, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Title, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FirstName, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MiddleName, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LastName, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(NameStyle, 8 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeDate(BirthDate, 9 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(MaritalStatus, 10 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Suffix, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Gender, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EmailAddress, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YearlyIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(TotalChildren, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(NumberChildrenAtHome, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(EnglishEducation, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishEducation, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchEducation, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EnglishOccupation, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishOccupation, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchOccupation, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HouseOwnerFlag, 23 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(NumberCarsOwned, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(AddressLine1, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AddressLine2, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Phone, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(DateFirstPurchase, 28 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(CommuteDistance, 29 + __off, 12, __dbStmt);
    return 29;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(CustomerKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(GeographyKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(CustomerAlternateKey, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Title, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FirstName, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MiddleName, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LastName, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(NameStyle, 8 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeDate(BirthDate, 9 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(MaritalStatus, 10 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Suffix, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Gender, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EmailAddress, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(YearlyIncome, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(TotalChildren, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(NumberChildrenAtHome, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(EnglishEducation, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishEducation, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchEducation, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EnglishOccupation, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishOccupation, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchOccupation, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HouseOwnerFlag, 23 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(NumberCarsOwned, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(AddressLine1, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(AddressLine2, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Phone, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(DateFirstPurchase, 28 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(CommuteDistance, 29 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CustomerKey = null;
    } else {
    this.CustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.GeographyKey = null;
    } else {
    this.GeographyKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CustomerAlternateKey = null;
    } else {
    this.CustomerAlternateKey = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Title = null;
    } else {
    this.Title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FirstName = null;
    } else {
    this.FirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MiddleName = null;
    } else {
    this.MiddleName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LastName = null;
    } else {
    this.LastName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NameStyle = null;
    } else {
    this.NameStyle = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.BirthDate = null;
    } else {
    this.BirthDate = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.MaritalStatus = null;
    } else {
    this.MaritalStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Suffix = null;
    } else {
    this.Suffix = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Gender = null;
    } else {
    this.Gender = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EmailAddress = null;
    } else {
    this.EmailAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YearlyIncome = null;
    } else {
    this.YearlyIncome = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TotalChildren = null;
    } else {
    this.TotalChildren = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.NumberChildrenAtHome = null;
    } else {
    this.NumberChildrenAtHome = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.EnglishEducation = null;
    } else {
    this.EnglishEducation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SpanishEducation = null;
    } else {
    this.SpanishEducation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FrenchEducation = null;
    } else {
    this.FrenchEducation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EnglishOccupation = null;
    } else {
    this.EnglishOccupation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SpanishOccupation = null;
    } else {
    this.SpanishOccupation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FrenchOccupation = null;
    } else {
    this.FrenchOccupation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HouseOwnerFlag = null;
    } else {
    this.HouseOwnerFlag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NumberCarsOwned = null;
    } else {
    this.NumberCarsOwned = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.AddressLine1 = null;
    } else {
    this.AddressLine1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AddressLine2 = null;
    } else {
    this.AddressLine2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Phone = null;
    } else {
    this.Phone = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DateFirstPurchase = null;
    } else {
    this.DateFirstPurchase = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.CommuteDistance = null;
    } else {
    this.CommuteDistance = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CustomerKey);
    }
    if (null == this.GeographyKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.GeographyKey);
    }
    if (null == this.CustomerAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CustomerAlternateKey);
    }
    if (null == this.Title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Title);
    }
    if (null == this.FirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FirstName);
    }
    if (null == this.MiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MiddleName);
    }
    if (null == this.LastName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LastName);
    }
    if (null == this.NameStyle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.NameStyle);
    }
    if (null == this.BirthDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.BirthDate.getTime());
    }
    if (null == this.MaritalStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MaritalStatus);
    }
    if (null == this.Suffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Suffix);
    }
    if (null == this.Gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Gender);
    }
    if (null == this.EmailAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EmailAddress);
    }
    if (null == this.YearlyIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YearlyIncome, __dataOut);
    }
    if (null == this.TotalChildren) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TotalChildren);
    }
    if (null == this.NumberChildrenAtHome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.NumberChildrenAtHome);
    }
    if (null == this.EnglishEducation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishEducation);
    }
    if (null == this.SpanishEducation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishEducation);
    }
    if (null == this.FrenchEducation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchEducation);
    }
    if (null == this.EnglishOccupation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishOccupation);
    }
    if (null == this.SpanishOccupation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishOccupation);
    }
    if (null == this.FrenchOccupation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchOccupation);
    }
    if (null == this.HouseOwnerFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HouseOwnerFlag);
    }
    if (null == this.NumberCarsOwned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.NumberCarsOwned);
    }
    if (null == this.AddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AddressLine1);
    }
    if (null == this.AddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AddressLine2);
    }
    if (null == this.Phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Phone);
    }
    if (null == this.DateFirstPurchase) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DateFirstPurchase.getTime());
    }
    if (null == this.CommuteDistance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CommuteDistance);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CustomerKey);
    }
    if (null == this.GeographyKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.GeographyKey);
    }
    if (null == this.CustomerAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CustomerAlternateKey);
    }
    if (null == this.Title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Title);
    }
    if (null == this.FirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FirstName);
    }
    if (null == this.MiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MiddleName);
    }
    if (null == this.LastName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LastName);
    }
    if (null == this.NameStyle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.NameStyle);
    }
    if (null == this.BirthDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.BirthDate.getTime());
    }
    if (null == this.MaritalStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MaritalStatus);
    }
    if (null == this.Suffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Suffix);
    }
    if (null == this.Gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Gender);
    }
    if (null == this.EmailAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EmailAddress);
    }
    if (null == this.YearlyIncome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.YearlyIncome, __dataOut);
    }
    if (null == this.TotalChildren) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TotalChildren);
    }
    if (null == this.NumberChildrenAtHome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.NumberChildrenAtHome);
    }
    if (null == this.EnglishEducation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishEducation);
    }
    if (null == this.SpanishEducation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishEducation);
    }
    if (null == this.FrenchEducation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchEducation);
    }
    if (null == this.EnglishOccupation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishOccupation);
    }
    if (null == this.SpanishOccupation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishOccupation);
    }
    if (null == this.FrenchOccupation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchOccupation);
    }
    if (null == this.HouseOwnerFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HouseOwnerFlag);
    }
    if (null == this.NumberCarsOwned) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.NumberCarsOwned);
    }
    if (null == this.AddressLine1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AddressLine1);
    }
    if (null == this.AddressLine2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, AddressLine2);
    }
    if (null == this.Phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Phone);
    }
    if (null == this.DateFirstPurchase) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DateFirstPurchase.getTime());
    }
    if (null == this.CommuteDistance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CommuteDistance);
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
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerKey==null?"null":"" + CustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GeographyKey==null?"null":"" + GeographyKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerAlternateKey==null?"null":CustomerAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Title==null?"null":Title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FirstName==null?"null":FirstName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MiddleName==null?"null":MiddleName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LastName==null?"null":LastName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NameStyle==null?"null":"" + NameStyle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BirthDate==null?"null":"" + BirthDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MaritalStatus==null?"null":MaritalStatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Suffix==null?"null":Suffix, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Gender==null?"null":Gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EmailAddress==null?"null":EmailAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YearlyIncome==null?"null":YearlyIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TotalChildren==null?"null":"" + TotalChildren, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NumberChildrenAtHome==null?"null":"" + NumberChildrenAtHome, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishEducation==null?"null":EnglishEducation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishEducation==null?"null":SpanishEducation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchEducation==null?"null":FrenchEducation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishOccupation==null?"null":EnglishOccupation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishOccupation==null?"null":SpanishOccupation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchOccupation==null?"null":FrenchOccupation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HouseOwnerFlag==null?"null":HouseOwnerFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NumberCarsOwned==null?"null":"" + NumberCarsOwned, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AddressLine1==null?"null":AddressLine1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AddressLine2==null?"null":AddressLine2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Phone==null?"null":Phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DateFirstPurchase==null?"null":"" + DateFirstPurchase, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CommuteDistance==null?"null":CommuteDistance, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerKey==null?"null":"" + CustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GeographyKey==null?"null":"" + GeographyKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerAlternateKey==null?"null":CustomerAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Title==null?"null":Title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FirstName==null?"null":FirstName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MiddleName==null?"null":MiddleName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LastName==null?"null":LastName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NameStyle==null?"null":"" + NameStyle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BirthDate==null?"null":"" + BirthDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MaritalStatus==null?"null":MaritalStatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Suffix==null?"null":Suffix, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Gender==null?"null":Gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EmailAddress==null?"null":EmailAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YearlyIncome==null?"null":YearlyIncome.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TotalChildren==null?"null":"" + TotalChildren, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NumberChildrenAtHome==null?"null":"" + NumberChildrenAtHome, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishEducation==null?"null":EnglishEducation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishEducation==null?"null":SpanishEducation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchEducation==null?"null":FrenchEducation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishOccupation==null?"null":EnglishOccupation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishOccupation==null?"null":SpanishOccupation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchOccupation==null?"null":FrenchOccupation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HouseOwnerFlag==null?"null":HouseOwnerFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NumberCarsOwned==null?"null":"" + NumberCarsOwned, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AddressLine1==null?"null":AddressLine1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AddressLine2==null?"null":AddressLine2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Phone==null?"null":Phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DateFirstPurchase==null?"null":"" + DateFirstPurchase, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CommuteDistance==null?"null":CommuteDistance, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CustomerKey = null; } else {
      this.CustomerKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GeographyKey = null; } else {
      this.GeographyKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CustomerAlternateKey = null; } else {
      this.CustomerAlternateKey = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Title = null; } else {
      this.Title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FirstName = null; } else {
      this.FirstName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MiddleName = null; } else {
      this.MiddleName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LastName = null; } else {
      this.LastName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NameStyle = null; } else {
      this.NameStyle = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BirthDate = null; } else {
      this.BirthDate = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MaritalStatus = null; } else {
      this.MaritalStatus = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Suffix = null; } else {
      this.Suffix = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Gender = null; } else {
      this.Gender = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EmailAddress = null; } else {
      this.EmailAddress = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YearlyIncome = null; } else {
      this.YearlyIncome = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TotalChildren = null; } else {
      this.TotalChildren = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NumberChildrenAtHome = null; } else {
      this.NumberChildrenAtHome = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishEducation = null; } else {
      this.EnglishEducation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishEducation = null; } else {
      this.SpanishEducation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchEducation = null; } else {
      this.FrenchEducation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishOccupation = null; } else {
      this.EnglishOccupation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishOccupation = null; } else {
      this.SpanishOccupation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchOccupation = null; } else {
      this.FrenchOccupation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HouseOwnerFlag = null; } else {
      this.HouseOwnerFlag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NumberCarsOwned = null; } else {
      this.NumberCarsOwned = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AddressLine1 = null; } else {
      this.AddressLine1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AddressLine2 = null; } else {
      this.AddressLine2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Phone = null; } else {
      this.Phone = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DateFirstPurchase = null; } else {
      this.DateFirstPurchase = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CommuteDistance = null; } else {
      this.CommuteDistance = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CustomerKey = null; } else {
      this.CustomerKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GeographyKey = null; } else {
      this.GeographyKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CustomerAlternateKey = null; } else {
      this.CustomerAlternateKey = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Title = null; } else {
      this.Title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FirstName = null; } else {
      this.FirstName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MiddleName = null; } else {
      this.MiddleName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LastName = null; } else {
      this.LastName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NameStyle = null; } else {
      this.NameStyle = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BirthDate = null; } else {
      this.BirthDate = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MaritalStatus = null; } else {
      this.MaritalStatus = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Suffix = null; } else {
      this.Suffix = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Gender = null; } else {
      this.Gender = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EmailAddress = null; } else {
      this.EmailAddress = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.YearlyIncome = null; } else {
      this.YearlyIncome = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TotalChildren = null; } else {
      this.TotalChildren = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NumberChildrenAtHome = null; } else {
      this.NumberChildrenAtHome = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishEducation = null; } else {
      this.EnglishEducation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishEducation = null; } else {
      this.SpanishEducation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchEducation = null; } else {
      this.FrenchEducation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishOccupation = null; } else {
      this.EnglishOccupation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishOccupation = null; } else {
      this.SpanishOccupation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchOccupation = null; } else {
      this.FrenchOccupation = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HouseOwnerFlag = null; } else {
      this.HouseOwnerFlag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NumberCarsOwned = null; } else {
      this.NumberCarsOwned = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AddressLine1 = null; } else {
      this.AddressLine1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.AddressLine2 = null; } else {
      this.AddressLine2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Phone = null; } else {
      this.Phone = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DateFirstPurchase = null; } else {
      this.DateFirstPurchase = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CommuteDistance = null; } else {
      this.CommuteDistance = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_dimcustomer o = (codegen_dimcustomer) super.clone();
    o.BirthDate = (o.BirthDate != null) ? (java.sql.Date) o.BirthDate.clone() : null;
    o.DateFirstPurchase = (o.DateFirstPurchase != null) ? (java.sql.Date) o.DateFirstPurchase.clone() : null;
    return o;
  }

  public void clone0(codegen_dimcustomer o) throws CloneNotSupportedException {
    o.BirthDate = (o.BirthDate != null) ? (java.sql.Date) o.BirthDate.clone() : null;
    o.DateFirstPurchase = (o.DateFirstPurchase != null) ? (java.sql.Date) o.DateFirstPurchase.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("CustomerKey", this.CustomerKey);
    __sqoop$field_map.put("GeographyKey", this.GeographyKey);
    __sqoop$field_map.put("CustomerAlternateKey", this.CustomerAlternateKey);
    __sqoop$field_map.put("Title", this.Title);
    __sqoop$field_map.put("FirstName", this.FirstName);
    __sqoop$field_map.put("MiddleName", this.MiddleName);
    __sqoop$field_map.put("LastName", this.LastName);
    __sqoop$field_map.put("NameStyle", this.NameStyle);
    __sqoop$field_map.put("BirthDate", this.BirthDate);
    __sqoop$field_map.put("MaritalStatus", this.MaritalStatus);
    __sqoop$field_map.put("Suffix", this.Suffix);
    __sqoop$field_map.put("Gender", this.Gender);
    __sqoop$field_map.put("EmailAddress", this.EmailAddress);
    __sqoop$field_map.put("YearlyIncome", this.YearlyIncome);
    __sqoop$field_map.put("TotalChildren", this.TotalChildren);
    __sqoop$field_map.put("NumberChildrenAtHome", this.NumberChildrenAtHome);
    __sqoop$field_map.put("EnglishEducation", this.EnglishEducation);
    __sqoop$field_map.put("SpanishEducation", this.SpanishEducation);
    __sqoop$field_map.put("FrenchEducation", this.FrenchEducation);
    __sqoop$field_map.put("EnglishOccupation", this.EnglishOccupation);
    __sqoop$field_map.put("SpanishOccupation", this.SpanishOccupation);
    __sqoop$field_map.put("FrenchOccupation", this.FrenchOccupation);
    __sqoop$field_map.put("HouseOwnerFlag", this.HouseOwnerFlag);
    __sqoop$field_map.put("NumberCarsOwned", this.NumberCarsOwned);
    __sqoop$field_map.put("AddressLine1", this.AddressLine1);
    __sqoop$field_map.put("AddressLine2", this.AddressLine2);
    __sqoop$field_map.put("Phone", this.Phone);
    __sqoop$field_map.put("DateFirstPurchase", this.DateFirstPurchase);
    __sqoop$field_map.put("CommuteDistance", this.CommuteDistance);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CustomerKey", this.CustomerKey);
    __sqoop$field_map.put("GeographyKey", this.GeographyKey);
    __sqoop$field_map.put("CustomerAlternateKey", this.CustomerAlternateKey);
    __sqoop$field_map.put("Title", this.Title);
    __sqoop$field_map.put("FirstName", this.FirstName);
    __sqoop$field_map.put("MiddleName", this.MiddleName);
    __sqoop$field_map.put("LastName", this.LastName);
    __sqoop$field_map.put("NameStyle", this.NameStyle);
    __sqoop$field_map.put("BirthDate", this.BirthDate);
    __sqoop$field_map.put("MaritalStatus", this.MaritalStatus);
    __sqoop$field_map.put("Suffix", this.Suffix);
    __sqoop$field_map.put("Gender", this.Gender);
    __sqoop$field_map.put("EmailAddress", this.EmailAddress);
    __sqoop$field_map.put("YearlyIncome", this.YearlyIncome);
    __sqoop$field_map.put("TotalChildren", this.TotalChildren);
    __sqoop$field_map.put("NumberChildrenAtHome", this.NumberChildrenAtHome);
    __sqoop$field_map.put("EnglishEducation", this.EnglishEducation);
    __sqoop$field_map.put("SpanishEducation", this.SpanishEducation);
    __sqoop$field_map.put("FrenchEducation", this.FrenchEducation);
    __sqoop$field_map.put("EnglishOccupation", this.EnglishOccupation);
    __sqoop$field_map.put("SpanishOccupation", this.SpanishOccupation);
    __sqoop$field_map.put("FrenchOccupation", this.FrenchOccupation);
    __sqoop$field_map.put("HouseOwnerFlag", this.HouseOwnerFlag);
    __sqoop$field_map.put("NumberCarsOwned", this.NumberCarsOwned);
    __sqoop$field_map.put("AddressLine1", this.AddressLine1);
    __sqoop$field_map.put("AddressLine2", this.AddressLine2);
    __sqoop$field_map.put("Phone", this.Phone);
    __sqoop$field_map.put("DateFirstPurchase", this.DateFirstPurchase);
    __sqoop$field_map.put("CommuteDistance", this.CommuteDistance);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
