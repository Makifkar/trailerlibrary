Kütüphane Otomasyon Sistemi 

Giriş 

Bu proje, Java kullanılarak Spring Boot ile geliştirilmiş bir Kütüphane Otomasyon Sistemi'dir. Sistem, kütüphanedeki yazarlar ve kitapları yönetmek için işlevler sağlar. Yazarlar ve kitaplar için CRUD işlemleri ve sayfalama desteği sunar. 

Özellikler 

Yazar ekleme, güncelleme, silme ve getirme 

Kitap ekleme, güncelleme, silme ve getirme 

Yazarlar ve kitaplar için sayfalama desteği 

Tüm işlemler için RESTful API uç noktaları 

API testi için Swagger dokümantasyonu 

Kullanılan Teknolojiler 

Java 

Spring Boot 

Spring Data JPA 

H2 Veritabanı (geliştirme ve test için) 

Swagger (API dokümantasyonu için) 

Başlangıç 

Gereksinimler 

Java 11 veya üstü 

Maven 

Kurulum 

Depoyu klonlayın: 

git clone https://github.com/Makifkar/trailerlibrary.git 

 
cd kutuphane-otomasyon-sistemi 
 

Projeyi Maven ile inşa edin: 

mvn clean install 
 

Uygulamayı çalıştırın: 

mvn spring-boot:run 
 

Uygulamaya erişin: 

 

Swagger UI: http://localhost:8081/swagger-ui.html 

API Örnek Uç Noktaları 

Yazar Uç Noktaları 

POST /authors - Yeni yazar oluştur 

GET /authors/{id} - ID ile yazar getir 

GET /authors - Sayfalama ile yazarları listele 

PUT /authors/{id} - ID ile yazarı güncelle 

DELETE /authors/{id} - ID ile yazarı sil 

Kitap Uç Noktaları 

POST /books - Yeni kitap oluştur 

GET /books/{id} - ID ile kitap getir 

GET /books - Sayfalama ile kitapları listele 

PUT /books/{id} - ID ile kitabı güncelle 

DELETE /books/{id} - ID ile kitabı sil 
