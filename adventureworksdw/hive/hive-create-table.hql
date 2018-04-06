create database if not exists adventureworksdw;

use adventureworksdw;

CREATE TABLE dimcurrency (
  CurrencyKey int,
  CurrencyAlternateKey string,
  CurrencyName string
) 
stored as parquet
location '/user/maria_dev/adventureworks/dw/dimcurrency';

CREATE TABLE IF NOT EXISTS dimcustomer (
  CustomerKey int,
  GeographyKey int,
  CustomerAlternateKey string,
  Title string,
  FirstName string,
  MiddleName string,
  LastName string,
  NameStyle boolean,
  BirthDate date,
  MaritalStatus char(1),
  Suffix varchar(10),
  Gender varchar(1),
  EmailAddress string,
  YearlyIncome decimal(19,4),
  TotalChildren tinyint,
  NumberChildrenAtHome tinyint,
  EnglishEducation varchar(40),
  SpanishEducation varchar(40),
  FrenchEducation varchar(40),
  EnglishOccupation varchar(100),
  SpanishOccupation varchar(100),
  FrenchOccupation varchar(100),
  HouseOwnerFlag char(1),
  NumberCarsOwned tinyint,
  AddressLine1 string,
  AddressLine2 string,
  Phone varchar(20),
  DateFirstPurchase date,
  CommuteDistance string
) 
stored as orc
location '/user/maria_dev/adventureworks/dw/dimcustomer';

CREATE TABLE IF NOT EXISTS tmpcustomer (
  CustomerKey int,
  GeographyKey int,
  CustomerAlternateKey string,
  Title string,
  FirstName string,
  MiddleName string,
  LastName string,
  NameStyle boolean,
  BirthDate bigint,
  MaritalStatus char(1),
  Suffix varchar(10),
  Gender varchar(1),
  EmailAddress string,
  YearlyIncome string,
  TotalChildren tinyint,
  NumberChildrenAtHome tinyint,
  EnglishEducation varchar(40),
  SpanishEducation varchar(40),
  FrenchEducation varchar(40),
  EnglishOccupation varchar(100),
  SpanishOccupation varchar(100),
  FrenchOccupation varchar(100),
  HouseOwnerFlag char(1),
  NumberCarsOwned tinyint,
  AddressLine1 string,
  AddressLine2 string,
  Phone varchar(20),
  DateFirstPurchase bigint,
  CommuteDistance string
) 
stored as parquet
location '/user/maria_dev/adventureworks/dw/customer';

CREATE TABLE dimdate (
  DateKey int,
  FullDateAlternateKey bigint,
  DayNumberOfWeek tinyint,
  EnglishDayNameOfWeek string,
  SpanishDayNameOfWeek string,
  FrenchDayNameOfWeek string,
  DayNumberOfMonth tinyint,
  DayNumberOfYear smallint,
  WeekNumberOfYear tinyint,
  EnglishMonthName string,
  SpanishMonthName string,
  FrenchMonthName string,
  MonthNumberOfYear tinyint,
  CalendarQuarter tinyint,
  CalendarYear smallint,
  CalendarSemester tinyint,
  FiscalQuarter tinyint,
  FiscalYear smallint,
  FiscalSemester tinyint
) 
stored as parquet
location '/user/maria_dev/adventureworks/dw/dimdate';


CREATE TABLE dimgeography (
  GeographyKey int,
  City varchar(30),
  StateProvinceCode varchar(3) ,
  StateProvinceName varchar(50),
  CountryRegionCode varchar(3),
  EnglishCountryRegionName varchar(50),
  SpanishCountryRegionName varchar(50),
  FrenchCountryRegionName varchar(50),
  PostalCode varchar(15),
  SalesTerritoryKey int
) 
stored as parquet
location '/user/maria_dev/adventureworks/dw/dimgeography';

