# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the rake db:seed (or created alongside the db with db:setup).
#
# Examples:
#
#   cities = City.create([{ name: 'Chicago' }, { name: 'Copenhagen' }])
#   Mayor.create(name: 'Emanuel', city: cities.first)

Inventory.create(sku: "1", item_name: "bread", quantity_in_stock: "10", price: "2")
Inventory.create(sku: "13", item_name: "eggs", quantity_in_stock: "24", price: "4")
Inventory.create(sku: "345", item_name: "milk", quantity_in_stock: "10", price: "3")
Inventory.create(sku: "37", item_name: "cereals", quantity_in_stock: "14", price: "5")
Inventory.create(sku: "22", item_name: "cola", quantity_in_stock: "20", price: "1")
Inventory.create(sku: "878", item_name: "orange juice", quantity_in_stock: "20", price: "7")
Inventory.create(sku: "57", item_name: "cookies", quantity_in_stock: "5", price: "13")
Inventory.create(sku: "456", item_name: "chocolate", quantity_in_stock: "9", price: "9")
Inventory.create(sku: "45", item_name: "soup", quantity_in_stock: "15", price: "3")
Inventory.create(sku: "47", item_name: "rice", quantity_in_stock: "18", price: "5")
Inventory.create(sku: "879", item_name: "tissues", quantity_in_stock: "24", price: "6")
