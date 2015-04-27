# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.db import models, migrations


class Migration(migrations.Migration):

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Inventory',
            fields=[
                ('inventory_id', models.AutoField(serialize=False, primary_key=True)),
                ('sku', models.IntegerField()),
                ('item_name', models.CharField(max_length=45)),
                ('quantity_in_stock', models.IntegerField(null=True, blank=True)),
                ('price', models.IntegerField(null=True, blank=True)),
            ],
            options={
                'db_table': 'inventory',
            },
        ),
    ]
