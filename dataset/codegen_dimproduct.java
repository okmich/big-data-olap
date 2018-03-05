// ORM class for table 'dimproduct'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 05 02:04:49 PST 2018
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

public class codegen_dimproduct extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("ProductKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ProductKey = (Integer)value;
      }
    });
    setters.put("ProductAlternateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ProductAlternateKey = (String)value;
      }
    });
    setters.put("ProductSubcategoryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ProductSubcategoryKey = (Integer)value;
      }
    });
    setters.put("WeightUnitMeasureCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        WeightUnitMeasureCode = (String)value;
      }
    });
    setters.put("SizeUnitMeasureCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SizeUnitMeasureCode = (String)value;
      }
    });
    setters.put("EnglishProductName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EnglishProductName = (String)value;
      }
    });
    setters.put("SpanishProductName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SpanishProductName = (String)value;
      }
    });
    setters.put("FrenchProductName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FrenchProductName = (String)value;
      }
    });
    setters.put("StandardCost", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        StandardCost = (java.math.BigDecimal)value;
      }
    });
    setters.put("FinishedGoodsFlag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FinishedGoodsFlag = (Boolean)value;
      }
    });
    setters.put("Color", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Color = (String)value;
      }
    });
    setters.put("SafetyStockLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SafetyStockLevel = (Integer)value;
      }
    });
    setters.put("ReorderPoint", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ReorderPoint = (Integer)value;
      }
    });
    setters.put("ListPrice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ListPrice = (java.math.BigDecimal)value;
      }
    });
    setters.put("Size", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Size = (String)value;
      }
    });
    setters.put("SizeRange", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SizeRange = (String)value;
      }
    });
    setters.put("Weight", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Weight = (Double)value;
      }
    });
    setters.put("DaysToManufacture", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DaysToManufacture = (Integer)value;
      }
    });
    setters.put("ProductLine", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ProductLine = (String)value;
      }
    });
    setters.put("DealerPrice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DealerPrice = (java.math.BigDecimal)value;
      }
    });
    setters.put("Class", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Class = (String)value;
      }
    });
    setters.put("Style", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Style = (String)value;
      }
    });
    setters.put("ModelName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ModelName = (String)value;
      }
    });
    setters.put("LargePhoto", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        LargePhoto = (com.cloudera.sqoop.lib.BlobRef)value;
      }
    });
    setters.put("EnglishDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EnglishDescription = (String)value;
      }
    });
    setters.put("FrenchDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        FrenchDescription = (String)value;
      }
    });
    setters.put("ChineseDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ChineseDescription = (String)value;
      }
    });
    setters.put("ArabicDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ArabicDescription = (String)value;
      }
    });
    setters.put("HebrewDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HebrewDescription = (String)value;
      }
    });
    setters.put("ThaiDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ThaiDescription = (String)value;
      }
    });
    setters.put("GermanDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GermanDescription = (String)value;
      }
    });
    setters.put("JapaneseDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        JapaneseDescription = (String)value;
      }
    });
    setters.put("TurkishDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TurkishDescription = (String)value;
      }
    });
    setters.put("StartDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        StartDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("EndDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        EndDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("Status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Status = (String)value;
      }
    });
  }
  public codegen_dimproduct() {
    init0();
  }
  private Integer ProductKey;
  public Integer get_ProductKey() {
    return ProductKey;
  }
  public void set_ProductKey(Integer ProductKey) {
    this.ProductKey = ProductKey;
  }
  public codegen_dimproduct with_ProductKey(Integer ProductKey) {
    this.ProductKey = ProductKey;
    return this;
  }
  private String ProductAlternateKey;
  public String get_ProductAlternateKey() {
    return ProductAlternateKey;
  }
  public void set_ProductAlternateKey(String ProductAlternateKey) {
    this.ProductAlternateKey = ProductAlternateKey;
  }
  public codegen_dimproduct with_ProductAlternateKey(String ProductAlternateKey) {
    this.ProductAlternateKey = ProductAlternateKey;
    return this;
  }
  private Integer ProductSubcategoryKey;
  public Integer get_ProductSubcategoryKey() {
    return ProductSubcategoryKey;
  }
  public void set_ProductSubcategoryKey(Integer ProductSubcategoryKey) {
    this.ProductSubcategoryKey = ProductSubcategoryKey;
  }
  public codegen_dimproduct with_ProductSubcategoryKey(Integer ProductSubcategoryKey) {
    this.ProductSubcategoryKey = ProductSubcategoryKey;
    return this;
  }
  private String WeightUnitMeasureCode;
  public String get_WeightUnitMeasureCode() {
    return WeightUnitMeasureCode;
  }
  public void set_WeightUnitMeasureCode(String WeightUnitMeasureCode) {
    this.WeightUnitMeasureCode = WeightUnitMeasureCode;
  }
  public codegen_dimproduct with_WeightUnitMeasureCode(String WeightUnitMeasureCode) {
    this.WeightUnitMeasureCode = WeightUnitMeasureCode;
    return this;
  }
  private String SizeUnitMeasureCode;
  public String get_SizeUnitMeasureCode() {
    return SizeUnitMeasureCode;
  }
  public void set_SizeUnitMeasureCode(String SizeUnitMeasureCode) {
    this.SizeUnitMeasureCode = SizeUnitMeasureCode;
  }
  public codegen_dimproduct with_SizeUnitMeasureCode(String SizeUnitMeasureCode) {
    this.SizeUnitMeasureCode = SizeUnitMeasureCode;
    return this;
  }
  private String EnglishProductName;
  public String get_EnglishProductName() {
    return EnglishProductName;
  }
  public void set_EnglishProductName(String EnglishProductName) {
    this.EnglishProductName = EnglishProductName;
  }
  public codegen_dimproduct with_EnglishProductName(String EnglishProductName) {
    this.EnglishProductName = EnglishProductName;
    return this;
  }
  private String SpanishProductName;
  public String get_SpanishProductName() {
    return SpanishProductName;
  }
  public void set_SpanishProductName(String SpanishProductName) {
    this.SpanishProductName = SpanishProductName;
  }
  public codegen_dimproduct with_SpanishProductName(String SpanishProductName) {
    this.SpanishProductName = SpanishProductName;
    return this;
  }
  private String FrenchProductName;
  public String get_FrenchProductName() {
    return FrenchProductName;
  }
  public void set_FrenchProductName(String FrenchProductName) {
    this.FrenchProductName = FrenchProductName;
  }
  public codegen_dimproduct with_FrenchProductName(String FrenchProductName) {
    this.FrenchProductName = FrenchProductName;
    return this;
  }
  private java.math.BigDecimal StandardCost;
  public java.math.BigDecimal get_StandardCost() {
    return StandardCost;
  }
  public void set_StandardCost(java.math.BigDecimal StandardCost) {
    this.StandardCost = StandardCost;
  }
  public codegen_dimproduct with_StandardCost(java.math.BigDecimal StandardCost) {
    this.StandardCost = StandardCost;
    return this;
  }
  private Boolean FinishedGoodsFlag;
  public Boolean get_FinishedGoodsFlag() {
    return FinishedGoodsFlag;
  }
  public void set_FinishedGoodsFlag(Boolean FinishedGoodsFlag) {
    this.FinishedGoodsFlag = FinishedGoodsFlag;
  }
  public codegen_dimproduct with_FinishedGoodsFlag(Boolean FinishedGoodsFlag) {
    this.FinishedGoodsFlag = FinishedGoodsFlag;
    return this;
  }
  private String Color;
  public String get_Color() {
    return Color;
  }
  public void set_Color(String Color) {
    this.Color = Color;
  }
  public codegen_dimproduct with_Color(String Color) {
    this.Color = Color;
    return this;
  }
  private Integer SafetyStockLevel;
  public Integer get_SafetyStockLevel() {
    return SafetyStockLevel;
  }
  public void set_SafetyStockLevel(Integer SafetyStockLevel) {
    this.SafetyStockLevel = SafetyStockLevel;
  }
  public codegen_dimproduct with_SafetyStockLevel(Integer SafetyStockLevel) {
    this.SafetyStockLevel = SafetyStockLevel;
    return this;
  }
  private Integer ReorderPoint;
  public Integer get_ReorderPoint() {
    return ReorderPoint;
  }
  public void set_ReorderPoint(Integer ReorderPoint) {
    this.ReorderPoint = ReorderPoint;
  }
  public codegen_dimproduct with_ReorderPoint(Integer ReorderPoint) {
    this.ReorderPoint = ReorderPoint;
    return this;
  }
  private java.math.BigDecimal ListPrice;
  public java.math.BigDecimal get_ListPrice() {
    return ListPrice;
  }
  public void set_ListPrice(java.math.BigDecimal ListPrice) {
    this.ListPrice = ListPrice;
  }
  public codegen_dimproduct with_ListPrice(java.math.BigDecimal ListPrice) {
    this.ListPrice = ListPrice;
    return this;
  }
  private String Size;
  public String get_Size() {
    return Size;
  }
  public void set_Size(String Size) {
    this.Size = Size;
  }
  public codegen_dimproduct with_Size(String Size) {
    this.Size = Size;
    return this;
  }
  private String SizeRange;
  public String get_SizeRange() {
    return SizeRange;
  }
  public void set_SizeRange(String SizeRange) {
    this.SizeRange = SizeRange;
  }
  public codegen_dimproduct with_SizeRange(String SizeRange) {
    this.SizeRange = SizeRange;
    return this;
  }
  private Double Weight;
  public Double get_Weight() {
    return Weight;
  }
  public void set_Weight(Double Weight) {
    this.Weight = Weight;
  }
  public codegen_dimproduct with_Weight(Double Weight) {
    this.Weight = Weight;
    return this;
  }
  private Integer DaysToManufacture;
  public Integer get_DaysToManufacture() {
    return DaysToManufacture;
  }
  public void set_DaysToManufacture(Integer DaysToManufacture) {
    this.DaysToManufacture = DaysToManufacture;
  }
  public codegen_dimproduct with_DaysToManufacture(Integer DaysToManufacture) {
    this.DaysToManufacture = DaysToManufacture;
    return this;
  }
  private String ProductLine;
  public String get_ProductLine() {
    return ProductLine;
  }
  public void set_ProductLine(String ProductLine) {
    this.ProductLine = ProductLine;
  }
  public codegen_dimproduct with_ProductLine(String ProductLine) {
    this.ProductLine = ProductLine;
    return this;
  }
  private java.math.BigDecimal DealerPrice;
  public java.math.BigDecimal get_DealerPrice() {
    return DealerPrice;
  }
  public void set_DealerPrice(java.math.BigDecimal DealerPrice) {
    this.DealerPrice = DealerPrice;
  }
  public codegen_dimproduct with_DealerPrice(java.math.BigDecimal DealerPrice) {
    this.DealerPrice = DealerPrice;
    return this;
  }
  private String Class;
  public String get_Class() {
    return Class;
  }
  public void set_Class(String Class) {
    this.Class = Class;
  }
  public codegen_dimproduct with_Class(String Class) {
    this.Class = Class;
    return this;
  }
  private String Style;
  public String get_Style() {
    return Style;
  }
  public void set_Style(String Style) {
    this.Style = Style;
  }
  public codegen_dimproduct with_Style(String Style) {
    this.Style = Style;
    return this;
  }
  private String ModelName;
  public String get_ModelName() {
    return ModelName;
  }
  public void set_ModelName(String ModelName) {
    this.ModelName = ModelName;
  }
  public codegen_dimproduct with_ModelName(String ModelName) {
    this.ModelName = ModelName;
    return this;
  }
  private com.cloudera.sqoop.lib.BlobRef LargePhoto;
  public com.cloudera.sqoop.lib.BlobRef get_LargePhoto() {
    return LargePhoto;
  }
  public void set_LargePhoto(com.cloudera.sqoop.lib.BlobRef LargePhoto) {
    this.LargePhoto = LargePhoto;
  }
  public codegen_dimproduct with_LargePhoto(com.cloudera.sqoop.lib.BlobRef LargePhoto) {
    this.LargePhoto = LargePhoto;
    return this;
  }
  private String EnglishDescription;
  public String get_EnglishDescription() {
    return EnglishDescription;
  }
  public void set_EnglishDescription(String EnglishDescription) {
    this.EnglishDescription = EnglishDescription;
  }
  public codegen_dimproduct with_EnglishDescription(String EnglishDescription) {
    this.EnglishDescription = EnglishDescription;
    return this;
  }
  private String FrenchDescription;
  public String get_FrenchDescription() {
    return FrenchDescription;
  }
  public void set_FrenchDescription(String FrenchDescription) {
    this.FrenchDescription = FrenchDescription;
  }
  public codegen_dimproduct with_FrenchDescription(String FrenchDescription) {
    this.FrenchDescription = FrenchDescription;
    return this;
  }
  private String ChineseDescription;
  public String get_ChineseDescription() {
    return ChineseDescription;
  }
  public void set_ChineseDescription(String ChineseDescription) {
    this.ChineseDescription = ChineseDescription;
  }
  public codegen_dimproduct with_ChineseDescription(String ChineseDescription) {
    this.ChineseDescription = ChineseDescription;
    return this;
  }
  private String ArabicDescription;
  public String get_ArabicDescription() {
    return ArabicDescription;
  }
  public void set_ArabicDescription(String ArabicDescription) {
    this.ArabicDescription = ArabicDescription;
  }
  public codegen_dimproduct with_ArabicDescription(String ArabicDescription) {
    this.ArabicDescription = ArabicDescription;
    return this;
  }
  private String HebrewDescription;
  public String get_HebrewDescription() {
    return HebrewDescription;
  }
  public void set_HebrewDescription(String HebrewDescription) {
    this.HebrewDescription = HebrewDescription;
  }
  public codegen_dimproduct with_HebrewDescription(String HebrewDescription) {
    this.HebrewDescription = HebrewDescription;
    return this;
  }
  private String ThaiDescription;
  public String get_ThaiDescription() {
    return ThaiDescription;
  }
  public void set_ThaiDescription(String ThaiDescription) {
    this.ThaiDescription = ThaiDescription;
  }
  public codegen_dimproduct with_ThaiDescription(String ThaiDescription) {
    this.ThaiDescription = ThaiDescription;
    return this;
  }
  private String GermanDescription;
  public String get_GermanDescription() {
    return GermanDescription;
  }
  public void set_GermanDescription(String GermanDescription) {
    this.GermanDescription = GermanDescription;
  }
  public codegen_dimproduct with_GermanDescription(String GermanDescription) {
    this.GermanDescription = GermanDescription;
    return this;
  }
  private String JapaneseDescription;
  public String get_JapaneseDescription() {
    return JapaneseDescription;
  }
  public void set_JapaneseDescription(String JapaneseDescription) {
    this.JapaneseDescription = JapaneseDescription;
  }
  public codegen_dimproduct with_JapaneseDescription(String JapaneseDescription) {
    this.JapaneseDescription = JapaneseDescription;
    return this;
  }
  private String TurkishDescription;
  public String get_TurkishDescription() {
    return TurkishDescription;
  }
  public void set_TurkishDescription(String TurkishDescription) {
    this.TurkishDescription = TurkishDescription;
  }
  public codegen_dimproduct with_TurkishDescription(String TurkishDescription) {
    this.TurkishDescription = TurkishDescription;
    return this;
  }
  private java.sql.Timestamp StartDate;
  public java.sql.Timestamp get_StartDate() {
    return StartDate;
  }
  public void set_StartDate(java.sql.Timestamp StartDate) {
    this.StartDate = StartDate;
  }
  public codegen_dimproduct with_StartDate(java.sql.Timestamp StartDate) {
    this.StartDate = StartDate;
    return this;
  }
  private java.sql.Timestamp EndDate;
  public java.sql.Timestamp get_EndDate() {
    return EndDate;
  }
  public void set_EndDate(java.sql.Timestamp EndDate) {
    this.EndDate = EndDate;
  }
  public codegen_dimproduct with_EndDate(java.sql.Timestamp EndDate) {
    this.EndDate = EndDate;
    return this;
  }
  private String Status;
  public String get_Status() {
    return Status;
  }
  public void set_Status(String Status) {
    this.Status = Status;
  }
  public codegen_dimproduct with_Status(String Status) {
    this.Status = Status;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimproduct)) {
      return false;
    }
    codegen_dimproduct that = (codegen_dimproduct) o;
    boolean equal = true;
    equal = equal && (this.ProductKey == null ? that.ProductKey == null : this.ProductKey.equals(that.ProductKey));
    equal = equal && (this.ProductAlternateKey == null ? that.ProductAlternateKey == null : this.ProductAlternateKey.equals(that.ProductAlternateKey));
    equal = equal && (this.ProductSubcategoryKey == null ? that.ProductSubcategoryKey == null : this.ProductSubcategoryKey.equals(that.ProductSubcategoryKey));
    equal = equal && (this.WeightUnitMeasureCode == null ? that.WeightUnitMeasureCode == null : this.WeightUnitMeasureCode.equals(that.WeightUnitMeasureCode));
    equal = equal && (this.SizeUnitMeasureCode == null ? that.SizeUnitMeasureCode == null : this.SizeUnitMeasureCode.equals(that.SizeUnitMeasureCode));
    equal = equal && (this.EnglishProductName == null ? that.EnglishProductName == null : this.EnglishProductName.equals(that.EnglishProductName));
    equal = equal && (this.SpanishProductName == null ? that.SpanishProductName == null : this.SpanishProductName.equals(that.SpanishProductName));
    equal = equal && (this.FrenchProductName == null ? that.FrenchProductName == null : this.FrenchProductName.equals(that.FrenchProductName));
    equal = equal && (this.StandardCost == null ? that.StandardCost == null : this.StandardCost.equals(that.StandardCost));
    equal = equal && (this.FinishedGoodsFlag == null ? that.FinishedGoodsFlag == null : this.FinishedGoodsFlag.equals(that.FinishedGoodsFlag));
    equal = equal && (this.Color == null ? that.Color == null : this.Color.equals(that.Color));
    equal = equal && (this.SafetyStockLevel == null ? that.SafetyStockLevel == null : this.SafetyStockLevel.equals(that.SafetyStockLevel));
    equal = equal && (this.ReorderPoint == null ? that.ReorderPoint == null : this.ReorderPoint.equals(that.ReorderPoint));
    equal = equal && (this.ListPrice == null ? that.ListPrice == null : this.ListPrice.equals(that.ListPrice));
    equal = equal && (this.Size == null ? that.Size == null : this.Size.equals(that.Size));
    equal = equal && (this.SizeRange == null ? that.SizeRange == null : this.SizeRange.equals(that.SizeRange));
    equal = equal && (this.Weight == null ? that.Weight == null : this.Weight.equals(that.Weight));
    equal = equal && (this.DaysToManufacture == null ? that.DaysToManufacture == null : this.DaysToManufacture.equals(that.DaysToManufacture));
    equal = equal && (this.ProductLine == null ? that.ProductLine == null : this.ProductLine.equals(that.ProductLine));
    equal = equal && (this.DealerPrice == null ? that.DealerPrice == null : this.DealerPrice.equals(that.DealerPrice));
    equal = equal && (this.Class == null ? that.Class == null : this.Class.equals(that.Class));
    equal = equal && (this.Style == null ? that.Style == null : this.Style.equals(that.Style));
    equal = equal && (this.ModelName == null ? that.ModelName == null : this.ModelName.equals(that.ModelName));
    equal = equal && (this.LargePhoto == null ? that.LargePhoto == null : this.LargePhoto.equals(that.LargePhoto));
    equal = equal && (this.EnglishDescription == null ? that.EnglishDescription == null : this.EnglishDescription.equals(that.EnglishDescription));
    equal = equal && (this.FrenchDescription == null ? that.FrenchDescription == null : this.FrenchDescription.equals(that.FrenchDescription));
    equal = equal && (this.ChineseDescription == null ? that.ChineseDescription == null : this.ChineseDescription.equals(that.ChineseDescription));
    equal = equal && (this.ArabicDescription == null ? that.ArabicDescription == null : this.ArabicDescription.equals(that.ArabicDescription));
    equal = equal && (this.HebrewDescription == null ? that.HebrewDescription == null : this.HebrewDescription.equals(that.HebrewDescription));
    equal = equal && (this.ThaiDescription == null ? that.ThaiDescription == null : this.ThaiDescription.equals(that.ThaiDescription));
    equal = equal && (this.GermanDescription == null ? that.GermanDescription == null : this.GermanDescription.equals(that.GermanDescription));
    equal = equal && (this.JapaneseDescription == null ? that.JapaneseDescription == null : this.JapaneseDescription.equals(that.JapaneseDescription));
    equal = equal && (this.TurkishDescription == null ? that.TurkishDescription == null : this.TurkishDescription.equals(that.TurkishDescription));
    equal = equal && (this.StartDate == null ? that.StartDate == null : this.StartDate.equals(that.StartDate));
    equal = equal && (this.EndDate == null ? that.EndDate == null : this.EndDate.equals(that.EndDate));
    equal = equal && (this.Status == null ? that.Status == null : this.Status.equals(that.Status));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_dimproduct)) {
      return false;
    }
    codegen_dimproduct that = (codegen_dimproduct) o;
    boolean equal = true;
    equal = equal && (this.ProductKey == null ? that.ProductKey == null : this.ProductKey.equals(that.ProductKey));
    equal = equal && (this.ProductAlternateKey == null ? that.ProductAlternateKey == null : this.ProductAlternateKey.equals(that.ProductAlternateKey));
    equal = equal && (this.ProductSubcategoryKey == null ? that.ProductSubcategoryKey == null : this.ProductSubcategoryKey.equals(that.ProductSubcategoryKey));
    equal = equal && (this.WeightUnitMeasureCode == null ? that.WeightUnitMeasureCode == null : this.WeightUnitMeasureCode.equals(that.WeightUnitMeasureCode));
    equal = equal && (this.SizeUnitMeasureCode == null ? that.SizeUnitMeasureCode == null : this.SizeUnitMeasureCode.equals(that.SizeUnitMeasureCode));
    equal = equal && (this.EnglishProductName == null ? that.EnglishProductName == null : this.EnglishProductName.equals(that.EnglishProductName));
    equal = equal && (this.SpanishProductName == null ? that.SpanishProductName == null : this.SpanishProductName.equals(that.SpanishProductName));
    equal = equal && (this.FrenchProductName == null ? that.FrenchProductName == null : this.FrenchProductName.equals(that.FrenchProductName));
    equal = equal && (this.StandardCost == null ? that.StandardCost == null : this.StandardCost.equals(that.StandardCost));
    equal = equal && (this.FinishedGoodsFlag == null ? that.FinishedGoodsFlag == null : this.FinishedGoodsFlag.equals(that.FinishedGoodsFlag));
    equal = equal && (this.Color == null ? that.Color == null : this.Color.equals(that.Color));
    equal = equal && (this.SafetyStockLevel == null ? that.SafetyStockLevel == null : this.SafetyStockLevel.equals(that.SafetyStockLevel));
    equal = equal && (this.ReorderPoint == null ? that.ReorderPoint == null : this.ReorderPoint.equals(that.ReorderPoint));
    equal = equal && (this.ListPrice == null ? that.ListPrice == null : this.ListPrice.equals(that.ListPrice));
    equal = equal && (this.Size == null ? that.Size == null : this.Size.equals(that.Size));
    equal = equal && (this.SizeRange == null ? that.SizeRange == null : this.SizeRange.equals(that.SizeRange));
    equal = equal && (this.Weight == null ? that.Weight == null : this.Weight.equals(that.Weight));
    equal = equal && (this.DaysToManufacture == null ? that.DaysToManufacture == null : this.DaysToManufacture.equals(that.DaysToManufacture));
    equal = equal && (this.ProductLine == null ? that.ProductLine == null : this.ProductLine.equals(that.ProductLine));
    equal = equal && (this.DealerPrice == null ? that.DealerPrice == null : this.DealerPrice.equals(that.DealerPrice));
    equal = equal && (this.Class == null ? that.Class == null : this.Class.equals(that.Class));
    equal = equal && (this.Style == null ? that.Style == null : this.Style.equals(that.Style));
    equal = equal && (this.ModelName == null ? that.ModelName == null : this.ModelName.equals(that.ModelName));
    equal = equal && (this.LargePhoto == null ? that.LargePhoto == null : this.LargePhoto.equals(that.LargePhoto));
    equal = equal && (this.EnglishDescription == null ? that.EnglishDescription == null : this.EnglishDescription.equals(that.EnglishDescription));
    equal = equal && (this.FrenchDescription == null ? that.FrenchDescription == null : this.FrenchDescription.equals(that.FrenchDescription));
    equal = equal && (this.ChineseDescription == null ? that.ChineseDescription == null : this.ChineseDescription.equals(that.ChineseDescription));
    equal = equal && (this.ArabicDescription == null ? that.ArabicDescription == null : this.ArabicDescription.equals(that.ArabicDescription));
    equal = equal && (this.HebrewDescription == null ? that.HebrewDescription == null : this.HebrewDescription.equals(that.HebrewDescription));
    equal = equal && (this.ThaiDescription == null ? that.ThaiDescription == null : this.ThaiDescription.equals(that.ThaiDescription));
    equal = equal && (this.GermanDescription == null ? that.GermanDescription == null : this.GermanDescription.equals(that.GermanDescription));
    equal = equal && (this.JapaneseDescription == null ? that.JapaneseDescription == null : this.JapaneseDescription.equals(that.JapaneseDescription));
    equal = equal && (this.TurkishDescription == null ? that.TurkishDescription == null : this.TurkishDescription.equals(that.TurkishDescription));
    equal = equal && (this.StartDate == null ? that.StartDate == null : this.StartDate.equals(that.StartDate));
    equal = equal && (this.EndDate == null ? that.EndDate == null : this.EndDate.equals(that.EndDate));
    equal = equal && (this.Status == null ? that.Status == null : this.Status.equals(that.Status));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ProductKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.ProductAlternateKey = JdbcWritableBridge.readString(2, __dbResults);
    this.ProductSubcategoryKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.WeightUnitMeasureCode = JdbcWritableBridge.readString(4, __dbResults);
    this.SizeUnitMeasureCode = JdbcWritableBridge.readString(5, __dbResults);
    this.EnglishProductName = JdbcWritableBridge.readString(6, __dbResults);
    this.SpanishProductName = JdbcWritableBridge.readString(7, __dbResults);
    this.FrenchProductName = JdbcWritableBridge.readString(8, __dbResults);
    this.StandardCost = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.FinishedGoodsFlag = JdbcWritableBridge.readBoolean(10, __dbResults);
    this.Color = JdbcWritableBridge.readString(11, __dbResults);
    this.SafetyStockLevel = JdbcWritableBridge.readInteger(12, __dbResults);
    this.ReorderPoint = JdbcWritableBridge.readInteger(13, __dbResults);
    this.ListPrice = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.Size = JdbcWritableBridge.readString(15, __dbResults);
    this.SizeRange = JdbcWritableBridge.readString(16, __dbResults);
    this.Weight = JdbcWritableBridge.readDouble(17, __dbResults);
    this.DaysToManufacture = JdbcWritableBridge.readInteger(18, __dbResults);
    this.ProductLine = JdbcWritableBridge.readString(19, __dbResults);
    this.DealerPrice = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.Class = JdbcWritableBridge.readString(21, __dbResults);
    this.Style = JdbcWritableBridge.readString(22, __dbResults);
    this.ModelName = JdbcWritableBridge.readString(23, __dbResults);
    this.LargePhoto = JdbcWritableBridge.readBlobRef(24, __dbResults);
    this.EnglishDescription = JdbcWritableBridge.readString(25, __dbResults);
    this.FrenchDescription = JdbcWritableBridge.readString(26, __dbResults);
    this.ChineseDescription = JdbcWritableBridge.readString(27, __dbResults);
    this.ArabicDescription = JdbcWritableBridge.readString(28, __dbResults);
    this.HebrewDescription = JdbcWritableBridge.readString(29, __dbResults);
    this.ThaiDescription = JdbcWritableBridge.readString(30, __dbResults);
    this.GermanDescription = JdbcWritableBridge.readString(31, __dbResults);
    this.JapaneseDescription = JdbcWritableBridge.readString(32, __dbResults);
    this.TurkishDescription = JdbcWritableBridge.readString(33, __dbResults);
    this.StartDate = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.EndDate = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.Status = JdbcWritableBridge.readString(36, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ProductKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.ProductAlternateKey = JdbcWritableBridge.readString(2, __dbResults);
    this.ProductSubcategoryKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.WeightUnitMeasureCode = JdbcWritableBridge.readString(4, __dbResults);
    this.SizeUnitMeasureCode = JdbcWritableBridge.readString(5, __dbResults);
    this.EnglishProductName = JdbcWritableBridge.readString(6, __dbResults);
    this.SpanishProductName = JdbcWritableBridge.readString(7, __dbResults);
    this.FrenchProductName = JdbcWritableBridge.readString(8, __dbResults);
    this.StandardCost = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.FinishedGoodsFlag = JdbcWritableBridge.readBoolean(10, __dbResults);
    this.Color = JdbcWritableBridge.readString(11, __dbResults);
    this.SafetyStockLevel = JdbcWritableBridge.readInteger(12, __dbResults);
    this.ReorderPoint = JdbcWritableBridge.readInteger(13, __dbResults);
    this.ListPrice = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.Size = JdbcWritableBridge.readString(15, __dbResults);
    this.SizeRange = JdbcWritableBridge.readString(16, __dbResults);
    this.Weight = JdbcWritableBridge.readDouble(17, __dbResults);
    this.DaysToManufacture = JdbcWritableBridge.readInteger(18, __dbResults);
    this.ProductLine = JdbcWritableBridge.readString(19, __dbResults);
    this.DealerPrice = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.Class = JdbcWritableBridge.readString(21, __dbResults);
    this.Style = JdbcWritableBridge.readString(22, __dbResults);
    this.ModelName = JdbcWritableBridge.readString(23, __dbResults);
    this.LargePhoto = JdbcWritableBridge.readBlobRef(24, __dbResults);
    this.EnglishDescription = JdbcWritableBridge.readString(25, __dbResults);
    this.FrenchDescription = JdbcWritableBridge.readString(26, __dbResults);
    this.ChineseDescription = JdbcWritableBridge.readString(27, __dbResults);
    this.ArabicDescription = JdbcWritableBridge.readString(28, __dbResults);
    this.HebrewDescription = JdbcWritableBridge.readString(29, __dbResults);
    this.ThaiDescription = JdbcWritableBridge.readString(30, __dbResults);
    this.GermanDescription = JdbcWritableBridge.readString(31, __dbResults);
    this.JapaneseDescription = JdbcWritableBridge.readString(32, __dbResults);
    this.TurkishDescription = JdbcWritableBridge.readString(33, __dbResults);
    this.StartDate = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.EndDate = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.Status = JdbcWritableBridge.readString(36, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.LargePhoto = __loader.readBlobRef(24, this.__cur_result_set);
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.LargePhoto = __loader.readBlobRef(24, this.__cur_result_set);
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ProductKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(ProductAlternateKey, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductSubcategoryKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(WeightUnitMeasureCode, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(SizeUnitMeasureCode, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(EnglishProductName, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishProductName, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchProductName, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(StandardCost, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBoolean(FinishedGoodsFlag, 10 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(Color, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SafetyStockLevel, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(ReorderPoint, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ListPrice, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Size, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SizeRange, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(Weight, 17 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(DaysToManufacture, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(ProductLine, 19 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DealerPrice, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Class, 21 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Style, 22 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(ModelName, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBlobRef(LargePhoto, 24 + __off, -4, __dbStmt);
    JdbcWritableBridge.writeString(EnglishDescription, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchDescription, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ChineseDescription, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ArabicDescription, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HebrewDescription, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ThaiDescription, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GermanDescription, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(JapaneseDescription, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TurkishDescription, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(StartDate, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EndDate, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Status, 36 + __off, 12, __dbStmt);
    return 36;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ProductKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(ProductAlternateKey, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(ProductSubcategoryKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(WeightUnitMeasureCode, 4 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(SizeUnitMeasureCode, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(EnglishProductName, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SpanishProductName, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchProductName, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(StandardCost, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBoolean(FinishedGoodsFlag, 10 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(Color, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SafetyStockLevel, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(ReorderPoint, 13 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ListPrice, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Size, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SizeRange, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(Weight, 17 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(DaysToManufacture, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(ProductLine, 19 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(DealerPrice, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(Class, 21 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(Style, 22 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(ModelName, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBlobRef(LargePhoto, 24 + __off, -4, __dbStmt);
    JdbcWritableBridge.writeString(EnglishDescription, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FrenchDescription, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ChineseDescription, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ArabicDescription, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HebrewDescription, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ThaiDescription, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(GermanDescription, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(JapaneseDescription, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TurkishDescription, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(StartDate, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EndDate, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(Status, 36 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ProductKey = null;
    } else {
    this.ProductKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ProductAlternateKey = null;
    } else {
    this.ProductAlternateKey = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ProductSubcategoryKey = null;
    } else {
    this.ProductSubcategoryKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WeightUnitMeasureCode = null;
    } else {
    this.WeightUnitMeasureCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SizeUnitMeasureCode = null;
    } else {
    this.SizeUnitMeasureCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EnglishProductName = null;
    } else {
    this.EnglishProductName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SpanishProductName = null;
    } else {
    this.SpanishProductName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FrenchProductName = null;
    } else {
    this.FrenchProductName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.StandardCost = null;
    } else {
    this.StandardCost = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FinishedGoodsFlag = null;
    } else {
    this.FinishedGoodsFlag = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.Color = null;
    } else {
    this.Color = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SafetyStockLevel = null;
    } else {
    this.SafetyStockLevel = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ReorderPoint = null;
    } else {
    this.ReorderPoint = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ListPrice = null;
    } else {
    this.ListPrice = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Size = null;
    } else {
    this.Size = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SizeRange = null;
    } else {
    this.SizeRange = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Weight = null;
    } else {
    this.Weight = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.DaysToManufacture = null;
    } else {
    this.DaysToManufacture = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ProductLine = null;
    } else {
    this.ProductLine = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DealerPrice = null;
    } else {
    this.DealerPrice = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Class = null;
    } else {
    this.Class = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Style = null;
    } else {
    this.Style = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ModelName = null;
    } else {
    this.ModelName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LargePhoto = null;
    } else {
    this.LargePhoto = com.cloudera.sqoop.lib.LobSerializer.readBlobFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EnglishDescription = null;
    } else {
    this.EnglishDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FrenchDescription = null;
    } else {
    this.FrenchDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ChineseDescription = null;
    } else {
    this.ChineseDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ArabicDescription = null;
    } else {
    this.ArabicDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HebrewDescription = null;
    } else {
    this.HebrewDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ThaiDescription = null;
    } else {
    this.ThaiDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GermanDescription = null;
    } else {
    this.GermanDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.JapaneseDescription = null;
    } else {
    this.JapaneseDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TurkishDescription = null;
    } else {
    this.TurkishDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.StartDate = null;
    } else {
    this.StartDate = new Timestamp(__dataIn.readLong());
    this.StartDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.EndDate = null;
    } else {
    this.EndDate = new Timestamp(__dataIn.readLong());
    this.EndDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Status = null;
    } else {
    this.Status = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ProductKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductKey);
    }
    if (null == this.ProductAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductAlternateKey);
    }
    if (null == this.ProductSubcategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductSubcategoryKey);
    }
    if (null == this.WeightUnitMeasureCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WeightUnitMeasureCode);
    }
    if (null == this.SizeUnitMeasureCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SizeUnitMeasureCode);
    }
    if (null == this.EnglishProductName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishProductName);
    }
    if (null == this.SpanishProductName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishProductName);
    }
    if (null == this.FrenchProductName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchProductName);
    }
    if (null == this.StandardCost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.StandardCost, __dataOut);
    }
    if (null == this.FinishedGoodsFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.FinishedGoodsFlag);
    }
    if (null == this.Color) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Color);
    }
    if (null == this.SafetyStockLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SafetyStockLevel);
    }
    if (null == this.ReorderPoint) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ReorderPoint);
    }
    if (null == this.ListPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ListPrice, __dataOut);
    }
    if (null == this.Size) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Size);
    }
    if (null == this.SizeRange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SizeRange);
    }
    if (null == this.Weight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Weight);
    }
    if (null == this.DaysToManufacture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DaysToManufacture);
    }
    if (null == this.ProductLine) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductLine);
    }
    if (null == this.DealerPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DealerPrice, __dataOut);
    }
    if (null == this.Class) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Class);
    }
    if (null == this.Style) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Style);
    }
    if (null == this.ModelName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ModelName);
    }
    if (null == this.LargePhoto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeBlob(this.LargePhoto, __dataOut);
    }
    if (null == this.EnglishDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishDescription);
    }
    if (null == this.FrenchDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchDescription);
    }
    if (null == this.ChineseDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ChineseDescription);
    }
    if (null == this.ArabicDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ArabicDescription);
    }
    if (null == this.HebrewDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HebrewDescription);
    }
    if (null == this.ThaiDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ThaiDescription);
    }
    if (null == this.GermanDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GermanDescription);
    }
    if (null == this.JapaneseDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JapaneseDescription);
    }
    if (null == this.TurkishDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TurkishDescription);
    }
    if (null == this.StartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.StartDate.getTime());
    __dataOut.writeInt(this.StartDate.getNanos());
    }
    if (null == this.EndDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EndDate.getTime());
    __dataOut.writeInt(this.EndDate.getNanos());
    }
    if (null == this.Status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Status);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ProductKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductKey);
    }
    if (null == this.ProductAlternateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductAlternateKey);
    }
    if (null == this.ProductSubcategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductSubcategoryKey);
    }
    if (null == this.WeightUnitMeasureCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WeightUnitMeasureCode);
    }
    if (null == this.SizeUnitMeasureCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SizeUnitMeasureCode);
    }
    if (null == this.EnglishProductName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishProductName);
    }
    if (null == this.SpanishProductName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SpanishProductName);
    }
    if (null == this.FrenchProductName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchProductName);
    }
    if (null == this.StandardCost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.StandardCost, __dataOut);
    }
    if (null == this.FinishedGoodsFlag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.FinishedGoodsFlag);
    }
    if (null == this.Color) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Color);
    }
    if (null == this.SafetyStockLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SafetyStockLevel);
    }
    if (null == this.ReorderPoint) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ReorderPoint);
    }
    if (null == this.ListPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ListPrice, __dataOut);
    }
    if (null == this.Size) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Size);
    }
    if (null == this.SizeRange) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SizeRange);
    }
    if (null == this.Weight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Weight);
    }
    if (null == this.DaysToManufacture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DaysToManufacture);
    }
    if (null == this.ProductLine) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ProductLine);
    }
    if (null == this.DealerPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.DealerPrice, __dataOut);
    }
    if (null == this.Class) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Class);
    }
    if (null == this.Style) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Style);
    }
    if (null == this.ModelName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ModelName);
    }
    if (null == this.LargePhoto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeBlob(this.LargePhoto, __dataOut);
    }
    if (null == this.EnglishDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EnglishDescription);
    }
    if (null == this.FrenchDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FrenchDescription);
    }
    if (null == this.ChineseDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ChineseDescription);
    }
    if (null == this.ArabicDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ArabicDescription);
    }
    if (null == this.HebrewDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HebrewDescription);
    }
    if (null == this.ThaiDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ThaiDescription);
    }
    if (null == this.GermanDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GermanDescription);
    }
    if (null == this.JapaneseDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JapaneseDescription);
    }
    if (null == this.TurkishDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TurkishDescription);
    }
    if (null == this.StartDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.StartDate.getTime());
    __dataOut.writeInt(this.StartDate.getNanos());
    }
    if (null == this.EndDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EndDate.getTime());
    __dataOut.writeInt(this.EndDate.getNanos());
    }
    if (null == this.Status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Status);
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
    __sb.append(FieldFormatter.escapeAndEnclose(ProductKey==null?"null":"" + ProductKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductAlternateKey==null?"null":ProductAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductSubcategoryKey==null?"null":"" + ProductSubcategoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WeightUnitMeasureCode==null?"null":WeightUnitMeasureCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SizeUnitMeasureCode==null?"null":SizeUnitMeasureCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishProductName==null?"null":EnglishProductName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishProductName==null?"null":SpanishProductName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchProductName==null?"null":FrenchProductName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StandardCost==null?"null":StandardCost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FinishedGoodsFlag==null?"null":"" + FinishedGoodsFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Color==null?"null":Color, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SafetyStockLevel==null?"null":"" + SafetyStockLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ReorderPoint==null?"null":"" + ReorderPoint, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ListPrice==null?"null":ListPrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Size==null?"null":Size, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SizeRange==null?"null":SizeRange, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Weight==null?"null":"" + Weight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DaysToManufacture==null?"null":"" + DaysToManufacture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductLine==null?"null":ProductLine, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DealerPrice==null?"null":DealerPrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Class==null?"null":Class, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Style==null?"null":Style, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ModelName==null?"null":ModelName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LargePhoto==null?"null":"" + LargePhoto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishDescription==null?"null":EnglishDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchDescription==null?"null":FrenchDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ChineseDescription==null?"null":ChineseDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArabicDescription==null?"null":ArabicDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HebrewDescription==null?"null":HebrewDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ThaiDescription==null?"null":ThaiDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GermanDescription==null?"null":GermanDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JapaneseDescription==null?"null":JapaneseDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TurkishDescription==null?"null":TurkishDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StartDate==null?"null":"" + StartDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EndDate==null?"null":"" + EndDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Status==null?"null":Status, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ProductKey==null?"null":"" + ProductKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductAlternateKey==null?"null":ProductAlternateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductSubcategoryKey==null?"null":"" + ProductSubcategoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WeightUnitMeasureCode==null?"null":WeightUnitMeasureCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SizeUnitMeasureCode==null?"null":SizeUnitMeasureCode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishProductName==null?"null":EnglishProductName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SpanishProductName==null?"null":SpanishProductName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchProductName==null?"null":FrenchProductName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StandardCost==null?"null":StandardCost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FinishedGoodsFlag==null?"null":"" + FinishedGoodsFlag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Color==null?"null":Color, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SafetyStockLevel==null?"null":"" + SafetyStockLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ReorderPoint==null?"null":"" + ReorderPoint, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ListPrice==null?"null":ListPrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Size==null?"null":Size, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SizeRange==null?"null":SizeRange, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Weight==null?"null":"" + Weight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DaysToManufacture==null?"null":"" + DaysToManufacture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductLine==null?"null":ProductLine, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DealerPrice==null?"null":DealerPrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Class==null?"null":Class, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Style==null?"null":Style, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ModelName==null?"null":ModelName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LargePhoto==null?"null":"" + LargePhoto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EnglishDescription==null?"null":EnglishDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FrenchDescription==null?"null":FrenchDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ChineseDescription==null?"null":ChineseDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ArabicDescription==null?"null":ArabicDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HebrewDescription==null?"null":HebrewDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ThaiDescription==null?"null":ThaiDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GermanDescription==null?"null":GermanDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JapaneseDescription==null?"null":JapaneseDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TurkishDescription==null?"null":TurkishDescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(StartDate==null?"null":"" + StartDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EndDate==null?"null":"" + EndDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Status==null?"null":Status, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductKey = null; } else {
      this.ProductKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProductAlternateKey = null; } else {
      this.ProductAlternateKey = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductSubcategoryKey = null; } else {
      this.ProductSubcategoryKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WeightUnitMeasureCode = null; } else {
      this.WeightUnitMeasureCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SizeUnitMeasureCode = null; } else {
      this.SizeUnitMeasureCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishProductName = null; } else {
      this.EnglishProductName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishProductName = null; } else {
      this.SpanishProductName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchProductName = null; } else {
      this.FrenchProductName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.StandardCost = null; } else {
      this.StandardCost = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FinishedGoodsFlag = null; } else {
      this.FinishedGoodsFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Color = null; } else {
      this.Color = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SafetyStockLevel = null; } else {
      this.SafetyStockLevel = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ReorderPoint = null; } else {
      this.ReorderPoint = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ListPrice = null; } else {
      this.ListPrice = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Size = null; } else {
      this.Size = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SizeRange = null; } else {
      this.SizeRange = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Weight = null; } else {
      this.Weight = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DaysToManufacture = null; } else {
      this.DaysToManufacture = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProductLine = null; } else {
      this.ProductLine = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DealerPrice = null; } else {
      this.DealerPrice = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Class = null; } else {
      this.Class = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Style = null; } else {
      this.Style = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ModelName = null; } else {
      this.ModelName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LargePhoto = null; } else {
      this.LargePhoto = BlobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishDescription = null; } else {
      this.EnglishDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchDescription = null; } else {
      this.FrenchDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ChineseDescription = null; } else {
      this.ChineseDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ArabicDescription = null; } else {
      this.ArabicDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HebrewDescription = null; } else {
      this.HebrewDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ThaiDescription = null; } else {
      this.ThaiDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GermanDescription = null; } else {
      this.GermanDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.JapaneseDescription = null; } else {
      this.JapaneseDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TurkishDescription = null; } else {
      this.TurkishDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.StartDate = null; } else {
      this.StartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EndDate = null; } else {
      this.EndDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Status = null; } else {
      this.Status = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductKey = null; } else {
      this.ProductKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProductAlternateKey = null; } else {
      this.ProductAlternateKey = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductSubcategoryKey = null; } else {
      this.ProductSubcategoryKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WeightUnitMeasureCode = null; } else {
      this.WeightUnitMeasureCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SizeUnitMeasureCode = null; } else {
      this.SizeUnitMeasureCode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishProductName = null; } else {
      this.EnglishProductName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SpanishProductName = null; } else {
      this.SpanishProductName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchProductName = null; } else {
      this.FrenchProductName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.StandardCost = null; } else {
      this.StandardCost = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FinishedGoodsFlag = null; } else {
      this.FinishedGoodsFlag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Color = null; } else {
      this.Color = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SafetyStockLevel = null; } else {
      this.SafetyStockLevel = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ReorderPoint = null; } else {
      this.ReorderPoint = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ListPrice = null; } else {
      this.ListPrice = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Size = null; } else {
      this.Size = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SizeRange = null; } else {
      this.SizeRange = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Weight = null; } else {
      this.Weight = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DaysToManufacture = null; } else {
      this.DaysToManufacture = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ProductLine = null; } else {
      this.ProductLine = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DealerPrice = null; } else {
      this.DealerPrice = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Class = null; } else {
      this.Class = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Style = null; } else {
      this.Style = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ModelName = null; } else {
      this.ModelName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LargePhoto = null; } else {
      this.LargePhoto = BlobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EnglishDescription = null; } else {
      this.EnglishDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FrenchDescription = null; } else {
      this.FrenchDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ChineseDescription = null; } else {
      this.ChineseDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ArabicDescription = null; } else {
      this.ArabicDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HebrewDescription = null; } else {
      this.HebrewDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ThaiDescription = null; } else {
      this.ThaiDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GermanDescription = null; } else {
      this.GermanDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.JapaneseDescription = null; } else {
      this.JapaneseDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TurkishDescription = null; } else {
      this.TurkishDescription = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.StartDate = null; } else {
      this.StartDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EndDate = null; } else {
      this.EndDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Status = null; } else {
      this.Status = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_dimproduct o = (codegen_dimproduct) super.clone();
    o.LargePhoto = (o.LargePhoto != null) ? (com.cloudera.sqoop.lib.BlobRef) o.LargePhoto.clone() : null;
    o.StartDate = (o.StartDate != null) ? (java.sql.Timestamp) o.StartDate.clone() : null;
    o.EndDate = (o.EndDate != null) ? (java.sql.Timestamp) o.EndDate.clone() : null;
    return o;
  }

  public void clone0(codegen_dimproduct o) throws CloneNotSupportedException {
    o.LargePhoto = (o.LargePhoto != null) ? (com.cloudera.sqoop.lib.BlobRef) o.LargePhoto.clone() : null;
    o.StartDate = (o.StartDate != null) ? (java.sql.Timestamp) o.StartDate.clone() : null;
    o.EndDate = (o.EndDate != null) ? (java.sql.Timestamp) o.EndDate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ProductKey", this.ProductKey);
    __sqoop$field_map.put("ProductAlternateKey", this.ProductAlternateKey);
    __sqoop$field_map.put("ProductSubcategoryKey", this.ProductSubcategoryKey);
    __sqoop$field_map.put("WeightUnitMeasureCode", this.WeightUnitMeasureCode);
    __sqoop$field_map.put("SizeUnitMeasureCode", this.SizeUnitMeasureCode);
    __sqoop$field_map.put("EnglishProductName", this.EnglishProductName);
    __sqoop$field_map.put("SpanishProductName", this.SpanishProductName);
    __sqoop$field_map.put("FrenchProductName", this.FrenchProductName);
    __sqoop$field_map.put("StandardCost", this.StandardCost);
    __sqoop$field_map.put("FinishedGoodsFlag", this.FinishedGoodsFlag);
    __sqoop$field_map.put("Color", this.Color);
    __sqoop$field_map.put("SafetyStockLevel", this.SafetyStockLevel);
    __sqoop$field_map.put("ReorderPoint", this.ReorderPoint);
    __sqoop$field_map.put("ListPrice", this.ListPrice);
    __sqoop$field_map.put("Size", this.Size);
    __sqoop$field_map.put("SizeRange", this.SizeRange);
    __sqoop$field_map.put("Weight", this.Weight);
    __sqoop$field_map.put("DaysToManufacture", this.DaysToManufacture);
    __sqoop$field_map.put("ProductLine", this.ProductLine);
    __sqoop$field_map.put("DealerPrice", this.DealerPrice);
    __sqoop$field_map.put("Class", this.Class);
    __sqoop$field_map.put("Style", this.Style);
    __sqoop$field_map.put("ModelName", this.ModelName);
    __sqoop$field_map.put("LargePhoto", this.LargePhoto);
    __sqoop$field_map.put("EnglishDescription", this.EnglishDescription);
    __sqoop$field_map.put("FrenchDescription", this.FrenchDescription);
    __sqoop$field_map.put("ChineseDescription", this.ChineseDescription);
    __sqoop$field_map.put("ArabicDescription", this.ArabicDescription);
    __sqoop$field_map.put("HebrewDescription", this.HebrewDescription);
    __sqoop$field_map.put("ThaiDescription", this.ThaiDescription);
    __sqoop$field_map.put("GermanDescription", this.GermanDescription);
    __sqoop$field_map.put("JapaneseDescription", this.JapaneseDescription);
    __sqoop$field_map.put("TurkishDescription", this.TurkishDescription);
    __sqoop$field_map.put("StartDate", this.StartDate);
    __sqoop$field_map.put("EndDate", this.EndDate);
    __sqoop$field_map.put("Status", this.Status);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ProductKey", this.ProductKey);
    __sqoop$field_map.put("ProductAlternateKey", this.ProductAlternateKey);
    __sqoop$field_map.put("ProductSubcategoryKey", this.ProductSubcategoryKey);
    __sqoop$field_map.put("WeightUnitMeasureCode", this.WeightUnitMeasureCode);
    __sqoop$field_map.put("SizeUnitMeasureCode", this.SizeUnitMeasureCode);
    __sqoop$field_map.put("EnglishProductName", this.EnglishProductName);
    __sqoop$field_map.put("SpanishProductName", this.SpanishProductName);
    __sqoop$field_map.put("FrenchProductName", this.FrenchProductName);
    __sqoop$field_map.put("StandardCost", this.StandardCost);
    __sqoop$field_map.put("FinishedGoodsFlag", this.FinishedGoodsFlag);
    __sqoop$field_map.put("Color", this.Color);
    __sqoop$field_map.put("SafetyStockLevel", this.SafetyStockLevel);
    __sqoop$field_map.put("ReorderPoint", this.ReorderPoint);
    __sqoop$field_map.put("ListPrice", this.ListPrice);
    __sqoop$field_map.put("Size", this.Size);
    __sqoop$field_map.put("SizeRange", this.SizeRange);
    __sqoop$field_map.put("Weight", this.Weight);
    __sqoop$field_map.put("DaysToManufacture", this.DaysToManufacture);
    __sqoop$field_map.put("ProductLine", this.ProductLine);
    __sqoop$field_map.put("DealerPrice", this.DealerPrice);
    __sqoop$field_map.put("Class", this.Class);
    __sqoop$field_map.put("Style", this.Style);
    __sqoop$field_map.put("ModelName", this.ModelName);
    __sqoop$field_map.put("LargePhoto", this.LargePhoto);
    __sqoop$field_map.put("EnglishDescription", this.EnglishDescription);
    __sqoop$field_map.put("FrenchDescription", this.FrenchDescription);
    __sqoop$field_map.put("ChineseDescription", this.ChineseDescription);
    __sqoop$field_map.put("ArabicDescription", this.ArabicDescription);
    __sqoop$field_map.put("HebrewDescription", this.HebrewDescription);
    __sqoop$field_map.put("ThaiDescription", this.ThaiDescription);
    __sqoop$field_map.put("GermanDescription", this.GermanDescription);
    __sqoop$field_map.put("JapaneseDescription", this.JapaneseDescription);
    __sqoop$field_map.put("TurkishDescription", this.TurkishDescription);
    __sqoop$field_map.put("StartDate", this.StartDate);
    __sqoop$field_map.put("EndDate", this.EndDate);
    __sqoop$field_map.put("Status", this.Status);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
