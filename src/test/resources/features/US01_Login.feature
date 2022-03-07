Feature: User successfully log in
  Scenario: TC01 User can sign in Successfully
    When kullanıcı Auro Jewelry sayfasına ulaşır
    Then menüde bulunan login butonuna tıklar
    Then doğru "kullaniciAdi" ve "şifre" girer
    And hesabına başarılı bir şekilde giriş yapar
