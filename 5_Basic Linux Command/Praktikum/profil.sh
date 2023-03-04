#!/bin/sh

echo "Profil"
echo
read -p "Nama file :" file
touch $file
pil='y'
while [ $pil = 'y' ]
do
read -p "Nama :" nama
read -p "Nim :" nim
read -p "Prodi :" prodi
read -p "Alamat :" alamat
echo "nama :" $nama >> $file
echo "nim :" $nim >> $file
echo "prodi :" $prodi >> $file
echo "alamat :" $alamat >> $file
read -p "mau isi lagi ?" pil
while [ $pil = 'n' ]
do
echo "terimakasih, file disimpan!"
break;
done
done

