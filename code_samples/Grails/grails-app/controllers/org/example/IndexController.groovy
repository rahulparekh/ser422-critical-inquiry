package org.example

class IndexController {

    def scaffold = Inventory

    def index() {

        def test = Inventory.list()
        [test:test]
    }
}
