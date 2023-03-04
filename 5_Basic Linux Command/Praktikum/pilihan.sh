#!/bin/bash

tambahbil() {
echo -n "Bilangan pertama : "
read a
echo -n "Bilangan Kedua : "
read b
tambah=`expr $a + $b`
echo "Hasilnya adalah : $tambah"
}
kurangbil() {
echo -n "Bilangan pertama : "
read a
echo -n "Bilangan Kedua : "
read b
kurang=$( echo "$a-$b" | bc )
echo "Hasilnya adalah : $kurang"
}
kalibil() {
echo -n "Bilangan pertama : "
read a
echo -n "Bilangan Kedua : "
read b
kali=$( echo "$a*$b" | bc )
echo "Hasilnya adalah : $kali"
}
bagibil() {
echo -n "Bilangan pertama : "
read a
echo -n "Bilangan Kedua : "
read b
bagi=$( echo "$a/$b" | bc )
echo "Hasilnya adalah : $bagi"
}

opsi=1
while [ $opsi ]
do

echo "Calculator"
echo
echo "1. Perjumlahan"
echo "2. Pengurangan"
echo "3. Perkalian"
echo "4. Pembagian"

echo -n "pilih : "
read opsi
case $opsi in

1) tambahbil
exit
;;
2) kurangbil
exit
;;
3) kalibil
exit
;;
4) bagibil
exit
;;

esac
done
