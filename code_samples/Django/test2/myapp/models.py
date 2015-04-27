from __future__ import unicode_literals
from django.db import models

# Create your models here.

class Inventory(models.Model):
    inventory_id = models.AutoField(primary_key=True)
    sku = models.IntegerField()
    item_name = models.CharField(max_length=45)
    quantity_in_stock = models.IntegerField(blank=True, null=True)
    price = models.IntegerField(blank=True, null=True)

    class Meta:
        db_table = 'inventory'
