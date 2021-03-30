package com.example.daftarpurabali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> Foto = new ArrayList<>();
    private ArrayList<String> namaPura = new ArrayList<>();
    private ArrayList<String> infoPura = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }


    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(Foto, namaPura, infoPura, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


    private void getDataFromInternet(){

        namaPura.add("Pura Tanah Lot");
        Foto.add("https://cdn.rentalmobilbali.net/wp-content/uploads/2018/01/Pura-Tanah-Lot-Tabanan.jpg");
        infoPura.add("Jika anda bertanya dari daftar 10 pura terbaik di Bali, yang mana pura Hindu di Bali yang paling populer bagi wisatawan Indonesia? Jawabannya adalah pura Tanah Lot. Pura Tanah Lot sangat populer sebagai tempat liburan wisatawan Indonesia. Saking populernya pura Tanah Lot, disaat musim sepi di Bali juga tetap ramai dengan kunjungan wisatawan. Pura Tanah Lot dibangun diatas batung karang besar yang berada di area lepas pantai. Untuk memasuki area pura, hanya dapat dilewati pada saat air laut surut. Sedangkan pada saat air laut pasang, pura Tanah Lot akan terlihat berada di tengah laut.");

        namaPura.add("Pura Luhur Uluwatu");
        Foto.add("https://cdn.rentalmobilbali.net/wp-content/uploads/2018/06/Pura-Luhur-Uluwatu-Bali-Aerial-View.jpg");
        infoPura.add("Pura Uluwatu juga sangat terkenal sebagai lokasi terbaik melihat pemandangan sunset, karena pengunjung dapat melihat pemandangan sunset dari atas tebing tanpa ada yang menghalagi pemandangan sunset. Selain pemandangan sunset, di lokasi pura Uluwatu wisatawan juga dapat melihat pemandangan Samudra Hindia.");

        namaPura.add("Pura Ulun Danu Beratan Bedugul");
        Foto.add("https://cdn.rentalmobilbali.net/wp-content/uploads/2012/02/Pura-Ulun-Danu-Danau-Bedugul.jpg");
        infoPura.add("Danau Beratan Bedugul dikeliling area perbukitan dan disekitar area pura Ulun Danu terdapat kebun yang tertata rapi. Karena berada di dataran tinggi, area pura Ulun Danu Beratan sangat sering diselimuti kabut dan menawarkan udara sejuk. Selain melihat keindahan pemandangan pura Ulun Danu Beratan, wisatawan juga dapat mencoba aktivitas wisata air di danau. Seperti menyewa perahu keliling danau Beratan.");

        namaPura.add("Pura Tirta Empul Tampak Siring");
        Foto.add("https://cdn.rentalmobilbali.net/wp-content/uploads/2011/06/Pura-Tirta-Empul-Tampak-Siring.jpg");
        infoPura.add("Jika diartikan ke bahasa Indonesia, Tirta Empul artinya mata air suci. Karena didalam area pura Tirta Empul terdapat sumber mata air alami. Air dialirkan ke area luar pura Tirta Empul yang berbentuk pemandian dengan pancuran air. Sumber mata air alami dan pemandian di area pura, yang menjadi daya tarik pura Tirta Empul sebagai tempat liburan di Bali. Berdekatan dengan lokasi pura Tirta Empul, tepatnya berada diatas bukit terdapat istana kepresidenan Tampak Siring. Bagi masyarakat Bali pemeluk agama Hindu, air dari pancuran di pura Tirta Empul adalah air suci yang diyakini akan membawa kesucian, ketenangan serta keberuntungan.");

        namaPura.add("Pura Taman Ayun Mengwi");
        Foto.add("https://cdn.rentalmobilbali.net/wp-content/uploads/2018/03/Pura-Taman-Ayun-Mengwi-Bali.jpg");
        infoPura.add("Lokasi pura Taman Ayun berada di Jalan Ayodya, Mengwi, Kabupaten Badung-Bali. Sebagian besar wisatawan yang berlibur ke pura Taman Ayun, adalah wisatawan yang selesai liburan ke objek wisata Bali utara dan Bali tengah, dan mempergunakan pura Taman Ayun sebagai tempat persingahan perjalanan wisata ke pura Tanah Lot atau ke tempat wisata Seminyak.");

        namaPura.add("Pura Taman Saraswati Ubud");
        Foto.add("https://cdn.rentalmobilbali.net/wp-content/uploads/2011/06/Pura-Taman-Saraswati-Ubud.jpg");
        infoPura.add("Salah satu objek wisata pura yang ada di Ubud Bali favorit wisatawan adalah Pura Taman Saraswati. Lokasi pura Taman Saraswati berada di area pusat Ubud dengan daya tarik utama terdapat pada keindahan arsitektur dan kolam bungan teratai. Sebagian besar wisatawan yang mengunjungi pura Taman Saraswati akan melakukan sesi foto dengan latar belakang pura. Selain itu, tidak ada biaya tiket masuk ke pura Taman Saraswati Ubud. Setiap pukul 19:30, di area pura Taman Saraswati Ubud akan di pentaskan pertunjukan seni tari Bali.");

        prosesRecyclerViewAdapter();
    }

}