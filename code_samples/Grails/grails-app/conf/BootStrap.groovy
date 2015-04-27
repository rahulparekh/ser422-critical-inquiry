import org.example.Inventory

class BootStrap {

    def init = { servletContext ->

        print Inventory.list().size()
        if (Inventory.list().size() == 0) {
            
            new Inventory(sku: 1, itemName: "bread", quantityInStock: 10, price: 2).save()
            new Inventory(sku: 13, itemName: "eggs", quantityInStock: 24, price: 4).save()
            new Inventory(sku: 345, itemName: "milk", quantityInStock: 10, price: 3).save()
            new Inventory(sku: 37, itemName: "cereals", quantityInStock: 14, price: 5).save()
            new Inventory(sku: 22, itemName: "cola", quantityInStock: 20, price: 1).save()
            new Inventory(sku: 878, itemName: "orange juice", quantityInStock: 20, price: 7).save()
            new Inventory(sku: 57, itemName: "cookies", quantityInStock: 5, price: 13).save()
            new Inventory(sku: 456, itemName: "chocolate", quantityInStock: 9, price: 9).save()
            new Inventory(sku: 45, itemName: "soup", quantityInStock: 15, price: 3).save()
            new Inventory(sku: 47, itemName: "rice", quantityInStock: 18, price: 5).save()
            new Inventory(sku: 879, itemName: "tissues", quantityInStock: 24, price: 6).save()

        }

    }
    def destroy = {
    }
}
