-- monthly sales from sales territory, rollable up to year 
SELECT od.calendaryear, od.englishmonthname,
       ds.salesterritorycountry, sum(f.orderquantity) total_quantity
FROM factinternetsales f
JOIN dimdate od ON od.datekey = f.orderdatekey
JOIN dimsalesterritory ds ON ds.salesterritorykey = f.salesterritorykey
GROUP BY od.englishmonthname, od.calendaryear, ds.salesterritorycountry;

-- total sales and discount across sales territory. Drill down the hierarchy for sales territory to region
SELECT dst.salesterritorygroup,
       dst.salesterritorycountry,
       dst.salesterritoryregion,
       sum(f.salesamount) AS salesamount,
       sum(f.discountamount) AS discountamount
FROM factinternetsales f
JOIN dimsalesterritory dst ON dst.salesterritorykey = f.salesterritorykey
GROUP BY dst.salesterritorygroup,
         dst.salesterritorycountry,
         dst.salesterritoryregion;

-- compare the profits of products with roll up
SELECT dpc.englishproductcategoryname,
       dpsc.englishproductsubcategoryname,
       dp.englishproductName,
       sum(f.orderquantity) AS orderquantity,
       sum(f.salesamount) AS salesamount,
       sum(f.totalproductcost) AS totalproductcost,
       sum(f.discountamount) AS discountamount,
       (sum(f.salesamount) - sum(totalproductcost) - sum(discountamount)) AS profit
FROM factinternetsales f
JOIN dimproduct dp ON dp.productkey = f.productkey
LEFT JOIN dimproductsubcategory dpsc ON dpsc.productsubcategorykey = dp.productsubcategorykey and dp.productcategorykey = dpsc.productcategorykey
LEFT JOIN dimproductcategory dpc ON dpc.productcategorykey = dp.productcategorykey
GROUP BY dpc.englishproductcategoryname,
         dpsc.englishproductsubcategoryname,
         dp.englishproductName;

-- sales performance of products and product categories over time with quarterly granularity
SELECT dpc.englishproductcategoryname,
       dpsc.englishproductsubcategoryname,
       dp.englishproductName,
       dd.calendaryear,
       dd.calendarquarter,
       sum(f.orderquantity) AS orderquantity,
       sum(f.salesamount) AS salesamount,
       sum(f.totalproductcost) AS totalproductcost,
       sum(f.discountamount) AS discountamount,
       (sum(f.salesamount) - sum(totalproductcost) - sum(discountamount)) AS profit
FROM factinternetsales f
JOIN dimproduct dp ON dp.productkey = f.productkey
LEFT JOIN dimproductsubcategory dpsc ON dpsc.productsubcategorykey = dp.productsubcategorykey and dp.productcategorykey = dpsc.productcategorykey
LEFT JOIN dimproductcategory dpc ON dpc.productcategorykey = dp.productcategorykey
JOIN dimdate dd ON f.orderdatekey = dd.datekey
GROUP BY dpc.englishproductcategoryname,
         dpsc.englishproductsubcategoryname,
         dp.englishproductName,
         dd.calendaryear,
         dd.calendarquarter;



