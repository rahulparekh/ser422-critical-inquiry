class Inventory < ActiveRecord::Base
  default_scope -> { order('inventory_id ASC') }
  self.table_name = "inventory"
end
