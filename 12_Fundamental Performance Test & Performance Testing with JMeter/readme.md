## Resume performence 
(jarang dilakukan oleh QE, namun saat ini sudah mulai dihandle oleh QE)

performence test adalah teknik pengujian non functionalitas. menguji ketahanannya, seperti stabilitasnya, penggunaan sumber dayanya (berapa banyak penggunanya)

1. apa yang diukur performence test, 
- peformanya
- realiability, stability, availability (response time ketika menjalankan request dengan jumlah yang banyak, mengetahui batas jumlah data.

2. mengapa jarang dilakukan, 
- karena mahal resourcenya (karena butuh yg teliti dan sudah pro), 
- penguji dan 
- toolsnya dan membutuhkan envirotmnet production dan mengarah kepada 

3. apa yang perlu diperhatikan
- throughput
- response data

4. jenis
- Load test pengujian standart harus ada batasan jangan sampai tidak sampai batas
- endurance test uji ketahanan batas dalam request yg lebih lama sanggup gak
- stress test bertahap sampai kuat berapa lama 
- peak test/spike/soak tahapan untuk event-event
- smoke test mirip load test dan tujuannya untuk memverifikasi script yg kita buat lalu dilanjutkan load test (pemanasan sebelum melakukan performence test)
- Volume test menguji terhadap satu section tertentu saja, klo yg lainnya untuk keseluruhan
