// ORM class for table 'factinternetsales'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 05 02:02:11 PST 2018
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

public class codegen_factinternetsales extends SqoopRecord  implements DBWritable, Writable {
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
    setters.put("OrderDateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OrderDateKey = (Integer)value;
      }
    });
    setters.put("DueDateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DueDateKey = (Integer)value;
      }
    });
    setters.put("ShipDateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ShipDateKey = (Integer)value;
      }
    });
    setters.put("CustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CustomerKey = (Integer)value;
      }
    });
    setters.put("PromotionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PromotionKey = (Integer)value;
      }
    });
    setters.put("CurrencyKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CurrencyKey = (Integer)value;
      }
    });
    setters.put("SalesTerritoryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SalesTerritoryKey = (Integer)value;
      }
    });
    setters.put("SalesOrderNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SalesOrderNumber = (String)value;
      }
    });
    setters.put("SalesOrderLineNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SalesOrderLineNumber = (Integer)value;
      }
    });
    setters.put("RevisionNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        RevisionNumber = (Integer)value;
      }
    });
    setters.put("OrderQuantity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        OrderQuantity = (Integer)value;
      }
    });
    setters.put("UnitPrice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        UnitPrice = (java.math.BigDecimal)value;
      }
    });
    setters.put("ExtendedAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ExtendedAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("UnitPriceDiscountPct", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        UnitPriceDiscountPct = (Double)value;
      }
    });
    setters.put("DiscountAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DiscountAmount = (Double)value;
      }
    });
    setters.put("ProductStandardCost", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ProductStandardCost = (java.math.BigDecimal)value;
      }
    });
    setters.put("TotalProductCost", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TotalProductCost = (java.math.BigDecimal)value;
      }
    });
    setters.put("SalesAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SalesAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("TaxAmt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TaxAmt = (java.math.BigDecimal)value;
      }
    });
    setters.put("Freight", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Freight = (java.math.BigDecimal)value;
      }
    });
    setters.put("CarrierTrackingNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CarrierTrackingNumber = (String)value;
      }
    });
    setters.put("CustomerPONumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CustomerPONumber = (String)value;
      }
    });
  }
  public codegen_factinternetsales() {
    init0();
  }
  private Integer ProductKey;
  public Integer get_ProductKey() {
    return ProductKey;
  }
  public void set_ProductKey(Integer ProductKey) {
    this.ProductKey = ProductKey;
  }
  public codegen_factinternetsales with_ProductKey(Integer ProductKey) {
    this.ProductKey = ProductKey;
    return this;
  }
  private Integer OrderDateKey;
  public Integer get_OrderDateKey() {
    return OrderDateKey;
  }
  public void set_OrderDateKey(Integer OrderDateKey) {
    this.OrderDateKey = OrderDateKey;
  }
  public codegen_factinternetsales with_OrderDateKey(Integer OrderDateKey) {
    this.OrderDateKey = OrderDateKey;
    return this;
  }
  private Integer DueDateKey;
  public Integer get_DueDateKey() {
    return DueDateKey;
  }
  public void set_DueDateKey(Integer DueDateKey) {
    this.DueDateKey = DueDateKey;
  }
  public codegen_factinternetsales with_DueDateKey(Integer DueDateKey) {
    this.DueDateKey = DueDateKey;
    return this;
  }
  private Integer ShipDateKey;
  public Integer get_ShipDateKey() {
    return ShipDateKey;
  }
  public void set_ShipDateKey(Integer ShipDateKey) {
    this.ShipDateKey = ShipDateKey;
  }
  public codegen_factinternetsales with_ShipDateKey(Integer ShipDateKey) {
    this.ShipDateKey = ShipDateKey;
    return this;
  }
  private Integer CustomerKey;
  public Integer get_CustomerKey() {
    return CustomerKey;
  }
  public void set_CustomerKey(Integer CustomerKey) {
    this.CustomerKey = CustomerKey;
  }
  public codegen_factinternetsales with_CustomerKey(Integer CustomerKey) {
    this.CustomerKey = CustomerKey;
    return this;
  }
  private Integer PromotionKey;
  public Integer get_PromotionKey() {
    return PromotionKey;
  }
  public void set_PromotionKey(Integer PromotionKey) {
    this.PromotionKey = PromotionKey;
  }
  public codegen_factinternetsales with_PromotionKey(Integer PromotionKey) {
    this.PromotionKey = PromotionKey;
    return this;
  }
  private Integer CurrencyKey;
  public Integer get_CurrencyKey() {
    return CurrencyKey;
  }
  public void set_CurrencyKey(Integer CurrencyKey) {
    this.CurrencyKey = CurrencyKey;
  }
  public codegen_factinternetsales with_CurrencyKey(Integer CurrencyKey) {
    this.CurrencyKey = CurrencyKey;
    return this;
  }
  private Integer SalesTerritoryKey;
  public Integer get_SalesTerritoryKey() {
    return SalesTerritoryKey;
  }
  public void set_SalesTerritoryKey(Integer SalesTerritoryKey) {
    this.SalesTerritoryKey = SalesTerritoryKey;
  }
  public codegen_factinternetsales with_SalesTerritoryKey(Integer SalesTerritoryKey) {
    this.SalesTerritoryKey = SalesTerritoryKey;
    return this;
  }
  private String SalesOrderNumber;
  public String get_SalesOrderNumber() {
    return SalesOrderNumber;
  }
  public void set_SalesOrderNumber(String SalesOrderNumber) {
    this.SalesOrderNumber = SalesOrderNumber;
  }
  public codegen_factinternetsales with_SalesOrderNumber(String SalesOrderNumber) {
    this.SalesOrderNumber = SalesOrderNumber;
    return this;
  }
  private Integer SalesOrderLineNumber;
  public Integer get_SalesOrderLineNumber() {
    return SalesOrderLineNumber;
  }
  public void set_SalesOrderLineNumber(Integer SalesOrderLineNumber) {
    this.SalesOrderLineNumber = SalesOrderLineNumber;
  }
  public codegen_factinternetsales with_SalesOrderLineNumber(Integer SalesOrderLineNumber) {
    this.SalesOrderLineNumber = SalesOrderLineNumber;
    return this;
  }
  private Integer RevisionNumber;
  public Integer get_RevisionNumber() {
    return RevisionNumber;
  }
  public void set_RevisionNumber(Integer RevisionNumber) {
    this.RevisionNumber = RevisionNumber;
  }
  public codegen_factinternetsales with_RevisionNumber(Integer RevisionNumber) {
    this.RevisionNumber = RevisionNumber;
    return this;
  }
  private Integer OrderQuantity;
  public Integer get_OrderQuantity() {
    return OrderQuantity;
  }
  public void set_OrderQuantity(Integer OrderQuantity) {
    this.OrderQuantity = OrderQuantity;
  }
  public codegen_factinternetsales with_OrderQuantity(Integer OrderQuantity) {
    this.OrderQuantity = OrderQuantity;
    return this;
  }
  private java.math.BigDecimal UnitPrice;
  public java.math.BigDecimal get_UnitPrice() {
    return UnitPrice;
  }
  public void set_UnitPrice(java.math.BigDecimal UnitPrice) {
    this.UnitPrice = UnitPrice;
  }
  public codegen_factinternetsales with_UnitPrice(java.math.BigDecimal UnitPrice) {
    this.UnitPrice = UnitPrice;
    return this;
  }
  private java.math.BigDecimal ExtendedAmount;
  public java.math.BigDecimal get_ExtendedAmount() {
    return ExtendedAmount;
  }
  public void set_ExtendedAmount(java.math.BigDecimal ExtendedAmount) {
    this.ExtendedAmount = ExtendedAmount;
  }
  public codegen_factinternetsales with_ExtendedAmount(java.math.BigDecimal ExtendedAmount) {
    this.ExtendedAmount = ExtendedAmount;
    return this;
  }
  private Double UnitPriceDiscountPct;
  public Double get_UnitPriceDiscountPct() {
    return UnitPriceDiscountPct;
  }
  public void set_UnitPriceDiscountPct(Double UnitPriceDiscountPct) {
    this.UnitPriceDiscountPct = UnitPriceDiscountPct;
  }
  public codegen_factinternetsales with_UnitPriceDiscountPct(Double UnitPriceDiscountPct) {
    this.UnitPriceDiscountPct = UnitPriceDiscountPct;
    return this;
  }
  private Double DiscountAmount;
  public Double get_DiscountAmount() {
    return DiscountAmount;
  }
  public void set_DiscountAmount(Double DiscountAmount) {
    this.DiscountAmount = DiscountAmount;
  }
  public codegen_factinternetsales with_DiscountAmount(Double DiscountAmount) {
    this.DiscountAmount = DiscountAmount;
    return this;
  }
  private java.math.BigDecimal ProductStandardCost;
  public java.math.BigDecimal get_ProductStandardCost() {
    return ProductStandardCost;
  }
  public void set_ProductStandardCost(java.math.BigDecimal ProductStandardCost) {
    this.ProductStandardCost = ProductStandardCost;
  }
  public codegen_factinternetsales with_ProductStandardCost(java.math.BigDecimal ProductStandardCost) {
    this.ProductStandardCost = ProductStandardCost;
    return this;
  }
  private java.math.BigDecimal TotalProductCost;
  public java.math.BigDecimal get_TotalProductCost() {
    return TotalProductCost;
  }
  public void set_TotalProductCost(java.math.BigDecimal TotalProductCost) {
    this.TotalProductCost = TotalProductCost;
  }
  public codegen_factinternetsales with_TotalProductCost(java.math.BigDecimal TotalProductCost) {
    this.TotalProductCost = TotalProductCost;
    return this;
  }
  private java.math.BigDecimal SalesAmount;
  public java.math.BigDecimal get_SalesAmount() {
    return SalesAmount;
  }
  public void set_SalesAmount(java.math.BigDecimal SalesAmount) {
    this.SalesAmount = SalesAmount;
  }
  public codegen_factinternetsales with_SalesAmount(java.math.BigDecimal SalesAmount) {
    this.SalesAmount = SalesAmount;
    return this;
  }
  private java.math.BigDecimal TaxAmt;
  public java.math.BigDecimal get_TaxAmt() {
    return TaxAmt;
  }
  public void set_TaxAmt(java.math.BigDecimal TaxAmt) {
    this.TaxAmt = TaxAmt;
  }
  public codegen_factinternetsales with_TaxAmt(java.math.BigDecimal TaxAmt) {
    this.TaxAmt = TaxAmt;
    return this;
  }
  private java.math.BigDecimal Freight;
  public java.math.BigDecimal get_Freight() {
    return Freight;
  }
  public void set_Freight(java.math.BigDecimal Freight) {
    this.Freight = Freight;
  }
  public codegen_factinternetsales with_Freight(java.math.BigDecimal Freight) {
    this.Freight = Freight;
    return this;
  }
  private String CarrierTrackingNumber;
  public String get_CarrierTrackingNumber() {
    return CarrierTrackingNumber;
  }
  public void set_CarrierTrackingNumber(String CarrierTrackingNumber) {
    this.CarrierTrackingNumber = CarrierTrackingNumber;
  }
  public codegen_factinternetsales with_CarrierTrackingNumber(String CarrierTrackingNumber) {
    this.CarrierTrackingNumber = CarrierTrackingNumber;
    return this;
  }
  private String CustomerPONumber;
  public String get_CustomerPONumber() {
    return CustomerPONumber;
  }
  public void set_CustomerPONumber(String CustomerPONumber) {
    this.CustomerPONumber = CustomerPONumber;
  }
  public codegen_factinternetsales with_CustomerPONumber(String CustomerPONumber) {
    this.CustomerPONumber = CustomerPONumber;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_factinternetsales)) {
      return false;
    }
    codegen_factinternetsales that = (codegen_factinternetsales) o;
    boolean equal = true;
    equal = equal && (this.ProductKey == null ? that.ProductKey == null : this.ProductKey.equals(that.ProductKey));
    equal = equal && (this.OrderDateKey == null ? that.OrderDateKey == null : this.OrderDateKey.equals(that.OrderDateKey));
    equal = equal && (this.DueDateKey == null ? that.DueDateKey == null : this.DueDateKey.equals(that.DueDateKey));
    equal = equal && (this.ShipDateKey == null ? that.ShipDateKey == null : this.ShipDateKey.equals(that.ShipDateKey));
    equal = equal && (this.CustomerKey == null ? that.CustomerKey == null : this.CustomerKey.equals(that.CustomerKey));
    equal = equal && (this.PromotionKey == null ? that.PromotionKey == null : this.PromotionKey.equals(that.PromotionKey));
    equal = equal && (this.CurrencyKey == null ? that.CurrencyKey == null : this.CurrencyKey.equals(that.CurrencyKey));
    equal = equal && (this.SalesTerritoryKey == null ? that.SalesTerritoryKey == null : this.SalesTerritoryKey.equals(that.SalesTerritoryKey));
    equal = equal && (this.SalesOrderNumber == null ? that.SalesOrderNumber == null : this.SalesOrderNumber.equals(that.SalesOrderNumber));
    equal = equal && (this.SalesOrderLineNumber == null ? that.SalesOrderLineNumber == null : this.SalesOrderLineNumber.equals(that.SalesOrderLineNumber));
    equal = equal && (this.RevisionNumber == null ? that.RevisionNumber == null : this.RevisionNumber.equals(that.RevisionNumber));
    equal = equal && (this.OrderQuantity == null ? that.OrderQuantity == null : this.OrderQuantity.equals(that.OrderQuantity));
    equal = equal && (this.UnitPrice == null ? that.UnitPrice == null : this.UnitPrice.equals(that.UnitPrice));
    equal = equal && (this.ExtendedAmount == null ? that.ExtendedAmount == null : this.ExtendedAmount.equals(that.ExtendedAmount));
    equal = equal && (this.UnitPriceDiscountPct == null ? that.UnitPriceDiscountPct == null : this.UnitPriceDiscountPct.equals(that.UnitPriceDiscountPct));
    equal = equal && (this.DiscountAmount == null ? that.DiscountAmount == null : this.DiscountAmount.equals(that.DiscountAmount));
    equal = equal && (this.ProductStandardCost == null ? that.ProductStandardCost == null : this.ProductStandardCost.equals(that.ProductStandardCost));
    equal = equal && (this.TotalProductCost == null ? that.TotalProductCost == null : this.TotalProductCost.equals(that.TotalProductCost));
    equal = equal && (this.SalesAmount == null ? that.SalesAmount == null : this.SalesAmount.equals(that.SalesAmount));
    equal = equal && (this.TaxAmt == null ? that.TaxAmt == null : this.TaxAmt.equals(that.TaxAmt));
    equal = equal && (this.Freight == null ? that.Freight == null : this.Freight.equals(that.Freight));
    equal = equal && (this.CarrierTrackingNumber == null ? that.CarrierTrackingNumber == null : this.CarrierTrackingNumber.equals(that.CarrierTrackingNumber));
    equal = equal && (this.CustomerPONumber == null ? that.CustomerPONumber == null : this.CustomerPONumber.equals(that.CustomerPONumber));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_factinternetsales)) {
      return false;
    }
    codegen_factinternetsales that = (codegen_factinternetsales) o;
    boolean equal = true;
    equal = equal && (this.ProductKey == null ? that.ProductKey == null : this.ProductKey.equals(that.ProductKey));
    equal = equal && (this.OrderDateKey == null ? that.OrderDateKey == null : this.OrderDateKey.equals(that.OrderDateKey));
    equal = equal && (this.DueDateKey == null ? that.DueDateKey == null : this.DueDateKey.equals(that.DueDateKey));
    equal = equal && (this.ShipDateKey == null ? that.ShipDateKey == null : this.ShipDateKey.equals(that.ShipDateKey));
    equal = equal && (this.CustomerKey == null ? that.CustomerKey == null : this.CustomerKey.equals(that.CustomerKey));
    equal = equal && (this.PromotionKey == null ? that.PromotionKey == null : this.PromotionKey.equals(that.PromotionKey));
    equal = equal && (this.CurrencyKey == null ? that.CurrencyKey == null : this.CurrencyKey.equals(that.CurrencyKey));
    equal = equal && (this.SalesTerritoryKey == null ? that.SalesTerritoryKey == null : this.SalesTerritoryKey.equals(that.SalesTerritoryKey));
    equal = equal && (this.SalesOrderNumber == null ? that.SalesOrderNumber == null : this.SalesOrderNumber.equals(that.SalesOrderNumber));
    equal = equal && (this.SalesOrderLineNumber == null ? that.SalesOrderLineNumber == null : this.SalesOrderLineNumber.equals(that.SalesOrderLineNumber));
    equal = equal && (this.RevisionNumber == null ? that.RevisionNumber == null : this.RevisionNumber.equals(that.RevisionNumber));
    equal = equal && (this.OrderQuantity == null ? that.OrderQuantity == null : this.OrderQuantity.equals(that.OrderQuantity));
    equal = equal && (this.UnitPrice == null ? that.UnitPrice == null : this.UnitPrice.equals(that.UnitPrice));
    equal = equal && (this.ExtendedAmount == null ? that.ExtendedAmount == null : this.ExtendedAmount.equals(that.ExtendedAmount));
    equal = equal && (this.UnitPriceDiscountPct == null ? that.UnitPriceDiscountPct == null : this.UnitPriceDiscountPct.equals(that.UnitPriceDiscountPct));
    equal = equal && (this.DiscountAmount == null ? that.DiscountAmount == null : this.DiscountAmount.equals(that.DiscountAmount));
    equal = equal && (this.ProductStandardCost == null ? that.ProductStandardCost == null : this.ProductStandardCost.equals(that.ProductStandardCost));
    equal = equal && (this.TotalProductCost == null ? that.TotalProductCost == null : this.TotalProductCost.equals(that.TotalProductCost));
    equal = equal && (this.SalesAmount == null ? that.SalesAmount == null : this.SalesAmount.equals(that.SalesAmount));
    equal = equal && (this.TaxAmt == null ? that.TaxAmt == null : this.TaxAmt.equals(that.TaxAmt));
    equal = equal && (this.Freight == null ? that.Freight == null : this.Freight.equals(that.Freight));
    equal = equal && (this.CarrierTrackingNumber == null ? that.CarrierTrackingNumber == null : this.CarrierTrackingNumber.equals(that.CarrierTrackingNumber));
    equal = equal && (this.CustomerPONumber == null ? that.CustomerPONumber == null : this.CustomerPONumber.equals(that.CustomerPONumber));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ProductKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.OrderDateKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.DueDateKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.ShipDateKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.CustomerKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.PromotionKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.CurrencyKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.SalesTerritoryKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.SalesOrderNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.SalesOrderLineNumber = JdbcWritableBridge.readInteger(10, __dbResults);
    this.RevisionNumber = JdbcWritableBridge.readInteger(11, __dbResults);
    this.OrderQuantity = JdbcWritableBridge.readInteger(12, __dbResults);
    this.UnitPrice = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.ExtendedAmount = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.UnitPriceDiscountPct = JdbcWritableBridge.readDouble(15, __dbResults);
    this.DiscountAmount = JdbcWritableBridge.readDouble(16, __dbResults);
    this.ProductStandardCost = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.TotalProductCost = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.SalesAmount = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.TaxAmt = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.Freight = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.CarrierTrackingNumber = JdbcWritableBridge.readString(22, __dbResults);
    this.CustomerPONumber = JdbcWritableBridge.readString(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ProductKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.OrderDateKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.DueDateKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.ShipDateKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.CustomerKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.PromotionKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.CurrencyKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.SalesTerritoryKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.SalesOrderNumber = JdbcWritableBridge.readString(9, __dbResults);
    this.SalesOrderLineNumber = JdbcWritableBridge.readInteger(10, __dbResults);
    this.RevisionNumber = JdbcWritableBridge.readInteger(11, __dbResults);
    this.OrderQuantity = JdbcWritableBridge.readInteger(12, __dbResults);
    this.UnitPrice = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.ExtendedAmount = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.UnitPriceDiscountPct = JdbcWritableBridge.readDouble(15, __dbResults);
    this.DiscountAmount = JdbcWritableBridge.readDouble(16, __dbResults);
    this.ProductStandardCost = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.TotalProductCost = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.SalesAmount = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.TaxAmt = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.Freight = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.CarrierTrackingNumber = JdbcWritableBridge.readString(22, __dbResults);
    this.CustomerPONumber = JdbcWritableBridge.readString(23, __dbResults);
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
    JdbcWritableBridge.writeInteger(ProductKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(OrderDateKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DueDateKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ShipDateKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CustomerKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(PromotionKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CurrencyKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesTerritoryKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(SalesOrderNumber, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesOrderLineNumber, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(RevisionNumber, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(OrderQuantity, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UnitPrice, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ExtendedAmount, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(UnitPriceDiscountPct, 15 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(DiscountAmount, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ProductStandardCost, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TotalProductCost, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SalesAmount, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TaxAmt, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Freight, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(CarrierTrackingNumber, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CustomerPONumber, 23 + __off, 12, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ProductKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(OrderDateKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DueDateKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ShipDateKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CustomerKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(PromotionKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(CurrencyKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesTerritoryKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(SalesOrderNumber, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(SalesOrderLineNumber, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(RevisionNumber, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(OrderQuantity, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UnitPrice, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ExtendedAmount, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeDouble(UnitPriceDiscountPct, 15 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(DiscountAmount, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ProductStandardCost, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TotalProductCost, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SalesAmount, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(TaxAmt, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(Freight, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(CarrierTrackingNumber, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CustomerPONumber, 23 + __off, 12, __dbStmt);
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
        this.OrderDateKey = null;
    } else {
    this.OrderDateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DueDateKey = null;
    } else {
    this.DueDateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ShipDateKey = null;
    } else {
    this.ShipDateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CustomerKey = null;
    } else {
    this.CustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.PromotionKey = null;
    } else {
    this.PromotionKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.CurrencyKey = null;
    } else {
    this.CurrencyKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SalesTerritoryKey = null;
    } else {
    this.SalesTerritoryKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SalesOrderNumber = null;
    } else {
    this.SalesOrderNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SalesOrderLineNumber = null;
    } else {
    this.SalesOrderLineNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.RevisionNumber = null;
    } else {
    this.RevisionNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.OrderQuantity = null;
    } else {
    this.OrderQuantity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.UnitPrice = null;
    } else {
    this.UnitPrice = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ExtendedAmount = null;
    } else {
    this.ExtendedAmount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UnitPriceDiscountPct = null;
    } else {
    this.UnitPriceDiscountPct = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.DiscountAmount = null;
    } else {
    this.DiscountAmount = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.ProductStandardCost = null;
    } else {
    this.ProductStandardCost = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TotalProductCost = null;
    } else {
    this.TotalProductCost = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SalesAmount = null;
    } else {
    this.SalesAmount = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TaxAmt = null;
    } else {
    this.TaxAmt = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Freight = null;
    } else {
    this.Freight = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CarrierTrackingNumber = null;
    } else {
    this.CarrierTrackingNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CustomerPONumber = null;
    } else {
    this.CustomerPONumber = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ProductKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductKey);
    }
    if (null == this.OrderDateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OrderDateKey);
    }
    if (null == this.DueDateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DueDateKey);
    }
    if (null == this.ShipDateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ShipDateKey);
    }
    if (null == this.CustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CustomerKey);
    }
    if (null == this.PromotionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.PromotionKey);
    }
    if (null == this.CurrencyKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CurrencyKey);
    }
    if (null == this.SalesTerritoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesTerritoryKey);
    }
    if (null == this.SalesOrderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SalesOrderNumber);
    }
    if (null == this.SalesOrderLineNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesOrderLineNumber);
    }
    if (null == this.RevisionNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.RevisionNumber);
    }
    if (null == this.OrderQuantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OrderQuantity);
    }
    if (null == this.UnitPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UnitPrice, __dataOut);
    }
    if (null == this.ExtendedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ExtendedAmount, __dataOut);
    }
    if (null == this.UnitPriceDiscountPct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.UnitPriceDiscountPct);
    }
    if (null == this.DiscountAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.DiscountAmount);
    }
    if (null == this.ProductStandardCost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ProductStandardCost, __dataOut);
    }
    if (null == this.TotalProductCost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TotalProductCost, __dataOut);
    }
    if (null == this.SalesAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SalesAmount, __dataOut);
    }
    if (null == this.TaxAmt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TaxAmt, __dataOut);
    }
    if (null == this.Freight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Freight, __dataOut);
    }
    if (null == this.CarrierTrackingNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CarrierTrackingNumber);
    }
    if (null == this.CustomerPONumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CustomerPONumber);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ProductKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ProductKey);
    }
    if (null == this.OrderDateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OrderDateKey);
    }
    if (null == this.DueDateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DueDateKey);
    }
    if (null == this.ShipDateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ShipDateKey);
    }
    if (null == this.CustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CustomerKey);
    }
    if (null == this.PromotionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.PromotionKey);
    }
    if (null == this.CurrencyKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.CurrencyKey);
    }
    if (null == this.SalesTerritoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesTerritoryKey);
    }
    if (null == this.SalesOrderNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SalesOrderNumber);
    }
    if (null == this.SalesOrderLineNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SalesOrderLineNumber);
    }
    if (null == this.RevisionNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.RevisionNumber);
    }
    if (null == this.OrderQuantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.OrderQuantity);
    }
    if (null == this.UnitPrice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UnitPrice, __dataOut);
    }
    if (null == this.ExtendedAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ExtendedAmount, __dataOut);
    }
    if (null == this.UnitPriceDiscountPct) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.UnitPriceDiscountPct);
    }
    if (null == this.DiscountAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.DiscountAmount);
    }
    if (null == this.ProductStandardCost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ProductStandardCost, __dataOut);
    }
    if (null == this.TotalProductCost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TotalProductCost, __dataOut);
    }
    if (null == this.SalesAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SalesAmount, __dataOut);
    }
    if (null == this.TaxAmt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.TaxAmt, __dataOut);
    }
    if (null == this.Freight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.Freight, __dataOut);
    }
    if (null == this.CarrierTrackingNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CarrierTrackingNumber);
    }
    if (null == this.CustomerPONumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CustomerPONumber);
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
    __sb.append(FieldFormatter.escapeAndEnclose(OrderDateKey==null?"null":"" + OrderDateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DueDateKey==null?"null":"" + DueDateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipDateKey==null?"null":"" + ShipDateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerKey==null?"null":"" + CustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PromotionKey==null?"null":"" + PromotionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyKey==null?"null":"" + CurrencyKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryKey==null?"null":"" + SalesTerritoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesOrderNumber==null?"null":SalesOrderNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesOrderLineNumber==null?"null":"" + SalesOrderLineNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RevisionNumber==null?"null":"" + RevisionNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OrderQuantity==null?"null":"" + OrderQuantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPrice==null?"null":UnitPrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ExtendedAmount==null?"null":ExtendedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPriceDiscountPct==null?"null":"" + UnitPriceDiscountPct, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DiscountAmount==null?"null":"" + DiscountAmount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductStandardCost==null?"null":ProductStandardCost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TotalProductCost==null?"null":TotalProductCost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesAmount==null?"null":SalesAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxAmt==null?"null":TaxAmt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Freight==null?"null":Freight.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarrierTrackingNumber==null?"null":CarrierTrackingNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerPONumber==null?"null":CustomerPONumber, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ProductKey==null?"null":"" + ProductKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OrderDateKey==null?"null":"" + OrderDateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DueDateKey==null?"null":"" + DueDateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ShipDateKey==null?"null":"" + ShipDateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerKey==null?"null":"" + CustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PromotionKey==null?"null":"" + PromotionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CurrencyKey==null?"null":"" + CurrencyKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesTerritoryKey==null?"null":"" + SalesTerritoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesOrderNumber==null?"null":SalesOrderNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesOrderLineNumber==null?"null":"" + SalesOrderLineNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RevisionNumber==null?"null":"" + RevisionNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(OrderQuantity==null?"null":"" + OrderQuantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPrice==null?"null":UnitPrice.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ExtendedAmount==null?"null":ExtendedAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UnitPriceDiscountPct==null?"null":"" + UnitPriceDiscountPct, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DiscountAmount==null?"null":"" + DiscountAmount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ProductStandardCost==null?"null":ProductStandardCost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TotalProductCost==null?"null":TotalProductCost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SalesAmount==null?"null":SalesAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TaxAmt==null?"null":TaxAmt.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Freight==null?"null":Freight.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CarrierTrackingNumber==null?"null":CarrierTrackingNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CustomerPONumber==null?"null":CustomerPONumber, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderDateKey = null; } else {
      this.OrderDateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DueDateKey = null; } else {
      this.DueDateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShipDateKey = null; } else {
      this.ShipDateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CustomerKey = null; } else {
      this.CustomerKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PromotionKey = null; } else {
      this.PromotionKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CurrencyKey = null; } else {
      this.CurrencyKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesTerritoryKey = null; } else {
      this.SalesTerritoryKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SalesOrderNumber = null; } else {
      this.SalesOrderNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesOrderLineNumber = null; } else {
      this.SalesOrderLineNumber = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RevisionNumber = null; } else {
      this.RevisionNumber = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderQuantity = null; } else {
      this.OrderQuantity = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitPrice = null; } else {
      this.UnitPrice = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ExtendedAmount = null; } else {
      this.ExtendedAmount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitPriceDiscountPct = null; } else {
      this.UnitPriceDiscountPct = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DiscountAmount = null; } else {
      this.DiscountAmount = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductStandardCost = null; } else {
      this.ProductStandardCost = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TotalProductCost = null; } else {
      this.TotalProductCost = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesAmount = null; } else {
      this.SalesAmount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxAmt = null; } else {
      this.TaxAmt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Freight = null; } else {
      this.Freight = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CarrierTrackingNumber = null; } else {
      this.CarrierTrackingNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CustomerPONumber = null; } else {
      this.CustomerPONumber = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderDateKey = null; } else {
      this.OrderDateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DueDateKey = null; } else {
      this.DueDateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ShipDateKey = null; } else {
      this.ShipDateKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CustomerKey = null; } else {
      this.CustomerKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PromotionKey = null; } else {
      this.PromotionKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CurrencyKey = null; } else {
      this.CurrencyKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesTerritoryKey = null; } else {
      this.SalesTerritoryKey = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SalesOrderNumber = null; } else {
      this.SalesOrderNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesOrderLineNumber = null; } else {
      this.SalesOrderLineNumber = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RevisionNumber = null; } else {
      this.RevisionNumber = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.OrderQuantity = null; } else {
      this.OrderQuantity = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitPrice = null; } else {
      this.UnitPrice = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ExtendedAmount = null; } else {
      this.ExtendedAmount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UnitPriceDiscountPct = null; } else {
      this.UnitPriceDiscountPct = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DiscountAmount = null; } else {
      this.DiscountAmount = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ProductStandardCost = null; } else {
      this.ProductStandardCost = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TotalProductCost = null; } else {
      this.TotalProductCost = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SalesAmount = null; } else {
      this.SalesAmount = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TaxAmt = null; } else {
      this.TaxAmt = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Freight = null; } else {
      this.Freight = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CarrierTrackingNumber = null; } else {
      this.CarrierTrackingNumber = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CustomerPONumber = null; } else {
      this.CustomerPONumber = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_factinternetsales o = (codegen_factinternetsales) super.clone();
    return o;
  }

  public void clone0(codegen_factinternetsales o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("ProductKey", this.ProductKey);
    __sqoop$field_map.put("OrderDateKey", this.OrderDateKey);
    __sqoop$field_map.put("DueDateKey", this.DueDateKey);
    __sqoop$field_map.put("ShipDateKey", this.ShipDateKey);
    __sqoop$field_map.put("CustomerKey", this.CustomerKey);
    __sqoop$field_map.put("PromotionKey", this.PromotionKey);
    __sqoop$field_map.put("CurrencyKey", this.CurrencyKey);
    __sqoop$field_map.put("SalesTerritoryKey", this.SalesTerritoryKey);
    __sqoop$field_map.put("SalesOrderNumber", this.SalesOrderNumber);
    __sqoop$field_map.put("SalesOrderLineNumber", this.SalesOrderLineNumber);
    __sqoop$field_map.put("RevisionNumber", this.RevisionNumber);
    __sqoop$field_map.put("OrderQuantity", this.OrderQuantity);
    __sqoop$field_map.put("UnitPrice", this.UnitPrice);
    __sqoop$field_map.put("ExtendedAmount", this.ExtendedAmount);
    __sqoop$field_map.put("UnitPriceDiscountPct", this.UnitPriceDiscountPct);
    __sqoop$field_map.put("DiscountAmount", this.DiscountAmount);
    __sqoop$field_map.put("ProductStandardCost", this.ProductStandardCost);
    __sqoop$field_map.put("TotalProductCost", this.TotalProductCost);
    __sqoop$field_map.put("SalesAmount", this.SalesAmount);
    __sqoop$field_map.put("TaxAmt", this.TaxAmt);
    __sqoop$field_map.put("Freight", this.Freight);
    __sqoop$field_map.put("CarrierTrackingNumber", this.CarrierTrackingNumber);
    __sqoop$field_map.put("CustomerPONumber", this.CustomerPONumber);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ProductKey", this.ProductKey);
    __sqoop$field_map.put("OrderDateKey", this.OrderDateKey);
    __sqoop$field_map.put("DueDateKey", this.DueDateKey);
    __sqoop$field_map.put("ShipDateKey", this.ShipDateKey);
    __sqoop$field_map.put("CustomerKey", this.CustomerKey);
    __sqoop$field_map.put("PromotionKey", this.PromotionKey);
    __sqoop$field_map.put("CurrencyKey", this.CurrencyKey);
    __sqoop$field_map.put("SalesTerritoryKey", this.SalesTerritoryKey);
    __sqoop$field_map.put("SalesOrderNumber", this.SalesOrderNumber);
    __sqoop$field_map.put("SalesOrderLineNumber", this.SalesOrderLineNumber);
    __sqoop$field_map.put("RevisionNumber", this.RevisionNumber);
    __sqoop$field_map.put("OrderQuantity", this.OrderQuantity);
    __sqoop$field_map.put("UnitPrice", this.UnitPrice);
    __sqoop$field_map.put("ExtendedAmount", this.ExtendedAmount);
    __sqoop$field_map.put("UnitPriceDiscountPct", this.UnitPriceDiscountPct);
    __sqoop$field_map.put("DiscountAmount", this.DiscountAmount);
    __sqoop$field_map.put("ProductStandardCost", this.ProductStandardCost);
    __sqoop$field_map.put("TotalProductCost", this.TotalProductCost);
    __sqoop$field_map.put("SalesAmount", this.SalesAmount);
    __sqoop$field_map.put("TaxAmt", this.TaxAmt);
    __sqoop$field_map.put("Freight", this.Freight);
    __sqoop$field_map.put("CarrierTrackingNumber", this.CarrierTrackingNumber);
    __sqoop$field_map.put("CustomerPONumber", this.CustomerPONumber);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
