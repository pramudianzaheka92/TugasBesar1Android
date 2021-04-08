package com.example.tugasbesar1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoBudaya = new ArrayList<>();
    private ArrayList<String> namaBudaya = new ArrayList<>();
    private ArrayList<String> infoBudaya = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromWebsite();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoBudaya, namaBudaya, infoBudaya, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // Mulai Mengambil Data dari website
    private void getDataFromWebsite(){
        fotoBudaya.add("https://his-travel.co.id/blog/media/article/Kebudayaan-dan-Tradisi-Indonesia-Yang-Mendunia-1.jpg");
        namaBudaya.add("Wayang");
        infoBudaya.add("Kesenian wayang adalah sebuah seni pertunjukan yang biasa dijumpai di daerah jawa. Seiring berjalan nya waktu, ternyata penikmat wayang tidak hanya warga negara Indonesia saja. Wisatawan asing juga ada loh yang senang melihat pertunjukan wayang!\n" +
                "\n" +
                "Bahkan, beberapa dari mereka memang sengaja jauh-jauh datang ke Indonesia untuk belajar mementaskan wayang di negri asalnya, dalam beberapa festival budaya. Keren ya!");

        fotoBudaya.add("https://his-travel.co.id/blog/media/article/Kebudayaan-dan-Tradisi-Indonesia-Yang-Mendunia-2.jpg");
        namaBudaya.add("Angklung");
        infoBudaya.add("Jawa Barat adalah tempat asal dari alat musik bamboo ini. Meskipun bernuansa tradisional, di Jawa Barat sendiri, alat musik ini dijadikan primadona di saung angklung Mang Udjo yang kerap kali menggelar pertunjukan dengan audiens wisata lokal dan mancanegara.\n" +
                "\n" +
                "Di luar negri, alat music angklung paling banyak digemari di negara Jepang, Korea, hingga Malaysia. Hebatnya, ada loh sekolah di luar negri yang mengajarkan cara memainkan alat musik ini kepada murid-muridnya.");

        fotoBudaya.add("https://his-travel.co.id/blog/media/article/Kebudayaan-dan-Tradisi-Indonesia-Yang-Mendunia-3.jpg");
        namaBudaya.add("Keris");
        infoBudaya.add("Keris adalah salah satu senjata tradisional yang dimiliki oleh anggota kerajaan di masa lalu. Karena memiliki nilai sejarah yang cukup panjang, keris ini pun telah tercatat sebagai salah satu warisan kebudayaan dunia oleh UNESCO. Meskipun keris sejatinya berasal dari Nusantara, hingga kini masih ada loh keris-keris yang tersimpan rapih di museum luar negeri.");

        fotoBudaya.add("https://his-travel.co.id/blog/media/article/Kebudayaan-dan-Tradisi-Indonesia-Yang-Mendunia-4.jpg");
        namaBudaya.add("Tari Saman");
        infoBudaya.add("Tarian adat asal Aceh ini diciptakan oleh seorang ulama pada abad XIV Masehi, yakni Syekh Saman. Tari Saman berasal dari daerah dataran tinggi Gayo, yang secara administratif meliputi daerah kabupaten Aceh Tengah. \n" +
               "\n" +
               "Pada awal perkembangannya, tarian ini dijadikan sebagai media dakwah kepada masyarakat setempat. Di mana kala itu sebelum tarian dipertunjukkan, maka pemuka adat akan melakukan pemberian nasihat untuk para penonton sekaligus para pemainnya sendiri. \n" +
               "\n" +
               "Di samping itu, pertunjukan dari tari adat Aceh ini juga begitu kental dengan dakwah dan syair petuah, yang menggunakan bahasa Gayo dan Arab.\n" +
               "\n" +
               "Tari Saman pada awal perkembangannya merupakan tari yang sakral, sehingga tidak bisa dipertunjukkan sembarangan. Biasanya tarian adat satu ini dipertontonkan saat peringatan Maulid Nabi. Untuk saat ini, tari adat tersebut juga biasa ditarikan untuk menyambut tamu kehormatan maupun berbagai acara kebudayaan lainnya.");

        fotoBudaya.add("https://his-travel.co.id/blog/media/article/Kebudayaan-dan-Tradisi-Indonesia-Yang-Mendunia-5.jpg");
        namaBudaya.add("Reog Ponorogo");
        infoBudaya.add("Reog adalah salah satu kesenian budaya yang berasal dari Jawa Timur bagian barat-laut dan Ponorogo dianggap sebagai kota asal Reog yang sebenarnya. Gerbang kota Ponorogo dihiasi oleh sosok Warok dan Gemblak, dua sosok yang ikut tampil pada saat Reog dipertunjukkan. Reog adalah salah satu bukti budaya daerah di Indonesia yang masih sangat kental dengan hal-hal yang berbau mistik dan ilmu kebatinan yang kuat.");

        fotoBudaya.add("https://his-travel.co.id/blog/media/article/Kebudayaan-dan-Tradisi-Indonesia-Yang-Mendunia-6.jpg");
        namaBudaya.add("Tari Kecak");
        infoBudaya.add("“Cak cak cak”, adalah lirik yang paling terngiang oleh Anda yang pernah melihat kesenian tari kecak. Mungkin tidak hanya Anda seorang yang berfikir demikian. Wisatawan asing yang menyukai kesenian ini, agaknya juga demikian kok! Sebab, nama tari Kecak yang sudah mendunia ini, memang diambil dari teriakan tadi.\n" +
                "\n" +
                "Dalam tarian kecak, terdapat sendratari yang juga dipertunjukan. Dan biasanya, tarian tersebut memvisualkan cerita pewayangan Rama dan Shinta.");

        fotoBudaya.add("https://his-travel.co.id/blog/media/article/Kebudayaan-dan-Tradisi-Indonesia-Yang-Mendunia-7.jpg");
        namaBudaya.add("Tari Barong Dari Bali");
        infoBudaya.add("Asal usul dari Tari Barong ini masih belum ketahui secara pasti, namun ada beberapa versi sejarah yang menceritakan tentang sejarah tentang awal terbentuknya Tari Barong ini. Pertama dari mitologi Hindu yang menjelaskan bahwa barong diambil dari kata Bahruang dalam bahasa sansekerta merupakan binatang yang dianggap memiliki kekuatan gaib dan sering disebut sebagai pelindung kebaikan.\n" +
                "\n" +
                "Ada juga yang menyebutkan, Tari Barong awalnya merupakan perwujudan dari penguasa alam gaib yang ada di Bali. Pada saat itu masyarakat Bali menggunakan Tari Barong ini untuk mengusir gangguan makhluk gaib yang ada disana. Walaupun banyak versi yang menyebutkan tentang sejarah Tari Barong ini, masyarakat Bali masih mempercayai bahwa Tari Barong merupakan warisan nenek moyang yang dianggap sakral dan memiliki nilai-nilai spiritual di dalamnya");

        fotoBudaya.add("https://his-travel.co.id/blog/media/article/Kebudayaan-dan-Tradisi-Indonesia-Yang-Mendunia-8.jpg");
        namaBudaya.add("Sendratari Ramayana");
        infoBudaya.add("Pertunjukan Sendratari Ramayana ini biasanya diselenggarakan di teater terbuka sebelah barat kompleks Candi Prambanan. setting panggung yang di gunakan untuk pertunjukan Sendratari Ramayana  ini sangatlah indah. Dengan menggunakan Candi Siwa, Candi Wisnu dan Candi Brahma sebagai latar belakang panggungnya. Selain itu didukung dengan lampu cahaya yang menyorot ke arah candi menghasilkan efek cahaya yang membuat candi tersebut terlihat megah pada malam hari. Namun pementasan pada panggung terbuka ini hanya di selenggarakan pada musim kemarau saja. Pada musim hujan biasanya diselenggarakan di gedung tertutup, namun format cerita yang di gunakan lebih panjang dan lebih lengkap.");

        fotoBudaya.add("https://his-travel.co.id/blog/media/article/Kebudayaan-dan-Tradisi-Indonesia-Yang-Mendunia-9.jpg");
        namaBudaya.add("Tari Pendet");
        infoBudaya.add("Tari pendet merupakan salah satu tarian selamat datang yang paling tua di Pulau Bali. Menarikan tarian ini sudah menjadi bagian yang tidak terpisahkan dari kehidupan spiritual masyarakat Hindu di Bali. Para ahli seni pertunjukan Bali, berdasarkan beberapa catatan yang ada, menyetujui bahwa tahun 1950 adalah tahun kelahiran tari Pendet. Tidak hanya saat menyambut tamu-tamu penting, dalam setiap pertunjukan tari-tarian Bali, tarian ini selalu dijadikan sebagian tarian pembuka.\n" +
                "\n" +
                "Jenis tarian penyambutan ini dibawakan oleh sekelompok remaja putri yang masing-masing membawa mangkok perak yang berisi bunga warna-warni. Dan pada bagian akhir tarian, para penari menaburkan bunga-bunga yang mereka bawa ke arah penonton atau tamu yang disambut, sebagai ucapan selamat datang.");

        fotoBudaya.add("https://his-travel.co.id/blog/media/article/Kebudayaan-dan-Tradisi-Indonesia-Yang-Mendunia-10.jpg");
        namaBudaya.add("Batik");
        infoBudaya.add("Batik adalah kain bergambar dan proses pembuatannya dirancang khusus atau menerapkan pola pada kain yang masih kosong, kemudian proses khusus memberikannya fitur yang khas.\n" +
                "\n" +
                "Sekarang, batik juga dapat digunakan selama acara semi-resmi atau formal. Ini tidak terlepas dari perkembangan mode dan pakaian pada batik itu sendiri. Sehingga pakaian batik bisa semakin dihargai dan dikagumi oleh segala usia dan kalangan.\n" +
                "\n");

        prosesRecyclerViewAdapter();
    }
}