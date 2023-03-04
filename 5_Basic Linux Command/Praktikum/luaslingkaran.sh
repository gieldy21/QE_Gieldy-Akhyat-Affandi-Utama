#!/bin/bash

echo
echo "menghitung Luas Lingkaran"
echo "-------------------------"
echo
echo "Masukkan jari-jari :"
read r
k=`echo 3.14*$r*$r | bc`
echo "Luas Lingkaran = $k";
