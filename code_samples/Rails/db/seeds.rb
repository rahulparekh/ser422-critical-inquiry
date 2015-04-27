# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the rake db:seed (or created alongside the db with db:setup).
#
# Examples:
#
#   cities = City.create([{ name: 'Chicago' }, { name: 'Copenhagen' }])
#   Mayor.create(name: 'Emanuel', city: cities.first)

Inventory.create(
    sku: 1,
    item_name: "bread",
    quantity_in_stock: 10,
    price: 2,
)

Inventory.create(
    sku: 75,
    item_name: "eggs",
    quantity_in_stock: 10,
    price: 1,
)

Inventory.create(
    sku: 545,
    item_name: "eggs",
    quantity_in_stock: 10,
    price: 2,
)

Inventory.create(
    sku: 6431,
    item_name: "milk",
    quantity_in_stock: 10,
    price: 5,
)

Inventory.create(
    sku: 54,
    item_name: "cereals",
    quantity_in_stock: 0,
    price: 7,
)

Inventory.create(
    sku: 8484,
    item_name: "cola",
    quantity_in_stock: 1,
    price: 2,
)

Inventory.create(
    sku: 687,
    item_name: "orange",
    quantity_in_stock: 7,
    price: 20,
)

Inventory.create(
    sku: 774,
    item_name: "cookies",
    quantity_in_stock: 5,
    price: 10,
)

Inventory.create(
    sku: 444,
    item_name: "chocolate",
    quantity_in_stock: 10,
    price: 2,
)

Inventory.create(
    sku: 45,
    item_name: "soup",
    quantity_in_stock: 15,
    price: 3,
)

Inventory.create(
    sku: 47,
    item_name: "rice",
    quantity_in_stock: 18,
    price: 5,
)

Inventory.create(
    sku: 879,
    item_name: "tissues",
    quantity_in_stock: 24,
    price: 6,
)