package com.infopariwisata;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Database {
	
	public static final int VERSI_DATABASE= 1;
	public static final String NAMA_DATABASE = "wisata.db";
	
	
	public static final String NAMA_TABEL = "wisataalam";
	public static final String NAMA_TABEL2 = "wisatabudaya";
	public static final String NAMA_TABEL3 = "wisatakuliner";
	
	
	public static final String FIELD_ID = "_id";
	public static final int POSISI_ID = 0;
	public static final String FIELD_JUDUL = "judul";
	public static final int POSISI_JUDUL = 1;
	public static final String FIELD_DESKRIPSI = "deskripsi";
	public static final int POSISI_DESKRIPSI = 2;
	public static final String FIELD_GAMBAR = "gambar";
	public static final int POSISI_GAMBAR = 3;
	
	public static final String FIELD_ID2 = "_id";
	public static final int POSISI_ID2 = 0;
	public static final String FIELD_JUDUL2 = "judul";
	public static final int POSISI_JUDUL2 = 1;
	public static final String FIELD_DESKRIPSI2 = "deskripsi";
	public static final int POSISI_DESKRIPSI2 = 2;
	public static final String FIELD_GAMBAR2 = "gambar";
	public static final int POSISI_GAMBAR2 = 3;
	
	public static final String FIELD_ID3 = "_id";
	public static final int POSISI_ID3 = 0;
	public static final String FIELD_JUDUL3 = "judul";
	public static final int POSISI_JUDUL3 = 1;
	public static final String FIELD_DESKRIPSI3 = "deskripsi";
	public static final int POSISI_DESKRIPSI3 = 2;
	public static final String FIELD_GAMBAR3 = "gambar";
	public static final int POSISI_GAMBAR3 = 3;
	
	public static final String[] FIELD_TABEL ={ Database.FIELD_ID, Database.FIELD_JUDUL, Database.FIELD_DESKRIPSI,Database.FIELD_GAMBAR };
	public static final String[] FIELD_TABEL2 ={ Database.FIELD_ID2, Database.FIELD_JUDUL2, Database.FIELD_DESKRIPSI2,Database.FIELD_GAMBAR2 };
	public static final String[] FIELD_TABEL3 ={ Database.FIELD_ID3, Database.FIELD_JUDUL3, Database.FIELD_DESKRIPSI3,Database.FIELD_GAMBAR3 };
	
	private Context crudContext;
	private SQLiteDatabase crudDatabase;
	private SqliteManagerHelper crudHelper;
	
	private static class SqliteManagerHelper extends SQLiteOpenHelper {

			private static final String BUAT_TABEL =
				"create table " + NAMA_TABEL + " (" +
				Database.FIELD_ID + " integer primary key autoincrement, " +
				Database.FIELD_JUDUL + " text not null, " +
				Database.FIELD_DESKRIPSI + " text not null," +	
				Database.FIELD_GAMBAR + " blob not null " +
				");";
			
			private static final String BUAT_TABEL2 =
					"create table " + NAMA_TABEL2 + " (" +
					Database.FIELD_ID2 + " integer primary key autoincrement, " +
					Database.FIELD_JUDUL2 + " text not null, " +
					Database.FIELD_DESKRIPSI2 + " text not null," +	
					Database.FIELD_GAMBAR2 + " blob not null " +
					");";
			
			
			private static final String BUAT_TABEL3 =
					"create table " + NAMA_TABEL3 + " (" +
					Database.FIELD_ID3 + " integer primary key autoincrement, " +
					Database.FIELD_JUDUL3 + " text not null, " +
					Database.FIELD_DESKRIPSI3 + " text not null," +	
					Database.FIELD_GAMBAR3 + " blob not null " +
					");";

			public SqliteManagerHelper(Context context) {
				super(context, NAMA_DATABASE, null, VERSI_DATABASE);
			}

			@Override
			public void onCreate(SQLiteDatabase database) {
				database.execSQL(BUAT_TABEL);
				database.execSQL(BUAT_TABEL2);
				database.execSQL(BUAT_TABEL3);
				
				ContentValues values = new ContentValues();
				values.put(Database.FIELD_ID, "1");
				values.put(Database.FIELD_JUDUL, "Danau Toba, Sumatera Utara");
				values.put(Database.FIELD_DESKRIPSI, "Danau Toba di Sumatera Utara ditetapkan oleh Kementerian Pariwisata sebagai 10 Destinasi Prioritas atau disebut juga 10 Bali Baru. Pembangunan aksesbilitas pun dikebut di sana, Bandara Silangit pun dikebut maksimal agar lebih banyak pesawat bisa terbang ke sana dan menampung lebih banyak penumpang dan November 2017 kemarin, Presiden Jokowi pun baru meresmikan Terminal Bandara Internasional Silangit. Presiden Jokowi berharap, Terminal Bandara Internasional Silangit dapat menjadi pintu masuk atau gerbang bagi turis mancanegara yang mau menikmati keindaan Danau Toba. Jarak dari Bandara Silangit ke Danau Toba memang lebih dekat, tak sejauh dari Bandara Kualanamau." );
				values.put(Database.FIELD_GAMBAR, R.drawable.toba);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "2");
				values.put(Database.FIELD_JUDUL, "Labuan Bajo, NTT");
				values.put(Database.FIELD_DESKRIPSI, "Labuan Bajo adalah sebuah kota pelabuhan kecil yang cantik di ujung paling barat pulau Flores dan merupakan pintu masuk ke Taman Nasional Komodo (TNK), NTT. Meski hanya desa kecil, Labuan Bajo menawarkan ragam aktivitas wisata yang membuatnya pantas masuk dalam daftar 10 Destinasi Pariwisata Prioritas. Banyak yang bisa turis lakukan di Labuan Bajo, seperti snorkeling hingga bertemu dengan komodo. Pun di Taman Nasional Komodo baik di Pulau Komodo sampai di Pulau Komodo dan Pulau Rinca, merupakan satu-satunya habitat Si Naga Purba." );
				values.put(Database.FIELD_GAMBAR, R.drawable.labajo);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "3");
				values.put(Database.FIELD_JUDUL, "Raja Ampat, Papua Barat");
				values.put(Database.FIELD_DESKRIPSI, "Siapa yang tidak bermimpi datang ke Raja Ampat di Papua Barat? Keindahan gugusan pulau karang, bawah laut hingga pesisir pantainya begitu menggoda. Sering kali destinasi ini pun menyabet penghargaan dunia, serta dikunjungi Presiden Jokowi. Yang terbaru di akhir tahun 2017 kemarin, Presiden Jokowi menyambangi Raja Ampat di perayaan Hari Ibu. Bersama keluarganya, Presiden Jokowi berlayar mengarungi lautan Raja Ampat dan memancing. Dia pun menegaskan pembangunan Raja Ampat lewat bandara, termasuk untuk pariwisatanya." );
				values.put(Database.FIELD_GAMBAR, R.drawable.raam);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "4");
				values.put(Database.FIELD_JUDUL, "Banyuwangi, Jawa Timur");
				values.put(Database.FIELD_DESKRIPSI,"Banyuwangi terus unjuk gigi di dunia pariwisata. Destinasi di paling timur Pulau Jawa ini terus mempromosikan keindahan alam dan budayanya lewat berbagai event. Sepanjang tahun 2017 kemarin saja, tercatat Banyuwangi punya 60 event! Beberapa di antaranya seperti Festival Jeding Rijig (toilet bersih), Kebaya Festival, Festival Sastra, Banyuwangi Agro Expo, Banyuwangi International BMX, Banyuwangi Beach Jazz Festival, Festival Gandrung Sewu dan masih banyak lagi. Tentu dengan banyaknya event, membuat minat traveler ke Banyuwangi makin tinggi. Belum lagi destinasi alam di Banyuwangi seperti Gunung Ijen hingga Taman Nasional Meru Betiri dan Taman Nasional Alas Purwo. Perhatian pemerintah daerah setempat terhadap fasilitas penunjang pariwisata di tiap destinasinya patut diapresiasi   ");
				values.put(Database.FIELD_GAMBAR, R.drawable.bawng);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "5");
				values.put(Database.FIELD_JUDUL, "Mandalika, NTB");
				values.put(Database.FIELD_DESKRIPSI, "Mandalika di Lombok, NTB masuk dalam daftar 10 Destinasi Prioritas. Di bulan Oktober 2017 kemarin, Mandalika akhirnya diresmikan Presiden Jokowi sebagai Kawasan Ekonomi Khusus (KEK) Pariwisata setelah sempat 'tertidur' 29 tahun. Rencananya beberapa hotel dan resor berbintang akan dibangun di Mandalika dengan nilai investasi Rp 4,1 triliun dan total kamar mencapai 10 ribu. Serta, siap dibangun juga sirkuit balap kelas dunia dan convention center. ITDC (Indonesia Tourism Development Corporation) pengelola KEK Mandalika, Provinsi NTB dan juga Kabupaten memegang kendali selaku pengelola Mandalika. Presiden Jokowi berpesan agar dibangun bangunan-bangunan bergaya Lombok, tata ruang yang baik, toilet bertaraf internasional dan aturan main para investor yang jelas." );
				values.put(Database.FIELD_GAMBAR, R.drawable.mndlk);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "6");
				values.put(Database.FIELD_JUDUL, "Kepulauan Seribu, Jakarta");
				values.put(Database.FIELD_DESKRIPSI, "Di lepas daratan Jakarta terdapat Kepulauan Seribu yang juga masuk dalam daftar 10 Destinasi Prioritas. Sebut saja beberapa pulau cantik di sana seperti Pulau Perak, Pulau Bintang, Pulau Bira, Pulau Bulat, Pulau Pari, Pulau Tidung, Pulau Pramuka, Pulau Bidadari, Pulau Onrust, Pulau Macan, Pulau Pelangi, Pulau Semak Daun dan masih banyak lagi. Pemprov DKI Jakarta di bawah kepemimpinan Anies Baswedan dan Sandiaga Uno berencana mengembangkan pulau-pulau di Kepulauan Seribu untuk wisata alam dan wisata bahari. Tujuannya untuk memacu perekonomian setempat." );
				values.put(Database.FIELD_GAMBAR, R.drawable.kpser);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "7");
				values.put(Database.FIELD_JUDUL, "Telaga Menjer Wonosobo");
				values.put(Database.FIELD_DESKRIPSI, "Telaga Menjer merupakan telaga alam yang terluas di Kabupaten Wonosobo, berada pada ketinggian 1.300 m di atas permukaan laut dengan luas 70Ha dan kedalaman air mencapai 50 m. Telaga Menjer terletak di Desa Maron Kecamatan Garung, 12 km sebelah utara Kota Wonosobo, berfungsi juga untuk pembangkit tenaga listrik." );
				values.put(Database.FIELD_GAMBAR, R.drawable.telaga_menjer);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "8");
				values.put(Database.FIELD_JUDUL, "Tebing Koja, Tangerang");
				values.put(Database.FIELD_DESKRIPSI, "Tangerang memang bukanlah wilayah yang identik dengan wisata. Alih-alih wisata, Tangerang justru terkenal dengan banyaknya pabrik dan industri di sana. Praktis polusi dan macet sangat lekat dengan Tangerang. Orang-orang pun pikniknya ya cuma ke Mall aja. Hehehe. Tapi itu dulu, kini Tangerang juga sudah punya beberapa destinasi wisata yang oke punya. Salah satunya Tebing Koja Kandang Godzilla. Destinasi kekinian yang dulunya biasa saja, kini jadi sangat memesona. " );
				values.put(Database.FIELD_GAMBAR, R.drawable.tekoj);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "9");
				values.put(Database.FIELD_JUDUL, "Sombori, Sulawesi Tengah");
				values.put(Database.FIELD_DESKRIPSI, "Kawasan timur Indonesia memang tidak dipungkiri keindahan kepulauan dan bawah lautnya. Yang sedang booming, adalah Sombori di Sulawesi Tengah. Lanskap gugusan pulaunya disebut-sebut sebagai Raja Ampat ala Sulawesi Tengah. Kawasan Konservasi Perairan Sombori begitu nama lengkapnya. Sombori memiliki aquarium point di Pulau Dua, Gua Berlian yang baru ditemukan, Pantai Koko yang masih perawan, serta berbagai keindahan lainnya yang belum dijelajahi. Lokasinya masuk dalam wilayah Morowali yang butuh perjuangan keras untuk sampai ke sana. Sombori terletak di perbatasan antara Sultra dan Sulteng. Akses terdekat adalah melalui Kendari, dilanjutkan dengan enam jam perjalanan menuju Dermaga Lafeu di Sulteng. Kemudian lanjut dengan menggunakan kapal menuju Sombori dengan waktu sekitar tiga jam. Sekarang ini, sudah banyak operator wisata yang buka paket open trip di Sombori. Kami redaksi detikTravel percaya, jika Sombori dikelola dengan maksimal maka akan jadi destinasi incaran turis dunia di masa depan." );
				values.put(Database.FIELD_GAMBAR, R.drawable.sombori);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "10");
				values.put(Database.FIELD_JUDUL, "Waduk Wadaslintang, Wonosobo");
				values.put(Database.FIELD_DESKRIPSI, "Waduk Wadaslintang terletak di dua wilayah yaitu Kabupaten Wonosobo dan Kabupaten Kebumen. Fungsi utama sebagai pembangkit listrik tenaga air, industri perikanan dan irigasi pertanian. Di Waduk Wadaslintang tidak hanya ikan, sesekali muncul reptil sejenis biawak di permukaan air waduk yang jernih. Di samping fungsi utama waduk Wadaslintang merupakan oyek wisata yang sangat menarik. Keindahan waduk dapat dinikmati melalui gardu pandang diatas bukit batu. Disekitar waduk Wadaslintang juga terdapat obyek wisata yang lain seperti Air Anget Somagede, tempat meditasi Indrokilo, dan Curug Winong" );
				values.put(Database.FIELD_GAMBAR, R.drawable.wadaslintang);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				
				
				
				ContentValues values2 = new ContentValues();
				
				values2.put(Database.FIELD_ID2, "1");
				values2.put(Database.FIELD_JUDUL2, "Festival Bau Nyale, Pulau Lombok");
				values2.put(Database.FIELD_DESKRIPSI2,"Festival Bau Nyale adalah acara kebudayaan yang jadi ritual tahunan di Lombok, terutama masyarakat sekitar Pantai Kuta hingga Pantai Seger. Ritual Bau Nyale adalah mencari cacing (nyale) yang muncul di pantai setahun sekali. Cacing itu berwarna-warni dan diyakini sebagai jelmaan Putri Mandalika. Nah, jangan lewatkan Festival Bau Nyale Februari nanti ya.");
				values2.put(Database.FIELD_GAMBAR2, R.drawable.nyale);
				database.insert(NAMA_TABEL2, FIELD_ID2,values2);
				
				
				values2.put(Database.FIELD_ID2, "2");
				values2.put(Database.FIELD_JUDUL2, "Larung Sukerto, Jawa Tengah");
				values2.put(Database.FIELD_DESKRIPSI2,"Malam satu syura, atau dalam sistem kelenderisasi hijriyah merupakan malam perpindahan tahun, diyakini oleh warga Dusun Sruni Kelurahan Jaraksari Wonosobo sebagai malam yang sakral. Pada malam perpindahan tahun ini, para warga menggelar ritual Larung Sukerto ( melarung sungai) di Kali Semagung dengan serangkain acara diantaranya melarung sesaji serta padusan pada tengah malam. Proses ritual Larung Sukerto dimulai pukul 20.00 WIB hingga pukul 01.00 WIB. Sebelum melarung sesaji dan padusan pada tengah malam. Para warga berkumpul di halaman rumah milik warga setempat. Deretan perangkat sudah disiapkan, diantaranya gemelan, obor, deretan sesaji jajanan pasar serta puluhan tumpeng dan lauk pauk. Menariknya lagi, hampir semua warga yang mengikuti prosesi ritual mengenakan pakain ada jawa dari anak-anak hingga manula. Acara dibuka dengan sambutan sesepuh desa yang menegaskan tentang makna bulan syura dan awal hijriyah. Setelah itu, pagelaran seni meliputi lengger dan deretan tarian lain digelar. Tak hanya itu, keragaman budaya dan agama juga terasa kental dalam ritual tersebut. Sebab, di dusun tersebut terdapat beragam kelompok seni serta tumbuh beragam pemeluk agama. Sehingga sepanjang malam menunggu pukul 00.00 diisi dengan tarian seni warga serta dagelan jawa. Usai pertunjukan seni, acara kemudian dilanjutkan dengan doa antar agama dan antar iman. Ratusan warga mengepung deretan sesaji jajanan pasar serta tumpeng dan dimulai doa oleh para pemimpin agama. Syahdan, tumpeng dimakan bersama, sedangkan jajanan pasar ditata rapi untuk dilarungkan disungai Semagung.Proses larung sesaji tersebut dimulai pukul 23.30 WIB. Para warga dengan menggunakan penerang obor berjalan secara beriringan menuju sungai Semagung yang jaraknya sekitar 2 kilometer dari Dusun Sruni. Sepanjang perjalanan semua warga berdiam sembari menatap lurus ke depan hingga sekitar pukul 00.00 WIB sampai di tepi sungai Semagung,dipimpin sesepuh dusun tersebut deretan sesaji dilarung bersama, kemudian dilanjutkan dengan padusan bersama sebagai penolak balak dan mencari berkah memasuki awal tahun. Larung Sikerto dimaksudkan sebagai bentuk rasa syukur sekaligus instropeksi hubungan antara warga Sruni dengan tetangga, tuhan serta lingkungannya. Makna larung sukerto juga untuk merekatkan hubungan antar warga. diantaranya melakukan makan bersama serta doa bersama melintasi batas iman dan kepercayaan. Sebagai wujud kedamaian, harapannya pada tahun mendatang hubungan antar warga semakin guyub dan rukun.");
				values2.put(Database.FIELD_GAMBAR2, R.drawable.sukerto);
				database.insert(NAMA_TABEL2, FIELD_ID2,values2);
				
				
				values2.put(Database.FIELD_ID2, "3");
				values2.put(Database.FIELD_JUDUL2, "Festival Pasar Terapung, Banjarmasin");
				values2.put(Database.FIELD_DESKRIPSI2, "Festival Lembah Baliem di Kabupaten Jayawijaya ini merupakan acara perang antarsuku Papua yang dilakukan sebagai lambang kesuburan dan kesejahteraan. Para prajurit kebanggaan suku-suku tersebut akan adu kekuatan mereka. Kamu nggak usah khawatir kalau mereka bakal perang sambil bunuh-bunuhan ya, perang ini aman kok. Hehehe. Selain itu ada atraksi budaya, karapan babi dan juga tari-tarian. Festival ini sudah terkenal hingga mancanegara lho.");
				values2.put(Database.FIELD_GAMBAR2, R.drawable.pater);
				database.insert(NAMA_TABEL2, FIELD_ID2,values2);
				
				
				
				
				
				ContentValues values3 = new ContentValues();
				values3.put(Database.FIELD_ID3, "1");
				values3.put(Database.FIELD_JUDUL3, "Mie Aceh");
				values3.put(Database.FIELD_DESKRIPSI3, "Mie Aceh sangat jelas berasal dari daerah Aceh. Mie ini salah satu makanan khas daerah Aceh yang juga merupakan makanan khas Indonesia. Bahan dasar makanan ini adalah berasal dari mie kuning tebal dengan diirisi daging sapi, daging kambing ataupun makanan laut seperti udang dan cumi-cumi yang disajikan dalam bentuk sup dengan kuah sejenis kari yang gurih serta pedas.");
				values3.put(Database.FIELD_GAMBAR3, R.drawable.mieaceh);
				database.insert(NAMA_TABEL3, FIELD_ID3,values3);
				
				values3.put(Database.FIELD_ID3, "2");
				values3.put(Database.FIELD_JUDUL3, "Rendang Padang");
				values3.put(Database.FIELD_DESKRIPSI3, "Rendang atau dalam bahasa Minangnya lebih dikenal dengan Randang makanan khas Indonesia yang berasal dari daerah Padang, Sumatera Barat. Rendang ini merupakan salah satu masakan tradisional Minangkabau yang menggunakan daginf dan santan kelapa sebagai bahan dasarnya. Rendang ini biasanya mempunyai kandungan bumbu repah-rempah yang sangat banyak");
				values3.put(Database.FIELD_GAMBAR3, R.drawable.rendang);
				database.insert(NAMA_TABEL3, FIELD_ID3,values3);
				
				values3.put(Database.FIELD_ID3, "3");
				values3.put(Database.FIELD_JUDUL3, "Mie Ongklok");
				values3.put(Database.FIELD_DESKRIPSI3, "Mengunjungi kota dingin Wonosobo tak lengkap rasanya jika belum mencoba makanan yang memiliki nama unik satu ini, yaitu Mie Ongklok. Makanan spesifik dari Wonosobo berupa mie, kobis dan kucai yang direbus setengah matang dengan cara dicelupkan ke dalam air mendidih disiram dengan 'lo' semacam saus gurih beraroma ebi (udang kering).");
				values3.put(Database.FIELD_GAMBAR3, R.drawable.mie_ongklok);
				database.insert(NAMA_TABEL3, FIELD_ID3,values3);
				
				values3.put(Database.FIELD_ID3, "4");
				values3.put(Database.FIELD_JUDUL3, "Gudeg Yogyakarta");
				values3.put(Database.FIELD_DESKRIPSI3, "Gudeg merupakan kuliner yang tidak bisa dipisahkan dengan kota Yogyakarta bahkan sampai-sampai Yogyakarta memiliki julukan sebagai kota Gudeg. Gudeg asli Yogyakarta memiliki rasa yang sangat manis. Gudeg terbuat dari sayur nangka muda bersantan yang biasa dinikmati dengan nasi, ayam kampung, dan telur kecap.");
				values3.put(Database.FIELD_GAMBAR3, R.drawable.gudeg);
				database.insert(NAMA_TABEL3, FIELD_ID3,values3);
				
				
				
			}


			@Override
			public void onUpgrade(SQLiteDatabase db, int oldVersion,
					int newVersion) {
				// TODO Auto-generated method stub
				
			}
		}
	
	public Database(Context context) {
		crudContext = context;
	}
	
	

	public void bukaKoneksi() throws SQLException {
		crudHelper = new SqliteManagerHelper(crudContext);
		crudDatabase = crudHelper.getWritableDatabase();
	}
	
	public SQLiteDatabase data()
	{
		crudDatabase = crudHelper.getWritableDatabase();
		return crudDatabase;
	}

	public void tutupKoneksi() {
		crudHelper.close();
		crudHelper = null;
		crudDatabase = null;
	}
	public long insertWisataAlam(ContentValues values) {
		return crudDatabase.insert(NAMA_TABEL, null, values);
	}
	
	public long insertWisataBudaya(ContentValues values) {
		return crudDatabase.insert(NAMA_TABEL2, null, values);
	}
	
	public long insertWisataKuliner(ContentValues values) {
		return crudDatabase.insert(NAMA_TABEL3, null, values);
	}
	
	public boolean updateWisataAlam(long rowId, ContentValues values) {
		return crudDatabase.update(NAMA_TABEL, values,
				Database.FIELD_ID + "=" + rowId, null) > 0;
	}
	
	public boolean updateWisataBudaya(long rowId, ContentValues values) {
		return crudDatabase.update(NAMA_TABEL2, values,
				Database.FIELD_ID2 + "=" + rowId, null) > 0;
	}
	
	public boolean updateWisataKuliner(long rowId, ContentValues values) {
		return crudDatabase.update(NAMA_TABEL3, values,
				Database.FIELD_ID3 + "=" + rowId, null) > 0;
	}
	
	public boolean hapusWisataAlam(long rowId) {
		return crudDatabase.delete(NAMA_TABEL,
				Database.FIELD_ID + "=" + rowId, null) > 0;
	}
	
	public boolean hapusWisataBudaya(long rowId) {
		return crudDatabase.delete(NAMA_TABEL2,
				Database.FIELD_ID2 + "=" + rowId, null) > 0;
	}
	
	public boolean hapusWisataKuliner(long rowId) {
		return crudDatabase.delete(NAMA_TABEL3,
				Database.FIELD_ID3 + "=" + rowId, null) > 0;
	}
	
	public Cursor bacaWisataAlam() {
		return crudDatabase.query(NAMA_TABEL,FIELD_TABEL,null, null, null, null,Database.FIELD_JUDUL + " ASC");
		
	}
	
	public Cursor bacaWisataBudaya() {
		return crudDatabase.query(NAMA_TABEL2,FIELD_TABEL2,null, null, null, null,Database.FIELD_JUDUL2 + " ASC");
		
	}
	
	public Cursor bacaWisataKuliner() {
		return crudDatabase.query(NAMA_TABEL3,FIELD_TABEL3,null, null, null, null,Database.FIELD_JUDUL3 + " ASC");
		
	}
	
	public Cursor bacaDataTerseleksi(long rowId) throws SQLException {
		Cursor cursor = crudDatabase.query(true, NAMA_TABEL,FIELD_TABEL,FIELD_ID + "=" + rowId,null, null, null, null, null);
		cursor.moveToFirst();
		return cursor;
	}
	
	public Cursor bacaDataTerseleksiterapi(long rowId) throws SQLException {
		Cursor cursor = crudDatabase.query(true, NAMA_TABEL2,FIELD_TABEL2,FIELD_ID2 + "=" + rowId,null, null, null, null, null);
		cursor.moveToFirst();
		return cursor;
	}

	public Cursor bacaDataTerseleksirawat(long rowId) throws SQLException {
		Cursor cursor = crudDatabase.query(true, NAMA_TABEL3,FIELD_TABEL3,FIELD_ID3 + "=" + rowId,null, null, null, null, null);
		cursor.moveToFirst();
		return cursor;
		
	}
		
	public ContentValues ambilWisataAlam(String tempat, String lat) {
		ContentValues values = new ContentValues();
		values.put(Database.FIELD_JUDUL, tempat);
		values.put(Database.FIELD_DESKRIPSI, lat);
		values.put(Database.FIELD_GAMBAR, R.drawable.kpser);
		
		return values;
		
		}
	
	public ContentValues ambilWisataBudaya(String tempat, String lat) {
		ContentValues values = new ContentValues();
		values.put(Database.FIELD_JUDUL2, tempat);
		values.put(Database.FIELD_DESKRIPSI2, lat);
		values.put(Database.FIELD_GAMBAR2, R.drawable.sukerto);
		
		return values;
		
		}
	
	public ContentValues ambilWisataKuliner(String tempat, String lat) {
		ContentValues values = new ContentValues();
		values.put(Database.FIELD_JUDUL3, tempat);
		values.put(Database.FIELD_DESKRIPSI3, lat);
		values.put(Database.FIELD_GAMBAR3, R.drawable.gudeg);
		
		return values;
		
	}
		    
		   
			
	
}