CREATE TABLE dimproduct (
  ProductKey int,
  ProductAlternateKey string,
  ProductCategoryKey int,
  ProductSubcategoryKey int,
  WeightUnitMeasureCode string,
  SizeUnitMeasureCode string,
  EnglishProductName string,
  SpanishProductName string,
  FrenchProductName string,
  StandardCost decimal(19,4),
  FinishedGoodsFlag tinyint,
  Color string,
  SafetyStockLevel smallint,
  ReorderPoint smallint,
  ListPrice decimal(19,4),
  Size string,
  SizeRange string,
  Weight double,
  DaysToManufacture int,
  ProductLine string,
  DealerPrice decimal(19,4),
  Class string,
  Style string,
  ModelName string,
  LargePhoto binary,
  EnglishDescription string,
  FrenchDescription string,
  ChineseDescription string,
  ArabicDescription string,
  HebrewDescription string,
  ThaiDescription string,
  GermanDescription string,
  JapaneseDescription string,
  TurkishDescription string,
  StartDate bigint,
  EndDate bigint,
  Status string
  )
stored as parquet
location '/user/maria_dev/adventureworks/dw/dimproduct';

CREATE TABLE tmpproduct (
  ProductKey int,
  ProductAlternateKey string,
  ProductSubcategoryKey int,
  WeightUnitMeasureCode string,
  SizeUnitMeasureCode string,
  EnglishProductName string,
  SpanishProductName string,
  FrenchProductName string,
  StandardCost string,
  FinishedGoodsFlag boolean,
  Color string,
  SafetyStockLevel smallint,
  ReorderPoint smallint,
  ListPrice string,
  Size string,
  SizeRange string,
  Weight double,
  DaysToManufacture int,
  ProductLine string,
  DealerPrice string,
  Class string,
  Style string,
  ModelName string,
  LargePhoto binary,
  EnglishDescription string,
  FrenchDescription string,
  ChineseDescription string,
  ArabicDescription string,
  HebrewDescription string,
  ThaiDescription string,
  GermanDescription string,
  JapaneseDescription string,
  TurkishDescription string,
  StartDate bigint,
  EndDate bigint,
  Status string
  )
stored as parquet
location '/user/maria_dev/adventureworks/dw/product';

CREATE TABLE dimproductcategory (
  ProductCategoryKey int,
  ProductCategoryAlternateKey int,
  EnglishProductCategoryName string,
  SpanishProductCategoryName string,
  FrenchProductCategoryName string
)
stored as parquet
location '/user/maria_dev/adventureworks/dw/dimproductcategory';

CREATE TABLE dimproductsubcategory (
  ProductSubcategoryKey int,
  ProductSubcategoryAlternateKey int,
  EnglishProductSubcategoryName string,
  SpanishProductSubcategoryName string,
  FrenchProductSubcategoryName string,
  ProductCategoryKey int
) 
stored as parquet
location '/user/maria_dev/adventureworks/dw/dimproductsubcategory';

CREATE TABLE dimsalesterritory (
  SalesTerritoryKey int,
  SalesTerritoryAlternateKey int,
  SalesTerritoryRegion string,
  SalesTerritoryCountry string,
  SalesTerritoryGroup string
) 
stored as parquet
location '/user/maria_dev/adventureworks/dw/dimsalesterritory';


CREATE TABLE factinternetsales (
  ProductKey int,
  OrderDateKey int,
  DueDateKey int,
  ShipDateKey int,
  CustomerKey int,
  PromotionKey int,
  CurrencyKey int,
  SalesTerritoryKey int,
  SalesOrderNumber string,
  SalesOrderLineNumber tinyint,
  RevisionNumber tinyint,
  OrderQuantity smallint,
  UnitPrice decimal(19,4),
  ExtendedAmount decimal(19,4),
  UnitPriceDiscountPct double,
  DiscountAmount double,
  ProductStandardCost decimal(19,4) ,
  TotalProductCost decimal(19,4),
  SalesAmount decimal(19,4),
  TaxAmt decimal(19,4),
  Freight decimal(19,4),
  CarrierTrackingNumber string,
  CustomerPONumber string
)
stored as parquet
location '/user/maria_dev/adventureworks/dw/factinternetsales';


