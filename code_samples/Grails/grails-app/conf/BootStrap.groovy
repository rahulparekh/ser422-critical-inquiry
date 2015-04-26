import org.example.Inventory

class BootStrap {

    def init = { servletContext ->

        if (Inventory.list().size() == 0) {
            new Inventory(
                sku: 1,
                itemName: "bread",
                quantityInStock: 10,
                price: 2,
            ).save()

            new Inventory(
                sku: 75,
                itemName: "eggs",
                quantityInStock: 10,
                price: 1,
            ).save()

            new Inventory(
                sku: 545,
                itemName: "eggs",
                quantityInStock: 10,
                price: 2,
            ).save()

            new Inventory(
                sku: 6431,
                itemName: "milk",
                quantityInStock: 10,
                price: 5,
            ).save()

            new Inventory(
                sku: 54,
                itemName: "cereals",
                quantityInStock: 0,
                price: 7,
            ).save()

            new Inventory(
                sku: 8484,
                itemName: "cola",
                quantityInStock: 1,
                price: 2,
            ).save()

            new Inventory(
                sku: 687,
                itemName: "orange",
                quantityInStock: 7,
                price: 20,
            ).save()

            new Inventory(
                sku: 774,
                itemName: "cookies",
                quantityInStock: 5,
                price: 10,
            ).save()

            new Inventory(
                sku: 444,
                itemName: "chocolate",
                quantityInStock: 10,
                price: 2,
            ).save()

            new Inventory(
                sku: 45,
                itemName: "soup",
                quantityInStock: 15,
                price: 3,
            ).save()

            new Inventory(
                sku: 47,
                itemName: "rice",
                quantityInStock: 18,
                price: 5,
            ).save()

            new Inventory(
                sku: 879,
                itemName: "tissues",
                quantityInStock: 24,
                price: 6,
            ).save()

        }

    }
    def destroy = {
    }
}
