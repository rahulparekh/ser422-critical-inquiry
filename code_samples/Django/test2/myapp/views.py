# Author:Aaditya_M

from django.shortcuts import render
from django.http import HttpResponse
from myapp.models import Inventory
from django.shortcuts import render_to_response
from django.db import connection
import MySQLdb

# Create your views here.


##def index(request):
##  rows = Inventory.objects.using('mysql').all()
##  return render_to_response("index.html", {"rows" : rows })


def index(request):
  conn = MySQLdb.connect(host="localhost", user="root", passwd="", db="warehousemanagement")
##  try:
##    cursor = conn.cursor()
##    cursor.execute("select * from inventory ORDER BY inventory_id")
##    rows = cursor.fetchall()
##    
##  finally:
##    conn.close()
    
  return render_to_response("index.html", {"rows" : Inventory.objects.all()})
