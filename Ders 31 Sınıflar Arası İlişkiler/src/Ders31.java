public class Ders31 {
    /*
                  Object Oriented Programming Concepts
                Nesne Yönelimli Programlama Konseptleri

          *Encapsulation (Kapsülleme)
          *Inheritence (Kalıtım)
          *Polymorphism (Çok Biçimlilik)
          *Abstraction (Soyutlama)

                            SINIFLAR ARASI İLİŞKİLER

          *Bağımlılık (Dependency) "uses a" Class2 uses a Class1
          *Birleştirme (Composition) "has a"
          *Kalıtım (Inheritance) "is a"
      */
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();
//        c2.run(c1);

        c1.object = c2;



    }
}
