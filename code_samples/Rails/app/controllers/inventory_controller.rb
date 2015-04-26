class InventoryController < ApplicationController
  
  def show
    @inventory = Inventory.all
  end

end