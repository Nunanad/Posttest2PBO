# SISTEM MANAJEMEN DATA KARYAWAN
## LATAR BELAKANG
Pengelolaan data karyawan masih sering dilakukan secara manual sehingga menimbulkan berbagai masalah, seperti data sulit dicari, rawan duplikasi, dan lambat dalam pembuatan laporan. Untuk mengatasi hal tersebut, dibutuhkan sistem manajemen data karyawan berbasis komputer agar lebih rapi, efisien, dan aman.
Sistem ini memanfaatkan konsep Object-Oriented Programming (OOP). Penggunaan constructor memudahkan inisialisasi data karyawan ketika objek dibuat. Access modifier digunakan untuk membatasi akses atribut agar data lebih aman. Selain itu, pemisahan kode menggunakan packages juga diterapkan, misalnya main untuk menu user, service untuk logika CRUD, dan model untuk struktur data. Dengan cara ini, program menjadi lebih terstruktur, mudah dipahami, dan lebih terjaga konsistensinya.

## FITUR PROGRAM
1. tambah data karyawan
2. Lihat daftar karyawan
3. Ubah data karyawan
4. Hapus data karyawan
5. Keluar dari program

## ALUR PROGRAM

1. Program Dimulai (Main Package) User menjalankan program dari kelas utama (MainApp) yang berada di package main.

2. Program akan menampilkan menu utama yang berisi pilihan seperti:
Tambah Data Karyawan
Tampilkan Data Karyawan
Update Data Karyawan
Hapus Data Karyawan
Keluar

<img width="408" height="200" alt="image" src="https://github.com/user-attachments/assets/045d5595-54a3-4d03-aa5e-bbe0e90de4f7" />

3. Pemilihan Menu oleh User
User memilih salah satu menu dengan memasukkan angka sesuai pilihan. Input dari user akan diteruskan ke package service untuk diproses.

4. Tambah Data Karyawan:
User memasukkan data (id, nama, jabatan, dan gaji). Data tersebut disimpan dalam bentuk objek Karyawan menggunakan constructor.

<img width="639" height="267" alt="image" src="https://github.com/user-attachments/assets/3def1d8e-0e19-4bc1-bd12-23a5fdd75892" />

5. Lihat Data Karyawan:
Program menampilkan seluruh data karyawan yang tersimpan dengan memanfaatkan method getter.

<img width="605" height="186" alt="image" src="https://github.com/user-attachments/assets/2047fb7f-10c2-453d-b6ce-865292ccc9dc" />

6. Update Data Karyawan:
User memilih ID karyawan, kemudian atribut tertentu bisa diubah menggunakan setter.

<img width="530" height="265" alt="image" src="https://github.com/user-attachments/assets/ab92da18-8153-4952-baa7-3143a7cf3c4b" />

7. Hapus Data Karyawan:
Program menghapus objek karyawan dari daftar penyimpanan.

<img width="441" height="206" alt="image" src="https://github.com/user-attachments/assets/36ab220f-b57a-4c4c-93e9-9ec28994329b" />

Setelah setiap operasi CRUD, program akan menampilkan status (misalnya: “Data karyawan berhasil ditambahkan”) atau ("menampilkan daftar karyawan yang sudah diperbarui").

8. Menu cari karyawan berdasarkan id:

<img width="483" height="209" alt="image" src="https://github.com/user-attachments/assets/92f505c4-1718-4a92-ac84-a39803b10c51" />

9. Kembali ke Menu Utama atau Keluar

<img width="529" height="209" alt="image" src="https://github.com/user-attachments/assets/e01c54cd-306c-4425-9935-a7f185750179" />

User bisa kembali ke menu utama untuk melakukan operasi lain, atau keluar dari program.

## PENJELASAN PROGRAM

### 1. Isi Package Model

1. <img width="841" height="310" alt="image" src="https://github.com/user-attachments/assets/213fbe81-e4fe-476e-9b91-8285e4473ce2" />

Atribut id, nama, jabatan, dan gaji bersifat private, artinya hanya bisa diakses dari dalam class itu sendiri.
Hal ini digunakan untuk menjaga keamanan data (prinsip encapsulation).

Lalu constructor digunakan untuk membuat objek Karyawan baru sekaligus langsung mengisi data awalnya (id, nama, jabatan, gaji).
Kata kunci this dipakai untuk membedakan antara variabel dalam class dengan parameter constructor.

2. <img width="1001" height="402" alt="image" src="https://github.com/user-attachments/assets/248e5f53-69ed-4802-a02e-73b35f50b633" />

