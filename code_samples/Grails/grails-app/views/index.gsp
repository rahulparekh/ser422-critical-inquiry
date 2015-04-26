<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Persons</title>
    </head>
    <body>
        <g:each in="${inventory}" var="item" status="i">
            <h3>${i+1}. ${item.price}</h3>
            <br/>
        </g:each>
    </body>
</html>