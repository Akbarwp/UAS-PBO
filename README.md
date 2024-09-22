# Desktop Application - Keyboard Sales

Keyboard Sales is a desktop application designed to facilitate the management of the keyboard sales process. This application offers efficient sales features and is equipped with master data that includes information on employees, customers, and products. Users can easily manage sales data along with payment details, as well as generate reports that help monitor and analyze keyboard sales performance effectively. This application using Java as programming language and MySQL database.

## Tech Stack

- **Java** - The main programming language for this application.
- **MySQL Database** - The database used to store and retrieve data.
- **JasperViewer** - Used to generate reports.

## Features

- Main features available in this application:
  - Login page
  - Data management using MySQL Database.
  - Management of master data, including employees, customers, and products.
  - Management of sales and payment.
  - Generation of various reports.

## Installation

Follow the steps below to clone and run the project in your local environment:

1. Clone repository:

    ```bash
    git clone https://github.com/Akbarwp/UAS-PBO.git
    ```

2. Open project in NetBeans IDE or etc.

3. Make sure to have at least **JDK version 8** installed on your system.

4. Add the JDBC driver for Oracle to the project:
    - Download the JDBC driver from [Oracle JDBC Driver](https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html).
    - Add the `.jar` file to your project’s library.

5. Configure the connection to the Oracle Database:
    - Add the connection configuration in the `Koneksi.java` file.

6. Run the application using your IDE in the `Login.java` file.

## Database Setup

1. **Create Database dan Table:**
   - Database Script
[uaspbo.zip](https://github.com/user-attachments/files/17089538/uaspbo.zip)


## Screenshots

- ### **Login page**

<img src="https://github.com/user-attachments/assets/04c10b89-fb9e-4a92-a8b2-de5212920288" alt="Halaman Login" width="500" />
<br><br>

- ### **Homepage**

<img src="https://github.com/user-attachments/assets/c2ba3365-81bd-406e-a7a3-aa288b2f138e" alt="Halaman Utama" width="" />
<br><br>

- ### **Product page**

<img src="https://github.com/user-attachments/assets/021a9da5-a500-4b72-bef0-81ea61cfef91" alt="Halaman Master Barang" width="" />
&nbsp;&nbsp;&nbsp;
<img src="https://github.com/user-attachments/assets/670d7dc5-3a4a-4456-bd82-2adef20227bf" alt="Halaman Tabel Barang" width="" />
&nbsp;&nbsp;&nbsp;
<img src="https://github.com/user-attachments/assets/2baef956-0168-4273-9001-fe534d34dc36" alt="Halaman Tambah Barang" width="" />
&nbsp;&nbsp;&nbsp;
<br><br>

- ### **Sales page**

<img src="https://github.com/user-attachments/assets/52c255e2-f822-4935-ae76-f3db6c5ca80e" alt="Halaman Master Penjualan" width="" />
&nbsp;&nbsp;&nbsp;
<img src="https://github.com/user-attachments/assets/754719e8-492c-4864-8eda-afafe5418de2" alt="Halaman Tabel Penjualan" width="" />
&nbsp;&nbsp;&nbsp;
<img src="https://github.com/user-attachments/assets/901a124d-36fb-42d0-8124-edf9d150f34e" alt="Halaman Tabel Detail Penjualan" width="" />
&nbsp;&nbsp;&nbsp;
<img src="https://github.com/user-attachments/assets/19bb053d-c5bb-49e0-9e08-8ddb006af3e9" alt="Halaman Tambah Penjualan" width="" />
&nbsp;&nbsp;&nbsp;
<br><br>

- ### **Reports page**

<img src="https://github.com/user-attachments/assets/8c5c5026-e8ed-4e7d-bba6-dec3abb2a4f3" alt="Halaman Laporan" width="" />
&nbsp;&nbsp;&nbsp;
<img src="https://github.com/user-attachments/assets/f71be241-6c0d-4495-ac81-487b817914a7" alt="Laporan Penjualan" width="" />