Constructor digunakan untuk membuat objek Karyawan baru sekaligus langsung mengisi data awalnya (id, nama, jabatan, gaji).
Kata kunci this dipakai untuk membedakan antara variabel dalam class dengan parameter constructor.

### 2. Isi Package Service

1. <img width="314" height="80" alt="image" src="https://github.com/user-attachments/assets/31dfd014-5add-468f-94e4-9ef024a7db43" />

Bagian import di atas digunakan untuk memanggil class dan library yang dibutuhkan dalam program. import Model.Karyawan; berarti program menggunakan class Karyawan yang berada di package Model. Sedangkan import java.util.ArrayList; dan import java.util.List; digunakan untuk memanfaatkan struktur data List dan ArrayList dari Java Collection Framework, agar data karyawan dapat disimpan dalam bentuk list yang fleksibel, mudah ditambah, dihapus, maupun diakses.


2. <img width="1011" height="518" alt="image" src="https://github.com/user-attachments/assets/51f0a47b-081c-4af0-b0b5-061d7bad8d32" />

Atribut ini digunakan untuk menyimpan daftar karyawan dalam bentuk List. Struktur data ArrayList dipilih agar data bisa ditambahkan, dihapus, atau diperbarui dengan mudah.
Method ini digunakan untuk menambahkan objek Karyawan baru ke dalam daftar.

3. <img width="710" height="537" alt="image" src="https://github.com/user-attachments/assets/39d07563-5852-4305-a9f9-fc70c8f8d1ad" />

Method ini menghapus data karyawan dari daftar berdasarkan id, mengembalikan seluruh data karyawan yang ada di daftar dalam bentuk List, mencari karyawan berdasarkan id. Jika ditemukan, maka data nama, jabatan, dan gaji akan diperbarui menggunakan setter, mencari karyawan berdasarkan id. Jika ditemukan, objek karyawan dikembalikan, jika tidak maka null.
dan method ini hampir sama dengan sebelumnya, tetapi pencarian dilakukan berdasarkan nama. equalsIgnoreCase dipakai agar pencarian tidak membedakan huruf besar dan kecil.

### 3. Isi Package Main

1. <img width="413" height="102" alt="image" src="https://github.com/user-attachments/assets/d0f142bf-966f-4c41-ab8b-db54be5a12b3" />

Import di atas dipakai untuk memanggil class Karyawan dari package Model, class LayananKaryawan dari package Service, serta class Scanner dari library Java untuk membaca input dari user.

2. <img width="891" height="370" alt="image" src="https://github.com/user-attachments/assets/d607a4e4-73ac-4f75-8260-8d6f3541c2e8" />

Class App berfungsi sebagai titik masuk program. Di dalamnya dibuat objek Scanner untuk membaca input dari keyboard, serta objek LayananKaryawan yang akan menangani logika CRUD.
Program akan menampilkan menu utama dalam bentuk pilihan numerik. User memasukkan angka sesuai menu yang diinginkan.

3. <img width="872" height="429" alt="image" src="https://github.com/user-attachments/assets/5ee136e4-eb32-41fd-9a7c-d6e7873500b7" />

 <img width="813" height="565" alt="image" src="https://github.com/user-attachments/assets/d7aa36e0-036b-4cb4-b3ba-7772b3bdd322" />

 <img width="799" height="502" alt="image" src="https://github.com/user-attachments/assets/25a54610-fd7c-4c9e-bdbb-27b066639bd4" />

Case 1 (Tambah Karyawan): User memasukkan data ID, nama, jabatan, dan gaji. Data tersebut disimpan sebagai objek Karyawan baru menggunakan constructor, lalu ditambahkan ke daftar melalui method tambahKaryawan().

Case 2 (Tampilkan Semua Karyawan): Program menampilkan seluruh data karyawan dengan cara melakukan perulangan pada getSemuaKaryawan().

Case 3 (Update Karyawan): User memasukkan ID karyawan yang ingin diubah, kemudian menginput data baru (nama, jabatan, gaji). Jika ID ditemukan, data diperbarui dengan method updateKaryawan().

Case 4 (Hapus Karyawan): User memasukkan ID, lalu program menghapus karyawan yang sesuai menggunakan method hapusKaryawan().

Case 5 (Cari Karyawan): User memasukkan ID untuk mencari karyawan. Jika ditemukan, data ditampilkan. Jika tidak, muncul pesan "Karyawan tidak ditemukan".

Case 0 (Keluar): Program berhenti dengan menutup objek Scanner.

Default: Jika input tidak sesuai, program menampilkan pesan "Pilihan tidak valid".








