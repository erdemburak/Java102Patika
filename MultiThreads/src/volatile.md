# Volatile

- Volatile anahtar kelimesi kullanıldığı kod bloğu için cache belleği aradan çıkartıp
direkt olarak ana bellekte çalışmasını sağlar.
- Kullanımı çok fazla karşılaşılan bir şey değildir. Bunun bir nedeni cache belleği 
aradan çıkarmak işlemci yükünü arttırıp performans sorunları oluşturacaktır.
  - Kullanımı şu şekildedir. 

        Erişim_belirtici volatile Veri_Tipi Değişken_Adı;
        -- public volatile int orderNo;