package com.devjurnal.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ResepModel> listResep;
    ResepAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1. koneksi dengan recycler pada XML
        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        // TODO 2. Buat Model Class
        // TODO 3. BUat Array List
        listResep = new ArrayList<>();

        // TODO 4. Set data ke ResepModel
        ResepModel resep3 = new ResepModel();
        ResepModel resep4 = new ResepModel();
        ResepModel resep5 = new ResepModel();

        // TODO 5. Masukkan data ke List
            ResepModel resep1 = new ResepModel();
            resep1.setJudul("Cemilan Khas Jepara, Horok Horok");
            resep1.setPoster("https://i2.wp.com/afikrubik.com/wp-content/uploads/2017/01/makanan-khas-jepara-horok-horok.jpg?w=800&ssl=1");
            resep1.setSummary("Horok-horok merupakan makanan ringan khas Jepara yang terbuat dari tepung pohon aren.");
            resep1.setDetail(
                    "Bahan-Bahan :" +
                    "\n1. Garam secukupnya"+
                    "\n2. Tepung aren secukupnya"+
                    "\n3. Daun pisang secukupnya"+


                    "\n\nLangkah :" +

                    "\n1. Langkah pertama adalah mempersiapkan bahan-bahan yang diperlukan. Lalu baru melakukan prosesnya yang lumayan lama, kurang lebih dua hari."+
                    "\n2. Cuci tepung aren secukupnya, kemudian baru dikeringkan."+
                    "\n3. Setelah sudah kering, sangrai selama beberapa menit."+
                    "\n4. Kemudian kukus tepung aren tersebut sampai matang."+
                    "\n5. Tuang ke dalam tempayan dan aduk dengan sisir."+
                    "\n6. Proses selanjutnya adalah pengerukan sagu dari batang aren. Lalu cuci kembali."+
                    "\n7. Selanjutnya adalah mengeringkan tepung tersebut dengan bantuan abu di atas adonan"+
                    "\n8. Kukus kembali sampai benar-benar kering dan membentuk gumpalan-gumpalan kecil."+
                    "\n9. Ulangi pengukusan ini selama beberapa kali hingga membentuk gumpalan kristal yang terasa kenyal."+
                    "\n10. Angkat dan sajikan di piring saji yang sudah dilapisi daun pisang."+
                    "\n11. Taburi garam dan hidangan horok-horok siap dinikmati."

            );

            listResep.add(resep1);

            ResepModel resep2 = new ResepModel();
            resep2.setJudul(" Makanan Khas Jepara, Kuluban");
            resep2.setPoster("https://i2.wp.com/afikrubik.com/wp-content/uploads/2017/01/makanan-khas-jepara-kuluban.jpg?w=800&ssl=1");
            resep2.setSummary("Kuluban ini bisa dibilang merupakan saladnya orang Jepara. Berisi berbagai sayuran seperti kacang panang, tauge, petai, nangka muda dan daun kacang panjang.");
            resep2.setDetail(
                    "Bahan Bahan :"+

                    "\n1/2 butir kelapa setengah tua, diparut. " +
                            "\n3 ikat kangkung " +
                            "\n1 ikat bayam " +
                            "\n1 ikat kacang panjang " +
                            "\n1 ikat daun belinjo " +
                            "\n2 ikat sawi hijau " +
                            "\n1/4 bagian kubis ukuran sedang " +
                            "\n2 ons kecambah " +
                            "\nMentimun muda, kupas, lalu iris-iris.\n" +


                    "\n\nBahan Bumbu :"+
                    "\n2 siung besar bawang putih " +
                            "\n6 buah cabe merah " +
                            "\n2 cm kencur " +
                            "\n2 sdt gula merah " +
                            "\n1 sdt garam "+

                    "\n\nLangkah :"+
                    "\n1. Pilih daun atau bagian yang baik dari semua sayuran, cuci hingga bersih. " +
                            "\n2. Potong-potong kacang panjang sesuai selera, biasanya kira-kira 10 cm. " +
                            "\n3. Rebus sayuran dengan memasukkan terlebih dahulu kacang panjang sampai agak lunak, kemudian menyusul sayuran yang lain, dan lanjutkan merebus sampai semua sayuran lunak. " +
                            "\n4. Tiriskan. Tauge di cuci bersih, kemudian hanya direndam dengan air panas sampai mendidih. " +
                            "\n5. Sangrai semua bumbu, lalu haluskan dengan ditambah garam, gula merah. " +
                            "\n6. Masukkan parutan kelapa, campurkan hingga rata dengan bumbu. " +
                            "\n7. Hidangkan dengan cara mencampur bumbu dan semua sayuran. Boleh ditambah irisan mentimun jika suka."

            );
            listResep.add(resep2);

            resep3.setJudul("Jajanan Khas Jepara, Rondo Royal");
            resep3.setPoster("https://i1.wp.com/afikrubik.com/wp-content/uploads/2017/01/rondho-royal-khas-jepara.jpg?w=800&ssl=1");
            resep3.setSummary("Rondo royal ini juga dikenal dengan nama monyos. Merupakan jajanan tradisional khas Jepara yang terbuat dari tepung beras. Diisi dengan tape dan dimasak dengan cara digoreng.");
            resep3.setDetail(
                    "Bahan Bahan :"+
                    "\n1 250 gram Tape Singkong"+
                    "\n100 gram Tepung Terigu"+
                    "\nSecukupnya Gula Pasir"+
                    "\nSecukupnya Air"+
                    "\nSecukupnya Garam (sedikit saja)"+
                    "\nSecukupnya Minyak Goreng"+


                    "\n\nLangkah :"+
                    "\n1. Bersihkan tape, buang serat2nya. Lalu bentuk menjadi bulat2. Sisihkan."+
                    "\n2. Campurkan terigu, gula pasir, garam, dan air sampai menjadi adonan yang lumer."+
                            "\n3. Masukkan bulatan tape kedalam adonan terigu sampai seluruh bagian tape terselimuti oleh adonan."+
                            "\n4. Panaskan minyak, lalu goreng adonan tape sampai matang & berwarna keemasan."+
                            "\n5. Angkat dan rondo royal alias tape goreng sudah siap untuk disantap :)"
            );

            listResep.add(resep3);
            resep4.setJudul("Makanan Khas Jepara, Bongko Mento");
            resep4.setPoster("https://i0.wp.com/afikrubik.com/wp-content/uploads/2017/01/makanan-khas-jepara-bongko-mento.jpg?w=800&ssl=1");
            resep4.setSummary("Makanan ini sering dijadikan sebagai snack untuk arisan atau acara kecil yang diadakan di rumah");
            resep4.setDetail(
                    "Bahan untuk membuat dadar :"+
                    "\n1 1. 100 gram tepung terigu protein sedang."+
                    "\n2. 100 gram tepung beras."+
                    "\n3. 2 butir telur ayam."+
                    "\n4. 350 mililiter air putih."+
                    "\n5. Garam secukupnya."+
                    "\n6. Minyak sayur secukupnya untuk menggoreng."+
                    "\n7. Daun pisang untuk membungkus."+

                    "\n\nBahan dan bumbu untuk membuat masakan ayam:"+
                    "\n1. 200 gram daging ayam, rebus, kemudian dicincang sampai halus."+
                    "\n2. 200 mililiter santan yang dibuat dari 0,25 butir kelapa."+
                    "\n3. Minyak sayur untuk menumis."+
                    "\n4. 2 lembar daun jeruk, singkirkan tulang daunnya."+
                    "\n5. Lengkuas yang sudah dimemarkan seukuran 2 ruas jari kelingking."+
                    "\n6. Garam, gula pasir, lada putih bubuk, dan kaldu bubuk instan secukupnya."+
                    "\n7. 1 sendok teh air asam jawa."+

                    "\n\nBumbu untuk masakan ayam yang dihaluskan:" +
                            "\n1. 1 siung bawang putih." +
                            "\n2. 2 siung bawang merah." +
                            "\n3. 1 butir kemiri yang sudah disangrai." +
                            "\n4. 0,125 sendok teh jintan." +
                            "\n5. 0,25 sendok teh ketumbar." +

                            "\n\nBahan untuk membuat kepala santan (areh):" +
                            "\n1. 600 mililiter santan dari 1,5 butir kelapa." +
                            "\n2. Garam secukupnya." +

                            "\n\nCara membuat bento mento khas Jawa Tengah:" +
                            "\n1. Panaskan minyak sayur untuk menggoreng. Goreng adonan untuk membuat dadar seperti membuat dadar. Sisihkan." +
                            "\n2. Panaskan minyak sayur untuk menumis. Tumis bumbu yang sudah dihaluskan bersama daun jeruk, dan lengkuas sampai harum. " +
                            "\n3. Masukkan daging ayam, tambahkan garam, gula pasir, lada putih bubuk, dan kaldu bubuk instan, aduk rata. Tuangkan santan, masak sampai matang dan mengering, angkat, sisihkan." +
                            "\n4. Masak 600 mililiter santan dan tambahkan garam, aduk perlahan sampai matang, angkat." +
                            "\n5. Ambil selembar dadar, isi dengan masakan ayam, siram dengan areh secukupnya, bungkus. Bungkus kembali dengan daun pisang. Kukus selama 20 menit, angkat."+
                            "\nBongko mento khas Jawa Tengah siap dihidangkan."
            );
        listResep.add(resep4);


        // TODO 6. Buat Adapter
        // TODO 7. Set Adapter
        adapter = new ResepAdapter(MainActivity.this, listResep);
        recycler.setAdapter(adapter);

        // TODO 8. Buat LayoutManager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}