CREATE TABLE internetsales (
  ProductKey int,
  OrderDateKey int,
  DueDateKey int,
  ShipDateKey int,
  CustomerKey int,
  PromotionKey int,
  CurrencyKey int,
  SalesTerritoryKey int,
  SalesOrderNumber string,
  SalesOrderLineNumber tinyint,
  RevisionNumber tinyint,
  OrderQuantity smallint,
  UnitPrice string,
  ExtendedAmount string,
  UnitPriceDiscountPct double,
  DiscountAmount double,
  ProductStandardCost string,
  TotalProductCost string,
  SalesAmount string,
  TaxAmt string,
  Freight string,
  CarrierTrackingNumber string,
  CustomerPONumber string
)
stored as parquet
location '/user/maria_dev/adventureworks/dw/internetsales';


INSERT overwrite TABLE dimproduct
SELECT ProductKey,
  ProductAlternateKey,
  dpsc.ProductCategoryKey,
  dpsc.ProductSubcategoryKey,
  WeightUnitMeasureCode,
  SizeUnitMeasureCode,
  EnglishProductName,
  SpanishProductName,
  FrenchProductName,
  cast(StandardCost as decimal(19,4)) as StandardCost,
  FinishedGoodsFlag,
  Color,
  SafetyStockLevel,
  ReorderPoint,
  cast(ListPrice as decimal(19,4)) as ListPrice,
  SIZE,
  SizeRange,
  Weight,
  DaysToManufacture,
  ProductLine,
  cast(DealerPrice as decimal(19,4)) as DealerPrice,
  CLASS,
  Style,
  ModelName,
  LargePhoto,
  EnglishDescription,
  FrenchDescription,
  ChineseDescription,
  ArabicDescription,
  HebrewDescription,
  ThaiDescription,
  GermanDescription,
  JapaneseDescription,
  TurkishDescription,
  StartDate,
  EndDate,
  Status
FROM tmpproduct tp
LEFT JOIN dimproductsubcategory dpsc ON tp.ProductSubcategoryKey = dpsc.ProductSubcategoryKey;

drop table tmpproduct purge;

INSERT overwrite TABLE dimcustomer
SELECT 
  CustomerKey,
  GeographyKey,
  CustomerAlternateKey,
  Title,
  FirstName,
  MiddleName,
  LastName,
  NameStyle,
  to_date(from_unixtime(BirthDate DIV 1000)) birthdate,
  MaritalStatus,
  Suffix,
  Gender,
  EmailAddress,
  cast(yearlyincome as decimal(19,4)) as yearlyincome,
  TotalChildren,
  NumberChildrenAtHome,
  EnglishEducation,
  SpanishEducation,
  FrenchEducation,
  EnglishOccupation,
  SpanishOccupation,
  FrenchOccupation,
  HouseOwnerFlag,
  NumberCarsOwned,
  AddressLine1,
  AddressLine2,
  Phone,
  to_date(from_unixtime(DateFirstPurchase DIV 1000)) as datefirstpurchase,
  CommuteDistance
from tmpcustomer;

drop table tmpcustomer purge;


INSERT overwrite TABLE factinternetsales
SELECT 
  ProductKey,
  OrderDateKey,
  DueDateKey,
  ShipDateKey,
  CustomerKey,
  PromotionKey,
  CurrencyKey,
  SalesTerritoryKey,
  SalesOrderNumber,
  SalesOrderLineNumber,
  RevisionNumber,
  OrderQuantity,
  cast(UnitPrice as decimal(19,4)) as UnitPrice,
  cast(ExtendedAmount as decimal(19,4)) as ExtendedAmount,
  UnitPriceDiscountPct,
  DiscountAmount,
  cast(ProductStandardCost as decimal(19,4)) as ProductStandardCost ,
  cast(TotalProductCost as decimal(19,4)) as TotalProductCost,
  cast(SalesAmount as decimal(19,4)) as SalesAmount,
  cast(TaxAmt as decimal(19,4)) as TaxAmt,
  cast(Freight as decimal(19,4)) as Freight,
  CarrierTrackingNumber,
  CustomerPONumber
from internetsales;

drop table internetsales purge;
