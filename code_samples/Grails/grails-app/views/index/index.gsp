<!DOCTYPE html>
<html>
    <head>
        <title>Tester</title>
    </head>
    <body>
        <g:each in="${test}" var="item" status="i">
            =========================== 
            
            <p>Item Name     : ${item.itemName}</p>
            <p>Item SKU      : ${item.sku}</p>
            <p>Item Quantity : ${item.quantityInStock}</p>
            <p>Item Price    : ${item.price} $</p>

        </g:each>
    </body>
</html>