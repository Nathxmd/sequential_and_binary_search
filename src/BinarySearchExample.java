public class BinarySearchExample {
    // Metode binary search 
    public static int binarySearch(int[] arr, int target) {
        int kiri = 0;
        int kanan = arr.length - 1;

        while (kiri <= kanan) {
            // Hitung indeks tengah
            int tengah = kiri + (kanan - kiri) / 2;

            // Cek apakah target berada di tengah
            if (arr[tengah] == target) {
                return tengah;
            }

            // Jika target lebih besar, cari di sebelah kanan
            if (arr[tengah] < target) {
                kiri = tengah + 1;
            } 
            // Jika target lebih kecil, cari di sebelah kiri
            else {
                kanan = tengah - 1;
            }
        }

        // Jika target tidak ditemukan
        return -1;
    }

    public static void main(String[] args) {
        // Buat array terurut (syarat binary search)
        int[] data = {12, 23, 45, 67, 89};
        
        // Tentukan angka yang akan dicari (n)
        int target = 45;

        // Panggil metode binary search
        int hasilPencarian = binarySearch(data, target);

        // Tampilkan hasil pencarian
        if (hasilPencarian != -1) {
            System.out.println("Angka " + target + " ditemukan pada indeks ke-" + hasilPencarian);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array");
        }
    }
}